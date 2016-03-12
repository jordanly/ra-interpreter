// Generated from /Users/jordanly/Documents/workspace/ra-interpreter/src/main/java/ra/grammar/RAGrammar.g4 by ANTLR 4.5.1
package ra.grammar.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RAGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, OR=2, NOT=3, LIKE=4, SELECT=5, PROJECT=6, JOIN=7, CROSS=8, UNION=9, 
		DIFF=10, INTERSECT=11, RENAME=12, LEFT_PAREN=13, RIGHT_PAREN=14, LEFT_BRACE=15, 
		RIGHT_BRACE=16, EQUALS=17, LT=18, LTE=19, GT=20, GTE=21, NOT_EQUALS=22, 
		COMMA=23, STATEMENT_TERMINATOR=24, INT=25, FLOAT=26, STRING_LITERAL=27, 
		NAME=28, WHITESPACE=29, COMMENT=30, SINGLELINE_COMMENT=31;
	public static final int
		RULE_exp0 = 0, RULE_exp_unit = 1, RULE_exp_unary = 2, RULE_exp = 3, RULE_exp1 = 4, 
		RULE_comp_atom = 5, RULE_eq_atom = 6, RULE_value = 7, RULE_select_cond = 8, 
		RULE_s_cond0 = 9, RULE_s_cond1 = 10, RULE_s_cond2 = 11, RULE_proj_cond = 12, 
		RULE_p_cond0 = 13, RULE_p_cond1 = 14, RULE_join_cond = 15, RULE_j_cond0 = 16, 
		RULE_j_cond1 = 17, RULE_j_cond2 = 18;
	public static final String[] ruleNames = {
		"exp0", "exp_unit", "exp_unary", "exp", "exp1", "comp_atom", "eq_atom", 
		"value", "select_cond", "s_cond0", "s_cond1", "s_cond2", "proj_cond", 
		"p_cond0", "p_cond1", "join_cond", "j_cond0", "j_cond1", "j_cond2"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'and'", "'or'", "'not'", "'like'", "'\\select'", "'\\project'", 
		"'\\join'", "'\\cross'", "'\\union'", "'\\diff'", "'\\intersect'", "'\\rename'", 
		"'('", "')'", "'_{'", "'}'", "'='", "'<'", "'<='", "'>'", "'>='", "'<>'", 
		"','", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AND", "OR", "NOT", "LIKE", "SELECT", "PROJECT", "JOIN", "CROSS", 
		"UNION", "DIFF", "INTERSECT", "RENAME", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACE", 
		"RIGHT_BRACE", "EQUALS", "LT", "LTE", "GT", "GTE", "NOT_EQUALS", "COMMA", 
		"STATEMENT_TERMINATOR", "INT", "FLOAT", "STRING_LITERAL", "NAME", "WHITESPACE", 
		"COMMENT", "SINGLELINE_COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "RAGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RAGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Exp0Context extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode STATEMENT_TERMINATOR() { return getToken(RAGrammarParser.STATEMENT_TERMINATOR, 0); }
		public TerminalNode EOF() { return getToken(RAGrammarParser.EOF, 0); }
		public Exp0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).enterExp0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).exitExp0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RAGrammarVisitor ) return ((RAGrammarVisitor<? extends T>)visitor).visitExp0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp0Context exp0() throws RecognitionException {
		Exp0Context _localctx = new Exp0Context(_ctx, getState());
		enterRule(_localctx, 0, RULE_exp0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			exp();
			setState(39);
			match(STATEMENT_TERMINATOR);
			setState(40);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_unitContext extends ParserRuleContext {
		public Exp_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_unit; }
	 
		public Exp_unitContext() { }
		public void copyFrom(Exp_unitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParenExpContext extends Exp_unitContext {
		public TerminalNode LEFT_PAREN() { return getToken(RAGrammarParser.LEFT_PAREN, 0); }
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(RAGrammarParser.RIGHT_PAREN, 0); }
		public ParenExpContext(Exp_unitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).enterParenExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).exitParenExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RAGrammarVisitor ) return ((RAGrammarVisitor<? extends T>)visitor).visitParenExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableExpContext extends Exp_unitContext {
		public TerminalNode NAME() { return getToken(RAGrammarParser.NAME, 0); }
		public TableExpContext(Exp_unitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).enterTableExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).exitTableExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RAGrammarVisitor ) return ((RAGrammarVisitor<? extends T>)visitor).visitTableExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_unitContext exp_unit() throws RecognitionException {
		Exp_unitContext _localctx = new Exp_unitContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_exp_unit);
		try {
			setState(47);
			switch (_input.LA(1)) {
			case NAME:
				_localctx = new TableExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(NAME);
				}
				break;
			case LEFT_PAREN:
				_localctx = new ParenExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(LEFT_PAREN);
				setState(44);
				exp1();
				setState(45);
				match(RIGHT_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_unaryContext extends ParserRuleContext {
		public Exp_unaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_unary; }
	 
		public Exp_unaryContext() { }
		public void copyFrom(Exp_unaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnitExpContext extends Exp_unaryContext {
		public Exp_unitContext exp_unit() {
			return getRuleContext(Exp_unitContext.class,0);
		}
		public UnitExpContext(Exp_unaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).enterUnitExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).exitUnitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RAGrammarVisitor ) return ((RAGrammarVisitor<? extends T>)visitor).visitUnitExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExpContext extends Exp_unaryContext {
		public TerminalNode SELECT() { return getToken(RAGrammarParser.SELECT, 0); }
		public Select_condContext select_cond() {
			return getRuleContext(Select_condContext.class,0);
		}
		public Exp_unaryContext exp_unary() {
			return getRuleContext(Exp_unaryContext.class,0);
		}
		public TerminalNode PROJECT() { return getToken(RAGrammarParser.PROJECT, 0); }
		public Proj_condContext proj_cond() {
			return getRuleContext(Proj_condContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(RAGrammarParser.RENAME, 0); }
		public UnaryExpContext(Exp_unaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).enterUnaryExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).exitUnaryExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RAGrammarVisitor ) return ((RAGrammarVisitor<? extends T>)visitor).visitUnaryExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_unaryContext exp_unary() throws RecognitionException {
		Exp_unaryContext _localctx = new Exp_unaryContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_exp_unary);
		try {
			setState(62);
			switch (_input.LA(1)) {
			case LEFT_PAREN:
			case NAME:
				_localctx = new UnitExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				exp_unit();
				}
				break;
			case SELECT:
				_localctx = new UnaryExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				match(SELECT);
				setState(51);
				select_cond();
				setState(52);
				exp_unary();
				}
				break;
			case PROJECT:
				_localctx = new UnaryExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				match(PROJECT);
				setState(55);
				proj_cond();
				setState(56);
				exp_unary();
				}
				break;
			case RENAME:
				_localctx = new UnaryExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				match(RENAME);
				setState(59);
				proj_cond();
				setState(60);
				exp_unary();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleUnaryExpContext extends ExpContext {
		public Exp_unaryContext exp_unary() {
			return getRuleContext(Exp_unaryContext.class,0);
		}
		public SingleUnaryExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).enterSingleUnaryExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).exitSingleUnaryExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RAGrammarVisitor ) return ((RAGrammarVisitor<? extends T>)visitor).visitSingleUnaryExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryExpContext extends ExpContext {
		public List<Exp_unaryContext> exp_unary() {
			return getRuleContexts(Exp_unaryContext.class);
		}
		public Exp_unaryContext exp_unary(int i) {
			return getRuleContext(Exp_unaryContext.class,i);
		}
		public TerminalNode JOIN() { return getToken(RAGrammarParser.JOIN, 0); }
		public TerminalNode CROSS() { return getToken(RAGrammarParser.CROSS, 0); }
		public TerminalNode UNION() { return getToken(RAGrammarParser.UNION, 0); }
		public TerminalNode DIFF() { return getToken(RAGrammarParser.DIFF, 0); }
		public TerminalNode INTERSECT() { return getToken(RAGrammarParser.INTERSECT, 0); }
		public BinaryExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).enterBinaryExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).exitBinaryExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RAGrammarVisitor ) return ((RAGrammarVisitor<? extends T>)visitor).visitBinaryExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinExpContext extends ExpContext {
		public List<Exp_unaryContext> exp_unary() {
			return getRuleContexts(Exp_unaryContext.class);
		}
		public Exp_unaryContext exp_unary(int i) {
			return getRuleContext(Exp_unaryContext.class,i);
		}
		public TerminalNode JOIN() { return getToken(RAGrammarParser.JOIN, 0); }
		public Join_condContext join_cond() {
			return getRuleContext(Join_condContext.class,0);
		}
		public JoinExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).enterJoinExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).exitJoinExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RAGrammarVisitor ) return ((RAGrammarVisitor<? extends T>)visitor).visitJoinExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_exp);
		try {
			setState(90);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new SingleUnaryExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				exp_unary();
				}
				break;
			case 2:
				_localctx = new JoinExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				exp_unary();
				setState(66);
				match(JOIN);
				setState(67);
				join_cond();
				setState(68);
				exp_unary();
				}
				break;
			case 3:
				_localctx = new BinaryExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				exp_unary();
				setState(71);
				match(JOIN);
				setState(72);
				exp_unary();
				}
				break;
			case 4:
				_localctx = new BinaryExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
				exp_unary();
				setState(75);
				match(CROSS);
				setState(76);
				exp_unary();
				}
				break;
			case 5:
				_localctx = new BinaryExpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				exp_unary();
				setState(79);
				match(UNION);
				setState(80);
				exp_unary();
				}
				break;
			case 6:
				_localctx = new BinaryExpContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(82);
				exp_unary();
				setState(83);
				match(DIFF);
				setState(84);
				exp_unary();
				}
				break;
			case 7:
				_localctx = new BinaryExpContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(86);
				exp_unary();
				setState(87);
				match(INTERSECT);
				setState(88);
				exp_unary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp1Context extends ParserRuleContext {
		public Exp1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp1; }
	 
		public Exp1Context() { }
		public void copyFrom(Exp1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BinaryTermExpContext extends Exp1Context {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode JOIN() { return getToken(RAGrammarParser.JOIN, 0); }
		public Exp_unaryContext exp_unary() {
			return getRuleContext(Exp_unaryContext.class,0);
		}
		public TerminalNode CROSS() { return getToken(RAGrammarParser.CROSS, 0); }
		public TerminalNode UNION() { return getToken(RAGrammarParser.UNION, 0); }
		public TerminalNode DIFF() { return getToken(RAGrammarParser.DIFF, 0); }
		public TerminalNode INTERSECT() { return getToken(RAGrammarParser.INTERSECT, 0); }
		public BinaryTermExpContext(Exp1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).enterBinaryTermExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).exitBinaryTermExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RAGrammarVisitor ) return ((RAGrammarVisitor<? extends T>)visitor).visitBinaryTermExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinTermExpContext extends Exp1Context {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode JOIN() { return getToken(RAGrammarParser.JOIN, 0); }
		public Join_condContext join_cond() {
			return getRuleContext(Join_condContext.class,0);
		}
		public Exp_unaryContext exp_unary() {
			return getRuleContext(Exp_unaryContext.class,0);
		}
		public JoinTermExpContext(Exp1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).enterJoinTermExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).exitJoinTermExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RAGrammarVisitor ) return ((RAGrammarVisitor<? extends T>)visitor).visitJoinTermExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleTermExpContext extends Exp1Context {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public SingleTermExpContext(Exp1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).enterSingleTermExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).exitSingleTermExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RAGrammarVisitor ) return ((RAGrammarVisitor<? extends T>)visitor).visitSingleTermExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp1Context exp1() throws RecognitionException {
		Exp1Context _localctx = new Exp1Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_exp1);
		try {
			setState(118);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new SingleTermExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				exp();
				}
				break;
			case 2:
				_localctx = new JoinTermExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				exp();
				setState(94);
				match(JOIN);
				setState(95);
				join_cond();
				setState(96);
				exp_unary();
				}
				break;
			case 3:
				_localctx = new BinaryTermExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				exp();
				setState(99);
				match(JOIN);
				setState(100);
				exp_unary();
				}
				break;
			case 4:
				_localctx = new BinaryTermExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				exp();
				setState(103);
				match(CROSS);
				setState(104);
				exp_unary();
				}
				break;
			case 5:
				_localctx = new BinaryTermExpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(106);
				exp();
				setState(107);
				match(UNION);
				setState(108);
				exp_unary();
				}
				break;
			case 6:
				_localctx = new BinaryTermExpContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(110);
				exp();
				setState(111);
				match(DIFF);
				setState(112);
				exp_unary();
				}
				break;
			case 7:
				_localctx = new BinaryTermExpContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(114);
				exp();
				setState(115);
				match(INTERSECT);
				setState(116);
				exp_unary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comp_atomContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(RAGrammarParser.GT, 0); }
		public TerminalNode GTE() { return getToken(RAGrammarParser.GTE, 0); }
		public TerminalNode LT() { return getToken(RAGrammarParser.LT, 0); }
		public TerminalNode LTE() { return getToken(RAGrammarParser.LTE, 0); }
		public Comp_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).enterComp_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).exitComp_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RAGrammarVisitor ) return ((RAGrammarVisitor<? extends T>)visitor).visitComp_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_atomContext comp_atom() throws RecognitionException {
		Comp_atomContext _localctx = new Comp_atomContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comp_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LTE) | (1L << GT) | (1L << GTE))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Eq_atomContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(RAGrammarParser.EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(RAGrammarParser.NOT_EQUALS, 0); }
		public Eq_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).enterEq_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).exitEq_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RAGrammarVisitor ) return ((RAGrammarVisitor<? extends T>)visitor).visitEq_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Eq_atomContext eq_atom() throws RecognitionException {
		Eq_atomContext _localctx = new Eq_atomContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_eq_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_la = _input.LA(1);
			if ( !(_la==EQUALS || _la==NOT_EQUALS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(RAGrammarParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(RAGrammarParser.FLOAT, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RAGrammarVisitor ) return ((RAGrammarVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_condContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(RAGrammarParser.LEFT_BRACE, 0); }
		public S_cond2Context s_cond2() {
			return getRuleContext(S_cond2Context.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(RAGrammarParser.RIGHT_BRACE, 0); }
		public Select_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).enterSelect_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).exitSelect_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RAGrammarVisitor ) return ((RAGrammarVisitor<? extends T>)visitor).visitSelect_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_condContext select_cond() throws RecognitionException {
		Select_condContext _localctx = new Select_condContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_select_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(LEFT_BRACE);
			setState(127);
			s_cond2();
			setState(128);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class S_cond0Context extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(RAGrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(RAGrammarParser.NAME, i);
		}
		public Comp_atomContext comp_atom() {
			return getRuleContext(Comp_atomContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Eq_atomContext eq_atom() {
			return getRuleContext(Eq_atomContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(RAGrammarParser.STRING_LITERAL, 0); }
		public TerminalNode LIKE() { return getToken(RAGrammarParser.LIKE, 0); }
		public S_cond0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s_cond0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).enterS_cond0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).exitS_cond0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RAGrammarVisitor ) return ((RAGrammarVisitor<? extends T>)visitor).visitS_cond0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final S_cond0Context s_cond0() throws RecognitionException {
		S_cond0Context _localctx = new S_cond0Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_s_cond0);
		try {
			setState(149);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(NAME);
				setState(131);
				comp_atom();
				setState(132);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(NAME);
				setState(135);
				comp_atom();
				setState(136);
				match(NAME);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				match(NAME);
				setState(139);
				eq_atom();
				setState(140);
				match(NAME);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				match(NAME);
				setState(143);
				eq_atom();
				setState(144);
				match(STRING_LITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(146);
				match(NAME);
				setState(147);
				match(LIKE);
				setState(148);
				match(STRING_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class S_cond1Context extends ParserRuleContext {
		public S_cond0Context s_cond0() {
			return getRuleContext(S_cond0Context.class,0);
		}
		public TerminalNode NOT() { return getToken(RAGrammarParser.NOT, 0); }
		public S_cond1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s_cond1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).enterS_cond1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).exitS_cond1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RAGrammarVisitor ) return ((RAGrammarVisitor<? extends T>)visitor).visitS_cond1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final S_cond1Context s_cond1() throws RecognitionException {
		S_cond1Context _localctx = new S_cond1Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_s_cond1);
		try {
			setState(154);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				s_cond0();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(NOT);
				setState(153);
				s_cond0();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class S_cond2Context extends ParserRuleContext {
		public List<S_cond1Context> s_cond1() {
			return getRuleContexts(S_cond1Context.class);
		}
		public S_cond1Context s_cond1(int i) {
			return getRuleContext(S_cond1Context.class,i);
		}
		public TerminalNode AND() { return getToken(RAGrammarParser.AND, 0); }
		public TerminalNode OR() { return getToken(RAGrammarParser.OR, 0); }
		public S_cond2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s_cond2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).enterS_cond2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).exitS_cond2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RAGrammarVisitor ) return ((RAGrammarVisitor<? extends T>)visitor).visitS_cond2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final S_cond2Context s_cond2() throws RecognitionException {
		S_cond2Context _localctx = new S_cond2Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_s_cond2);
		try {
			setState(165);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				s_cond1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				s_cond1();
				setState(158);
				match(AND);
				setState(159);
				s_cond1();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				s_cond1();
				setState(162);
				match(OR);
				setState(163);
				s_cond1();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Proj_condContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(RAGrammarParser.LEFT_BRACE, 0); }
		public P_cond1Context p_cond1() {
			return getRuleContext(P_cond1Context.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(RAGrammarParser.RIGHT_BRACE, 0); }
		public Proj_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proj_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).enterProj_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).exitProj_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RAGrammarVisitor ) return ((RAGrammarVisitor<? extends T>)visitor).visitProj_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proj_condContext proj_cond() throws RecognitionException {
		Proj_condContext _localctx = new Proj_condContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_proj_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(LEFT_BRACE);
			setState(168);
			p_cond1(0);
			setState(169);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class P_cond0Context extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(RAGrammarParser.NAME, 0); }
		public P_cond0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_cond0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).enterP_cond0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).exitP_cond0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RAGrammarVisitor ) return ((RAGrammarVisitor<? extends T>)visitor).visitP_cond0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final P_cond0Context p_cond0() throws RecognitionException {
		P_cond0Context _localctx = new P_cond0Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_p_cond0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class P_cond1Context extends ParserRuleContext {
		public P_cond0Context p_cond0() {
			return getRuleContext(P_cond0Context.class,0);
		}
		public P_cond1Context p_cond1() {
			return getRuleContext(P_cond1Context.class,0);
		}
		public TerminalNode COMMA() { return getToken(RAGrammarParser.COMMA, 0); }
		public P_cond1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_cond1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).enterP_cond1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).exitP_cond1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RAGrammarVisitor ) return ((RAGrammarVisitor<? extends T>)visitor).visitP_cond1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final P_cond1Context p_cond1() throws RecognitionException {
		return p_cond1(0);
	}

	private P_cond1Context p_cond1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		P_cond1Context _localctx = new P_cond1Context(_ctx, _parentState);
		P_cond1Context _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_p_cond1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(174);
			p_cond0();
			}
			_ctx.stop = _input.LT(-1);
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new P_cond1Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_p_cond1);
					setState(176);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(177);
					match(COMMA);
					setState(178);
					p_cond0();
					}
					} 
				}
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Join_condContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(RAGrammarParser.LEFT_BRACE, 0); }
		public J_cond2Context j_cond2() {
			return getRuleContext(J_cond2Context.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(RAGrammarParser.RIGHT_BRACE, 0); }
		public Join_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).enterJoin_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).exitJoin_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RAGrammarVisitor ) return ((RAGrammarVisitor<? extends T>)visitor).visitJoin_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_condContext join_cond() throws RecognitionException {
		Join_condContext _localctx = new Join_condContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_join_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(LEFT_BRACE);
			setState(185);
			j_cond2();
			setState(186);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class J_cond0Context extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(RAGrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(RAGrammarParser.NAME, i);
		}
		public Eq_atomContext eq_atom() {
			return getRuleContext(Eq_atomContext.class,0);
		}
		public Comp_atomContext comp_atom() {
			return getRuleContext(Comp_atomContext.class,0);
		}
		public J_cond0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_cond0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).enterJ_cond0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).exitJ_cond0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RAGrammarVisitor ) return ((RAGrammarVisitor<? extends T>)visitor).visitJ_cond0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_cond0Context j_cond0() throws RecognitionException {
		J_cond0Context _localctx = new J_cond0Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_j_cond0);
		try {
			setState(196);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(NAME);
				setState(189);
				eq_atom();
				setState(190);
				match(NAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(NAME);
				setState(193);
				comp_atom();
				setState(194);
				match(NAME);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class J_cond1Context extends ParserRuleContext {
		public J_cond0Context j_cond0() {
			return getRuleContext(J_cond0Context.class,0);
		}
		public TerminalNode NOT() { return getToken(RAGrammarParser.NOT, 0); }
		public J_cond1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_cond1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).enterJ_cond1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).exitJ_cond1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RAGrammarVisitor ) return ((RAGrammarVisitor<? extends T>)visitor).visitJ_cond1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_cond1Context j_cond1() throws RecognitionException {
		J_cond1Context _localctx = new J_cond1Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_j_cond1);
		try {
			setState(201);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				j_cond0();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				match(NOT);
				setState(200);
				j_cond0();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class J_cond2Context extends ParserRuleContext {
		public List<J_cond1Context> j_cond1() {
			return getRuleContexts(J_cond1Context.class);
		}
		public J_cond1Context j_cond1(int i) {
			return getRuleContext(J_cond1Context.class,i);
		}
		public TerminalNode AND() { return getToken(RAGrammarParser.AND, 0); }
		public TerminalNode OR() { return getToken(RAGrammarParser.OR, 0); }
		public J_cond2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_cond2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).enterJ_cond2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).exitJ_cond2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RAGrammarVisitor ) return ((RAGrammarVisitor<? extends T>)visitor).visitJ_cond2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_cond2Context j_cond2() throws RecognitionException {
		J_cond2Context _localctx = new J_cond2Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_j_cond2);
		try {
			setState(212);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				j_cond1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				j_cond1();
				setState(205);
				match(AND);
				setState(206);
				j_cond1();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				j_cond1();
				setState(209);
				match(OR);
				setState(210);
				j_cond1();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return p_cond1_sempred((P_cond1Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean p_cond1_sempred(P_cond1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3!\u00d9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\62\n\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4A\n\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5]\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6y\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13\u0098\n\13\3\f\3\f\3\f\5\f\u009d\n\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\5\r\u00a8\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\7\20\u00b6\n\20\f\20\16\20\u00b9\13\20\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00c7\n\22\3\23\3\23"+
		"\3\23\5\23\u00cc\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u00d7\n\24\3\24\2\3\36\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&\2\5\3\2\24\27\4\2\23\23\30\30\3\2\33\34\u00e1\2(\3\2\2\2\4\61\3\2\2"+
		"\2\6@\3\2\2\2\b\\\3\2\2\2\nx\3\2\2\2\fz\3\2\2\2\16|\3\2\2\2\20~\3\2\2"+
		"\2\22\u0080\3\2\2\2\24\u0097\3\2\2\2\26\u009c\3\2\2\2\30\u00a7\3\2\2\2"+
		"\32\u00a9\3\2\2\2\34\u00ad\3\2\2\2\36\u00af\3\2\2\2 \u00ba\3\2\2\2\"\u00c6"+
		"\3\2\2\2$\u00cb\3\2\2\2&\u00d6\3\2\2\2()\5\b\5\2)*\7\32\2\2*+\7\2\2\3"+
		"+\3\3\2\2\2,\62\7\36\2\2-.\7\17\2\2./\5\n\6\2/\60\7\20\2\2\60\62\3\2\2"+
		"\2\61,\3\2\2\2\61-\3\2\2\2\62\5\3\2\2\2\63A\5\4\3\2\64\65\7\7\2\2\65\66"+
		"\5\22\n\2\66\67\5\6\4\2\67A\3\2\2\289\7\b\2\29:\5\32\16\2:;\5\6\4\2;A"+
		"\3\2\2\2<=\7\16\2\2=>\5\32\16\2>?\5\6\4\2?A\3\2\2\2@\63\3\2\2\2@\64\3"+
		"\2\2\2@8\3\2\2\2@<\3\2\2\2A\7\3\2\2\2B]\5\6\4\2CD\5\6\4\2DE\7\t\2\2EF"+
		"\5 \21\2FG\5\6\4\2G]\3\2\2\2HI\5\6\4\2IJ\7\t\2\2JK\5\6\4\2K]\3\2\2\2L"+
		"M\5\6\4\2MN\7\n\2\2NO\5\6\4\2O]\3\2\2\2PQ\5\6\4\2QR\7\13\2\2RS\5\6\4\2"+
		"S]\3\2\2\2TU\5\6\4\2UV\7\f\2\2VW\5\6\4\2W]\3\2\2\2XY\5\6\4\2YZ\7\r\2\2"+
		"Z[\5\6\4\2[]\3\2\2\2\\B\3\2\2\2\\C\3\2\2\2\\H\3\2\2\2\\L\3\2\2\2\\P\3"+
		"\2\2\2\\T\3\2\2\2\\X\3\2\2\2]\t\3\2\2\2^y\5\b\5\2_`\5\b\5\2`a\7\t\2\2"+
		"ab\5 \21\2bc\5\6\4\2cy\3\2\2\2de\5\b\5\2ef\7\t\2\2fg\5\6\4\2gy\3\2\2\2"+
		"hi\5\b\5\2ij\7\n\2\2jk\5\6\4\2ky\3\2\2\2lm\5\b\5\2mn\7\13\2\2no\5\6\4"+
		"\2oy\3\2\2\2pq\5\b\5\2qr\7\f\2\2rs\5\6\4\2sy\3\2\2\2tu\5\b\5\2uv\7\r\2"+
		"\2vw\5\6\4\2wy\3\2\2\2x^\3\2\2\2x_\3\2\2\2xd\3\2\2\2xh\3\2\2\2xl\3\2\2"+
		"\2xp\3\2\2\2xt\3\2\2\2y\13\3\2\2\2z{\t\2\2\2{\r\3\2\2\2|}\t\3\2\2}\17"+
		"\3\2\2\2~\177\t\4\2\2\177\21\3\2\2\2\u0080\u0081\7\21\2\2\u0081\u0082"+
		"\5\30\r\2\u0082\u0083\7\22\2\2\u0083\23\3\2\2\2\u0084\u0085\7\36\2\2\u0085"+
		"\u0086\5\f\7\2\u0086\u0087\5\20\t\2\u0087\u0098\3\2\2\2\u0088\u0089\7"+
		"\36\2\2\u0089\u008a\5\f\7\2\u008a\u008b\7\36\2\2\u008b\u0098\3\2\2\2\u008c"+
		"\u008d\7\36\2\2\u008d\u008e\5\16\b\2\u008e\u008f\7\36\2\2\u008f\u0098"+
		"\3\2\2\2\u0090\u0091\7\36\2\2\u0091\u0092\5\16\b\2\u0092\u0093\7\35\2"+
		"\2\u0093\u0098\3\2\2\2\u0094\u0095\7\36\2\2\u0095\u0096\7\6\2\2\u0096"+
		"\u0098\7\35\2\2\u0097\u0084\3\2\2\2\u0097\u0088\3\2\2\2\u0097\u008c\3"+
		"\2\2\2\u0097\u0090\3\2\2\2\u0097\u0094\3\2\2\2\u0098\25\3\2\2\2\u0099"+
		"\u009d\5\24\13\2\u009a\u009b\7\5\2\2\u009b\u009d\5\24\13\2\u009c\u0099"+
		"\3\2\2\2\u009c\u009a\3\2\2\2\u009d\27\3\2\2\2\u009e\u00a8\5\26\f\2\u009f"+
		"\u00a0\5\26\f\2\u00a0\u00a1\7\3\2\2\u00a1\u00a2\5\26\f\2\u00a2\u00a8\3"+
		"\2\2\2\u00a3\u00a4\5\26\f\2\u00a4\u00a5\7\4\2\2\u00a5\u00a6\5\26\f\2\u00a6"+
		"\u00a8\3\2\2\2\u00a7\u009e\3\2\2\2\u00a7\u009f\3\2\2\2\u00a7\u00a3\3\2"+
		"\2\2\u00a8\31\3\2\2\2\u00a9\u00aa\7\21\2\2\u00aa\u00ab\5\36\20\2\u00ab"+
		"\u00ac\7\22\2\2\u00ac\33\3\2\2\2\u00ad\u00ae\7\36\2\2\u00ae\35\3\2\2\2"+
		"\u00af\u00b0\b\20\1\2\u00b0\u00b1\5\34\17\2\u00b1\u00b7\3\2\2\2\u00b2"+
		"\u00b3\f\3\2\2\u00b3\u00b4\7\31\2\2\u00b4\u00b6\5\34\17\2\u00b5\u00b2"+
		"\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\37\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\7\21\2\2\u00bb\u00bc\5&\24"+
		"\2\u00bc\u00bd\7\22\2\2\u00bd!\3\2\2\2\u00be\u00bf\7\36\2\2\u00bf\u00c0"+
		"\5\16\b\2\u00c0\u00c1\7\36\2\2\u00c1\u00c7\3\2\2\2\u00c2\u00c3\7\36\2"+
		"\2\u00c3\u00c4\5\f\7\2\u00c4\u00c5\7\36\2\2\u00c5\u00c7\3\2\2\2\u00c6"+
		"\u00be\3\2\2\2\u00c6\u00c2\3\2\2\2\u00c7#\3\2\2\2\u00c8\u00cc\5\"\22\2"+
		"\u00c9\u00ca\7\5\2\2\u00ca\u00cc\5\"\22\2\u00cb\u00c8\3\2\2\2\u00cb\u00c9"+
		"\3\2\2\2\u00cc%\3\2\2\2\u00cd\u00d7\5$\23\2\u00ce\u00cf\5$\23\2\u00cf"+
		"\u00d0\7\3\2\2\u00d0\u00d1\5$\23\2\u00d1\u00d7\3\2\2\2\u00d2\u00d3\5$"+
		"\23\2\u00d3\u00d4\7\4\2\2\u00d4\u00d5\5$\23\2\u00d5\u00d7\3\2\2\2\u00d6"+
		"\u00cd\3\2\2\2\u00d6\u00ce\3\2\2\2\u00d6\u00d2\3\2\2\2\u00d7\'\3\2\2\2"+
		"\r\61@\\x\u0097\u009c\u00a7\u00b7\u00c6\u00cb\u00d6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}