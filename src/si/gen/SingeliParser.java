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
		T__24=25, T__25=26, T__26=27, NAME=28, SYMB=29, STR=30, INT=31, HEX=32, 
		TINT=33, THEX=34, DEC=35, F32=36, F64=37, REL=38, WS=39, COMMENT=40, LINE_COMMENT=41;
	public static final int
		RULE_texpr = 0, RULE_callable = 1, RULE_expr = 2, RULE_stt = 3, RULE_targ = 4, 
		RULE_treq = 5, RULE_arg = 6, RULE_fn = 7, RULE_export = 8, RULE_prog = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"texpr", "callable", "expr", "stt", "targ", "treq", "arg", "fn", "export", 
			"prog"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "','", "'}'", "'true'", "'false'", "'*'", "'$'", "'['", 
			"']'", "'('", "')'", "'/'", "'+'", "'-'", "'emit'", "'.'", "';'", "':'", 
			"'='", "'if'", "'else'", "'return'", "'while'", "'do'", "'::'", "'&'", 
			"'=>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "NAME", "SYMB", "STR", "INT", "HEX", "TINT", 
			"THEX", "DEC", "F32", "F64", "REL", "WS", "COMMENT", "LINE_COMMENT"
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
		try {
			setState(22);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
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

	public static class CallableContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(SingeliParser.NAME, 0); }
		public List<TexprContext> texpr() {
			return getRuleContexts(TexprContext.class);
		}
		public TexprContext texpr(int i) {
			return getRuleContext(TexprContext.class,i);
		}
		public CallableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callable; }
	}

	public final CallableContext callable() throws RecognitionException {
		CallableContext _localctx = new CallableContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_callable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(NAME);
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(25);
				match(T__0);
				setState(26);
				texpr();
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(27);
					match(T__1);
					setState(28);
					texpr();
					}
					}
					setState(33);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(34);
				match(T__2);
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new VarExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(39);
				((VarExprContext)_localctx).v = match(NAME);
				}
				break;
			case 2:
				{
				_localctx = new IntExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(40);
				((IntExprContext)_localctx).v = match(INT);
				}
				break;
			case 3:
				{
				_localctx = new TintExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(41);
				((TintExprContext)_localctx).v = match(TINT);
				}
				break;
			case 4:
				{
				_localctx = new HexExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(42);
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
				setState(43);
				((F32ExprContext)_localctx).v = match(F32);
				}
				break;
			case 6:
				{
				_localctx = new F64ExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(44);
				((F64ExprContext)_localctx).v = match(F64);
				}
				break;
			case 7:
				{
				_localctx = new TrueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(45);
				match(T__3);
				}
				break;
			case 8:
				{
				_localctx = new FalseExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(46);
				match(T__4);
				}
				break;
			case 9:
				{
				_localctx = new PtrExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(47);
				match(T__5);
				setState(48);
				expr(10);
				}
				break;
			case 10:
				{
				_localctx = new FvecExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(49);
				match(T__6);
				setState(50);
				match(NAME);
				}
				break;
			case 11:
				{
				_localctx = new VecExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(51);
				match(T__7);
				setState(52);
				expr(0);
				setState(53);
				match(T__8);
				setState(54);
				match(NAME);
				}
				break;
			case 12:
				{
				_localctx = new GroupExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56);
				match(T__9);
				setState(57);
				expr(0);
				setState(58);
				match(T__10);
				}
				break;
			case 13:
				{
				_localctx = new CallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60);
				callable();
				setState(61);
				match(T__9);
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__14) | (1L << NAME) | (1L << INT) | (1L << HEX) | (1L << TINT) | (1L << THEX) | (1L << F32) | (1L << F64))) != 0)) {
					{
					setState(62);
					expr(0);
					setState(67);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(63);
						match(T__1);
						setState(64);
						expr(0);
						}
						}
						setState(69);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(72);
				match(T__10);
				}
				break;
			case 14:
				{
				_localctx = new EmitExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74);
				match(T__14);
				setState(75);
				expr(0);
				setState(76);
				match(STR);
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(77);
						expr(0);
						}
						} 
					}
					setState(82);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(97);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new MulExprContext(new ExprContext(_parentctx, _parentState));
						((MulExprContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(85);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(86);
						((MulExprContext)_localctx).ref = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__11) ) {
							((MulExprContext)_localctx).ref = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(87);
						((MulExprContext)_localctx).r = expr(6);
						}
						break;
					case 2:
						{
						_localctx = new AddExprContext(new ExprContext(_parentctx, _parentState));
						((AddExprContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(88);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(89);
						((AddExprContext)_localctx).ref = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__12 || _la==T__13) ) {
							((AddExprContext)_localctx).ref = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(90);
						((AddExprContext)_localctx).r = expr(5);
						}
						break;
					case 3:
						{
						_localctx = new RelExprContext(new ExprContext(_parentctx, _parentState));
						((RelExprContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(91);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(92);
						((RelExprContext)_localctx).ref = match(REL);
						setState(93);
						((RelExprContext)_localctx).r = expr(4);
						}
						break;
					case 4:
						{
						_localctx = new FldExprContext(new ExprContext(_parentctx, _parentState));
						((FldExprContext)_localctx).e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(94);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(95);
						match(T__15);
						setState(96);
						((FldExprContext)_localctx).n = match(NAME);
						}
						break;
					}
					} 
				}
				setState(101);
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
	public static class DoWhileSttContext extends SttContext {
		public SttContext t;
		public ExprContext c;
		public SttContext stt() {
			return getRuleContext(SttContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DoWhileSttContext(SttContext ctx) { copyFrom(ctx); }
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
		enterRule(_localctx, 6, RULE_stt);
		int _la;
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new ExprSttContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				expr(0);
				setState(103);
				match(T__16);
				}
				break;
			case 2:
				_localctx = new NvarSttContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				((NvarSttContext)_localctx).k = match(NAME);
				setState(106);
				match(T__17);
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__14) | (1L << NAME) | (1L << INT) | (1L << HEX) | (1L << TINT) | (1L << THEX) | (1L << F32) | (1L << F64))) != 0)) {
					{
					setState(107);
					((NvarSttContext)_localctx).t = expr(0);
					}
				}

				setState(110);
				match(T__18);
				setState(111);
				((NvarSttContext)_localctx).v = expr(0);
				setState(112);
				match(T__16);
				}
				break;
			case 3:
				_localctx = new MvarSttContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				((MvarSttContext)_localctx).k = match(NAME);
				setState(115);
				match(T__18);
				setState(116);
				((MvarSttContext)_localctx).v = expr(0);
				setState(117);
				match(T__16);
				}
				break;
			case 4:
				_localctx = new IfSttContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
				match(T__19);
				setState(120);
				match(T__9);
				setState(121);
				((IfSttContext)_localctx).c = expr(0);
				setState(122);
				match(T__10);
				setState(123);
				((IfSttContext)_localctx).t = stt();
				setState(126);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(124);
					match(T__20);
					setState(125);
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
				setState(128);
				match(T__0);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__14) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << NAME) | (1L << INT) | (1L << HEX) | (1L << TINT) | (1L << THEX) | (1L << F32) | (1L << F64))) != 0)) {
					{
					{
					setState(129);
					stt();
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(135);
				match(T__2);
				}
				break;
			case 6:
				_localctx = new RetnSttContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(136);
				match(T__21);
				setState(137);
				((RetnSttContext)_localctx).e = expr(0);
				setState(138);
				match(T__16);
				}
				break;
			case 7:
				_localctx = new WhileSttContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(140);
				match(T__22);
				setState(141);
				match(T__9);
				setState(142);
				((WhileSttContext)_localctx).c = expr(0);
				setState(143);
				match(T__10);
				setState(144);
				((WhileSttContext)_localctx).t = stt();
				}
				break;
			case 8:
				_localctx = new DoWhileSttContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(146);
				match(T__23);
				setState(147);
				((DoWhileSttContext)_localctx).t = stt();
				setState(148);
				match(T__22);
				setState(149);
				match(T__9);
				setState(150);
				((DoWhileSttContext)_localctx).c = expr(0);
				setState(151);
				match(T__10);
				setState(152);
				match(T__16);
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
		enterRule(_localctx, 8, RULE_targ);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			((TargContext)_localctx).name = match(NAME);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(157);
				match(T__24);
				setState(158);
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
		enterRule(_localctx, 10, RULE_treq);
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new EqReqContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				((EqReqContext)_localctx).l = expr(0);
				setState(162);
				match(T__18);
				setState(163);
				((EqReqContext)_localctx).r = expr(0);
				}
				break;
			case 2:
				_localctx = new BoolReqContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
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
		enterRule(_localctx, 12, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(NAME);
			setState(169);
			match(T__17);
			setState(170);
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
		public ExprContext retT;
		public ExprContext retV;
		public TerminalNode NAME() { return getToken(SingeliParser.NAME, 0); }
		public List<TargContext> targ() {
			return getRuleContexts(TargContext.class);
		}
		public TargContext targ(int i) {
			return getRuleContext(TargContext.class,i);
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
		public List<TreqContext> treq() {
			return getRuleContexts(TreqContext.class);
		}
		public TreqContext treq(int i) {
			return getRuleContext(TreqContext.class,i);
		}
		public FnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fn; }
	}

	public final FnContext fn() throws RecognitionException {
		FnContext _localctx = new FnContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fn);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(NAME);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(173);
				match(T__0);
				setState(174);
				targ();
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(175);
					match(T__1);
					setState(176);
					targ();
					}
					}
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(182);
					match(T__25);
					setState(183);
					treq();
					}
					}
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(189);
				match(T__2);
				}
			}

			setState(193);
			match(T__9);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(194);
				arg();
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(195);
					match(T__1);
					setState(196);
					arg();
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(204);
			match(T__10);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(205);
				match(T__17);
				setState(206);
				((FnContext)_localctx).retT = expr(0);
				}
			}

			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(209);
				match(T__0);
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(210);
						stt();
						}
						} 
					}
					setState(215);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__14) | (1L << NAME) | (1L << INT) | (1L << HEX) | (1L << TINT) | (1L << THEX) | (1L << F32) | (1L << F64))) != 0)) {
					{
					setState(216);
					((FnContext)_localctx).retV = expr(0);
					}
				}

				setState(219);
				match(T__2);
				}
				break;
			case T__26:
				{
				setState(220);
				match(T__26);
				setState(221);
				((FnContext)_localctx).retV = expr(0);
				setState(222);
				match(T__16);
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
		enterRule(_localctx, 16, RULE_export);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(SYMB);
			setState(227);
			match(T__18);
			setState(228);
			callable();
			setState(229);
			match(T__16);
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
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME || _la==SYMB) {
				{
				setState(233);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NAME:
					{
					setState(231);
					fn();
					}
					break;
				case SYMB:
					{
					setState(232);
					export();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(237);
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
		case 2:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u00f1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\5\2\31\n\2\3\3\3\3\3\3\3\3\3\3\7\3 \n\3\f\3\16\3#\13\3\3\3"+
		"\3\3\5\3\'\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4D\n\4\f\4\16\4"+
		"G\13\4\5\4I\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4Q\n\4\f\4\16\4T\13\4\5\4V\n"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4d\n\4\f\4\16\4g"+
		"\13\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5o\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0081\n\5\3\5\3\5\7\5\u0085\n\5\f"+
		"\5\16\5\u0088\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u009d\n\5\3\6\3\6\3\6\5\6\u00a2\n\6\3\7\3"+
		"\7\3\7\3\7\3\7\5\7\u00a9\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\t\u00b4"+
		"\n\t\f\t\16\t\u00b7\13\t\3\t\3\t\7\t\u00bb\n\t\f\t\16\t\u00be\13\t\3\t"+
		"\3\t\5\t\u00c2\n\t\3\t\3\t\3\t\3\t\7\t\u00c8\n\t\f\t\16\t\u00cb\13\t\5"+
		"\t\u00cd\n\t\3\t\3\t\3\t\5\t\u00d2\n\t\3\t\3\t\7\t\u00d6\n\t\f\t\16\t"+
		"\u00d9\13\t\3\t\5\t\u00dc\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u00e3\n\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\7\13\u00ec\n\13\f\13\16\13\u00ef\13\13\3\13\2"+
		"\3\6\f\2\4\6\b\n\f\16\20\22\24\2\5\4\2\"\"$$\4\2\b\b\16\16\3\2\17\20\2"+
		"\u0114\2\30\3\2\2\2\4\32\3\2\2\2\6U\3\2\2\2\b\u009c\3\2\2\2\n\u009e\3"+
		"\2\2\2\f\u00a8\3\2\2\2\16\u00aa\3\2\2\2\20\u00ae\3\2\2\2\22\u00e4\3\2"+
		"\2\2\24\u00ed\3\2\2\2\26\31\5\6\4\2\27\31\5\4\3\2\30\26\3\2\2\2\30\27"+
		"\3\2\2\2\31\3\3\2\2\2\32&\7\36\2\2\33\34\7\3\2\2\34!\5\2\2\2\35\36\7\4"+
		"\2\2\36 \5\2\2\2\37\35\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2"+
		"\2\2#!\3\2\2\2$%\7\5\2\2%\'\3\2\2\2&\33\3\2\2\2&\'\3\2\2\2\'\5\3\2\2\2"+
		"()\b\4\1\2)V\7\36\2\2*V\7!\2\2+V\7#\2\2,V\t\2\2\2-V\7&\2\2.V\7\'\2\2/"+
		"V\7\6\2\2\60V\7\7\2\2\61\62\7\b\2\2\62V\5\6\4\f\63\64\7\t\2\2\64V\7\36"+
		"\2\2\65\66\7\n\2\2\66\67\5\6\4\2\678\7\13\2\289\7\36\2\29V\3\2\2\2:;\7"+
		"\f\2\2;<\5\6\4\2<=\7\r\2\2=V\3\2\2\2>?\5\4\3\2?H\7\f\2\2@E\5\6\4\2AB\7"+
		"\4\2\2BD\5\6\4\2CA\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FI\3\2\2\2GE\3"+
		"\2\2\2H@\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\7\r\2\2KV\3\2\2\2LM\7\21\2\2MN"+
		"\5\6\4\2NR\7 \2\2OQ\5\6\4\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SV"+
		"\3\2\2\2TR\3\2\2\2U(\3\2\2\2U*\3\2\2\2U+\3\2\2\2U,\3\2\2\2U-\3\2\2\2U"+
		".\3\2\2\2U/\3\2\2\2U\60\3\2\2\2U\61\3\2\2\2U\63\3\2\2\2U\65\3\2\2\2U:"+
		"\3\2\2\2U>\3\2\2\2UL\3\2\2\2Ve\3\2\2\2WX\f\7\2\2XY\t\3\2\2Yd\5\6\4\bZ"+
		"[\f\6\2\2[\\\t\4\2\2\\d\5\6\4\7]^\f\5\2\2^_\7(\2\2_d\5\6\4\6`a\f\3\2\2"+
		"ab\7\22\2\2bd\7\36\2\2cW\3\2\2\2cZ\3\2\2\2c]\3\2\2\2c`\3\2\2\2dg\3\2\2"+
		"\2ec\3\2\2\2ef\3\2\2\2f\7\3\2\2\2ge\3\2\2\2hi\5\6\4\2ij\7\23\2\2j\u009d"+
		"\3\2\2\2kl\7\36\2\2ln\7\24\2\2mo\5\6\4\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2"+
		"pq\7\25\2\2qr\5\6\4\2rs\7\23\2\2s\u009d\3\2\2\2tu\7\36\2\2uv\7\25\2\2"+
		"vw\5\6\4\2wx\7\23\2\2x\u009d\3\2\2\2yz\7\26\2\2z{\7\f\2\2{|\5\6\4\2|}"+
		"\7\r\2\2}\u0080\5\b\5\2~\177\7\27\2\2\177\u0081\5\b\5\2\u0080~\3\2\2\2"+
		"\u0080\u0081\3\2\2\2\u0081\u009d\3\2\2\2\u0082\u0086\7\3\2\2\u0083\u0085"+
		"\5\b\5\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u009d\7\5"+
		"\2\2\u008a\u008b\7\30\2\2\u008b\u008c\5\6\4\2\u008c\u008d\7\23\2\2\u008d"+
		"\u009d\3\2\2\2\u008e\u008f\7\31\2\2\u008f\u0090\7\f\2\2\u0090\u0091\5"+
		"\6\4\2\u0091\u0092\7\r\2\2\u0092\u0093\5\b\5\2\u0093\u009d\3\2\2\2\u0094"+
		"\u0095\7\32\2\2\u0095\u0096\5\b\5\2\u0096\u0097\7\31\2\2\u0097\u0098\7"+
		"\f\2\2\u0098\u0099\5\6\4\2\u0099\u009a\7\r\2\2\u009a\u009b\7\23\2\2\u009b"+
		"\u009d\3\2\2\2\u009ch\3\2\2\2\u009ck\3\2\2\2\u009ct\3\2\2\2\u009cy\3\2"+
		"\2\2\u009c\u0082\3\2\2\2\u009c\u008a\3\2\2\2\u009c\u008e\3\2\2\2\u009c"+
		"\u0094\3\2\2\2\u009d\t\3\2\2\2\u009e\u00a1\7\36\2\2\u009f\u00a0\7\33\2"+
		"\2\u00a0\u00a2\5\6\4\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\13"+
		"\3\2\2\2\u00a3\u00a4\5\6\4\2\u00a4\u00a5\7\25\2\2\u00a5\u00a6\5\6\4\2"+
		"\u00a6\u00a9\3\2\2\2\u00a7\u00a9\5\6\4\2\u00a8\u00a3\3\2\2\2\u00a8\u00a7"+
		"\3\2\2\2\u00a9\r\3\2\2\2\u00aa\u00ab\7\36\2\2\u00ab\u00ac\7\24\2\2\u00ac"+
		"\u00ad\5\6\4\2\u00ad\17\3\2\2\2\u00ae\u00c1\7\36\2\2\u00af\u00b0\7\3\2"+
		"\2\u00b0\u00b5\5\n\6\2\u00b1\u00b2\7\4\2\2\u00b2\u00b4\5\n\6\2\u00b3\u00b1"+
		"\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00bc\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\7\34\2\2\u00b9\u00bb\5"+
		"\f\7\2\u00ba\u00b8\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\7\5"+
		"\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00af\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00cc\7\f\2\2\u00c4\u00c9\5\16\b\2\u00c5\u00c6\7"+
		"\4\2\2\u00c6\u00c8\5\16\b\2\u00c7\u00c5\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2"+
		"\2\2\u00cc\u00c4\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00d1\7\r\2\2\u00cf\u00d0\7\24\2\2\u00d0\u00d2\5\6\4\2\u00d1\u00cf\3"+
		"\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00e2\3\2\2\2\u00d3\u00d7\7\3\2\2\u00d4"+
		"\u00d6\5\b\5\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2"+
		"\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da"+
		"\u00dc\5\6\4\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\u00e3\7\5\2\2\u00de\u00df\7\35\2\2\u00df\u00e0\5\6\4\2\u00e0"+
		"\u00e1\7\23\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00d3\3\2\2\2\u00e2\u00de\3"+
		"\2\2\2\u00e3\21\3\2\2\2\u00e4\u00e5\7\37\2\2\u00e5\u00e6\7\25\2\2\u00e6"+
		"\u00e7\5\4\3\2\u00e7\u00e8\7\23\2\2\u00e8\23\3\2\2\2\u00e9\u00ec\5\20"+
		"\t\2\u00ea\u00ec\5\22\n\2\u00eb\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec"+
		"\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\25\3\2\2"+
		"\2\u00ef\u00ed\3\2\2\2\34\30!&EHRUcen\u0080\u0086\u009c\u00a1\u00a8\u00b5"+
		"\u00bc\u00c1\u00c9\u00cc\u00d1\u00d7\u00db\u00e2\u00eb\u00ed";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}