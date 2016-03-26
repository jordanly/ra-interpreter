package ra.grammar;

import org.antlr.v4.runtime.tree.ParseTree;
import ra.Query;
import ra.exceptions.RAException;
import ra.grammar.error.RAErrorParser;
import ra.RA;
import ra.grammar.gen.*;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RAEvalVisitor extends RAGrammarBaseVisitor<String> {
    private int tempCount;
    private RA ra;
    private RAErrorParser errorParser;
    private Query query;
    private Map<String, String> variableMap;

    public RAEvalVisitor(RA ra, Query query) {
        this.ra = ra;
        this.query = query;

        this.tempCount = 0;
        this.errorParser = new RAErrorParser(ra);
        this.variableMap = new HashMap<>();
    }

    @Override
    public String visit(ParseTree tree) {
        if (!query.isValid()) {
            return "";
        }

        return super.visit(tree);
    }

    @Override
    public String visitAssignmentExpression(RAGrammarParser.AssignmentExpressionContext ctx) {
        String variable = ctx.getChild(1).getText();
        String command = visit(ctx.getChild(3));

        variableMap.put(variable, command);

        return null;
    }

    @Override
    public String visitAttributeList(RAGrammarParser.AttributeListContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitBinaryExpression(RAGrammarParser.BinaryExpressionContext ctx) {
        // generate first child
        String current = visit(ctx.getChild(0));

        // get operation and second child, repeat
        for (int i = 1; i < ctx.getChildCount(); i += 2) {
            String operation = visit(ctx.getChild(i)); // i will always be operation
            current = String.format(operation,
                    current, generateAlias(),
                    visit(ctx.getChild(i + 1)), generateAlias()
            );
        }

        return current;
    }

    @Override
    public String visitBinaryOperator(RAGrammarParser.BinaryOperatorContext ctx) {
        if (ctx.getChildCount() > 1) { // join with condition
            return "( %s ) %s JOIN ( %s ) %s ON (" + visit(ctx.getChild(1)) + ")";
        } else { // all other binary operators
            switch (ctx.getChild(0).getText()) {
                case "\\join":
                    return "( %s ) %s NATURAL JOIN ( %s ) %s";
                case "\\cross":
                    return "( %s ) %s CROSS JOIN ( %s ) %s";
                case "\\union":
                    return "SELECT * FROM ( %s ) %s UNION SELECT * FROM ( %s ) %s";
                case "\\diff":
                    return "SELECT * FROM ( %s ) %s EXCEPT SELECT * FROM ( %s ) %s";
                case "\\intersect":
                    return "SELECT * FROM ( %s ) %s INTERSECT SELECT * FROM ( %s ) %s";
            }
        }

        return null; // error TODO replace with something
    }

    @Override
    public String visitBooleanCondition(RAGrammarParser.BooleanConditionContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(visit(ctx.getChild(0)));

        for (int i = 1; i < ctx.getChildCount(); i++) {
            sb.append(" " + visit(ctx.getChild(i)) + " ");
        }

        return sb.toString();
    }

    @Override
    public String visitBooleanOperator(RAGrammarParser.BooleanOperatorContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitComparisonOperator(RAGrammarParser.ComparisonOperatorContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitCondition(RAGrammarParser.ConditionContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public String visitEqualityOperator(RAGrammarParser.EqualityOperatorContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitJoinCondition(RAGrammarParser.JoinConditionContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitNotCondition(RAGrammarParser.NotConditionContext ctx) {
        if (ctx.getChildCount() > 1) { // there is a not
            return " NOT " + visit(ctx.getChild(1));
        } else {
            return visit(ctx.getChild(0));
        }
    }

    @Override
    public String visitOperatorOption(RAGrammarParser.OperatorOptionContext ctx) {
        return visit(ctx.getChild(1)); // child 1 is the option
    }

    @Override
    public String visitProgram(RAGrammarParser.ProgramContext ctx) {
        tempCount = 0;

        // will only return the last query
        // TODO return multiple queries, then display in frontend somehow
        String sqlQuery = null;
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (!ctx.getChild(i).getClass().equals(RAGrammarParser.StatementContext.class)) {
                continue;
            }

            RAGrammarParser.StatementContext statement = (RAGrammarParser.StatementContext) ctx.getChild(i);
            if (statement.getChild(0).getClass().equals(RAGrammarParser.AssignmentExpressionContext.class)) {
                visit(ctx.getChild(i));
            } else if (statement.getChild(0).getClass().equals(RAGrammarParser.BinaryExpressionContext.class)) {
                sqlQuery = visit(ctx.getChild(i));
            }
        }

        return String.format(" SELECT * FROM ( %s ) %s ",
                sqlQuery, generateAlias());
    }

    @Override
    public String visitSelectCondition(RAGrammarParser.SelectConditionContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitStatement(RAGrammarParser.StatementContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public String visitUnaryExpression(RAGrammarParser.UnaryExpressionContext ctx) {
        String command = null;

        if (ctx.getChildCount() == 1) { // only unit expression
            command = String.format(" ( SELECT * FROM %s %s ) ",
                    visit(ctx.getChild(0)), generateAlias());
        } else { // unary expression
            command = String.format(visit(ctx.getChild(0)),
                    visit(ctx.getChild(1)), generateAlias());
        }

        return errorParser.validate(query, command, ctx) ? command : "ERROR";
    }

    @Override
    public String visitUnaryOperator(RAGrammarParser.UnaryOperatorContext ctx) {
        switch (ctx.getChild(0).getText()) {
            case "\\select":
                 return "SELECT * FROM ( %s ) %s WHERE "
                        + visit(ctx.getChild(1))
                        + " ";
            case "\\project":
                 return "SELECT DISTINCT "
                        + visit(ctx.getChild(1))
                        + " FROM ( %s ) %s ";
            case "\\rename":
                // Get the columns that we will be renaming from the subquery
                // TODO had to get creative with getting parent's second expressiong for renaming, find new way to do this?
                String subQuery = String.format("SELECT * FROM ( %s ) %s ;",
                        visit(ctx.getParent().getChild(1)), // get table to be renamed
                        generateAlias()
                );
                ResultSetMetaData rsmd;
                String[] columnNames;
                try {
                    rsmd = ra.evaluateSQLQuery(subQuery).getMetaData();
                    columnNames = new String[rsmd.getColumnCount()];
                    for (int i = 0; i < columnNames.length; i++) {
                        columnNames[i] = rsmd.getColumnName(i + 1);
                    }
                } catch (SQLException e) {
                    query.setException(new RAException(
                            ctx.getStart(),
                            ctx.getStop(),
                            "SQLException: Unable to rename attributes"
                    ));
                    break;
                }

                // Make sure number of attributes are same
                String[] newNames = visit(ctx.getChild(1)).split(",");
                if (newNames.length != columnNames.length) {
                    query.setException(new RAException(
                            ctx.getStart(),
                            ctx.getStop(),
                            "RAException: Number of rename columns does not match actual -- "
                                    + "Input: " + Arrays.toString(newNames)
                                    + " vs "
                                    + "Actual: " + Arrays.toString(columnNames)
                    ));
                    break;
                }

                // Basic error checking done, generate final rename query
                StringBuilder output = new StringBuilder();
                output.append("SELECT ");
                for (int i = 0; i < newNames.length; i++) {
                    output.append(columnNames[i] + " AS " + newNames[i] + ",");
                }
                output.deleteCharAt(output.length() - 1); // Delete last ','
                output.append(
                        " FROM ( %s ) %s"
                );

                return output.toString();
        }

        return null; // error
    }

    @Override
    public String visitUnitExpression(RAGrammarParser.UnitExpressionContext ctx) {
        String command = null;

        if (ctx.getChildCount() == 1) { // Only table/variable name
            if (variableMap.containsKey(ctx.getText())) { // If it is a variable
                command = String.format(" ( SELECT * FROM ( %s ) %s ) ",
                        variableMap.get(ctx.getText()), generateAlias());
            } else {
                command = String.format(" ( SELECT * FROM %s ) ",
                        ctx.getText(), generateAlias());
            }
        } else { // Paren expression
            command = String.format("( %s )", visit(ctx.getChild(1)));
        }

        return errorParser.validate(query, command, ctx) ? command : "ERROR";
    }

    @Override
    public String visitValue(RAGrammarParser.ValueContext ctx) {
        return ctx.getText();
    }

    /**
     * This visitor only generates statements that are designed for a
     * PostgreSQL database. One detail to keep in mind is that when having nested
     * subqueries (which is how the query is built), you must give an alias after
     * a 'FROM x'.
     *
     * The method generateAlias() returns a temporary, unique string for use
     * after a 'FROM x' statement.
     */
    private String generateAlias() {
        return "t" + tempCount++;
    }
}
