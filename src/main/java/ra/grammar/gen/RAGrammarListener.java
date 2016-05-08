// Generated from /Users/jordanly/Documents/workspace/ra-interpreter/src/main/java/ra/grammar/RAGrammar.g4 by ANTLR 4.5.1
package ra.grammar.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RAGrammarParser}.
 */
public interface RAGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RAGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(RAGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RAGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(RAGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link RAGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(RAGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RAGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(RAGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RAGrammarParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(RAGrammarParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RAGrammarParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(RAGrammarParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RAGrammarParser#unitExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnitExpression(RAGrammarParser.UnitExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RAGrammarParser#unitExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnitExpression(RAGrammarParser.UnitExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RAGrammarParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(RAGrammarParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RAGrammarParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(RAGrammarParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RAGrammarParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(RAGrammarParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RAGrammarParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(RAGrammarParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RAGrammarParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperator(RAGrammarParser.BinaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RAGrammarParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperator(RAGrammarParser.BinaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RAGrammarParser#binaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpression(RAGrammarParser.BinaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RAGrammarParser#binaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpression(RAGrammarParser.BinaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RAGrammarParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(RAGrammarParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RAGrammarParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(RAGrammarParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RAGrammarParser#equalityOperator}.
	 * @param ctx the parse tree
	 */
	void enterEqualityOperator(RAGrammarParser.EqualityOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RAGrammarParser#equalityOperator}.
	 * @param ctx the parse tree
	 */
	void exitEqualityOperator(RAGrammarParser.EqualityOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RAGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(RAGrammarParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RAGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(RAGrammarParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link RAGrammarParser#selectCondition}.
	 * @param ctx the parse tree
	 */
	void enterSelectCondition(RAGrammarParser.SelectConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RAGrammarParser#selectCondition}.
	 * @param ctx the parse tree
	 */
	void exitSelectCondition(RAGrammarParser.SelectConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RAGrammarParser#joinCondition}.
	 * @param ctx the parse tree
	 */
	void enterJoinCondition(RAGrammarParser.JoinConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RAGrammarParser#joinCondition}.
	 * @param ctx the parse tree
	 */
	void exitJoinCondition(RAGrammarParser.JoinConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RAGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(RAGrammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RAGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(RAGrammarParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RAGrammarParser#notCondition}.
	 * @param ctx the parse tree
	 */
	void enterNotCondition(RAGrammarParser.NotConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RAGrammarParser#notCondition}.
	 * @param ctx the parse tree
	 */
	void exitNotCondition(RAGrammarParser.NotConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RAGrammarParser#booleanOperator}.
	 * @param ctx the parse tree
	 */
	void enterBooleanOperator(RAGrammarParser.BooleanOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RAGrammarParser#booleanOperator}.
	 * @param ctx the parse tree
	 */
	void exitBooleanOperator(RAGrammarParser.BooleanOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RAGrammarParser#booleanCondition}.
	 * @param ctx the parse tree
	 */
	void enterBooleanCondition(RAGrammarParser.BooleanConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RAGrammarParser#booleanCondition}.
	 * @param ctx the parse tree
	 */
	void exitBooleanCondition(RAGrammarParser.BooleanConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RAGrammarParser#attributeList}.
	 * @param ctx the parse tree
	 */
	void enterAttributeList(RAGrammarParser.AttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RAGrammarParser#attributeList}.
	 * @param ctx the parse tree
	 */
	void exitAttributeList(RAGrammarParser.AttributeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RAGrammarParser#operatorOption}.
	 * @param ctx the parse tree
	 */
	void enterOperatorOption(RAGrammarParser.OperatorOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RAGrammarParser#operatorOption}.
	 * @param ctx the parse tree
	 */
	void exitOperatorOption(RAGrammarParser.OperatorOptionContext ctx);
}