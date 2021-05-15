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
		T__0=1, T__1=2, T__2=3, OR=4, AND=5, EQ=6, NEQ=7, GT=8, LT=9, GTEQ=10, 
		LTEQ=11, PLUS=12, MINUS=13, MULT=14, DIV=15, MOD=16, NOT=17, SCOL=18, 
		ASSIGN=19, OPAR=20, CPAR=21, OBRACE=22, CBRACE=23, TRUE=24, FALSE=25, 
		NIL=26, AANENKIL=27, ATHAVA=28, ALLENKIL=29, AAYIRIKKUMPOL=30, LOG=31, 
		ID=32, INT=33, FLOAT=34, STRING=35, COMMENT=36, SPACE=37, OTHER=38;
	public static final int
		RULE_parse = 0, RULE_statemets = 1, RULE_stat = 2, RULE_block = 3, RULE_samkhyaFunction = 4, 
		RULE_samkhyaExpr = 5, RULE_assignment = 6, RULE_if_stat = 7, RULE_athavaBlock = 8, 
		RULE_allenkilBlock = 9, RULE_while_stat = 10, RULE_log = 11, RULE_sweekarikkukaStatement = 12, 
		RULE_sweekarikkukaExpr = 13, RULE_expr = 14, RULE_atom = 15, RULE_parathesisedExpr = 16, 
		RULE_integerAtom = 17, RULE_floatAtom = 18, RULE_booleanAtom = 19, RULE_identifier = 20, 
		RULE_string = 21, RULE_nil = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "statemets", "stat", "block", "samkhyaFunction", "samkhyaExpr", 
			"assignment", "if_stat", "athavaBlock", "allenkilBlock", "while_stat", 
			"log", "sweekarikkukaStatement", "sweekarikkukaExpr", "expr", "atom", 
			"parathesisedExpr", "integerAtom", "floatAtom", "booleanAtom", "identifier", 
			"string", "nil"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\u0D38\u0D02\u0D16\u0D4D\u0D2F'", "','", "'\u0D38\u0D4D\u0D35\u0D40\u0D15\u0D30\u0D3F\u0D15\u0D4D\u0D15\u0D41\u0D15'", 
			"'||'", "'&&'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'!'", "';'", "'='", "'('", "')'", "'{'", 
			"'}'", "'true'", "'false'", "'nil'", "'\u0D06\u0D23\u0D46\u0D19\u0D4D\u0D15\u0D3F\u0D32\u0D4D\u200D'", 
			"'\u0D05\u0D25\u0D35\u0D3E'", "'\u0D05\u0D32\u0D4D\u0D32\u0D46\u0D19\u0D4D\u0D15\u0D3F\u0D32\u0D4D\u200D'", 
			"'\u0D06\u0D2F\u0D3F\u0D30\u0D3F\u0D15\u0D4D\u0D15\u0D41\u0D2E\u0D4D\u0D2A\u0D4B\u0D33\u0D4D\u200D'", 
			"'\u0D2A\u0D24\u0D3F\u0D15\u0D4D\u0D15\u0D41\u0D15'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "OR", "AND", "EQ", "NEQ", "GT", "LT", "GTEQ", 
			"LTEQ", "PLUS", "MINUS", "MULT", "DIV", "MOD", "NOT", "SCOL", "ASSIGN", 
			"OPAR", "CPAR", "OBRACE", "CBRACE", "TRUE", "FALSE", "NIL", "AANENKIL", 
			"ATHAVA", "ALLENKIL", "AAYIRIKKUMPOL", "LOG", "ID", "INT", "FLOAT", "STRING", 
			"COMMENT", "SPACE", "OTHER"
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
			setState(46);
			statemets();
			setState(47);
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
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(49);
				stat();
				}
				}
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << MINUS) | (1L << NOT) | (1L << OPAR) | (1L << OBRACE) | (1L << TRUE) | (1L << FALSE) | (1L << NIL) | (1L << LOG) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << OTHER))) != 0) );
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
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				if_stat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				while_stat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(58);
				log();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(59);
				sweekarikkukaStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(60);
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
			setState(64);
			match(OBRACE);
			setState(65);
			statemets();
			setState(66);
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
		enterRule(_localctx, 8, RULE_samkhyaFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__0);
			setState(69);
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
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
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
		enterRule(_localctx, 10, RULE_samkhyaExpr);
		int _la;
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new DirectSamkhyaCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(OPAR);
				setState(74);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(72);
					string();
					}
					break;
				case ID:
					{
					setState(73);
					identifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(76);
					match(T__1);
					setState(77);
					integerAtom();
					}
				}

				setState(80);
				match(CPAR);
				}
				break;
			case 2:
				_localctx = new SamkhyaSweekarikkukaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(OPAR);
				setState(83);
				sweekarikkukaExpr();
				setState(84);
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
		public TerminalNode ID() { return getToken(BasicLangParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(BasicLangParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(BasicLangParser.SCOL, 0); }
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
		enterRule(_localctx, 12, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(ID);
			setState(89);
			match(ASSIGN);
			setState(90);
			expr(0);
			setState(91);
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
		enterRule(_localctx, 14, RULE_if_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			expr(0);
			setState(94);
			match(AANENKIL);
			setState(95);
			block();
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ATHAVA) {
				{
				{
				setState(96);
				athavaBlock();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALLENKIL) {
				{
				setState(102);
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
		enterRule(_localctx, 16, RULE_athavaBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(ATHAVA);
			setState(106);
			expr(0);
			setState(107);
			match(AANENKIL);
			setState(108);
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
		enterRule(_localctx, 18, RULE_allenkilBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(ALLENKIL);
			setState(111);
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
		enterRule(_localctx, 20, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			expr(0);
			setState(114);
			match(AAYIRIKKUMPOL);
			setState(115);
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
		enterRule(_localctx, 22, RULE_log);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(LOG);
			setState(118);
			match(OPAR);
			setState(119);
			expr(0);
			setState(120);
			match(CPAR);
			setState(121);
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
		enterRule(_localctx, 24, RULE_sweekarikkukaStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(123);
				match(ID);
				setState(124);
				match(ASSIGN);
				}
			}

			setState(127);
			sweekarikkukaExpr();
			setState(128);
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
		enterRule(_localctx, 26, RULE_sweekarikkukaExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__2);
			setState(131);
			match(OPAR);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << MINUS) | (1L << NOT) | (1L << OPAR) | (1L << TRUE) | (1L << FALSE) | (1L << NIL) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(132);
				expr(0);
				}
			}

			setState(135);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				_localctx = new UnaryMinusExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(138);
				match(MINUS);
				setState(139);
				expr(10);
				}
				break;
			case NOT:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(140);
				match(NOT);
				setState(141);
				expr(9);
				}
				break;
			case T__0:
				{
				_localctx = new SamkhyaFunctionExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142);
				samkhyaFunction();
				}
				break;
			case OPAR:
			case TRUE:
			case FALSE:
			case NIL:
			case ID:
			case INT:
			case FLOAT:
			case STRING:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(164);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(146);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(147);
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
						setState(148);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(149);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(150);
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
						setState(151);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(152);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(153);
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
						setState(154);
						expr(7);
						}
						break;
					case 4:
						{
						_localctx = new EqualityExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(155);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(156);
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
						setState(157);
						expr(6);
						}
						break;
					case 5:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(158);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(159);
						match(AND);
						setState(160);
						expr(5);
						}
						break;
					case 6:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(161);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(162);
						match(OR);
						setState(163);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		enterRule(_localctx, 30, RULE_atom);
		try {
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				parathesisedExpr();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				integerAtom();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				floatAtom();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				booleanAtom();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(173);
				identifier();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 6);
				{
				setState(174);
				string();
				}
				break;
			case NIL:
				enterOuterAlt(_localctx, 7);
				{
				setState(175);
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
		enterRule(_localctx, 32, RULE_parathesisedExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(OPAR);
			setState(179);
			expr(0);
			setState(180);
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
		enterRule(_localctx, 34, RULE_integerAtom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
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
		enterRule(_localctx, 36, RULE_floatAtom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
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
		enterRule(_localctx, 38, RULE_booleanAtom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
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
		enterRule(_localctx, 40, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
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
		enterRule(_localctx, 42, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
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
		enterRule(_localctx, 44, RULE_nil);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
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
		case 14:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00c5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\3\6\3\65\n\3\r\3\16\3\66\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4A\n\4"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\5\7M\n\7\3\7\3\7\5\7Q\n\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7Y\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t"+
		"d\n\t\f\t\16\tg\13\t\3\t\5\tj\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\5\16\u0080\n\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\5\17\u0088\n\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u0093\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00a7\n\20\f\20"+
		"\16\20\u00aa\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00b3\n\21"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\30\2\3\36\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,.\2\7\3\2\20\22\3\2\16\17\3\2\n\r\3\2\b\t\3\2\32\33\2\u00ca\2\60\3"+
		"\2\2\2\4\64\3\2\2\2\6@\3\2\2\2\bB\3\2\2\2\nF\3\2\2\2\fX\3\2\2\2\16Z\3"+
		"\2\2\2\20_\3\2\2\2\22k\3\2\2\2\24p\3\2\2\2\26s\3\2\2\2\30w\3\2\2\2\32"+
		"\177\3\2\2\2\34\u0084\3\2\2\2\36\u0092\3\2\2\2 \u00b2\3\2\2\2\"\u00b4"+
		"\3\2\2\2$\u00b8\3\2\2\2&\u00ba\3\2\2\2(\u00bc\3\2\2\2*\u00be\3\2\2\2,"+
		"\u00c0\3\2\2\2.\u00c2\3\2\2\2\60\61\5\4\3\2\61\62\7\2\2\3\62\3\3\2\2\2"+
		"\63\65\5\6\4\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2"+
		"\67\5\3\2\2\28A\5\b\5\29A\5\16\b\2:A\5\20\t\2;A\5\26\f\2<A\5\30\r\2=A"+
		"\5\32\16\2>?\7(\2\2?A\b\4\1\2@8\3\2\2\2@9\3\2\2\2@:\3\2\2\2@;\3\2\2\2"+
		"@<\3\2\2\2@=\3\2\2\2@>\3\2\2\2A\7\3\2\2\2BC\7\30\2\2CD\5\4\3\2DE\7\31"+
		"\2\2E\t\3\2\2\2FG\7\3\2\2GH\5\f\7\2H\13\3\2\2\2IL\7\26\2\2JM\5,\27\2K"+
		"M\5*\26\2LJ\3\2\2\2LK\3\2\2\2MP\3\2\2\2NO\7\4\2\2OQ\5$\23\2PN\3\2\2\2"+
		"PQ\3\2\2\2QR\3\2\2\2RS\7\27\2\2SY\3\2\2\2TU\7\26\2\2UV\5\34\17\2VW\7\27"+
		"\2\2WY\3\2\2\2XI\3\2\2\2XT\3\2\2\2Y\r\3\2\2\2Z[\7\"\2\2[\\\7\25\2\2\\"+
		"]\5\36\20\2]^\7\24\2\2^\17\3\2\2\2_`\5\36\20\2`a\7\35\2\2ae\5\b\5\2bd"+
		"\5\22\n\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fi\3\2\2\2ge\3\2\2\2"+
		"hj\5\24\13\2ih\3\2\2\2ij\3\2\2\2j\21\3\2\2\2kl\7\36\2\2lm\5\36\20\2mn"+
		"\7\35\2\2no\5\b\5\2o\23\3\2\2\2pq\7\37\2\2qr\5\b\5\2r\25\3\2\2\2st\5\36"+
		"\20\2tu\7 \2\2uv\5\b\5\2v\27\3\2\2\2wx\7!\2\2xy\7\26\2\2yz\5\36\20\2z"+
		"{\7\27\2\2{|\7\24\2\2|\31\3\2\2\2}~\7\"\2\2~\u0080\7\25\2\2\177}\3\2\2"+
		"\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\5\34\17\2\u0082\u0083"+
		"\7\24\2\2\u0083\33\3\2\2\2\u0084\u0085\7\5\2\2\u0085\u0087\7\26\2\2\u0086"+
		"\u0088\5\36\20\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3"+
		"\2\2\2\u0089\u008a\7\27\2\2\u008a\35\3\2\2\2\u008b\u008c\b\20\1\2\u008c"+
		"\u008d\7\17\2\2\u008d\u0093\5\36\20\f\u008e\u008f\7\23\2\2\u008f\u0093"+
		"\5\36\20\13\u0090\u0093\5\n\6\2\u0091\u0093\5 \21\2\u0092\u008b\3\2\2"+
		"\2\u0092\u008e\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093\u00a8"+
		"\3\2\2\2\u0094\u0095\f\n\2\2\u0095\u0096\t\2\2\2\u0096\u00a7\5\36\20\13"+
		"\u0097\u0098\f\t\2\2\u0098\u0099\t\3\2\2\u0099\u00a7\5\36\20\n\u009a\u009b"+
		"\f\b\2\2\u009b\u009c\t\4\2\2\u009c\u00a7\5\36\20\t\u009d\u009e\f\7\2\2"+
		"\u009e\u009f\t\5\2\2\u009f\u00a7\5\36\20\b\u00a0\u00a1\f\6\2\2\u00a1\u00a2"+
		"\7\7\2\2\u00a2\u00a7\5\36\20\7\u00a3\u00a4\f\5\2\2\u00a4\u00a5\7\6\2\2"+
		"\u00a5\u00a7\5\36\20\6\u00a6\u0094\3\2\2\2\u00a6\u0097\3\2\2\2\u00a6\u009a"+
		"\3\2\2\2\u00a6\u009d\3\2\2\2\u00a6\u00a0\3\2\2\2\u00a6\u00a3\3\2\2\2\u00a7"+
		"\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\37\3\2\2"+
		"\2\u00aa\u00a8\3\2\2\2\u00ab\u00b3\5\"\22\2\u00ac\u00b3\5$\23\2\u00ad"+
		"\u00b3\5&\24\2\u00ae\u00b3\5(\25\2\u00af\u00b3\5*\26\2\u00b0\u00b3\5,"+
		"\27\2\u00b1\u00b3\5.\30\2\u00b2\u00ab\3\2\2\2\u00b2\u00ac\3\2\2\2\u00b2"+
		"\u00ad\3\2\2\2\u00b2\u00ae\3\2\2\2\u00b2\u00af\3\2\2\2\u00b2\u00b0\3\2"+
		"\2\2\u00b2\u00b1\3\2\2\2\u00b3!\3\2\2\2\u00b4\u00b5\7\26\2\2\u00b5\u00b6"+
		"\5\36\20\2\u00b6\u00b7\7\27\2\2\u00b7#\3\2\2\2\u00b8\u00b9\7#\2\2\u00b9"+
		"%\3\2\2\2\u00ba\u00bb\7$\2\2\u00bb\'\3\2\2\2\u00bc\u00bd\t\6\2\2\u00bd"+
		")\3\2\2\2\u00be\u00bf\7\"\2\2\u00bf+\3\2\2\2\u00c0\u00c1\7%\2\2\u00c1"+
		"-\3\2\2\2\u00c2\u00c3\7\34\2\2\u00c3/\3\2\2\2\17\66@LPXei\177\u0087\u0092"+
		"\u00a6\u00a8\u00b2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}