// Generated from D:/Charlesworth/LaTEX/src/com/kutsyk/grammar/BibTEX\plosBIB.g4 by ANTLR 4.5
package com.kutsyk.grammar.BibTEX;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class plosBIBLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, Text=5, String=6, Number=7, INT=8, DOUBLE=9, 
		NameChar=10, NameStartChar=11, ASSIGN=12, GT=13, LT=14, BANG=15, TILDE=16, 
		QUESTION=17, COLON=18, EQUAL=19, LE=20, GE=21, NOTEQUAL=22, AND=23, OR=24, 
		INC=25, DEC=26, ADD=27, SUB=28, MUL=29, BITAND=30, BITOR=31, CARET=32, 
		LPAREN=33, RPAREN=34, LBRACE=35, RBRACE=36, LBRACK=37, RBRACK=38, SEMI=39, 
		COMMA=40, DOT=41, WS=42, LINE_COMMENT=43, SkipString=44;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "Text", "String", "Number", "INT", "DOUBLE", 
		"NameChar", "NameStartChar", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", 
		"COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", 
		"SUB", "MUL", "BITAND", "BITOR", "CARET", "LPAREN", "RPAREN", "LBRACE", 
		"RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "WS", "LINE_COMMENT", 
		"SkipString"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\\section*{Acknowledgments}'", "'\\begin{thebibliography}{'", 
		"'\\end{thebibliography}'", "'\\bibitem'", null, null, null, null, null, 
		null, null, "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", 
		"'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'&'", 
		"'|'", "'^'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", 
		"'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "Text", "String", "Number", "INT", "DOUBLE", 
		"NameChar", "NameStartChar", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", 
		"COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", 
		"SUB", "MUL", "BITAND", "BITOR", "CARET", "LPAREN", "RPAREN", "LBRACE", 
		"RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "WS", "LINE_COMMENT", 
		"SkipString"
	};
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
	@NotNull
	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public plosBIBLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "plosBIB.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2.\u0146\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\6\6\u00b1\n\6\r\6\16\6\u00b2\3\7\3\7\7\7\u00b7\n\7\f\7\16\7\u00ba\13"+
		"\7\3\b\3\b\5\b\u00be\n\b\3\t\6\t\u00c1\n\t\r\t\16\t\u00c2\3\n\6\n\u00c6"+
		"\n\n\r\n\16\n\u00c7\3\n\3\n\6\n\u00cc\n\n\r\n\16\n\u00cd\3\13\3\13\3\13"+
		"\3\13\5\13\u00d4\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3"+
		"#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\6+\u011d\n+\r+\16"+
		"+\u011e\3+\3+\3,\3,\7,\u0125\n,\f,\16,\u0128\13,\3,\3,\3,\3,\3-\3-\3-"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\7-\u013e\n-\f-\16-\u0141\13-\3"+
		"-\3-\3-\3-\2\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.\3\2\7\4\2\62;aa\5\2"+
		"\u00b9\u00b9\u0302\u0371\u2041\u2042\17\2C\\c|\u00c2\u00d8\u00da\u00f8"+
		"\u00fa\u0301\u0372\u037f\u0381\u2001\u200e\u200f\u2072\u2191\u2c02\u2ff1"+
		"\u3003\ud801\uf902\ufdd1\ufdf2\uffff\5\2\13\f\16\17\"\"\4\2\f\f\17\17"+
		"\u0152\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3[\3\2\2\2\5v\3\2\2\2\7\u008f"+
		"\3\2\2\2\t\u00a5\3\2\2\2\13\u00b0\3\2\2\2\r\u00b4\3\2\2\2\17\u00bd\3\2"+
		"\2\2\21\u00c0\3\2\2\2\23\u00c5\3\2\2\2\25\u00d3\3\2\2\2\27\u00d5\3\2\2"+
		"\2\31\u00d7\3\2\2\2\33\u00d9\3\2\2\2\35\u00db\3\2\2\2\37\u00dd\3\2\2\2"+
		"!\u00df\3\2\2\2#\u00e1\3\2\2\2%\u00e3\3\2\2\2\'\u00e5\3\2\2\2)\u00e8\3"+
		"\2\2\2+\u00eb\3\2\2\2-\u00ee\3\2\2\2/\u00f1\3\2\2\2\61\u00f4\3\2\2\2\63"+
		"\u00f7\3\2\2\2\65\u00fa\3\2\2\2\67\u00fd\3\2\2\29\u00ff\3\2\2\2;\u0101"+
		"\3\2\2\2=\u0103\3\2\2\2?\u0105\3\2\2\2A\u0107\3\2\2\2C\u0109\3\2\2\2E"+
		"\u010b\3\2\2\2G\u010d\3\2\2\2I\u010f\3\2\2\2K\u0111\3\2\2\2M\u0113\3\2"+
		"\2\2O\u0115\3\2\2\2Q\u0117\3\2\2\2S\u0119\3\2\2\2U\u011c\3\2\2\2W\u0122"+
		"\3\2\2\2Y\u012d\3\2\2\2[\\\7^\2\2\\]\7u\2\2]^\7g\2\2^_\7e\2\2_`\7v\2\2"+
		"`a\7k\2\2ab\7q\2\2bc\7p\2\2cd\7,\2\2de\7}\2\2ef\7C\2\2fg\7e\2\2gh\7m\2"+
		"\2hi\7p\2\2ij\7q\2\2jk\7y\2\2kl\7n\2\2lm\7g\2\2mn\7f\2\2no\7i\2\2op\7"+
		"o\2\2pq\7g\2\2qr\7p\2\2rs\7v\2\2st\7u\2\2tu\7\177\2\2u\4\3\2\2\2vw\7^"+
		"\2\2wx\7d\2\2xy\7g\2\2yz\7i\2\2z{\7k\2\2{|\7p\2\2|}\7}\2\2}~\7v\2\2~\177"+
		"\7j\2\2\177\u0080\7g\2\2\u0080\u0081\7d\2\2\u0081\u0082\7k\2\2\u0082\u0083"+
		"\7d\2\2\u0083\u0084\7n\2\2\u0084\u0085\7k\2\2\u0085\u0086\7q\2\2\u0086"+
		"\u0087\7i\2\2\u0087\u0088\7t\2\2\u0088\u0089\7c\2\2\u0089\u008a\7r\2\2"+
		"\u008a\u008b\7j\2\2\u008b\u008c\7{\2\2\u008c\u008d\7\177\2\2\u008d\u008e"+
		"\7}\2\2\u008e\6\3\2\2\2\u008f\u0090\7^\2\2\u0090\u0091\7g\2\2\u0091\u0092"+
		"\7p\2\2\u0092\u0093\7f\2\2\u0093\u0094\7}\2\2\u0094\u0095\7v\2\2\u0095"+
		"\u0096\7j\2\2\u0096\u0097\7g\2\2\u0097\u0098\7d\2\2\u0098\u0099\7k\2\2"+
		"\u0099\u009a\7d\2\2\u009a\u009b\7n\2\2\u009b\u009c\7k\2\2\u009c\u009d"+
		"\7q\2\2\u009d\u009e\7i\2\2\u009e\u009f\7t\2\2\u009f\u00a0\7c\2\2\u00a0"+
		"\u00a1\7r\2\2\u00a1\u00a2\7j\2\2\u00a2\u00a3\7{\2\2\u00a3\u00a4\7\177"+
		"\2\2\u00a4\b\3\2\2\2\u00a5\u00a6\7^\2\2\u00a6\u00a7\7d\2\2\u00a7\u00a8"+
		"\7k\2\2\u00a8\u00a9\7d\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7v\2\2\u00ab"+
		"\u00ac\7g\2\2\u00ac\u00ad\7o\2\2\u00ad\n\3\2\2\2\u00ae\u00b1\5\r\7\2\u00af"+
		"\u00b1\5\17\b\2\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b2\3"+
		"\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\f\3\2\2\2\u00b4\u00b8"+
		"\5\27\f\2\u00b5\u00b7\5\25\13\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2"+
		"\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\16\3\2\2\2\u00ba\u00b8"+
		"\3\2\2\2\u00bb\u00be\5\21\t\2\u00bc\u00be\5\23\n\2\u00bd\u00bb\3\2\2\2"+
		"\u00bd\u00bc\3\2\2\2\u00be\20\3\2\2\2\u00bf\u00c1\4\62;\2\u00c0\u00bf"+
		"\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\22\3\2\2\2\u00c4\u00c6\4\62;\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2"+
		"\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb"+
		"\7\60\2\2\u00ca\u00cc\4\62;\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2"+
		"\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\24\3\2\2\2\u00cf\u00d4"+
		"\5\27\f\2\u00d0\u00d4\t\2\2\2\u00d1\u00d4\5%\23\2\u00d2\u00d4\t\3\2\2"+
		"\u00d3\u00cf\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2"+
		"\3\2\2\2\u00d4\26\3\2\2\2\u00d5\u00d6\t\4\2\2\u00d6\30\3\2\2\2\u00d7\u00d8"+
		"\7?\2\2\u00d8\32\3\2\2\2\u00d9\u00da\7@\2\2\u00da\34\3\2\2\2\u00db\u00dc"+
		"\7>\2\2\u00dc\36\3\2\2\2\u00dd\u00de\7#\2\2\u00de \3\2\2\2\u00df\u00e0"+
		"\7\u0080\2\2\u00e0\"\3\2\2\2\u00e1\u00e2\7A\2\2\u00e2$\3\2\2\2\u00e3\u00e4"+
		"\7<\2\2\u00e4&\3\2\2\2\u00e5\u00e6\7?\2\2\u00e6\u00e7\7?\2\2\u00e7(\3"+
		"\2\2\2\u00e8\u00e9\7>\2\2\u00e9\u00ea\7?\2\2\u00ea*\3\2\2\2\u00eb\u00ec"+
		"\7@\2\2\u00ec\u00ed\7?\2\2\u00ed,\3\2\2\2\u00ee\u00ef\7#\2\2\u00ef\u00f0"+
		"\7?\2\2\u00f0.\3\2\2\2\u00f1\u00f2\7(\2\2\u00f2\u00f3\7(\2\2\u00f3\60"+
		"\3\2\2\2\u00f4\u00f5\7~\2\2\u00f5\u00f6\7~\2\2\u00f6\62\3\2\2\2\u00f7"+
		"\u00f8\7-\2\2\u00f8\u00f9\7-\2\2\u00f9\64\3\2\2\2\u00fa\u00fb\7/\2\2\u00fb"+
		"\u00fc\7/\2\2\u00fc\66\3\2\2\2\u00fd\u00fe\7-\2\2\u00fe8\3\2\2\2\u00ff"+
		"\u0100\7/\2\2\u0100:\3\2\2\2\u0101\u0102\7,\2\2\u0102<\3\2\2\2\u0103\u0104"+
		"\7(\2\2\u0104>\3\2\2\2\u0105\u0106\7~\2\2\u0106@\3\2\2\2\u0107\u0108\7"+
		"`\2\2\u0108B\3\2\2\2\u0109\u010a\7*\2\2\u010aD\3\2\2\2\u010b\u010c\7+"+
		"\2\2\u010cF\3\2\2\2\u010d\u010e\7}\2\2\u010eH\3\2\2\2\u010f\u0110\7\177"+
		"\2\2\u0110J\3\2\2\2\u0111\u0112\7]\2\2\u0112L\3\2\2\2\u0113\u0114\7_\2"+
		"\2\u0114N\3\2\2\2\u0115\u0116\7=\2\2\u0116P\3\2\2\2\u0117\u0118\7.\2\2"+
		"\u0118R\3\2\2\2\u0119\u011a\7\60\2\2\u011aT\3\2\2\2\u011b\u011d\t\5\2"+
		"\2\u011c\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f"+
		"\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\b+\2\2\u0121V\3\2\2\2\u0122\u0126"+
		"\7\'\2\2\u0123\u0125\n\6\2\2\u0124\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126"+
		"\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0126\3\2"+
		"\2\2\u0129\u012a\t\6\2\2\u012a\u012b\3\2\2\2\u012b\u012c\b,\2\2\u012c"+
		"X\3\2\2\2\u012d\u012e\7^\2\2\u012e\u012f\7p\2\2\u012f\u0130\7q\2\2\u0130"+
		"\u0131\7n\2\2\u0131\u0132\7k\2\2\u0132\u0133\7p\2\2\u0133\u0134\7g\2\2"+
		"\u0134\u0135\7p\2\2\u0135\u0136\7w\2\2\u0136\u0137\7o\2\2\u0137\u0138"+
		"\7d\2\2\u0138\u0139\7g\2\2\u0139\u013a\7t\2\2\u013a\u013b\7u\2\2\u013b"+
		"\u013f\3\2\2\2\u013c\u013e\n\6\2\2\u013d\u013c\3\2\2\2\u013e\u0141\3\2"+
		"\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\3\2\2\2\u0141"+
		"\u013f\3\2\2\2\u0142\u0143\t\6\2\2\u0143\u0144\3\2\2\2\u0144\u0145\b-"+
		"\2\2\u0145Z\3\2\2\2\16\2\u00b0\u00b2\u00b8\u00bd\u00c2\u00c7\u00cd\u00d3"+
		"\u011e\u0126\u013f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}