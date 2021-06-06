// Generated from /home/akshay/IdeaProjects/BasicLang/BasicLang.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BasicLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, OR=6, AND=7, EQ=8, NEQ=9, GT=10, 
		LT=11, GTEQ=12, LTEQ=13, PLUS=14, MINUS=15, MULT=16, DIV=17, MOD=18, NOT=19, 
		SCOL=20, ASSIGN=21, OPAR=22, CPAR=23, OBRACE=24, CBRACE=25, OBRACKET=26, 
		CBRACKET=27, TRUE=28, FALSE=29, NIL=30, AANENKIL=31, ATHAVA=32, ALLENKIL=33, 
		AAYIRIKKUMPOL=34, LOG=35, ID=36, INT=37, FLOAT=38, STRING=39, COMMENT=40, 
		SPACE=41, OTHER=42;
	public static final int
		RULE_parse = 0, RULE_statemets = 1, RULE_stat = 2, RULE_block = 3, RULE_kadakkuPurath = 4, 
		RULE_samkhyaFunction = 5, RULE_samkhyaExpr = 6, RULE_assignment = 7, RULE_variableAssignment = 8, 
		RULE_shreniInitialisation = 9, RULE_elementList = 10, RULE_shreniElements = 11, 
		RULE_shreniElement = 12, RULE_if_stat = 13, RULE_athavaBlock = 14, RULE_allenkilBlock = 15, 
		RULE_while_stat = 16, RULE_log = 17, RULE_sweekarikkukaStatement = 18, 
		RULE_sweekarikkukaExpr = 19, RULE_expr = 20, RULE_shreniIndexed = 21, 
		RULE_shreniMultipleIndexed = 22, RULE_indexingExpr = 23, RULE_atom = 24, 
		RULE_parathesisedExpr = 25, RULE_integerAtom = 26, RULE_floatAtom = 27, 
		RULE_booleanAtom = 28, RULE_identifier = 29, RULE_string = 30, RULE_nil = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "statemets", "stat", "block", "kadakkuPurath", "samkhyaFunction", 
			"samkhyaExpr", "assignment", "variableAssignment", "shreniInitialisation", 
			"elementList", "shreniElements", "shreniElement", "if_stat", "athavaBlock", 
			"allenkilBlock", "while_stat", "log", "sweekarikkukaStatement", "sweekarikkukaExpr", 
			"expr", "shreniIndexed", "shreniMultipleIndexed", "indexingExpr", "atom", 
			"parathesisedExpr", "integerAtom", "floatAtom", "booleanAtom", "identifier", 
			"string", "nil"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\u0D15\u0D1F\u0D15\u0D4D\u0D15\u0D42\u0D2A\u0D41\u0D31\u0D24\u0D4D\u0D24\u0D4D'", 
			"'\u0D15\u0D1F\u0D15\u0D4D\u0D15\u0D42 \u0D2A\u0D41\u0D31\u0D24\u0D4D\u0D24\u0D4D'", 
			"'\u0D38\u0D02\u0D16\u0D4D\u0D2F'", "','", "'\u0D38\u0D4D\u0D35\u0D40\u0D15\u0D30\u0D3F\u0D15\u0D4D\u0D15\u0D41\u0D15'", 
			"'||'", "'&&'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'!'", "';'", "'='", "'('", "')'", "'{'", 
			"'}'", "'['", "']'", "'true'", "'false'", "'nil'", "'\u0D06\u0D23\u0D46\u0D19\u0D4D\u0D15\u0D3F\u0D32\u0D4D\u200D'", 
			"'\u0D05\u0D25\u0D35\u0D3E'", "'\u0D05\u0D32\u0D4D\u0D32\u0D46\u0D19\u0D4D\u0D15\u0D3F\u0D32\u0D4D\u200D'", 
			"'\u0D06\u0D2F\u0D3F\u0D30\u0D3F\u0D15\u0D4D\u0D15\u0D41\u0D2E\u0D4D\u0D2A\u0D4B\u0D33\u0D4D\u200D'", 
			"'\u0D2A\u0D24\u0D3F\u0D15\u0D4D\u0D15\u0D41\u0D15'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "OR", "AND", "EQ", "NEQ", "GT", "LT", 
			"GTEQ", "LTEQ", "PLUS", "MINUS", "MULT", "DIV", "MOD", "NOT", "SCOL", 
			"ASSIGN", "OPAR", "CPAR", "OBRACE", "CBRACE", "OBRACKET", "CBRACKET", 
			"TRUE", "FALSE", "NIL", "AANENKIL", "ATHAVA", "ALLENKIL", "AAYIRIKKUMPOL", 
			"LOG", "ID", "INT", "FLOAT", "STRING", "COMMENT", "SPACE", "OTHER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "BasicLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BasicLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public StatemetsContext statemets() {
			return getRuleContext(StatemetsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(BasicLangParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicLangVisitor ) return ((BasicLangVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			statemets();
			setState(65);
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

	public static class StatemetsContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public StatemetsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statemets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).enterStatemets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).exitStatemets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicLangVisitor ) return ((BasicLangVisitor<? extends T>)visitor).visitStatemets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatemetsContext statemets() throws RecognitionException {
		StatemetsContext _localctx = new StatemetsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statemets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(67);
				stat();
				}
				}
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << MINUS) | (1L << NOT) | (1L << OPAR) | (1L << OBRACE) | (1L << TRUE) | (1L << FALSE) | (1L << NIL) | (1L << LOG) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << OTHER))) != 0) );
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

	public static class StatContext extends ParserRuleContext {
		public Token OTHER;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public While_statContext while_stat() {
			return getRuleContext(While_statContext.class,0);
		}
		public LogContext log() {
			return getRuleContext(LogContext.class,0);
		}
		public KadakkuPurathContext kadakkuPurath() {
			return getRuleContext(KadakkuPurathContext.class,0);
		}
		public SweekarikkukaStatementContext sweekarikkukaStatement() {
			return getRuleContext(SweekarikkukaStatementContext.class,0);
		}
		public TerminalNode OTHER() { return getToken(BasicLangParser.OTHER, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicLangVisitor ) return ((BasicLangVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				if_stat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				while_stat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				log();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(77);
				kadakkuPurath();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(78);
				sweekarikkukaStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(79);
				((StatContext)_localctx).OTHER = match(OTHER);
				System.err.println("unknown char: " + (((StatContext)_localctx).OTHER!=null?((StatContext)_localctx).OTHER.getText():null));
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OBRACE() { return getToken(BasicLangParser.OBRACE, 0); }
		public StatemetsContext statemets() {
			return getRuleContext(StatemetsContext.class,0);
		}
		public TerminalNode CBRACE() { return getToken(BasicLangParser.CBRACE, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicLangVisitor ) return ((BasicLangVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(OBRACE);
			setState(84);
			statemets();
			setState(85);
			match(CBRACE);
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

	public static class KadakkuPurathContext extends ParserRuleContext {
		public TerminalNode SCOL() { return getToken(BasicLangParser.SCOL, 0); }
		public KadakkuPurathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kadakkuPurath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).enterKadakkuPurath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).exitKadakkuPurath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicLangVisitor ) return ((BasicLangVisitor<? extends T>)visitor).visitKadakkuPurath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KadakkuPurathContext kadakkuPurath() throws RecognitionException {
		KadakkuPurathContext _localctx = new KadakkuPurathContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_kadakkuPurath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(88);
			match(SCOL);
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

	public static class SamkhyaFunctionContext extends ParserRuleContext {
		public SamkhyaExprContext samkhyaExpr() {
			return getRuleContext(SamkhyaExprContext.class,0);
		}
		public SamkhyaFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_samkhyaFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).enterSamkhyaFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).exitSamkhyaFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicLangVisitor ) return ((BasicLangVisitor<? extends T>)visitor).visitSamkhyaFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SamkhyaFunctionContext samkhyaFunction() throws RecognitionException {
		SamkhyaFunctionContext _localctx = new SamkhyaFunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_samkhyaFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__2);
			setState(91);
			samkhyaExpr();
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

	public static class SamkhyaExprContext extends ParserRuleContext {
		public SamkhyaExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_samkhyaExpr; }
	 
		public SamkhyaExprContext() { }
		public void copyFrom(SamkhyaExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SamkhyaSweekarikkukaContext extends SamkhyaExprContext {
		public TerminalNode OPAR() { return getToken(BasicLangParser.OPAR, 0); }
		public SweekarikkukaExprContext sweekarikkukaExpr() {
			return getRuleContext(SweekarikkukaExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(BasicLangParser.CPAR, 0); }
		public SamkhyaSweekarikkukaContext(SamkhyaExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).enterSamkhyaSweekarikkuka(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).exitSamkhyaSweekarikkuka(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicLangVisitor ) return ((BasicLangVisitor<? extends T>)visitor).visitSamkhyaSweekarikkuka(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DirectSamkhyaCallContext extends SamkhyaExprContext {
		public TerminalNode OPAR() { return getToken(BasicLangParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(BasicLangParser.CPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IntegerAtomContext integerAtom() {
			return getRuleContext(IntegerAtomContext.class,0);
		}
		public DirectSamkhyaCallContext(SamkhyaExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).enterDirectSamkhyaCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).exitDirectSamkhyaCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicLangVisitor ) return ((BasicLangVisitor<? extends T>)visitor).visitDirectSamkhyaCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SamkhyaExprContext samkhyaExpr() throws RecognitionException {
		SamkhyaExprContext _localctx = new SamkhyaExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_samkhyaExpr);
		int _la;
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new DirectSamkhyaCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(OPAR);
				setState(96);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(94);
					expr(0);
					}
					break;
				case 2:
					{
					setState(95);
					identifier();
					}
					break;
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(98);
					match(T__3);
					setState(99);
					integerAtom();
					}
				}

				setState(102);
				match(CPAR);
				}
				break;
			case 2:
				_localctx = new SamkhyaSweekarikkukaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(OPAR);
				setState(105);
				sweekarikkukaExpr();
				setState(106);
				match(CPAR);
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

	public static class AssignmentContext extends ParserRuleContext {
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public ShreniInitialisationContext shreniInitialisation() {
			return getRuleContext(ShreniInitialisationContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicLangVisitor ) return ((BasicLangVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignment);
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				variableAssignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				shreniInitialisation();
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

	public static class VariableAssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BasicLangParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(BasicLangParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(BasicLangParser.SCOL, 0); }
		public VariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).enterVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).exitVariableAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicLangVisitor ) return ((BasicLangVisitor<? extends T>)visitor).visitVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAssignmentContext variableAssignment() throws RecognitionException {
		VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variableAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(ID);
			setState(115);
			match(ASSIGN);
			setState(116);
			expr(0);
			setState(117);
			match(SCOL);
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

	public static class ShreniInitialisationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BasicLangParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(BasicLangParser.ASSIGN, 0); }
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(BasicLangParser.SCOL, 0); }
		public ShreniInitialisationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shreniInitialisation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).enterShreniInitialisation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).exitShreniInitialisation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicLangVisitor ) return ((BasicLangVisitor<? extends T>)visitor).visitShreniInitialisation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShreniInitialisationContext shreniInitialisation() throws RecognitionException {
		ShreniInitialisationContext _localctx = new ShreniInitialisationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_shreniInitialisation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(ID);
			setState(120);
			match(ASSIGN);
			setState(121);
			elementList();
			setState(122);
			match(SCOL);
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

	public static class ElementListContext extends ParserRuleContext {
		public TerminalNode OBRACKET() { return getToken(BasicLangParser.OBRACKET, 0); }
		public TerminalNode CBRACKET() { return getToken(BasicLangParser.CBRACKET, 0); }
		public ShreniElementsContext shreniElements() {
			return getRuleContext(ShreniElementsContext.class,0);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).enterElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).exitElementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicLangVisitor ) return ((BasicLangVisitor<? extends T>)visitor).visitElementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(OBRACKET);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBRACKET) | (1L << TRUE) | (1L << FALSE) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(125);
				shreniElements();
				}
			}

			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(128);
				match(T__3);
				}
			}

			setState(131);
			match(CBRACKET);
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

	public static class ShreniElementsContext extends ParserRuleContext {
		public List<ShreniElementContext> shreniElement() {
			return getRuleContexts(ShreniElementContext.class);
		}
		public ShreniElementContext shreniElement(int i) {
			return getRuleContext(ShreniElementContext.class,i);
		}
		public ShreniElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shreniElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).enterShreniElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).exitShreniElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicLangVisitor ) return ((BasicLangVisitor<? extends T>)visitor).visitShreniElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShreniElementsContext shreniElements() throws RecognitionException {
		ShreniElementsContext _localctx = new ShreniElementsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_shreniElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			shreniElement();
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(134);
					match(T__3);
					setState(135);
					shreniElement();
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class ShreniElementContext extends ParserRuleContext {
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public IntegerAtomContext integerAtom() {
			return getRuleContext(IntegerAtomContext.class,0);
		}
		public FloatAtomContext floatAtom() {
			return getRuleContext(FloatAtomContext.class,0);
		}
		public BooleanAtomContext booleanAtom() {
			return getRuleContext(BooleanAtomContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ShreniElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shreniElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).enterShreniElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).exitShreniElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicLangVisitor ) return ((BasicLangVisitor<? extends T>)visitor).visitShreniElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShreniElementContext shreniElement() throws RecognitionException {
		ShreniElementContext _localctx = new ShreniElementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_shreniElement);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				elementList();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				integerAtom();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				floatAtom();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				booleanAtom();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(145);
				string();
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

	public static class If_statContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AANENKIL() { return getToken(BasicLangParser.AANENKIL, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<AthavaBlockContext> athavaBlock() {
			return getRuleContexts(AthavaBlockContext.class);
		}
		public AthavaBlockContext athavaBlock(int i) {
			return getRuleContext(AthavaBlockContext.class,i);
		}
		public AllenkilBlockContext allenkilBlock() {
			return getRuleContext(AllenkilBlockContext.class,0);
		}
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).enterIf_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).exitIf_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicLangVisitor ) return ((BasicLangVisitor<? extends T>)visitor).visitIf_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_if_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			expr(0);
			setState(149);
			match(AANENKIL);
			setState(150);
			block();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ATHAVA) {
				{
				{
				setState(151);
				athavaBlock();
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALLENKIL) {
				{
				setState(157);
				allenkilBlock();
				}
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

	public static class AthavaBlockContext extends ParserRuleContext {
		public TerminalNode ATHAVA() { return getToken(BasicLangParser.ATHAVA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AANENKIL() { return getToken(BasicLangParser.AANENKIL, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AthavaBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_athavaBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).enterAthavaBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).exitAthavaBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicLangVisitor ) return ((BasicLangVisitor<? extends T>)visitor).visitAthavaBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AthavaBlockContext athavaBlock() throws RecognitionException {
		AthavaBlockContext _localctx = new AthavaBlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_athavaBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(ATHAVA);
			setState(161);
			expr(0);
			setState(162);
			match(AANENKIL);
			setState(163);
			block();
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

	public static class AllenkilBlockContext extends ParserRuleContext {
		public TerminalNode ALLENKIL() { return getToken(BasicLangParser.ALLENKIL, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AllenkilBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allenkilBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).enterAllenkilBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).exitAllenkilBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicLangVisitor ) return ((BasicLangVisitor<? extends T>)visitor).visitAllenkilBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllenkilBlockContext allenkilBlock() throws RecognitionException {
		AllenkilBlockContext _localctx = new AllenkilBlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_allenkilBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(ALLENKIL);
			setState(166);
			block();
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

	public static class While_statContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AAYIRIKKUMPOL() { return getToken(BasicLangParser.AAYIRIKKUMPOL, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).enterWhile_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).exitWhile_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicLangVisitor ) return ((BasicLangVisitor<? extends T>)visitor).visitWhile_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statContext while_stat() throws RecognitionException {
		While_statContext _localctx = new While_statContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			expr(0);
			setState(169);
			match(AAYIRIKKUMPOL);
			setState(170);
			block();
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

	public static class LogContext extends ParserRuleContext {
		public TerminalNode LOG() { return getToken(BasicLangParser.LOG, 0); }
		public TerminalNode OPAR() { return getToken(BasicLangParser.OPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(BasicLangParser.CPAR, 0); }
		public TerminalNode SCOL() { return getToken(BasicLangParser.SCOL, 0); }
		public LogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).enterLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).exitLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicLangVisitor ) return ((BasicLangVisitor<? extends T>)visitor).visitLog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogContext log() throws RecognitionException {
		LogContext _localctx = new LogContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_log);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(LOG);
			setState(173);
			match(OPAR);
			setState(174);
			expr(0);
			setState(175);
			match(CPAR);
			setState(176);
			match(SCOL);
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

	public static class SweekarikkukaStatementContext extends ParserRuleContext {
		public SweekarikkukaExprContext sweekarikkukaExpr() {
			return getRuleContext(SweekarikkukaExprContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(BasicLangParser.SCOL, 0); }
		public TerminalNode ID() { return getToken(BasicLangParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(BasicLangParser.ASSIGN, 0); }
		public SweekarikkukaStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sweekarikkukaStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).enterSweekarikkukaStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).exitSweekarikkukaStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicLangVisitor ) return ((BasicLangVisitor<? extends T>)visitor).visitSweekarikkukaStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SweekarikkukaStatementContext sweekarikkukaStatement() throws RecognitionException {
		SweekarikkukaStatementContext _localctx = new SweekarikkukaStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_sweekarikkukaStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(178);
				match(ID);
				setState(179);
				match(ASSIGN);
				}
			}

			setState(182);
			sweekarikkukaExpr();
			setState(183);
			match(SCOL);
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

	public static class SweekarikkukaExprContext extends ParserRuleContext {
		public TerminalNode OPAR() { return getToken(BasicLangParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(BasicLangParser.CPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SweekarikkukaExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sweekarikkukaExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).enterSweekarikkukaExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).exitSweekarikkukaExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicLangVisitor ) return ((BasicLangVisitor<? extends T>)visitor).visitSweekarikkukaExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SweekarikkukaExprContext sweekarikkukaExpr() throws RecognitionException {
		SweekarikkukaExprContext _localctx = new SweekarikkukaExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_sweekarikkukaExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(T__4);
			setState(186);
			match(OPAR);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << MINUS) | (1L << NOT) | (1L << OPAR) | (1L << TRUE) | (1L << FALSE) | (1L << NIL) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(187);
				expr(0);
				}
			}

			setState(190);
			match(CPAR);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotExprContext extends ExprContext {
		public TerminalNode NOT() { return getToken(BasicLangParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).exitNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicLangVisitor ) return ((BasicLangVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryMinusExprContext extends ExprContext {
		public TerminalNode MINUS() { return getToken(BasicLangParser.MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryMinusExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).enterUnaryMinusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).exitUnaryMinusExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicLangVisitor ) return ((BasicLangVisitor<? extends T>)visitor).visitUnaryMinusExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SamkhyaFunctionExprContext extends ExprContext {
		public SamkhyaFunctionContext samkhyaFunction() {
			return getRuleContext(SamkhyaFunctionContext.class,0);
		}
		public SamkhyaFunctionExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).enterSamkhyaFunctionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).exitSamkhyaFunctionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicLangVisitor ) return ((BasicLangVisitor<? extends T>)visitor).visitSamkhyaFunctionExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(BasicLangParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(BasicLangParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(BasicLangParser.MOD, 0); }
		public MultiplicationExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).enterMultiplicationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).exitMultiplicationExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicLangVisitor ) return ((BasicLangVisitor<? extends T>)visitor).visitMultiplicationExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomExprContext extends ExprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).enterAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).exitAtomExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicLangVisitor ) return ((BasicLangVisitor<? extends T>)visitor).visitAtomExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(BasicLangParser.OR, 0); }
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicLangVisitor ) return ((BasicLangVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShreniMultipleIndexedExprContext extends ExprContext {
		public ShreniMultipleIndexedContext shreniMultipleIndexed() {
			return getRuleContext(ShreniMultipleIndexedContext.class,0);
		}
		public ShreniMultipleIndexedExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).enterShreniMultipleIndexedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).exitShreniMultipleIndexedExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicLangVisitor ) return ((BasicLangVisitor<? extends T>)visitor).visitShreniMultipleIndexedExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditiveExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(BasicLangParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(BasicLangParser.MINUS, 0); }
		public AdditiveExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).enterAdditiveExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).exitAdditiveExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicLangVisitor ) return ((BasicLangVisitor<? extends T>)visitor).visitAdditiveExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShreniIndexedExprContext extends ExprContext {
		public ShreniIndexedContext shreniIndexed() {
			return getRuleContext(ShreniIndexedContext.class,0);
		}
		public ShreniIndexedExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).enterShreniIndexedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).exitShreniIndexedExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicLangVisitor ) return ((BasicLangVisitor<? extends T>)visitor).visitShreniIndexedExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LTEQ() { return getToken(BasicLangParser.LTEQ, 0); }
		public TerminalNode GTEQ() { return getToken(BasicLangParser.GTEQ, 0); }
		public TerminalNode LT() { return getToken(BasicLangParser.LT, 0); }
		public TerminalNode GT() { return getToken(BasicLangParser.GT, 0); }
		public RelationalExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).enterRelationalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).exitRelationalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicLangVisitor ) return ((BasicLangVisitor<? extends T>)visitor).visitRelationalExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(BasicLangParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(BasicLangParser.NEQ, 0); }
		public EqualityExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).enterEqualityExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).exitEqualityExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicLangVisitor ) return ((BasicLangVisitor<? extends T>)visitor).visitEqualityExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(BasicLangParser.AND, 0); }
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicLangVisitor ) return ((BasicLangVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryMinusExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(193);
				match(MINUS);
				setState(194);
				expr(12);
				}
				break;
			case 2:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(195);
				match(NOT);
				setState(196);
				expr(11);
				}
				break;
			case 3:
				{
				_localctx = new SamkhyaFunctionExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(197);
				samkhyaFunction();
				}
				break;
			case 4:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(198);
				atom();
				}
				break;
			case 5:
				{
				_localctx = new ShreniIndexedExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199);
				shreniIndexed();
				}
				break;
			case 6:
				{
				_localctx = new ShreniMultipleIndexedExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(200);
				shreniMultipleIndexed();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(221);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(203);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(204);
						((MultiplicationExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((MultiplicationExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(205);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(206);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(207);
						((AdditiveExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AdditiveExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(208);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(209);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(210);
						((RelationalExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GTEQ) | (1L << LTEQ))) != 0)) ) {
							((RelationalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(211);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new EqualityExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(212);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(213);
						((EqualityExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
							((EqualityExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(214);
						expr(8);
						}
						break;
					case 5:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(215);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(216);
						match(AND);
						setState(217);
						expr(7);
						}
						break;
					case 6:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(218);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(219);
						match(OR);
						setState(220);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class ShreniIndexedContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IndexingExprContext indexingExpr() {
			return getRuleContext(IndexingExprContext.class,0);
		}
		public ShreniIndexedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shreniIndexed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).enterShreniIndexed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).exitShreniIndexed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicLangVisitor ) return ((BasicLangVisitor<? extends T>)visitor).visitShreniIndexed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShreniIndexedContext shreniIndexed() throws RecognitionException {
		ShreniIndexedContext _localctx = new ShreniIndexedContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_shreniIndexed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			identifier();
			setState(227);
			indexingExpr();
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

	public static class ShreniMultipleIndexedContext extends ParserRuleContext {
		public ShreniIndexedContext shreniIndexed() {
			return getRuleContext(ShreniIndexedContext.class,0);
		}
		public List<IndexingExprContext> indexingExpr() {
			return getRuleContexts(IndexingExprContext.class);
		}
		public IndexingExprContext indexingExpr(int i) {
			return getRuleContext(IndexingExprContext.class,i);
		}
		public ShreniMultipleIndexedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shreniMultipleIndexed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).enterShreniMultipleIndexed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).exitShreniMultipleIndexed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicLangVisitor ) return ((BasicLangVisitor<? extends T>)visitor).visitShreniMultipleIndexed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShreniMultipleIndexedContext shreniMultipleIndexed() throws RecognitionException {
		ShreniMultipleIndexedContext _localctx = new ShreniMultipleIndexedContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_shreniMultipleIndexed);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			shreniIndexed();
			setState(231); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(230);
					indexingExpr();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(233); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class IndexingExprContext extends ParserRuleContext {
		public TerminalNode OBRACKET() { return getToken(BasicLangParser.OBRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CBRACKET() { return getToken(BasicLangParser.CBRACKET, 0); }
		public IndexingExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexingExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).enterIndexingExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).exitIndexingExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicLangVisitor ) return ((BasicLangVisitor<? extends T>)visitor).visitIndexingExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexingExprContext indexingExpr() throws RecognitionException {
		IndexingExprContext _localctx = new IndexingExprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_indexingExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(OBRACKET);
			setState(236);
			expr(0);
			setState(237);
			match(CBRACKET);
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

	public static class AtomContext extends ParserRuleContext {
		public ParathesisedExprContext parathesisedExpr() {
			return getRuleContext(ParathesisedExprContext.class,0);
		}
		public IntegerAtomContext integerAtom() {
			return getRuleContext(IntegerAtomContext.class,0);
		}
		public FloatAtomContext floatAtom() {
			return getRuleContext(FloatAtomContext.class,0);
		}
		public BooleanAtomContext booleanAtom() {
			return getRuleContext(BooleanAtomContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public NilContext nil() {
			return getRuleContext(NilContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicLangVisitor ) return ((BasicLangVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_atom);
		try {
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				parathesisedExpr();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				integerAtom();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				floatAtom();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(242);
				booleanAtom();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(243);
				identifier();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 6);
				{
				setState(244);
				string();
				}
				break;
			case NIL:
				enterOuterAlt(_localctx, 7);
				{
				setState(245);
				nil();
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

	public static class ParathesisedExprContext extends ParserRuleContext {
		public TerminalNode OPAR() { return getToken(BasicLangParser.OPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(BasicLangParser.CPAR, 0); }
		public ParathesisedExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parathesisedExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).enterParathesisedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).exitParathesisedExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicLangVisitor ) return ((BasicLangVisitor<? extends T>)visitor).visitParathesisedExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParathesisedExprContext parathesisedExpr() throws RecognitionException {
		ParathesisedExprContext _localctx = new ParathesisedExprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_parathesisedExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(OPAR);
			setState(249);
			expr(0);
			setState(250);
			match(CPAR);
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

	public static class IntegerAtomContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(BasicLangParser.INT, 0); }
		public IntegerAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).enterIntegerAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).exitIntegerAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicLangVisitor ) return ((BasicLangVisitor<? extends T>)visitor).visitIntegerAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerAtomContext integerAtom() throws RecognitionException {
		IntegerAtomContext _localctx = new IntegerAtomContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_integerAtom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(INT);
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

	public static class FloatAtomContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(BasicLangParser.FLOAT, 0); }
		public FloatAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).enterFloatAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).exitFloatAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicLangVisitor ) return ((BasicLangVisitor<? extends T>)visitor).visitFloatAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatAtomContext floatAtom() throws RecognitionException {
		FloatAtomContext _localctx = new FloatAtomContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_floatAtom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(FLOAT);
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

	public static class BooleanAtomContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(BasicLangParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(BasicLangParser.FALSE, 0); }
		public BooleanAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).enterBooleanAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).exitBooleanAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicLangVisitor ) return ((BasicLangVisitor<? extends T>)visitor).visitBooleanAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanAtomContext booleanAtom() throws RecognitionException {
		BooleanAtomContext _localctx = new BooleanAtomContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_booleanAtom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BasicLangParser.ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicLangVisitor ) return ((BasicLangVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(ID);
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(BasicLangParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicLangVisitor ) return ((BasicLangVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(STRING);
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

	public static class NilContext extends ParserRuleContext {
		public TerminalNode NIL() { return getToken(BasicLangParser.NIL, 0); }
		public NilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nil; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).enterNil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLangListener ) ((BasicLangListener)listener).exitNil(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicLangVisitor ) return ((BasicLangVisitor<? extends T>)visitor).visitNil(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NilContext nil() throws RecognitionException {
		NilContext _localctx = new NilContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_nil);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(NIL);
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
		case 20:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u010b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\3\6\3G\n\3\r\3\16\3H\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4T\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\5\b"+
		"c\n\b\3\b\3\b\5\bg\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bo\n\b\3\t\3\t\5\ts\n"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\5\f\u0081\n\f"+
		"\3\f\5\f\u0084\n\f\3\f\3\f\3\r\3\r\3\r\7\r\u008b\n\r\f\r\16\r\u008e\13"+
		"\r\3\16\3\16\3\16\3\16\3\16\5\16\u0095\n\16\3\17\3\17\3\17\3\17\7\17\u009b"+
		"\n\17\f\17\16\17\u009e\13\17\3\17\5\17\u00a1\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\5\24\u00b7\n\24\3\24\3\24\3\24\3\25\3\25\3\25\5\25\u00bf\n"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00cc"+
		"\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\7\26\u00e0\n\26\f\26\16\26\u00e3\13\26\3\27"+
		"\3\27\3\27\3\30\3\30\6\30\u00ea\n\30\r\30\16\30\u00eb\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00f9\n\32\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\2\3*\"\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\b\3"+
		"\2\3\4\3\2\22\24\3\2\20\21\3\2\f\17\3\2\n\13\3\2\36\37\2\u0113\2B\3\2"+
		"\2\2\4F\3\2\2\2\6S\3\2\2\2\bU\3\2\2\2\nY\3\2\2\2\f\\\3\2\2\2\16n\3\2\2"+
		"\2\20r\3\2\2\2\22t\3\2\2\2\24y\3\2\2\2\26~\3\2\2\2\30\u0087\3\2\2\2\32"+
		"\u0094\3\2\2\2\34\u0096\3\2\2\2\36\u00a2\3\2\2\2 \u00a7\3\2\2\2\"\u00aa"+
		"\3\2\2\2$\u00ae\3\2\2\2&\u00b6\3\2\2\2(\u00bb\3\2\2\2*\u00cb\3\2\2\2,"+
		"\u00e4\3\2\2\2.\u00e7\3\2\2\2\60\u00ed\3\2\2\2\62\u00f8\3\2\2\2\64\u00fa"+
		"\3\2\2\2\66\u00fe\3\2\2\28\u0100\3\2\2\2:\u0102\3\2\2\2<\u0104\3\2\2\2"+
		">\u0106\3\2\2\2@\u0108\3\2\2\2BC\5\4\3\2CD\7\2\2\3D\3\3\2\2\2EG\5\6\4"+
		"\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\5\3\2\2\2JT\5\b\5\2KT\5\20"+
		"\t\2LT\5\34\17\2MT\5\"\22\2NT\5$\23\2OT\5\n\6\2PT\5&\24\2QR\7,\2\2RT\b"+
		"\4\1\2SJ\3\2\2\2SK\3\2\2\2SL\3\2\2\2SM\3\2\2\2SN\3\2\2\2SO\3\2\2\2SP\3"+
		"\2\2\2SQ\3\2\2\2T\7\3\2\2\2UV\7\32\2\2VW\5\4\3\2WX\7\33\2\2X\t\3\2\2\2"+
		"YZ\t\2\2\2Z[\7\26\2\2[\13\3\2\2\2\\]\7\5\2\2]^\5\16\b\2^\r\3\2\2\2_b\7"+
		"\30\2\2`c\5*\26\2ac\5<\37\2b`\3\2\2\2ba\3\2\2\2cf\3\2\2\2de\7\6\2\2eg"+
		"\5\66\34\2fd\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\7\31\2\2io\3\2\2\2jk\7\30\2"+
		"\2kl\5(\25\2lm\7\31\2\2mo\3\2\2\2n_\3\2\2\2nj\3\2\2\2o\17\3\2\2\2ps\5"+
		"\22\n\2qs\5\24\13\2rp\3\2\2\2rq\3\2\2\2s\21\3\2\2\2tu\7&\2\2uv\7\27\2"+
		"\2vw\5*\26\2wx\7\26\2\2x\23\3\2\2\2yz\7&\2\2z{\7\27\2\2{|\5\26\f\2|}\7"+
		"\26\2\2}\25\3\2\2\2~\u0080\7\34\2\2\177\u0081\5\30\r\2\u0080\177\3\2\2"+
		"\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0084\7\6\2\2\u0083\u0082"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\7\35\2\2"+
		"\u0086\27\3\2\2\2\u0087\u008c\5\32\16\2\u0088\u0089\7\6\2\2\u0089\u008b"+
		"\5\32\16\2\u008a\u0088\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2"+
		"\u008c\u008d\3\2\2\2\u008d\31\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0095"+
		"\5\26\f\2\u0090\u0095\5\66\34\2\u0091\u0095\58\35\2\u0092\u0095\5:\36"+
		"\2\u0093\u0095\5> \2\u0094\u008f\3\2\2\2\u0094\u0090\3\2\2\2\u0094\u0091"+
		"\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\33\3\2\2\2\u0096"+
		"\u0097\5*\26\2\u0097\u0098\7!\2\2\u0098\u009c\5\b\5\2\u0099\u009b\5\36"+
		"\20\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a1\5 "+
		"\21\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\35\3\2\2\2\u00a2\u00a3"+
		"\7\"\2\2\u00a3\u00a4\5*\26\2\u00a4\u00a5\7!\2\2\u00a5\u00a6\5\b\5\2\u00a6"+
		"\37\3\2\2\2\u00a7\u00a8\7#\2\2\u00a8\u00a9\5\b\5\2\u00a9!\3\2\2\2\u00aa"+
		"\u00ab\5*\26\2\u00ab\u00ac\7$\2\2\u00ac\u00ad\5\b\5\2\u00ad#\3\2\2\2\u00ae"+
		"\u00af\7%\2\2\u00af\u00b0\7\30\2\2\u00b0\u00b1\5*\26\2\u00b1\u00b2\7\31"+
		"\2\2\u00b2\u00b3\7\26\2\2\u00b3%\3\2\2\2\u00b4\u00b5\7&\2\2\u00b5\u00b7"+
		"\7\27\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2"+
		"\u00b8\u00b9\5(\25\2\u00b9\u00ba\7\26\2\2\u00ba\'\3\2\2\2\u00bb\u00bc"+
		"\7\7\2\2\u00bc\u00be\7\30\2\2\u00bd\u00bf\5*\26\2\u00be\u00bd\3\2\2\2"+
		"\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\7\31\2\2\u00c1)\3"+
		"\2\2\2\u00c2\u00c3\b\26\1\2\u00c3\u00c4\7\21\2\2\u00c4\u00cc\5*\26\16"+
		"\u00c5\u00c6\7\25\2\2\u00c6\u00cc\5*\26\r\u00c7\u00cc\5\f\7\2\u00c8\u00cc"+
		"\5\62\32\2\u00c9\u00cc\5,\27\2\u00ca\u00cc\5.\30\2\u00cb\u00c2\3\2\2\2"+
		"\u00cb\u00c5\3\2\2\2\u00cb\u00c7\3\2\2\2\u00cb\u00c8\3\2\2\2\u00cb\u00c9"+
		"\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00e1\3\2\2\2\u00cd\u00ce\f\f\2\2\u00ce"+
		"\u00cf\t\3\2\2\u00cf\u00e0\5*\26\r\u00d0\u00d1\f\13\2\2\u00d1\u00d2\t"+
		"\4\2\2\u00d2\u00e0\5*\26\f\u00d3\u00d4\f\n\2\2\u00d4\u00d5\t\5\2\2\u00d5"+
		"\u00e0\5*\26\13\u00d6\u00d7\f\t\2\2\u00d7\u00d8\t\6\2\2\u00d8\u00e0\5"+
		"*\26\n\u00d9\u00da\f\b\2\2\u00da\u00db\7\t\2\2\u00db\u00e0\5*\26\t\u00dc"+
		"\u00dd\f\7\2\2\u00dd\u00de\7\b\2\2\u00de\u00e0\5*\26\b\u00df\u00cd\3\2"+
		"\2\2\u00df\u00d0\3\2\2\2\u00df\u00d3\3\2\2\2\u00df\u00d6\3\2\2\2\u00df"+
		"\u00d9\3\2\2\2\u00df\u00dc\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2"+
		"\2\2\u00e1\u00e2\3\2\2\2\u00e2+\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5"+
		"\5<\37\2\u00e5\u00e6\5\60\31\2\u00e6-\3\2\2\2\u00e7\u00e9\5,\27\2\u00e8"+
		"\u00ea\5\60\31\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00e9\3"+
		"\2\2\2\u00eb\u00ec\3\2\2\2\u00ec/\3\2\2\2\u00ed\u00ee\7\34\2\2\u00ee\u00ef"+
		"\5*\26\2\u00ef\u00f0\7\35\2\2\u00f0\61\3\2\2\2\u00f1\u00f9\5\64\33\2\u00f2"+
		"\u00f9\5\66\34\2\u00f3\u00f9\58\35\2\u00f4\u00f9\5:\36\2\u00f5\u00f9\5"+
		"<\37\2\u00f6\u00f9\5> \2\u00f7\u00f9\5@!\2\u00f8\u00f1\3\2\2\2\u00f8\u00f2"+
		"\3\2\2\2\u00f8\u00f3\3\2\2\2\u00f8\u00f4\3\2\2\2\u00f8\u00f5\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\63\3\2\2\2\u00fa\u00fb\7\30\2"+
		"\2\u00fb\u00fc\5*\26\2\u00fc\u00fd\7\31\2\2\u00fd\65\3\2\2\2\u00fe\u00ff"+
		"\7\'\2\2\u00ff\67\3\2\2\2\u0100\u0101\7(\2\2\u01019\3\2\2\2\u0102\u0103"+
		"\t\7\2\2\u0103;\3\2\2\2\u0104\u0105\7&\2\2\u0105=\3\2\2\2\u0106\u0107"+
		"\7)\2\2\u0107?\3\2\2\2\u0108\u0109\7 \2\2\u0109A\3\2\2\2\25HSbfnr\u0080"+
		"\u0083\u008c\u0094\u009c\u00a0\u00b6\u00be\u00cb\u00df\u00e1\u00eb\u00f8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}