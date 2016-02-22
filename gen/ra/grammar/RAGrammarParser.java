// Generated from /Users/jordanly/Documents/workspace/ra-interpreter/src/main/java/ra/grammar/RAGrammar.g4 by ANTLR 4.5.1
package ra.grammar;
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
		AND=1, OR=2, NOT=3, LIKE=4, WS=5, LEFT_PAREN=6, RIGHT_PAREN=7, STATEMENT_TERMINATOR=8, 
		COMMA=9, TABLE_NAME=10, SELECT=11, PROJECT=12, JOIN=13, CROSS=14, UNION=15, 
		DIFF=16, INTERSECT=17, RENAME=18, LEFT_BRACE=19, RIGHT_BRACE=20, EQUALS=21, 
		LT=22, LTE=23, GT=24, GTE=25, NOT_EQUALS=26, STRING_LITERAL=27, VALUE=28, 
		COMMENT=29, SINGLELINE_COMMENT=30;
	public static final int
		RULE_exp0 = 0, RULE_exp_unit = 1, RULE_exp_unary = 2, RULE_exp = 3, RULE_exp1 = 4, 
		RULE_comp_atom = 5, RULE_eq_atom = 6, RULE_select_cond = 7, RULE_s_cond0 = 8, 
		RULE_s_cond1 = 9, RULE_s_cond2 = 10, RULE_proj_cond = 11, RULE_p_cond0 = 12, 
		RULE_p_cond1 = 13, RULE_join_cond = 14, RULE_j_cond0 = 15, RULE_j_cond1 = 16, 
		RULE_j_cond2 = 17;
	public static final String[] ruleNames = {
		"exp0", "exp_unit", "exp_unary", "exp", "exp1", "comp_atom", "eq_atom", 
		"select_cond", "s_cond0", "s_cond1", "s_cond2", "proj_cond", "p_cond0", 
		"p_cond1", "join_cond", "j_cond0", "j_cond1", "j_cond2"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'and'", "'or'", "'not'", "'like'", null, "'('", "')'", "';'", "','", 
		null, "'\\select'", "'\\project'", "'\\join'", "'\\cross'", "'\\union'", 
		"'\\diff'", "'\\intersect'", "'\\rename'", "'_{'", "'}'", "'='", "'<'", 
		"'<='", "'>'", "'>='", "'<>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AND", "OR", "NOT", "LIKE", "WS", "LEFT_PAREN", "RIGHT_PAREN", "STATEMENT_TERMINATOR", 
		"COMMA", "TABLE_NAME", "SELECT", "PROJECT", "JOIN", "CROSS", "UNION", 
		"DIFF", "INTERSECT", "RENAME", "LEFT_BRACE", "RIGHT_BRACE", "EQUALS", 
		"LT", "LTE", "GT", "GTE", "NOT_EQUALS", "STRING_LITERAL", "VALUE", "COMMENT", 
		"SINGLELINE_COMMENT"
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
			setState(36);
			exp();
			setState(37);
			match(STATEMENT_TERMINATOR);
			setState(38);
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
		public TerminalNode TABLE_NAME() { return getToken(RAGrammarParser.TABLE_NAME, 0); }
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
			setState(45);
			switch (_input.LA(1)) {
			case TABLE_NAME:
				_localctx = new TableExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				match(TABLE_NAME);
				}
				break;
			case LEFT_PAREN:
				_localctx = new ParenExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				match(LEFT_PAREN);
				setState(42);
				exp1();
				setState(43);
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
			setState(60);
			switch (_input.LA(1)) {
			case LEFT_PAREN:
			case TABLE_NAME:
				_localctx = new UnitExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				exp_unit();
				}
				break;
			case SELECT:
				_localctx = new UnaryExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				match(SELECT);
				setState(49);
				select_cond();
				setState(50);
				exp_unary();
				}
				break;
			case PROJECT:
				_localctx = new UnaryExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				match(PROJECT);
				setState(53);
				proj_cond();
				setState(54);
				exp_unary();
				}
				break;
			case RENAME:
				_localctx = new UnaryExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				match(RENAME);
				setState(57);
				proj_cond();
				setState(58);
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
			setState(88);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new SingleUnaryExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				exp_unary();
				}
				break;
			case 2:
				_localctx = new JoinExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				exp_unary();
				setState(64);
				match(JOIN);
				setState(65);
				join_cond();
				setState(66);
				exp_unary();
				}
				break;
			case 3:
				_localctx = new BinaryExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				exp_unary();
				setState(69);
				match(JOIN);
				setState(70);
				exp_unary();
				}
				break;
			case 4:
				_localctx = new BinaryExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				exp_unary();
				setState(73);
				match(CROSS);
				setState(74);
				exp_unary();
				}
				break;
			case 5:
				_localctx = new BinaryExpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				exp_unary();
				setState(77);
				match(UNION);
				setState(78);
				exp_unary();
				}
				break;
			case 6:
				_localctx = new BinaryExpContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(80);
				exp_unary();
				setState(81);
				match(DIFF);
				setState(82);
				exp_unary();
				}
				break;
			case 7:
				_localctx = new BinaryExpContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(84);
				exp_unary();
				setState(85);
				match(INTERSECT);
				setState(86);
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
			setState(116);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new SingleTermExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				exp();
				}
				break;
			case 2:
				_localctx = new JoinTermExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				exp();
				setState(92);
				match(JOIN);
				setState(93);
				join_cond();
				setState(94);
				exp_unary();
				}
				break;
			case 3:
				_localctx = new BinaryTermExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				exp();
				setState(97);
				match(JOIN);
				setState(98);
				exp_unary();
				}
				break;
			case 4:
				_localctx = new BinaryTermExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				exp();
				setState(101);
				match(CROSS);
				setState(102);
				exp_unary();
				}
				break;
			case 5:
				_localctx = new BinaryTermExpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(104);
				exp();
				setState(105);
				match(UNION);
				setState(106);
				exp_unary();
				}
				break;
			case 6:
				_localctx = new BinaryTermExpContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(108);
				exp();
				setState(109);
				match(DIFF);
				setState(110);
				exp_unary();
				}
				break;
			case 7:
				_localctx = new BinaryTermExpContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(112);
				exp();
				setState(113);
				match(INTERSECT);
				setState(114);
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
			setState(118);
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
			setState(120);
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
		enterRule(_localctx, 14, RULE_select_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(LEFT_BRACE);
			setState(123);
			s_cond2();
			setState(124);
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
		public List<TerminalNode> TABLE_NAME() { return getTokens(RAGrammarParser.TABLE_NAME); }
		public TerminalNode TABLE_NAME(int i) {
			return getToken(RAGrammarParser.TABLE_NAME, i);
		}
		public Comp_atomContext comp_atom() {
			return getRuleContext(Comp_atomContext.class,0);
		}
		public TerminalNode VALUE() { return getToken(RAGrammarParser.VALUE, 0); }
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
		enterRule(_localctx, 16, RULE_s_cond0);
		try {
			setState(141);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(TABLE_NAME);
				setState(127);
				comp_atom();
				setState(128);
				match(VALUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(TABLE_NAME);
				setState(131);
				comp_atom();
				setState(132);
				match(TABLE_NAME);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				match(TABLE_NAME);
				setState(135);
				eq_atom();
				setState(136);
				match(STRING_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				match(TABLE_NAME);
				setState(139);
				match(LIKE);
				setState(140);
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
		enterRule(_localctx, 18, RULE_s_cond1);
		try {
			setState(146);
			switch (_input.LA(1)) {
			case TABLE_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				s_cond0();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(NOT);
				setState(145);
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
		enterRule(_localctx, 20, RULE_s_cond2);
		try {
			setState(157);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				s_cond1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				s_cond1();
				setState(150);
				match(AND);
				setState(151);
				s_cond1();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				s_cond1();
				setState(154);
				match(OR);
				setState(155);
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
		enterRule(_localctx, 22, RULE_proj_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(LEFT_BRACE);
			setState(160);
			p_cond1(0);
			setState(161);
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
		public TerminalNode TABLE_NAME() { return getToken(RAGrammarParser.TABLE_NAME, 0); }
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
		enterRule(_localctx, 24, RULE_p_cond0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(TABLE_NAME);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_p_cond1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(166);
			p_cond0();
			}
			_ctx.stop = _input.LT(-1);
			setState(173);
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
					setState(168);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(169);
					match(COMMA);
					setState(170);
					p_cond0();
					}
					} 
				}
				setState(175);
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
		enterRule(_localctx, 28, RULE_join_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(LEFT_BRACE);
			setState(177);
			j_cond2();
			setState(178);
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
		public List<TerminalNode> TABLE_NAME() { return getTokens(RAGrammarParser.TABLE_NAME); }
		public TerminalNode TABLE_NAME(int i) {
			return getToken(RAGrammarParser.TABLE_NAME, i);
		}
		public Eq_atomContext eq_atom() {
			return getRuleContext(Eq_atomContext.class,0);
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
		enterRule(_localctx, 30, RULE_j_cond0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(TABLE_NAME);
			setState(181);
			eq_atom();
			setState(182);
			match(TABLE_NAME);
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
		enterRule(_localctx, 32, RULE_j_cond1);
		try {
			setState(187);
			switch (_input.LA(1)) {
			case TABLE_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				j_cond0();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(NOT);
				setState(186);
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
		enterRule(_localctx, 34, RULE_j_cond2);
		try {
			setState(198);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				j_cond1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				j_cond1();
				setState(191);
				match(AND);
				setState(192);
				j_cond1();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				j_cond1();
				setState(195);
				match(OR);
				setState(196);
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
		case 13:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3 \u00cb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\60\n\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4?\n\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5[\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6w\n\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\5\n\u0090\n\n\3\13\3\13\3\13\5\13\u0095\n\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a0\n\f\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00ae\n\17\f\17\16\17\u00b1\13"+
		"\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\5\22\u00be"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00c9\n\23\3\23"+
		"\2\3\34\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\4\3\2\30\33\4"+
		"\2\27\27\34\34\u00d2\2&\3\2\2\2\4/\3\2\2\2\6>\3\2\2\2\bZ\3\2\2\2\nv\3"+
		"\2\2\2\fx\3\2\2\2\16z\3\2\2\2\20|\3\2\2\2\22\u008f\3\2\2\2\24\u0094\3"+
		"\2\2\2\26\u009f\3\2\2\2\30\u00a1\3\2\2\2\32\u00a5\3\2\2\2\34\u00a7\3\2"+
		"\2\2\36\u00b2\3\2\2\2 \u00b6\3\2\2\2\"\u00bd\3\2\2\2$\u00c8\3\2\2\2&\'"+
		"\5\b\5\2\'(\7\n\2\2()\7\2\2\3)\3\3\2\2\2*\60\7\f\2\2+,\7\b\2\2,-\5\n\6"+
		"\2-.\7\t\2\2.\60\3\2\2\2/*\3\2\2\2/+\3\2\2\2\60\5\3\2\2\2\61?\5\4\3\2"+
		"\62\63\7\r\2\2\63\64\5\20\t\2\64\65\5\6\4\2\65?\3\2\2\2\66\67\7\16\2\2"+
		"\678\5\30\r\289\5\6\4\29?\3\2\2\2:;\7\24\2\2;<\5\30\r\2<=\5\6\4\2=?\3"+
		"\2\2\2>\61\3\2\2\2>\62\3\2\2\2>\66\3\2\2\2>:\3\2\2\2?\7\3\2\2\2@[\5\6"+
		"\4\2AB\5\6\4\2BC\7\17\2\2CD\5\36\20\2DE\5\6\4\2E[\3\2\2\2FG\5\6\4\2GH"+
		"\7\17\2\2HI\5\6\4\2I[\3\2\2\2JK\5\6\4\2KL\7\20\2\2LM\5\6\4\2M[\3\2\2\2"+
		"NO\5\6\4\2OP\7\21\2\2PQ\5\6\4\2Q[\3\2\2\2RS\5\6\4\2ST\7\22\2\2TU\5\6\4"+
		"\2U[\3\2\2\2VW\5\6\4\2WX\7\23\2\2XY\5\6\4\2Y[\3\2\2\2Z@\3\2\2\2ZA\3\2"+
		"\2\2ZF\3\2\2\2ZJ\3\2\2\2ZN\3\2\2\2ZR\3\2\2\2ZV\3\2\2\2[\t\3\2\2\2\\w\5"+
		"\b\5\2]^\5\b\5\2^_\7\17\2\2_`\5\36\20\2`a\5\6\4\2aw\3\2\2\2bc\5\b\5\2"+
		"cd\7\17\2\2de\5\6\4\2ew\3\2\2\2fg\5\b\5\2gh\7\20\2\2hi\5\6\4\2iw\3\2\2"+
		"\2jk\5\b\5\2kl\7\21\2\2lm\5\6\4\2mw\3\2\2\2no\5\b\5\2op\7\22\2\2pq\5\6"+
		"\4\2qw\3\2\2\2rs\5\b\5\2st\7\23\2\2tu\5\6\4\2uw\3\2\2\2v\\\3\2\2\2v]\3"+
		"\2\2\2vb\3\2\2\2vf\3\2\2\2vj\3\2\2\2vn\3\2\2\2vr\3\2\2\2w\13\3\2\2\2x"+
		"y\t\2\2\2y\r\3\2\2\2z{\t\3\2\2{\17\3\2\2\2|}\7\25\2\2}~\5\26\f\2~\177"+
		"\7\26\2\2\177\21\3\2\2\2\u0080\u0081\7\f\2\2\u0081\u0082\5\f\7\2\u0082"+
		"\u0083\7\36\2\2\u0083\u0090\3\2\2\2\u0084\u0085\7\f\2\2\u0085\u0086\5"+
		"\f\7\2\u0086\u0087\7\f\2\2\u0087\u0090\3\2\2\2\u0088\u0089\7\f\2\2\u0089"+
		"\u008a\5\16\b\2\u008a\u008b\7\35\2\2\u008b\u0090\3\2\2\2\u008c\u008d\7"+
		"\f\2\2\u008d\u008e\7\6\2\2\u008e\u0090\7\35\2\2\u008f\u0080\3\2\2\2\u008f"+
		"\u0084\3\2\2\2\u008f\u0088\3\2\2\2\u008f\u008c\3\2\2\2\u0090\23\3\2\2"+
		"\2\u0091\u0095\5\22\n\2\u0092\u0093\7\5\2\2\u0093\u0095\5\22\n\2\u0094"+
		"\u0091\3\2\2\2\u0094\u0092\3\2\2\2\u0095\25\3\2\2\2\u0096\u00a0\5\24\13"+
		"\2\u0097\u0098\5\24\13\2\u0098\u0099\7\3\2\2\u0099\u009a\5\24\13\2\u009a"+
		"\u00a0\3\2\2\2\u009b\u009c\5\24\13\2\u009c\u009d\7\4\2\2\u009d\u009e\5"+
		"\24\13\2\u009e\u00a0\3\2\2\2\u009f\u0096\3\2\2\2\u009f\u0097\3\2\2\2\u009f"+
		"\u009b\3\2\2\2\u00a0\27\3\2\2\2\u00a1\u00a2\7\25\2\2\u00a2\u00a3\5\34"+
		"\17\2\u00a3\u00a4\7\26\2\2\u00a4\31\3\2\2\2\u00a5\u00a6\7\f\2\2\u00a6"+
		"\33\3\2\2\2\u00a7\u00a8\b\17\1\2\u00a8\u00a9\5\32\16\2\u00a9\u00af\3\2"+
		"\2\2\u00aa\u00ab\f\3\2\2\u00ab\u00ac\7\13\2\2\u00ac\u00ae\5\32\16\2\u00ad"+
		"\u00aa\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\35\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\7\25\2\2\u00b3\u00b4"+
		"\5$\23\2\u00b4\u00b5\7\26\2\2\u00b5\37\3\2\2\2\u00b6\u00b7\7\f\2\2\u00b7"+
		"\u00b8\5\16\b\2\u00b8\u00b9\7\f\2\2\u00b9!\3\2\2\2\u00ba\u00be\5 \21\2"+
		"\u00bb\u00bc\7\5\2\2\u00bc\u00be\5 \21\2\u00bd\u00ba\3\2\2\2\u00bd\u00bb"+
		"\3\2\2\2\u00be#\3\2\2\2\u00bf\u00c9\5\"\22\2\u00c0\u00c1\5\"\22\2\u00c1"+
		"\u00c2\7\3\2\2\u00c2\u00c3\5\"\22\2\u00c3\u00c9\3\2\2\2\u00c4\u00c5\5"+
		"\"\22\2\u00c5\u00c6\7\4\2\2\u00c6\u00c7\5\"\22\2\u00c7\u00c9\3\2\2\2\u00c8"+
		"\u00bf\3\2\2\2\u00c8\u00c0\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c9%\3\2\2\2"+
		"\f/>Zv\u008f\u0094\u009f\u00af\u00bd\u00c8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}