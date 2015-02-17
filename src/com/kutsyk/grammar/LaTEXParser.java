// Generated from D:/Charlesworth/LaTEX/src/com/kutsyk/grammar\LaTEX.g4 by ANTLR 4.5
package com.kutsyk.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LaTEXParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, T__100=101, 
		T__101=102, T__102=103, T__103=104, T__104=105, T__105=106, T__106=107, 
		T__107=108, T__108=109, T__109=110, T__110=111, T__111=112, T__112=113, 
		T__113=114, T__114=115, T__115=116, T__116=117, T__117=118, T__118=119, 
		T__119=120, T__120=121, T__121=122, T__122=123, T__123=124, T__124=125, 
		T__125=126, T__126=127, T__127=128, T__128=129, IgnoreAlgorithmKeyWords=130, 
		IgnoreUrlPrefix=131, String=132, Num=133, INT=134, DOUBLE=135, NameChar=136, 
		NameStartChar=137, ASSIGN=138, GT=139, LT=140, BANG=141, TILDE=142, QUESTION=143, 
		COLON=144, EQUAL=145, LE=146, GE=147, NOTEQUAL=148, AND=149, OR=150, INC=151, 
		DEC=152, ADD=153, SUB=154, MUL=155, BITAND=156, BITOR=157, CARET=158, 
		COMMENT=159, LINE_COMMENT=160, WS=161, WORDS_TO_SKIP=162, Skip=163, Affil=164;
	public static final int
		RULE_compilationUnit = 0, RULE_documentDeclaration = 1, RULE_documentBody = 2, 
		RULE_frontPart = 3, RULE_frontBody = 4, RULE_mainTitle = 5, RULE_authorList = 6, 
		RULE_author = 7, RULE_textsuperscriptBlock = 8, RULE_authorName = 9, RULE_address = 10, 
		RULE_bodyPart = 11, RULE_memberList = 12, RULE_member = 13, RULE_landScapeBlock = 14, 
		RULE_textRules = 15, RULE_textSymbols = 16, RULE_paragraph = 17, RULE_text = 18, 
		RULE_textBody = 19, RULE_textSC = 20, RULE_label = 21, RULE_boxBlock = 22, 
		RULE_abstractBlock = 23, RULE_title = 24, RULE_newcommandDeclaration = 25, 
		RULE_commandBody = 26, RULE_renewcommandDeclaration = 27, RULE_identificator = 28, 
		RULE_block = 29, RULE_multicolsBlock = 30, RULE_list = 31, RULE_items = 32, 
		RULE_item = 33, RULE_descriptionList = 34, RULE_descriptionItems = 35, 
		RULE_descriptionItem = 36, RULE_descriptionTitle = 37, RULE_captionBlock = 38, 
		RULE_table = 39, RULE_tableCaption = 40, RULE_tabular = 41, RULE_tableSkipBlock = 42, 
		RULE_tableDefinition = 43, RULE_multicolumn = 44, RULE_tableRow = 45, 
		RULE_tableCell = 46, RULE_texttypeDeclarator = 47, RULE_ttStyle = 48, 
		RULE_boldTypeDeclaration = 49, RULE_smallcapsDeclaration = 50, RULE_italictypeDeclaration = 51, 
		RULE_italicBlock = 52, RULE_italicOutBlock = 53, RULE_textformatingBlockFlushLeft = 54, 
		RULE_textformatingBlockCenter = 55, RULE_sectionDeclaration = 56, RULE_subsectionDeclaration = 57, 
		RULE_subsubsectionDeclaration = 58, RULE_citeReferences = 59, RULE_citeReferencesList = 60, 
		RULE_citeReference = 61, RULE_measures = 62, RULE_figureBlock = 63, RULE_supplementaryFigureBlock = 64, 
		RULE_algorithmBlock = 65, RULE_algorithmicBlock = 66, RULE_input = 67, 
		RULE_output = 68, RULE_state = 69, RULE_forBlock = 70, RULE_ifBlock = 71, 
		RULE_returnBlock = 72, RULE_url = 73, RULE_urlText = 74, RULE_options = 75, 
		RULE_comma = 76, RULE_dot = 77, RULE_dots = 78, RULE_appos = 79, RULE_lparen = 80, 
		RULE_rparen = 81, RULE_dollarBlock = 82, RULE_inlineEquation = 83, RULE_equationBlock = 84, 
		RULE_displayEquation = 85, RULE_eqnArray = 86, RULE_eqnArrayBody = 87, 
		RULE_eqnEquation = 88, RULE_newLine = 89, RULE_doubleSlash = 90, RULE_ref = 91, 
		RULE_simpleText = 92, RULE_interval = 93, RULE_numbers = 94, RULE_arabic = 95, 
		RULE_specialCharacters = 96, RULE_ifThenElse = 97, RULE_ifThenText = 98;
	public static final String[] ruleNames = {
		"compilationUnit", "documentDeclaration", "documentBody", "frontPart", 
		"frontBody", "mainTitle", "authorList", "author", "textsuperscriptBlock", 
		"authorName", "address", "bodyPart", "memberList", "member", "landScapeBlock", 
		"textRules", "textSymbols", "paragraph", "text", "textBody", "textSC", 
		"label", "boxBlock", "abstractBlock", "title", "newcommandDeclaration", 
		"commandBody", "renewcommandDeclaration", "identificator", "block", "multicolsBlock", 
		"list", "items", "item", "descriptionList", "descriptionItems", "descriptionItem", 
		"descriptionTitle", "captionBlock", "table", "tableCaption", "tabular", 
		"tableSkipBlock", "tableDefinition", "multicolumn", "tableRow", "tableCell", 
		"texttypeDeclarator", "ttStyle", "boldTypeDeclaration", "smallcapsDeclaration", 
		"italictypeDeclaration", "italicBlock", "italicOutBlock", "textformatingBlockFlushLeft", 
		"textformatingBlockCenter", "sectionDeclaration", "subsectionDeclaration", 
		"subsubsectionDeclaration", "citeReferences", "citeReferencesList", "citeReference", 
		"measures", "figureBlock", "supplementaryFigureBlock", "algorithmBlock", 
		"algorithmicBlock", "input", "output", "state", "forBlock", "ifBlock", 
		"returnBlock", "url", "urlText", "options", "comma", "dot", "dots", "appos", 
		"lparen", "rparen", "dollarBlock", "inlineEquation", "equationBlock", 
		"displayEquation", "eqnArray", "eqnArrayBody", "eqnEquation", "newLine", 
		"doubleSlash", "ref", "simpleText", "interval", "numbers", "arabic", "specialCharacters", 
		"ifThenElse", "ifThenText"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\n'", "'\\begin{document}'", "'\\end{document}'", "'\\begin{flushleft}'", 
		"'\\end{flushleft}'", "'{'", "'\\Large'", "'\\textbf'", "'\\newline'", 
		"'}'", "'\\\\'", "','", "'\\textsuperscript'", "'\\bf'", "'\\begin{landscape}'", 
		"'\\end{landscape}'", "'/'", "'@'", "'\\paragraph'", "'\\paragraph*'", 
		"'\\textsc'", "'\\label'", "'\\mbox'", "'\\begin{abstract}'", "'\\end{abstract}'", 
		"'\\Abstract'", "'\\title'", "'\\newcommand'", "'\\renewcommand'", "'\\'", 
		"'\\left'", "'\\right'", "'\\begin{multicols}'", "'\\end{multicols}'", 
		"'\\begin{enumerate}'", "'\\end{enumerate}'", "'\\begin{itemize}'", "'\\end{itemize}'", 
		"'\\item'", "'\\begin{description}'", "'\\end{description}'", "'['", "']'", 
		"'\\caption'", "'\\begin{table}'", "'\\begin{adjustwidth}{-2.25in}{0in}'", 
		"'\\end{adjustwidth}'", "'\\end{table}'", "'\\begin{tabular}'", "'\\hline'", 
		"'\\\\ \\hline'", "'\\end{tabular}'", "'\\multicolumn'", "'$'", "'\\large'", 
		"'\\LARGE'", "'{\\tt'", "'{\\bf'", "'{\\sc'", "'{\\em'", "'{\\it'", "'\\textit'", 
		"'\\emph'", "'\\begin{center}'", "'\\end{center}'", "'\\section*'", "'\\section'", 
		"'\\subsection*'", "'\\subsection'", "'\\subsubsection*'", "'\\subsubsection'", 
		"'\\cite'", "'\\citep'", "'\\citet'", "'\\citemain'", "' ms'", "' Hz'", 
		"'\\begin{figure}'", "'\\end{figure}'", "'\\begin{figure*}'", "'\\end{figure*}'", 
		"'\\begin{suppfigure}'", "'\\end{suppfigure}'", "'\\begin{suppfigure*}'", 
		"'\\end{suppfigure*}'", "'\\begin{algorithm}'", "'\\end{algorithm}'", 
		"'\\begin{algorithmic}'", "'\\end{algorithmic}'", "'\\REQUIRE'", "'\\ENSURE'", 
		"'\\STATE'", "'\\FOR'", "'\\IF'", "'\\RETURN'", "'\\url'", "'.'", "'\\dots'", 
		"'\\''", "'('", "')'", "'$$'", "'\\begin{align}'", "'\\end{align}'", "'\\begin{align*}'", 
		"'\\end{align*}'", "'\\begin{subequations}'", "'\\end{subequations}'", 
		"'\\beqa'", "'\\eea'", "'\\begin{equation}'", "'\\end{equation}'", "'\\begin{equation*}'", 
		"'\\end{equation*}'", "'\\['", "'\\]'", "'\\begin{eqnarray*}'", "'\\end{eqnarray*}'", 
		"'\\begin{eqnarray}'", "'\\end{eqnarray}'", "'\\ref{'", "'\\arabic'", 
		"'\\ddag'", "'\\Yinyang'", "'\\textcurrency'", "'\\textcurrency a'", "'\\dag'", 
		"'\\textpilcrow'", "'\\ifthenelse'", null, null, null, null, null, null, 
		null, null, "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", 
		"'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'&'", 
		"'|'", "'^'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "IgnoreAlgorithmKeyWords", 
		"IgnoreUrlPrefix", "String", "Num", "INT", "DOUBLE", "NameChar", "NameStartChar", 
		"ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", "LE", 
		"GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "BITAND", 
		"BITOR", "CARET", "COMMENT", "LINE_COMMENT", "WS", "WORDS_TO_SKIP", "Skip", 
		"Affil"
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

	@Override
	public String getGrammarFileName() { return "LaTEX.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LaTEXParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public DocumentDeclarationContext documentDeclaration() {
			return getRuleContext(DocumentDeclarationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LaTEXParser.EOF, 0); }
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(198); 
				match(T__0);
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204); 
			documentDeclaration();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(205); 
				match(T__0);
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211); 
			match(EOF);
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

	public static class DocumentDeclarationContext extends ParserRuleContext {
		public FrontPartContext frontPart() {
			return getRuleContext(FrontPartContext.class,0);
		}
		public DocumentBodyContext documentBody() {
			return getRuleContext(DocumentBodyContext.class,0);
		}
		public DocumentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_documentDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterDocumentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitDocumentDeclaration(this);
		}
	}

	public final DocumentDeclarationContext documentDeclaration() throws RecognitionException {
		DocumentDeclarationContext _localctx = new DocumentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_documentDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(213); 
			match(T__1);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(214); 
				match(T__0);
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220); 
			frontPart();
			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(221); 
					match(T__0);
					}
					} 
				}
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(227); 
			documentBody();
			setState(228); 
			match(T__2);
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

	public static class DocumentBodyContext extends ParserRuleContext {
		public BodyPartContext bodyPart() {
			return getRuleContext(BodyPartContext.class,0);
		}
		public DocumentBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_documentBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterDocumentBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitDocumentBody(this);
		}
	}

	public final DocumentBodyContext documentBody() throws RecognitionException {
		DocumentBodyContext _localctx = new DocumentBodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_documentBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230); 
			bodyPart();
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

	public static class FrontPartContext extends ParserRuleContext {
		public FrontBodyContext frontBody() {
			return getRuleContext(FrontBodyContext.class,0);
		}
		public List<MemberListContext> memberList() {
			return getRuleContexts(MemberListContext.class);
		}
		public MemberListContext memberList(int i) {
			return getRuleContext(MemberListContext.class,i);
		}
		public FrontPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frontPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterFrontPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitFrontPart(this);
		}
	}

	public final FrontPartContext frontPart() throws RecognitionException {
		FrontPartContext _localctx = new FrontPartContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_frontPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232); 
			match(T__3);
			setState(233); 
			frontBody();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__39) | (1L << T__43) | (1L << T__44) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__79 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__85 - 64)) | (1L << (T__87 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__110 - 64)) | (1L << (T__112 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (TILDE - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)))) != 0)) {
				{
				{
				setState(234); 
				memberList();
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240); 
			match(T__4);
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

	public static class FrontBodyContext extends ParserRuleContext {
		public MainTitleContext mainTitle() {
			return getRuleContext(MainTitleContext.class,0);
		}
		public AuthorListContext authorList() {
			return getRuleContext(AuthorListContext.class,0);
		}
		public List<AddressContext> address() {
			return getRuleContexts(AddressContext.class);
		}
		public AddressContext address(int i) {
			return getRuleContext(AddressContext.class,i);
		}
		public FrontBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frontBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterFrontBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitFrontBody(this);
		}
	}

	public final FrontBodyContext frontBody() throws RecognitionException {
		FrontBodyContext _localctx = new FrontBodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_frontBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(242); 
				match(T__0);
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248); 
			mainTitle();
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(249); 
				match(T__0);
				}
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(255); 
			authorList();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(256); 
				match(T__0);
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(263); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(262); 
					address();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(265); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class MainTitleContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public MainTitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainTitle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterMainTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitMainTitle(this);
		}
	}

	public final MainTitleContext mainTitle() throws RecognitionException {
		MainTitleContext _localctx = new MainTitleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mainTitle);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(267); 
			match(T__5);
			setState(268); 
			match(T__6);
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(269); 
				match(T__0);
				}
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(275); 
			match(T__7);
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(276); 
				match(T__0);
				}
				}
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(283);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(282); 
				match(T__8);
				}
			}

			setState(285); 
			match(T__5);
			setState(286); 
			text();
			setState(287); 
			match(T__9);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(288); 
				match(T__0);
				}
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(294); 
			match(T__9);
			setState(298);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(295); 
					match(T__0);
					}
					} 
				}
				setState(300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(302);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(301); 
				match(T__8);
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

	public static class AuthorListContext extends ParserRuleContext {
		public List<AuthorContext> author() {
			return getRuleContexts(AuthorContext.class);
		}
		public AuthorContext author(int i) {
			return getRuleContext(AuthorContext.class,i);
		}
		public AuthorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_authorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterAuthorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitAuthorList(this);
		}
	}

	public final AuthorListContext authorList() throws RecognitionException {
		AuthorListContext _localctx = new AuthorListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_authorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304); 
			match(T__10);
			setState(305); 
			author();
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(306); 
				match(T__11);
				setState(307); 
				author();
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(313); 
				match(T__0);
				}
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(319); 
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

	public static class AuthorContext extends ParserRuleContext {
		public AuthorNameContext authorName() {
			return getRuleContext(AuthorNameContext.class,0);
		}
		public TextsuperscriptBlockContext textsuperscriptBlock() {
			return getRuleContext(TextsuperscriptBlockContext.class,0);
		}
		public AuthorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_author; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterAuthor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitAuthor(this);
		}
	}

	public final AuthorContext author() throws RecognitionException {
		AuthorContext _localctx = new AuthorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_author);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321); 
			authorName();
			setState(322); 
			match(T__12);
			setState(323); 
			textsuperscriptBlock();
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

	public static class TextsuperscriptBlockContext extends ParserRuleContext {
		public List<NumbersContext> numbers() {
			return getRuleContexts(NumbersContext.class);
		}
		public NumbersContext numbers(int i) {
			return getRuleContext(NumbersContext.class,i);
		}
		public List<SpecialCharactersContext> specialCharacters() {
			return getRuleContexts(SpecialCharactersContext.class);
		}
		public SpecialCharactersContext specialCharacters(int i) {
			return getRuleContext(SpecialCharactersContext.class,i);
		}
		public TextsuperscriptBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textsuperscriptBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterTextsuperscriptBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitTextsuperscriptBlock(this);
		}
	}

	public final TextsuperscriptBlockContext textsuperscriptBlock() throws RecognitionException {
		TextsuperscriptBlockContext _localctx = new TextsuperscriptBlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_textsuperscriptBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325); 
			match(T__5);
			setState(330); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(330);
				switch (_input.LA(1)) {
				case Num:
					{
					setState(326); 
					numbers();
					}
					break;
				case MUL:
					{
					setState(327); 
					match(MUL);
					}
					break;
				case T__122:
				case T__123:
				case T__124:
				case T__125:
				case T__126:
				case T__127:
					{
					setState(328); 
					specialCharacters();
					}
					break;
				case T__11:
					{
					setState(329); 
					match(T__11);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(332); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__11 || ((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (T__122 - 123)) | (1L << (T__123 - 123)) | (1L << (T__124 - 123)) | (1L << (T__125 - 123)) | (1L << (T__126 - 123)) | (1L << (T__127 - 123)) | (1L << (Num - 123)) | (1L << (MUL - 123)))) != 0) );
			setState(334); 
			match(T__9);
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

	public static class AuthorNameContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public AuthorNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_authorName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterAuthorName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitAuthorName(this);
		}
	}

	public final AuthorNameContext authorName() throws RecognitionException {
		AuthorNameContext _localctx = new AuthorNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_authorName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336); 
			text();
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

	public static class AddressContext extends ParserRuleContext {
		public NumbersContext numbers() {
			return getRuleContext(NumbersContext.class,0);
		}
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public AddressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_address; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterAddress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitAddress(this);
		}
	}

	public final AddressContext address() throws RecognitionException {
		AddressContext _localctx = new AddressContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_address);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(338); 
			match(T__13);
			setState(339); 
			match(T__5);
			setState(340); 
			numbers();
			setState(341); 
			match(T__9);
			setState(342); 
			text();
			setState(343); 
			match(T__10);
			setState(347);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(344); 
					match(T__0);
					}
					} 
				}
				setState(349);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class BodyPartContext extends ParserRuleContext {
		public List<MemberListContext> memberList() {
			return getRuleContexts(MemberListContext.class);
		}
		public MemberListContext memberList(int i) {
			return getRuleContext(MemberListContext.class,i);
		}
		public BodyPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterBodyPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitBodyPart(this);
		}
	}

	public final BodyPartContext bodyPart() throws RecognitionException {
		BodyPartContext _localctx = new BodyPartContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bodyPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__39) | (1L << T__43) | (1L << T__44) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__79 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__85 - 64)) | (1L << (T__87 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__110 - 64)) | (1L << (T__112 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (TILDE - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)))) != 0)) {
				{
				{
				setState(350); 
				memberList();
				}
				}
				setState(355);
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

	public static class MemberListContext extends ParserRuleContext {
		public List<MemberContext> member() {
			return getRuleContexts(MemberContext.class);
		}
		public MemberContext member(int i) {
			return getRuleContext(MemberContext.class,i);
		}
		public MemberListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterMemberList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitMemberList(this);
		}
	}

	public final MemberListContext memberList() throws RecognitionException {
		MemberListContext _localctx = new MemberListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_memberList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(356); 
			member();
			setState(360);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(357); 
					member();
					}
					} 
				}
				setState(362);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class MemberContext extends ParserRuleContext {
		public SpecialCharactersContext specialCharacters() {
			return getRuleContext(SpecialCharactersContext.class,0);
		}
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public AbstractBlockContext abstractBlock() {
			return getRuleContext(AbstractBlockContext.class,0);
		}
		public TextRulesContext textRules() {
			return getRuleContext(TextRulesContext.class,0);
		}
		public FigureBlockContext figureBlock() {
			return getRuleContext(FigureBlockContext.class,0);
		}
		public SupplementaryFigureBlockContext supplementaryFigureBlock() {
			return getRuleContext(SupplementaryFigureBlockContext.class,0);
		}
		public AlgorithmBlockContext algorithmBlock() {
			return getRuleContext(AlgorithmBlockContext.class,0);
		}
		public AlgorithmicBlockContext algorithmicBlock() {
			return getRuleContext(AlgorithmicBlockContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public StateContext state() {
			return getRuleContext(StateContext.class,0);
		}
		public ForBlockContext forBlock() {
			return getRuleContext(ForBlockContext.class,0);
		}
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public ReturnBlockContext returnBlock() {
			return getRuleContext(ReturnBlockContext.class,0);
		}
		public CaptionBlockContext captionBlock() {
			return getRuleContext(CaptionBlockContext.class,0);
		}
		public MulticolsBlockContext multicolsBlock() {
			return getRuleContext(MulticolsBlockContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public DescriptionListContext descriptionList() {
			return getRuleContext(DescriptionListContext.class,0);
		}
		public SectionDeclarationContext sectionDeclaration() {
			return getRuleContext(SectionDeclarationContext.class,0);
		}
		public SubsectionDeclarationContext subsectionDeclaration() {
			return getRuleContext(SubsectionDeclarationContext.class,0);
		}
		public SubsubsectionDeclarationContext subsubsectionDeclaration() {
			return getRuleContext(SubsubsectionDeclarationContext.class,0);
		}
		public RenewcommandDeclarationContext renewcommandDeclaration() {
			return getRuleContext(RenewcommandDeclarationContext.class,0);
		}
		public CiteReferencesContext citeReferences() {
			return getRuleContext(CiteReferencesContext.class,0);
		}
		public RefContext ref() {
			return getRuleContext(RefContext.class,0);
		}
		public NewLineContext newLine() {
			return getRuleContext(NewLineContext.class,0);
		}
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public IfThenElseContext ifThenElse() {
			return getRuleContext(IfThenElseContext.class,0);
		}
		public MemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitMember(this);
		}
	}

	public final MemberContext member() throws RecognitionException {
		MemberContext _localctx = new MemberContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_member);
		try {
			setState(391);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(363); 
				specialCharacters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(364); 
				title();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(365); 
				table();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(366); 
				abstractBlock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(367); 
				textRules();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(368); 
				figureBlock();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(369); 
				supplementaryFigureBlock();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(370); 
				algorithmBlock();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(371); 
				algorithmicBlock();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(372); 
				input();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(373); 
				output();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(374); 
				state();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(375); 
				forBlock();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(376); 
				ifBlock();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(377); 
				returnBlock();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(378); 
				captionBlock();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(379); 
				multicolsBlock();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(380); 
				label();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(381); 
				descriptionList();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(382); 
				sectionDeclaration();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(383); 
				subsectionDeclaration();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(384); 
				subsubsectionDeclaration();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(385); 
				renewcommandDeclaration();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(386); 
				citeReferences();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(387); 
				ref();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(388); 
				newLine();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(389); 
				url();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(390); 
				ifThenElse();
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

	public static class LandScapeBlockContext extends ParserRuleContext {
		public MemberListContext memberList() {
			return getRuleContext(MemberListContext.class,0);
		}
		public LandScapeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_landScapeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterLandScapeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitLandScapeBlock(this);
		}
	}

	public final LandScapeBlockContext landScapeBlock() throws RecognitionException {
		LandScapeBlockContext _localctx = new LandScapeBlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_landScapeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393); 
			match(T__14);
			setState(394); 
			memberList();
			setState(395); 
			match(T__15);
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

	public static class TextRulesContext extends ParserRuleContext {
		public DollarBlockContext dollarBlock() {
			return getRuleContext(DollarBlockContext.class,0);
		}
		public TextSymbolsContext textSymbols() {
			return getRuleContext(TextSymbolsContext.class,0);
		}
		public LandScapeBlockContext landScapeBlock() {
			return getRuleContext(LandScapeBlockContext.class,0);
		}
		public InlineEquationContext inlineEquation() {
			return getRuleContext(InlineEquationContext.class,0);
		}
		public EquationBlockContext equationBlock() {
			return getRuleContext(EquationBlockContext.class,0);
		}
		public DisplayEquationContext displayEquation() {
			return getRuleContext(DisplayEquationContext.class,0);
		}
		public ParagraphContext paragraph() {
			return getRuleContext(ParagraphContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TextformatingBlockFlushLeftContext textformatingBlockFlushLeft() {
			return getRuleContext(TextformatingBlockFlushLeftContext.class,0);
		}
		public TextformatingBlockCenterContext textformatingBlockCenter() {
			return getRuleContext(TextformatingBlockCenterContext.class,0);
		}
		public TextSCContext textSC() {
			return getRuleContext(TextSCContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TexttypeDeclaratorContext texttypeDeclarator() {
			return getRuleContext(TexttypeDeclaratorContext.class,0);
		}
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public MeasuresContext measures() {
			return getRuleContext(MeasuresContext.class,0);
		}
		public List<SimpleTextContext> simpleText() {
			return getRuleContexts(SimpleTextContext.class);
		}
		public SimpleTextContext simpleText(int i) {
			return getRuleContext(SimpleTextContext.class,i);
		}
		public ArabicContext arabic() {
			return getRuleContext(ArabicContext.class,0);
		}
		public IdentificatorContext identificator() {
			return getRuleContext(IdentificatorContext.class,0);
		}
		public MulticolumnContext multicolumn() {
			return getRuleContext(MulticolumnContext.class,0);
		}
		public DotsContext dots() {
			return getRuleContext(DotsContext.class,0);
		}
		public CommaContext comma() {
			return getRuleContext(CommaContext.class,0);
		}
		public TextRulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textRules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterTextRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitTextRules(this);
		}
	}

	public final TextRulesContext textRules() throws RecognitionException {
		TextRulesContext _localctx = new TextRulesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_textRules);
		try {
			int _alt;
			setState(422);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(397); 
				dollarBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(398); 
				textSymbols();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(399); 
				landScapeBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(400); 
				inlineEquation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(401); 
				equationBlock();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(402); 
				displayEquation();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(403); 
				paragraph();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(404); 
				list();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(405); 
				textformatingBlockFlushLeft();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(406); 
				textformatingBlockCenter();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(407); 
				textSC();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(408); 
				block();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(409); 
				texttypeDeclarator();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(410); 
				interval();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(411); 
				measures();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(413); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(412); 
						simpleText();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(415); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(417); 
				arabic();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(418); 
				identificator();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(419); 
				multicolumn();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(420); 
				dots();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(421); 
				comma();
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

	public static class TextSymbolsContext extends ParserRuleContext {
		public DotContext dot() {
			return getRuleContext(DotContext.class,0);
		}
		public ApposContext appos() {
			return getRuleContext(ApposContext.class,0);
		}
		public LparenContext lparen() {
			return getRuleContext(LparenContext.class,0);
		}
		public RparenContext rparen() {
			return getRuleContext(RparenContext.class,0);
		}
		public TextSymbolsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textSymbols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterTextSymbols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitTextSymbols(this);
		}
	}

	public final TextSymbolsContext textSymbols() throws RecognitionException {
		TextSymbolsContext _localctx = new TextSymbolsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_textSymbols);
		try {
			setState(432);
			switch (_input.LA(1)) {
			case T__96:
				enterOuterAlt(_localctx, 1);
				{
				setState(424); 
				dot();
				}
				break;
			case T__98:
				enterOuterAlt(_localctx, 2);
				{
				setState(425); 
				appos();
				}
				break;
			case T__99:
				enterOuterAlt(_localctx, 3);
				{
				setState(426); 
				lparen();
				}
				break;
			case T__100:
				enterOuterAlt(_localctx, 4);
				{
				setState(427); 
				rparen();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 5);
				{
				setState(428); 
				match(SUB);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 6);
				{
				setState(429); 
				match(T__16);
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 7);
				{
				setState(430); 
				match(MUL);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 8);
				{
				setState(431); 
				match(T__17);
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

	public static class ParagraphContext extends ParserRuleContext {
		public List<MemberListContext> memberList() {
			return getRuleContexts(MemberListContext.class);
		}
		public MemberListContext memberList(int i) {
			return getRuleContext(MemberListContext.class,i);
		}
		public ParagraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paragraph; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterParagraph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitParagraph(this);
		}
	}

	public final ParagraphContext paragraph() throws RecognitionException {
		ParagraphContext _localctx = new ParagraphContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_paragraph);
		int _la;
		try {
			setState(452);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(434); 
				match(T__18);
				setState(435); 
				match(T__5);
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__39) | (1L << T__43) | (1L << T__44) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__79 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__85 - 64)) | (1L << (T__87 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__110 - 64)) | (1L << (T__112 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (TILDE - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)))) != 0)) {
					{
					{
					setState(436); 
					memberList();
					}
					}
					setState(441);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(442); 
				match(T__9);
				}
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(443); 
				match(T__19);
				setState(444); 
				match(T__5);
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__39) | (1L << T__43) | (1L << T__44) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__79 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__85 - 64)) | (1L << (T__87 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__110 - 64)) | (1L << (T__112 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (TILDE - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)))) != 0)) {
					{
					{
					setState(445); 
					memberList();
					}
					}
					setState(450);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(451); 
				match(T__9);
				}
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

	public static class TextContext extends ParserRuleContext {
		public List<TextBodyContext> textBody() {
			return getRuleContexts(TextBodyContext.class);
		}
		public TextBodyContext textBody(int i) {
			return getRuleContext(TextBodyContext.class,i);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitText(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_text);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(454); 
			textBody();
			setState(458);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(455); 
					textBody();
					}
					} 
				}
				setState(460);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public static class TextBodyContext extends ParserRuleContext {
		public BoxBlockContext boxBlock() {
			return getRuleContext(BoxBlockContext.class,0);
		}
		public TexttypeDeclaratorContext texttypeDeclarator() {
			return getRuleContext(TexttypeDeclaratorContext.class,0);
		}
		public SimpleTextContext simpleText() {
			return getRuleContext(SimpleTextContext.class,0);
		}
		public TextSymbolsContext textSymbols() {
			return getRuleContext(TextSymbolsContext.class,0);
		}
		public DollarBlockContext dollarBlock() {
			return getRuleContext(DollarBlockContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CommaContext comma() {
			return getRuleContext(CommaContext.class,0);
		}
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public TextBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterTextBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitTextBody(this);
		}
	}

	public final TextBodyContext textBody() throws RecognitionException {
		TextBodyContext _localctx = new TextBodyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_textBody);
		try {
			setState(470);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(461); 
				boxBlock();
				}
				break;
			case T__6:
			case T__7:
			case T__13:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
				enterOuterAlt(_localctx, 2);
				{
				setState(462); 
				texttypeDeclarator();
				}
				break;
			case String:
			case Num:
				enterOuterAlt(_localctx, 3);
				{
				setState(463); 
				simpleText();
				}
				break;
			case T__16:
			case T__17:
			case T__96:
			case T__98:
			case T__99:
			case T__100:
			case SUB:
			case MUL:
				enterOuterAlt(_localctx, 4);
				{
				setState(464); 
				textSymbols();
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 5);
				{
				setState(465); 
				dollarBlock();
				}
				break;
			case T__5:
			case T__30:
				enterOuterAlt(_localctx, 6);
				{
				setState(466); 
				block();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 7);
				{
				setState(467); 
				comma();
				}
				break;
			case T__95:
				enterOuterAlt(_localctx, 8);
				{
				setState(468); 
				url();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 9);
				{
				setState(469); 
				match(T__0);
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

	public static class TextSCContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TextSCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textSC; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterTextSC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitTextSC(this);
		}
	}

	public final TextSCContext textSC() throws RecognitionException {
		TextSCContext _localctx = new TextSCContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_textSC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472); 
			match(T__20);
			setState(473); 
			block();
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

	public static class LabelContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitLabel(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475); 
			match(T__21);
			setState(476); 
			match(T__5);
			setState(477); 
			text();
			setState(478); 
			match(T__9);
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

	public static class BoxBlockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BoxBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boxBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterBoxBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitBoxBlock(this);
		}
	}

	public final BoxBlockContext boxBlock() throws RecognitionException {
		BoxBlockContext _localctx = new BoxBlockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_boxBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480); 
			match(T__22);
			setState(481); 
			block();
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

	public static class AbstractBlockContext extends ParserRuleContext {
		public List<MemberListContext> memberList() {
			return getRuleContexts(MemberListContext.class);
		}
		public MemberListContext memberList(int i) {
			return getRuleContext(MemberListContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AbstractBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterAbstractBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitAbstractBlock(this);
		}
	}

	public final AbstractBlockContext abstractBlock() throws RecognitionException {
		AbstractBlockContext _localctx = new AbstractBlockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_abstractBlock);
		int _la;
		try {
			setState(493);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(483); 
				match(T__23);
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__39) | (1L << T__43) | (1L << T__44) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__79 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__85 - 64)) | (1L << (T__87 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__110 - 64)) | (1L << (T__112 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (TILDE - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)))) != 0)) {
					{
					{
					setState(484); 
					memberList();
					}
					}
					setState(489);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(490); 
				match(T__24);
				}
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(491); 
				match(T__25);
				setState(492); 
				block();
				}
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

	public static class TitleContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitTitle(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495); 
			match(T__26);
			setState(496); 
			block();
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

	public static class NewcommandDeclarationContext extends ParserRuleContext {
		public IdentificatorContext identificator() {
			return getRuleContext(IdentificatorContext.class,0);
		}
		public CommandBodyContext commandBody() {
			return getRuleContext(CommandBodyContext.class,0);
		}
		public List<OptionsContext> options() {
			return getRuleContexts(OptionsContext.class);
		}
		public OptionsContext options(int i) {
			return getRuleContext(OptionsContext.class,i);
		}
		public NewcommandDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newcommandDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterNewcommandDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitNewcommandDeclaration(this);
		}
	}

	public final NewcommandDeclarationContext newcommandDeclaration() throws RecognitionException {
		NewcommandDeclarationContext _localctx = new NewcommandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_newcommandDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(498); 
			match(T__27);
			setState(499); 
			match(T__5);
			setState(500); 
			identificator();
			setState(501); 
			match(T__9);
			setState(505);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(502); 
					options();
					}
					} 
				}
				setState(507);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(508); 
			commandBody();
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

	public static class CommandBodyContext extends ParserRuleContext {
		public CommandBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterCommandBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitCommandBody(this);
		}
	}

	public final CommandBodyContext commandBody() throws RecognitionException {
		CommandBodyContext _localctx = new CommandBodyContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_commandBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(510);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==T__0) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(513); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (IgnoreAlgorithmKeyWords - 128)) | (1L << (IgnoreUrlPrefix - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (INT - 128)) | (1L << (DOUBLE - 128)) | (1L << (NameChar - 128)) | (1L << (NameStartChar - 128)) | (1L << (ASSIGN - 128)) | (1L << (GT - 128)) | (1L << (LT - 128)) | (1L << (BANG - 128)) | (1L << (TILDE - 128)) | (1L << (QUESTION - 128)) | (1L << (COLON - 128)) | (1L << (EQUAL - 128)) | (1L << (LE - 128)) | (1L << (GE - 128)) | (1L << (NOTEQUAL - 128)) | (1L << (AND - 128)) | (1L << (OR - 128)) | (1L << (INC - 128)) | (1L << (DEC - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)) | (1L << (BITAND - 128)) | (1L << (BITOR - 128)) | (1L << (CARET - 128)) | (1L << (COMMENT - 128)) | (1L << (LINE_COMMENT - 128)) | (1L << (WS - 128)) | (1L << (WORDS_TO_SKIP - 128)) | (1L << (Skip - 128)) | (1L << (Affil - 128)))) != 0) );
			setState(515); 
			match(T__0);
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

	public static class RenewcommandDeclarationContext extends ParserRuleContext {
		public IdentificatorContext identificator() {
			return getRuleContext(IdentificatorContext.class,0);
		}
		public CommandBodyContext commandBody() {
			return getRuleContext(CommandBodyContext.class,0);
		}
		public List<OptionsContext> options() {
			return getRuleContexts(OptionsContext.class);
		}
		public OptionsContext options(int i) {
			return getRuleContext(OptionsContext.class,i);
		}
		public RenewcommandDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renewcommandDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterRenewcommandDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitRenewcommandDeclaration(this);
		}
	}

	public final RenewcommandDeclarationContext renewcommandDeclaration() throws RecognitionException {
		RenewcommandDeclarationContext _localctx = new RenewcommandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_renewcommandDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(517); 
			match(T__28);
			setState(518); 
			match(T__5);
			setState(519); 
			identificator();
			setState(520); 
			match(T__9);
			setState(524);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(521); 
					options();
					}
					} 
				}
				setState(526);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(527); 
			commandBody();
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

	public static class IdentificatorContext extends ParserRuleContext {
		public SimpleTextContext simpleText() {
			return getRuleContext(SimpleTextContext.class,0);
		}
		public IdentificatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterIdentificator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitIdentificator(this);
		}
	}

	public final IdentificatorContext identificator() throws RecognitionException {
		IdentificatorContext _localctx = new IdentificatorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_identificator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529); 
			match(T__29);
			setState(530); 
			simpleText();
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

	public static class BlockContext extends ParserRuleContext {
		public List<MemberListContext> memberList() {
			return getRuleContexts(MemberListContext.class);
		}
		public MemberListContext memberList(int i) {
			return getRuleContext(MemberListContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_block);
		int _la;
		try {
			setState(548);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(532); 
				match(T__5);
				setState(536);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__39) | (1L << T__43) | (1L << T__44) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__79 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__85 - 64)) | (1L << (T__87 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__110 - 64)) | (1L << (T__112 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (TILDE - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)))) != 0)) {
					{
					{
					setState(533); 
					memberList();
					}
					}
					setState(538);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(539); 
				match(T__9);
				}
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(540); 
				match(T__30);
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__39) | (1L << T__43) | (1L << T__44) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__79 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__85 - 64)) | (1L << (T__87 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__110 - 64)) | (1L << (T__112 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (TILDE - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)))) != 0)) {
					{
					{
					setState(541); 
					memberList();
					}
					}
					setState(546);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(547); 
				match(T__31);
				}
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

	public static class MulticolsBlockContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(LaTEXParser.INT, 0); }
		public List<MemberListContext> memberList() {
			return getRuleContexts(MemberListContext.class);
		}
		public MemberListContext memberList(int i) {
			return getRuleContext(MemberListContext.class,i);
		}
		public MulticolsBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multicolsBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterMulticolsBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitMulticolsBlock(this);
		}
	}

	public final MulticolsBlockContext multicolsBlock() throws RecognitionException {
		MulticolsBlockContext _localctx = new MulticolsBlockContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_multicolsBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550); 
			match(T__32);
			setState(551); 
			match(T__5);
			setState(552); 
			match(INT);
			setState(553); 
			match(T__9);
			setState(557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__39) | (1L << T__43) | (1L << T__44) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__79 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__85 - 64)) | (1L << (T__87 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__110 - 64)) | (1L << (T__112 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (TILDE - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)))) != 0)) {
				{
				{
				setState(554); 
				memberList();
				}
				}
				setState(559);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(560); 
			match(T__33);
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

	public static class ListContext extends ParserRuleContext {
		public ItemsContext items() {
			return getRuleContext(ItemsContext.class,0);
		}
		public List<OptionsContext> options() {
			return getRuleContexts(OptionsContext.class);
		}
		public OptionsContext options(int i) {
			return getRuleContext(OptionsContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_list);
		int _la;
		try {
			setState(576);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(562); 
				match(T__34);
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__41) {
					{
					{
					setState(563); 
					options();
					}
					}
					setState(568);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(569); 
				items();
				setState(570); 
				match(T__35);
				}
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(572); 
				match(T__36);
				setState(573); 
				items();
				setState(574); 
				match(T__37);
				}
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

	public static class ItemsContext extends ParserRuleContext {
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public ItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_items; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitItems(this);
		}
	}

	public final ItemsContext items() throws RecognitionException {
		ItemsContext _localctx = new ItemsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_items);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__38) {
				{
				{
				setState(578); 
				item();
				}
				}
				setState(583);
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

	public static class ItemContext extends ParserRuleContext {
		public List<MemberListContext> memberList() {
			return getRuleContexts(MemberListContext.class);
		}
		public MemberListContext memberList(int i) {
			return getRuleContext(MemberListContext.class,i);
		}
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitItem(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_item);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(584); 
				match(T__0);
				}
				}
				setState(589);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(590); 
			match(T__38);
			setState(594);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(591); 
					memberList();
					}
					} 
				}
				setState(596);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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

	public static class DescriptionListContext extends ParserRuleContext {
		public DescriptionItemsContext descriptionItems() {
			return getRuleContext(DescriptionItemsContext.class,0);
		}
		public DescriptionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descriptionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterDescriptionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitDescriptionList(this);
		}
	}

	public final DescriptionListContext descriptionList() throws RecognitionException {
		DescriptionListContext _localctx = new DescriptionListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_descriptionList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(597); 
			match(T__39);
			setState(598); 
			descriptionItems();
			setState(599); 
			match(T__40);
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

	public static class DescriptionItemsContext extends ParserRuleContext {
		public List<DescriptionItemContext> descriptionItem() {
			return getRuleContexts(DescriptionItemContext.class);
		}
		public DescriptionItemContext descriptionItem(int i) {
			return getRuleContext(DescriptionItemContext.class,i);
		}
		public DescriptionItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descriptionItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterDescriptionItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitDescriptionItems(this);
		}
	}

	public final DescriptionItemsContext descriptionItems() throws RecognitionException {
		DescriptionItemsContext _localctx = new DescriptionItemsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_descriptionItems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__38) {
				{
				{
				setState(601); 
				descriptionItem();
				}
				}
				setState(606);
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

	public static class DescriptionItemContext extends ParserRuleContext {
		public DescriptionTitleContext descriptionTitle() {
			return getRuleContext(DescriptionTitleContext.class,0);
		}
		public List<MemberListContext> memberList() {
			return getRuleContexts(MemberListContext.class);
		}
		public MemberListContext memberList(int i) {
			return getRuleContext(MemberListContext.class,i);
		}
		public DescriptionItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descriptionItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterDescriptionItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitDescriptionItem(this);
		}
	}

	public final DescriptionItemContext descriptionItem() throws RecognitionException {
		DescriptionItemContext _localctx = new DescriptionItemContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_descriptionItem);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(607); 
				match(T__0);
				}
				}
				setState(612);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(613); 
			match(T__38);
			setState(614); 
			descriptionTitle();
			setState(618);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(615); 
					memberList();
					}
					} 
				}
				setState(620);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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

	public static class DescriptionTitleContext extends ParserRuleContext {
		public List<MemberListContext> memberList() {
			return getRuleContexts(MemberListContext.class);
		}
		public MemberListContext memberList(int i) {
			return getRuleContext(MemberListContext.class,i);
		}
		public DescriptionTitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descriptionTitle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterDescriptionTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitDescriptionTitle(this);
		}
	}

	public final DescriptionTitleContext descriptionTitle() throws RecognitionException {
		DescriptionTitleContext _localctx = new DescriptionTitleContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_descriptionTitle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621); 
			match(T__41);
			setState(625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__39) | (1L << T__43) | (1L << T__44) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__79 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__85 - 64)) | (1L << (T__87 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__110 - 64)) | (1L << (T__112 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (TILDE - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)))) != 0)) {
				{
				{
				setState(622); 
				memberList();
				}
				}
				setState(627);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(628); 
			match(T__42);
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

	public static class CaptionBlockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public OptionsContext options() {
			return getRuleContext(OptionsContext.class,0);
		}
		public List<NewLineContext> newLine() {
			return getRuleContexts(NewLineContext.class);
		}
		public NewLineContext newLine(int i) {
			return getRuleContext(NewLineContext.class,i);
		}
		public CaptionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_captionBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterCaptionBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitCaptionBlock(this);
		}
	}

	public final CaptionBlockContext captionBlock() throws RecognitionException {
		CaptionBlockContext _localctx = new CaptionBlockContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_captionBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630); 
			match(T__43);
			setState(632);
			_la = _input.LA(1);
			if (_la==T__41) {
				{
				setState(631); 
				options();
				}
			}

			setState(637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__10) {
				{
				{
				setState(634); 
				newLine();
				}
				}
				setState(639);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(640); 
			block();
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

	public static class TableContext extends ParserRuleContext {
		public TableCaptionContext tableCaption() {
			return getRuleContext(TableCaptionContext.class,0);
		}
		public TabularContext tabular() {
			return getRuleContext(TabularContext.class,0);
		}
		public TableDefinitionContext tableDefinition() {
			return getRuleContext(TableDefinitionContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public OptionsContext options() {
			return getRuleContext(OptionsContext.class,0);
		}
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitTable(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_table);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(642); 
			match(T__44);
			setState(644);
			_la = _input.LA(1);
			if (_la==T__41) {
				{
				setState(643); 
				options();
				}
			}

			setState(649);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(646); 
					match(T__0);
					}
					} 
				}
				setState(651);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__45) {
				{
				{
				setState(652); 
				match(T__45);
				}
				}
				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(658); 
				match(T__0);
				}
				}
				setState(663);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(664); 
			tableCaption();
			setState(668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(665); 
				match(T__0);
				}
				}
				setState(670);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(671); 
			tabular();
			setState(675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(672); 
				match(T__0);
				}
				}
				setState(677);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(678); 
			tableDefinition();
			setState(682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(679); 
				match(T__0);
				}
				}
				setState(684);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(685); 
			label();
			setState(689);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(686); 
					match(T__0);
					}
					} 
				}
				setState(691);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__46) {
				{
				{
				setState(692); 
				match(T__46);
				}
				}
				setState(697);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(698); 
				match(T__0);
				}
				}
				setState(703);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(704); 
			match(T__47);
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

	public static class TableCaptionContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TableCaptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableCaption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterTableCaption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitTableCaption(this);
		}
	}

	public final TableCaptionContext tableCaption() throws RecognitionException {
		TableCaptionContext _localctx = new TableCaptionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_tableCaption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706); 
			match(T__43);
			setState(707); 
			block();
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

	public static class TabularContext extends ParserRuleContext {
		public TableSkipBlockContext tableSkipBlock() {
			return getRuleContext(TableSkipBlockContext.class,0);
		}
		public List<TableRowContext> tableRow() {
			return getRuleContexts(TableRowContext.class);
		}
		public TableRowContext tableRow(int i) {
			return getRuleContext(TableRowContext.class,i);
		}
		public TabularContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tabular; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterTabular(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitTabular(this);
		}
	}

	public final TabularContext tabular() throws RecognitionException {
		TabularContext _localctx = new TabularContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_tabular);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(709); 
			match(T__48);
			setState(710); 
			tableSkipBlock();
			setState(714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(711); 
				match(T__0);
				}
				}
				setState(716);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(717); 
			match(T__49);
			setState(721);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(718); 
					match(T__0);
					}
					} 
				}
				setState(723);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			setState(729); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(724); 
				tableRow();
				setState(725); 
				match(T__50);
				setState(727);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(726); 
					match(T__0);
					}
					break;
				}
				}
				}
				setState(731); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__39) | (1L << T__43) | (1L << T__44) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__79 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__85 - 64)) | (1L << (T__87 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__110 - 64)) | (1L << (T__112 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (TILDE - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)))) != 0) );
			setState(733); 
			match(T__51);
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

	public static class TableSkipBlockContext extends ParserRuleContext {
		public TableSkipBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableSkipBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterTableSkipBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitTableSkipBlock(this);
		}
	}

	public final TableSkipBlockContext tableSkipBlock() throws RecognitionException {
		TableSkipBlockContext _localctx = new TableSkipBlockContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_tableSkipBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735); 
			match(T__5);
			setState(737); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(736);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==T__9) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(739); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (IgnoreAlgorithmKeyWords - 128)) | (1L << (IgnoreUrlPrefix - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (INT - 128)) | (1L << (DOUBLE - 128)) | (1L << (NameChar - 128)) | (1L << (NameStartChar - 128)) | (1L << (ASSIGN - 128)) | (1L << (GT - 128)) | (1L << (LT - 128)) | (1L << (BANG - 128)) | (1L << (TILDE - 128)) | (1L << (QUESTION - 128)) | (1L << (COLON - 128)) | (1L << (EQUAL - 128)) | (1L << (LE - 128)) | (1L << (GE - 128)) | (1L << (NOTEQUAL - 128)) | (1L << (AND - 128)) | (1L << (OR - 128)) | (1L << (INC - 128)) | (1L << (DEC - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)) | (1L << (BITAND - 128)) | (1L << (BITOR - 128)) | (1L << (CARET - 128)) | (1L << (COMMENT - 128)) | (1L << (LINE_COMMENT - 128)) | (1L << (WS - 128)) | (1L << (WORDS_TO_SKIP - 128)) | (1L << (Skip - 128)) | (1L << (Affil - 128)))) != 0) );
			setState(741); 
			match(T__9);
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

	public static class TableDefinitionContext extends ParserRuleContext {
		public MemberListContext memberList() {
			return getRuleContext(MemberListContext.class,0);
		}
		public TableDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterTableDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitTableDefinition(this);
		}
	}

	public final TableDefinitionContext tableDefinition() throws RecognitionException {
		TableDefinitionContext _localctx = new TableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_tableDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743); 
			match(T__3);
			setState(744); 
			memberList();
			setState(745); 
			match(T__4);
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

	public static class MulticolumnContext extends ParserRuleContext {
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TableSkipBlockContext tableSkipBlock() {
			return getRuleContext(TableSkipBlockContext.class,0);
		}
		public MulticolumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multicolumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterMulticolumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitMulticolumn(this);
		}
	}

	public final MulticolumnContext multicolumn() throws RecognitionException {
		MulticolumnContext _localctx = new MulticolumnContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_multicolumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747); 
			match(T__52);
			setState(748); 
			block();
			setState(749); 
			tableSkipBlock();
			setState(751);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(750); 
				block();
				}
				break;
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

	public static class TableRowContext extends ParserRuleContext {
		public List<TableCellContext> tableCell() {
			return getRuleContexts(TableCellContext.class);
		}
		public TableCellContext tableCell(int i) {
			return getRuleContext(TableCellContext.class,i);
		}
		public TableRowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableRow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterTableRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitTableRow(this);
		}
	}

	public final TableRowContext tableRow() throws RecognitionException {
		TableRowContext _localctx = new TableRowContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_tableRow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753); 
			tableCell();
			setState(758);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(754); 
				match(BITAND);
				setState(755); 
				tableCell();
				}
				}
				setState(760);
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

	public static class TableCellContext extends ParserRuleContext {
		public MemberListContext memberList() {
			return getRuleContext(MemberListContext.class,0);
		}
		public TableCellContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableCell; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterTableCell(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitTableCell(this);
		}
	}

	public final TableCellContext tableCell() throws RecognitionException {
		TableCellContext _localctx = new TableCellContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_tableCell);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(761); 
				match(T__53);
				}
				break;
			}
			setState(764); 
			memberList();
			setState(766);
			_la = _input.LA(1);
			if (_la==T__53) {
				{
				setState(765); 
				match(T__53);
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

	public static class TexttypeDeclaratorContext extends ParserRuleContext {
		public ItalictypeDeclarationContext italictypeDeclaration() {
			return getRuleContext(ItalictypeDeclarationContext.class,0);
		}
		public SmallcapsDeclarationContext smallcapsDeclaration() {
			return getRuleContext(SmallcapsDeclarationContext.class,0);
		}
		public BoldTypeDeclarationContext boldTypeDeclaration() {
			return getRuleContext(BoldTypeDeclarationContext.class,0);
		}
		public TtStyleContext ttStyle() {
			return getRuleContext(TtStyleContext.class,0);
		}
		public TexttypeDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texttypeDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterTexttypeDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitTexttypeDeclarator(this);
		}
	}

	public final TexttypeDeclaratorContext texttypeDeclarator() throws RecognitionException {
		TexttypeDeclaratorContext _localctx = new TexttypeDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_texttypeDeclarator);
		int _la;
		try {
			setState(773);
			switch (_input.LA(1)) {
			case T__59:
			case T__60:
			case T__61:
			case T__62:
				enterOuterAlt(_localctx, 1);
				{
				setState(768); 
				italictypeDeclaration();
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 2);
				{
				setState(769); 
				smallcapsDeclaration();
				}
				break;
			case T__7:
			case T__13:
			case T__57:
				enterOuterAlt(_localctx, 3);
				{
				setState(770); 
				boldTypeDeclaration();
				}
				break;
			case T__6:
			case T__54:
			case T__55:
				enterOuterAlt(_localctx, 4);
				{
				setState(771);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__54) | (1L << T__55))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case T__56:
				enterOuterAlt(_localctx, 5);
				{
				setState(772); 
				ttStyle();
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

	public static class TtStyleContext extends ParserRuleContext {
		public List<MemberListContext> memberList() {
			return getRuleContexts(MemberListContext.class);
		}
		public MemberListContext memberList(int i) {
			return getRuleContext(MemberListContext.class,i);
		}
		public TtStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ttStyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterTtStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitTtStyle(this);
		}
	}

	public final TtStyleContext ttStyle() throws RecognitionException {
		TtStyleContext _localctx = new TtStyleContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_ttStyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775); 
			match(T__56);
			setState(779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__39) | (1L << T__43) | (1L << T__44) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__79 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__85 - 64)) | (1L << (T__87 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__110 - 64)) | (1L << (T__112 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (TILDE - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)))) != 0)) {
				{
				{
				setState(776); 
				memberList();
				}
				}
				setState(781);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(782); 
			match(T__9);
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

	public static class BoldTypeDeclarationContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MemberListContext memberList() {
			return getRuleContext(MemberListContext.class,0);
		}
		public BoldTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boldTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterBoldTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitBoldTypeDeclaration(this);
		}
	}

	public final BoldTypeDeclarationContext boldTypeDeclaration() throws RecognitionException {
		BoldTypeDeclarationContext _localctx = new BoldTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_boldTypeDeclaration);
		try {
			setState(795);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(784); 
				match(T__7);
				setState(785); 
				block();
				}
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(786); 
				match(T__57);
				setState(787); 
				memberList();
				setState(788); 
				match(T__9);
				}
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(790); 
				match(T__13);
				setState(791); 
				match(T__5);
				setState(792); 
				memberList();
				setState(793); 
				match(T__9);
				}
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

	public static class SmallcapsDeclarationContext extends ParserRuleContext {
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public SmallcapsDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_smallcapsDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterSmallcapsDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitSmallcapsDeclaration(this);
		}
	}

	public final SmallcapsDeclarationContext smallcapsDeclaration() throws RecognitionException {
		SmallcapsDeclarationContext _localctx = new SmallcapsDeclarationContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_smallcapsDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797); 
			match(T__58);
			setState(801);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__11) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__22) | (1L << T__30) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (T__95 - 96)) | (1L << (T__96 - 96)) | (1L << (T__98 - 96)) | (1L << (T__99 - 96)) | (1L << (T__100 - 96)) | (1L << (String - 96)) | (1L << (Num - 96)) | (1L << (SUB - 96)) | (1L << (MUL - 96)))) != 0)) {
				{
				{
				setState(798); 
				text();
				}
				}
				setState(803);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(804); 
			match(T__9);
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

	public static class ItalictypeDeclarationContext extends ParserRuleContext {
		public ItalicBlockContext italicBlock() {
			return getRuleContext(ItalicBlockContext.class,0);
		}
		public ItalicOutBlockContext italicOutBlock() {
			return getRuleContext(ItalicOutBlockContext.class,0);
		}
		public ItalictypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_italictypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterItalictypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitItalictypeDeclaration(this);
		}
	}

	public final ItalictypeDeclarationContext italictypeDeclaration() throws RecognitionException {
		ItalictypeDeclarationContext _localctx = new ItalictypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_italictypeDeclaration);
		try {
			setState(808);
			switch (_input.LA(1)) {
			case T__59:
			case T__60:
				enterOuterAlt(_localctx, 1);
				{
				setState(806); 
				italicBlock();
				}
				break;
			case T__61:
			case T__62:
				enterOuterAlt(_localctx, 2);
				{
				setState(807); 
				italicOutBlock();
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

	public static class ItalicBlockContext extends ParserRuleContext {
		public List<MemberListContext> memberList() {
			return getRuleContexts(MemberListContext.class);
		}
		public MemberListContext memberList(int i) {
			return getRuleContext(MemberListContext.class,i);
		}
		public ItalicBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_italicBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterItalicBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitItalicBlock(this);
		}
	}

	public final ItalicBlockContext italicBlock() throws RecognitionException {
		ItalicBlockContext _localctx = new ItalicBlockContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_italicBlock);
		int _la;
		try {
			setState(829);
			switch (_input.LA(1)) {
			case T__59:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(810); 
				match(T__59);
				setState(814);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__39) | (1L << T__43) | (1L << T__44) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__79 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__85 - 64)) | (1L << (T__87 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__110 - 64)) | (1L << (T__112 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (TILDE - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)))) != 0)) {
					{
					{
					setState(811); 
					memberList();
					}
					}
					setState(816);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(817); 
				match(T__9);
				}
				}
				break;
			case T__60:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(818); 
				match(T__60);
				setState(822);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__39) | (1L << T__43) | (1L << T__44) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__79 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__85 - 64)) | (1L << (T__87 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__110 - 64)) | (1L << (T__112 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (TILDE - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)))) != 0)) {
					{
					{
					setState(819); 
					memberList();
					}
					}
					setState(824);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(825); 
				match(T__9);
				setState(827);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(826); 
					match(T__29);
					}
					break;
				}
				}
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

	public static class ItalicOutBlockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ItalicOutBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_italicOutBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterItalicOutBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitItalicOutBlock(this);
		}
	}

	public final ItalicOutBlockContext italicOutBlock() throws RecognitionException {
		ItalicOutBlockContext _localctx = new ItalicOutBlockContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_italicOutBlock);
		try {
			setState(835);
			switch (_input.LA(1)) {
			case T__61:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(831); 
				match(T__61);
				setState(832); 
				block();
				}
				}
				break;
			case T__62:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(833); 
				match(T__62);
				setState(834); 
				block();
				}
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

	public static class TextformatingBlockFlushLeftContext extends ParserRuleContext {
		public MemberListContext memberList() {
			return getRuleContext(MemberListContext.class,0);
		}
		public TextformatingBlockFlushLeftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textformatingBlockFlushLeft; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterTextformatingBlockFlushLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitTextformatingBlockFlushLeft(this);
		}
	}

	public final TextformatingBlockFlushLeftContext textformatingBlockFlushLeft() throws RecognitionException {
		TextformatingBlockFlushLeftContext _localctx = new TextformatingBlockFlushLeftContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_textformatingBlockFlushLeft);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837); 
			match(T__3);
			setState(838); 
			memberList();
			setState(839); 
			match(T__4);
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

	public static class TextformatingBlockCenterContext extends ParserRuleContext {
		public List<MemberListContext> memberList() {
			return getRuleContexts(MemberListContext.class);
		}
		public MemberListContext memberList(int i) {
			return getRuleContext(MemberListContext.class,i);
		}
		public TextformatingBlockCenterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textformatingBlockCenter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterTextformatingBlockCenter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitTextformatingBlockCenter(this);
		}
	}

	public final TextformatingBlockCenterContext textformatingBlockCenter() throws RecognitionException {
		TextformatingBlockCenterContext _localctx = new TextformatingBlockCenterContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_textformatingBlockCenter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841); 
			match(T__63);
			setState(845);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__39) | (1L << T__43) | (1L << T__44) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__79 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__85 - 64)) | (1L << (T__87 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__110 - 64)) | (1L << (T__112 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (TILDE - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)))) != 0)) {
				{
				{
				setState(842); 
				memberList();
				}
				}
				setState(847);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(848); 
			match(T__64);
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

	public static class SectionDeclarationContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public SectionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sectionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterSectionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitSectionDeclaration(this);
		}
	}

	public final SectionDeclarationContext sectionDeclaration() throws RecognitionException {
		SectionDeclarationContext _localctx = new SectionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_sectionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(850);
			_la = _input.LA(1);
			if ( !(_la==T__65 || _la==T__66) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(851); 
			match(T__5);
			setState(853);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(852); 
				label();
				}
			}

			setState(855); 
			text();
			setState(856); 
			match(T__9);
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

	public static class SubsectionDeclarationContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public SubsectionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subsectionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterSubsectionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitSubsectionDeclaration(this);
		}
	}

	public final SubsectionDeclarationContext subsectionDeclaration() throws RecognitionException {
		SubsectionDeclarationContext _localctx = new SubsectionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_subsectionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(858);
			_la = _input.LA(1);
			if ( !(_la==T__67 || _la==T__68) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(859); 
			match(T__5);
			setState(861);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(860); 
				label();
				}
			}

			setState(863); 
			text();
			setState(864); 
			match(T__9);
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

	public static class SubsubsectionDeclarationContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public SubsubsectionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subsubsectionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterSubsubsectionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitSubsubsectionDeclaration(this);
		}
	}

	public final SubsubsectionDeclarationContext subsubsectionDeclaration() throws RecognitionException {
		SubsubsectionDeclarationContext _localctx = new SubsubsectionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_subsubsectionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(866);
			_la = _input.LA(1);
			if ( !(_la==T__69 || _la==T__70) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(867); 
			match(T__5);
			setState(869);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(868); 
				label();
				}
			}

			setState(871); 
			text();
			setState(872); 
			match(T__9);
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

	public static class CiteReferencesContext extends ParserRuleContext {
		public CiteReferencesListContext citeReferencesList() {
			return getRuleContext(CiteReferencesListContext.class,0);
		}
		public List<OptionsContext> options() {
			return getRuleContexts(OptionsContext.class);
		}
		public OptionsContext options(int i) {
			return getRuleContext(OptionsContext.class,i);
		}
		public CiteReferencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_citeReferences; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterCiteReferences(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitCiteReferences(this);
		}
	}

	public final CiteReferencesContext citeReferences() throws RecognitionException {
		CiteReferencesContext _localctx = new CiteReferencesContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_citeReferences);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			_la = _input.LA(1);
			if (_la==TILDE) {
				{
				setState(874); 
				match(TILDE);
				}
			}

			setState(877);
			_la = _input.LA(1);
			if ( !(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (T__71 - 72)) | (1L << (T__72 - 72)) | (1L << (T__73 - 72)) | (1L << (T__74 - 72)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(881);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__41) {
				{
				{
				setState(878); 
				options();
				}
				}
				setState(883);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(884); 
			match(T__5);
			setState(885); 
			citeReferencesList();
			setState(886); 
			match(T__9);
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

	public static class CiteReferencesListContext extends ParserRuleContext {
		public List<CiteReferenceContext> citeReference() {
			return getRuleContexts(CiteReferenceContext.class);
		}
		public CiteReferenceContext citeReference(int i) {
			return getRuleContext(CiteReferenceContext.class,i);
		}
		public CiteReferencesListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_citeReferencesList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterCiteReferencesList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitCiteReferencesList(this);
		}
	}

	public final CiteReferencesListContext citeReferencesList() throws RecognitionException {
		CiteReferencesListContext _localctx = new CiteReferencesListContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_citeReferencesList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(888); 
			citeReference();
			setState(905);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(889); 
				match(T__11);
				setState(893);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(890); 
						match(T__0);
						}
						} 
					}
					setState(895);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				}
				setState(896); 
				citeReference();
				setState(900);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(897); 
					match(T__0);
					}
					}
					setState(902);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(907);
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

	public static class CiteReferenceContext extends ParserRuleContext {
		public List<SimpleTextContext> simpleText() {
			return getRuleContexts(SimpleTextContext.class);
		}
		public SimpleTextContext simpleText(int i) {
			return getRuleContext(SimpleTextContext.class,i);
		}
		public List<LparenContext> lparen() {
			return getRuleContexts(LparenContext.class);
		}
		public LparenContext lparen(int i) {
			return getRuleContext(LparenContext.class,i);
		}
		public List<RparenContext> rparen() {
			return getRuleContexts(RparenContext.class);
		}
		public RparenContext rparen(int i) {
			return getRuleContext(RparenContext.class,i);
		}
		public CiteReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_citeReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterCiteReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitCiteReference(this);
		}
	}

	public final CiteReferenceContext citeReference() throws RecognitionException {
		CiteReferenceContext _localctx = new CiteReferenceContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_citeReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (T__99 - 100)) | (1L << (T__100 - 100)) | (1L << (String - 100)) | (1L << (Num - 100)))) != 0)) {
				{
				setState(911);
				switch (_input.LA(1)) {
				case String:
				case Num:
					{
					setState(908); 
					simpleText();
					}
					break;
				case T__99:
					{
					setState(909); 
					lparen();
					}
					break;
				case T__100:
					{
					setState(910); 
					rparen();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(915);
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

	public static class MeasuresContext extends ParserRuleContext {
		public MeasuresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_measures; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterMeasures(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitMeasures(this);
		}
	}

	public final MeasuresContext measures() throws RecognitionException {
		MeasuresContext _localctx = new MeasuresContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_measures);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(916);
			_la = _input.LA(1);
			if ( !(_la==T__75 || _la==T__76) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class FigureBlockContext extends ParserRuleContext {
		public OptionsContext options() {
			return getRuleContext(OptionsContext.class,0);
		}
		public List<MemberListContext> memberList() {
			return getRuleContexts(MemberListContext.class);
		}
		public MemberListContext memberList(int i) {
			return getRuleContext(MemberListContext.class,i);
		}
		public FigureBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_figureBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterFigureBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitFigureBlock(this);
		}
	}

	public final FigureBlockContext figureBlock() throws RecognitionException {
		FigureBlockContext _localctx = new FigureBlockContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_figureBlock);
		int _la;
		try {
			setState(940);
			switch (_input.LA(1)) {
			case T__77:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(918); 
				match(T__77);
				setState(920);
				_la = _input.LA(1);
				if (_la==T__41) {
					{
					setState(919); 
					options();
					}
				}

				setState(925);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__39) | (1L << T__43) | (1L << T__44) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__79 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__85 - 64)) | (1L << (T__87 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__110 - 64)) | (1L << (T__112 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (TILDE - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)))) != 0)) {
					{
					{
					setState(922); 
					memberList();
					}
					}
					setState(927);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(928); 
				match(T__78);
				}
				}
				break;
			case T__79:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(929); 
				match(T__79);
				setState(931);
				_la = _input.LA(1);
				if (_la==T__41) {
					{
					setState(930); 
					options();
					}
				}

				setState(936);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__39) | (1L << T__43) | (1L << T__44) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__79 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__85 - 64)) | (1L << (T__87 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__110 - 64)) | (1L << (T__112 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (TILDE - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)))) != 0)) {
					{
					{
					setState(933); 
					memberList();
					}
					}
					setState(938);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(939); 
				match(T__80);
				}
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

	public static class SupplementaryFigureBlockContext extends ParserRuleContext {
		public OptionsContext options() {
			return getRuleContext(OptionsContext.class,0);
		}
		public List<MemberListContext> memberList() {
			return getRuleContexts(MemberListContext.class);
		}
		public MemberListContext memberList(int i) {
			return getRuleContext(MemberListContext.class,i);
		}
		public SupplementaryFigureBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supplementaryFigureBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterSupplementaryFigureBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitSupplementaryFigureBlock(this);
		}
	}

	public final SupplementaryFigureBlockContext supplementaryFigureBlock() throws RecognitionException {
		SupplementaryFigureBlockContext _localctx = new SupplementaryFigureBlockContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_supplementaryFigureBlock);
		int _la;
		try {
			setState(964);
			switch (_input.LA(1)) {
			case T__81:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(942); 
				match(T__81);
				setState(944);
				_la = _input.LA(1);
				if (_la==T__41) {
					{
					setState(943); 
					options();
					}
				}

				setState(949);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__39) | (1L << T__43) | (1L << T__44) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__79 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__85 - 64)) | (1L << (T__87 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__110 - 64)) | (1L << (T__112 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (TILDE - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)))) != 0)) {
					{
					{
					setState(946); 
					memberList();
					}
					}
					setState(951);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(952); 
				match(T__82);
				}
				}
				break;
			case T__83:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(953); 
				match(T__83);
				setState(955);
				_la = _input.LA(1);
				if (_la==T__41) {
					{
					setState(954); 
					options();
					}
				}

				setState(960);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__39) | (1L << T__43) | (1L << T__44) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__79 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__85 - 64)) | (1L << (T__87 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__110 - 64)) | (1L << (T__112 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (TILDE - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)))) != 0)) {
					{
					{
					setState(957); 
					memberList();
					}
					}
					setState(962);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(963); 
				match(T__84);
				}
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

	public static class AlgorithmBlockContext extends ParserRuleContext {
		public OptionsContext options() {
			return getRuleContext(OptionsContext.class,0);
		}
		public List<MemberListContext> memberList() {
			return getRuleContexts(MemberListContext.class);
		}
		public MemberListContext memberList(int i) {
			return getRuleContext(MemberListContext.class,i);
		}
		public AlgorithmBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algorithmBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterAlgorithmBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitAlgorithmBlock(this);
		}
	}

	public final AlgorithmBlockContext algorithmBlock() throws RecognitionException {
		AlgorithmBlockContext _localctx = new AlgorithmBlockContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_algorithmBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(966); 
			match(T__85);
			setState(968);
			_la = _input.LA(1);
			if (_la==T__41) {
				{
				setState(967); 
				options();
				}
			}

			setState(973);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__39) | (1L << T__43) | (1L << T__44) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__79 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__85 - 64)) | (1L << (T__87 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__110 - 64)) | (1L << (T__112 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (TILDE - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)))) != 0)) {
				{
				{
				setState(970); 
				memberList();
				}
				}
				setState(975);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(976); 
			match(T__86);
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

	public static class AlgorithmicBlockContext extends ParserRuleContext {
		public OptionsContext options() {
			return getRuleContext(OptionsContext.class,0);
		}
		public List<MemberListContext> memberList() {
			return getRuleContexts(MemberListContext.class);
		}
		public MemberListContext memberList(int i) {
			return getRuleContext(MemberListContext.class,i);
		}
		public AlgorithmicBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algorithmicBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterAlgorithmicBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitAlgorithmicBlock(this);
		}
	}

	public final AlgorithmicBlockContext algorithmicBlock() throws RecognitionException {
		AlgorithmicBlockContext _localctx = new AlgorithmicBlockContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_algorithmicBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(978); 
			match(T__87);
			setState(980);
			_la = _input.LA(1);
			if (_la==T__41) {
				{
				setState(979); 
				options();
				}
			}

			setState(985);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__39) | (1L << T__43) | (1L << T__44) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__79 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__85 - 64)) | (1L << (T__87 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__110 - 64)) | (1L << (T__112 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (TILDE - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)))) != 0)) {
				{
				{
				setState(982); 
				memberList();
				}
				}
				setState(987);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(988); 
			match(T__88);
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

	public static class InputContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990); 
			match(T__89);
			setState(991); 
			block();
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

	public static class OutputContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitOutput(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(993); 
			match(T__90);
			setState(994); 
			block();
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

	public static class StateContext extends ParserRuleContext {
		public NewLineContext newLine() {
			return getRuleContext(NewLineContext.class,0);
		}
		public List<TextRulesContext> textRules() {
			return getRuleContexts(TextRulesContext.class);
		}
		public TextRulesContext textRules(int i) {
			return getRuleContext(TextRulesContext.class,i);
		}
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitState(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(996); 
			match(T__91);
			setState(1000);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__29) | (1L << T__30) | (1L << T__34) | (1L << T__36) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__110 - 64)) | (1L << (T__112 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__121 - 64)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (String - 132)) | (1L << (Num - 132)) | (1L << (SUB - 132)) | (1L << (MUL - 132)))) != 0)) {
				{
				{
				setState(997); 
				textRules();
				}
				}
				setState(1002);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1003); 
			newLine();
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

	public static class ForBlockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterForBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitForBlock(this);
		}
	}

	public final ForBlockContext forBlock() throws RecognitionException {
		ForBlockContext _localctx = new ForBlockContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_forBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1005); 
			match(T__92);
			setState(1006); 
			block();
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

	public static class IfBlockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitIfBlock(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1008); 
			match(T__93);
			setState(1009); 
			block();
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

	public static class ReturnBlockContext extends ParserRuleContext {
		public NewLineContext newLine() {
			return getRuleContext(NewLineContext.class,0);
		}
		public List<TextRulesContext> textRules() {
			return getRuleContexts(TextRulesContext.class);
		}
		public TextRulesContext textRules(int i) {
			return getRuleContext(TextRulesContext.class,i);
		}
		public ReturnBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterReturnBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitReturnBlock(this);
		}
	}

	public final ReturnBlockContext returnBlock() throws RecognitionException {
		ReturnBlockContext _localctx = new ReturnBlockContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_returnBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1011); 
			match(T__94);
			setState(1015);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__29) | (1L << T__30) | (1L << T__34) | (1L << T__36) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__110 - 64)) | (1L << (T__112 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__121 - 64)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (String - 132)) | (1L << (Num - 132)) | (1L << (SUB - 132)) | (1L << (MUL - 132)))) != 0)) {
				{
				{
				setState(1012); 
				textRules();
				}
				}
				setState(1017);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1018); 
			newLine();
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

	public static class UrlContext extends ParserRuleContext {
		public UrlTextContext urlText() {
			return getRuleContext(UrlTextContext.class,0);
		}
		public UrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_url; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitUrl(this);
		}
	}

	public final UrlContext url() throws RecognitionException {
		UrlContext _localctx = new UrlContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_url);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1020); 
			match(T__95);
			setState(1021); 
			match(T__5);
			setState(1022); 
			urlText();
			setState(1023); 
			match(T__9);
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

	public static class UrlTextContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public UrlTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_urlText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterUrlText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitUrlText(this);
		}
	}

	public final UrlTextContext urlText() throws RecognitionException {
		UrlTextContext _localctx = new UrlTextContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_urlText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1025); 
			text();
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

	public static class OptionsContext extends ParserRuleContext {
		public OptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitOptions(this);
		}
	}

	public final OptionsContext options() throws RecognitionException {
		OptionsContext _localctx = new OptionsContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1027); 
			match(T__41);
			setState(1031);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (IgnoreAlgorithmKeyWords - 128)) | (1L << (IgnoreUrlPrefix - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (INT - 128)) | (1L << (DOUBLE - 128)) | (1L << (NameChar - 128)) | (1L << (NameStartChar - 128)) | (1L << (ASSIGN - 128)) | (1L << (GT - 128)) | (1L << (LT - 128)) | (1L << (BANG - 128)) | (1L << (TILDE - 128)) | (1L << (QUESTION - 128)) | (1L << (COLON - 128)) | (1L << (EQUAL - 128)) | (1L << (LE - 128)) | (1L << (GE - 128)) | (1L << (NOTEQUAL - 128)) | (1L << (AND - 128)) | (1L << (OR - 128)) | (1L << (INC - 128)) | (1L << (DEC - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)) | (1L << (BITAND - 128)) | (1L << (BITOR - 128)) | (1L << (CARET - 128)) | (1L << (COMMENT - 128)) | (1L << (LINE_COMMENT - 128)) | (1L << (WS - 128)) | (1L << (WORDS_TO_SKIP - 128)) | (1L << (Skip - 128)) | (1L << (Affil - 128)))) != 0)) {
				{
				{
				setState(1028);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==T__42) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(1033);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1034); 
			match(T__42);
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

	public static class CommaContext extends ParserRuleContext {
		public CommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitComma(this);
		}
	}

	public final CommaContext comma() throws RecognitionException {
		CommaContext _localctx = new CommaContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_comma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1036); 
			match(T__11);
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

	public static class DotContext extends ParserRuleContext {
		public DotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitDot(this);
		}
	}

	public final DotContext dot() throws RecognitionException {
		DotContext _localctx = new DotContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1038); 
			match(T__96);
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

	public static class DotsContext extends ParserRuleContext {
		public DotsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dots; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterDots(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitDots(this);
		}
	}

	public final DotsContext dots() throws RecognitionException {
		DotsContext _localctx = new DotsContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_dots);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1040); 
			match(T__97);
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

	public static class ApposContext extends ParserRuleContext {
		public ApposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterAppos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitAppos(this);
		}
	}

	public final ApposContext appos() throws RecognitionException {
		ApposContext _localctx = new ApposContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_appos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1042); 
			match(T__98);
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

	public static class LparenContext extends ParserRuleContext {
		public LparenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lparen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterLparen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitLparen(this);
		}
	}

	public final LparenContext lparen() throws RecognitionException {
		LparenContext _localctx = new LparenContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_lparen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1044); 
			match(T__99);
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

	public static class RparenContext extends ParserRuleContext {
		public RparenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rparen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterRparen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitRparen(this);
		}
	}

	public final RparenContext rparen() throws RecognitionException {
		RparenContext _localctx = new RparenContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_rparen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1046); 
			match(T__100);
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

	public static class DollarBlockContext extends ParserRuleContext {
		public DollarBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dollarBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterDollarBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitDollarBlock(this);
		}
	}

	public final DollarBlockContext dollarBlock() throws RecognitionException {
		DollarBlockContext _localctx = new DollarBlockContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_dollarBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1048); 
			match(T__53);
			setState(1050);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (IgnoreAlgorithmKeyWords - 128)) | (1L << (IgnoreUrlPrefix - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (INT - 128)) | (1L << (DOUBLE - 128)) | (1L << (NameChar - 128)) | (1L << (NameStartChar - 128)) | (1L << (ASSIGN - 128)) | (1L << (GT - 128)) | (1L << (LT - 128)) | (1L << (BANG - 128)) | (1L << (TILDE - 128)) | (1L << (QUESTION - 128)) | (1L << (COLON - 128)) | (1L << (EQUAL - 128)) | (1L << (LE - 128)) | (1L << (GE - 128)) | (1L << (NOTEQUAL - 128)) | (1L << (AND - 128)) | (1L << (OR - 128)) | (1L << (INC - 128)) | (1L << (DEC - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)) | (1L << (BITAND - 128)) | (1L << (BITOR - 128)) | (1L << (CARET - 128)) | (1L << (COMMENT - 128)) | (1L << (LINE_COMMENT - 128)) | (1L << (WS - 128)) | (1L << (WORDS_TO_SKIP - 128)) | (1L << (Skip - 128)) | (1L << (Affil - 128)))) != 0)) {
				{
				setState(1049);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==T__53) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(1052); 
			match(T__53);
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

	public static class InlineEquationContext extends ParserRuleContext {
		public DollarBlockContext dollarBlock() {
			return getRuleContext(DollarBlockContext.class,0);
		}
		public EqnArrayContext eqnArray() {
			return getRuleContext(EqnArrayContext.class,0);
		}
		public InlineEquationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineEquation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterInlineEquation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitInlineEquation(this);
		}
	}

	public final InlineEquationContext inlineEquation() throws RecognitionException {
		InlineEquationContext _localctx = new InlineEquationContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_inlineEquation);
		int _la;
		try {
			setState(1091);
			switch (_input.LA(1)) {
			case T__101:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1054); 
				match(T__101);
				setState(1056); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1055);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__101) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(1058); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (IgnoreAlgorithmKeyWords - 128)) | (1L << (IgnoreUrlPrefix - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (INT - 128)) | (1L << (DOUBLE - 128)) | (1L << (NameChar - 128)) | (1L << (NameStartChar - 128)) | (1L << (ASSIGN - 128)) | (1L << (GT - 128)) | (1L << (LT - 128)) | (1L << (BANG - 128)) | (1L << (TILDE - 128)) | (1L << (QUESTION - 128)) | (1L << (COLON - 128)) | (1L << (EQUAL - 128)) | (1L << (LE - 128)) | (1L << (GE - 128)) | (1L << (NOTEQUAL - 128)) | (1L << (AND - 128)) | (1L << (OR - 128)) | (1L << (INC - 128)) | (1L << (DEC - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)) | (1L << (BITAND - 128)) | (1L << (BITOR - 128)) | (1L << (CARET - 128)) | (1L << (COMMENT - 128)) | (1L << (LINE_COMMENT - 128)) | (1L << (WS - 128)) | (1L << (WORDS_TO_SKIP - 128)) | (1L << (Skip - 128)) | (1L << (Affil - 128)))) != 0) );
				setState(1060); 
				match(T__101);
				}
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 2);
				{
				setState(1061); 
				dollarBlock();
				}
				break;
			case T__102:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1062); 
				match(T__102);
				setState(1064); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1063);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__103) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(1066); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (IgnoreAlgorithmKeyWords - 128)) | (1L << (IgnoreUrlPrefix - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (INT - 128)) | (1L << (DOUBLE - 128)) | (1L << (NameChar - 128)) | (1L << (NameStartChar - 128)) | (1L << (ASSIGN - 128)) | (1L << (GT - 128)) | (1L << (LT - 128)) | (1L << (BANG - 128)) | (1L << (TILDE - 128)) | (1L << (QUESTION - 128)) | (1L << (COLON - 128)) | (1L << (EQUAL - 128)) | (1L << (LE - 128)) | (1L << (GE - 128)) | (1L << (NOTEQUAL - 128)) | (1L << (AND - 128)) | (1L << (OR - 128)) | (1L << (INC - 128)) | (1L << (DEC - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)) | (1L << (BITAND - 128)) | (1L << (BITOR - 128)) | (1L << (CARET - 128)) | (1L << (COMMENT - 128)) | (1L << (LINE_COMMENT - 128)) | (1L << (WS - 128)) | (1L << (WORDS_TO_SKIP - 128)) | (1L << (Skip - 128)) | (1L << (Affil - 128)))) != 0) );
				setState(1068); 
				match(T__103);
				}
				}
				break;
			case T__104:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(1069); 
				match(T__104);
				setState(1071); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1070);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__105) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(1073); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (IgnoreAlgorithmKeyWords - 128)) | (1L << (IgnoreUrlPrefix - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (INT - 128)) | (1L << (DOUBLE - 128)) | (1L << (NameChar - 128)) | (1L << (NameStartChar - 128)) | (1L << (ASSIGN - 128)) | (1L << (GT - 128)) | (1L << (LT - 128)) | (1L << (BANG - 128)) | (1L << (TILDE - 128)) | (1L << (QUESTION - 128)) | (1L << (COLON - 128)) | (1L << (EQUAL - 128)) | (1L << (LE - 128)) | (1L << (GE - 128)) | (1L << (NOTEQUAL - 128)) | (1L << (AND - 128)) | (1L << (OR - 128)) | (1L << (INC - 128)) | (1L << (DEC - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)) | (1L << (BITAND - 128)) | (1L << (BITOR - 128)) | (1L << (CARET - 128)) | (1L << (COMMENT - 128)) | (1L << (LINE_COMMENT - 128)) | (1L << (WS - 128)) | (1L << (WORDS_TO_SKIP - 128)) | (1L << (Skip - 128)) | (1L << (Affil - 128)))) != 0) );
				setState(1075); 
				match(T__105);
				}
				}
				break;
			case T__106:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(1076); 
				match(T__106);
				setState(1078); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1077);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__107) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(1080); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (IgnoreAlgorithmKeyWords - 128)) | (1L << (IgnoreUrlPrefix - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (INT - 128)) | (1L << (DOUBLE - 128)) | (1L << (NameChar - 128)) | (1L << (NameStartChar - 128)) | (1L << (ASSIGN - 128)) | (1L << (GT - 128)) | (1L << (LT - 128)) | (1L << (BANG - 128)) | (1L << (TILDE - 128)) | (1L << (QUESTION - 128)) | (1L << (COLON - 128)) | (1L << (EQUAL - 128)) | (1L << (LE - 128)) | (1L << (GE - 128)) | (1L << (NOTEQUAL - 128)) | (1L << (AND - 128)) | (1L << (OR - 128)) | (1L << (INC - 128)) | (1L << (DEC - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)) | (1L << (BITAND - 128)) | (1L << (BITOR - 128)) | (1L << (CARET - 128)) | (1L << (COMMENT - 128)) | (1L << (LINE_COMMENT - 128)) | (1L << (WS - 128)) | (1L << (WORDS_TO_SKIP - 128)) | (1L << (Skip - 128)) | (1L << (Affil - 128)))) != 0) );
				setState(1082); 
				match(T__107);
				}
				}
				break;
			case T__108:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(1083); 
				match(T__108);
				setState(1085); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1084);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__109) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(1087); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (IgnoreAlgorithmKeyWords - 128)) | (1L << (IgnoreUrlPrefix - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (INT - 128)) | (1L << (DOUBLE - 128)) | (1L << (NameChar - 128)) | (1L << (NameStartChar - 128)) | (1L << (ASSIGN - 128)) | (1L << (GT - 128)) | (1L << (LT - 128)) | (1L << (BANG - 128)) | (1L << (TILDE - 128)) | (1L << (QUESTION - 128)) | (1L << (COLON - 128)) | (1L << (EQUAL - 128)) | (1L << (LE - 128)) | (1L << (GE - 128)) | (1L << (NOTEQUAL - 128)) | (1L << (AND - 128)) | (1L << (OR - 128)) | (1L << (INC - 128)) | (1L << (DEC - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)) | (1L << (BITAND - 128)) | (1L << (BITOR - 128)) | (1L << (CARET - 128)) | (1L << (COMMENT - 128)) | (1L << (LINE_COMMENT - 128)) | (1L << (WS - 128)) | (1L << (WORDS_TO_SKIP - 128)) | (1L << (Skip - 128)) | (1L << (Affil - 128)))) != 0) );
				setState(1089); 
				match(T__109);
				}
				}
				break;
			case T__116:
			case T__118:
				enterOuterAlt(_localctx, 7);
				{
				setState(1090); 
				eqnArray();
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

	public static class EquationBlockContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public EquationBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equationBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterEquationBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitEquationBlock(this);
		}
	}

	public final EquationBlockContext equationBlock() throws RecognitionException {
		EquationBlockContext _localctx = new EquationBlockContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_equationBlock);
		int _la;
		try {
			setState(1111);
			switch (_input.LA(1)) {
			case T__110:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1093); 
				match(T__110);
				setState(1094); 
				label();
				setState(1096); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1095);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__111) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(1098); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (IgnoreAlgorithmKeyWords - 128)) | (1L << (IgnoreUrlPrefix - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (INT - 128)) | (1L << (DOUBLE - 128)) | (1L << (NameChar - 128)) | (1L << (NameStartChar - 128)) | (1L << (ASSIGN - 128)) | (1L << (GT - 128)) | (1L << (LT - 128)) | (1L << (BANG - 128)) | (1L << (TILDE - 128)) | (1L << (QUESTION - 128)) | (1L << (COLON - 128)) | (1L << (EQUAL - 128)) | (1L << (LE - 128)) | (1L << (GE - 128)) | (1L << (NOTEQUAL - 128)) | (1L << (AND - 128)) | (1L << (OR - 128)) | (1L << (INC - 128)) | (1L << (DEC - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)) | (1L << (BITAND - 128)) | (1L << (BITOR - 128)) | (1L << (CARET - 128)) | (1L << (COMMENT - 128)) | (1L << (LINE_COMMENT - 128)) | (1L << (WS - 128)) | (1L << (WORDS_TO_SKIP - 128)) | (1L << (Skip - 128)) | (1L << (Affil - 128)))) != 0) );
				setState(1100); 
				match(T__111);
				}
				}
				break;
			case T__112:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1102); 
				match(T__112);
				setState(1103); 
				label();
				setState(1105); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1104);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__113) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(1107); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (IgnoreAlgorithmKeyWords - 128)) | (1L << (IgnoreUrlPrefix - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (INT - 128)) | (1L << (DOUBLE - 128)) | (1L << (NameChar - 128)) | (1L << (NameStartChar - 128)) | (1L << (ASSIGN - 128)) | (1L << (GT - 128)) | (1L << (LT - 128)) | (1L << (BANG - 128)) | (1L << (TILDE - 128)) | (1L << (QUESTION - 128)) | (1L << (COLON - 128)) | (1L << (EQUAL - 128)) | (1L << (LE - 128)) | (1L << (GE - 128)) | (1L << (NOTEQUAL - 128)) | (1L << (AND - 128)) | (1L << (OR - 128)) | (1L << (INC - 128)) | (1L << (DEC - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)) | (1L << (BITAND - 128)) | (1L << (BITOR - 128)) | (1L << (CARET - 128)) | (1L << (COMMENT - 128)) | (1L << (LINE_COMMENT - 128)) | (1L << (WS - 128)) | (1L << (WORDS_TO_SKIP - 128)) | (1L << (Skip - 128)) | (1L << (Affil - 128)))) != 0) );
				setState(1109); 
				match(T__113);
				}
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

	public static class DisplayEquationContext extends ParserRuleContext {
		public DisplayEquationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_displayEquation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterDisplayEquation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitDisplayEquation(this);
		}
	}

	public final DisplayEquationContext displayEquation() throws RecognitionException {
		DisplayEquationContext _localctx = new DisplayEquationContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_displayEquation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1113); 
			match(T__114);
			setState(1115); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1114);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==T__115) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(1117); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (IgnoreAlgorithmKeyWords - 128)) | (1L << (IgnoreUrlPrefix - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (INT - 128)) | (1L << (DOUBLE - 128)) | (1L << (NameChar - 128)) | (1L << (NameStartChar - 128)) | (1L << (ASSIGN - 128)) | (1L << (GT - 128)) | (1L << (LT - 128)) | (1L << (BANG - 128)) | (1L << (TILDE - 128)) | (1L << (QUESTION - 128)) | (1L << (COLON - 128)) | (1L << (EQUAL - 128)) | (1L << (LE - 128)) | (1L << (GE - 128)) | (1L << (NOTEQUAL - 128)) | (1L << (AND - 128)) | (1L << (OR - 128)) | (1L << (INC - 128)) | (1L << (DEC - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)) | (1L << (BITAND - 128)) | (1L << (BITOR - 128)) | (1L << (CARET - 128)) | (1L << (COMMENT - 128)) | (1L << (LINE_COMMENT - 128)) | (1L << (WS - 128)) | (1L << (WORDS_TO_SKIP - 128)) | (1L << (Skip - 128)) | (1L << (Affil - 128)))) != 0) );
			setState(1119); 
			match(T__115);
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

	public static class EqnArrayContext extends ParserRuleContext {
		public EqnArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqnArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterEqnArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitEqnArray(this);
		}
	}

	public final EqnArrayContext eqnArray() throws RecognitionException {
		EqnArrayContext _localctx = new EqnArrayContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_eqnArray);
		int _la;
		try {
			setState(1135);
			switch (_input.LA(1)) {
			case T__116:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1121); 
				match(T__116);
				setState(1123); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1122);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__117) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(1125); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (IgnoreAlgorithmKeyWords - 128)) | (1L << (IgnoreUrlPrefix - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (INT - 128)) | (1L << (DOUBLE - 128)) | (1L << (NameChar - 128)) | (1L << (NameStartChar - 128)) | (1L << (ASSIGN - 128)) | (1L << (GT - 128)) | (1L << (LT - 128)) | (1L << (BANG - 128)) | (1L << (TILDE - 128)) | (1L << (QUESTION - 128)) | (1L << (COLON - 128)) | (1L << (EQUAL - 128)) | (1L << (LE - 128)) | (1L << (GE - 128)) | (1L << (NOTEQUAL - 128)) | (1L << (AND - 128)) | (1L << (OR - 128)) | (1L << (INC - 128)) | (1L << (DEC - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)) | (1L << (BITAND - 128)) | (1L << (BITOR - 128)) | (1L << (CARET - 128)) | (1L << (COMMENT - 128)) | (1L << (LINE_COMMENT - 128)) | (1L << (WS - 128)) | (1L << (WORDS_TO_SKIP - 128)) | (1L << (Skip - 128)) | (1L << (Affil - 128)))) != 0) );
				setState(1127); 
				match(T__117);
				}
				}
				break;
			case T__118:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1128); 
				match(T__118);
				setState(1130); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1129);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__119) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(1132); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (IgnoreAlgorithmKeyWords - 128)) | (1L << (IgnoreUrlPrefix - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (INT - 128)) | (1L << (DOUBLE - 128)) | (1L << (NameChar - 128)) | (1L << (NameStartChar - 128)) | (1L << (ASSIGN - 128)) | (1L << (GT - 128)) | (1L << (LT - 128)) | (1L << (BANG - 128)) | (1L << (TILDE - 128)) | (1L << (QUESTION - 128)) | (1L << (COLON - 128)) | (1L << (EQUAL - 128)) | (1L << (LE - 128)) | (1L << (GE - 128)) | (1L << (NOTEQUAL - 128)) | (1L << (AND - 128)) | (1L << (OR - 128)) | (1L << (INC - 128)) | (1L << (DEC - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)) | (1L << (BITAND - 128)) | (1L << (BITOR - 128)) | (1L << (CARET - 128)) | (1L << (COMMENT - 128)) | (1L << (LINE_COMMENT - 128)) | (1L << (WS - 128)) | (1L << (WORDS_TO_SKIP - 128)) | (1L << (Skip - 128)) | (1L << (Affil - 128)))) != 0) );
				setState(1134); 
				match(T__119);
				}
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

	public static class EqnArrayBodyContext extends ParserRuleContext {
		public List<EqnEquationContext> eqnEquation() {
			return getRuleContexts(EqnEquationContext.class);
		}
		public EqnEquationContext eqnEquation(int i) {
			return getRuleContext(EqnEquationContext.class,i);
		}
		public EqnArrayBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqnArrayBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterEqnArrayBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitEqnArrayBody(this);
		}
	}

	public final EqnArrayBodyContext eqnArrayBody() throws RecognitionException {
		EqnArrayBodyContext _localctx = new EqnArrayBodyContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_eqnArrayBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (IgnoreAlgorithmKeyWords - 128)) | (1L << (IgnoreUrlPrefix - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (INT - 128)) | (1L << (DOUBLE - 128)) | (1L << (NameChar - 128)) | (1L << (NameStartChar - 128)) | (1L << (ASSIGN - 128)) | (1L << (GT - 128)) | (1L << (LT - 128)) | (1L << (BANG - 128)) | (1L << (TILDE - 128)) | (1L << (QUESTION - 128)) | (1L << (COLON - 128)) | (1L << (EQUAL - 128)) | (1L << (LE - 128)) | (1L << (GE - 128)) | (1L << (NOTEQUAL - 128)) | (1L << (AND - 128)) | (1L << (OR - 128)) | (1L << (INC - 128)) | (1L << (DEC - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)) | (1L << (BITAND - 128)) | (1L << (BITOR - 128)) | (1L << (CARET - 128)) | (1L << (COMMENT - 128)) | (1L << (LINE_COMMENT - 128)) | (1L << (WS - 128)) | (1L << (WORDS_TO_SKIP - 128)) | (1L << (Skip - 128)) | (1L << (Affil - 128)))) != 0)) {
				{
				setState(1139);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
				case T__2:
				case T__3:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case T__22:
				case T__23:
				case T__24:
				case T__25:
				case T__26:
				case T__27:
				case T__28:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case T__33:
				case T__34:
				case T__35:
				case T__36:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
				case T__41:
				case T__42:
				case T__43:
				case T__44:
				case T__45:
				case T__46:
				case T__47:
				case T__48:
				case T__49:
				case T__50:
				case T__51:
				case T__52:
				case T__53:
				case T__54:
				case T__55:
				case T__56:
				case T__57:
				case T__58:
				case T__59:
				case T__60:
				case T__61:
				case T__62:
				case T__63:
				case T__64:
				case T__65:
				case T__66:
				case T__67:
				case T__68:
				case T__69:
				case T__70:
				case T__71:
				case T__72:
				case T__73:
				case T__74:
				case T__75:
				case T__76:
				case T__77:
				case T__78:
				case T__79:
				case T__80:
				case T__81:
				case T__82:
				case T__83:
				case T__84:
				case T__85:
				case T__86:
				case T__87:
				case T__88:
				case T__89:
				case T__90:
				case T__91:
				case T__92:
				case T__93:
				case T__94:
				case T__95:
				case T__96:
				case T__97:
				case T__98:
				case T__99:
				case T__100:
				case T__101:
				case T__102:
				case T__103:
				case T__104:
				case T__105:
				case T__106:
				case T__107:
				case T__108:
				case T__109:
				case T__110:
				case T__111:
				case T__112:
				case T__113:
				case T__114:
				case T__115:
				case T__116:
				case T__118:
				case T__120:
				case T__121:
				case T__122:
				case T__123:
				case T__124:
				case T__125:
				case T__126:
				case T__127:
				case T__128:
				case IgnoreAlgorithmKeyWords:
				case IgnoreUrlPrefix:
				case String:
				case Num:
				case INT:
				case DOUBLE:
				case NameChar:
				case NameStartChar:
				case ASSIGN:
				case GT:
				case LT:
				case BANG:
				case TILDE:
				case QUESTION:
				case COLON:
				case EQUAL:
				case LE:
				case GE:
				case NOTEQUAL:
				case AND:
				case OR:
				case INC:
				case DEC:
				case ADD:
				case SUB:
				case MUL:
				case BITOR:
				case CARET:
				case COMMENT:
				case LINE_COMMENT:
				case WS:
				case WORDS_TO_SKIP:
				case Skip:
				case Affil:
					{
					setState(1137); 
					eqnEquation();
					}
					break;
				case BITAND:
					{
					setState(1138); 
					match(BITAND);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1143);
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

	public static class EqnEquationContext extends ParserRuleContext {
		public EqnEquationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqnEquation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterEqnEquation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitEqnEquation(this);
		}
	}

	public final EqnEquationContext eqnEquation() throws RecognitionException {
		EqnEquationContext _localctx = new EqnEquationContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_eqnEquation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1145); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1144);
					_la = _input.LA(1);
					if ( _la <= 0 || (((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & ((1L << (T__117 - 118)) | (1L << (T__119 - 118)) | (1L << (BITAND - 118)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1147); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class NewLineContext extends ParserRuleContext {
		public DoubleSlashContext doubleSlash() {
			return getRuleContext(DoubleSlashContext.class,0);
		}
		public NewLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterNewLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitNewLine(this);
		}
	}

	public final NewLineContext newLine() throws RecognitionException {
		NewLineContext _localctx = new NewLineContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_newLine);
		try {
			setState(1151);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(1149); 
				match(T__0);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(1150); 
				doubleSlash();
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

	public static class DoubleSlashContext extends ParserRuleContext {
		public DoubleSlashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleSlash; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterDoubleSlash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitDoubleSlash(this);
		}
	}

	public final DoubleSlashContext doubleSlash() throws RecognitionException {
		DoubleSlashContext _localctx = new DoubleSlashContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_doubleSlash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1153); 
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

	public static class RefContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public RefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitRef(this);
		}
	}

	public final RefContext ref() throws RecognitionException {
		RefContext _localctx = new RefContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_ref);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1155); 
			match(TILDE);
			setState(1157);
			_la = _input.LA(1);
			if (_la==T__99) {
				{
				setState(1156); 
				match(T__99);
				}
			}

			setState(1159); 
			match(T__120);
			setState(1160); 
			text();
			setState(1161); 
			match(T__9);
			setState(1163);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				{
				setState(1162); 
				match(T__100);
				}
				break;
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

	public static class SimpleTextContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(LaTEXParser.String, 0); }
		public NumbersContext numbers() {
			return getRuleContext(NumbersContext.class,0);
		}
		public SimpleTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterSimpleText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitSimpleText(this);
		}
	}

	public final SimpleTextContext simpleText() throws RecognitionException {
		SimpleTextContext _localctx = new SimpleTextContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_simpleText);
		try {
			setState(1167);
			switch (_input.LA(1)) {
			case String:
				enterOuterAlt(_localctx, 1);
				{
				setState(1165); 
				match(String);
				}
				break;
			case Num:
				enterOuterAlt(_localctx, 2);
				{
				setState(1166); 
				numbers();
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

	public static class IntervalContext extends ParserRuleContext {
		public List<NumbersContext> numbers() {
			return getRuleContexts(NumbersContext.class);
		}
		public NumbersContext numbers(int i) {
			return getRuleContext(NumbersContext.class,i);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitInterval(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1169); 
			numbers();
			setState(1170); 
			match(SUB);
			setState(1171); 
			numbers();
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

	public static class NumbersContext extends ParserRuleContext {
		public TerminalNode Num() { return getToken(LaTEXParser.Num, 0); }
		public NumbersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numbers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterNumbers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitNumbers(this);
		}
	}

	public final NumbersContext numbers() throws RecognitionException {
		NumbersContext _localctx = new NumbersContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_numbers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1173); 
			match(Num);
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

	public static class ArabicContext extends ParserRuleContext {
		public ArabicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arabic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterArabic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitArabic(this);
		}
	}

	public final ArabicContext arabic() throws RecognitionException {
		ArabicContext _localctx = new ArabicContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_arabic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1175); 
			match(T__121);
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

	public static class SpecialCharactersContext extends ParserRuleContext {
		public SpecialCharactersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialCharacters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterSpecialCharacters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitSpecialCharacters(this);
		}
	}

	public final SpecialCharactersContext specialCharacters() throws RecognitionException {
		SpecialCharactersContext _localctx = new SpecialCharactersContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_specialCharacters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1177);
			_la = _input.LA(1);
			if ( !(((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (T__122 - 123)) | (1L << (T__123 - 123)) | (1L << (T__124 - 123)) | (1L << (T__125 - 123)) | (1L << (T__126 - 123)) | (1L << (T__127 - 123)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class IfThenElseContext extends ParserRuleContext {
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfThenElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterIfThenElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitIfThenElse(this);
		}
	}

	public final IfThenElseContext ifThenElse() throws RecognitionException {
		IfThenElseContext _localctx = new IfThenElseContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_ifThenElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1179); 
			match(T__128);
			setState(1180); 
			block();
			setState(1181); 
			block();
			setState(1182); 
			block();
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

	public static class IfThenTextContext extends ParserRuleContext {
		public List<SimpleTextContext> simpleText() {
			return getRuleContexts(SimpleTextContext.class);
		}
		public SimpleTextContext simpleText(int i) {
			return getRuleContext(SimpleTextContext.class,i);
		}
		public IfThenTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterIfThenText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitIfThenText(this);
		}
	}

	public final IfThenTextContext ifThenText() throws RecognitionException {
		IfThenTextContext _localctx = new IfThenTextContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_ifThenText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__9) | (1L << T__29))) != 0) || _la==String || _la==Num) {
				{
				setState(1188);
				switch (_input.LA(1)) {
				case String:
				case Num:
					{
					setState(1184); 
					simpleText();
					}
					break;
				case T__29:
					{
					setState(1185); 
					match(T__29);
					}
					break;
				case T__5:
					{
					setState(1186); 
					match(T__5);
					}
					break;
				case T__9:
					{
					setState(1187); 
					match(T__9);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1192);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00a6\u04ac\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\3\2\7\2\u00ca\n\2\f\2\16\2\u00cd\13\2\3\2"+
		"\3\2\7\2\u00d1\n\2\f\2\16\2\u00d4\13\2\3\2\3\2\3\3\3\3\7\3\u00da\n\3\f"+
		"\3\16\3\u00dd\13\3\3\3\3\3\7\3\u00e1\n\3\f\3\16\3\u00e4\13\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\5\7\5\u00ee\n\5\f\5\16\5\u00f1\13\5\3\5\3\5\3\6\7"+
		"\6\u00f6\n\6\f\6\16\6\u00f9\13\6\3\6\3\6\7\6\u00fd\n\6\f\6\16\6\u0100"+
		"\13\6\3\6\3\6\7\6\u0104\n\6\f\6\16\6\u0107\13\6\3\6\6\6\u010a\n\6\r\6"+
		"\16\6\u010b\3\7\3\7\3\7\7\7\u0111\n\7\f\7\16\7\u0114\13\7\3\7\3\7\7\7"+
		"\u0118\n\7\f\7\16\7\u011b\13\7\3\7\5\7\u011e\n\7\3\7\3\7\3\7\3\7\7\7\u0124"+
		"\n\7\f\7\16\7\u0127\13\7\3\7\3\7\7\7\u012b\n\7\f\7\16\7\u012e\13\7\3\7"+
		"\5\7\u0131\n\7\3\b\3\b\3\b\3\b\7\b\u0137\n\b\f\b\16\b\u013a\13\b\3\b\7"+
		"\b\u013d\n\b\f\b\16\b\u0140\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\6\n\u014d\n\n\r\n\16\n\u014e\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\7\f\u015c\n\f\f\f\16\f\u015f\13\f\3\r\7\r\u0162\n\r\f\r\16"+
		"\r\u0165\13\r\3\16\3\16\7\16\u0169\n\16\f\16\16\16\u016c\13\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u018a"+
		"\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\6\21\u01a0\n\21\r\21\16\21\u01a1\3"+
		"\21\3\21\3\21\3\21\3\21\5\21\u01a9\n\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u01b3\n\22\3\23\3\23\3\23\7\23\u01b8\n\23\f\23\16\23\u01bb"+
		"\13\23\3\23\3\23\3\23\3\23\7\23\u01c1\n\23\f\23\16\23\u01c4\13\23\3\23"+
		"\5\23\u01c7\n\23\3\24\3\24\7\24\u01cb\n\24\f\24\16\24\u01ce\13\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01d9\n\25\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\7\31\u01e8\n\31\f\31"+
		"\16\31\u01eb\13\31\3\31\3\31\3\31\5\31\u01f0\n\31\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\7\33\u01fa\n\33\f\33\16\33\u01fd\13\33\3\33\3\33"+
		"\3\34\6\34\u0202\n\34\r\34\16\34\u0203\3\34\3\34\3\35\3\35\3\35\3\35\3"+
		"\35\7\35\u020d\n\35\f\35\16\35\u0210\13\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\37\3\37\7\37\u0219\n\37\f\37\16\37\u021c\13\37\3\37\3\37\3\37\7\37\u0221"+
		"\n\37\f\37\16\37\u0224\13\37\3\37\5\37\u0227\n\37\3 \3 \3 \3 \3 \7 \u022e"+
		"\n \f \16 \u0231\13 \3 \3 \3!\3!\7!\u0237\n!\f!\16!\u023a\13!\3!\3!\3"+
		"!\3!\3!\3!\3!\5!\u0243\n!\3\"\7\"\u0246\n\"\f\"\16\"\u0249\13\"\3#\7#"+
		"\u024c\n#\f#\16#\u024f\13#\3#\3#\7#\u0253\n#\f#\16#\u0256\13#\3$\3$\3"+
		"$\3$\3%\7%\u025d\n%\f%\16%\u0260\13%\3&\7&\u0263\n&\f&\16&\u0266\13&\3"+
		"&\3&\3&\7&\u026b\n&\f&\16&\u026e\13&\3\'\3\'\7\'\u0272\n\'\f\'\16\'\u0275"+
		"\13\'\3\'\3\'\3(\3(\5(\u027b\n(\3(\7(\u027e\n(\f(\16(\u0281\13(\3(\3("+
		"\3)\3)\5)\u0287\n)\3)\7)\u028a\n)\f)\16)\u028d\13)\3)\7)\u0290\n)\f)\16"+
		")\u0293\13)\3)\7)\u0296\n)\f)\16)\u0299\13)\3)\3)\7)\u029d\n)\f)\16)\u02a0"+
		"\13)\3)\3)\7)\u02a4\n)\f)\16)\u02a7\13)\3)\3)\7)\u02ab\n)\f)\16)\u02ae"+
		"\13)\3)\3)\7)\u02b2\n)\f)\16)\u02b5\13)\3)\7)\u02b8\n)\f)\16)\u02bb\13"+
		")\3)\7)\u02be\n)\f)\16)\u02c1\13)\3)\3)\3*\3*\3*\3+\3+\3+\7+\u02cb\n+"+
		"\f+\16+\u02ce\13+\3+\3+\7+\u02d2\n+\f+\16+\u02d5\13+\3+\3+\3+\5+\u02da"+
		"\n+\6+\u02dc\n+\r+\16+\u02dd\3+\3+\3,\3,\6,\u02e4\n,\r,\16,\u02e5\3,\3"+
		",\3-\3-\3-\3-\3.\3.\3.\3.\5.\u02f2\n.\3/\3/\3/\7/\u02f7\n/\f/\16/\u02fa"+
		"\13/\3\60\5\60\u02fd\n\60\3\60\3\60\5\60\u0301\n\60\3\61\3\61\3\61\3\61"+
		"\3\61\5\61\u0308\n\61\3\62\3\62\7\62\u030c\n\62\f\62\16\62\u030f\13\62"+
		"\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63"+
		"\u031e\n\63\3\64\3\64\7\64\u0322\n\64\f\64\16\64\u0325\13\64\3\64\3\64"+
		"\3\65\3\65\5\65\u032b\n\65\3\66\3\66\7\66\u032f\n\66\f\66\16\66\u0332"+
		"\13\66\3\66\3\66\3\66\7\66\u0337\n\66\f\66\16\66\u033a\13\66\3\66\3\66"+
		"\5\66\u033e\n\66\5\66\u0340\n\66\3\67\3\67\3\67\3\67\5\67\u0346\n\67\3"+
		"8\38\38\38\39\39\79\u034e\n9\f9\169\u0351\139\39\39\3:\3:\3:\5:\u0358"+
		"\n:\3:\3:\3:\3;\3;\3;\5;\u0360\n;\3;\3;\3;\3<\3<\3<\5<\u0368\n<\3<\3<"+
		"\3<\3=\5=\u036e\n=\3=\3=\7=\u0372\n=\f=\16=\u0375\13=\3=\3=\3=\3=\3>\3"+
		">\3>\7>\u037e\n>\f>\16>\u0381\13>\3>\3>\7>\u0385\n>\f>\16>\u0388\13>\7"+
		">\u038a\n>\f>\16>\u038d\13>\3?\3?\3?\7?\u0392\n?\f?\16?\u0395\13?\3@\3"+
		"@\3A\3A\5A\u039b\nA\3A\7A\u039e\nA\fA\16A\u03a1\13A\3A\3A\3A\5A\u03a6"+
		"\nA\3A\7A\u03a9\nA\fA\16A\u03ac\13A\3A\5A\u03af\nA\3B\3B\5B\u03b3\nB\3"+
		"B\7B\u03b6\nB\fB\16B\u03b9\13B\3B\3B\3B\5B\u03be\nB\3B\7B\u03c1\nB\fB"+
		"\16B\u03c4\13B\3B\5B\u03c7\nB\3C\3C\5C\u03cb\nC\3C\7C\u03ce\nC\fC\16C"+
		"\u03d1\13C\3C\3C\3D\3D\5D\u03d7\nD\3D\7D\u03da\nD\fD\16D\u03dd\13D\3D"+
		"\3D\3E\3E\3E\3F\3F\3F\3G\3G\7G\u03e9\nG\fG\16G\u03ec\13G\3G\3G\3H\3H\3"+
		"H\3I\3I\3I\3J\3J\7J\u03f8\nJ\fJ\16J\u03fb\13J\3J\3J\3K\3K\3K\3K\3K\3L"+
		"\3L\3M\3M\7M\u0408\nM\fM\16M\u040b\13M\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3"+
		"R\3R\3S\3S\3T\3T\5T\u041d\nT\3T\3T\3U\3U\6U\u0423\nU\rU\16U\u0424\3U\3"+
		"U\3U\3U\6U\u042b\nU\rU\16U\u042c\3U\3U\3U\6U\u0432\nU\rU\16U\u0433\3U"+
		"\3U\3U\6U\u0439\nU\rU\16U\u043a\3U\3U\3U\6U\u0440\nU\rU\16U\u0441\3U\3"+
		"U\5U\u0446\nU\3V\3V\3V\6V\u044b\nV\rV\16V\u044c\3V\3V\3V\3V\3V\6V\u0454"+
		"\nV\rV\16V\u0455\3V\3V\5V\u045a\nV\3W\3W\6W\u045e\nW\rW\16W\u045f\3W\3"+
		"W\3X\3X\6X\u0466\nX\rX\16X\u0467\3X\3X\3X\6X\u046d\nX\rX\16X\u046e\3X"+
		"\5X\u0472\nX\3Y\3Y\7Y\u0476\nY\fY\16Y\u0479\13Y\3Z\6Z\u047c\nZ\rZ\16Z"+
		"\u047d\3[\3[\5[\u0482\n[\3\\\3\\\3]\3]\5]\u0488\n]\3]\3]\3]\3]\5]\u048e"+
		"\n]\3^\3^\5^\u0492\n^\3_\3_\3_\3_\3`\3`\3a\3a\3b\3b\3c\3c\3c\3c\3c\3d"+
		"\3d\3d\3d\7d\u04a7\nd\fd\16d\u04aa\13d\3d\2\2e\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv"+
		"xz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\2\30\3\2\3\3\3\2\f\f\4\2\t\t9:\3\2DE\3\2FG\3\2HI\3\2JM\3\2NO\3"+
		"\2--\3\288\3\2hh\3\2jj\3\2ll\3\2nn\3\2pp\3\2rr\3\2tt\3\2vv\3\2xx\3\2z"+
		"z\5\2xxzz\u009e\u009e\3\2}\u0082\u0513\2\u00cb\3\2\2\2\4\u00d7\3\2\2\2"+
		"\6\u00e8\3\2\2\2\b\u00ea\3\2\2\2\n\u00f7\3\2\2\2\f\u010d\3\2\2\2\16\u0132"+
		"\3\2\2\2\20\u0143\3\2\2\2\22\u0147\3\2\2\2\24\u0152\3\2\2\2\26\u0154\3"+
		"\2\2\2\30\u0163\3\2\2\2\32\u0166\3\2\2\2\34\u0189\3\2\2\2\36\u018b\3\2"+
		"\2\2 \u01a8\3\2\2\2\"\u01b2\3\2\2\2$\u01c6\3\2\2\2&\u01c8\3\2\2\2(\u01d8"+
		"\3\2\2\2*\u01da\3\2\2\2,\u01dd\3\2\2\2.\u01e2\3\2\2\2\60\u01ef\3\2\2\2"+
		"\62\u01f1\3\2\2\2\64\u01f4\3\2\2\2\66\u0201\3\2\2\28\u0207\3\2\2\2:\u0213"+
		"\3\2\2\2<\u0226\3\2\2\2>\u0228\3\2\2\2@\u0242\3\2\2\2B\u0247\3\2\2\2D"+
		"\u024d\3\2\2\2F\u0257\3\2\2\2H\u025e\3\2\2\2J\u0264\3\2\2\2L\u026f\3\2"+
		"\2\2N\u0278\3\2\2\2P\u0284\3\2\2\2R\u02c4\3\2\2\2T\u02c7\3\2\2\2V\u02e1"+
		"\3\2\2\2X\u02e9\3\2\2\2Z\u02ed\3\2\2\2\\\u02f3\3\2\2\2^\u02fc\3\2\2\2"+
		"`\u0307\3\2\2\2b\u0309\3\2\2\2d\u031d\3\2\2\2f\u031f\3\2\2\2h\u032a\3"+
		"\2\2\2j\u033f\3\2\2\2l\u0345\3\2\2\2n\u0347\3\2\2\2p\u034b\3\2\2\2r\u0354"+
		"\3\2\2\2t\u035c\3\2\2\2v\u0364\3\2\2\2x\u036d\3\2\2\2z\u037a\3\2\2\2|"+
		"\u0393\3\2\2\2~\u0396\3\2\2\2\u0080\u03ae\3\2\2\2\u0082\u03c6\3\2\2\2"+
		"\u0084\u03c8\3\2\2\2\u0086\u03d4\3\2\2\2\u0088\u03e0\3\2\2\2\u008a\u03e3"+
		"\3\2\2\2\u008c\u03e6\3\2\2\2\u008e\u03ef\3\2\2\2\u0090\u03f2\3\2\2\2\u0092"+
		"\u03f5\3\2\2\2\u0094\u03fe\3\2\2\2\u0096\u0403\3\2\2\2\u0098\u0405\3\2"+
		"\2\2\u009a\u040e\3\2\2\2\u009c\u0410\3\2\2\2\u009e\u0412\3\2\2\2\u00a0"+
		"\u0414\3\2\2\2\u00a2\u0416\3\2\2\2\u00a4\u0418\3\2\2\2\u00a6\u041a\3\2"+
		"\2\2\u00a8\u0445\3\2\2\2\u00aa\u0459\3\2\2\2\u00ac\u045b\3\2\2\2\u00ae"+
		"\u0471\3\2\2\2\u00b0\u0477\3\2\2\2\u00b2\u047b\3\2\2\2\u00b4\u0481\3\2"+
		"\2\2\u00b6\u0483\3\2\2\2\u00b8\u0485\3\2\2\2\u00ba\u0491\3\2\2\2\u00bc"+
		"\u0493\3\2\2\2\u00be\u0497\3\2\2\2\u00c0\u0499\3\2\2\2\u00c2\u049b\3\2"+
		"\2\2\u00c4\u049d\3\2\2\2\u00c6\u04a8\3\2\2\2\u00c8\u00ca\7\3\2\2\u00c9"+
		"\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2"+
		"\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d2\5\4\3\2\u00cf"+
		"\u00d1\7\3\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2"+
		"\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5"+
		"\u00d6\7\2\2\3\u00d6\3\3\2\2\2\u00d7\u00db\7\4\2\2\u00d8\u00da\7\3\2\2"+
		"\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc"+
		"\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e2\5\b\5\2\u00df"+
		"\u00e1\7\3\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2"+
		"\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5"+
		"\u00e6\5\6\4\2\u00e6\u00e7\7\5\2\2\u00e7\5\3\2\2\2\u00e8\u00e9\5\30\r"+
		"\2\u00e9\7\3\2\2\2\u00ea\u00eb\7\6\2\2\u00eb\u00ef\5\n\6\2\u00ec\u00ee"+
		"\5\32\16\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2"+
		"\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3"+
		"\7\7\2\2\u00f3\t\3\2\2\2\u00f4\u00f6\7\3\2\2\u00f5\u00f4\3\2\2\2\u00f6"+
		"\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2"+
		"\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fe\5\f\7\2\u00fb\u00fd\7\3\2\2\u00fc"+
		"\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2"+
		"\2\2\u00ff\u0101\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0105\5\16\b\2\u0102"+
		"\u0104\7\3\2\2\u0103\u0102\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2"+
		"\2\2\u0105\u0106\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0108"+
		"\u010a\5\26\f\2\u0109\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0109\3"+
		"\2\2\2\u010b\u010c\3\2\2\2\u010c\13\3\2\2\2\u010d\u010e\7\b\2\2\u010e"+
		"\u0112\7\t\2\2\u010f\u0111\7\3\2\2\u0110\u010f\3\2\2\2\u0111\u0114\3\2"+
		"\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115\3\2\2\2\u0114"+
		"\u0112\3\2\2\2\u0115\u0119\7\n\2\2\u0116\u0118\7\3\2\2\u0117\u0116\3\2"+
		"\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011e\7\13\2\2\u011d\u011c\3"+
		"\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\7\b\2\2\u0120"+
		"\u0121\5&\24\2\u0121\u0125\7\f\2\2\u0122\u0124\7\3\2\2\u0123\u0122\3\2"+
		"\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\u0128\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u012c\7\f\2\2\u0129\u012b\7\3"+
		"\2\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0131\7\13"+
		"\2\2\u0130\u012f\3\2\2\2\u0130\u0131\3\2\2\2\u0131\r\3\2\2\2\u0132\u0133"+
		"\7\r\2\2\u0133\u0138\5\20\t\2\u0134\u0135\7\16\2\2\u0135\u0137\5\20\t"+
		"\2\u0136\u0134\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139"+
		"\3\2\2\2\u0139\u013e\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013d\7\3\2\2\u013c"+
		"\u013b\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2"+
		"\2\2\u013f\u0141\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0142\7\r\2\2\u0142"+
		"\17\3\2\2\2\u0143\u0144\5\24\13\2\u0144\u0145\7\17\2\2\u0145\u0146\5\22"+
		"\n\2\u0146\21\3\2\2\2\u0147\u014c\7\b\2\2\u0148\u014d\5\u00be`\2\u0149"+
		"\u014d\7\u009d\2\2\u014a\u014d\5\u00c2b\2\u014b\u014d\7\16\2\2\u014c\u0148"+
		"\3\2\2\2\u014c\u0149\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014b\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\3\2"+
		"\2\2\u0150\u0151\7\f\2\2\u0151\23\3\2\2\2\u0152\u0153\5&\24\2\u0153\25"+
		"\3\2\2\2\u0154\u0155\7\20\2\2\u0155\u0156\7\b\2\2\u0156\u0157\5\u00be"+
		"`\2\u0157\u0158\7\f\2\2\u0158\u0159\5&\24\2\u0159\u015d\7\r\2\2\u015a"+
		"\u015c\7\3\2\2\u015b\u015a\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2"+
		"\2\2\u015d\u015e\3\2\2\2\u015e\27\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0162"+
		"\5\32\16\2\u0161\u0160\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2"+
		"\u0163\u0164\3\2\2\2\u0164\31\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u016a"+
		"\5\34\17\2\u0167\u0169\5\34\17\2\u0168\u0167\3\2\2\2\u0169\u016c\3\2\2"+
		"\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\33\3\2\2\2\u016c\u016a"+
		"\3\2\2\2\u016d\u018a\5\u00c2b\2\u016e\u018a\5\62\32\2\u016f\u018a\5P)"+
		"\2\u0170\u018a\5\60\31\2\u0171\u018a\5 \21\2\u0172\u018a\5\u0080A\2\u0173"+
		"\u018a\5\u0082B\2\u0174\u018a\5\u0084C\2\u0175\u018a\5\u0086D\2\u0176"+
		"\u018a\5\u0088E\2\u0177\u018a\5\u008aF\2\u0178\u018a\5\u008cG\2\u0179"+
		"\u018a\5\u008eH\2\u017a\u018a\5\u0090I\2\u017b\u018a\5\u0092J\2\u017c"+
		"\u018a\5N(\2\u017d\u018a\5> \2\u017e\u018a\5,\27\2\u017f\u018a\5F$\2\u0180"+
		"\u018a\5r:\2\u0181\u018a\5t;\2\u0182\u018a\5v<\2\u0183\u018a\58\35\2\u0184"+
		"\u018a\5x=\2\u0185\u018a\5\u00b8]\2\u0186\u018a\5\u00b4[\2\u0187\u018a"+
		"\5\u0094K\2\u0188\u018a\5\u00c4c\2\u0189\u016d\3\2\2\2\u0189\u016e\3\2"+
		"\2\2\u0189\u016f\3\2\2\2\u0189\u0170\3\2\2\2\u0189\u0171\3\2\2\2\u0189"+
		"\u0172\3\2\2\2\u0189\u0173\3\2\2\2\u0189\u0174\3\2\2\2\u0189\u0175\3\2"+
		"\2\2\u0189\u0176\3\2\2\2\u0189\u0177\3\2\2\2\u0189\u0178\3\2\2\2\u0189"+
		"\u0179\3\2\2\2\u0189\u017a\3\2\2\2\u0189\u017b\3\2\2\2\u0189\u017c\3\2"+
		"\2\2\u0189\u017d\3\2\2\2\u0189\u017e\3\2\2\2\u0189\u017f\3\2\2\2\u0189"+
		"\u0180\3\2\2\2\u0189\u0181\3\2\2\2\u0189\u0182\3\2\2\2\u0189\u0183\3\2"+
		"\2\2\u0189\u0184\3\2\2\2\u0189\u0185\3\2\2\2\u0189\u0186\3\2\2\2\u0189"+
		"\u0187\3\2\2\2\u0189\u0188\3\2\2\2\u018a\35\3\2\2\2\u018b\u018c\7\21\2"+
		"\2\u018c\u018d\5\32\16\2\u018d\u018e\7\22\2\2\u018e\37\3\2\2\2\u018f\u01a9"+
		"\5\u00a6T\2\u0190\u01a9\5\"\22\2\u0191\u01a9\5\36\20\2\u0192\u01a9\5\u00a8"+
		"U\2\u0193\u01a9\5\u00aaV\2\u0194\u01a9\5\u00acW\2\u0195\u01a9\5$\23\2"+
		"\u0196\u01a9\5@!\2\u0197\u01a9\5n8\2\u0198\u01a9\5p9\2\u0199\u01a9\5*"+
		"\26\2\u019a\u01a9\5<\37\2\u019b\u01a9\5`\61\2\u019c\u01a9\5\u00bc_\2\u019d"+
		"\u01a9\5~@\2\u019e\u01a0\5\u00ba^\2\u019f\u019e\3\2\2\2\u01a0\u01a1\3"+
		"\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a9\3\2\2\2\u01a3"+
		"\u01a9\5\u00c0a\2\u01a4\u01a9\5:\36\2\u01a5\u01a9\5Z.\2\u01a6\u01a9\5"+
		"\u009eP\2\u01a7\u01a9\5\u009aN\2\u01a8\u018f\3\2\2\2\u01a8\u0190\3\2\2"+
		"\2\u01a8\u0191\3\2\2\2\u01a8\u0192\3\2\2\2\u01a8\u0193\3\2\2\2\u01a8\u0194"+
		"\3\2\2\2\u01a8\u0195\3\2\2\2\u01a8\u0196\3\2\2\2\u01a8\u0197\3\2\2\2\u01a8"+
		"\u0198\3\2\2\2\u01a8\u0199\3\2\2\2\u01a8\u019a\3\2\2\2\u01a8\u019b\3\2"+
		"\2\2\u01a8\u019c\3\2\2\2\u01a8\u019d\3\2\2\2\u01a8\u019f\3\2\2\2\u01a8"+
		"\u01a3\3\2\2\2\u01a8\u01a4\3\2\2\2\u01a8\u01a5\3\2\2\2\u01a8\u01a6\3\2"+
		"\2\2\u01a8\u01a7\3\2\2\2\u01a9!\3\2\2\2\u01aa\u01b3\5\u009cO\2\u01ab\u01b3"+
		"\5\u00a0Q\2\u01ac\u01b3\5\u00a2R\2\u01ad\u01b3\5\u00a4S\2\u01ae\u01b3"+
		"\7\u009c\2\2\u01af\u01b3\7\23\2\2\u01b0\u01b3\7\u009d\2\2\u01b1\u01b3"+
		"\7\24\2\2\u01b2\u01aa\3\2\2\2\u01b2\u01ab\3\2\2\2\u01b2\u01ac\3\2\2\2"+
		"\u01b2\u01ad\3\2\2\2\u01b2\u01ae\3\2\2\2\u01b2\u01af\3\2\2\2\u01b2\u01b0"+
		"\3\2\2\2\u01b2\u01b1\3\2\2\2\u01b3#\3\2\2\2\u01b4\u01b5\7\25\2\2\u01b5"+
		"\u01b9\7\b\2\2\u01b6\u01b8\5\32\16\2\u01b7\u01b6\3\2\2\2\u01b8\u01bb\3"+
		"\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bc\3\2\2\2\u01bb"+
		"\u01b9\3\2\2\2\u01bc\u01c7\7\f\2\2\u01bd\u01be\7\26\2\2\u01be\u01c2\7"+
		"\b\2\2\u01bf\u01c1\5\32\16\2\u01c0\u01bf\3\2\2\2\u01c1\u01c4\3\2\2\2\u01c2"+
		"\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c5\3\2\2\2\u01c4\u01c2\3\2"+
		"\2\2\u01c5\u01c7\7\f\2\2\u01c6\u01b4\3\2\2\2\u01c6\u01bd\3\2\2\2\u01c7"+
		"%\3\2\2\2\u01c8\u01cc\5(\25\2\u01c9\u01cb\5(\25\2\u01ca\u01c9\3\2\2\2"+
		"\u01cb\u01ce\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\'\3"+
		"\2\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01d9\5.\30\2\u01d0\u01d9\5`\61\2\u01d1"+
		"\u01d9\5\u00ba^\2\u01d2\u01d9\5\"\22\2\u01d3\u01d9\5\u00a6T\2\u01d4\u01d9"+
		"\5<\37\2\u01d5\u01d9\5\u009aN\2\u01d6\u01d9\5\u0094K\2\u01d7\u01d9\7\3"+
		"\2\2\u01d8\u01cf\3\2\2\2\u01d8\u01d0\3\2\2\2\u01d8\u01d1\3\2\2\2\u01d8"+
		"\u01d2\3\2\2\2\u01d8\u01d3\3\2\2\2\u01d8\u01d4\3\2\2\2\u01d8\u01d5\3\2"+
		"\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d7\3\2\2\2\u01d9)\3\2\2\2\u01da\u01db"+
		"\7\27\2\2\u01db\u01dc\5<\37\2\u01dc+\3\2\2\2\u01dd\u01de\7\30\2\2\u01de"+
		"\u01df\7\b\2\2\u01df\u01e0\5&\24\2\u01e0\u01e1\7\f\2\2\u01e1-\3\2\2\2"+
		"\u01e2\u01e3\7\31\2\2\u01e3\u01e4\5<\37\2\u01e4/\3\2\2\2\u01e5\u01e9\7"+
		"\32\2\2\u01e6\u01e8\5\32\16\2\u01e7\u01e6\3\2\2\2\u01e8\u01eb\3\2\2\2"+
		"\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ec\3\2\2\2\u01eb\u01e9"+
		"\3\2\2\2\u01ec\u01f0\7\33\2\2\u01ed\u01ee\7\34\2\2\u01ee\u01f0\5<\37\2"+
		"\u01ef\u01e5\3\2\2\2\u01ef\u01ed\3\2\2\2\u01f0\61\3\2\2\2\u01f1\u01f2"+
		"\7\35\2\2\u01f2\u01f3\5<\37\2\u01f3\63\3\2\2\2\u01f4\u01f5\7\36\2\2\u01f5"+
		"\u01f6\7\b\2\2\u01f6\u01f7\5:\36\2\u01f7\u01fb\7\f\2\2\u01f8\u01fa\5\u0098"+
		"M\2\u01f9\u01f8\3\2\2\2\u01fa\u01fd\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb"+
		"\u01fc\3\2\2\2\u01fc\u01fe\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fe\u01ff\5\66"+
		"\34\2\u01ff\65\3\2\2\2\u0200\u0202\n\2\2\2\u0201\u0200\3\2\2\2\u0202\u0203"+
		"\3\2\2\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0205\3\2\2\2\u0205"+
		"\u0206\7\3\2\2\u0206\67\3\2\2\2\u0207\u0208\7\37\2\2\u0208\u0209\7\b\2"+
		"\2\u0209\u020a\5:\36\2\u020a\u020e\7\f\2\2\u020b\u020d\5\u0098M\2\u020c"+
		"\u020b\3\2\2\2\u020d\u0210\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2"+
		"\2\2\u020f\u0211\3\2\2\2\u0210\u020e\3\2\2\2\u0211\u0212\5\66\34\2\u0212"+
		"9\3\2\2\2\u0213\u0214\7 \2\2\u0214\u0215\5\u00ba^\2\u0215;\3\2\2\2\u0216"+
		"\u021a\7\b\2\2\u0217\u0219\5\32\16\2\u0218\u0217\3\2\2\2\u0219\u021c\3"+
		"\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021d\3\2\2\2\u021c"+
		"\u021a\3\2\2\2\u021d\u0227\7\f\2\2\u021e\u0222\7!\2\2\u021f\u0221\5\32"+
		"\16\2\u0220\u021f\3\2\2\2\u0221\u0224\3\2\2\2\u0222\u0220\3\2\2\2\u0222"+
		"\u0223\3\2\2\2\u0223\u0225\3\2\2\2\u0224\u0222\3\2\2\2\u0225\u0227\7\""+
		"\2\2\u0226\u0216\3\2\2\2\u0226\u021e\3\2\2\2\u0227=\3\2\2\2\u0228\u0229"+
		"\7#\2\2\u0229\u022a\7\b\2\2\u022a\u022b\7\u0088\2\2\u022b\u022f\7\f\2"+
		"\2\u022c\u022e\5\32\16\2\u022d\u022c\3\2\2\2\u022e\u0231\3\2\2\2\u022f"+
		"\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0232\3\2\2\2\u0231\u022f\3\2"+
		"\2\2\u0232\u0233\7$\2\2\u0233?\3\2\2\2\u0234\u0238\7%\2\2\u0235\u0237"+
		"\5\u0098M\2\u0236\u0235\3\2\2\2\u0237\u023a\3\2\2\2\u0238\u0236\3\2\2"+
		"\2\u0238\u0239\3\2\2\2\u0239\u023b\3\2\2\2\u023a\u0238\3\2\2\2\u023b\u023c"+
		"\5B\"\2\u023c\u023d\7&\2\2\u023d\u0243\3\2\2\2\u023e\u023f\7\'\2\2\u023f"+
		"\u0240\5B\"\2\u0240\u0241\7(\2\2\u0241\u0243\3\2\2\2\u0242\u0234\3\2\2"+
		"\2\u0242\u023e\3\2\2\2\u0243A\3\2\2\2\u0244\u0246\5D#\2\u0245\u0244\3"+
		"\2\2\2\u0246\u0249\3\2\2\2\u0247\u0245\3\2\2\2\u0247\u0248\3\2\2\2\u0248"+
		"C\3\2\2\2\u0249\u0247\3\2\2\2\u024a\u024c\7\3\2\2\u024b\u024a\3\2\2\2"+
		"\u024c\u024f\3\2\2\2\u024d\u024b\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u0250"+
		"\3\2\2\2\u024f\u024d\3\2\2\2\u0250\u0254\7)\2\2\u0251\u0253\5\32\16\2"+
		"\u0252\u0251\3\2\2\2\u0253\u0256\3\2\2\2\u0254\u0252\3\2\2\2\u0254\u0255"+
		"\3\2\2\2\u0255E\3\2\2\2\u0256\u0254\3\2\2\2\u0257\u0258\7*\2\2\u0258\u0259"+
		"\5H%\2\u0259\u025a\7+\2\2\u025aG\3\2\2\2\u025b\u025d\5J&\2\u025c\u025b"+
		"\3\2\2\2\u025d\u0260\3\2\2\2\u025e\u025c\3\2\2\2\u025e\u025f\3\2\2\2\u025f"+
		"I\3\2\2\2\u0260\u025e\3\2\2\2\u0261\u0263\7\3\2\2\u0262\u0261\3\2\2\2"+
		"\u0263\u0266\3\2\2\2\u0264\u0262\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0267"+
		"\3\2\2\2\u0266\u0264\3\2\2\2\u0267\u0268\7)\2\2\u0268\u026c\5L\'\2\u0269"+
		"\u026b\5\32\16\2\u026a\u0269\3\2\2\2\u026b\u026e\3\2\2\2\u026c\u026a\3"+
		"\2\2\2\u026c\u026d\3\2\2\2\u026dK\3\2\2\2\u026e\u026c\3\2\2\2\u026f\u0273"+
		"\7,\2\2\u0270\u0272\5\32\16\2\u0271\u0270\3\2\2\2\u0272\u0275\3\2\2\2"+
		"\u0273\u0271\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0276\3\2\2\2\u0275\u0273"+
		"\3\2\2\2\u0276\u0277\7-\2\2\u0277M\3\2\2\2\u0278\u027a\7.\2\2\u0279\u027b"+
		"\5\u0098M\2\u027a\u0279\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027f\3\2\2"+
		"\2\u027c\u027e\5\u00b4[\2\u027d\u027c\3\2\2\2\u027e\u0281\3\2\2\2\u027f"+
		"\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0282\3\2\2\2\u0281\u027f\3\2"+
		"\2\2\u0282\u0283\5<\37\2\u0283O\3\2\2\2\u0284\u0286\7/\2\2\u0285\u0287"+
		"\5\u0098M\2\u0286\u0285\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u028b\3\2\2"+
		"\2\u0288\u028a\7\3\2\2\u0289\u0288\3\2\2\2\u028a\u028d\3\2\2\2\u028b\u0289"+
		"\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u0291\3\2\2\2\u028d\u028b\3\2\2\2\u028e"+
		"\u0290\7\60\2\2\u028f\u028e\3\2\2\2\u0290\u0293\3\2\2\2\u0291\u028f\3"+
		"\2\2\2\u0291\u0292\3\2\2\2\u0292\u0297\3\2\2\2\u0293\u0291\3\2\2\2\u0294"+
		"\u0296\7\3\2\2\u0295\u0294\3\2\2\2\u0296\u0299\3\2\2\2\u0297\u0295\3\2"+
		"\2\2\u0297\u0298\3\2\2\2\u0298\u029a\3\2\2\2\u0299\u0297\3\2\2\2\u029a"+
		"\u029e\5R*\2\u029b\u029d\7\3\2\2\u029c\u029b\3\2\2\2\u029d\u02a0\3\2\2"+
		"\2\u029e\u029c\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a1\3\2\2\2\u02a0\u029e"+
		"\3\2\2\2\u02a1\u02a5\5T+\2\u02a2\u02a4\7\3\2\2\u02a3\u02a2\3\2\2\2\u02a4"+
		"\u02a7\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a8\3\2"+
		"\2\2\u02a7\u02a5\3\2\2\2\u02a8\u02ac\5X-\2\u02a9\u02ab\7\3\2\2\u02aa\u02a9"+
		"\3\2\2\2\u02ab\u02ae\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad"+
		"\u02af\3\2\2\2\u02ae\u02ac\3\2\2\2\u02af\u02b3\5,\27\2\u02b0\u02b2\7\3"+
		"\2\2\u02b1\u02b0\3\2\2\2\u02b2\u02b5\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b3"+
		"\u02b4\3\2\2\2\u02b4\u02b9\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b6\u02b8\7\61"+
		"\2\2\u02b7\u02b6\3\2\2\2\u02b8\u02bb\3\2\2\2\u02b9\u02b7\3\2\2\2\u02b9"+
		"\u02ba\3\2\2\2\u02ba\u02bf\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bc\u02be\7\3"+
		"\2\2\u02bd\u02bc\3\2\2\2\u02be\u02c1\3\2\2\2\u02bf\u02bd\3\2\2\2\u02bf"+
		"\u02c0\3\2\2\2\u02c0\u02c2\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c2\u02c3\7\62"+
		"\2\2\u02c3Q\3\2\2\2\u02c4\u02c5\7.\2\2\u02c5\u02c6\5<\37\2\u02c6S\3\2"+
		"\2\2\u02c7\u02c8\7\63\2\2\u02c8\u02cc\5V,\2\u02c9\u02cb\7\3\2\2\u02ca"+
		"\u02c9\3\2\2\2\u02cb\u02ce\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cc\u02cd\3\2"+
		"\2\2\u02cd\u02cf\3\2\2\2\u02ce\u02cc\3\2\2\2\u02cf\u02d3\7\64\2\2\u02d0"+
		"\u02d2\7\3\2\2\u02d1\u02d0\3\2\2\2\u02d2\u02d5\3\2\2\2\u02d3\u02d1\3\2"+
		"\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02db\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d6"+
		"\u02d7\5\\/\2\u02d7\u02d9\7\65\2\2\u02d8\u02da\7\3\2\2\u02d9\u02d8\3\2"+
		"\2\2\u02d9\u02da\3\2\2\2\u02da\u02dc\3\2\2\2\u02db\u02d6\3\2\2\2\u02dc"+
		"\u02dd\3\2\2\2\u02dd\u02db\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02df\3\2"+
		"\2\2\u02df\u02e0\7\66\2\2\u02e0U\3\2\2\2\u02e1\u02e3\7\b\2\2\u02e2\u02e4"+
		"\n\3\2\2\u02e3\u02e2\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e5"+
		"\u02e6\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02e8\7\f\2\2\u02e8W\3\2\2\2"+
		"\u02e9\u02ea\7\6\2\2\u02ea\u02eb\5\32\16\2\u02eb\u02ec\7\7\2\2\u02ecY"+
		"\3\2\2\2\u02ed\u02ee\7\67\2\2\u02ee\u02ef\5<\37\2\u02ef\u02f1\5V,\2\u02f0"+
		"\u02f2\5<\37\2\u02f1\u02f0\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2[\3\2\2\2"+
		"\u02f3\u02f8\5^\60\2\u02f4\u02f5\7\u009e\2\2\u02f5\u02f7\5^\60\2\u02f6"+
		"\u02f4\3\2\2\2\u02f7\u02fa\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f8\u02f9\3\2"+
		"\2\2\u02f9]\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fb\u02fd\78\2\2\u02fc\u02fb"+
		"\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u0300\5\32\16\2"+
		"\u02ff\u0301\78\2\2\u0300\u02ff\3\2\2\2\u0300\u0301\3\2\2\2\u0301_\3\2"+
		"\2\2\u0302\u0308\5h\65\2\u0303\u0308\5f\64\2\u0304\u0308\5d\63\2\u0305"+
		"\u0308\t\4\2\2\u0306\u0308\5b\62\2\u0307\u0302\3\2\2\2\u0307\u0303\3\2"+
		"\2\2\u0307\u0304\3\2\2\2\u0307\u0305\3\2\2\2\u0307\u0306\3\2\2\2\u0308"+
		"a\3\2\2\2\u0309\u030d\7;\2\2\u030a\u030c\5\32\16\2\u030b\u030a\3\2\2\2"+
		"\u030c\u030f\3\2\2\2\u030d\u030b\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u0310"+
		"\3\2\2\2\u030f\u030d\3\2\2\2\u0310\u0311\7\f\2\2\u0311c\3\2\2\2\u0312"+
		"\u0313\7\n\2\2\u0313\u031e\5<\37\2\u0314\u0315\7<\2\2\u0315\u0316\5\32"+
		"\16\2\u0316\u0317\7\f\2\2\u0317\u031e\3\2\2\2\u0318\u0319\7\20\2\2\u0319"+
		"\u031a\7\b\2\2\u031a\u031b\5\32\16\2\u031b\u031c\7\f\2\2\u031c\u031e\3"+
		"\2\2\2\u031d\u0312\3\2\2\2\u031d\u0314\3\2\2\2\u031d\u0318\3\2\2\2\u031e"+
		"e\3\2\2\2\u031f\u0323\7=\2\2\u0320\u0322\5&\24\2\u0321\u0320\3\2\2\2\u0322"+
		"\u0325\3\2\2\2\u0323\u0321\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0326\3\2"+
		"\2\2\u0325\u0323\3\2\2\2\u0326\u0327\7\f\2\2\u0327g\3\2\2\2\u0328\u032b"+
		"\5j\66\2\u0329\u032b\5l\67\2\u032a\u0328\3\2\2\2\u032a\u0329\3\2\2\2\u032b"+
		"i\3\2\2\2\u032c\u0330\7>\2\2\u032d\u032f\5\32\16\2\u032e\u032d\3\2\2\2"+
		"\u032f\u0332\3\2\2\2\u0330\u032e\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u0333"+
		"\3\2\2\2\u0332\u0330\3\2\2\2\u0333\u0340\7\f\2\2\u0334\u0338\7?\2\2\u0335"+
		"\u0337\5\32\16\2\u0336\u0335\3\2\2\2\u0337\u033a\3\2\2\2\u0338\u0336\3"+
		"\2\2\2\u0338\u0339\3\2\2\2\u0339\u033b\3\2\2\2\u033a\u0338\3\2\2\2\u033b"+
		"\u033d\7\f\2\2\u033c\u033e\7 \2\2\u033d\u033c\3\2\2\2\u033d\u033e\3\2"+
		"\2\2\u033e\u0340\3\2\2\2\u033f\u032c\3\2\2\2\u033f\u0334\3\2\2\2\u0340"+
		"k\3\2\2\2\u0341\u0342\7@\2\2\u0342\u0346\5<\37\2\u0343\u0344\7A\2\2\u0344"+
		"\u0346\5<\37\2\u0345\u0341\3\2\2\2\u0345\u0343\3\2\2\2\u0346m\3\2\2\2"+
		"\u0347\u0348\7\6\2\2\u0348\u0349\5\32\16\2\u0349\u034a\7\7\2\2\u034ao"+
		"\3\2\2\2\u034b\u034f\7B\2\2\u034c\u034e\5\32\16\2\u034d\u034c\3\2\2\2"+
		"\u034e\u0351\3\2\2\2\u034f\u034d\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u0352"+
		"\3\2\2\2\u0351\u034f\3\2\2\2\u0352\u0353\7C\2\2\u0353q\3\2\2\2\u0354\u0355"+
		"\t\5\2\2\u0355\u0357\7\b\2\2\u0356\u0358\5,\27\2\u0357\u0356\3\2\2\2\u0357"+
		"\u0358\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u035a\5&\24\2\u035a\u035b\7\f"+
		"\2\2\u035bs\3\2\2\2\u035c\u035d\t\6\2\2\u035d\u035f\7\b\2\2\u035e\u0360"+
		"\5,\27\2\u035f\u035e\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0361\3\2\2\2\u0361"+
		"\u0362\5&\24\2\u0362\u0363\7\f\2\2\u0363u\3\2\2\2\u0364\u0365\t\7\2\2"+
		"\u0365\u0367\7\b\2\2\u0366\u0368\5,\27\2\u0367\u0366\3\2\2\2\u0367\u0368"+
		"\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u036a\5&\24\2\u036a\u036b\7\f\2\2\u036b"+
		"w\3\2\2\2\u036c\u036e\7\u0090\2\2\u036d\u036c\3\2\2\2\u036d\u036e\3\2"+
		"\2\2\u036e\u036f\3\2\2\2\u036f\u0373\t\b\2\2\u0370\u0372\5\u0098M\2\u0371"+
		"\u0370\3\2\2\2\u0372\u0375\3\2\2\2\u0373\u0371\3\2\2\2\u0373\u0374\3\2"+
		"\2\2\u0374\u0376\3\2\2\2\u0375\u0373\3\2\2\2\u0376\u0377\7\b\2\2\u0377"+
		"\u0378\5z>\2\u0378\u0379\7\f\2\2\u0379y\3\2\2\2\u037a\u038b\5|?\2\u037b"+
		"\u037f\7\16\2\2\u037c\u037e\7\3\2\2\u037d\u037c\3\2\2\2\u037e\u0381\3"+
		"\2\2\2\u037f\u037d\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0382\3\2\2\2\u0381"+
		"\u037f\3\2\2\2\u0382\u0386\5|?\2\u0383\u0385\7\3\2\2\u0384\u0383\3\2\2"+
		"\2\u0385\u0388\3\2\2\2\u0386\u0384\3\2\2\2\u0386\u0387\3\2\2\2\u0387\u038a"+
		"\3\2\2\2\u0388\u0386\3\2\2\2\u0389\u037b\3\2\2\2\u038a\u038d\3\2\2\2\u038b"+
		"\u0389\3\2\2\2\u038b\u038c\3\2\2\2\u038c{\3\2\2\2\u038d\u038b\3\2\2\2"+
		"\u038e\u0392\5\u00ba^\2\u038f\u0392\5\u00a2R\2\u0390\u0392\5\u00a4S\2"+
		"\u0391\u038e\3\2\2\2\u0391\u038f\3\2\2\2\u0391\u0390\3\2\2\2\u0392\u0395"+
		"\3\2\2\2\u0393\u0391\3\2\2\2\u0393\u0394\3\2\2\2\u0394}\3\2\2\2\u0395"+
		"\u0393\3\2\2\2\u0396\u0397\t\t\2\2\u0397\177\3\2\2\2\u0398\u039a\7P\2"+
		"\2\u0399\u039b\5\u0098M\2\u039a\u0399\3\2\2\2\u039a\u039b\3\2\2\2\u039b"+
		"\u039f\3\2\2\2\u039c\u039e\5\32\16\2\u039d\u039c\3\2\2\2\u039e\u03a1\3"+
		"\2\2\2\u039f\u039d\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a2\3\2\2\2\u03a1"+
		"\u039f\3\2\2\2\u03a2\u03af\7Q\2\2\u03a3\u03a5\7R\2\2\u03a4\u03a6\5\u0098"+
		"M\2\u03a5\u03a4\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03aa\3\2\2\2\u03a7"+
		"\u03a9\5\32\16\2\u03a8\u03a7\3\2\2\2\u03a9\u03ac\3\2\2\2\u03aa\u03a8\3"+
		"\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u03ad\3\2\2\2\u03ac\u03aa\3\2\2\2\u03ad"+
		"\u03af\7S\2\2\u03ae\u0398\3\2\2\2\u03ae\u03a3\3\2\2\2\u03af\u0081\3\2"+
		"\2\2\u03b0\u03b2\7T\2\2\u03b1\u03b3\5\u0098M\2\u03b2\u03b1\3\2\2\2\u03b2"+
		"\u03b3\3\2\2\2\u03b3\u03b7\3\2\2\2\u03b4\u03b6\5\32\16\2\u03b5\u03b4\3"+
		"\2\2\2\u03b6\u03b9\3\2\2\2\u03b7\u03b5\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8"+
		"\u03ba\3\2\2\2\u03b9\u03b7\3\2\2\2\u03ba\u03c7\7U\2\2\u03bb\u03bd\7V\2"+
		"\2\u03bc\u03be\5\u0098M\2\u03bd\u03bc\3\2\2\2\u03bd\u03be\3\2\2\2\u03be"+
		"\u03c2\3\2\2\2\u03bf\u03c1\5\32\16\2\u03c0\u03bf\3\2\2\2\u03c1\u03c4\3"+
		"\2\2\2\u03c2\u03c0\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3\u03c5\3\2\2\2\u03c4"+
		"\u03c2\3\2\2\2\u03c5\u03c7\7W\2\2\u03c6\u03b0\3\2\2\2\u03c6\u03bb\3\2"+
		"\2\2\u03c7\u0083\3\2\2\2\u03c8\u03ca\7X\2\2\u03c9\u03cb\5\u0098M\2\u03ca"+
		"\u03c9\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03cf\3\2\2\2\u03cc\u03ce\5\32"+
		"\16\2\u03cd\u03cc\3\2\2\2\u03ce\u03d1\3\2\2\2\u03cf\u03cd\3\2\2\2\u03cf"+
		"\u03d0\3\2\2\2\u03d0\u03d2\3\2\2\2\u03d1\u03cf\3\2\2\2\u03d2\u03d3\7Y"+
		"\2\2\u03d3\u0085\3\2\2\2\u03d4\u03d6\7Z\2\2\u03d5\u03d7\5\u0098M\2\u03d6"+
		"\u03d5\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03db\3\2\2\2\u03d8\u03da\5\32"+
		"\16\2\u03d9\u03d8\3\2\2\2\u03da\u03dd\3\2\2\2\u03db\u03d9\3\2\2\2\u03db"+
		"\u03dc\3\2\2\2\u03dc\u03de\3\2\2\2\u03dd\u03db\3\2\2\2\u03de\u03df\7["+
		"\2\2\u03df\u0087\3\2\2\2\u03e0\u03e1\7\\\2\2\u03e1\u03e2\5<\37\2\u03e2"+
		"\u0089\3\2\2\2\u03e3\u03e4\7]\2\2\u03e4\u03e5\5<\37\2\u03e5\u008b\3\2"+
		"\2\2\u03e6\u03ea\7^\2\2\u03e7\u03e9\5 \21\2\u03e8\u03e7\3\2\2\2\u03e9"+
		"\u03ec\3\2\2\2\u03ea\u03e8\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb\u03ed\3\2"+
		"\2\2\u03ec\u03ea\3\2\2\2\u03ed\u03ee\5\u00b4[\2\u03ee\u008d\3\2\2\2\u03ef"+
		"\u03f0\7_\2\2\u03f0\u03f1\5<\37\2\u03f1\u008f\3\2\2\2\u03f2\u03f3\7`\2"+
		"\2\u03f3\u03f4\5<\37\2\u03f4\u0091\3\2\2\2\u03f5\u03f9\7a\2\2\u03f6\u03f8"+
		"\5 \21\2\u03f7\u03f6\3\2\2\2\u03f8\u03fb\3\2\2\2\u03f9\u03f7\3\2\2\2\u03f9"+
		"\u03fa\3\2\2\2\u03fa\u03fc\3\2\2\2\u03fb\u03f9\3\2\2\2\u03fc\u03fd\5\u00b4"+
		"[\2\u03fd\u0093\3\2\2\2\u03fe\u03ff\7b\2\2\u03ff\u0400\7\b\2\2\u0400\u0401"+
		"\5\u0096L\2\u0401\u0402\7\f\2\2\u0402\u0095\3\2\2\2\u0403\u0404\5&\24"+
		"\2\u0404\u0097\3\2\2\2\u0405\u0409\7,\2\2\u0406\u0408\n\n\2\2\u0407\u0406"+
		"\3\2\2\2\u0408\u040b\3\2\2\2\u0409\u0407\3\2\2\2\u0409\u040a\3\2\2\2\u040a"+
		"\u040c\3\2\2\2\u040b\u0409\3\2\2\2\u040c\u040d\7-\2\2\u040d\u0099\3\2"+
		"\2\2\u040e\u040f\7\16\2\2\u040f\u009b\3\2\2\2\u0410\u0411\7c\2\2\u0411"+
		"\u009d\3\2\2\2\u0412\u0413\7d\2\2\u0413\u009f\3\2\2\2\u0414\u0415\7e\2"+
		"\2\u0415\u00a1\3\2\2\2\u0416\u0417\7f\2\2\u0417\u00a3\3\2\2\2\u0418\u0419"+
		"\7g\2\2\u0419\u00a5\3\2\2\2\u041a\u041c\78\2\2\u041b\u041d\n\13\2\2\u041c"+
		"\u041b\3\2\2\2\u041c\u041d\3\2\2\2\u041d\u041e\3\2\2\2\u041e\u041f\78"+
		"\2\2\u041f\u00a7\3\2\2\2\u0420\u0422\7h\2\2\u0421\u0423\n\f\2\2\u0422"+
		"\u0421\3\2\2\2\u0423\u0424\3\2\2\2\u0424\u0422\3\2\2\2\u0424\u0425\3\2"+
		"\2\2\u0425\u0426\3\2\2\2\u0426\u0446\7h\2\2\u0427\u0446\5\u00a6T\2\u0428"+
		"\u042a\7i\2\2\u0429\u042b\n\r\2\2\u042a\u0429\3\2\2\2\u042b\u042c\3\2"+
		"\2\2\u042c\u042a\3\2\2\2\u042c\u042d\3\2\2\2\u042d\u042e\3\2\2\2\u042e"+
		"\u0446\7j\2\2\u042f\u0431\7k\2\2\u0430\u0432\n\16\2\2\u0431\u0430\3\2"+
		"\2\2\u0432\u0433\3\2\2\2\u0433\u0431\3\2\2\2\u0433\u0434\3\2\2\2\u0434"+
		"\u0435\3\2\2\2\u0435\u0446\7l\2\2\u0436\u0438\7m\2\2\u0437\u0439\n\17"+
		"\2\2\u0438\u0437\3\2\2\2\u0439\u043a\3\2\2\2\u043a\u0438\3\2\2\2\u043a"+
		"\u043b\3\2\2\2\u043b\u043c\3\2\2\2\u043c\u0446\7n\2\2\u043d\u043f\7o\2"+
		"\2\u043e\u0440\n\20\2\2\u043f\u043e\3\2\2\2\u0440\u0441\3\2\2\2\u0441"+
		"\u043f\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u0443\3\2\2\2\u0443\u0446\7p"+
		"\2\2\u0444\u0446\5\u00aeX\2\u0445\u0420\3\2\2\2\u0445\u0427\3\2\2\2\u0445"+
		"\u0428\3\2\2\2\u0445\u042f\3\2\2\2\u0445\u0436\3\2\2\2\u0445\u043d\3\2"+
		"\2\2\u0445\u0444\3\2\2\2\u0446\u00a9\3\2\2\2\u0447\u0448\7q\2\2\u0448"+
		"\u044a\5,\27\2\u0449\u044b\n\21\2\2\u044a\u0449\3\2\2\2\u044b\u044c\3"+
		"\2\2\2\u044c\u044a\3\2\2\2\u044c\u044d\3\2\2\2\u044d\u044e\3\2\2\2\u044e"+
		"\u044f\7r\2\2\u044f\u045a\3\2\2\2\u0450\u0451\7s\2\2\u0451\u0453\5,\27"+
		"\2\u0452\u0454\n\22\2\2\u0453\u0452\3\2\2\2\u0454\u0455\3\2\2\2\u0455"+
		"\u0453\3\2\2\2\u0455\u0456\3\2\2\2\u0456\u0457\3\2\2\2\u0457\u0458\7t"+
		"\2\2\u0458\u045a\3\2\2\2\u0459\u0447\3\2\2\2\u0459\u0450\3\2\2\2\u045a"+
		"\u00ab\3\2\2\2\u045b\u045d\7u\2\2\u045c\u045e\n\23\2\2\u045d\u045c\3\2"+
		"\2\2\u045e\u045f\3\2\2\2\u045f\u045d\3\2\2\2\u045f\u0460\3\2\2\2\u0460"+
		"\u0461\3\2\2\2\u0461\u0462\7v\2\2\u0462\u00ad\3\2\2\2\u0463\u0465\7w\2"+
		"\2\u0464\u0466\n\24\2\2\u0465\u0464\3\2\2\2\u0466\u0467\3\2\2\2\u0467"+
		"\u0465\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u0469\3\2\2\2\u0469\u0472\7x"+
		"\2\2\u046a\u046c\7y\2\2\u046b\u046d\n\25\2\2\u046c\u046b\3\2\2\2\u046d"+
		"\u046e\3\2\2\2\u046e\u046c\3\2\2\2\u046e\u046f\3\2\2\2\u046f\u0470\3\2"+
		"\2\2\u0470\u0472\7z\2\2\u0471\u0463\3\2\2\2\u0471\u046a\3\2\2\2\u0472"+
		"\u00af\3\2\2\2\u0473\u0476\5\u00b2Z\2\u0474\u0476\7\u009e\2\2\u0475\u0473"+
		"\3\2\2\2\u0475\u0474\3\2\2\2\u0476\u0479\3\2\2\2\u0477\u0475\3\2\2\2\u0477"+
		"\u0478\3\2\2\2\u0478\u00b1\3\2\2\2\u0479\u0477\3\2\2\2\u047a\u047c\n\26"+
		"\2\2\u047b\u047a\3\2\2\2\u047c\u047d\3\2\2\2\u047d\u047b\3\2\2\2\u047d"+
		"\u047e\3\2\2\2\u047e\u00b3\3\2\2\2\u047f\u0482\7\3\2\2\u0480\u0482\5\u00b6"+
		"\\\2\u0481\u047f\3\2\2\2\u0481\u0480\3\2\2\2\u0482\u00b5\3\2\2\2\u0483"+
		"\u0484\7\r\2\2\u0484\u00b7\3\2\2\2\u0485\u0487\7\u0090\2\2\u0486\u0488"+
		"\7f\2\2\u0487\u0486\3\2\2\2\u0487\u0488\3\2\2\2\u0488\u0489\3\2\2\2\u0489"+
		"\u048a\7{\2\2\u048a\u048b\5&\24\2\u048b\u048d\7\f\2\2\u048c\u048e\7g\2"+
		"\2\u048d\u048c\3\2\2\2\u048d\u048e\3\2\2\2\u048e\u00b9\3\2\2\2\u048f\u0492"+
		"\7\u0086\2\2\u0490\u0492\5\u00be`\2\u0491\u048f\3\2\2\2\u0491\u0490\3"+
		"\2\2\2\u0492\u00bb\3\2\2\2\u0493\u0494\5\u00be`\2\u0494\u0495\7\u009c"+
		"\2\2\u0495\u0496\5\u00be`\2\u0496\u00bd\3\2\2\2\u0497\u0498\7\u0087\2"+
		"\2\u0498\u00bf\3\2\2\2\u0499\u049a\7|\2\2\u049a\u00c1\3\2\2\2\u049b\u049c"+
		"\t\27\2\2\u049c\u00c3\3\2\2\2\u049d\u049e\7\u0083\2\2\u049e\u049f\5<\37"+
		"\2\u049f\u04a0\5<\37\2\u04a0\u04a1\5<\37\2\u04a1\u00c5\3\2\2\2\u04a2\u04a7"+
		"\5\u00ba^\2\u04a3\u04a7\7 \2\2\u04a4\u04a7\7\b\2\2\u04a5\u04a7\7\f\2\2"+
		"\u04a6\u04a2\3\2\2\2\u04a6\u04a3\3\2\2\2\u04a6\u04a4\3\2\2\2\u04a6\u04a5"+
		"\3\2\2\2\u04a7\u04aa\3\2\2\2\u04a8\u04a6\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9"+
		"\u00c7\3\2\2\2\u04aa\u04a8\3\2\2\2\u0085\u00cb\u00d2\u00db\u00e2\u00ef"+
		"\u00f7\u00fe\u0105\u010b\u0112\u0119\u011d\u0125\u012c\u0130\u0138\u013e"+
		"\u014c\u014e\u015d\u0163\u016a\u0189\u01a1\u01a8\u01b2\u01b9\u01c2\u01c6"+
		"\u01cc\u01d8\u01e9\u01ef\u01fb\u0203\u020e\u021a\u0222\u0226\u022f\u0238"+
		"\u0242\u0247\u024d\u0254\u025e\u0264\u026c\u0273\u027a\u027f\u0286\u028b"+
		"\u0291\u0297\u029e\u02a5\u02ac\u02b3\u02b9\u02bf\u02cc\u02d3\u02d9\u02dd"+
		"\u02e5\u02f1\u02f8\u02fc\u0300\u0307\u030d\u031d\u0323\u032a\u0330\u0338"+
		"\u033d\u033f\u0345\u034f\u0357\u035f\u0367\u036d\u0373\u037f\u0386\u038b"+
		"\u0391\u0393\u039a\u039f\u03a5\u03aa\u03ae\u03b2\u03b7\u03bd\u03c2\u03c6"+
		"\u03ca\u03cf\u03d6\u03db\u03ea\u03f9\u0409\u041c\u0424\u042c\u0433\u043a"+
		"\u0441\u0445\u044c\u0455\u0459\u045f\u0467\u046e\u0471\u0475\u0477\u047d"+
		"\u0481\u0487\u048d\u0491\u04a6\u04a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}