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
		RIGHT_BRACE=16, COMMA=17, DOT=18, STATEMENT_TERMINATOR=19, EQUALS=20, 
		LT=21, LTE=22, GT=23, GTE=24, NOT_EQUALS=25, INT=26, FLOAT=27, STRING_LITERAL=28, 
		ID=29, WHITESPACE=30, COMMENT=31, SINGLELINE_COMMENT=32;
	public static final int
		RULE_exp0 = 0, RULE_exp_unit = 1, RULE_exp_unary = 2, RULE_exp = 3, RULE_exp1 = 4, 
		RULE_comparisonOperator = 5, RULE_equalityOperator = 6, RULE_value = 7, 
		RULE_selectCondition = 8, RULE_joinCondition = 9, RULE_condition = 10, 
		RULE_notCondition = 11, RULE_andCondition = 12, RULE_orCondition = 13, 
		RULE_attributeList = 14, RULE_operatorOption = 15;
	public static final String[] ruleNames = {
		"exp0", "exp_unit", "exp_unary", "exp", "exp1", "comparisonOperator", 
		"equalityOperator", "value", "selectCondition", "joinCondition", "condition", 
		"notCondition", "andCondition", "orCondition", "attributeList", "operatorOption"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'and'", "'or'", "'not'", "'like'", "'\\select'", "'\\project'", 
		"'\\join'", "'\\cross'", "'\\union'", "'\\diff'", "'\\intersect'", "'\\rename'", 
		"'('", "')'", "'_{'", "'}'", "','", "'.'", "';'", "'='", "'<'", "'<='", 
		"'>'", "'>='", "'<>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AND", "OR", "NOT", "LIKE", "SELECT", "PROJECT", "JOIN", "CROSS", 
		"UNION", "DIFF", "INTERSECT", "RENAME", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACE", 
		"RIGHT_BRACE", "COMMA", "DOT", "STATEMENT_TERMINATOR", "EQUALS", "LT", 
		"LTE", "GT", "GTE", "NOT_EQUALS", "INT", "FLOAT", "STRING_LITERAL", "ID", 
		"WHITESPACE", "COMMENT", "SINGLELINE_COMMENT"
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
			setState(32);
			exp();
			setState(33);
			match(STATEMENT_TERMINATOR);
			setState(34);
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
		public TerminalNode ID() { return getToken(RAGrammarParser.ID, 0); }
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
			setState(41);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new TableExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				match(ID);
				}
				break;
			case LEFT_PAREN:
				_localctx = new ParenExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(LEFT_PAREN);
				setState(38);
				exp1();
				setState(39);
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
		public OperatorOptionContext operatorOption() {
			return getRuleContext(OperatorOptionContext.class,0);
		}
		public Exp_unaryContext exp_unary() {
			return getRuleContext(Exp_unaryContext.class,0);
		}
		public TerminalNode PROJECT() { return getToken(RAGrammarParser.PROJECT, 0); }
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
			setState(56);
			switch (_input.LA(1)) {
			case LEFT_PAREN:
			case ID:
				_localctx = new UnitExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				exp_unit();
				}
				break;
			case SELECT:
				_localctx = new UnaryExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(SELECT);
				setState(45);
				operatorOption();
				setState(46);
				exp_unary();
				}
				break;
			case PROJECT:
				_localctx = new UnaryExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				match(PROJECT);
				setState(49);
				operatorOption();
				setState(50);
				exp_unary();
				}
				break;
			case RENAME:
				_localctx = new UnaryExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				match(RENAME);
				setState(53);
				operatorOption();
				setState(54);
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
		public OperatorOptionContext operatorOption() {
			return getRuleContext(OperatorOptionContext.class,0);
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
			setState(84);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new SingleUnaryExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				exp_unary();
				}
				break;
			case 2:
				_localctx = new JoinExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				exp_unary();
				setState(60);
				match(JOIN);
				setState(61);
				operatorOption();
				setState(62);
				exp_unary();
				}
				break;
			case 3:
				_localctx = new BinaryExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				exp_unary();
				setState(65);
				match(JOIN);
				setState(66);
				exp_unary();
				}
				break;
			case 4:
				_localctx = new BinaryExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				exp_unary();
				setState(69);
				match(CROSS);
				setState(70);
				exp_unary();
				}
				break;
			case 5:
				_localctx = new BinaryExpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(72);
				exp_unary();
				setState(73);
				match(UNION);
				setState(74);
				exp_unary();
				}
				break;
			case 6:
				_localctx = new BinaryExpContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(76);
				exp_unary();
				setState(77);
				match(DIFF);
				setState(78);
				exp_unary();
				}
				break;
			case 7:
				_localctx = new BinaryExpContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(80);
				exp_unary();
				setState(81);
				match(INTERSECT);
				setState(82);
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
		public OperatorOptionContext operatorOption() {
			return getRuleContext(OperatorOptionContext.class,0);
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
			setState(112);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new SingleTermExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				exp();
				}
				break;
			case 2:
				_localctx = new JoinTermExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				exp();
				setState(88);
				match(JOIN);
				setState(89);
				operatorOption();
				setState(90);
				exp_unary();
				}
				break;
			case 3:
				_localctx = new BinaryTermExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				exp();
				setState(93);
				match(JOIN);
				setState(94);
				exp_unary();
				}
				break;
			case 4:
				_localctx = new BinaryTermExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
				exp();
				setState(97);
				match(CROSS);
				setState(98);
				exp_unary();
				}
				break;
			case 5:
				_localctx = new BinaryTermExpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(100);
				exp();
				setState(101);
				match(UNION);
				setState(102);
				exp_unary();
				}
				break;
			case 6:
				_localctx = new BinaryTermExpContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(104);
				exp();
				setState(105);
				match(DIFF);
				setState(106);
				exp_unary();
				}
				break;
			case 7:
				_localctx = new BinaryTermExpContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(108);
				exp();
				setState(109);
				match(INTERSECT);
				setState(110);
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

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(RAGrammarParser.GT, 0); }
		public TerminalNode GTE() { return getToken(RAGrammarParser.GTE, 0); }
		public TerminalNode LT() { return getToken(RAGrammarParser.LT, 0); }
		public TerminalNode LTE() { return getToken(RAGrammarParser.LTE, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RAGrammarVisitor ) return ((RAGrammarVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
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

	public static class EqualityOperatorContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(RAGrammarParser.EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(RAGrammarParser.NOT_EQUALS, 0); }
		public EqualityOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).enterEqualityOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).exitEqualityOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RAGrammarVisitor ) return ((RAGrammarVisitor<? extends T>)visitor).visitEqualityOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityOperatorContext equalityOperator() throws RecognitionException {
		EqualityOperatorContext _localctx = new EqualityOperatorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_equalityOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
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
			setState(118);
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

	public static class SelectConditionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(RAGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(RAGrammarParser.ID, i);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public EqualityOperatorContext equalityOperator() {
			return getRuleContext(EqualityOperatorContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(RAGrammarParser.STRING_LITERAL, 0); }
		public TerminalNode LIKE() { return getToken(RAGrammarParser.LIKE, 0); }
		public SelectConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).enterSelectCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).exitSelectCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RAGrammarVisitor ) return ((RAGrammarVisitor<? extends T>)visitor).visitSelectCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectConditionContext selectCondition() throws RecognitionException {
		SelectConditionContext _localctx = new SelectConditionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_selectCondition);
		try {
			setState(139);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(ID);
				setState(121);
				comparisonOperator();
				setState(122);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(ID);
				setState(125);
				comparisonOperator();
				setState(126);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				match(ID);
				setState(129);
				equalityOperator();
				setState(130);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(132);
				match(ID);
				setState(133);
				equalityOperator();
				setState(134);
				match(STRING_LITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(136);
				match(ID);
				setState(137);
				match(LIKE);
				setState(138);
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

	public static class JoinConditionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(RAGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(RAGrammarParser.ID, i);
		}
		public EqualityOperatorContext equalityOperator() {
			return getRuleContext(EqualityOperatorContext.class,0);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public JoinConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).enterJoinCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).exitJoinCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RAGrammarVisitor ) return ((RAGrammarVisitor<? extends T>)visitor).visitJoinCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinConditionContext joinCondition() throws RecognitionException {
		JoinConditionContext _localctx = new JoinConditionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_joinCondition);
		try {
			setState(149);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(ID);
				setState(142);
				equalityOperator();
				setState(143);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(ID);
				setState(146);
				comparisonOperator();
				setState(147);
				match(ID);
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

	public static class ConditionContext extends ParserRuleContext {
		public SelectConditionContext selectCondition() {
			return getRuleContext(SelectConditionContext.class,0);
		}
		public JoinConditionContext joinCondition() {
			return getRuleContext(JoinConditionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RAGrammarVisitor ) return ((RAGrammarVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition);
		try {
			setState(153);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				selectCondition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				joinCondition();
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

	public static class NotConditionContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(RAGrammarParser.NOT, 0); }
		public NotConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).enterNotCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).exitNotCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RAGrammarVisitor ) return ((RAGrammarVisitor<? extends T>)visitor).visitNotCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotConditionContext notCondition() throws RecognitionException {
		NotConditionContext _localctx = new NotConditionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_notCondition);
		try {
			setState(158);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				condition();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(NOT);
				setState(157);
				condition();
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

	public static class AndConditionContext extends ParserRuleContext {
		public List<NotConditionContext> notCondition() {
			return getRuleContexts(NotConditionContext.class);
		}
		public NotConditionContext notCondition(int i) {
			return getRuleContext(NotConditionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(RAGrammarParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(RAGrammarParser.AND, i);
		}
		public AndConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).enterAndCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).exitAndCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RAGrammarVisitor ) return ((RAGrammarVisitor<? extends T>)visitor).visitAndCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndConditionContext andCondition() throws RecognitionException {
		AndConditionContext _localctx = new AndConditionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_andCondition);
		int _la;
		try {
			setState(169);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				notCondition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				notCondition();
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND) {
					{
					{
					setState(162);
					match(AND);
					setState(163);
					notCondition();
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class OrConditionContext extends ParserRuleContext {
		public List<NotConditionContext> notCondition() {
			return getRuleContexts(NotConditionContext.class);
		}
		public NotConditionContext notCondition(int i) {
			return getRuleContext(NotConditionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(RAGrammarParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(RAGrammarParser.OR, i);
		}
		public OrConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).enterOrCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).exitOrCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RAGrammarVisitor ) return ((RAGrammarVisitor<? extends T>)visitor).visitOrCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrConditionContext orCondition() throws RecognitionException {
		OrConditionContext _localctx = new OrConditionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_orCondition);
		int _la;
		try {
			setState(180);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				notCondition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				notCondition();
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OR) {
					{
					{
					setState(173);
					match(OR);
					setState(174);
					notCondition();
					}
					}
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class AttributeListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(RAGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(RAGrammarParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RAGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RAGrammarParser.COMMA, i);
		}
		public AttributeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).enterAttributeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).exitAttributeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RAGrammarVisitor ) return ((RAGrammarVisitor<? extends T>)visitor).visitAttributeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeListContext attributeList() throws RecognitionException {
		AttributeListContext _localctx = new AttributeListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_attributeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(ID);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(183);
				match(COMMA);
				setState(184);
				match(ID);
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class OperatorOptionContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(RAGrammarParser.LEFT_BRACE, 0); }
		public SelectConditionContext selectCondition() {
			return getRuleContext(SelectConditionContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(RAGrammarParser.RIGHT_BRACE, 0); }
		public JoinConditionContext joinCondition() {
			return getRuleContext(JoinConditionContext.class,0);
		}
		public AttributeListContext attributeList() {
			return getRuleContext(AttributeListContext.class,0);
		}
		public OperatorOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).enterOperatorOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).exitOperatorOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RAGrammarVisitor ) return ((RAGrammarVisitor<? extends T>)visitor).visitOperatorOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorOptionContext operatorOption() throws RecognitionException {
		OperatorOptionContext _localctx = new OperatorOptionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_operatorOption);
		try {
			setState(202);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(LEFT_BRACE);
				setState(191);
				selectCondition();
				setState(192);
				match(RIGHT_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(LEFT_BRACE);
				setState(195);
				joinCondition();
				setState(196);
				match(RIGHT_BRACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				match(LEFT_BRACE);
				setState(199);
				attributeList();
				setState(200);
				match(RIGHT_BRACE);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\"\u00cf\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3,\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4;\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5W\n"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6s\n\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u008e\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0098"+
		"\n\13\3\f\3\f\5\f\u009c\n\f\3\r\3\r\3\r\5\r\u00a1\n\r\3\16\3\16\3\16\3"+
		"\16\7\16\u00a7\n\16\f\16\16\16\u00aa\13\16\5\16\u00ac\n\16\3\17\3\17\3"+
		"\17\3\17\7\17\u00b2\n\17\f\17\16\17\u00b5\13\17\5\17\u00b7\n\17\3\20\3"+
		"\20\3\20\7\20\u00bc\n\20\f\20\16\20\u00bf\13\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00cd\n\21\3\21\2\2\22\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\5\3\2\27\32\4\2\26\26\33\33\3\2"+
		"\34\35\u00dc\2\"\3\2\2\2\4+\3\2\2\2\6:\3\2\2\2\bV\3\2\2\2\nr\3\2\2\2\f"+
		"t\3\2\2\2\16v\3\2\2\2\20x\3\2\2\2\22\u008d\3\2\2\2\24\u0097\3\2\2\2\26"+
		"\u009b\3\2\2\2\30\u00a0\3\2\2\2\32\u00ab\3\2\2\2\34\u00b6\3\2\2\2\36\u00b8"+
		"\3\2\2\2 \u00cc\3\2\2\2\"#\5\b\5\2#$\7\25\2\2$%\7\2\2\3%\3\3\2\2\2&,\7"+
		"\37\2\2\'(\7\17\2\2()\5\n\6\2)*\7\20\2\2*,\3\2\2\2+&\3\2\2\2+\'\3\2\2"+
		"\2,\5\3\2\2\2-;\5\4\3\2./\7\7\2\2/\60\5 \21\2\60\61\5\6\4\2\61;\3\2\2"+
		"\2\62\63\7\b\2\2\63\64\5 \21\2\64\65\5\6\4\2\65;\3\2\2\2\66\67\7\16\2"+
		"\2\678\5 \21\289\5\6\4\29;\3\2\2\2:-\3\2\2\2:.\3\2\2\2:\62\3\2\2\2:\66"+
		"\3\2\2\2;\7\3\2\2\2<W\5\6\4\2=>\5\6\4\2>?\7\t\2\2?@\5 \21\2@A\5\6\4\2"+
		"AW\3\2\2\2BC\5\6\4\2CD\7\t\2\2DE\5\6\4\2EW\3\2\2\2FG\5\6\4\2GH\7\n\2\2"+
		"HI\5\6\4\2IW\3\2\2\2JK\5\6\4\2KL\7\13\2\2LM\5\6\4\2MW\3\2\2\2NO\5\6\4"+
		"\2OP\7\f\2\2PQ\5\6\4\2QW\3\2\2\2RS\5\6\4\2ST\7\r\2\2TU\5\6\4\2UW\3\2\2"+
		"\2V<\3\2\2\2V=\3\2\2\2VB\3\2\2\2VF\3\2\2\2VJ\3\2\2\2VN\3\2\2\2VR\3\2\2"+
		"\2W\t\3\2\2\2Xs\5\b\5\2YZ\5\b\5\2Z[\7\t\2\2[\\\5 \21\2\\]\5\6\4\2]s\3"+
		"\2\2\2^_\5\b\5\2_`\7\t\2\2`a\5\6\4\2as\3\2\2\2bc\5\b\5\2cd\7\n\2\2de\5"+
		"\6\4\2es\3\2\2\2fg\5\b\5\2gh\7\13\2\2hi\5\6\4\2is\3\2\2\2jk\5\b\5\2kl"+
		"\7\f\2\2lm\5\6\4\2ms\3\2\2\2no\5\b\5\2op\7\r\2\2pq\5\6\4\2qs\3\2\2\2r"+
		"X\3\2\2\2rY\3\2\2\2r^\3\2\2\2rb\3\2\2\2rf\3\2\2\2rj\3\2\2\2rn\3\2\2\2"+
		"s\13\3\2\2\2tu\t\2\2\2u\r\3\2\2\2vw\t\3\2\2w\17\3\2\2\2xy\t\4\2\2y\21"+
		"\3\2\2\2z{\7\37\2\2{|\5\f\7\2|}\5\20\t\2}\u008e\3\2\2\2~\177\7\37\2\2"+
		"\177\u0080\5\f\7\2\u0080\u0081\7\37\2\2\u0081\u008e\3\2\2\2\u0082\u0083"+
		"\7\37\2\2\u0083\u0084\5\16\b\2\u0084\u0085\7\37\2\2\u0085\u008e\3\2\2"+
		"\2\u0086\u0087\7\37\2\2\u0087\u0088\5\16\b\2\u0088\u0089\7\36\2\2\u0089"+
		"\u008e\3\2\2\2\u008a\u008b\7\37\2\2\u008b\u008c\7\6\2\2\u008c\u008e\7"+
		"\36\2\2\u008dz\3\2\2\2\u008d~\3\2\2\2\u008d\u0082\3\2\2\2\u008d\u0086"+
		"\3\2\2\2\u008d\u008a\3\2\2\2\u008e\23\3\2\2\2\u008f\u0090\7\37\2\2\u0090"+
		"\u0091\5\16\b\2\u0091\u0092\7\37\2\2\u0092\u0098\3\2\2\2\u0093\u0094\7"+
		"\37\2\2\u0094\u0095\5\f\7\2\u0095\u0096\7\37\2\2\u0096\u0098\3\2\2\2\u0097"+
		"\u008f\3\2\2\2\u0097\u0093\3\2\2\2\u0098\25\3\2\2\2\u0099\u009c\5\22\n"+
		"\2\u009a\u009c\5\24\13\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c"+
		"\27\3\2\2\2\u009d\u00a1\5\26\f\2\u009e\u009f\7\5\2\2\u009f\u00a1\5\26"+
		"\f\2\u00a0\u009d\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\31\3\2\2\2\u00a2\u00ac"+
		"\5\30\r\2\u00a3\u00a8\5\30\r\2\u00a4\u00a5\7\3\2\2\u00a5\u00a7\5\30\r"+
		"\2\u00a6\u00a4\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9"+
		"\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00a2\3\2\2\2\u00ab"+
		"\u00a3\3\2\2\2\u00ac\33\3\2\2\2\u00ad\u00b7\5\30\r\2\u00ae\u00b3\5\30"+
		"\r\2\u00af\u00b0\7\4\2\2\u00b0\u00b2\5\30\r\2\u00b1\u00af\3\2\2\2\u00b2"+
		"\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b7\3\2"+
		"\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00ad\3\2\2\2\u00b6\u00ae\3\2\2\2\u00b7"+
		"\35\3\2\2\2\u00b8\u00bd\7\37\2\2\u00b9\u00ba\7\23\2\2\u00ba\u00bc\7\37"+
		"\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\37\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7\21\2"+
		"\2\u00c1\u00c2\5\22\n\2\u00c2\u00c3\7\22\2\2\u00c3\u00cd\3\2\2\2\u00c4"+
		"\u00c5\7\21\2\2\u00c5\u00c6\5\24\13\2\u00c6\u00c7\7\22\2\2\u00c7\u00cd"+
		"\3\2\2\2\u00c8\u00c9\7\21\2\2\u00c9\u00ca\5\36\20\2\u00ca\u00cb\7\22\2"+
		"\2\u00cb\u00cd\3\2\2\2\u00cc\u00c0\3\2\2\2\u00cc\u00c4\3\2\2\2\u00cc\u00c8"+
		"\3\2\2\2\u00cd!\3\2\2\2\20+:Vr\u008d\u0097\u009b\u00a0\u00a8\u00ab\u00b3"+
		"\u00b6\u00bd\u00cc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}