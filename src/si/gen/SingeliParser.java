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
			setState(33);
			match(T__1);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__15) | (1L << NAME) | (1L << INT) | (1L << HEX) | (1L << TINT) | (1L << THEX) | (1L << F32) | (1L << F64))) != 0)) {
				{
				setState(34);
				texpr();
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(35);
					match(T__2);
					setState(36);
					texpr();
					}
					}
					setState(41);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(44);
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
			setState(46);
			((CallableContext)_localctx).n = match(NAME);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(47);
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
	public static class DefExprContext extends ExprContext {
		public Token v;
		public TerminalNode NAME() { return getToken(SingeliParser.NAME, 0); }
		public List<TinvContext> tinv() {
			return getRuleContexts(TinvContext.class);
		}
		public TinvContext tinv(int i) {
			return getRuleContext(TinvContext.class,i);
		}
		public DefExprContext(ExprContext ctx) { copyFrom(ctx); }
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
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new DefExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(51);
				((DefExprContext)_localctx).v = match(NAME);
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(52);
						tinv();
						}
						} 
					}
					setState(57);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				}
				break;
			case 2:
				{
				_localctx = new IntExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(58);
				((IntExprContext)_localctx).v = match(INT);
				}
				break;
			case 3:
				{
				_localctx = new TintExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				((TintExprContext)_localctx).v = match(TINT);
				}
				break;
			case 4:
				{
				_localctx = new HexExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60);
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
				setState(61);
				((F32ExprContext)_localctx).v = match(F32);
				}
				break;
			case 6:
				{
				_localctx = new F64ExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(62);
				((F64ExprContext)_localctx).v = match(F64);
				}
				break;
			case 7:
				{
				_localctx = new TrueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(63);
				match(T__4);
				}
				break;
			case 8:
				{
				_localctx = new FalseExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(64);
				match(T__5);
				}
				break;
			case 9:
				{
				_localctx = new GroupExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(65);
				match(T__6);
				setState(66);
				expr(0);
				setState(67);
				match(T__7);
				}
				break;
			case 10:
				{
				_localctx = new PtrExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(69);
				match(T__8);
				setState(70);
				expr(9);
				}
				break;
			case 11:
				{
				_localctx = new FvecExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
				match(T__9);
				setState(72);
				match(NAME);
				}
				break;
			case 12:
				{
				_localctx = new VecExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(73);
				match(T__10);
				setState(74);
				expr(0);
				setState(75);
				match(T__11);
				setState(76);
				match(NAME);
				}
				break;
			case 13:
				{
				_localctx = new CallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(78);
				callable();
				setState(79);
				match(T__6);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__15) | (1L << NAME) | (1L << INT) | (1L << HEX) | (1L << TINT) | (1L << THEX) | (1L << F32) | (1L << F64))) != 0)) {
					{
					setState(80);
					expr(0);
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(81);
						match(T__2);
						setState(82);
						expr(0);
						}
						}
						setState(87);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(90);
				match(T__7);
				}
				break;
			case 14:
				{
				_localctx = new EmitExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92);
				match(T__15);
				setState(93);
				expr(0);
				setState(94);
				match(STR);
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(95);
						expr(0);
						}
						} 
					}
					setState(100);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(115);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new MulExprContext(new ExprContext(_parentctx, _parentState));
						((MulExprContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(103);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(104);
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
						setState(105);
						((MulExprContext)_localctx).r = expr(6);
						}
						break;
					case 2:
						{
						_localctx = new AddExprContext(new ExprContext(_parentctx, _parentState));
						((AddExprContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(106);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(107);
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
						setState(108);
						((AddExprContext)_localctx).r = expr(5);
						}
						break;
					case 3:
						{
						_localctx = new RelExprContext(new ExprContext(_parentctx, _parentState));
						((RelExprContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(109);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(110);
						((RelExprContext)_localctx).ref = match(REL);
						setState(111);
						((RelExprContext)_localctx).r = expr(4);
						}
						break;
					case 4:
						{
						_localctx = new FldExprContext(new ExprContext(_parentctx, _parentState));
						((FldExprContext)_localctx).e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(112);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(113);
						match(T__16);
						setState(114);
						((FldExprContext)_localctx).n = match(NAME);
						}
						break;
					}
					} 
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new ExprSttContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				expr(0);
				setState(121);
				match(T__17);
				}
				break;
			case 2:
				_localctx = new NvarSttContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				((NvarSttContext)_localctx).k = match(NAME);
				setState(124);
				match(T__0);
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__15) | (1L << NAME) | (1L << INT) | (1L << HEX) | (1L << TINT) | (1L << THEX) | (1L << F32) | (1L << F64))) != 0)) {
					{
					setState(125);
					((NvarSttContext)_localctx).t = expr(0);
					}
				}

				setState(128);
				match(T__18);
				setState(129);
				((NvarSttContext)_localctx).v = expr(0);
				setState(130);
				match(T__17);
				}
				break;
			case 3:
				_localctx = new MvarSttContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				((MvarSttContext)_localctx).k = match(NAME);
				setState(133);
				match(T__18);
				setState(134);
				((MvarSttContext)_localctx).v = expr(0);
				setState(135);
				match(T__17);
				}
				break;
			case 4:
				_localctx = new IfSttContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				match(T__19);
				setState(138);
				match(T__6);
				setState(139);
				((IfSttContext)_localctx).c = expr(0);
				setState(140);
				match(T__7);
				setState(141);
				((IfSttContext)_localctx).t = stt();
				setState(144);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(142);
					match(T__20);
					setState(143);
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
				setState(146);
				match(T__1);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__15) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << NAME) | (1L << INT) | (1L << HEX) | (1L << TINT) | (1L << THEX) | (1L << F32) | (1L << F64))) != 0)) {
					{
					{
					setState(147);
					stt();
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(153);
				match(T__3);
				}
				break;
			case 6:
				_localctx = new RetnSttContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(154);
				match(T__21);
				setState(155);
				((RetnSttContext)_localctx).e = expr(0);
				setState(156);
				match(T__17);
				}
				break;
			case 7:
				_localctx = new WhileSttContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(158);
				match(T__22);
				setState(159);
				match(T__6);
				setState(160);
				((WhileSttContext)_localctx).c = expr(0);
				setState(161);
				match(T__7);
				setState(162);
				((WhileSttContext)_localctx).t = stt();
				}
				break;
			case 8:
				_localctx = new ExecSttContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(164);
				match(T__23);
				setState(165);
				match(T__6);
				setState(166);
				expr(0);
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(167);
						match(T__2);
						setState(168);
						expr(0);
						}
						} 
					}
					setState(173);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(174);
				match(T__2);
				setState(175);
				match(NAME);
				setState(176);
				match(T__7);
				setState(177);
				match(T__17);
				}
				break;
			case 9:
				_localctx = new ForSttContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(179);
				match(T__24);
				setState(182);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NAME:
					{
					setState(180);
					((ForSttContext)_localctx).c = callable();
					}
					break;
				case T__25:
					{
					setState(181);
					match(T__25);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(184);
				match(T__6);
				setState(195);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(185);
					name2();
					setState(190);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(186);
						match(T__2);
						setState(187);
						name2();
						}
						}
						setState(192);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(193);
					match(T__26);
					}
					break;
				}
				setState(197);
				((ForSttContext)_localctx).i = match(NAME);
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__27 || _la==T__28) {
					{
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__27) {
						{
						setState(198);
						match(T__27);
						setState(199);
						((ForSttContext)_localctx).s = expr(0);
						}
					}

					setState(202);
					match(T__28);
					setState(203);
					((ForSttContext)_localctx).e = expr(0);
					}
				}

				setState(206);
				match(T__7);
				setState(207);
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
			setState(210);
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
			setState(212);
			((TargContext)_localctx).name = match(NAME);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(213);
				match(T__29);
				setState(214);
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
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new EqReqContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				((EqReqContext)_localctx).l = expr(0);
				setState(218);
				match(T__18);
				setState(219);
				((EqReqContext)_localctx).r = expr(0);
				}
				break;
			case 2:
				_localctx = new BoolReqContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
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
			setState(224);
			match(T__1);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(225);
				targ();
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(226);
					match(T__2);
					setState(227);
					targ();
					}
					}
					setState(232);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__30) {
				{
				{
				setState(235);
				match(T__30);
				setState(236);
				treq();
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(242);
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
			setState(244);
			match(NAME);
			setState(245);
			match(T__0);
			setState(246);
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
			setState(248);
			((FnContext)_localctx).n = match(NAME);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(249);
				targs();
				}
			}

			setState(252);
			match(T__6);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(253);
				arg();
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(254);
					match(T__2);
					setState(255);
					arg();
					}
					}
					setState(260);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(263);
			match(T__7);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(264);
				match(T__0);
				setState(265);
				((FnContext)_localctx).retT = expr(0);
				}
			}

			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				{
				setState(268);
				match(T__18);
				setState(269);
				match(T__1);
				setState(273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(270);
						stt();
						}
						} 
					}
					setState(275);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__15) | (1L << NAME) | (1L << INT) | (1L << HEX) | (1L << TINT) | (1L << THEX) | (1L << F32) | (1L << F64))) != 0)) {
					{
					setState(276);
					((FnContext)_localctx).retV = expr(0);
					}
				}

				setState(279);
				match(T__3);
				}
				break;
			case T__31:
				{
				setState(280);
				match(T__31);
				setState(281);
				((FnContext)_localctx).retV = expr(0);
				setState(282);
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
			setState(286);
			match(T__32);
			setState(287);
			((DefContext)_localctx).n = match(NAME);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(288);
				targs();
				}
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				{
				setState(294);
				match(T__18);
				setState(295);
				match(T__1);
				setState(299);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(296);
						stt();
						}
						} 
					}
					setState(301);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__15) | (1L << NAME) | (1L << INT) | (1L << HEX) | (1L << TINT) | (1L << THEX) | (1L << F32) | (1L << F64))) != 0)) {
					{
					setState(302);
					((DefContext)_localctx).retV = expr(0);
					}
				}

				setState(305);
				match(T__3);
				}
				break;
			case T__31:
				{
				setState(306);
				match(T__31);
				setState(307);
				((DefContext)_localctx).retV = expr(0);
				setState(308);
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
			setState(312);
			match(SYMB);
			setState(313);
			match(T__18);
			setState(314);
			callable();
			setState(315);
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
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << NAME) | (1L << SYMB))) != 0)) {
				{
				setState(320);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NAME:
					{
					setState(317);
					fn();
					}
					break;
				case SYMB:
					{
					setState(318);
					export();
					}
					break;
				case T__32:
					{
					setState(319);
					def();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(324);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u0148\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\5\2 \n\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\7\3(\n\3\f\3\16\3+\13\3\5\3-\n\3\3\3\3\3\3\4\3\4\5\4\63\n\4\3"+
		"\5\3\5\3\5\7\58\n\5\f\5\16\5;\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5V"+
		"\n\5\f\5\16\5Y\13\5\5\5[\n\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5c\n\5\f\5\16\5"+
		"f\13\5\5\5h\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5v\n"+
		"\5\f\5\16\5y\13\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0081\n\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0093\n\6\3\6\3"+
		"\6\7\6\u0097\n\6\f\6\16\6\u009a\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00ac\n\6\f\6\16\6\u00af\13\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00b9\n\6\3\6\3\6\3\6\3\6\7\6\u00bf\n\6"+
		"\f\6\16\6\u00c2\13\6\3\6\3\6\5\6\u00c6\n\6\3\6\3\6\3\6\5\6\u00cb\n\6\3"+
		"\6\3\6\5\6\u00cf\n\6\3\6\3\6\5\6\u00d3\n\6\3\7\3\7\3\b\3\b\3\b\5\b\u00da"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\5\t\u00e1\n\t\3\n\3\n\3\n\3\n\7\n\u00e7\n\n\f"+
		"\n\16\n\u00ea\13\n\5\n\u00ec\n\n\3\n\3\n\7\n\u00f0\n\n\f\n\16\n\u00f3"+
		"\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\5\f\u00fd\n\f\3\f\3\f\3\f\3"+
		"\f\7\f\u0103\n\f\f\f\16\f\u0106\13\f\5\f\u0108\n\f\3\f\3\f\3\f\5\f\u010d"+
		"\n\f\3\f\3\f\3\f\7\f\u0112\n\f\f\f\16\f\u0115\13\f\3\f\5\f\u0118\n\f\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u011f\n\f\3\r\3\r\3\r\7\r\u0124\n\r\f\r\16\r\u0127"+
		"\13\r\3\r\3\r\3\r\7\r\u012c\n\r\f\r\16\r\u012f\13\r\3\r\5\r\u0132\n\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\r\u0139\n\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\7\17\u0143\n\17\f\17\16\17\u0146\13\17\3\17\2\3\b\20\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\2\5\4\2((**\4\2\13\13\17\17\3\2\20\21\2\u0176"+
		"\2\37\3\2\2\2\4#\3\2\2\2\6\60\3\2\2\2\bg\3\2\2\2\n\u00d2\3\2\2\2\f\u00d4"+
		"\3\2\2\2\16\u00d6\3\2\2\2\20\u00e0\3\2\2\2\22\u00e2\3\2\2\2\24\u00f6\3"+
		"\2\2\2\26\u00fa\3\2\2\2\30\u0120\3\2\2\2\32\u013a\3\2\2\2\34\u0144\3\2"+
		"\2\2\36 \7\3\2\2\37\36\3\2\2\2\37 \3\2\2\2 !\3\2\2\2!\"\5\b\5\2\"\3\3"+
		"\2\2\2#,\7\4\2\2$)\5\2\2\2%&\7\5\2\2&(\5\2\2\2\'%\3\2\2\2(+\3\2\2\2)\'"+
		"\3\2\2\2)*\3\2\2\2*-\3\2\2\2+)\3\2\2\2,$\3\2\2\2,-\3\2\2\2-.\3\2\2\2."+
		"/\7\6\2\2/\5\3\2\2\2\60\62\7$\2\2\61\63\5\4\3\2\62\61\3\2\2\2\62\63\3"+
		"\2\2\2\63\7\3\2\2\2\64\65\b\5\1\2\659\7$\2\2\668\5\4\3\2\67\66\3\2\2\2"+
		"8;\3\2\2\29\67\3\2\2\29:\3\2\2\2:h\3\2\2\2;9\3\2\2\2<h\7\'\2\2=h\7)\2"+
		"\2>h\t\2\2\2?h\7,\2\2@h\7-\2\2Ah\7\7\2\2Bh\7\b\2\2CD\7\t\2\2DE\5\b\5\2"+
		"EF\7\n\2\2Fh\3\2\2\2GH\7\13\2\2Hh\5\b\5\13IJ\7\f\2\2Jh\7$\2\2KL\7\r\2"+
		"\2LM\5\b\5\2MN\7\16\2\2NO\7$\2\2Oh\3\2\2\2PQ\5\6\4\2QZ\7\t\2\2RW\5\b\5"+
		"\2ST\7\5\2\2TV\5\b\5\2US\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X[\3\2\2"+
		"\2YW\3\2\2\2ZR\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\7\n\2\2]h\3\2\2\2^_\7\22"+
		"\2\2_`\5\b\5\2`d\7&\2\2ac\5\b\5\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2"+
		"\2\2eh\3\2\2\2fd\3\2\2\2g\64\3\2\2\2g<\3\2\2\2g=\3\2\2\2g>\3\2\2\2g?\3"+
		"\2\2\2g@\3\2\2\2gA\3\2\2\2gB\3\2\2\2gC\3\2\2\2gG\3\2\2\2gI\3\2\2\2gK\3"+
		"\2\2\2gP\3\2\2\2g^\3\2\2\2hw\3\2\2\2ij\f\7\2\2jk\t\3\2\2kv\5\b\5\blm\f"+
		"\6\2\2mn\t\4\2\2nv\5\b\5\7op\f\5\2\2pq\7.\2\2qv\5\b\5\6rs\f\3\2\2st\7"+
		"\23\2\2tv\7$\2\2ui\3\2\2\2ul\3\2\2\2uo\3\2\2\2ur\3\2\2\2vy\3\2\2\2wu\3"+
		"\2\2\2wx\3\2\2\2x\t\3\2\2\2yw\3\2\2\2z{\5\b\5\2{|\7\24\2\2|\u00d3\3\2"+
		"\2\2}~\7$\2\2~\u0080\7\3\2\2\177\u0081\5\b\5\2\u0080\177\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\7\25\2\2\u0083\u0084\5"+
		"\b\5\2\u0084\u0085\7\24\2\2\u0085\u00d3\3\2\2\2\u0086\u0087\7$\2\2\u0087"+
		"\u0088\7\25\2\2\u0088\u0089\5\b\5\2\u0089\u008a\7\24\2\2\u008a\u00d3\3"+
		"\2\2\2\u008b\u008c\7\26\2\2\u008c\u008d\7\t\2\2\u008d\u008e\5\b\5\2\u008e"+
		"\u008f\7\n\2\2\u008f\u0092\5\n\6\2\u0090\u0091\7\27\2\2\u0091\u0093\5"+
		"\n\6\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u00d3\3\2\2\2\u0094"+
		"\u0098\7\4\2\2\u0095\u0097\5\n\6\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2"+
		"\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009b\u00d3\7\6\2\2\u009c\u009d\7\30\2\2\u009d\u009e\5"+
		"\b\5\2\u009e\u009f\7\24\2\2\u009f\u00d3\3\2\2\2\u00a0\u00a1\7\31\2\2\u00a1"+
		"\u00a2\7\t\2\2\u00a2\u00a3\5\b\5\2\u00a3\u00a4\7\n\2\2\u00a4\u00a5\5\n"+
		"\6\2\u00a5\u00d3\3\2\2\2\u00a6\u00a7\7\32\2\2\u00a7\u00a8\7\t\2\2\u00a8"+
		"\u00ad\5\b\5\2\u00a9\u00aa\7\5\2\2\u00aa\u00ac\5\b\5\2\u00ab\u00a9\3\2"+
		"\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\7\5\2\2\u00b1\u00b2\7$"+
		"\2\2\u00b2\u00b3\7\n\2\2\u00b3\u00b4\7\24\2\2\u00b4\u00d3\3\2\2\2\u00b5"+
		"\u00b8\7\33\2\2\u00b6\u00b9\5\6\4\2\u00b7\u00b9\7\34\2\2\u00b8\u00b6\3"+
		"\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00c5\7\t\2\2\u00bb"+
		"\u00c0\5\f\7\2\u00bc\u00bd\7\5\2\2\u00bd\u00bf\5\f\7\2\u00be\u00bc\3\2"+
		"\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00c3\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\7\35\2\2\u00c4\u00c6\3"+
		"\2\2\2\u00c5\u00bb\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00ce\7$\2\2\u00c8\u00c9\7\36\2\2\u00c9\u00cb\5\b\5\2\u00ca\u00c8\3\2"+
		"\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\7\37\2\2\u00cd"+
		"\u00cf\5\b\5\2\u00ce\u00ca\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\u00d1\7\n\2\2\u00d1\u00d3\5\n\6\2\u00d2z\3\2\2\2\u00d2}\3\2"+
		"\2\2\u00d2\u0086\3\2\2\2\u00d2\u008b\3\2\2\2\u00d2\u0094\3\2\2\2\u00d2"+
		"\u009c\3\2\2\2\u00d2\u00a0\3\2\2\2\u00d2\u00a6\3\2\2\2\u00d2\u00b5\3\2"+
		"\2\2\u00d3\13\3\2\2\2\u00d4\u00d5\7$\2\2\u00d5\r\3\2\2\2\u00d6\u00d9\7"+
		"$\2\2\u00d7\u00d8\7 \2\2\u00d8\u00da\5\b\5\2\u00d9\u00d7\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\17\3\2\2\2\u00db\u00dc\5\b\5\2\u00dc\u00dd\7\25\2"+
		"\2\u00dd\u00de\5\b\5\2\u00de\u00e1\3\2\2\2\u00df\u00e1\5\b\5\2\u00e0\u00db"+
		"\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\21\3\2\2\2\u00e2\u00eb\7\4\2\2\u00e3"+
		"\u00e8\5\16\b\2\u00e4\u00e5\7\5\2\2\u00e5\u00e7\5\16\b\2\u00e6\u00e4\3"+
		"\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00e3\3\2\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ec\u00f1\3\2\2\2\u00ed\u00ee\7!\2\2\u00ee\u00f0\5\20\t\2\u00ef"+
		"\u00ed\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\7\6\2\2\u00f5"+
		"\23\3\2\2\2\u00f6\u00f7\7$\2\2\u00f7\u00f8\7\3\2\2\u00f8\u00f9\5\b\5\2"+
		"\u00f9\25\3\2\2\2\u00fa\u00fc\7$\2\2\u00fb\u00fd\5\22\n\2\u00fc\u00fb"+
		"\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0107\7\t\2\2\u00ff"+
		"\u0104\5\24\13\2\u0100\u0101\7\5\2\2\u0101\u0103\5\24\13\2\u0102\u0100"+
		"\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u00ff\3\2\2\2\u0107\u0108\3\2"+
		"\2\2\u0108\u0109\3\2\2\2\u0109\u010c\7\n\2\2\u010a\u010b\7\3\2\2\u010b"+
		"\u010d\5\b\5\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u011e\3\2"+
		"\2\2\u010e\u010f\7\25\2\2\u010f\u0113\7\4\2\2\u0110\u0112\5\n\6\2\u0111"+
		"\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2"+
		"\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0118\5\b\5\2\u0117"+
		"\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011f\7\6"+
		"\2\2\u011a\u011b\7\"\2\2\u011b\u011c\5\b\5\2\u011c\u011d\7\24\2\2\u011d"+
		"\u011f\3\2\2\2\u011e\u010e\3\2\2\2\u011e\u011a\3\2\2\2\u011f\27\3\2\2"+
		"\2\u0120\u0121\7#\2\2\u0121\u0125\7$\2\2\u0122\u0124\5\22\n\2\u0123\u0122"+
		"\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\u0138\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u0129\7\25\2\2\u0129\u012d\7"+
		"\4\2\2\u012a\u012c\5\n\6\2\u012b\u012a\3\2\2\2\u012c\u012f\3\2\2\2\u012d"+
		"\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2"+
		"\2\2\u0130\u0132\5\b\5\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\u0139\7\6\2\2\u0134\u0135\7\"\2\2\u0135\u0136\5\b"+
		"\5\2\u0136\u0137\7\24\2\2\u0137\u0139\3\2\2\2\u0138\u0128\3\2\2\2\u0138"+
		"\u0134\3\2\2\2\u0139\31\3\2\2\2\u013a\u013b\7%\2\2\u013b\u013c\7\25\2"+
		"\2\u013c\u013d\5\6\4\2\u013d\u013e\7\24\2\2\u013e\33\3\2\2\2\u013f\u0143"+
		"\5\26\f\2\u0140\u0143\5\32\16\2\u0141\u0143\5\30\r\2\u0142\u013f\3\2\2"+
		"\2\u0142\u0140\3\2\2\2\u0142\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142"+
		"\3\2\2\2\u0144\u0145\3\2\2\2\u0145\35\3\2\2\2\u0146\u0144\3\2\2\2)\37"+
		"),\629WZdguw\u0080\u0092\u0098\u00ad\u00b8\u00c0\u00c5\u00ca\u00ce\u00d2"+
		"\u00d9\u00e0\u00e8\u00eb\u00f1\u00fc\u0104\u0107\u010c\u0113\u0117\u011e"+
		"\u0125\u012d\u0131\u0138\u0142\u0144";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}