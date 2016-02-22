// Generated from /Users/jordanly/Documents/workspace/ra-interpreter/src/main/java/ra/grammar/RAGrammar.g4 by ANTLR 4.5.1
package ra.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RAGrammarParser}.
 */
public interface RAGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RAGrammarParser#exp0}.
	 * @param ctx the parse tree
	 */
	void enterExp0(RAGrammarParser.Exp0Context ctx);
	/**
	 * Exit a parse tree produced by {@link RAGrammarParser#exp0}.
	 * @param ctx the parse tree
	 */
	void exitExp0(RAGrammarParser.Exp0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code tableExp}
	 * labeled alternative in {@link RAGrammarParser#exp_unit}.
	 * @param ctx the parse tree
	 */
	void enterTableExp(RAGrammarParser.TableExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableExp}
	 * labeled alternative in {@link RAGrammarParser#exp_unit}.
	 * @param ctx the parse tree
	 */
	void exitTableExp(RAGrammarParser.TableExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExp}
	 * labeled alternative in {@link RAGrammarParser#exp_unit}.
	 * @param ctx the parse tree
	 */
	void enterParenExp(RAGrammarParser.ParenExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExp}
	 * labeled alternative in {@link RAGrammarParser#exp_unit}.
	 * @param ctx the parse tree
	 */
	void exitParenExp(RAGrammarParser.ParenExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unitExp}
	 * labeled alternative in {@link RAGrammarParser#exp_unary}.
	 * @param ctx the parse tree
	 */
	void enterUnitExp(RAGrammarParser.UnitExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unitExp}
	 * labeled alternative in {@link RAGrammarParser#exp_unary}.
	 * @param ctx the parse tree
	 */
	void exitUnitExp(RAGrammarParser.UnitExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExp}
	 * labeled alternative in {@link RAGrammarParser#exp_unary}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExp(RAGrammarParser.UnaryExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExp}
	 * labeled alternative in {@link RAGrammarParser#exp_unary}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExp(RAGrammarParser.UnaryExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleUnaryExp}
	 * labeled alternative in {@link RAGrammarParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterSingleUnaryExp(RAGrammarParser.SingleUnaryExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleUnaryExp}
	 * labeled alternative in {@link RAGrammarParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitSingleUnaryExp(RAGrammarParser.SingleUnaryExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code joinExp}
	 * labeled alternative in {@link RAGrammarParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterJoinExp(RAGrammarParser.JoinExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code joinExp}
	 * labeled alternative in {@link RAGrammarParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitJoinExp(RAGrammarParser.JoinExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryExp}
	 * labeled alternative in {@link RAGrammarParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExp(RAGrammarParser.BinaryExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryExp}
	 * labeled alternative in {@link RAGrammarParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExp(RAGrammarParser.BinaryExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleTermExp}
	 * labeled alternative in {@link RAGrammarParser#exp1}.
	 * @param ctx the parse tree
	 */
	void enterSingleTermExp(RAGrammarParser.SingleTermExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleTermExp}
	 * labeled alternative in {@link RAGrammarParser#exp1}.
	 * @param ctx the parse tree
	 */
	void exitSingleTermExp(RAGrammarParser.SingleTermExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code joinTermExp}
	 * labeled alternative in {@link RAGrammarParser#exp1}.
	 * @param ctx the parse tree
	 */
	void enterJoinTermExp(RAGrammarParser.JoinTermExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code joinTermExp}
	 * labeled alternative in {@link RAGrammarParser#exp1}.
	 * @param ctx the parse tree
	 */
	void exitJoinTermExp(RAGrammarParser.JoinTermExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryTermExp}
	 * labeled alternative in {@link RAGrammarParser#exp1}.
	 * @param ctx the parse tree
	 */
	void enterBinaryTermExp(RAGrammarParser.BinaryTermExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryTermExp}
	 * labeled alternative in {@link RAGrammarParser#exp1}.
	 * @param ctx the parse tree
	 */
	void exitBinaryTermExp(RAGrammarParser.BinaryTermExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link RAGrammarParser#comp_atom}.
	 * @param ctx the parse tree
	 */
	void enterComp_atom(RAGrammarParser.Comp_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link RAGrammarParser#comp_atom}.
	 * @param ctx the parse tree
	 */
	void exitComp_atom(RAGrammarParser.Comp_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link RAGrammarParser#eq_atom}.
	 * @param ctx the parse tree
	 */
	void enterEq_atom(RAGrammarParser.Eq_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link RAGrammarParser#eq_atom}.
	 * @param ctx the parse tree
	 */
	void exitEq_atom(RAGrammarParser.Eq_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link RAGrammarParser#select_cond}.
	 * @param ctx the parse tree
	 */
	void enterSelect_cond(RAGrammarParser.Select_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link RAGrammarParser#select_cond}.
	 * @param ctx the parse tree
	 */
	void exitSelect_cond(RAGrammarParser.Select_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link RAGrammarParser#s_cond0}.
	 * @param ctx the parse tree
	 */
	void enterS_cond0(RAGrammarParser.S_cond0Context ctx);
	/**
	 * Exit a parse tree produced by {@link RAGrammarParser#s_cond0}.
	 * @param ctx the parse tree
	 */
	void exitS_cond0(RAGrammarParser.S_cond0Context ctx);
	/**
	 * Enter a parse tree produced by {@link RAGrammarParser#s_cond1}.
	 * @param ctx the parse tree
	 */
	void enterS_cond1(RAGrammarParser.S_cond1Context ctx);
	/**
	 * Exit a parse tree produced by {@link RAGrammarParser#s_cond1}.
	 * @param ctx the parse tree
	 */
	void exitS_cond1(RAGrammarParser.S_cond1Context ctx);
	/**
	 * Enter a parse tree produced by {@link RAGrammarParser#s_cond2}.
	 * @param ctx the parse tree
	 */
	void enterS_cond2(RAGrammarParser.S_cond2Context ctx);
	/**
	 * Exit a parse tree produced by {@link RAGrammarParser#s_cond2}.
	 * @param ctx the parse tree
	 */
	void exitS_cond2(RAGrammarParser.S_cond2Context ctx);
	/**
	 * Enter a parse tree produced by {@link RAGrammarParser#proj_cond}.
	 * @param ctx the parse tree
	 */
	void enterProj_cond(RAGrammarParser.Proj_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link RAGrammarParser#proj_cond}.
	 * @param ctx the parse tree
	 */
	void exitProj_cond(RAGrammarParser.Proj_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link RAGrammarParser#p_cond0}.
	 * @param ctx the parse tree
	 */
	void enterP_cond0(RAGrammarParser.P_cond0Context ctx);
	/**
	 * Exit a parse tree produced by {@link RAGrammarParser#p_cond0}.
	 * @param ctx the parse tree
	 */
	void exitP_cond0(RAGrammarParser.P_cond0Context ctx);
	/**
	 * Enter a parse tree produced by {@link RAGrammarParser#p_cond1}.
	 * @param ctx the parse tree
	 */
	void enterP_cond1(RAGrammarParser.P_cond1Context ctx);
	/**
	 * Exit a parse tree produced by {@link RAGrammarParser#p_cond1}.
	 * @param ctx the parse tree
	 */
	void exitP_cond1(RAGrammarParser.P_cond1Context ctx);
	/**
	 * Enter a parse tree produced by {@link RAGrammarParser#join_cond}.
	 * @param ctx the parse tree
	 */
	void enterJoin_cond(RAGrammarParser.Join_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link RAGrammarParser#join_cond}.
	 * @param ctx the parse tree
	 */
	void exitJoin_cond(RAGrammarParser.Join_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link RAGrammarParser#j_cond0}.
	 * @param ctx the parse tree
	 */
	void enterJ_cond0(RAGrammarParser.J_cond0Context ctx);
	/**
	 * Exit a parse tree produced by {@link RAGrammarParser#j_cond0}.
	 * @param ctx the parse tree
	 */
	void exitJ_cond0(RAGrammarParser.J_cond0Context ctx);
	/**
	 * Enter a parse tree produced by {@link RAGrammarParser#j_cond1}.
	 * @param ctx the parse tree
	 */
	void enterJ_cond1(RAGrammarParser.J_cond1Context ctx);
	/**
	 * Exit a parse tree produced by {@link RAGrammarParser#j_cond1}.
	 * @param ctx the parse tree
	 */
	void exitJ_cond1(RAGrammarParser.J_cond1Context ctx);
	/**
	 * Enter a parse tree produced by {@link RAGrammarParser#j_cond2}.
	 * @param ctx the parse tree
	 */
	void enterJ_cond2(RAGrammarParser.J_cond2Context ctx);
	/**
	 * Exit a parse tree produced by {@link RAGrammarParser#j_cond2}.
	 * @param ctx the parse tree
	 */
	void exitJ_cond2(RAGrammarParser.J_cond2Context ctx);
}