// Generated from /Users/jordanly/Documents/workspace/ra-interpreter/src/main/java/ra/grammar/RAGrammar.g4 by ANTLR 4.5.1
package ra.grammar.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RAGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RAGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RAGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(RAGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link RAGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(RAGrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RAGrammarParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(RAGrammarParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RAGrammarParser#unitExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitExpression(RAGrammarParser.UnitExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RAGrammarParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(RAGrammarParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RAGrammarParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(RAGrammarParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RAGrammarParser#binaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOperator(RAGrammarParser.BinaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RAGrammarParser#binaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpression(RAGrammarParser.BinaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RAGrammarParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(RAGrammarParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RAGrammarParser#equalityOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityOperator(RAGrammarParser.EqualityOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RAGrammarParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(RAGrammarParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link RAGrammarParser#selectCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectCondition(RAGrammarParser.SelectConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RAGrammarParser#joinCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinCondition(RAGrammarParser.JoinConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RAGrammarParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(RAGrammarParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RAGrammarParser#notCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotCondition(RAGrammarParser.NotConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RAGrammarParser#booleanOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanOperator(RAGrammarParser.BooleanOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RAGrammarParser#booleanCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanCondition(RAGrammarParser.BooleanConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RAGrammarParser#attributeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeList(RAGrammarParser.AttributeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link RAGrammarParser#operatorOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorOption(RAGrammarParser.OperatorOptionContext ctx);
}