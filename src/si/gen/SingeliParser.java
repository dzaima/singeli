// Generated from Singeli.g4 by ANTLR 4.9.1
package si.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SingeliParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, NAME=34, SYMB=35, STR=36, INT=37, HEX=38, TINT=39, 
		THEX=40, DEC=41, F32=42, F64=43, REL=44, WS=45, COMMENT=46, LINE_COMMENT=47;
	public static final int
		RULE_texpr = 0, RULE_tinv = 1, RULE_callable = 2, RULE_expr = 3, RULE_stt = 4, 
		RULE_name2 = 5, RULE_targ = 6, RULE_treq = 7, RULE_targs = 8, RULE_arg = 9, 
		RULE_fn = 10, RULE_def = 11, RULE_export = 12, RULE_prog = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"texpr", "tinv", "callable", "expr", "stt", "name2", "targ", "treq", 
			"targs", "arg", "fn", "def", "export", "prog"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'{'", "','", "'}'", "'true'", "'false'", "'('", "')'", 
			"'*'", "'$'", "'['", "']'", "'/'", "'+'", "'-'", "'emit'", "'.'", "';'", 
			"'='", "'if'", "'else'", "'return'", "'while'", "'exec'", "'@'", "'for'", 
			"'over'", "'from'", "'to'", "'::'", "'&'", "'=>'", "'def'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "NAME", "SYMB", 
			"STR", "INT", "HEX", "TINT", "THEX", "DEC", "F32", "F64", "REL", "WS", 
			"COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "Singeli.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SingeliParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TexprContext extends ParserRuleContext {
		public Token dyn;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CallableContext callable() {
			return getRuleContext(CallableContext.class,0);
		}
		public TexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texpr; }
	}

	public final TexprContext texpr() throws RecognitionException {
		TexprContext _localctx = new TexprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_texpr);
		int _la;
		try {
			setState(33);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(28);
					((TexprContext)_localctx).dyn = match(T__0);
					}
				}

				setState(31);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				callable();
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

	public static class TinvContext extends ParserRuleContext {
		public List<TexprContext> texpr() {
			return getRuleContexts(TexprContext.class);
		}
		public TexprContext texpr(int i) {
			return getRuleContext(TexprContext.class,i);
		}
		public TinvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tinv; }
	}

	public final TinvContext tinv() throws RecognitionException {
		TinvContext _localctx = new TinvContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tinv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(T__1);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__15) | (1L << NAME) | (1L << INT) | (1L << HEX) | (1L << TINT) | (1L << THEX) | (1L << F32) | (1L << F64))) != 0)) {
				{
				setState(36);
				texpr();
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(37);
					match(T__2);
					setState(38);
					texpr();
					}
					}
					setState(43);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(46);
			match(T__3);
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

	public static class CallableContext extends ParserRuleContext {
		public Token n;
		public TinvContext t;
		public TerminalNode NAME() { return getToken(SingeliParser.NAME, 0); }
		public TinvContext tinv() {
			return getRuleContext(TinvContext.class,0);
		}
		public CallableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callable; }
	}

	public final CallableContext callable() throws RecognitionException {
		CallableContext _localctx = new CallableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_callable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			((CallableContext)_localctx).n = match(NAME);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(49);
				((CallableContext)_localctx).t = tinv();
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
	public static class GroupExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public GroupExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class IntExprContext extends ExprContext {
		public Token v;
		public TerminalNode INT() { return getToken(SingeliParser.INT, 0); }
		public IntExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class VecExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NAME() { return getToken(SingeliParser.NAME, 0); }
		public VecExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class TrueExprContext extends ExprContext {
		public TrueExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class DefCallExprContext extends ExprContext {
		public Token n;
		public TerminalNode NAME() { return getToken(SingeliParser.NAME, 0); }
		public List<TinvContext> tinv() {
			return getRuleContexts(TinvContext.class);
		}
		public TinvContext tinv(int i) {
			return getRuleContext(TinvContext.class,i);
		}
		public DefCallExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class F64ExprContext extends ExprContext {
		public Token v;
		public TerminalNode F64() { return getToken(SingeliParser.F64, 0); }
		public F64ExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class EmitExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode STR() { return getToken(SingeliParser.STR, 0); }
		public EmitExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class FvecExprContext extends ExprContext {
		public TerminalNode NAME() { return getToken(SingeliParser.NAME, 0); }
		public FvecExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class HexExprContext extends ExprContext {
		public Token v;
		public TerminalNode THEX() { return getToken(SingeliParser.THEX, 0); }
		public TerminalNode HEX() { return getToken(SingeliParser.HEX, 0); }
		public HexExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class PtrExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PtrExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class VarExprContext extends ExprContext {
		public Token v;
		public TerminalNode NAME() { return getToken(SingeliParser.NAME, 0); }
		public VarExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AddExprContext extends ExprContext {
		public ExprContext l;
		public Token ref;
		public ExprContext r;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class MulExprContext extends ExprContext {
		public ExprContext l;
		public Token ref;
		public ExprContext r;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MulExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class FldExprContext extends ExprContext {
		public ExprContext e;
		public Token n;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NAME() { return getToken(SingeliParser.NAME, 0); }
		public FldExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class FalseExprContext extends ExprContext {
		public FalseExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class CallExprContext extends ExprContext {
		public CallableContext callable() {
			return getRuleContext(CallableContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CallExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class RelExprContext extends ExprContext {
		public ExprContext l;
		public Token ref;
		public ExprContext r;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode REL() { return getToken(SingeliParser.REL, 0); }
		public RelExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class F32ExprContext extends ExprContext {
		public Token v;
		public TerminalNode F32() { return getToken(SingeliParser.F32, 0); }
		public F32ExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class TintExprContext extends ExprContext {
		public Token v;
		public TerminalNode TINT() { return getToken(SingeliParser.TINT, 0); }
		public TintExprContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new VarExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(53);
				((VarExprContext)_localctx).v = match(NAME);
				}
				break;
			case 2:
				{
				_localctx = new IntExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54);
				((IntExprContext)_localctx).v = match(INT);
				}
				break;
			case 3:
				{
				_localctx = new TintExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55);
				((TintExprContext)_localctx).v = match(TINT);
				}
				break;
			case 4:
				{
				_localctx = new HexExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56);
				((HexExprContext)_localctx).v = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==HEX || _la==THEX) ) {
					((HexExprContext)_localctx).v = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 5:
				{
				_localctx = new F32ExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(57);
				((F32ExprContext)_localctx).v = match(F32);
				}
				break;
			case 6:
				{
				_localctx = new F64ExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(58);
				((F64ExprContext)_localctx).v = match(F64);
				}
				break;
			case 7:
				{
				_localctx = new TrueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				match(T__4);
				}
				break;
			case 8:
				{
				_localctx = new FalseExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60);
				match(T__5);
				}
				break;
			case 9:
				{
				_localctx = new GroupExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				match(T__6);
				setState(62);
				expr(0);
				setState(63);
				match(T__7);
				}
				break;
			case 10:
				{
				_localctx = new PtrExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(65);
				match(T__8);
				setState(66);
				expr(10);
				}
				break;
			case 11:
				{
				_localctx = new FvecExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67);
				match(T__9);
				setState(68);
				match(NAME);
				}
				break;
			case 12:
				{
				_localctx = new VecExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(69);
				match(T__10);
				setState(70);
				expr(0);
				setState(71);
				match(T__11);
				setState(72);
				match(NAME);
				}
				break;
			case 13:
				{
				_localctx = new DefCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74);
				((DefCallExprContext)_localctx).n = match(NAME);
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(75);
						tinv();
						}
						} 
					}
					setState(80);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				}
				break;
			case 14:
				{
				_localctx = new CallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81);
				callable();
				setState(82);
				match(T__6);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__15) | (1L << NAME) | (1L << INT) | (1L << HEX) | (1L << TINT) | (1L << THEX) | (1L << F32) | (1L << F64))) != 0)) {
					{
					setState(83);
					expr(0);
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(84);
						match(T__2);
						setState(85);
						expr(0);
						}
						}
						setState(90);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(93);
				match(T__7);
				}
				break;
			case 15:
				{
				_localctx = new EmitExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				match(T__15);
				setState(96);
				expr(0);
				setState(97);
				match(STR);
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(98);
						expr(0);
						}
						} 
					}
					setState(103);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(118);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new MulExprContext(new ExprContext(_parentctx, _parentState));
						((MulExprContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(106);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(107);
						((MulExprContext)_localctx).ref = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__8 || _la==T__12) ) {
							((MulExprContext)_localctx).ref = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(108);
						((MulExprContext)_localctx).r = expr(6);
						}
						break;
					case 2:
						{
						_localctx = new AddExprContext(new ExprContext(_parentctx, _parentState));
						((AddExprContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(109);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(110);
						((AddExprContext)_localctx).ref = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__13 || _la==T__14) ) {
							((AddExprContext)_localctx).ref = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(111);
						((AddExprContext)_localctx).r = expr(5);
						}
						break;
					case 3:
						{
						_localctx = new RelExprContext(new ExprContext(_parentctx, _parentState));
						((RelExprContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(112);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(113);
						((RelExprContext)_localctx).ref = match(REL);
						setState(114);
						((RelExprContext)_localctx).r = expr(4);
						}
						break;
					case 4:
						{
						_localctx = new FldExprContext(new ExprContext(_parentctx, _parentState));
						((FldExprContext)_localctx).e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(115);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(116);
						match(T__16);
						setState(117);
						((FldExprContext)_localctx).n = match(NAME);
						}
						break;
					}
					} 
				}
				setState(122);
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

	public static class SttContext extends ParserRuleContext {
		public SttContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stt; }
	 
		public SttContext() { }
		public void copyFrom(SttContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfSttContext extends SttContext {
		public ExprContext c;
		public SttContext t;
		public SttContext f;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<SttContext> stt() {
			return getRuleContexts(SttContext.class);
		}
		public SttContext stt(int i) {
			return getRuleContext(SttContext.class,i);
		}
		public IfSttContext(SttContext ctx) { copyFrom(ctx); }
	}
	public static class RetnSttContext extends SttContext {
		public ExprContext e;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RetnSttContext(SttContext ctx) { copyFrom(ctx); }
	}
	public static class WhileSttContext extends SttContext {
		public ExprContext c;
		public SttContext t;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SttContext stt() {
			return getRuleContext(SttContext.class,0);
		}
		public WhileSttContext(SttContext ctx) { copyFrom(ctx); }
	}
	public static class ExprSttContext extends SttContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprSttContext(SttContext ctx) { copyFrom(ctx); }
	}
	public static class BlockSttContext extends SttContext {
		public List<SttContext> stt() {
			return getRuleContexts(SttContext.class);
		}
		public SttContext stt(int i) {
			return getRuleContext(SttContext.class,i);
		}
		public BlockSttContext(SttContext ctx) { copyFrom(ctx); }
	}
	public static class ForSttContext extends SttContext {
		public CallableContext c;
		public Token i;
		public ExprContext s;
		public ExprContext e;
		public SttContext stt() {
			return getRuleContext(SttContext.class,0);
		}
		public TerminalNode NAME() { return getToken(SingeliParser.NAME, 0); }
		public CallableContext callable() {
			return getRuleContext(CallableContext.class,0);
		}
		public List<Name2Context> name2() {
			return getRuleContexts(Name2Context.class);
		}
		public Name2Context name2(int i) {
			return getRuleContext(Name2Context.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ForSttContext(SttContext ctx) { copyFrom(ctx); }
	}
	public static class MvarSttContext extends SttContext {
		public Token k;
		public ExprContext v;
		public TerminalNode NAME() { return getToken(SingeliParser.NAME, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MvarSttContext(SttContext ctx) { copyFrom(ctx); }
	}
	public static class ExecSttContext extends SttContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NAME() { return getToken(SingeliParser.NAME, 0); }
		public ExecSttContext(SttContext ctx) { copyFrom(ctx); }
	}
	public static class NvarSttContext extends SttContext {
		public Token k;
		public ExprContext t;
		public ExprContext v;
		public TerminalNode NAME() { return getToken(SingeliParser.NAME, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public NvarSttContext(SttContext ctx) { copyFrom(ctx); }
	}

	public final SttContext stt() throws RecognitionException {
		SttContext _localctx = new SttContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stt);
		int _la;
		try {
			int _alt;
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new ExprSttContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				expr(0);
				setState(124);
				match(T__17);
				}
				break;
			case 2:
				_localctx = new NvarSttContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				((NvarSttContext)_localctx).k = match(NAME);
				setState(127);
				match(T__0);
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__15) | (1L << NAME) | (1L << INT) | (1L << HEX) | (1L << TINT) | (1L << THEX) | (1L << F32) | (1L << F64))) != 0)) {
					{
					setState(128);
					((NvarSttContext)_localctx).t = expr(0);
					}
				}

				setState(131);
				match(T__18);
				setState(132);
				((NvarSttContext)_localctx).v = expr(0);
				setState(133);
				match(T__17);
				}
				break;
			case 3:
				_localctx = new MvarSttContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				((MvarSttContext)_localctx).k = match(NAME);
				setState(136);
				match(T__18);
				setState(137);
				((MvarSttContext)_localctx).v = expr(0);
				setState(138);
				match(T__17);
				}
				break;
			case 4:
				_localctx = new IfSttContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				match(T__19);
				setState(141);
				match(T__6);
				setState(142);
				((IfSttContext)_localctx).c = expr(0);
				setState(143);
				match(T__7);
				setState(144);
				((IfSttContext)_localctx).t = stt();
				setState(147);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(145);
					match(T__20);
					setState(146);
					((IfSttContext)_localctx).f = stt();
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new BlockSttContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(149);
				match(T__1);
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__15) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << NAME) | (1L << INT) | (1L << HEX) | (1L << TINT) | (1L << THEX) | (1L << F32) | (1L << F64))) != 0)) {
					{
					{
					setState(150);
					stt();
					}
					}
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(156);
				match(T__3);
				}
				break;
			case 6:
				_localctx = new RetnSttContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(157);
				match(T__21);
				setState(158);
				((RetnSttContext)_localctx).e = expr(0);
				setState(159);
				match(T__17);
				}
				break;
			case 7:
				_localctx = new WhileSttContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(161);
				match(T__22);
				setState(162);
				match(T__6);
				setState(163);
				((WhileSttContext)_localctx).c = expr(0);
				setState(164);
				match(T__7);
				setState(165);
				((WhileSttContext)_localctx).t = stt();
				}
				break;
			case 8:
				_localctx = new ExecSttContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(167);
				match(T__23);
				setState(168);
				match(T__6);
				setState(169);
				expr(0);
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(170);
						match(T__2);
						setState(171);
						expr(0);
						}
						} 
					}
					setState(176);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(177);
				match(T__2);
				setState(178);
				match(NAME);
				setState(179);
				match(T__7);
				setState(180);
				match(T__17);
				}
				break;
			case 9:
				_localctx = new ForSttContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(182);
				match(T__24);
				setState(185);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NAME:
					{
					setState(183);
					((ForSttContext)_localctx).c = callable();
					}
					break;
				case T__25:
					{
					setState(184);
					match(T__25);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(187);
				match(T__6);
				setState(198);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(188);
					name2();
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(189);
						match(T__2);
						setState(190);
						name2();
						}
						}
						setState(195);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(196);
					match(T__26);
					}
					break;
				}
				setState(200);
				((ForSttContext)_localctx).i = match(NAME);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__27 || _la==T__28) {
					{
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__27) {
						{
						setState(201);
						match(T__27);
						setState(202);
						((ForSttContext)_localctx).s = expr(0);
						}
					}

					setState(205);
					match(T__28);
					setState(206);
					((ForSttContext)_localctx).e = expr(0);
					}
				}

				setState(209);
				match(T__7);
				setState(210);
				stt();
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

	public static class Name2Context extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(SingeliParser.NAME, 0); }
		public Name2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name2; }
	}

	public final Name2Context name2() throws RecognitionException {
		Name2Context _localctx = new Name2Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_name2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
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

	public static class TargContext extends ParserRuleContext {
		public Token name;
		public ExprContext spec;
		public TerminalNode NAME() { return getToken(SingeliParser.NAME, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TargContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_targ; }
	}

	public final TargContext targ() throws RecognitionException {
		TargContext _localctx = new TargContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_targ);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			((TargContext)_localctx).name = match(NAME);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(216);
				match(T__29);
				setState(217);
				((TargContext)_localctx).spec = expr(0);
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

	public static class TreqContext extends ParserRuleContext {
		public TreqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_treq; }
	 
		public TreqContext() { }
		public void copyFrom(TreqContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqReqContext extends TreqContext {
		public ExprContext l;
		public ExprContext r;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqReqContext(TreqContext ctx) { copyFrom(ctx); }
	}
	public static class BoolReqContext extends TreqContext {
		public ExprContext e;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BoolReqContext(TreqContext ctx) { copyFrom(ctx); }
	}

	public final TreqContext treq() throws RecognitionException {
		TreqContext _localctx = new TreqContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_treq);
		try {
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new EqReqContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				((EqReqContext)_localctx).l = expr(0);
				setState(221);
				match(T__18);
				setState(222);
				((EqReqContext)_localctx).r = expr(0);
				}
				break;
			case 2:
				_localctx = new BoolReqContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				((BoolReqContext)_localctx).e = expr(0);
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

	public static class TargsContext extends ParserRuleContext {
		public List<TargContext> targ() {
			return getRuleContexts(TargContext.class);
		}
		public TargContext targ(int i) {
			return getRuleContext(TargContext.class,i);
		}
		public List<TreqContext> treq() {
			return getRuleContexts(TreqContext.class);
		}
		public TreqContext treq(int i) {
			return getRuleContext(TreqContext.class,i);
		}
		public TargsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_targs; }
	}

	public final TargsContext targs() throws RecognitionException {
		TargsContext _localctx = new TargsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_targs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(T__1);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(228);
				targ();
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(229);
					match(T__2);
					setState(230);
					targ();
					}
					}
					setState(235);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__30) {
				{
				{
				setState(238);
				match(T__30);
				setState(239);
				treq();
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245);
			match(T__3);
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

	public static class ArgContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(SingeliParser.NAME, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(NAME);
			setState(248);
			match(T__0);
			setState(249);
			expr(0);
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

	public static class FnContext extends ParserRuleContext {
		public Token n;
		public ExprContext retT;
		public ExprContext retV;
		public TerminalNode NAME() { return getToken(SingeliParser.NAME, 0); }
		public TargsContext targs() {
			return getRuleContext(TargsContext.class,0);
		}
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<SttContext> stt() {
			return getRuleContexts(SttContext.class);
		}
		public SttContext stt(int i) {
			return getRuleContext(SttContext.class,i);
		}
		public FnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fn; }
	}

	public final FnContext fn() throws RecognitionException {
		FnContext _localctx = new FnContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fn);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			((FnContext)_localctx).n = match(NAME);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(252);
				targs();
				}
			}

			setState(255);
			match(T__6);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(256);
				arg();
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(257);
					match(T__2);
					setState(258);
					arg();
					}
					}
					setState(263);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(266);
			match(T__7);
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(267);
				match(T__0);
				setState(268);
				((FnContext)_localctx).retT = expr(0);
				}
			}

			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(271);
				match(T__1);
				setState(275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(272);
						stt();
						}
						} 
					}
					setState(277);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__15) | (1L << NAME) | (1L << INT) | (1L << HEX) | (1L << TINT) | (1L << THEX) | (1L << F32) | (1L << F64))) != 0)) {
					{
					setState(278);
					((FnContext)_localctx).retV = expr(0);
					}
				}

				setState(281);
				match(T__3);
				}
				break;
			case T__31:
				{
				setState(282);
				match(T__31);
				setState(283);
				((FnContext)_localctx).retV = expr(0);
				setState(284);
				match(T__17);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DefContext extends ParserRuleContext {
		public Token n;
		public ExprContext retV;
		public TerminalNode NAME() { return getToken(SingeliParser.NAME, 0); }
		public List<TargsContext> targs() {
			return getRuleContexts(TargsContext.class);
		}
		public TargsContext targs(int i) {
			return getRuleContext(TargsContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<SttContext> stt() {
			return getRuleContexts(SttContext.class);
		}
		public SttContext stt(int i) {
			return getRuleContext(SttContext.class,i);
		}
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_def);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(T__32);
			setState(289);
			((DefContext)_localctx).n = match(NAME);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(290);
				targs();
				}
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				{
				setState(296);
				match(T__18);
				setState(297);
				match(T__1);
				setState(301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(298);
						stt();
						}
						} 
					}
					setState(303);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__15) | (1L << NAME) | (1L << INT) | (1L << HEX) | (1L << TINT) | (1L << THEX) | (1L << F32) | (1L << F64))) != 0)) {
					{
					setState(304);
					((DefContext)_localctx).retV = expr(0);
					}
				}

				setState(307);
				match(T__3);
				}
				break;
			case T__31:
				{
				setState(308);
				match(T__31);
				setState(309);
				((DefContext)_localctx).retV = expr(0);
				setState(310);
				match(T__17);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ExportContext extends ParserRuleContext {
		public TerminalNode SYMB() { return getToken(SingeliParser.SYMB, 0); }
		public CallableContext callable() {
			return getRuleContext(CallableContext.class,0);
		}
		public ExportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_export; }
	}

	public final ExportContext export() throws RecognitionException {
		ExportContext _localctx = new ExportContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_export);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(SYMB);
			setState(315);
			match(T__18);
			setState(316);
			callable();
			setState(317);
			match(T__17);
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

	public static class ProgContext extends ParserRuleContext {
		public List<FnContext> fn() {
			return getRuleContexts(FnContext.class);
		}
		public FnContext fn(int i) {
			return getRuleContext(FnContext.class,i);
		}
		public List<ExportContext> export() {
			return getRuleContexts(ExportContext.class);
		}
		public ExportContext export(int i) {
			return getRuleContext(ExportContext.class,i);
		}
		public List<DefContext> def() {
			return getRuleContexts(DefContext.class);
		}
		public DefContext def(int i) {
			return getRuleContext(DefContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << NAME) | (1L << SYMB))) != 0)) {
				{
				setState(322);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NAME:
					{
					setState(319);
					fn();
					}
					break;
				case SYMB:
					{
					setState(320);
					export();
					}
					break;
				case T__32:
					{
					setState(321);
					def();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(326);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u014a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\5\2 \n\2\3\2\3\2\5\2$\n"+
		"\2\3\3\3\3\3\3\3\3\7\3*\n\3\f\3\16\3-\13\3\5\3/\n\3\3\3\3\3\3\4\3\4\5"+
		"\4\65\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5O\n\5\f\5\16\5R\13\5\3\5\3\5\3"+
		"\5\3\5\3\5\7\5Y\n\5\f\5\16\5\\\13\5\5\5^\n\5\3\5\3\5\3\5\3\5\3\5\3\5\7"+
		"\5f\n\5\f\5\16\5i\13\5\5\5k\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\7\5y\n\5\f\5\16\5|\13\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0084\n"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"\u0096\n\6\3\6\3\6\7\6\u009a\n\6\f\6\16\6\u009d\13\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00af\n\6\f\6\16\6"+
		"\u00b2\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00bc\n\6\3\6\3\6\3\6"+
		"\3\6\7\6\u00c2\n\6\f\6\16\6\u00c5\13\6\3\6\3\6\5\6\u00c9\n\6\3\6\3\6\3"+
		"\6\5\6\u00ce\n\6\3\6\3\6\5\6\u00d2\n\6\3\6\3\6\5\6\u00d6\n\6\3\7\3\7\3"+
		"\b\3\b\3\b\5\b\u00dd\n\b\3\t\3\t\3\t\3\t\3\t\5\t\u00e4\n\t\3\n\3\n\3\n"+
		"\3\n\7\n\u00ea\n\n\f\n\16\n\u00ed\13\n\5\n\u00ef\n\n\3\n\3\n\7\n\u00f3"+
		"\n\n\f\n\16\n\u00f6\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\5\f\u0100"+
		"\n\f\3\f\3\f\3\f\3\f\7\f\u0106\n\f\f\f\16\f\u0109\13\f\5\f\u010b\n\f\3"+
		"\f\3\f\3\f\5\f\u0110\n\f\3\f\3\f\7\f\u0114\n\f\f\f\16\f\u0117\13\f\3\f"+
		"\5\f\u011a\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u0121\n\f\3\r\3\r\3\r\7\r\u0126"+
		"\n\r\f\r\16\r\u0129\13\r\3\r\3\r\3\r\7\r\u012e\n\r\f\r\16\r\u0131\13\r"+
		"\3\r\5\r\u0134\n\r\3\r\3\r\3\r\3\r\3\r\5\r\u013b\n\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\7\17\u0145\n\17\f\17\16\17\u0148\13\17\3\17\2"+
		"\3\b\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\5\4\2((**\4\2\13\13\17\17"+
		"\3\2\20\21\2\u017a\2#\3\2\2\2\4%\3\2\2\2\6\62\3\2\2\2\bj\3\2\2\2\n\u00d5"+
		"\3\2\2\2\f\u00d7\3\2\2\2\16\u00d9\3\2\2\2\20\u00e3\3\2\2\2\22\u00e5\3"+
		"\2\2\2\24\u00f9\3\2\2\2\26\u00fd\3\2\2\2\30\u0122\3\2\2\2\32\u013c\3\2"+
		"\2\2\34\u0146\3\2\2\2\36 \7\3\2\2\37\36\3\2\2\2\37 \3\2\2\2 !\3\2\2\2"+
		"!$\5\b\5\2\"$\5\6\4\2#\37\3\2\2\2#\"\3\2\2\2$\3\3\2\2\2%.\7\4\2\2&+\5"+
		"\2\2\2\'(\7\5\2\2(*\5\2\2\2)\'\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,"+
		"/\3\2\2\2-+\3\2\2\2.&\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60\61\7\6\2\2\61\5"+
		"\3\2\2\2\62\64\7$\2\2\63\65\5\4\3\2\64\63\3\2\2\2\64\65\3\2\2\2\65\7\3"+
		"\2\2\2\66\67\b\5\1\2\67k\7$\2\28k\7\'\2\29k\7)\2\2:k\t\2\2\2;k\7,\2\2"+
		"<k\7-\2\2=k\7\7\2\2>k\7\b\2\2?@\7\t\2\2@A\5\b\5\2AB\7\n\2\2Bk\3\2\2\2"+
		"CD\7\13\2\2Dk\5\b\5\fEF\7\f\2\2Fk\7$\2\2GH\7\r\2\2HI\5\b\5\2IJ\7\16\2"+
		"\2JK\7$\2\2Kk\3\2\2\2LP\7$\2\2MO\5\4\3\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2"+
		"PQ\3\2\2\2Qk\3\2\2\2RP\3\2\2\2ST\5\6\4\2T]\7\t\2\2UZ\5\b\5\2VW\7\5\2\2"+
		"WY\5\b\5\2XV\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[^\3\2\2\2\\Z\3\2\2"+
		"\2]U\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\7\n\2\2`k\3\2\2\2ab\7\22\2\2bc\5\b"+
		"\5\2cg\7&\2\2df\5\b\5\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hk\3\2"+
		"\2\2ig\3\2\2\2j\66\3\2\2\2j8\3\2\2\2j9\3\2\2\2j:\3\2\2\2j;\3\2\2\2j<\3"+
		"\2\2\2j=\3\2\2\2j>\3\2\2\2j?\3\2\2\2jC\3\2\2\2jE\3\2\2\2jG\3\2\2\2jL\3"+
		"\2\2\2jS\3\2\2\2ja\3\2\2\2kz\3\2\2\2lm\f\7\2\2mn\t\3\2\2ny\5\b\5\bop\f"+
		"\6\2\2pq\t\4\2\2qy\5\b\5\7rs\f\5\2\2st\7.\2\2ty\5\b\5\6uv\f\3\2\2vw\7"+
		"\23\2\2wy\7$\2\2xl\3\2\2\2xo\3\2\2\2xr\3\2\2\2xu\3\2\2\2y|\3\2\2\2zx\3"+
		"\2\2\2z{\3\2\2\2{\t\3\2\2\2|z\3\2\2\2}~\5\b\5\2~\177\7\24\2\2\177\u00d6"+
		"\3\2\2\2\u0080\u0081\7$\2\2\u0081\u0083\7\3\2\2\u0082\u0084\5\b\5\2\u0083"+
		"\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\7\25"+
		"\2\2\u0086\u0087\5\b\5\2\u0087\u0088\7\24\2\2\u0088\u00d6\3\2\2\2\u0089"+
		"\u008a\7$\2\2\u008a\u008b\7\25\2\2\u008b\u008c\5\b\5\2\u008c\u008d\7\24"+
		"\2\2\u008d\u00d6\3\2\2\2\u008e\u008f\7\26\2\2\u008f\u0090\7\t\2\2\u0090"+
		"\u0091\5\b\5\2\u0091\u0092\7\n\2\2\u0092\u0095\5\n\6\2\u0093\u0094\7\27"+
		"\2\2\u0094\u0096\5\n\6\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u00d6\3\2\2\2\u0097\u009b\7\4\2\2\u0098\u009a\5\n\6\2\u0099\u0098\3\2"+
		"\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u00d6\7\6\2\2\u009f\u00a0\7\30"+
		"\2\2\u00a0\u00a1\5\b\5\2\u00a1\u00a2\7\24\2\2\u00a2\u00d6\3\2\2\2\u00a3"+
		"\u00a4\7\31\2\2\u00a4\u00a5\7\t\2\2\u00a5\u00a6\5\b\5\2\u00a6\u00a7\7"+
		"\n\2\2\u00a7\u00a8\5\n\6\2\u00a8\u00d6\3\2\2\2\u00a9\u00aa\7\32\2\2\u00aa"+
		"\u00ab\7\t\2\2\u00ab\u00b0\5\b\5\2\u00ac\u00ad\7\5\2\2\u00ad\u00af\5\b"+
		"\5\2\u00ae\u00ac\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7\5"+
		"\2\2\u00b4\u00b5\7$\2\2\u00b5\u00b6\7\n\2\2\u00b6\u00b7\7\24\2\2\u00b7"+
		"\u00d6\3\2\2\2\u00b8\u00bb\7\33\2\2\u00b9\u00bc\5\6\4\2\u00ba\u00bc\7"+
		"\34\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00c8\7\t\2\2\u00be\u00c3\5\f\7\2\u00bf\u00c0\7\5\2\2\u00c0\u00c2\5\f"+
		"\7\2\u00c1\u00bf\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\7\35"+
		"\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00be\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00d1\7$\2\2\u00cb\u00cc\7\36\2\2\u00cc\u00ce\5\b"+
		"\5\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d0\7\37\2\2\u00d0\u00d2\5\b\5\2\u00d1\u00cd\3\2\2\2\u00d1\u00d2\3"+
		"\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\7\n\2\2\u00d4\u00d6\5\n\6\2\u00d5"+
		"}\3\2\2\2\u00d5\u0080\3\2\2\2\u00d5\u0089\3\2\2\2\u00d5\u008e\3\2\2\2"+
		"\u00d5\u0097\3\2\2\2\u00d5\u009f\3\2\2\2\u00d5\u00a3\3\2\2\2\u00d5\u00a9"+
		"\3\2\2\2\u00d5\u00b8\3\2\2\2\u00d6\13\3\2\2\2\u00d7\u00d8\7$\2\2\u00d8"+
		"\r\3\2\2\2\u00d9\u00dc\7$\2\2\u00da\u00db\7 \2\2\u00db\u00dd\5\b\5\2\u00dc"+
		"\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\17\3\2\2\2\u00de\u00df\5\b\5"+
		"\2\u00df\u00e0\7\25\2\2\u00e0\u00e1\5\b\5\2\u00e1\u00e4\3\2\2\2\u00e2"+
		"\u00e4\5\b\5\2\u00e3\u00de\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\21\3\2\2"+
		"\2\u00e5\u00ee\7\4\2\2\u00e6\u00eb\5\16\b\2\u00e7\u00e8\7\5\2\2\u00e8"+
		"\u00ea\5\16\b\2\u00e9\u00e7\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3"+
		"\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee"+
		"\u00e6\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f4\3\2\2\2\u00f0\u00f1\7!"+
		"\2\2\u00f1\u00f3\5\20\t\2\u00f2\u00f0\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f4\3\2"+
		"\2\2\u00f7\u00f8\7\6\2\2\u00f8\23\3\2\2\2\u00f9\u00fa\7$\2\2\u00fa\u00fb"+
		"\7\3\2\2\u00fb\u00fc\5\b\5\2\u00fc\25\3\2\2\2\u00fd\u00ff\7$\2\2\u00fe"+
		"\u0100\5\22\n\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3"+
		"\2\2\2\u0101\u010a\7\t\2\2\u0102\u0107\5\24\13\2\u0103\u0104\7\5\2\2\u0104"+
		"\u0106\5\24\13\2\u0105\u0103\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3"+
		"\2\2\2\u0107\u0108\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u010a"+
		"\u0102\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010f\7\n"+
		"\2\2\u010d\u010e\7\3\2\2\u010e\u0110\5\b\5\2\u010f\u010d\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\u0120\3\2\2\2\u0111\u0115\7\4\2\2\u0112\u0114\5\n"+
		"\6\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u011a\5\b"+
		"\5\2\u0119\u0118\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b"+
		"\u0121\7\6\2\2\u011c\u011d\7\"\2\2\u011d\u011e\5\b\5\2\u011e\u011f\7\24"+
		"\2\2\u011f\u0121\3\2\2\2\u0120\u0111\3\2\2\2\u0120\u011c\3\2\2\2\u0121"+
		"\27\3\2\2\2\u0122\u0123\7#\2\2\u0123\u0127\7$\2\2\u0124\u0126\5\22\n\2"+
		"\u0125\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128"+
		"\3\2\2\2\u0128\u013a\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012b\7\25\2\2"+
		"\u012b\u012f\7\4\2\2\u012c\u012e\5\n\6\2\u012d\u012c\3\2\2\2\u012e\u0131"+
		"\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0133\3\2\2\2\u0131"+
		"\u012f\3\2\2\2\u0132\u0134\5\b\5\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2"+
		"\2\2\u0134\u0135\3\2\2\2\u0135\u013b\7\6\2\2\u0136\u0137\7\"\2\2\u0137"+
		"\u0138\5\b\5\2\u0138\u0139\7\24\2\2\u0139\u013b\3\2\2\2\u013a\u012a\3"+
		"\2\2\2\u013a\u0136\3\2\2\2\u013b\31\3\2\2\2\u013c\u013d\7%\2\2\u013d\u013e"+
		"\7\25\2\2\u013e\u013f\5\6\4\2\u013f\u0140\7\24\2\2\u0140\33\3\2\2\2\u0141"+
		"\u0145\5\26\f\2\u0142\u0145\5\32\16\2\u0143\u0145\5\30\r\2\u0144\u0141"+
		"\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146"+
		"\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\35\3\2\2\2\u0148\u0146\3\2\2"+
		"\2*\37#+.\64PZ]gjxz\u0083\u0095\u009b\u00b0\u00bb\u00c3\u00c8\u00cd\u00d1"+
		"\u00d5\u00dc\u00e3\u00eb\u00ee\u00f4\u00ff\u0107\u010a\u010f\u0115\u0119"+
		"\u0120\u0127\u012f\u0133\u013a\u0144\u0146";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}