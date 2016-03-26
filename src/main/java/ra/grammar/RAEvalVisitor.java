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

/**
 * RAEvalVisitor contains methods that processes nodes in the AST created by
 * the grammar in 'RAGrammar.g4' (which represents an RA query) and converts
 * them to their corresponding SQL statement. This class will build the query
 * bottom-up.
 *
 * The main call to parse a query will be the method 'visitExp0' as exp0 will
 * always be the root of the RA query (as dictated by the grammar).
 *
 * RAEvalVisitor will attempt to validate each node by sending the command
 * generated to RAErrorParser (which executes each query and contains methods
 * for dealing with different types of exceptions. Right now, RAEvalVisitor will
 * only try to validate unit, unary, binary, and join nodes as they are the only
 * ones that currently generate non-trivial statements.
 */
public class RAEvalVisitor extends RAGrammarBaseVisitor<String> {
    private int tempCount;
    private RA ra;
    private RAErrorParser errorParser;
    private Query query;

    public RAEvalVisitor(RA ra, Query query) {
        this.ra = ra;
        this.query = query;

        this.tempCount = 0;
        this.errorParser = new RAErrorParser(ra);
    }

    @Override
    public String visit(ParseTree tree) {
        if (!query.isValid()) {
            return "";
        }

        return super.visit(tree);
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

        return String.format(" SELECT * FROM ( %s ) %s ",
                visit(ctx.getChild(0)), generateAlias());
    }

    @Override
    public String visitSelectCondition(RAGrammarParser.SelectConditionContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitUnaryExpression(RAGrammarParser.UnaryExpressionContext ctx) {
        if (ctx.getChildCount() == 1) { // only unit expression
            return String.format(" ( SELECT * FROM %s %s ) ",
                    visit(ctx.getChild(0)), generateAlias());
        } else { // unary expression
            return String.format(visit(ctx.getChild(0)),
                    visit(ctx.getChild(1)), generateAlias());
        }
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

        return null; // TODO error?
    }

    @Override
    public String visitUnitExpression(RAGrammarParser.UnitExpressionContext ctx) {
        if (ctx.getChildCount() == 1) { // only table name
            return ctx.getText();
        } else { // paren expression
            return String.format("( %s )", visit(ctx.getChild(1)));
        }
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
