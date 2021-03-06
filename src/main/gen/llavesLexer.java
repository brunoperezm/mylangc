// Generated from /Users/bruno/IdeaProjects/parser/src/main/antlr/llaves.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class llavesLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, LA=2, LC=3, PA=4, PC=5, IF_KEY=6, FOR_KEY=7, WHILE_KEY=8, CHAR_ASIGNACION=9, 
		EQU=10, LT=11, LEQ=12, GT=13, GEQ=14, NEQ=15, ADD=16, SUB=17, MUL=18, 
		DIV=19, MOD=20, INT_TYPE=21, LONG_TYPE=22, BOOLEAN_TYPE=23, ENTERO=24, 
		IDS=25, OPERADOR=26, INCREMENTO=27, OTRO=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "LA", "LC", "PA", "PC", "IF_KEY", "FOR_KEY", "WHILE_KEY", "CHAR_ASIGNACION", 
			"EQU", "LT", "LEQ", "GT", "GEQ", "NEQ", "ADD", "SUB", "MUL", "DIV", "MOD", 
			"INT_TYPE", "LONG_TYPE", "BOOLEAN_TYPE", "LETRA", "DIGITO", "ENTERO", 
			"IDS", "OPERADOR", "INCREMENTO", "OTRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'{'", "'}'", "'('", "')'", "'if'", "'for'", "'while'", 
			"'='", "'=='", "'<'", "'<='", "'>'", "'>='", "'!='", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'int'", "'long'", "'boolean'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "LA", "LC", "PA", "PC", "IF_KEY", "FOR_KEY", "WHILE_KEY", 
			"CHAR_ASIGNACION", "EQU", "LT", "LEQ", "GT", "GEQ", "NEQ", "ADD", "SUB", 
			"MUL", "DIV", "MOD", "INT_TYPE", "LONG_TYPE", "BOOLEAN_TYPE", "ENTERO", 
			"IDS", "OPERADOR", "INCREMENTO", "OTRO"
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


	public llavesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "llaves.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00a9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\6\33\u0089\n\33\r\33"+
		"\16\33\u008a\3\34\3\34\5\34\u008f\n\34\3\34\3\34\3\34\7\34\u0094\n\34"+
		"\f\34\16\34\u0097\13\34\3\35\3\35\3\35\3\35\3\35\5\35\u009e\n\35\3\36"+
		"\3\36\3\36\3\36\5\36\u00a4\n\36\3\37\3\37\3\37\3\37\2\2 \3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\2\63\2\65\32\67\339\34;\35=\36\3\2\5\4\2"+
		"C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2\u00b0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5A\3\2\2\2\7C\3\2\2\2\tE\3"+
		"\2\2\2\13G\3\2\2\2\rI\3\2\2\2\17L\3\2\2\2\21P\3\2\2\2\23V\3\2\2\2\25X"+
		"\3\2\2\2\27[\3\2\2\2\31]\3\2\2\2\33`\3\2\2\2\35b\3\2\2\2\37e\3\2\2\2!"+
		"h\3\2\2\2#j\3\2\2\2%l\3\2\2\2\'n\3\2\2\2)p\3\2\2\2+r\3\2\2\2-v\3\2\2\2"+
		"/{\3\2\2\2\61\u0083\3\2\2\2\63\u0085\3\2\2\2\65\u0088\3\2\2\2\67\u008e"+
		"\3\2\2\29\u009d\3\2\2\2;\u00a3\3\2\2\2=\u00a5\3\2\2\2?@\7=\2\2@\4\3\2"+
		"\2\2AB\7}\2\2B\6\3\2\2\2CD\7\177\2\2D\b\3\2\2\2EF\7*\2\2F\n\3\2\2\2GH"+
		"\7+\2\2H\f\3\2\2\2IJ\7k\2\2JK\7h\2\2K\16\3\2\2\2LM\7h\2\2MN\7q\2\2NO\7"+
		"t\2\2O\20\3\2\2\2PQ\7y\2\2QR\7j\2\2RS\7k\2\2ST\7n\2\2TU\7g\2\2U\22\3\2"+
		"\2\2VW\7?\2\2W\24\3\2\2\2XY\7?\2\2YZ\7?\2\2Z\26\3\2\2\2[\\\7>\2\2\\\30"+
		"\3\2\2\2]^\7>\2\2^_\7?\2\2_\32\3\2\2\2`a\7@\2\2a\34\3\2\2\2bc\7@\2\2c"+
		"d\7?\2\2d\36\3\2\2\2ef\7#\2\2fg\7?\2\2g \3\2\2\2hi\7-\2\2i\"\3\2\2\2j"+
		"k\7/\2\2k$\3\2\2\2lm\7,\2\2m&\3\2\2\2no\7\61\2\2o(\3\2\2\2pq\7\'\2\2q"+
		"*\3\2\2\2rs\7k\2\2st\7p\2\2tu\7v\2\2u,\3\2\2\2vw\7n\2\2wx\7q\2\2xy\7p"+
		"\2\2yz\7i\2\2z.\3\2\2\2{|\7d\2\2|}\7q\2\2}~\7q\2\2~\177\7n\2\2\177\u0080"+
		"\7g\2\2\u0080\u0081\7c\2\2\u0081\u0082\7p\2\2\u0082\60\3\2\2\2\u0083\u0084"+
		"\t\2\2\2\u0084\62\3\2\2\2\u0085\u0086\t\3\2\2\u0086\64\3\2\2\2\u0087\u0089"+
		"\5\63\32\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2"+
		"\u008a\u008b\3\2\2\2\u008b\66\3\2\2\2\u008c\u008f\5\61\31\2\u008d\u008f"+
		"\7a\2\2\u008e\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f\u0095\3\2\2\2\u0090"+
		"\u0094\5\61\31\2\u0091\u0094\5\65\33\2\u0092\u0094\7a\2\2\u0093\u0090"+
		"\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u00968\3\2\2\2\u0097\u0095\3\2\2\2"+
		"\u0098\u009e\5!\21\2\u0099\u009e\5#\22\2\u009a\u009e\5%\23\2\u009b\u009e"+
		"\5\'\24\2\u009c\u009e\5)\25\2\u009d\u0098\3\2\2\2\u009d\u0099\3\2\2\2"+
		"\u009d\u009a\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e:\3"+
		"\2\2\2\u009f\u00a0\7-\2\2\u00a0\u00a4\7-\2\2\u00a1\u00a2\7/\2\2\u00a2"+
		"\u00a4\7/\2\2\u00a3\u009f\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4<\3\2\2\2\u00a5"+
		"\u00a6\t\4\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\b\37\2\2\u00a8>\3\2\2\2"+
		"\t\2\u008a\u008e\u0093\u0095\u009d\u00a3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}