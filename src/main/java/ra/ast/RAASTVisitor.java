package ra.ast;

import org.antlr.v4.runtime.tree.ParseTree;
import ra.grammar.gen.RAGrammarBaseVisitor;
import ra.grammar.gen.RAGrammarParser;

/**
 * Created by jordanly on 4/15/16.
 */
public class RAASTVisitor extends RAGrammarBaseVisitor<RAASTNode> {
    @Override
    public RAASTNode visitAssignmentExpression(RAGrammarParser.AssignmentExpressionContext ctx) {
        return null; // Should not ever be called
    }

    @Override
    public RAASTNode visitAttributeList(RAGrammarParser.AttributeListContext ctx) {
        return super.visitAttributeList(ctx);
    }

    @Override
    public RAASTNode visitBinaryExpression(RAGrammarParser.BinaryExpressionContext ctx) {
        if (ctx.getChildCount() == 1) {
            return visit(ctx.getChild(0));
        }

        RAASTNode left = visit(ctx.getChild(0));
        for (int i = 1; i < ctx.getChildCount(); i += 2) {
            RAASTNode operation = visit(ctx.getChild(i));
            RAASTNode right = visit(ctx.getChild(i + 1));

            operation.addChild(left);
            operation.addChild(right);

            left = operation;
        }

        return left;
    }

    @Override
    public RAASTNode visitBinaryOperator(RAGrammarParser.BinaryOperatorContext ctx) {
        if (ctx.getChildCount() == 1) { // single operation
            return new RAASTNode(ctx.getChild(0).getText(), "");
        } else { // join operation with condition
            return new RAASTNode(
                    ctx.getChild(0).getText(),
                    extractOperatorOption(ctx.getChild(1).getText())
            );
        }
    }

    @Override
    public RAASTNode visitBooleanCondition(RAGrammarParser.BooleanConditionContext ctx) {
        return super.visitBooleanCondition(ctx);
    }

    @Override
    public RAASTNode visitBooleanOperator(RAGrammarParser.BooleanOperatorContext ctx) {
        return super.visitBooleanOperator(ctx);
    }

    @Override
    public RAASTNode visitComparisonOperator(RAGrammarParser.ComparisonOperatorContext ctx) {
        return super.visitComparisonOperator(ctx);
    }

    @Override
    public RAASTNode visitCondition(RAGrammarParser.ConditionContext ctx) {
        return super.visitCondition(ctx);
    }

    @Override
    public RAASTNode visitEqualityOperator(RAGrammarParser.EqualityOperatorContext ctx) {
        return super.visitEqualityOperator(ctx);
    }

    @Override
    public RAASTNode visitJoinCondition(RAGrammarParser.JoinConditionContext ctx) {
        return super.visitJoinCondition(ctx);
    }

    @Override
    public RAASTNode visitNotCondition(RAGrammarParser.NotConditionContext ctx) {
        return super.visitNotCondition(ctx);
    }

    @Override
    public RAASTNode visitOperatorOption(RAGrammarParser.OperatorOptionContext ctx) {
        return super.visitOperatorOption(ctx);
    }

    @Override
    public RAASTNode visitProgram(RAGrammarParser.ProgramContext ctx) {
        // return tree of last query
        ParseTree lastQuery = null;
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (!ctx.getChild(i).getClass().equals(RAGrammarParser.StatementContext.class)) {
                continue;
            }

            RAGrammarParser.StatementContext statement = (RAGrammarParser.StatementContext) ctx.getChild(i);
            if (statement.getChild(0).getClass().equals(RAGrammarParser.AssignmentExpressionContext.class)) {
                // do nothing
            } else if (statement.getChild(0).getClass().equals(RAGrammarParser.BinaryExpressionContext.class)) {
                lastQuery = ctx.getChild(i);
            }
        }

        if (lastQuery == null) {
            return new RAASTNode("", ""); // TODO change?
        }

        return visit(lastQuery);
    }

    @Override
    public RAASTNode visitSelectCondition(RAGrammarParser.SelectConditionContext ctx) {
        return super.visitSelectCondition(ctx);
    }

    @Override
    public RAASTNode visitStatement(RAGrammarParser.StatementContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public RAASTNode visitUnaryExpression(RAGrammarParser.UnaryExpressionContext ctx) {
        RAASTNode operation = visit(ctx.getChild(0));
        if (ctx.getChildCount() > 1) {
            operation.addChild(visit(ctx.getChild(1)));
        }

        return operation;
    }

    @Override
    public RAASTNode visitUnaryOperator(RAGrammarParser.UnaryOperatorContext ctx) {
        return new RAASTNode(
                ctx.getChild(0).getText(),
                extractOperatorOption(ctx.getChild(1).getText())
        );
    }

    @Override
    public RAASTNode visitUnitExpression(RAGrammarParser.UnitExpressionContext ctx) {
        if (ctx.getChildCount() == 1) { // only one child is a table
            return new RAASTNode(ctx.getText(), "");
        } else { // > 1 child is paren expression (for current grammar)
            return visit(ctx.getChild(1));
        }
    }

    @Override
    public RAASTNode visitValue(RAGrammarParser.ValueContext ctx) {
        return super.visitValue(ctx);
    }

    private String extractOperatorOption(String val) {
        return val.substring(2, val.length() - 1); // remove "_{" + "}"
    }
}
