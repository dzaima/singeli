// Generated from Singeli.g4 by ANTLR 4.9.1
package si.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SingeliLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, NAME=21, SYMB=22, STR=23, INT=24, HEX=25, 
		DEC=26, WS=27, COMMENT=28, LINE_COMMENT=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "NAME", "SYMB", "STR", "INT", "HEX", "DEC", 
			"WS", "COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "','", "'}'", "'true'", "'false'", "'*'", "'['", "']'", 
			"'('", "')'", "'/'", "'+'", "'-'", "'emit'", "'.'", "';'", "':'", "'='", 
			"'&'", "'=>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "NAME", "SYMB", 
			"STR", "INT", "HEX", "DEC", "WS", "COMMENT", "LINE_COMMENT"
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


	public SingeliLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Singeli.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u00cd\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\25\3\26\3\26\7\26s\n\26\f\26\16\26v\13\26\3\27\3\27\3\27\7\27{\n\27\f"+
		"\27\16\27~\13\27\3\27\3\27\3\30\3\30\7\30\u0084\n\30\f\30\16\30\u0087"+
		"\13\30\3\30\3\30\3\31\3\31\7\31\u008d\n\31\f\31\16\31\u0090\13\31\3\31"+
		"\5\31\u0093\n\31\3\32\3\32\3\32\6\32\u0098\n\32\r\32\16\32\u0099\3\33"+
		"\3\33\3\33\6\33\u009f\n\33\r\33\16\33\u00a0\3\33\3\33\6\33\u00a5\n\33"+
		"\r\33\16\33\u00a6\3\33\5\33\u00aa\n\33\3\34\6\34\u00ad\n\34\r\34\16\34"+
		"\u00ae\3\34\3\34\3\35\3\35\3\35\3\35\7\35\u00b7\n\35\f\35\16\35\u00ba"+
		"\13\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\5\36\u00c4\n\36\3\36\7"+
		"\36\u00c7\n\36\f\36\16\36\u00ca\13\36\3\36\3\36\3\u00b8\2\37\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37\3\2\f\5"+
		"\2C\\aac|\6\2\62;C\\aac|\6\2&&C\\aac|\7\2&&\62;C\\aac|\3\2$$\3\2\63;\3"+
		"\2\62;\5\2\62;CHch\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u00da\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3"+
		"\2\2\2\5?\3\2\2\2\7A\3\2\2\2\tC\3\2\2\2\13H\3\2\2\2\rN\3\2\2\2\17P\3\2"+
		"\2\2\21R\3\2\2\2\23T\3\2\2\2\25V\3\2\2\2\27X\3\2\2\2\31Z\3\2\2\2\33\\"+
		"\3\2\2\2\35^\3\2\2\2\37c\3\2\2\2!e\3\2\2\2#g\3\2\2\2%i\3\2\2\2\'k\3\2"+
		"\2\2)m\3\2\2\2+p\3\2\2\2-w\3\2\2\2/\u0081\3\2\2\2\61\u0092\3\2\2\2\63"+
		"\u0094\3\2\2\2\65\u00a9\3\2\2\2\67\u00ac\3\2\2\29\u00b2\3\2\2\2;\u00c3"+
		"\3\2\2\2=>\7}\2\2>\4\3\2\2\2?@\7.\2\2@\6\3\2\2\2AB\7\177\2\2B\b\3\2\2"+
		"\2CD\7v\2\2DE\7t\2\2EF\7w\2\2FG\7g\2\2G\n\3\2\2\2HI\7h\2\2IJ\7c\2\2JK"+
		"\7n\2\2KL\7u\2\2LM\7g\2\2M\f\3\2\2\2NO\7,\2\2O\16\3\2\2\2PQ\7]\2\2Q\20"+
		"\3\2\2\2RS\7_\2\2S\22\3\2\2\2TU\7*\2\2U\24\3\2\2\2VW\7+\2\2W\26\3\2\2"+
		"\2XY\7\61\2\2Y\30\3\2\2\2Z[\7-\2\2[\32\3\2\2\2\\]\7/\2\2]\34\3\2\2\2^"+
		"_\7g\2\2_`\7o\2\2`a\7k\2\2ab\7v\2\2b\36\3\2\2\2cd\7\60\2\2d \3\2\2\2e"+
		"f\7=\2\2f\"\3\2\2\2gh\7<\2\2h$\3\2\2\2ij\7?\2\2j&\3\2\2\2kl\7(\2\2l(\3"+
		"\2\2\2mn\7?\2\2no\7@\2\2o*\3\2\2\2pt\t\2\2\2qs\t\3\2\2rq\3\2\2\2sv\3\2"+
		"\2\2tr\3\2\2\2tu\3\2\2\2u,\3\2\2\2vt\3\2\2\2wx\7)\2\2x|\t\4\2\2y{\t\5"+
		"\2\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177"+
		"\u0080\7)\2\2\u0080.\3\2\2\2\u0081\u0085\7$\2\2\u0082\u0084\n\6\2\2\u0083"+
		"\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\7$\2\2\u0089"+
		"\60\3\2\2\2\u008a\u008e\t\7\2\2\u008b\u008d\t\b\2\2\u008c\u008b\3\2\2"+
		"\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0093"+
		"\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0093\7\62\2\2\u0092\u008a\3\2\2\2"+
		"\u0092\u0091\3\2\2\2\u0093\62\3\2\2\2\u0094\u0095\7\62\2\2\u0095\u0097"+
		"\7z\2\2\u0096\u0098\t\t\2\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\64\3\2\2\2\u009b\u009c\5\61\31"+
		"\2\u009c\u009e\7\60\2\2\u009d\u009f\t\b\2\2\u009e\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00aa\3\2"+
		"\2\2\u00a2\u00a4\7\60\2\2\u00a3\u00a5\t\b\2\2\u00a4\u00a3\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00aa\3\2"+
		"\2\2\u00a8\u00aa\5\61\31\2\u00a9\u009b\3\2\2\2\u00a9\u00a2\3\2\2\2\u00a9"+
		"\u00a8\3\2\2\2\u00aa\66\3\2\2\2\u00ab\u00ad\t\n\2\2\u00ac\u00ab\3\2\2"+
		"\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0\u00b1\b\34\2\2\u00b18\3\2\2\2\u00b2\u00b3\7\61\2\2\u00b3"+
		"\u00b4\7,\2\2\u00b4\u00b8\3\2\2\2\u00b5\u00b7\13\2\2\2\u00b6\u00b5\3\2"+
		"\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9"+
		"\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\7,\2\2\u00bc\u00bd\7\61"+
		"\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\b\35\3\2\u00bf:\3\2\2\2\u00c0\u00c1"+
		"\7\61\2\2\u00c1\u00c4\7\61\2\2\u00c2\u00c4\7%\2\2\u00c3\u00c0\3\2\2\2"+
		"\u00c3\u00c2\3\2\2\2\u00c4\u00c8\3\2\2\2\u00c5\u00c7\n\13\2\2\u00c6\u00c5"+
		"\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\b\36\3\2\u00cc<\3\2\2\2"+
		"\20\2t|\u0085\u008e\u0092\u0099\u00a0\u00a6\u00a9\u00ae\u00b8\u00c3\u00c8"+
		"\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}