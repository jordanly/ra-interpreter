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
		AND=1, OR=2, NOT=3, LIKE=4, LET=5, SELECT=6, PROJECT=7, JOIN=8, CROSS=9, 
		UNION=10, DIFF=11, INTERSECT=12, RENAME=13, LEFT_PAREN=14, RIGHT_PAREN=15, 
		LEFT_BRACE=16, RIGHT_BRACE=17, COMMA=18, DOT=19, STATEMENT_TERMINATOR=20, 
		EQUALS=21, LT=22, LTE=23, GT=24, GTE=25, NOT_EQUALS=26, INT=27, FLOAT=28, 
		STRING_LITERAL=29, ID=30, WHITESPACE=31, COMMENT=32, SINGLELINE_COMMENT=33;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_assignmentExpression = 2, RULE_unitExpression = 3, 
		RULE_unaryOperator = 4, RULE_unaryExpression = 5, RULE_binaryOperator = 6, 
		RULE_binaryExpression = 7, RULE_comparisonOperator = 8, RULE_equalityOperator = 9, 
		RULE_value = 10, RULE_selectCondition = 11, RULE_joinCondition = 12, RULE_condition = 13, 
		RULE_notCondition = 14, RULE_booleanOperator = 15, RULE_booleanCondition = 16, 
		RULE_attributeList = 17, RULE_operatorOption = 18;
	public static final String[] ruleNames = {
		"program", "statement", "assignmentExpression", "unitExpression", "unaryOperator", 
		"unaryExpression", "binaryOperator", "binaryExpression", "comparisonOperator", 
		"equalityOperator", "value", "selectCondition", "joinCondition", "condition", 
		"notCondition", "booleanOperator", "booleanCondition", "attributeList", 
		"operatorOption"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'and'", "'or'", "'not'", "'like'", "'let'", "'\\select'", "'\\project'", 
		"'\\join'", "'\\cross'", "'\\union'", "'\\diff'", "'\\intersect'", "'\\rename'", 
		"'('", "')'", "'_{'", "'}'", "','", "'.'", "';'", "'='", "'<'", "'<='", 
		"'>'", "'>='", "'<>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AND", "OR", "NOT", "LIKE", "LET", "SELECT", "PROJECT", "JOIN", 
		"CROSS", "UNION", "DIFF", "INTERSECT", "RENAME", "LEFT_PAREN", "RIGHT_PAREN", 
		"LEFT_BRACE", "RIGHT_BRACE", "COMMA", "DOT", "STATEMENT_TERMINATOR", "EQUALS", 
		"LT", "LTE", "GT", "GTE", "NOT_EQUALS", "INT", "FLOAT", "STRING_LITERAL", 
		"ID", "WHITESPACE", "COMMENT", "SINGLELINE_COMMENT"
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
		public TerminalNode EOF() { return getToken(RAGrammarParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				statement();
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LET) | (1L << SELECT) | (1L << PROJECT) | (1L << RENAME) | (1L << LEFT_PAREN) | (1L << ID))) != 0) );
			setState(43);
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

	public static class StatementContext extends ParserRuleContext {
		public BinaryExpressionContext binaryExpression() {
			return getRuleContext(BinaryExpressionContext.class,0);
		}
		public TerminalNode STATEMENT_TERMINATOR() { return getToken(RAGrammarParser.STATEMENT_TERMINATOR, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RAGrammarVisitor ) return ((RAGrammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(51);
			switch (_input.LA(1)) {
			case SELECT:
			case PROJECT:
			case RENAME:
			case LEFT_PAREN:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				binaryExpression();
				setState(46);
				match(STATEMENT_TERMINATOR);
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				assignmentExpression();
				setState(49);
				match(STATEMENT_TERMINATOR);
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

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(RAGrammarParser.LET, 0); }
		public TerminalNode ID() { return getToken(RAGrammarParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(RAGrammarParser.EQUALS, 0); }
		public BinaryExpressionContext binaryExpression() {
			return getRuleContext(BinaryExpressionContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAGrammarListener ) ((RAGrammarListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RAGrammarVisitor ) return ((RAGrammarVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignmentExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(LET);
			setState(54);
			match(ID);
			setState(55);
			match(EQUALS);
			setState(56);
			binaryExpression();
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
		enterRule(_localctx, 6, RULE_unitExpression);
		try {
			setState(63);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(ID);
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				match(LEFT_PAREN);
				setState(60);
				binaryExpression();
				setState(61);
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
		enterRule(_localctx, 8, RULE_unaryOperator);
		try {
			setState(71);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(SELECT);
				setState(66);
				operatorOption();
				}
				break;
			case PROJECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(PROJECT);
				setState(68);
				operatorOption();
				}
				break;
			case RENAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				match(RENAME);
				setState(70);
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
		enterRule(_localctx, 10, RULE_unaryExpression);
		try {
			setState(77);
			switch (_input.LA(1)) {
			case LEFT_PAREN:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				unitExpression();
				}
				break;
			case SELECT:
			case PROJECT:
			case RENAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				unaryOperator();
				setState(75);
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
		enterRule(_localctx, 12, RULE_binaryOperator);
		try {
			setState(86);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(JOIN);
				setState(80);
				operatorOption();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(JOIN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				match(CROSS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				match(UNION);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				match(DIFF);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(85);
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
		enterRule(_localctx, 14, RULE_binaryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			unaryExpression();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JOIN) | (1L << CROSS) | (1L << UNION) | (1L << DIFF) | (1L << INTERSECT))) != 0)) {
				{
				{
				setState(89);
				binaryOperator();
				setState(90);
				unaryExpression();
				}
				}
				setState(96);
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
		enterRule(_localctx, 16, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
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
		enterRule(_localctx, 18, RULE_equalityOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
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
		enterRule(_localctx, 20, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
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
		enterRule(_localctx, 22, RULE_selectCondition);
		try {
			setState(122);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(ID);
				setState(104);
				comparisonOperator();
				setState(105);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(ID);
				setState(108);
				comparisonOperator();
				setState(109);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				match(ID);
				setState(112);
				equalityOperator();
				setState(113);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				match(ID);
				setState(116);
				equalityOperator();
				setState(117);
				match(STRING_LITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(119);
				match(ID);
				setState(120);
				match(LIKE);
				setState(121);
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
		enterRule(_localctx, 24, RULE_joinCondition);
		try {
			setState(132);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(ID);
				setState(125);
				equalityOperator();
				setState(126);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(ID);
				setState(129);
				comparisonOperator();
				setState(130);
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
		enterRule(_localctx, 26, RULE_condition);
		try {
			setState(136);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				selectCondition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
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
		enterRule(_localctx, 28, RULE_notCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(138);
				match(NOT);
				}
			}

			setState(141);
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
		enterRule(_localctx, 30, RULE_booleanOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
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
		enterRule(_localctx, 32, RULE_booleanCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			notCondition();
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(146);
				booleanOperator();
				setState(147);
				notCondition();
				}
				}
				setState(153);
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
		enterRule(_localctx, 34, RULE_attributeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(ID);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(155);
				match(COMMA);
				setState(156);
				match(ID);
				}
				}
				setState(161);
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
		enterRule(_localctx, 36, RULE_operatorOption);
		try {
			setState(170);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(LEFT_BRACE);
				setState(163);
				booleanCondition();
				setState(164);
				match(RIGHT_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(LEFT_BRACE);
				setState(167);
				attributeList();
				setState(168);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#\u00af\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\6\2*\n\2\r\2\16\2+\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3\66\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5B\n\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6J\n\6\3\7\3\7\3\7\3\7\5\7P\n\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\bY\n\b\3\t\3\t\3\t\3\t\7\t_\n\t\f\t\16\tb\13\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\5\r}\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\5\16\u0087\n\16\3\17\3\17\5\17\u008b\n\17\3\20\5\20\u008e\n\20\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u0098\n\22\f\22\16\22\u009b\13"+
		"\22\3\23\3\23\3\23\7\23\u00a0\n\23\f\23\16\23\u00a3\13\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\5\24\u00ad\n\24\3\24\2\2\25\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&\2\6\3\2\30\33\4\2\27\27\34\34\3\2\35\36"+
		"\3\2\3\4\u00b1\2)\3\2\2\2\4\65\3\2\2\2\6\67\3\2\2\2\bA\3\2\2\2\nI\3\2"+
		"\2\2\fO\3\2\2\2\16X\3\2\2\2\20Z\3\2\2\2\22c\3\2\2\2\24e\3\2\2\2\26g\3"+
		"\2\2\2\30|\3\2\2\2\32\u0086\3\2\2\2\34\u008a\3\2\2\2\36\u008d\3\2\2\2"+
		" \u0091\3\2\2\2\"\u0093\3\2\2\2$\u009c\3\2\2\2&\u00ac\3\2\2\2(*\5\4\3"+
		"\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,-\3\2\2\2-.\7\2\2\3.\3\3\2"+
		"\2\2/\60\5\20\t\2\60\61\7\26\2\2\61\66\3\2\2\2\62\63\5\6\4\2\63\64\7\26"+
		"\2\2\64\66\3\2\2\2\65/\3\2\2\2\65\62\3\2\2\2\66\5\3\2\2\2\678\7\7\2\2"+
		"89\7 \2\29:\7\27\2\2:;\5\20\t\2;\7\3\2\2\2<B\7 \2\2=>\7\20\2\2>?\5\20"+
		"\t\2?@\7\21\2\2@B\3\2\2\2A<\3\2\2\2A=\3\2\2\2B\t\3\2\2\2CD\7\b\2\2DJ\5"+
		"&\24\2EF\7\t\2\2FJ\5&\24\2GH\7\17\2\2HJ\5&\24\2IC\3\2\2\2IE\3\2\2\2IG"+
		"\3\2\2\2J\13\3\2\2\2KP\5\b\5\2LM\5\n\6\2MN\5\f\7\2NP\3\2\2\2OK\3\2\2\2"+
		"OL\3\2\2\2P\r\3\2\2\2QR\7\n\2\2RY\5&\24\2SY\7\n\2\2TY\7\13\2\2UY\7\f\2"+
		"\2VY\7\r\2\2WY\7\16\2\2XQ\3\2\2\2XS\3\2\2\2XT\3\2\2\2XU\3\2\2\2XV\3\2"+
		"\2\2XW\3\2\2\2Y\17\3\2\2\2Z`\5\f\7\2[\\\5\16\b\2\\]\5\f\7\2]_\3\2\2\2"+
		"^[\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\21\3\2\2\2b`\3\2\2\2cd\t\2\2"+
		"\2d\23\3\2\2\2ef\t\3\2\2f\25\3\2\2\2gh\t\4\2\2h\27\3\2\2\2ij\7 \2\2jk"+
		"\5\22\n\2kl\5\26\f\2l}\3\2\2\2mn\7 \2\2no\5\22\n\2op\7 \2\2p}\3\2\2\2"+
		"qr\7 \2\2rs\5\24\13\2st\7 \2\2t}\3\2\2\2uv\7 \2\2vw\5\24\13\2wx\7\37\2"+
		"\2x}\3\2\2\2yz\7 \2\2z{\7\6\2\2{}\7\37\2\2|i\3\2\2\2|m\3\2\2\2|q\3\2\2"+
		"\2|u\3\2\2\2|y\3\2\2\2}\31\3\2\2\2~\177\7 \2\2\177\u0080\5\24\13\2\u0080"+
		"\u0081\7 \2\2\u0081\u0087\3\2\2\2\u0082\u0083\7 \2\2\u0083\u0084\5\22"+
		"\n\2\u0084\u0085\7 \2\2\u0085\u0087\3\2\2\2\u0086~\3\2\2\2\u0086\u0082"+
		"\3\2\2\2\u0087\33\3\2\2\2\u0088\u008b\5\30\r\2\u0089\u008b\5\32\16\2\u008a"+
		"\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b\35\3\2\2\2\u008c\u008e\7\5\2"+
		"\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090"+
		"\5\34\17\2\u0090\37\3\2\2\2\u0091\u0092\t\5\2\2\u0092!\3\2\2\2\u0093\u0099"+
		"\5\36\20\2\u0094\u0095\5 \21\2\u0095\u0096\5\36\20\2\u0096\u0098\3\2\2"+
		"\2\u0097\u0094\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a#\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u00a1\7 \2\2\u009d\u009e"+
		"\7\24\2\2\u009e\u00a0\7 \2\2\u009f\u009d\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2%\3\2\2\2\u00a3\u00a1\3\2\2\2"+
		"\u00a4\u00a5\7\22\2\2\u00a5\u00a6\5\"\22\2\u00a6\u00a7\7\23\2\2\u00a7"+
		"\u00ad\3\2\2\2\u00a8\u00a9\7\22\2\2\u00a9\u00aa\5$\23\2\u00aa\u00ab\7"+
		"\23\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00a4\3\2\2\2\u00ac\u00a8\3\2\2\2\u00ad"+
		"\'\3\2\2\2\20+\65AIOX`|\u0086\u008a\u008d\u0099\u00a1\u00ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}