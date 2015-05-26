// Generated from BibPlos.g4 by ANTLR 4.5
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
public class BibPlosLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, Text=7, String=8, Number=9, 
		INT=10, DOUBLE=11, NameChar=12, NameStartChar=13, ASSIGN=14, GT=15, LT=16, 
		BANG=17, TILDE=18, QUESTION=19, COLON=20, EQUAL=21, LE=22, GE=23, NOTEQUAL=24, 
		AND=25, OR=26, INC=27, DEC=28, ADD=29, SUB=30, MUL=31, BITAND=32, BITOR=33, 
		CARET=34, LPAREN=35, RPAREN=36, LBRACE=37, RBRACE=38, LBRACK=39, RBRACK=40, 
		SEMI=41, COMMA=42, DOT=43, WS=44, LINE_COMMENT=45, SkipString=46;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "Text", "String", "Number", 
		"INT", "DOUBLE", "NameChar", "NameStartChar", "ASSIGN", "GT", "LT", "BANG", 
		"TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", 
		"OR", "INC", "DEC", "ADD", "SUB", "MUL", "BITAND", "BITOR", "CARET", "LPAREN", 
		"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", 
		"WS", "LINE_COMMENT", "SkipString"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\\section*{'", "'Acknowledgments'", "'acknowledgments'", "'\\begin{thebibliography}{'", 
		"'\\end{thebibliography}'", "'\\bibitem'", null, null, null, null, null, 
		null, null, "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", 
		"'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'&'", 
		"'|'", "'^'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", 
		"'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "Text", "String", "Number", 
		"INT", "DOUBLE", "NameChar", "NameStartChar", "ASSIGN", "GT", "LT", "BANG", 
		"TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", 
		"OR", "INC", "DEC", "ADD", "SUB", "MUL", "BITAND", "BITOR", "CARET", "LPAREN", 
		"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", 
		"WS", "LINE_COMMENT", "SkipString"
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

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public BibPlosLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BibPlos.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\60\u015f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\6\b\u00c5\n\b\r\b\16\b\u00c6\3\t\3\t\7\t\u00cb\n\t\f\t\16\t"+
		"\u00ce\13\t\3\n\3\n\5\n\u00d2\n\n\3\13\6\13\u00d5\n\13\r\13\16\13\u00d6"+
		"\3\f\6\f\u00da\n\f\r\f\16\f\u00db\3\f\3\f\6\f\u00e0\n\f\r\f\16\f\u00e1"+
		"\3\r\3\r\3\r\3\r\5\r\u00e8\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u00ef\n\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3"+
		"*\3+\3+\3,\3,\3-\6-\u0136\n-\r-\16-\u0137\3-\3-\3.\3.\7.\u013e\n.\f.\16"+
		".\u0141\13.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\7/\u0157\n/\f/\16/\u015a\13/\3/\3/\3/\3/\2\2\60\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60\3\2\7\4\2\62;aa\5\2\u00b9\u00b9\u0302\u0371\u2041\u2042"+
		"\17\2C\\c|\u00c2\u00d8\u00da\u00f8\u00fa\u0301\u0372\u037f\u0381\u2001"+
		"\u200e\u200f\u2072\u2191\u2c02\u2ff1\u3003\ud801\uf902\ufdd1\ufdf2\uffff"+
		"\5\2\13\f\16\17\"\"\4\2\f\f\17\17\u016f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\3_\3\2\2\2\5j\3\2\2\2\7z\3\2\2\2\t\u008a\3\2"+
		"\2\2\13\u00a3\3\2\2\2\r\u00b9\3\2\2\2\17\u00c4\3\2\2\2\21\u00c8\3\2\2"+
		"\2\23\u00d1\3\2\2\2\25\u00d4\3\2\2\2\27\u00d9\3\2\2\2\31\u00e7\3\2\2\2"+
		"\33\u00ee\3\2\2\2\35\u00f0\3\2\2\2\37\u00f2\3\2\2\2!\u00f4\3\2\2\2#\u00f6"+
		"\3\2\2\2%\u00f8\3\2\2\2\'\u00fa\3\2\2\2)\u00fc\3\2\2\2+\u00fe\3\2\2\2"+
		"-\u0101\3\2\2\2/\u0104\3\2\2\2\61\u0107\3\2\2\2\63\u010a\3\2\2\2\65\u010d"+
		"\3\2\2\2\67\u0110\3\2\2\29\u0113\3\2\2\2;\u0116\3\2\2\2=\u0118\3\2\2\2"+
		"?\u011a\3\2\2\2A\u011c\3\2\2\2C\u011e\3\2\2\2E\u0120\3\2\2\2G\u0122\3"+
		"\2\2\2I\u0124\3\2\2\2K\u0126\3\2\2\2M\u0128\3\2\2\2O\u012a\3\2\2\2Q\u012c"+
		"\3\2\2\2S\u012e\3\2\2\2U\u0130\3\2\2\2W\u0132\3\2\2\2Y\u0135\3\2\2\2["+
		"\u013b\3\2\2\2]\u0146\3\2\2\2_`\7^\2\2`a\7u\2\2ab\7g\2\2bc\7e\2\2cd\7"+
		"v\2\2de\7k\2\2ef\7q\2\2fg\7p\2\2gh\7,\2\2hi\7}\2\2i\4\3\2\2\2jk\7C\2\2"+
		"kl\7e\2\2lm\7m\2\2mn\7p\2\2no\7q\2\2op\7y\2\2pq\7n\2\2qr\7g\2\2rs\7f\2"+
		"\2st\7i\2\2tu\7o\2\2uv\7g\2\2vw\7p\2\2wx\7v\2\2xy\7u\2\2y\6\3\2\2\2z{"+
		"\7c\2\2{|\7e\2\2|}\7m\2\2}~\7p\2\2~\177\7q\2\2\177\u0080\7y\2\2\u0080"+
		"\u0081\7n\2\2\u0081\u0082\7g\2\2\u0082\u0083\7f\2\2\u0083\u0084\7i\2\2"+
		"\u0084\u0085\7o\2\2\u0085\u0086\7g\2\2\u0086\u0087\7p\2\2\u0087\u0088"+
		"\7v\2\2\u0088\u0089\7u\2\2\u0089\b\3\2\2\2\u008a\u008b\7^\2\2\u008b\u008c"+
		"\7d\2\2\u008c\u008d\7g\2\2\u008d\u008e\7i\2\2\u008e\u008f\7k\2\2\u008f"+
		"\u0090\7p\2\2\u0090\u0091\7}\2\2\u0091\u0092\7v\2\2\u0092\u0093\7j\2\2"+
		"\u0093\u0094\7g\2\2\u0094\u0095\7d\2\2\u0095\u0096\7k\2\2\u0096\u0097"+
		"\7d\2\2\u0097\u0098\7n\2\2\u0098\u0099\7k\2\2\u0099\u009a\7q\2\2\u009a"+
		"\u009b\7i\2\2\u009b\u009c\7t\2\2\u009c\u009d\7c\2\2\u009d\u009e\7r\2\2"+
		"\u009e\u009f\7j\2\2\u009f\u00a0\7{\2\2\u00a0\u00a1\7\177\2\2\u00a1\u00a2"+
		"\7}\2\2\u00a2\n\3\2\2\2\u00a3\u00a4\7^\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6"+
		"\7p\2\2\u00a6\u00a7\7f\2\2\u00a7\u00a8\7}\2\2\u00a8\u00a9\7v\2\2\u00a9"+
		"\u00aa\7j\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7d\2\2\u00ac\u00ad\7k\2\2"+
		"\u00ad\u00ae\7d\2\2\u00ae\u00af\7n\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1"+
		"\7q\2\2\u00b1\u00b2\7i\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7c\2\2\u00b4"+
		"\u00b5\7r\2\2\u00b5\u00b6\7j\2\2\u00b6\u00b7\7{\2\2\u00b7\u00b8\7\177"+
		"\2\2\u00b8\f\3\2\2\2\u00b9\u00ba\7^\2\2\u00ba\u00bb\7d\2\2\u00bb\u00bc"+
		"\7k\2\2\u00bc\u00bd\7d\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7v\2\2\u00bf"+
		"\u00c0\7g\2\2\u00c0\u00c1\7o\2\2\u00c1\16\3\2\2\2\u00c2\u00c5\5\21\t\2"+
		"\u00c3\u00c5\5\23\n\2\u00c4\u00c2\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c6"+
		"\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\20\3\2\2\2\u00c8"+
		"\u00cc\5\33\16\2\u00c9\u00cb\5\31\r\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce"+
		"\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\22\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00cf\u00d2\5\25\13\2\u00d0\u00d2\5\27\f\2\u00d1\u00cf"+
		"\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\24\3\2\2\2\u00d3\u00d5\4\62;\2\u00d4"+
		"\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2"+
		"\2\2\u00d7\26\3\2\2\2\u00d8\u00da\4\62;\2\u00d9\u00d8\3\2\2\2\u00da\u00db"+
		"\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00df\7\60\2\2\u00de\u00e0\4\62;\2\u00df\u00de\3\2\2\2\u00e0\u00e1\3"+
		"\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\30\3\2\2\2\u00e3"+
		"\u00e8\5\33\16\2\u00e4\u00e8\t\2\2\2\u00e5\u00e8\5)\25\2\u00e6\u00e8\t"+
		"\3\2\2\u00e7\u00e3\3\2\2\2\u00e7\u00e4\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e6\3\2\2\2\u00e8\32\3\2\2\2\u00e9\u00ef\t\4\2\2\u00ea\u00ef\5)\25"+
		"\2\u00eb\u00ef\5S*\2\u00ec\u00ef\5=\37\2\u00ed\u00ef\7\61\2\2\u00ee\u00e9"+
		"\3\2\2\2\u00ee\u00ea\3\2\2\2\u00ee\u00eb\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee"+
		"\u00ed\3\2\2\2\u00ef\34\3\2\2\2\u00f0\u00f1\7?\2\2\u00f1\36\3\2\2\2\u00f2"+
		"\u00f3\7@\2\2\u00f3 \3\2\2\2\u00f4\u00f5\7>\2\2\u00f5\"\3\2\2\2\u00f6"+
		"\u00f7\7#\2\2\u00f7$\3\2\2\2\u00f8\u00f9\7\u0080\2\2\u00f9&\3\2\2\2\u00fa"+
		"\u00fb\7A\2\2\u00fb(\3\2\2\2\u00fc\u00fd\7<\2\2\u00fd*\3\2\2\2\u00fe\u00ff"+
		"\7?\2\2\u00ff\u0100\7?\2\2\u0100,\3\2\2\2\u0101\u0102\7>\2\2\u0102\u0103"+
		"\7?\2\2\u0103.\3\2\2\2\u0104\u0105\7@\2\2\u0105\u0106\7?\2\2\u0106\60"+
		"\3\2\2\2\u0107\u0108\7#\2\2\u0108\u0109\7?\2\2\u0109\62\3\2\2\2\u010a"+
		"\u010b\7(\2\2\u010b\u010c\7(\2\2\u010c\64\3\2\2\2\u010d\u010e\7~\2\2\u010e"+
		"\u010f\7~\2\2\u010f\66\3\2\2\2\u0110\u0111\7-\2\2\u0111\u0112\7-\2\2\u0112"+
		"8\3\2\2\2\u0113\u0114\7/\2\2\u0114\u0115\7/\2\2\u0115:\3\2\2\2\u0116\u0117"+
		"\7-\2\2\u0117<\3\2\2\2\u0118\u0119\7/\2\2\u0119>\3\2\2\2\u011a\u011b\7"+
		",\2\2\u011b@\3\2\2\2\u011c\u011d\7(\2\2\u011dB\3\2\2\2\u011e\u011f\7~"+
		"\2\2\u011fD\3\2\2\2\u0120\u0121\7`\2\2\u0121F\3\2\2\2\u0122\u0123\7*\2"+
		"\2\u0123H\3\2\2\2\u0124\u0125\7+\2\2\u0125J\3\2\2\2\u0126\u0127\7}\2\2"+
		"\u0127L\3\2\2\2\u0128\u0129\7\177\2\2\u0129N\3\2\2\2\u012a\u012b\7]\2"+
		"\2\u012bP\3\2\2\2\u012c\u012d\7_\2\2\u012dR\3\2\2\2\u012e\u012f\7=\2\2"+
		"\u012fT\3\2\2\2\u0130\u0131\7.\2\2\u0131V\3\2\2\2\u0132\u0133\7\60\2\2"+
		"\u0133X\3\2\2\2\u0134\u0136\t\5\2\2\u0135\u0134\3\2\2\2\u0136\u0137\3"+
		"\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\u013a\b-\2\2\u013aZ\3\2\2\2\u013b\u013f\7\'\2\2\u013c\u013e\n\6\2\2\u013d"+
		"\u013c\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2"+
		"\2\2\u0140\u0142\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0143\t\6\2\2\u0143"+
		"\u0144\3\2\2\2\u0144\u0145\b.\2\2\u0145\\\3\2\2\2\u0146\u0147\7^\2\2\u0147"+
		"\u0148\7p\2\2\u0148\u0149\7q\2\2\u0149\u014a\7n\2\2\u014a\u014b\7k\2\2"+
		"\u014b\u014c\7p\2\2\u014c\u014d\7g\2\2\u014d\u014e\7p\2\2\u014e\u014f"+
		"\7w\2\2\u014f\u0150\7o\2\2\u0150\u0151\7d\2\2\u0151\u0152\7g\2\2\u0152"+
		"\u0153\7t\2\2\u0153\u0154\7u\2\2\u0154\u0158\3\2\2\2\u0155\u0157\n\6\2"+
		"\2\u0156\u0155\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159"+
		"\3\2\2\2\u0159\u015b\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015c\t\6\2\2\u015c"+
		"\u015d\3\2\2\2\u015d\u015e\b/\2\2\u015e^\3\2\2\2\17\2\u00c4\u00c6\u00cc"+
		"\u00d1\u00d6\u00db\u00e1\u00e7\u00ee\u0137\u013f\u0158\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}