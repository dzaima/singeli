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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, NAME=15, SYMB=16, INT=17, 
		HEX=18, DEC=19, WS=20, COMMENT=21, LINE_COMMENT=22;
	public static final int
		RULE_type = 0, RULE_texpr = 1, RULE_callable = 2, RULE_expr = 3, RULE_stt = 4, 
		RULE_targ = 5, RULE_arg = 6, RULE_fn = 7, RULE_export = 8, RULE_prog = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"type", "texpr", "callable", "expr", "stt", "targ", "arg", "fn", "export", 
			"prog"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'$'", "'['", "']'", "'{'", "','", "'}'", "'('", "')'", 
			"'+'", "';'", "':'", "'='", "'=>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "NAME", "SYMB", "INT", "HEX", "DEC", "WS", "COMMENT", 
			"LINE_COMMENT"
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MulContext extends TypeContext {
		public TerminalNode INT() { return getToken(SingeliParser.INT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MulContext(TypeContext ctx) { copyFrom(ctx); }
	}
	public static class VecContext extends TypeContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NAME() { return getToken(SingeliParser.NAME, 0); }
		public VecContext(TypeContext ctx) { copyFrom(ctx); }
	}
	public static class NameContext extends TypeContext {
		public TerminalNode NAME() { return getToken(SingeliParser.NAME, 0); }
		public NameContext(TypeContext ctx) { copyFrom(ctx); }
	}
	public static class FregContext extends TypeContext {
		public TerminalNode NAME() { return getToken(SingeliParser.NAME, 0); }
		public FregContext(TypeContext ctx) { copyFrom(ctx); }
	}
	public static class PtrContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public PtrContext(TypeContext ctx) { copyFrom(ctx); }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_type);
		try {
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				_localctx = new NameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				match(NAME);
				}
				break;
			case T__0:
				_localctx = new PtrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				match(T__0);
				setState(22);
				type();
				}
				break;
			case INT:
				_localctx = new MulContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(23);
				match(INT);
				setState(24);
				match(T__0);
				setState(25);
				type();
				}
				break;
			case T__1:
				_localctx = new FregContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(26);
				match(T__1);
				setState(27);
				match(NAME);
				}
				break;
			case T__2:
				_localctx = new VecContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(28);
				match(T__2);
				setState(29);
				expr(0);
				setState(30);
				match(T__3);
				setState(31);
				match(NAME);
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

	public static class TexprContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
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
		enterRule(_localctx, 2, RULE_texpr);
		try {
			setState(37);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				expr(0);
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
		enterRule(_localctx, 4, RULE_callable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(NAME);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(40);
				match(T__4);
				setState(41);
				texpr();
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(42);
					match(T__5);
					setState(43);
					texpr();
					}
					}
					setState(48);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(49);
				match(T__6);
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
	public static class VarExprContext extends ExprContext {
		public TerminalNode NAME() { return getToken(SingeliParser.NAME, 0); }
		public VarExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class IntExprContext extends ExprContext {
		public TerminalNode INT() { return getToken(SingeliParser.INT, 0); }
		public IntExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AddExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class MulExprContext extends ExprContext {
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new VarExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(54);
				match(NAME);
				}
				break;
			case 2:
				{
				_localctx = new IntExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55);
				match(INT);
				}
				break;
			case 3:
				{
				_localctx = new CallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56);
				callable();
				setState(57);
				match(T__7);
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NAME || _la==INT) {
					{
					setState(58);
					expr(0);
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__5) {
						{
						{
						setState(59);
						match(T__5);
						setState(60);
						expr(0);
						}
						}
						setState(65);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(68);
				match(T__8);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(80);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(78);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new MulExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(72);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(73);
						match(T__0);
						setState(74);
						expr(3);
						}
						break;
					case 2:
						{
						_localctx = new AddExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(75);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(76);
						match(T__9);
						setState(77);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(82);
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
	public static class ExprSttContext extends SttContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprSttContext(SttContext ctx) { copyFrom(ctx); }
	}
	public static class NvarSttContext extends SttContext {
		public TerminalNode NAME() { return getToken(SingeliParser.NAME, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NvarSttContext(SttContext ctx) { copyFrom(ctx); }
	}

	public final SttContext stt() throws RecognitionException {
		SttContext _localctx = new SttContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stt);
		int _la;
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new ExprSttContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				expr(0);
				setState(84);
				match(T__10);
				}
				break;
			case 2:
				_localctx = new NvarSttContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(NAME);
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(87);
					match(T__11);
					setState(88);
					type();
					}
				}

				setState(91);
				match(T__12);
				setState(92);
				expr(0);
				setState(93);
				match(T__10);
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
		enterRule(_localctx, 10, RULE_targ);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
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

	public static class ArgContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(SingeliParser.NAME, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
			setState(99);
			match(NAME);
			setState(100);
			match(T__11);
			setState(101);
			type();
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
		public TerminalNode NAME() { return getToken(SingeliParser.NAME, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
		enterRule(_localctx, 14, RULE_fn);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(NAME);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(104);
				match(T__4);
				setState(105);
				targ();
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(106);
					match(T__5);
					setState(107);
					targ();
					}
					}
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(113);
				match(T__6);
				}
			}

			setState(117);
			match(T__7);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(118);
				arg();
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(119);
					match(T__5);
					setState(120);
					arg();
					}
					}
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(128);
			match(T__8);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(129);
				match(T__11);
				setState(130);
				type();
				}
			}

			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				setState(133);
				match(T__4);
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(134);
						stt();
						}
						} 
					}
					setState(139);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NAME || _la==INT) {
					{
					setState(140);
					expr(0);
					}
				}

				setState(143);
				match(T__6);
				}
				break;
			case T__13:
				{
				setState(144);
				match(T__13);
				setState(145);
				expr(0);
				setState(146);
				match(T__10);
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
			setState(150);
			match(SYMB);
			setState(151);
			match(T__12);
			setState(152);
			callable();
			setState(153);
			match(T__10);
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
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME || _la==SYMB) {
				{
				setState(157);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NAME:
					{
					setState(155);
					fn();
					}
					break;
				case SYMB:
					{
					setState(156);
					export();
					}
					break;
				default:
					throw new NoViableAltException(this);
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
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30\u00a5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2$\n\2\3\3"+
		"\3\3\5\3(\n\3\3\4\3\4\3\4\3\4\3\4\7\4/\n\4\f\4\16\4\62\13\4\3\4\3\4\5"+
		"\4\66\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5@\n\5\f\5\16\5C\13\5\5\5"+
		"E\n\5\3\5\3\5\5\5I\n\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5Q\n\5\f\5\16\5T\13\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6\\\n\6\3\6\3\6\3\6\3\6\5\6b\n\6\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\to\n\t\f\t\16\tr\13\t\3\t\3\t\5\t"+
		"v\n\t\3\t\3\t\3\t\3\t\7\t|\n\t\f\t\16\t\177\13\t\5\t\u0081\n\t\3\t\3\t"+
		"\3\t\5\t\u0086\n\t\3\t\3\t\7\t\u008a\n\t\f\t\16\t\u008d\13\t\3\t\5\t\u0090"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u0097\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\7"+
		"\13\u00a0\n\13\f\13\16\13\u00a3\13\13\3\13\2\3\b\f\2\4\6\b\n\f\16\20\22"+
		"\24\2\2\2\u00b3\2#\3\2\2\2\4\'\3\2\2\2\6)\3\2\2\2\bH\3\2\2\2\na\3\2\2"+
		"\2\fc\3\2\2\2\16e\3\2\2\2\20i\3\2\2\2\22\u0098\3\2\2\2\24\u00a1\3\2\2"+
		"\2\26$\7\21\2\2\27\30\7\3\2\2\30$\5\2\2\2\31\32\7\23\2\2\32\33\7\3\2\2"+
		"\33$\5\2\2\2\34\35\7\4\2\2\35$\7\21\2\2\36\37\7\5\2\2\37 \5\b\5\2 !\7"+
		"\6\2\2!\"\7\21\2\2\"$\3\2\2\2#\26\3\2\2\2#\27\3\2\2\2#\31\3\2\2\2#\34"+
		"\3\2\2\2#\36\3\2\2\2$\3\3\2\2\2%(\5\2\2\2&(\5\b\5\2\'%\3\2\2\2\'&\3\2"+
		"\2\2(\5\3\2\2\2)\65\7\21\2\2*+\7\7\2\2+\60\5\4\3\2,-\7\b\2\2-/\5\4\3\2"+
		".,\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62\60\3"+
		"\2\2\2\63\64\7\t\2\2\64\66\3\2\2\2\65*\3\2\2\2\65\66\3\2\2\2\66\7\3\2"+
		"\2\2\678\b\5\1\28I\7\21\2\29I\7\23\2\2:;\5\6\4\2;D\7\n\2\2<A\5\b\5\2="+
		">\7\b\2\2>@\5\b\5\2?=\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BE\3\2\2\2"+
		"CA\3\2\2\2D<\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\7\13\2\2GI\3\2\2\2H\67\3\2"+
		"\2\2H9\3\2\2\2H:\3\2\2\2IR\3\2\2\2JK\f\4\2\2KL\7\3\2\2LQ\5\b\5\5MN\f\3"+
		"\2\2NO\7\f\2\2OQ\5\b\5\4PJ\3\2\2\2PM\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2"+
		"\2\2S\t\3\2\2\2TR\3\2\2\2UV\5\b\5\2VW\7\r\2\2Wb\3\2\2\2X[\7\21\2\2YZ\7"+
		"\16\2\2Z\\\5\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\7\17\2\2^_\5\b\5"+
		"\2_`\7\r\2\2`b\3\2\2\2aU\3\2\2\2aX\3\2\2\2b\13\3\2\2\2cd\7\21\2\2d\r\3"+
		"\2\2\2ef\7\21\2\2fg\7\16\2\2gh\5\2\2\2h\17\3\2\2\2iu\7\21\2\2jk\7\7\2"+
		"\2kp\5\f\7\2lm\7\b\2\2mo\5\f\7\2nl\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2"+
		"\2qs\3\2\2\2rp\3\2\2\2st\7\t\2\2tv\3\2\2\2uj\3\2\2\2uv\3\2\2\2vw\3\2\2"+
		"\2w\u0080\7\n\2\2x}\5\16\b\2yz\7\b\2\2z|\5\16\b\2{y\3\2\2\2|\177\3\2\2"+
		"\2}{\3\2\2\2}~\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\u0080x\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0085\7\13\2\2\u0083\u0084\7"+
		"\16\2\2\u0084\u0086\5\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0096\3\2\2\2\u0087\u008b\7\7\2\2\u0088\u008a\5\n\6\2\u0089\u0088\3\2"+
		"\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u0090\5\b\5\2\u008f\u008e\3\2"+
		"\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0097\7\t\2\2\u0092"+
		"\u0093\7\20\2\2\u0093\u0094\5\b\5\2\u0094\u0095\7\r\2\2\u0095\u0097\3"+
		"\2\2\2\u0096\u0087\3\2\2\2\u0096\u0092\3\2\2\2\u0097\21\3\2\2\2\u0098"+
		"\u0099\7\22\2\2\u0099\u009a\7\17\2\2\u009a\u009b\5\6\4\2\u009b\u009c\7"+
		"\r\2\2\u009c\23\3\2\2\2\u009d\u00a0\5\20\t\2\u009e\u00a0\5\22\n\2\u009f"+
		"\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a1\u00a2\3\2\2\2\u00a2\25\3\2\2\2\u00a3\u00a1\3\2\2\2\27#\'\60"+
		"\65ADHPR[apu}\u0080\u0085\u008b\u008f\u0096\u009f\u00a1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}