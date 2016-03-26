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
		RULE_program = 0, RULE_unitExpression = 1, RULE_unaryOperator = 2, RULE_unaryExpression = 3, 
		RULE_binaryOperator = 4, RULE_binaryExpression = 5, RULE_comparisonOperator = 6, 
		RULE_equalityOperator = 7, RULE_value = 8, RULE_selectCondition = 9, RULE_joinCondition = 10, 
		RULE_condition = 11, RULE_notCondition = 12, RULE_booleanOperator = 13, 
		RULE_booleanCondition = 14, RULE_attributeList = 15, RULE_operatorOption = 16;
	public static final String[] ruleNames = {
		"program", "unitExpression", "unaryOperator", "unaryExpression", "binaryOperator", 
		"binaryExpression", "comparisonOperator", "equalityOperator", "value", 
		"selectCondition", "joinCondition", "condition", "notCondition", "booleanOperator", 
		"booleanCondition", "attributeList", "operatorOption"
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
	public static class ProgramContext extends ParserRuleContext {
		public BinaryExpressionContext binaryExpression() {
			return getRuleContext(BinaryExpressionContext.class,0);
		}
		public TerminalNode STATEMENT_TERMINATOR() { return getToken(RAGrammarParser.STATEMENT_TERMINATOR, 0); }
		public TerminalNode EOF() { return getToken(RAGrammarParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RAGrammarVisitor ) return ((RAGrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			binaryExpression();
			setState(35);
			match(STATEMENT_TERMINATOR);
			setState(36);
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

	public static class UnitExpressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RAGrammarParser.ID, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(RAGrammarParser.LEFT_PAREN, 0); }
		public BinaryExpressionContext binaryExpression() {
			return getRuleContext(BinaryExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(RAGrammarParser.RIGHT_PAREN, 0); }
		public UnitExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).enterUnitExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).exitUnitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RAGrammarVisitor ) return ((RAGrammarVisitor<? extends T>)visitor).visitUnitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitExpressionContext unitExpression() throws RecognitionException {
		UnitExpressionContext _localctx = new UnitExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_unitExpression);
		try {
			setState(43);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				match(ID);
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				match(LEFT_PAREN);
				setState(40);
				binaryExpression();
				setState(41);
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

	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(RAGrammarParser.SELECT, 0); }
		public OperatorOptionContext operatorOption() {
			return getRuleContext(OperatorOptionContext.class,0);
		}
		public TerminalNode PROJECT() { return getToken(RAGrammarParser.PROJECT, 0); }
		public TerminalNode RENAME() { return getToken(RAGrammarParser.RENAME, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).exitUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RAGrammarVisitor ) return ((RAGrammarVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_unaryOperator);
		try {
			setState(51);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				match(SELECT);
				setState(46);
				operatorOption();
				}
				break;
			case PROJECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				match(PROJECT);
				setState(48);
				operatorOption();
				}
				break;
			case RENAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				match(RENAME);
				setState(50);
				operatorOption();
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnitExpressionContext unitExpression() {
			return getRuleContext(UnitExpressionContext.class,0);
		}
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RAGrammarVisitor ) return ((RAGrammarVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unaryExpression);
		try {
			setState(57);
			switch (_input.LA(1)) {
			case LEFT_PAREN:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				unitExpression();
				}
				break;
			case SELECT:
			case PROJECT:
			case RENAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				unaryOperator();
				setState(55);
				unaryExpression();
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

	public static class BinaryOperatorContext extends ParserRuleContext {
		public TerminalNode JOIN() { return getToken(RAGrammarParser.JOIN, 0); }
		public OperatorOptionContext operatorOption() {
			return getRuleContext(OperatorOptionContext.class,0);
		}
		public TerminalNode CROSS() { return getToken(RAGrammarParser.CROSS, 0); }
		public TerminalNode UNION() { return getToken(RAGrammarParser.UNION, 0); }
		public TerminalNode DIFF() { return getToken(RAGrammarParser.DIFF, 0); }
		public TerminalNode INTERSECT() { return getToken(RAGrammarParser.INTERSECT, 0); }
		public BinaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).enterBinaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).exitBinaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RAGrammarVisitor ) return ((RAGrammarVisitor<? extends T>)visitor).visitBinaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryOperatorContext binaryOperator() throws RecognitionException {
		BinaryOperatorContext _localctx = new BinaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_binaryOperator);
		try {
			setState(66);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				match(JOIN);
				setState(60);
				operatorOption();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(JOIN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				match(CROSS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				match(UNION);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				match(DIFF);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(65);
				match(INTERSECT);
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

	public static class BinaryExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<BinaryOperatorContext> binaryOperator() {
			return getRuleContexts(BinaryOperatorContext.class);
		}
		public BinaryOperatorContext binaryOperator(int i) {
			return getRuleContext(BinaryOperatorContext.class,i);
		}
		public BinaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).enterBinaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).exitBinaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RAGrammarVisitor ) return ((RAGrammarVisitor<? extends T>)visitor).visitBinaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryExpressionContext binaryExpression() throws RecognitionException {
		BinaryExpressionContext _localctx = new BinaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_binaryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			unaryExpression();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JOIN) | (1L << CROSS) | (1L << UNION) | (1L << DIFF) | (1L << INTERSECT))) != 0)) {
				{
				{
				setState(69);
				binaryOperator();
				setState(70);
				unaryExpression();
				}
				}
				setState(76);
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
		enterRule(_localctx, 12, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
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
		enterRule(_localctx, 14, RULE_equalityOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
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
		enterRule(_localctx, 16, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
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
		enterRule(_localctx, 18, RULE_selectCondition);
		try {
			setState(102);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(ID);
				setState(84);
				comparisonOperator();
				setState(85);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(ID);
				setState(88);
				comparisonOperator();
				setState(89);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				match(ID);
				setState(92);
				equalityOperator();
				setState(93);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				match(ID);
				setState(96);
				equalityOperator();
				setState(97);
				match(STRING_LITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(99);
				match(ID);
				setState(100);
				match(LIKE);
				setState(101);
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
		enterRule(_localctx, 20, RULE_joinCondition);
		try {
			setState(112);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(ID);
				setState(105);
				equalityOperator();
				setState(106);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(ID);
				setState(109);
				comparisonOperator();
				setState(110);
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
		enterRule(_localctx, 22, RULE_condition);
		try {
			setState(116);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				selectCondition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
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
		enterRule(_localctx, 24, RULE_notCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(118);
				match(NOT);
				}
			}

			setState(121);
			condition();
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

	public static class BooleanOperatorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(RAGrammarParser.AND, 0); }
		public TerminalNode OR() { return getToken(RAGrammarParser.OR, 0); }
		public BooleanOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).enterBooleanOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).exitBooleanOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RAGrammarVisitor ) return ((RAGrammarVisitor<? extends T>)visitor).visitBooleanOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanOperatorContext booleanOperator() throws RecognitionException {
		BooleanOperatorContext _localctx = new BooleanOperatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_booleanOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
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

	public static class BooleanConditionContext extends ParserRuleContext {
		public List<NotConditionContext> notCondition() {
			return getRuleContexts(NotConditionContext.class);
		}
		public NotConditionContext notCondition(int i) {
			return getRuleContext(NotConditionContext.class,i);
		}
		public List<BooleanOperatorContext> booleanOperator() {
			return getRuleContexts(BooleanOperatorContext.class);
		}
		public BooleanOperatorContext booleanOperator(int i) {
			return getRuleContext(BooleanOperatorContext.class,i);
		}
		public BooleanConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).enterBooleanCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).exitBooleanCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RAGrammarVisitor ) return ((RAGrammarVisitor<? extends T>)visitor).visitBooleanCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanConditionContext booleanCondition() throws RecognitionException {
		BooleanConditionContext _localctx = new BooleanConditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_booleanCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			notCondition();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(126);
				booleanOperator();
				setState(127);
				notCondition();
				}
				}
				setState(133);
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
		enterRule(_localctx, 30, RULE_attributeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(ID);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(135);
				match(COMMA);
				setState(136);
				match(ID);
				}
				}
				setState(141);
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
		public BooleanConditionContext booleanCondition() {
			return getRuleContext(BooleanConditionContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(RAGrammarParser.RIGHT_BRACE, 0); }
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
		enterRule(_localctx, 32, RULE_operatorOption);
		try {
			setState(150);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(LEFT_BRACE);
				setState(143);
				booleanCondition();
				setState(144);
				match(RIGHT_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(LEFT_BRACE);
				setState(147);
				attributeList();
				setState(148);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\"\u009b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3.\n\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4\66\n\4\3\5\3\5\3\5\3\5\5\5<\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6E"+
		"\n\6\3\7\3\7\3\7\3\7\7\7K\n\7\f\7\16\7N\13\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\5\13i\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"s\n\f\3\r\3\r\5\rw\n\r\3\16\5\16z\n\16\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\7\20\u0084\n\20\f\20\16\20\u0087\13\20\3\21\3\21\3\21\7\21\u008c"+
		"\n\21\f\21\16\21\u008f\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5"+
		"\22\u0099\n\22\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2"+
		"\6\3\2\27\32\4\2\26\26\33\33\3\2\34\35\3\2\3\4\u009d\2$\3\2\2\2\4-\3\2"+
		"\2\2\6\65\3\2\2\2\b;\3\2\2\2\nD\3\2\2\2\fF\3\2\2\2\16O\3\2\2\2\20Q\3\2"+
		"\2\2\22S\3\2\2\2\24h\3\2\2\2\26r\3\2\2\2\30v\3\2\2\2\32y\3\2\2\2\34}\3"+
		"\2\2\2\36\177\3\2\2\2 \u0088\3\2\2\2\"\u0098\3\2\2\2$%\5\f\7\2%&\7\25"+
		"\2\2&\'\7\2\2\3\'\3\3\2\2\2(.\7\37\2\2)*\7\17\2\2*+\5\f\7\2+,\7\20\2\2"+
		",.\3\2\2\2-(\3\2\2\2-)\3\2\2\2.\5\3\2\2\2/\60\7\7\2\2\60\66\5\"\22\2\61"+
		"\62\7\b\2\2\62\66\5\"\22\2\63\64\7\16\2\2\64\66\5\"\22\2\65/\3\2\2\2\65"+
		"\61\3\2\2\2\65\63\3\2\2\2\66\7\3\2\2\2\67<\5\4\3\289\5\6\4\29:\5\b\5\2"+
		":<\3\2\2\2;\67\3\2\2\2;8\3\2\2\2<\t\3\2\2\2=>\7\t\2\2>E\5\"\22\2?E\7\t"+
		"\2\2@E\7\n\2\2AE\7\13\2\2BE\7\f\2\2CE\7\r\2\2D=\3\2\2\2D?\3\2\2\2D@\3"+
		"\2\2\2DA\3\2\2\2DB\3\2\2\2DC\3\2\2\2E\13\3\2\2\2FL\5\b\5\2GH\5\n\6\2H"+
		"I\5\b\5\2IK\3\2\2\2JG\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\r\3\2\2\2"+
		"NL\3\2\2\2OP\t\2\2\2P\17\3\2\2\2QR\t\3\2\2R\21\3\2\2\2ST\t\4\2\2T\23\3"+
		"\2\2\2UV\7\37\2\2VW\5\16\b\2WX\5\22\n\2Xi\3\2\2\2YZ\7\37\2\2Z[\5\16\b"+
		"\2[\\\7\37\2\2\\i\3\2\2\2]^\7\37\2\2^_\5\20\t\2_`\7\37\2\2`i\3\2\2\2a"+
		"b\7\37\2\2bc\5\20\t\2cd\7\36\2\2di\3\2\2\2ef\7\37\2\2fg\7\6\2\2gi\7\36"+
		"\2\2hU\3\2\2\2hY\3\2\2\2h]\3\2\2\2ha\3\2\2\2he\3\2\2\2i\25\3\2\2\2jk\7"+
		"\37\2\2kl\5\20\t\2lm\7\37\2\2ms\3\2\2\2no\7\37\2\2op\5\16\b\2pq\7\37\2"+
		"\2qs\3\2\2\2rj\3\2\2\2rn\3\2\2\2s\27\3\2\2\2tw\5\24\13\2uw\5\26\f\2vt"+
		"\3\2\2\2vu\3\2\2\2w\31\3\2\2\2xz\7\5\2\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2\2"+
		"{|\5\30\r\2|\33\3\2\2\2}~\t\5\2\2~\35\3\2\2\2\177\u0085\5\32\16\2\u0080"+
		"\u0081\5\34\17\2\u0081\u0082\5\32\16\2\u0082\u0084\3\2\2\2\u0083\u0080"+
		"\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\37\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008d\7\37\2\2\u0089\u008a\7\23"+
		"\2\2\u008a\u008c\7\37\2\2\u008b\u0089\3\2\2\2\u008c\u008f\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e!\3\2\2\2\u008f\u008d\3\2\2\2"+
		"\u0090\u0091\7\21\2\2\u0091\u0092\5\36\20\2\u0092\u0093\7\22\2\2\u0093"+
		"\u0099\3\2\2\2\u0094\u0095\7\21\2\2\u0095\u0096\5 \21\2\u0096\u0097\7"+
		"\22\2\2\u0097\u0099\3\2\2\2\u0098\u0090\3\2\2\2\u0098\u0094\3\2\2\2\u0099"+
		"#\3\2\2\2\16-\65;DLhrvy\u0085\u008d\u0098";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}