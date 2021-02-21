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
		T__17=18, NAME=19, SYMB=20, STR=21, INT=22, HEX=23, DEC=24, WS=25, COMMENT=26, 
		LINE_COMMENT=27;
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
			null, "'{'", "','", "'}'", "'*'", "'['", "']'", "'('", "')'", "'/'", 
			"'+'", "'-'", "'emit'", "';'", "':'", "'='", "'if'", "'&'", "'=>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "NAME", "SYMB", "STR", "INT", 
			"HEX", "DEC", "WS", "COMMENT", "LINE_COMMENT"
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
	public static class PtrExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PtrExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class GroupExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public GroupExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class VarExprContext extends ExprContext {
		public TerminalNode NAME() { return getToken(SingeliParser.NAME, 0); }
		public VarExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class IntExprContext extends ExprContext {
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
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new VarExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(39);
				match(NAME);
				}
				break;
			case 2:
				{
				_localctx = new PtrExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(40);
				match(T__3);
				setState(41);
				expr(8);
				}
				break;
			case 3:
				{
				_localctx = new VecExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(42);
				match(T__4);
				setState(43);
				expr(0);
				setState(44);
				match(T__5);
				setState(45);
				match(NAME);
				}
				break;
			case 4:
				{
				_localctx = new GroupExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(47);
				match(T__6);
				setState(48);
				expr(0);
				setState(49);
				match(T__7);
				}
				break;
			case 5:
				{
				_localctx = new IntExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(51);
				match(INT);
				}
				break;
			case 6:
				{
				_localctx = new CallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52);
				callable();
				setState(53);
				match(T__6);
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << T__11) | (1L << NAME) | (1L << INT))) != 0)) {
					{
					setState(54);
					expr(0);
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(55);
						match(T__1);
						setState(56);
						expr(0);
						}
						}
						setState(61);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(64);
				match(T__7);
				}
				break;
			case 7:
				{
				_localctx = new EmitExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				match(T__11);
				setState(67);
				expr(0);
				setState(68);
				match(STR);
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(69);
						expr(0);
						}
						} 
					}
					setState(74);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(83);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new MulExprContext(new ExprContext(_parentctx, _parentState));
						((MulExprContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(77);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(78);
						((MulExprContext)_localctx).ref = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__3 || _la==T__8) ) {
							((MulExprContext)_localctx).ref = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(79);
						((MulExprContext)_localctx).r = expr(4);
						}
						break;
					case 2:
						{
						_localctx = new AddExprContext(new ExprContext(_parentctx, _parentState));
						((AddExprContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(80);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(81);
						((AddExprContext)_localctx).ref = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__9 || _la==T__10) ) {
							((AddExprContext)_localctx).ref = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(82);
						((AddExprContext)_localctx).r = expr(3);
						}
						break;
					}
					} 
				}
				setState(87);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SttContext stt() {
			return getRuleContext(SttContext.class,0);
		}
		public IfSttContext(SttContext ctx) { copyFrom(ctx); }
	}
	public static class ExprSttContext extends SttContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprSttContext(SttContext ctx) { copyFrom(ctx); }
	}
	public static class NvarSttContext extends SttContext {
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
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new ExprSttContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				expr(0);
				setState(89);
				match(T__12);
				}
				break;
			case 2:
				_localctx = new NvarSttContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(NAME);
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(92);
					match(T__13);
					setState(93);
					((NvarSttContext)_localctx).t = expr(0);
					}
				}

				setState(96);
				match(T__14);
				setState(97);
				((NvarSttContext)_localctx).v = expr(0);
				setState(98);
				match(T__12);
				}
				break;
			case 3:
				_localctx = new IfSttContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				match(T__15);
				setState(101);
				match(T__6);
				setState(102);
				expr(0);
				setState(103);
				match(T__7);
				setState(104);
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

	public static class TargContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(SingeliParser.NAME, 0); }
		public TargContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_targ; }
	}

	public final TargContext targ() throws RecognitionException {
		TargContext _localctx = new TargContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_targ);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
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

	public final TreqContext treq() throws RecognitionException {
		TreqContext _localctx = new TreqContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_treq);
		try {
			_localctx = new EqReqContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			((EqReqContext)_localctx).l = expr(0);
			setState(111);
			match(T__14);
			setState(112);
			((EqReqContext)_localctx).r = expr(0);
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
			setState(114);
			match(NAME);
			setState(115);
			match(T__13);
			setState(116);
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
			setState(118);
			match(NAME);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(119);
				match(T__0);
				setState(120);
				targ();
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(121);
					match(T__1);
					setState(122);
					targ();
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(128);
					match(T__16);
					setState(129);
					treq();
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(135);
				match(T__2);
				}
			}

			setState(139);
			match(T__6);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(140);
				arg();
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(141);
					match(T__1);
					setState(142);
					arg();
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(150);
			match(T__7);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(151);
				match(T__13);
				setState(152);
				((FnContext)_localctx).retT = expr(0);
				}
			}

			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(155);
				match(T__0);
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(156);
						stt();
						}
						} 
					}
					setState(161);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << T__11) | (1L << NAME) | (1L << INT))) != 0)) {
					{
					setState(162);
					((FnContext)_localctx).retV = expr(0);
					}
				}

				setState(165);
				match(T__2);
				}
				break;
			case T__17:
				{
				setState(166);
				match(T__17);
				setState(167);
				((FnContext)_localctx).retV = expr(0);
				setState(168);
				match(T__12);
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
			setState(172);
			match(SYMB);
			setState(173);
			match(T__14);
			setState(174);
			callable();
			setState(175);
			match(T__12);
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
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME || _la==SYMB) {
				{
				setState(179);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NAME:
					{
					setState(177);
					fn();
					}
					break;
				case SYMB:
					{
					setState(178);
					export();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(183);
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
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u00bb\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\5\2\31\n\2\3\3\3\3\3\3\3\3\3\3\7\3 \n\3\f\3\16\3#\13\3\3"+
		"\3\3\3\5\3\'\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\7\4<\n\4\f\4\16\4?\13\4\5\4A\n\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\7\4I\n\4\f\4\16\4L\13\4\5\4N\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7"+
		"\4V\n\4\f\4\16\4Y\13\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5a\n\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5m\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\7\t~\n\t\f\t\16\t\u0081\13\t\3\t\3\t\7\t\u0085"+
		"\n\t\f\t\16\t\u0088\13\t\3\t\3\t\5\t\u008c\n\t\3\t\3\t\3\t\3\t\7\t\u0092"+
		"\n\t\f\t\16\t\u0095\13\t\5\t\u0097\n\t\3\t\3\t\3\t\5\t\u009c\n\t\3\t\3"+
		"\t\7\t\u00a0\n\t\f\t\16\t\u00a3\13\t\3\t\5\t\u00a6\n\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u00ad\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\7\13\u00b6\n\13\f\13"+
		"\16\13\u00b9\13\13\3\13\2\3\6\f\2\4\6\b\n\f\16\20\22\24\2\4\4\2\6\6\13"+
		"\13\3\2\f\r\2\u00cc\2\30\3\2\2\2\4\32\3\2\2\2\6M\3\2\2\2\bl\3\2\2\2\n"+
		"n\3\2\2\2\fp\3\2\2\2\16t\3\2\2\2\20x\3\2\2\2\22\u00ae\3\2\2\2\24\u00b7"+
		"\3\2\2\2\26\31\5\6\4\2\27\31\5\4\3\2\30\26\3\2\2\2\30\27\3\2\2\2\31\3"+
		"\3\2\2\2\32&\7\25\2\2\33\34\7\3\2\2\34!\5\2\2\2\35\36\7\4\2\2\36 \5\2"+
		"\2\2\37\35\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2"+
		"\2$%\7\5\2\2%\'\3\2\2\2&\33\3\2\2\2&\'\3\2\2\2\'\5\3\2\2\2()\b\4\1\2)"+
		"N\7\25\2\2*+\7\6\2\2+N\5\6\4\n,-\7\7\2\2-.\5\6\4\2./\7\b\2\2/\60\7\25"+
		"\2\2\60N\3\2\2\2\61\62\7\t\2\2\62\63\5\6\4\2\63\64\7\n\2\2\64N\3\2\2\2"+
		"\65N\7\30\2\2\66\67\5\4\3\2\67@\7\t\2\28=\5\6\4\29:\7\4\2\2:<\5\6\4\2"+
		";9\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>A\3\2\2\2?=\3\2\2\2@8\3\2\2\2"+
		"@A\3\2\2\2AB\3\2\2\2BC\7\n\2\2CN\3\2\2\2DE\7\16\2\2EF\5\6\4\2FJ\7\27\2"+
		"\2GI\5\6\4\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KN\3\2\2\2LJ\3\2\2"+
		"\2M(\3\2\2\2M*\3\2\2\2M,\3\2\2\2M\61\3\2\2\2M\65\3\2\2\2M\66\3\2\2\2M"+
		"D\3\2\2\2NW\3\2\2\2OP\f\5\2\2PQ\t\2\2\2QV\5\6\4\6RS\f\4\2\2ST\t\3\2\2"+
		"TV\5\6\4\5UO\3\2\2\2UR\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\7\3\2\2"+
		"\2YW\3\2\2\2Z[\5\6\4\2[\\\7\17\2\2\\m\3\2\2\2]`\7\25\2\2^_\7\20\2\2_a"+
		"\5\6\4\2`^\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\7\21\2\2cd\5\6\4\2de\7\17\2\2"+
		"em\3\2\2\2fg\7\22\2\2gh\7\t\2\2hi\5\6\4\2ij\7\n\2\2jk\5\b\5\2km\3\2\2"+
		"\2lZ\3\2\2\2l]\3\2\2\2lf\3\2\2\2m\t\3\2\2\2no\7\25\2\2o\13\3\2\2\2pq\5"+
		"\6\4\2qr\7\21\2\2rs\5\6\4\2s\r\3\2\2\2tu\7\25\2\2uv\7\20\2\2vw\5\6\4\2"+
		"w\17\3\2\2\2x\u008b\7\25\2\2yz\7\3\2\2z\177\5\n\6\2{|\7\4\2\2|~\5\n\6"+
		"\2}{\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0086"+
		"\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\7\23\2\2\u0083\u0085\5\f\7\2\u0084"+
		"\u0082\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7\5\2\2\u008a"+
		"\u008c\3\2\2\2\u008by\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2"+
		"\u008d\u0096\7\t\2\2\u008e\u0093\5\16\b\2\u008f\u0090\7\4\2\2\u0090\u0092"+
		"\5\16\b\2\u0091\u008f\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2"+
		"\u0093\u0094\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u008e"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009b\7\n\2\2\u0099"+
		"\u009a\7\20\2\2\u009a\u009c\5\6\4\2\u009b\u0099\3\2\2\2\u009b\u009c\3"+
		"\2\2\2\u009c\u00ac\3\2\2\2\u009d\u00a1\7\3\2\2\u009e\u00a0\5\b\5\2\u009f"+
		"\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a6\5\6\4\2\u00a5"+
		"\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00ad\7\5"+
		"\2\2\u00a8\u00a9\7\24\2\2\u00a9\u00aa\5\6\4\2\u00aa\u00ab\7\17\2\2\u00ab"+
		"\u00ad\3\2\2\2\u00ac\u009d\3\2\2\2\u00ac\u00a8\3\2\2\2\u00ad\21\3\2\2"+
		"\2\u00ae\u00af\7\26\2\2\u00af\u00b0\7\21\2\2\u00b0\u00b1\5\4\3\2\u00b1"+
		"\u00b2\7\17\2\2\u00b2\23\3\2\2\2\u00b3\u00b6\5\20\t\2\u00b4\u00b6\5\22"+
		"\n\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\25\3\2\2\2\u00b9\u00b7\3\2\2"+
		"\2\30\30!&=@JMUW`l\177\u0086\u008b\u0093\u0096\u009b\u00a1\u00a5\u00ac"+
		"\u00b5\u00b7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}