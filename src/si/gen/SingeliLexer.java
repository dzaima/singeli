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
		NAME=18, SYMB=19, STR=20, INT=21, HEX=22, DEC=23, WS=24, COMMENT=25, LINE_COMMENT=26;
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
			"NAME", "SYMB", "STR", "INT", "HEX", "DEC", "WS", "COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "','", "'}'", "'*'", "'['", "']'", "'('", "')'", "'/'", 
			"'+'", "'-'", "'emit'", "';'", "':'", "'='", "'&'", "'=>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "NAME", "SYMB", "STR", "INT", "HEX", 
			"DEC", "WS", "COMMENT", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00b8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\7\23`\n\23"+
		"\f\23\16\23c\13\23\3\24\3\24\3\24\7\24h\n\24\f\24\16\24k\13\24\3\24\3"+
		"\24\3\25\3\25\7\25q\n\25\f\25\16\25t\13\25\3\25\3\25\3\26\3\26\7\26z\n"+
		"\26\f\26\16\26}\13\26\3\26\5\26\u0080\n\26\3\27\3\27\3\27\6\27\u0085\n"+
		"\27\r\27\16\27\u0086\3\30\3\30\3\30\6\30\u008c\n\30\r\30\16\30\u008d\3"+
		"\30\3\30\6\30\u0092\n\30\r\30\16\30\u0093\3\30\5\30\u0097\n\30\3\31\6"+
		"\31\u009a\n\31\r\31\16\31\u009b\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u00a4"+
		"\n\32\f\32\16\32\u00a7\13\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\33\7\33\u00b2\n\33\f\33\16\33\u00b5\13\33\3\33\3\33\3\u00a5\2\34\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\3\2\f\5\2C\\aac|\6"+
		"\2\62;C\\aac|\6\2&&C\\aac|\7\2&&\62;C\\aac|\3\2$$\3\2\63;\3\2\62;\5\2"+
		"\62;CHch\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u00c4\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\59\3\2\2\2\7;\3\2\2\2\t=\3\2\2\2\13?"+
		"\3\2\2\2\rA\3\2\2\2\17C\3\2\2\2\21E\3\2\2\2\23G\3\2\2\2\25I\3\2\2\2\27"+
		"K\3\2\2\2\31M\3\2\2\2\33R\3\2\2\2\35T\3\2\2\2\37V\3\2\2\2!X\3\2\2\2#Z"+
		"\3\2\2\2%]\3\2\2\2\'d\3\2\2\2)n\3\2\2\2+\177\3\2\2\2-\u0081\3\2\2\2/\u0096"+
		"\3\2\2\2\61\u0099\3\2\2\2\63\u009f\3\2\2\2\65\u00ad\3\2\2\2\678\7}\2\2"+
		"8\4\3\2\2\29:\7.\2\2:\6\3\2\2\2;<\7\177\2\2<\b\3\2\2\2=>\7,\2\2>\n\3\2"+
		"\2\2?@\7]\2\2@\f\3\2\2\2AB\7_\2\2B\16\3\2\2\2CD\7*\2\2D\20\3\2\2\2EF\7"+
		"+\2\2F\22\3\2\2\2GH\7\61\2\2H\24\3\2\2\2IJ\7-\2\2J\26\3\2\2\2KL\7/\2\2"+
		"L\30\3\2\2\2MN\7g\2\2NO\7o\2\2OP\7k\2\2PQ\7v\2\2Q\32\3\2\2\2RS\7=\2\2"+
		"S\34\3\2\2\2TU\7<\2\2U\36\3\2\2\2VW\7?\2\2W \3\2\2\2XY\7(\2\2Y\"\3\2\2"+
		"\2Z[\7?\2\2[\\\7@\2\2\\$\3\2\2\2]a\t\2\2\2^`\t\3\2\2_^\3\2\2\2`c\3\2\2"+
		"\2a_\3\2\2\2ab\3\2\2\2b&\3\2\2\2ca\3\2\2\2de\7)\2\2ei\t\4\2\2fh\t\5\2"+
		"\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\7)\2"+
		"\2m(\3\2\2\2nr\7$\2\2oq\n\6\2\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2"+
		"\2su\3\2\2\2tr\3\2\2\2uv\7$\2\2v*\3\2\2\2w{\t\7\2\2xz\t\b\2\2yx\3\2\2"+
		"\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\u0080\3\2\2\2}{\3\2\2\2~\u0080\7\62"+
		"\2\2\177w\3\2\2\2\177~\3\2\2\2\u0080,\3\2\2\2\u0081\u0082\7\62\2\2\u0082"+
		"\u0084\7z\2\2\u0083\u0085\t\t\2\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087.\3\2\2\2\u0088\u0089"+
		"\5+\26\2\u0089\u008b\7\60\2\2\u008a\u008c\t\b\2\2\u008b\u008a\3\2\2\2"+
		"\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0097"+
		"\3\2\2\2\u008f\u0091\7\60\2\2\u0090\u0092\t\b\2\2\u0091\u0090\3\2\2\2"+
		"\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0097"+
		"\3\2\2\2\u0095\u0097\5+\26\2\u0096\u0088\3\2\2\2\u0096\u008f\3\2\2\2\u0096"+
		"\u0095\3\2\2\2\u0097\60\3\2\2\2\u0098\u009a\t\n\2\2\u0099\u0098\3\2\2"+
		"\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d"+
		"\3\2\2\2\u009d\u009e\b\31\2\2\u009e\62\3\2\2\2\u009f\u00a0\7\61\2\2\u00a0"+
		"\u00a1\7,\2\2\u00a1\u00a5\3\2\2\2\u00a2\u00a4\13\2\2\2\u00a3\u00a2\3\2"+
		"\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6"+
		"\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\7,\2\2\u00a9\u00aa\7\61"+
		"\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\b\32\3\2\u00ac\64\3\2\2\2\u00ad\u00ae"+
		"\7\61\2\2\u00ae\u00af\7\61\2\2\u00af\u00b3\3\2\2\2\u00b0\u00b2\n\13\2"+
		"\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4"+
		"\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\b\33\3\2"+
		"\u00b7\66\3\2\2\2\17\2air{\177\u0086\u008d\u0093\u0096\u009b\u00a5\u00b3"+
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