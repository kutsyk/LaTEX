// Generated from D:/Charlesworth/LaTEX/src/com/kutsyk/grammar/LaTEX\LaTEX.g4 by ANTLR 4.5
package com.kutsyk.grammar.LaTEX;
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
		T__125=126, T__126=127, T__127=128, T__128=129, T__129=130, T__130=131, 
		IgnoreAlgorithmKeyWords=132, IgnoreUrlPrefix=133, String=134, Num=135, 
		INT=136, DOUBLE=137, NameChar=138, NameStartChar=139, ASSIGN=140, GT=141, 
		LT=142, BANG=143, TILDE=144, QUESTION=145, COLON=146, EQUAL=147, LE=148, 
		GE=149, NOTEQUAL=150, AND=151, OR=152, INC=153, DEC=154, ADD=155, SUB=156, 
		MUL=157, BITAND=158, BITOR=159, CARET=160, COMMENT=161, LINE_COMMENT=162, 
		WS=163, WORDS_TO_SKIP=164, Skip=165, Affil=166;
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
		RULE_eqnEquation = 88, RULE_newLine = 89, RULE_doubleSlash = 90, RULE_reference = 91, 
		RULE_simpleText = 92, RULE_interval = 93, RULE_numbers = 94, RULE_arabic = 95, 
		RULE_specialCharacters = 96, RULE_ifThenElse = 97, RULE_ifThenText = 98, 
		RULE_isoEnt = 99;
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
		"doubleSlash", "reference", "simpleText", "interval", "numbers", "arabic", 
		"specialCharacters", "ifThenElse", "ifThenText", "isoEnt"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\r'", "'\n'", "'\\begin{document}'", "'\\end{document}'", "'\\begin{flushleft}'", 
		"'\\end{flushleft}'", "'{'", "'\\Large'", "'\\textbf'", "'\\newline'", 
		"'}'", "'\\\\'", "','", "'\\textsuperscript'", "'$^'", "'$'", "'\\bf'", 
		"'\\begin{landscape}'", "'\\end{landscape}'", "'/'", "'@'", "'\\paragraph'", 
		"'\\paragraph*'", "'\\textsc'", "'\\label'", "'\\mbox'", "'\\begin{abstract}'", 
		"'\\end{abstract}'", "'\\Abstract'", "'\\title'", "'\\newcommand'", "'\\renewcommand'", 
		"'\\'", "'\\left'", "'\\right'", "'\\begin{multicols}'", "'\\end{multicols}'", 
		"'\\begin{enumerate}'", "'\\end{enumerate}'", "'\\begin{itemize}'", "'\\end{itemize}'", 
		"'\\item'", "'\\begin{description}'", "'\\end{description}'", "'['", "']'", 
		"'\\caption'", "'\\begin{table}'", "'\\begin{adjustwidth}{-2.25in}{0in}'", 
		"'\\end{adjustwidth}'", "'\\end{table}'", "'\\begin{tabular}'", "'\\hline'", 
		"'\\\\ \\hline'", "'\\end{tabular}'", "'\\multicolumn'", "'\\large'", 
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
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"IgnoreAlgorithmKeyWords", "IgnoreUrlPrefix", "String", "Num", "INT", 
		"DOUBLE", "NameChar", "NameStartChar", "ASSIGN", "GT", "LT", "BANG", "TILDE", 
		"QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", 
		"DEC", "ADD", "SUB", "MUL", "BITAND", "BITOR", "CARET", "COMMENT", "LINE_COMMENT", 
		"WS", "WORDS_TO_SKIP", "Skip", "Affil"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				{
				setState(200);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(206); 
			documentDeclaration();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				{
				setState(207);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitDocumentDeclaration(this);
			else return visitor.visitChildren(this);
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
			setState(215); 
			match(T__2);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				{
				setState(216);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222); 
			frontPart();
			setState(226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(223);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==T__1) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(229); 
			documentBody();
			setState(230); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitDocumentBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentBodyContext documentBody() throws RecognitionException {
		DocumentBodyContext _localctx = new DocumentBodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_documentBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitFrontPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrontPartContext frontPart() throws RecognitionException {
		FrontPartContext _localctx = new FrontPartContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_frontPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234); 
			match(T__4);
			setState(235); 
			frontBody();
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__35) | (1L << T__37) | (1L << T__39) | (1L << T__42) | (1L << T__46) | (1L << T__47) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__85 - 64)) | (1L << (T__87 - 64)) | (1L << (T__89 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__110 - 64)) | (1L << (T__112 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__120 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (TILDE - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)))) != 0)) {
				{
				{
				setState(236); 
				memberList();
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(242); 
			match(T__5);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitFrontBody(this);
			else return visitor.visitChildren(this);
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
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				{
				setState(244);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(250); 
			mainTitle();
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				{
				setState(251);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(257); 
			authorList();
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				{
				setState(258);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(265); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(264); 
					address();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(267); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitMainTitle(this);
			else return visitor.visitChildren(this);
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
			setState(269); 
			match(T__6);
			setState(270); 
			match(T__7);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				{
				setState(271);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(277); 
			match(T__8);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				{
				setState(278);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(285);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(284); 
				match(T__9);
				}
			}

			setState(287); 
			match(T__6);
			setState(288); 
			text();
			setState(289); 
			match(T__10);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				{
				setState(290);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(296); 
			match(T__10);
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(297);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==T__1) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(304);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(303); 
				match(T__9);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitAuthorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuthorListContext authorList() throws RecognitionException {
		AuthorListContext _localctx = new AuthorListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_authorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306); 
			match(T__11);
			setState(307); 
			author();
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(308); 
				match(T__12);
				setState(309); 
				author();
				}
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				{
				setState(315);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(321); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitAuthor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuthorContext author() throws RecognitionException {
		AuthorContext _localctx = new AuthorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_author);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323); 
			authorName();
			setState(324);
			_la = _input.LA(1);
			if ( !(_la==T__13 || _la==T__14) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(325); 
			textsuperscriptBlock();
			setState(327);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(326); 
				match(T__15);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitTextsuperscriptBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextsuperscriptBlockContext textsuperscriptBlock() throws RecognitionException {
		TextsuperscriptBlockContext _localctx = new TextsuperscriptBlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_textsuperscriptBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329); 
			match(T__6);
			setState(334); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(334);
				switch (_input.LA(1)) {
				case Num:
					{
					setState(330); 
					numbers();
					}
					break;
				case MUL:
					{
					setState(331); 
					match(MUL);
					}
					break;
				case T__124:
				case T__125:
				case T__126:
				case T__127:
				case T__128:
				case T__129:
					{
					setState(332); 
					specialCharacters();
					}
					break;
				case T__12:
					{
					setState(333); 
					match(T__12);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(336); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__12 || ((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & ((1L << (T__124 - 125)) | (1L << (T__125 - 125)) | (1L << (T__126 - 125)) | (1L << (T__127 - 125)) | (1L << (T__128 - 125)) | (1L << (T__129 - 125)) | (1L << (Num - 125)) | (1L << (MUL - 125)))) != 0) );
			setState(338); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitAuthorName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuthorNameContext authorName() throws RecognitionException {
		AuthorNameContext _localctx = new AuthorNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_authorName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitAddress(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddressContext address() throws RecognitionException {
		AddressContext _localctx = new AddressContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_address);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(342); 
			match(T__16);
			setState(343); 
			match(T__6);
			setState(344); 
			numbers();
			setState(345); 
			match(T__10);
			setState(346); 
			text();
			setState(347); 
			match(T__11);
			setState(351);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(348);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==T__1) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(353);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitBodyPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyPartContext bodyPart() throws RecognitionException {
		BodyPartContext _localctx = new BodyPartContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bodyPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__35) | (1L << T__37) | (1L << T__39) | (1L << T__42) | (1L << T__46) | (1L << T__47) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__85 - 64)) | (1L << (T__87 - 64)) | (1L << (T__89 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__110 - 64)) | (1L << (T__112 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__120 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (TILDE - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)))) != 0)) {
				{
				{
				setState(354); 
				memberList();
				}
				}
				setState(359);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitMemberList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberListContext memberList() throws RecognitionException {
		MemberListContext _localctx = new MemberListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_memberList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(360); 
			member();
			setState(364);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(361); 
					member();
					}
					} 
				}
				setState(366);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberContext member() throws RecognitionException {
		MemberContext _localctx = new MemberContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_member);
		try {
			setState(395);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(367); 
				specialCharacters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(368); 
				title();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(369); 
				table();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(370); 
				abstractBlock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(371); 
				textRules();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(372); 
				figureBlock();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(373); 
				supplementaryFigureBlock();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(374); 
				algorithmBlock();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(375); 
				algorithmicBlock();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(376); 
				input();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(377); 
				output();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(378); 
				state();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(379); 
				forBlock();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(380); 
				ifBlock();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(381); 
				returnBlock();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(382); 
				captionBlock();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(383); 
				multicolsBlock();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(384); 
				label();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(385); 
				descriptionList();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(386); 
				sectionDeclaration();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(387); 
				subsectionDeclaration();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(388); 
				subsubsectionDeclaration();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(389); 
				renewcommandDeclaration();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(390); 
				citeReferences();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(391); 
				reference();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(392); 
				newLine();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(393); 
				url();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(394); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitLandScapeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LandScapeBlockContext landScapeBlock() throws RecognitionException {
		LandScapeBlockContext _localctx = new LandScapeBlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_landScapeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397); 
			match(T__17);
			setState(398); 
			memberList();
			setState(399); 
			match(T__18);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitTextRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextRulesContext textRules() throws RecognitionException {
		TextRulesContext _localctx = new TextRulesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_textRules);
		try {
			int _alt;
			setState(426);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(401); 
				dollarBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(402); 
				textSymbols();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(403); 
				landScapeBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(404); 
				inlineEquation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(405); 
				equationBlock();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(406); 
				displayEquation();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(407); 
				paragraph();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(408); 
				list();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(409); 
				textformatingBlockFlushLeft();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(410); 
				textformatingBlockCenter();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(411); 
				textSC();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(412); 
				block();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(413); 
				texttypeDeclarator();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(414); 
				interval();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(415); 
				measures();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(417); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(416); 
						simpleText();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(419); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(421); 
				arabic();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(422); 
				identificator();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(423); 
				multicolumn();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(424); 
				dots();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(425); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitTextSymbols(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextSymbolsContext textSymbols() throws RecognitionException {
		TextSymbolsContext _localctx = new TextSymbolsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_textSymbols);
		try {
			setState(436);
			switch (_input.LA(1)) {
			case T__98:
				enterOuterAlt(_localctx, 1);
				{
				setState(428); 
				dot();
				}
				break;
			case T__100:
				enterOuterAlt(_localctx, 2);
				{
				setState(429); 
				appos();
				}
				break;
			case T__101:
				enterOuterAlt(_localctx, 3);
				{
				setState(430); 
				lparen();
				}
				break;
			case T__102:
				enterOuterAlt(_localctx, 4);
				{
				setState(431); 
				rparen();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 5);
				{
				setState(432); 
				match(SUB);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 6);
				{
				setState(433); 
				match(T__19);
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 7);
				{
				setState(434); 
				match(MUL);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 8);
				{
				setState(435); 
				match(T__20);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitParagraph(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParagraphContext paragraph() throws RecognitionException {
		ParagraphContext _localctx = new ParagraphContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_paragraph);
		int _la;
		try {
			setState(456);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(438); 
				match(T__21);
				setState(439); 
				match(T__6);
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__35) | (1L << T__37) | (1L << T__39) | (1L << T__42) | (1L << T__46) | (1L << T__47) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__85 - 64)) | (1L << (T__87 - 64)) | (1L << (T__89 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__110 - 64)) | (1L << (T__112 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__120 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (TILDE - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)))) != 0)) {
					{
					{
					setState(440); 
					memberList();
					}
					}
					setState(445);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(446); 
				match(T__10);
				}
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(447); 
				match(T__22);
				setState(448); 
				match(T__6);
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__35) | (1L << T__37) | (1L << T__39) | (1L << T__42) | (1L << T__46) | (1L << T__47) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__85 - 64)) | (1L << (T__87 - 64)) | (1L << (T__89 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__110 - 64)) | (1L << (T__112 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__120 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (TILDE - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)))) != 0)) {
					{
					{
					setState(449); 
					memberList();
					}
					}
					setState(454);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(455); 
				match(T__10);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_text);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(458); 
			textBody();
			setState(462);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(459); 
					textBody();
					}
					} 
				}
				setState(464);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitTextBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextBodyContext textBody() throws RecognitionException {
		TextBodyContext _localctx = new TextBodyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_textBody);
		int _la;
		try {
			setState(474);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(465); 
				boxBlock();
				}
				break;
			case T__7:
			case T__8:
			case T__16:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
				enterOuterAlt(_localctx, 2);
				{
				setState(466); 
				texttypeDeclarator();
				}
				break;
			case String:
			case Num:
				enterOuterAlt(_localctx, 3);
				{
				setState(467); 
				simpleText();
				}
				break;
			case T__19:
			case T__20:
			case T__98:
			case T__100:
			case T__101:
			case T__102:
			case SUB:
			case MUL:
				enterOuterAlt(_localctx, 4);
				{
				setState(468); 
				textSymbols();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 5);
				{
				setState(469); 
				dollarBlock();
				}
				break;
			case T__6:
			case T__33:
				enterOuterAlt(_localctx, 6);
				{
				setState(470); 
				block();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 7);
				{
				setState(471); 
				comma();
				}
				break;
			case T__97:
				enterOuterAlt(_localctx, 8);
				{
				setState(472); 
				url();
				}
				break;
			case T__0:
			case T__1:
				enterOuterAlt(_localctx, 9);
				{
				setState(473);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				consume();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitTextSC(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextSCContext textSC() throws RecognitionException {
		TextSCContext _localctx = new TextSCContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_textSC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476); 
			match(T__23);
			setState(477); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479); 
			match(T__24);
			setState(480); 
			match(T__6);
			setState(481); 
			text();
			setState(482); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitBoxBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoxBlockContext boxBlock() throws RecognitionException {
		BoxBlockContext _localctx = new BoxBlockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_boxBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484); 
			match(T__25);
			setState(485); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitAbstractBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractBlockContext abstractBlock() throws RecognitionException {
		AbstractBlockContext _localctx = new AbstractBlockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_abstractBlock);
		int _la;
		try {
			setState(497);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(487); 
				match(T__26);
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__35) | (1L << T__37) | (1L << T__39) | (1L << T__42) | (1L << T__46) | (1L << T__47) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__85 - 64)) | (1L << (T__87 - 64)) | (1L << (T__89 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__110 - 64)) | (1L << (T__112 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__120 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (TILDE - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)))) != 0)) {
					{
					{
					setState(488); 
					memberList();
					}
					}
					setState(493);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(494); 
				match(T__27);
				}
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(495); 
				match(T__28);
				setState(496); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499); 
			match(T__29);
			setState(500); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitNewcommandDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewcommandDeclarationContext newcommandDeclaration() throws RecognitionException {
		NewcommandDeclarationContext _localctx = new NewcommandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_newcommandDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(502); 
			match(T__30);
			setState(503); 
			match(T__6);
			setState(504); 
			identificator();
			setState(505); 
			match(T__10);
			setState(509);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(506); 
					options();
					}
					} 
				}
				setState(511);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(512); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitCommandBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandBodyContext commandBody() throws RecognitionException {
		CommandBodyContext _localctx = new CommandBodyContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_commandBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(514);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(517); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (IgnoreAlgorithmKeyWords - 128)) | (1L << (IgnoreUrlPrefix - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (INT - 128)) | (1L << (DOUBLE - 128)) | (1L << (NameChar - 128)) | (1L << (NameStartChar - 128)) | (1L << (ASSIGN - 128)) | (1L << (GT - 128)) | (1L << (LT - 128)) | (1L << (BANG - 128)) | (1L << (TILDE - 128)) | (1L << (QUESTION - 128)) | (1L << (COLON - 128)) | (1L << (EQUAL - 128)) | (1L << (LE - 128)) | (1L << (GE - 128)) | (1L << (NOTEQUAL - 128)) | (1L << (AND - 128)) | (1L << (OR - 128)) | (1L << (INC - 128)) | (1L << (DEC - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)) | (1L << (BITAND - 128)) | (1L << (BITOR - 128)) | (1L << (CARET - 128)) | (1L << (COMMENT - 128)) | (1L << (LINE_COMMENT - 128)) | (1L << (WS - 128)) | (1L << (WORDS_TO_SKIP - 128)) | (1L << (Skip - 128)) | (1L << (Affil - 128)))) != 0) );
			setState(519);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitRenewcommandDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RenewcommandDeclarationContext renewcommandDeclaration() throws RecognitionException {
		RenewcommandDeclarationContext _localctx = new RenewcommandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_renewcommandDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(521); 
			match(T__31);
			setState(522); 
			match(T__6);
			setState(523); 
			identificator();
			setState(524); 
			match(T__10);
			setState(528);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(525); 
					options();
					}
					} 
				}
				setState(530);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			setState(531); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitIdentificator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentificatorContext identificator() throws RecognitionException {
		IdentificatorContext _localctx = new IdentificatorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_identificator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533); 
			match(T__32);
			setState(534); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_block);
		int _la;
		try {
			setState(552);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(536); 
				match(T__6);
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__35) | (1L << T__37) | (1L << T__39) | (1L << T__42) | (1L << T__46) | (1L << T__47) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__85 - 64)) | (1L << (T__87 - 64)) | (1L << (T__89 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__110 - 64)) | (1L << (T__112 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__120 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (TILDE - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)))) != 0)) {
					{
					{
					setState(537); 
					memberList();
					}
					}
					setState(542);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(543); 
				match(T__10);
				}
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(544); 
				match(T__33);
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__35) | (1L << T__37) | (1L << T__39) | (1L << T__42) | (1L << T__46) | (1L << T__47) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__85 - 64)) | (1L << (T__87 - 64)) | (1L << (T__89 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__110 - 64)) | (1L << (T__112 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__120 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (TILDE - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)))) != 0)) {
					{
					{
					setState(545); 
					memberList();
					}
					}
					setState(550);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(551); 
				match(T__34);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitMulticolsBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulticolsBlockContext multicolsBlock() throws RecognitionException {
		MulticolsBlockContext _localctx = new MulticolsBlockContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_multicolsBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554); 
			match(T__35);
			setState(555); 
			match(T__6);
			setState(556); 
			match(INT);
			setState(557); 
			match(T__10);
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__35) | (1L << T__37) | (1L << T__39) | (1L << T__42) | (1L << T__46) | (1L << T__47) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__85 - 64)) | (1L << (T__87 - 64)) | (1L << (T__89 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__110 - 64)) | (1L << (T__112 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__120 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (TILDE - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)))) != 0)) {
				{
				{
				setState(558); 
				memberList();
				}
				}
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(564); 
			match(T__36);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_list);
		int _la;
		try {
			setState(580);
			switch (_input.LA(1)) {
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(566); 
				match(T__37);
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__44) {
					{
					{
					setState(567); 
					options();
					}
					}
					setState(572);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(573); 
				items();
				setState(574); 
				match(T__38);
				}
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(576); 
				match(T__39);
				setState(577); 
				items();
				setState(578); 
				match(T__40);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemsContext items() throws RecognitionException {
		ItemsContext _localctx = new ItemsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_items);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__41))) != 0)) {
				{
				{
				setState(582); 
				item();
				}
				}
				setState(587);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
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
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				{
				setState(588);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(593);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(594); 
			match(T__41);
			setState(598);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(595); 
					memberList();
					}
					} 
				}
				setState(600);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitDescriptionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptionListContext descriptionList() throws RecognitionException {
		DescriptionListContext _localctx = new DescriptionListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_descriptionList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(601); 
			match(T__42);
			setState(602); 
			descriptionItems();
			setState(603); 
			match(T__43);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitDescriptionItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptionItemsContext descriptionItems() throws RecognitionException {
		DescriptionItemsContext _localctx = new DescriptionItemsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_descriptionItems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__41))) != 0)) {
				{
				{
				setState(605); 
				descriptionItem();
				}
				}
				setState(610);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitDescriptionItem(this);
			else return visitor.visitChildren(this);
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
			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				{
				setState(611);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(616);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(617); 
			match(T__41);
			setState(618); 
			descriptionTitle();
			setState(622);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(619); 
					memberList();
					}
					} 
				}
				setState(624);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitDescriptionTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptionTitleContext descriptionTitle() throws RecognitionException {
		DescriptionTitleContext _localctx = new DescriptionTitleContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_descriptionTitle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625); 
			match(T__44);
			setState(629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__35) | (1L << T__37) | (1L << T__39) | (1L << T__42) | (1L << T__46) | (1L << T__47) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__85 - 64)) | (1L << (T__87 - 64)) | (1L << (T__89 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__110 - 64)) | (1L << (T__112 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__120 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (TILDE - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)))) != 0)) {
				{
				{
				setState(626); 
				memberList();
				}
				}
				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(632); 
			match(T__45);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitCaptionBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaptionBlockContext captionBlock() throws RecognitionException {
		CaptionBlockContext _localctx = new CaptionBlockContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_captionBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634); 
			match(T__46);
			setState(636);
			_la = _input.LA(1);
			if (_la==T__44) {
				{
				setState(635); 
				options();
				}
			}

			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__11))) != 0)) {
				{
				{
				setState(638); 
				newLine();
				}
				}
				setState(643);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(644); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
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
			setState(646); 
			match(T__47);
			setState(648);
			_la = _input.LA(1);
			if (_la==T__44) {
				{
				setState(647); 
				options();
				}
			}

			setState(653);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(650);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==T__1) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(655);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__48) {
				{
				{
				setState(656); 
				match(T__48);
				}
				}
				setState(661);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				{
				setState(662);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(667);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(668); 
			tableCaption();
			setState(672);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				{
				setState(669);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(674);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(675); 
			tabular();
			setState(679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				{
				setState(676);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(681);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(682); 
			tableDefinition();
			setState(686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				{
				setState(683);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(688);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(689); 
			label();
			setState(693);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(690);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==T__1) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(695);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			setState(699);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__49) {
				{
				{
				setState(696); 
				match(T__49);
				}
				}
				setState(701);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(705);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				{
				setState(702);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(707);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(708); 
			match(T__50);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitTableCaption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableCaptionContext tableCaption() throws RecognitionException {
		TableCaptionContext _localctx = new TableCaptionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_tableCaption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710); 
			match(T__46);
			setState(711); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitTabular(this);
			else return visitor.visitChildren(this);
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
			setState(713); 
			match(T__51);
			setState(714); 
			tableSkipBlock();
			setState(718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				{
				setState(715);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(720);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(721); 
			match(T__52);
			setState(725);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(722);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==T__1) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(727);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			setState(733); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(728); 
				tableRow();
				setState(729); 
				match(T__53);
				setState(731);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(730);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==T__1) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				}
				}
				}
				setState(735); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__35) | (1L << T__37) | (1L << T__39) | (1L << T__42) | (1L << T__46) | (1L << T__47) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__85 - 64)) | (1L << (T__87 - 64)) | (1L << (T__89 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__110 - 64)) | (1L << (T__112 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__120 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (TILDE - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)))) != 0) );
			setState(737); 
			match(T__54);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitTableSkipBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableSkipBlockContext tableSkipBlock() throws RecognitionException {
		TableSkipBlockContext _localctx = new TableSkipBlockContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_tableSkipBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739); 
			match(T__6);
			setState(741); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(740);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==T__10) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(743); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (IgnoreAlgorithmKeyWords - 128)) | (1L << (IgnoreUrlPrefix - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (INT - 128)) | (1L << (DOUBLE - 128)) | (1L << (NameChar - 128)) | (1L << (NameStartChar - 128)) | (1L << (ASSIGN - 128)) | (1L << (GT - 128)) | (1L << (LT - 128)) | (1L << (BANG - 128)) | (1L << (TILDE - 128)) | (1L << (QUESTION - 128)) | (1L << (COLON - 128)) | (1L << (EQUAL - 128)) | (1L << (LE - 128)) | (1L << (GE - 128)) | (1L << (NOTEQUAL - 128)) | (1L << (AND - 128)) | (1L << (OR - 128)) | (1L << (INC - 128)) | (1L << (DEC - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)) | (1L << (BITAND - 128)) | (1L << (BITOR - 128)) | (1L << (CARET - 128)) | (1L << (COMMENT - 128)) | (1L << (LINE_COMMENT - 128)) | (1L << (WS - 128)) | (1L << (WORDS_TO_SKIP - 128)) | (1L << (Skip - 128)) | (1L << (Affil - 128)))) != 0) );
			setState(745); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitTableDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableDefinitionContext tableDefinition() throws RecognitionException {
		TableDefinitionContext _localctx = new TableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_tableDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747); 
			match(T__4);
			setState(748); 
			memberList();
			setState(749); 
			match(T__5);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitMulticolumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulticolumnContext multicolumn() throws RecognitionException {
		MulticolumnContext _localctx = new MulticolumnContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_multicolumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751); 
			match(T__55);
			setState(752); 
			block();
			setState(753); 
			tableSkipBlock();
			setState(755);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(754); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitTableRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableRowContext tableRow() throws RecognitionException {
		TableRowContext _localctx = new TableRowContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_tableRow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757); 
			tableCell();
			setState(762);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(758); 
				match(BITAND);
				setState(759); 
				tableCell();
				}
				}
				setState(764);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitTableCell(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableCellContext tableCell() throws RecognitionException {
		TableCellContext _localctx = new TableCellContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_tableCell);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(765); 
				match(T__15);
				}
				break;
			}
			setState(768); 
			memberList();
			setState(770);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(769); 
				match(T__15);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitTexttypeDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TexttypeDeclaratorContext texttypeDeclarator() throws RecognitionException {
		TexttypeDeclaratorContext _localctx = new TexttypeDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_texttypeDeclarator);
		int _la;
		try {
			setState(777);
			switch (_input.LA(1)) {
			case T__61:
			case T__62:
			case T__63:
			case T__64:
				enterOuterAlt(_localctx, 1);
				{
				setState(772); 
				italictypeDeclaration();
				}
				break;
			case T__60:
				enterOuterAlt(_localctx, 2);
				{
				setState(773); 
				smallcapsDeclaration();
				}
				break;
			case T__8:
			case T__16:
			case T__59:
				enterOuterAlt(_localctx, 3);
				{
				setState(774); 
				boldTypeDeclaration();
				}
				break;
			case T__7:
			case T__56:
			case T__57:
				enterOuterAlt(_localctx, 4);
				{
				setState(775);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__56) | (1L << T__57))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 5);
				{
				setState(776); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitTtStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TtStyleContext ttStyle() throws RecognitionException {
		TtStyleContext _localctx = new TtStyleContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_ttStyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779); 
			match(T__58);
			setState(783);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__35) | (1L << T__37) | (1L << T__39) | (1L << T__42) | (1L << T__46) | (1L << T__47) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__85 - 64)) | (1L << (T__87 - 64)) | (1L << (T__89 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__110 - 64)) | (1L << (T__112 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__120 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (TILDE - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)))) != 0)) {
				{
				{
				setState(780); 
				memberList();
				}
				}
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(786); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitBoldTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoldTypeDeclarationContext boldTypeDeclaration() throws RecognitionException {
		BoldTypeDeclarationContext _localctx = new BoldTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_boldTypeDeclaration);
		try {
			setState(799);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(788); 
				match(T__8);
				setState(789); 
				block();
				}
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(790); 
				match(T__59);
				setState(791); 
				memberList();
				setState(792); 
				match(T__10);
				}
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(794); 
				match(T__16);
				setState(795); 
				match(T__6);
				setState(796); 
				memberList();
				setState(797); 
				match(T__10);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitSmallcapsDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SmallcapsDeclarationContext smallcapsDeclaration() throws RecognitionException {
		SmallcapsDeclarationContext _localctx = new SmallcapsDeclarationContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_smallcapsDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801); 
			match(T__60);
			setState(805);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << T__25) | (1L << T__33) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (String - 134)) | (1L << (Num - 134)) | (1L << (SUB - 134)) | (1L << (MUL - 134)))) != 0)) {
				{
				{
				setState(802); 
				text();
				}
				}
				setState(807);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(808); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitItalictypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItalictypeDeclarationContext italictypeDeclaration() throws RecognitionException {
		ItalictypeDeclarationContext _localctx = new ItalictypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_italictypeDeclaration);
		try {
			setState(812);
			switch (_input.LA(1)) {
			case T__61:
			case T__62:
				enterOuterAlt(_localctx, 1);
				{
				setState(810); 
				italicBlock();
				}
				break;
			case T__63:
			case T__64:
				enterOuterAlt(_localctx, 2);
				{
				setState(811); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitItalicBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItalicBlockContext italicBlock() throws RecognitionException {
		ItalicBlockContext _localctx = new ItalicBlockContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_italicBlock);
		int _la;
		try {
			setState(833);
			switch (_input.LA(1)) {
			case T__61:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(814); 
				match(T__61);
				setState(818);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__35) | (1L << T__37) | (1L << T__39) | (1L << T__42) | (1L << T__46) | (1L << T__47) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__85 - 64)) | (1L << (T__87 - 64)) | (1L << (T__89 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__110 - 64)) | (1L << (T__112 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__120 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (TILDE - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)))) != 0)) {
					{
					{
					setState(815); 
					memberList();
					}
					}
					setState(820);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(821); 
				match(T__10);
				}
				}
				break;
			case T__62:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(822); 
				match(T__62);
				setState(826);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__35) | (1L << T__37) | (1L << T__39) | (1L << T__42) | (1L << T__46) | (1L << T__47) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__85 - 64)) | (1L << (T__87 - 64)) | (1L << (T__89 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__110 - 64)) | (1L << (T__112 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__120 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (TILDE - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)))) != 0)) {
					{
					{
					setState(823); 
					memberList();
					}
					}
					setState(828);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(829); 
				match(T__10);
				setState(831);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(830); 
					match(T__32);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitItalicOutBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItalicOutBlockContext italicOutBlock() throws RecognitionException {
		ItalicOutBlockContext _localctx = new ItalicOutBlockContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_italicOutBlock);
		try {
			setState(839);
			switch (_input.LA(1)) {
			case T__63:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(835); 
				match(T__63);
				setState(836); 
				block();
				}
				}
				break;
			case T__64:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(837); 
				match(T__64);
				setState(838); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitTextformatingBlockFlushLeft(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextformatingBlockFlushLeftContext textformatingBlockFlushLeft() throws RecognitionException {
		TextformatingBlockFlushLeftContext _localctx = new TextformatingBlockFlushLeftContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_textformatingBlockFlushLeft);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841); 
			match(T__4);
			setState(842); 
			memberList();
			setState(843); 
			match(T__5);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitTextformatingBlockCenter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextformatingBlockCenterContext textformatingBlockCenter() throws RecognitionException {
		TextformatingBlockCenterContext _localctx = new TextformatingBlockCenterContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_textformatingBlockCenter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845); 
			match(T__65);
			setState(849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__35) | (1L << T__37) | (1L << T__39) | (1L << T__42) | (1L << T__46) | (1L << T__47) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__85 - 64)) | (1L << (T__87 - 64)) | (1L << (T__89 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__110 - 64)) | (1L << (T__112 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__120 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (TILDE - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)))) != 0)) {
				{
				{
				setState(846); 
				memberList();
				}
				}
				setState(851);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(852); 
			match(T__66);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitSectionDeclaration(this);
			else return visitor.visitChildren(this);
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
			setState(854);
			_la = _input.LA(1);
			if ( !(_la==T__67 || _la==T__68) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(855); 
			match(T__6);
			setState(857);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(856); 
				label();
				}
			}

			setState(859); 
			text();
			setState(860); 
			match(T__10);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitSubsectionDeclaration(this);
			else return visitor.visitChildren(this);
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
			setState(862);
			_la = _input.LA(1);
			if ( !(_la==T__69 || _la==T__70) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(863); 
			match(T__6);
			setState(865);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(864); 
				label();
				}
			}

			setState(867); 
			text();
			setState(868); 
			match(T__10);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitSubsubsectionDeclaration(this);
			else return visitor.visitChildren(this);
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
			setState(870);
			_la = _input.LA(1);
			if ( !(_la==T__71 || _la==T__72) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(871); 
			match(T__6);
			setState(873);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(872); 
				label();
				}
			}

			setState(875); 
			text();
			setState(876); 
			match(T__10);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitCiteReferences(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CiteReferencesContext citeReferences() throws RecognitionException {
		CiteReferencesContext _localctx = new CiteReferencesContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_citeReferences);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			_la = _input.LA(1);
			if (_la==TILDE) {
				{
				setState(878); 
				match(TILDE);
				}
			}

			setState(881);
			_la = _input.LA(1);
			if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (T__73 - 74)) | (1L << (T__74 - 74)) | (1L << (T__75 - 74)) | (1L << (T__76 - 74)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(885);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__44) {
				{
				{
				setState(882); 
				options();
				}
				}
				setState(887);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(888); 
			match(T__6);
			setState(889); 
			citeReferencesList();
			setState(890); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitCiteReferencesList(this);
			else return visitor.visitChildren(this);
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
			setState(892); 
			citeReference();
			setState(909);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(893); 
				match(T__12);
				setState(897);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(894);
						_la = _input.LA(1);
						if ( !(_la==T__0 || _la==T__1) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						} 
					}
					setState(899);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				}
				setState(900); 
				citeReference();
				setState(904);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0 || _la==T__1) {
					{
					{
					setState(901);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==T__1) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(906);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(911);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitCiteReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CiteReferenceContext citeReference() throws RecognitionException {
		CiteReferenceContext _localctx = new CiteReferenceContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_citeReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (T__101 - 102)) | (1L << (T__102 - 102)) | (1L << (String - 102)) | (1L << (Num - 102)))) != 0)) {
				{
				setState(915);
				switch (_input.LA(1)) {
				case String:
				case Num:
					{
					setState(912); 
					simpleText();
					}
					break;
				case T__101:
					{
					setState(913); 
					lparen();
					}
					break;
				case T__102:
					{
					setState(914); 
					rparen();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(919);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitMeasures(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MeasuresContext measures() throws RecognitionException {
		MeasuresContext _localctx = new MeasuresContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_measures);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920);
			_la = _input.LA(1);
			if ( !(_la==T__77 || _la==T__78) ) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitFigureBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FigureBlockContext figureBlock() throws RecognitionException {
		FigureBlockContext _localctx = new FigureBlockContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_figureBlock);
		int _la;
		try {
			setState(944);
			switch (_input.LA(1)) {
			case T__79:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(922); 
				match(T__79);
				setState(924);
				_la = _input.LA(1);
				if (_la==T__44) {
					{
					setState(923); 
					options();
					}
				}

				setState(929);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__35) | (1L << T__37) | (1L << T__39) | (1L << T__42) | (1L << T__46) | (1L << T__47) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__85 - 64)) | (1L << (T__87 - 64)) | (1L << (T__89 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__110 - 64)) | (1L << (T__112 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__120 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (TILDE - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)))) != 0)) {
					{
					{
					setState(926); 
					memberList();
					}
					}
					setState(931);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(932); 
				match(T__80);
				}
				}
				break;
			case T__81:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(933); 
				match(T__81);
				setState(935);
				_la = _input.LA(1);
				if (_la==T__44) {
					{
					setState(934); 
					options();
					}
				}

				setState(940);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__35) | (1L << T__37) | (1L << T__39) | (1L << T__42) | (1L << T__46) | (1L << T__47) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__85 - 64)) | (1L << (T__87 - 64)) | (1L << (T__89 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__110 - 64)) | (1L << (T__112 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__120 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (TILDE - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)))) != 0)) {
					{
					{
					setState(937); 
					memberList();
					}
					}
					setState(942);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(943); 
				match(T__82);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitSupplementaryFigureBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SupplementaryFigureBlockContext supplementaryFigureBlock() throws RecognitionException {
		SupplementaryFigureBlockContext _localctx = new SupplementaryFigureBlockContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_supplementaryFigureBlock);
		int _la;
		try {
			setState(968);
			switch (_input.LA(1)) {
			case T__83:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(946); 
				match(T__83);
				setState(948);
				_la = _input.LA(1);
				if (_la==T__44) {
					{
					setState(947); 
					options();
					}
				}

				setState(953);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__35) | (1L << T__37) | (1L << T__39) | (1L << T__42) | (1L << T__46) | (1L << T__47) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__85 - 64)) | (1L << (T__87 - 64)) | (1L << (T__89 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__110 - 64)) | (1L << (T__112 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__120 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (TILDE - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)))) != 0)) {
					{
					{
					setState(950); 
					memberList();
					}
					}
					setState(955);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(956); 
				match(T__84);
				}
				}
				break;
			case T__85:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(957); 
				match(T__85);
				setState(959);
				_la = _input.LA(1);
				if (_la==T__44) {
					{
					setState(958); 
					options();
					}
				}

				setState(964);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__35) | (1L << T__37) | (1L << T__39) | (1L << T__42) | (1L << T__46) | (1L << T__47) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__85 - 64)) | (1L << (T__87 - 64)) | (1L << (T__89 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__110 - 64)) | (1L << (T__112 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__120 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (TILDE - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)))) != 0)) {
					{
					{
					setState(961); 
					memberList();
					}
					}
					setState(966);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(967); 
				match(T__86);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitAlgorithmBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlgorithmBlockContext algorithmBlock() throws RecognitionException {
		AlgorithmBlockContext _localctx = new AlgorithmBlockContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_algorithmBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(970); 
			match(T__87);
			setState(972);
			_la = _input.LA(1);
			if (_la==T__44) {
				{
				setState(971); 
				options();
				}
			}

			setState(977);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__35) | (1L << T__37) | (1L << T__39) | (1L << T__42) | (1L << T__46) | (1L << T__47) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__85 - 64)) | (1L << (T__87 - 64)) | (1L << (T__89 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__110 - 64)) | (1L << (T__112 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__120 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (TILDE - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)))) != 0)) {
				{
				{
				setState(974); 
				memberList();
				}
				}
				setState(979);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(980); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitAlgorithmicBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlgorithmicBlockContext algorithmicBlock() throws RecognitionException {
		AlgorithmicBlockContext _localctx = new AlgorithmicBlockContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_algorithmicBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(982); 
			match(T__89);
			setState(984);
			_la = _input.LA(1);
			if (_la==T__44) {
				{
				setState(983); 
				options();
				}
			}

			setState(989);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__35) | (1L << T__37) | (1L << T__39) | (1L << T__42) | (1L << T__46) | (1L << T__47) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__85 - 64)) | (1L << (T__87 - 64)) | (1L << (T__89 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__110 - 64)) | (1L << (T__112 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__120 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (TILDE - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)))) != 0)) {
				{
				{
				setState(986); 
				memberList();
				}
				}
				setState(991);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(992); 
			match(T__90);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(994); 
			match(T__91);
			setState(995); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997); 
			match(T__92);
			setState(998); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000); 
			match(T__93);
			setState(1004);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__32) | (1L << T__33) | (1L << T__37) | (1L << T__39) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__110 - 64)) | (1L << (T__112 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__120 - 64)) | (1L << (T__123 - 64)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (String - 134)) | (1L << (Num - 134)) | (1L << (SUB - 134)) | (1L << (MUL - 134)))) != 0)) {
				{
				{
				setState(1001); 
				textRules();
				}
				}
				setState(1006);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1007); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitForBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForBlockContext forBlock() throws RecognitionException {
		ForBlockContext _localctx = new ForBlockContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_forBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1009); 
			match(T__94);
			setState(1010); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1012); 
			match(T__95);
			setState(1013); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitReturnBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnBlockContext returnBlock() throws RecognitionException {
		ReturnBlockContext _localctx = new ReturnBlockContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_returnBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1015); 
			match(T__96);
			setState(1019);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__32) | (1L << T__33) | (1L << T__37) | (1L << T__39) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__110 - 64)) | (1L << (T__112 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__120 - 64)) | (1L << (T__123 - 64)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (String - 134)) | (1L << (Num - 134)) | (1L << (SUB - 134)) | (1L << (MUL - 134)))) != 0)) {
				{
				{
				setState(1016); 
				textRules();
				}
				}
				setState(1021);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1022); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitUrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UrlContext url() throws RecognitionException {
		UrlContext _localctx = new UrlContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_url);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1024); 
			match(T__97);
			setState(1025); 
			match(T__6);
			setState(1026); 
			urlText();
			setState(1027); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitUrlText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UrlTextContext urlText() throws RecognitionException {
		UrlTextContext _localctx = new UrlTextContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_urlText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1029); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionsContext options() throws RecognitionException {
		OptionsContext _localctx = new OptionsContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1031); 
			match(T__44);
			setState(1035);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (IgnoreAlgorithmKeyWords - 128)) | (1L << (IgnoreUrlPrefix - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (INT - 128)) | (1L << (DOUBLE - 128)) | (1L << (NameChar - 128)) | (1L << (NameStartChar - 128)) | (1L << (ASSIGN - 128)) | (1L << (GT - 128)) | (1L << (LT - 128)) | (1L << (BANG - 128)) | (1L << (TILDE - 128)) | (1L << (QUESTION - 128)) | (1L << (COLON - 128)) | (1L << (EQUAL - 128)) | (1L << (LE - 128)) | (1L << (GE - 128)) | (1L << (NOTEQUAL - 128)) | (1L << (AND - 128)) | (1L << (OR - 128)) | (1L << (INC - 128)) | (1L << (DEC - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)) | (1L << (BITAND - 128)) | (1L << (BITOR - 128)) | (1L << (CARET - 128)) | (1L << (COMMENT - 128)) | (1L << (LINE_COMMENT - 128)) | (1L << (WS - 128)) | (1L << (WORDS_TO_SKIP - 128)) | (1L << (Skip - 128)) | (1L << (Affil - 128)))) != 0)) {
				{
				{
				setState(1032);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==T__45) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(1037);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1038); 
			match(T__45);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitComma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommaContext comma() throws RecognitionException {
		CommaContext _localctx = new CommaContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_comma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1040); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitDot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DotContext dot() throws RecognitionException {
		DotContext _localctx = new DotContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_dot);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitDots(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DotsContext dots() throws RecognitionException {
		DotsContext _localctx = new DotsContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_dots);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitAppos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApposContext appos() throws RecognitionException {
		ApposContext _localctx = new ApposContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_appos);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitLparen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LparenContext lparen() throws RecognitionException {
		LparenContext _localctx = new LparenContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_lparen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048); 
			match(T__101);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitRparen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RparenContext rparen() throws RecognitionException {
		RparenContext _localctx = new RparenContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_rparen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1050); 
			match(T__102);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitDollarBlock(this);
			else return visitor.visitChildren(this);
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
			setState(1052); 
			match(T__15);
			setState(1054);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (IgnoreAlgorithmKeyWords - 128)) | (1L << (IgnoreUrlPrefix - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (INT - 128)) | (1L << (DOUBLE - 128)) | (1L << (NameChar - 128)) | (1L << (NameStartChar - 128)) | (1L << (ASSIGN - 128)) | (1L << (GT - 128)) | (1L << (LT - 128)) | (1L << (BANG - 128)) | (1L << (TILDE - 128)) | (1L << (QUESTION - 128)) | (1L << (COLON - 128)) | (1L << (EQUAL - 128)) | (1L << (LE - 128)) | (1L << (GE - 128)) | (1L << (NOTEQUAL - 128)) | (1L << (AND - 128)) | (1L << (OR - 128)) | (1L << (INC - 128)) | (1L << (DEC - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)) | (1L << (BITAND - 128)) | (1L << (BITOR - 128)) | (1L << (CARET - 128)) | (1L << (COMMENT - 128)) | (1L << (LINE_COMMENT - 128)) | (1L << (WS - 128)) | (1L << (WORDS_TO_SKIP - 128)) | (1L << (Skip - 128)) | (1L << (Affil - 128)))) != 0)) {
				{
				setState(1053);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==T__15) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(1056); 
			match(T__15);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitInlineEquation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineEquationContext inlineEquation() throws RecognitionException {
		InlineEquationContext _localctx = new InlineEquationContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_inlineEquation);
		int _la;
		try {
			setState(1095);
			switch (_input.LA(1)) {
			case T__103:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1058); 
				match(T__103);
				setState(1060); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1059);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__103) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(1062); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (IgnoreAlgorithmKeyWords - 128)) | (1L << (IgnoreUrlPrefix - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (INT - 128)) | (1L << (DOUBLE - 128)) | (1L << (NameChar - 128)) | (1L << (NameStartChar - 128)) | (1L << (ASSIGN - 128)) | (1L << (GT - 128)) | (1L << (LT - 128)) | (1L << (BANG - 128)) | (1L << (TILDE - 128)) | (1L << (QUESTION - 128)) | (1L << (COLON - 128)) | (1L << (EQUAL - 128)) | (1L << (LE - 128)) | (1L << (GE - 128)) | (1L << (NOTEQUAL - 128)) | (1L << (AND - 128)) | (1L << (OR - 128)) | (1L << (INC - 128)) | (1L << (DEC - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)) | (1L << (BITAND - 128)) | (1L << (BITOR - 128)) | (1L << (CARET - 128)) | (1L << (COMMENT - 128)) | (1L << (LINE_COMMENT - 128)) | (1L << (WS - 128)) | (1L << (WORDS_TO_SKIP - 128)) | (1L << (Skip - 128)) | (1L << (Affil - 128)))) != 0) );
				setState(1064); 
				match(T__103);
				}
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(1065); 
				dollarBlock();
				}
				break;
			case T__104:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1066); 
				match(T__104);
				setState(1068); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1067);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__105) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(1070); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (IgnoreAlgorithmKeyWords - 128)) | (1L << (IgnoreUrlPrefix - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (INT - 128)) | (1L << (DOUBLE - 128)) | (1L << (NameChar - 128)) | (1L << (NameStartChar - 128)) | (1L << (ASSIGN - 128)) | (1L << (GT - 128)) | (1L << (LT - 128)) | (1L << (BANG - 128)) | (1L << (TILDE - 128)) | (1L << (QUESTION - 128)) | (1L << (COLON - 128)) | (1L << (EQUAL - 128)) | (1L << (LE - 128)) | (1L << (GE - 128)) | (1L << (NOTEQUAL - 128)) | (1L << (AND - 128)) | (1L << (OR - 128)) | (1L << (INC - 128)) | (1L << (DEC - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)) | (1L << (BITAND - 128)) | (1L << (BITOR - 128)) | (1L << (CARET - 128)) | (1L << (COMMENT - 128)) | (1L << (LINE_COMMENT - 128)) | (1L << (WS - 128)) | (1L << (WORDS_TO_SKIP - 128)) | (1L << (Skip - 128)) | (1L << (Affil - 128)))) != 0) );
				setState(1072); 
				match(T__105);
				}
				}
				break;
			case T__106:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(1073); 
				match(T__106);
				setState(1075); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1074);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__107) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(1077); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (IgnoreAlgorithmKeyWords - 128)) | (1L << (IgnoreUrlPrefix - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (INT - 128)) | (1L << (DOUBLE - 128)) | (1L << (NameChar - 128)) | (1L << (NameStartChar - 128)) | (1L << (ASSIGN - 128)) | (1L << (GT - 128)) | (1L << (LT - 128)) | (1L << (BANG - 128)) | (1L << (TILDE - 128)) | (1L << (QUESTION - 128)) | (1L << (COLON - 128)) | (1L << (EQUAL - 128)) | (1L << (LE - 128)) | (1L << (GE - 128)) | (1L << (NOTEQUAL - 128)) | (1L << (AND - 128)) | (1L << (OR - 128)) | (1L << (INC - 128)) | (1L << (DEC - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)) | (1L << (BITAND - 128)) | (1L << (BITOR - 128)) | (1L << (CARET - 128)) | (1L << (COMMENT - 128)) | (1L << (LINE_COMMENT - 128)) | (1L << (WS - 128)) | (1L << (WORDS_TO_SKIP - 128)) | (1L << (Skip - 128)) | (1L << (Affil - 128)))) != 0) );
				setState(1079); 
				match(T__107);
				}
				}
				break;
			case T__108:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(1080); 
				match(T__108);
				setState(1082); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1081);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__109) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(1084); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (IgnoreAlgorithmKeyWords - 128)) | (1L << (IgnoreUrlPrefix - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (INT - 128)) | (1L << (DOUBLE - 128)) | (1L << (NameChar - 128)) | (1L << (NameStartChar - 128)) | (1L << (ASSIGN - 128)) | (1L << (GT - 128)) | (1L << (LT - 128)) | (1L << (BANG - 128)) | (1L << (TILDE - 128)) | (1L << (QUESTION - 128)) | (1L << (COLON - 128)) | (1L << (EQUAL - 128)) | (1L << (LE - 128)) | (1L << (GE - 128)) | (1L << (NOTEQUAL - 128)) | (1L << (AND - 128)) | (1L << (OR - 128)) | (1L << (INC - 128)) | (1L << (DEC - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)) | (1L << (BITAND - 128)) | (1L << (BITOR - 128)) | (1L << (CARET - 128)) | (1L << (COMMENT - 128)) | (1L << (LINE_COMMENT - 128)) | (1L << (WS - 128)) | (1L << (WORDS_TO_SKIP - 128)) | (1L << (Skip - 128)) | (1L << (Affil - 128)))) != 0) );
				setState(1086); 
				match(T__109);
				}
				}
				break;
			case T__110:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(1087); 
				match(T__110);
				setState(1089); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1088);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__111) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(1091); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (IgnoreAlgorithmKeyWords - 128)) | (1L << (IgnoreUrlPrefix - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (INT - 128)) | (1L << (DOUBLE - 128)) | (1L << (NameChar - 128)) | (1L << (NameStartChar - 128)) | (1L << (ASSIGN - 128)) | (1L << (GT - 128)) | (1L << (LT - 128)) | (1L << (BANG - 128)) | (1L << (TILDE - 128)) | (1L << (QUESTION - 128)) | (1L << (COLON - 128)) | (1L << (EQUAL - 128)) | (1L << (LE - 128)) | (1L << (GE - 128)) | (1L << (NOTEQUAL - 128)) | (1L << (AND - 128)) | (1L << (OR - 128)) | (1L << (INC - 128)) | (1L << (DEC - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)) | (1L << (BITAND - 128)) | (1L << (BITOR - 128)) | (1L << (CARET - 128)) | (1L << (COMMENT - 128)) | (1L << (LINE_COMMENT - 128)) | (1L << (WS - 128)) | (1L << (WORDS_TO_SKIP - 128)) | (1L << (Skip - 128)) | (1L << (Affil - 128)))) != 0) );
				setState(1093); 
				match(T__111);
				}
				}
				break;
			case T__118:
			case T__120:
				enterOuterAlt(_localctx, 7);
				{
				setState(1094); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitEquationBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquationBlockContext equationBlock() throws RecognitionException {
		EquationBlockContext _localctx = new EquationBlockContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_equationBlock);
		int _la;
		try {
			setState(1115);
			switch (_input.LA(1)) {
			case T__112:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1097); 
				match(T__112);
				setState(1098); 
				label();
				setState(1100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1099);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__113) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(1102); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (IgnoreAlgorithmKeyWords - 128)) | (1L << (IgnoreUrlPrefix - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (INT - 128)) | (1L << (DOUBLE - 128)) | (1L << (NameChar - 128)) | (1L << (NameStartChar - 128)) | (1L << (ASSIGN - 128)) | (1L << (GT - 128)) | (1L << (LT - 128)) | (1L << (BANG - 128)) | (1L << (TILDE - 128)) | (1L << (QUESTION - 128)) | (1L << (COLON - 128)) | (1L << (EQUAL - 128)) | (1L << (LE - 128)) | (1L << (GE - 128)) | (1L << (NOTEQUAL - 128)) | (1L << (AND - 128)) | (1L << (OR - 128)) | (1L << (INC - 128)) | (1L << (DEC - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)) | (1L << (BITAND - 128)) | (1L << (BITOR - 128)) | (1L << (CARET - 128)) | (1L << (COMMENT - 128)) | (1L << (LINE_COMMENT - 128)) | (1L << (WS - 128)) | (1L << (WORDS_TO_SKIP - 128)) | (1L << (Skip - 128)) | (1L << (Affil - 128)))) != 0) );
				setState(1104); 
				match(T__113);
				}
				}
				break;
			case T__114:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1106); 
				match(T__114);
				setState(1107); 
				label();
				setState(1109); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1108);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__115) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(1111); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (IgnoreAlgorithmKeyWords - 128)) | (1L << (IgnoreUrlPrefix - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (INT - 128)) | (1L << (DOUBLE - 128)) | (1L << (NameChar - 128)) | (1L << (NameStartChar - 128)) | (1L << (ASSIGN - 128)) | (1L << (GT - 128)) | (1L << (LT - 128)) | (1L << (BANG - 128)) | (1L << (TILDE - 128)) | (1L << (QUESTION - 128)) | (1L << (COLON - 128)) | (1L << (EQUAL - 128)) | (1L << (LE - 128)) | (1L << (GE - 128)) | (1L << (NOTEQUAL - 128)) | (1L << (AND - 128)) | (1L << (OR - 128)) | (1L << (INC - 128)) | (1L << (DEC - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)) | (1L << (BITAND - 128)) | (1L << (BITOR - 128)) | (1L << (CARET - 128)) | (1L << (COMMENT - 128)) | (1L << (LINE_COMMENT - 128)) | (1L << (WS - 128)) | (1L << (WORDS_TO_SKIP - 128)) | (1L << (Skip - 128)) | (1L << (Affil - 128)))) != 0) );
				setState(1113); 
				match(T__115);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitDisplayEquation(this);
			else return visitor.visitChildren(this);
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
			setState(1117); 
			match(T__116);
			setState(1119); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1118);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==T__117) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(1121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (IgnoreAlgorithmKeyWords - 128)) | (1L << (IgnoreUrlPrefix - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (INT - 128)) | (1L << (DOUBLE - 128)) | (1L << (NameChar - 128)) | (1L << (NameStartChar - 128)) | (1L << (ASSIGN - 128)) | (1L << (GT - 128)) | (1L << (LT - 128)) | (1L << (BANG - 128)) | (1L << (TILDE - 128)) | (1L << (QUESTION - 128)) | (1L << (COLON - 128)) | (1L << (EQUAL - 128)) | (1L << (LE - 128)) | (1L << (GE - 128)) | (1L << (NOTEQUAL - 128)) | (1L << (AND - 128)) | (1L << (OR - 128)) | (1L << (INC - 128)) | (1L << (DEC - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)) | (1L << (BITAND - 128)) | (1L << (BITOR - 128)) | (1L << (CARET - 128)) | (1L << (COMMENT - 128)) | (1L << (LINE_COMMENT - 128)) | (1L << (WS - 128)) | (1L << (WORDS_TO_SKIP - 128)) | (1L << (Skip - 128)) | (1L << (Affil - 128)))) != 0) );
			setState(1123); 
			match(T__117);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitEqnArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqnArrayContext eqnArray() throws RecognitionException {
		EqnArrayContext _localctx = new EqnArrayContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_eqnArray);
		int _la;
		try {
			setState(1139);
			switch (_input.LA(1)) {
			case T__118:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1125); 
				match(T__118);
				setState(1127); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1126);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__119) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(1129); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (IgnoreAlgorithmKeyWords - 128)) | (1L << (IgnoreUrlPrefix - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (INT - 128)) | (1L << (DOUBLE - 128)) | (1L << (NameChar - 128)) | (1L << (NameStartChar - 128)) | (1L << (ASSIGN - 128)) | (1L << (GT - 128)) | (1L << (LT - 128)) | (1L << (BANG - 128)) | (1L << (TILDE - 128)) | (1L << (QUESTION - 128)) | (1L << (COLON - 128)) | (1L << (EQUAL - 128)) | (1L << (LE - 128)) | (1L << (GE - 128)) | (1L << (NOTEQUAL - 128)) | (1L << (AND - 128)) | (1L << (OR - 128)) | (1L << (INC - 128)) | (1L << (DEC - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)) | (1L << (BITAND - 128)) | (1L << (BITOR - 128)) | (1L << (CARET - 128)) | (1L << (COMMENT - 128)) | (1L << (LINE_COMMENT - 128)) | (1L << (WS - 128)) | (1L << (WORDS_TO_SKIP - 128)) | (1L << (Skip - 128)) | (1L << (Affil - 128)))) != 0) );
				setState(1131); 
				match(T__119);
				}
				}
				break;
			case T__120:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1132); 
				match(T__120);
				setState(1134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1133);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__121) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(1136); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (IgnoreAlgorithmKeyWords - 128)) | (1L << (IgnoreUrlPrefix - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (INT - 128)) | (1L << (DOUBLE - 128)) | (1L << (NameChar - 128)) | (1L << (NameStartChar - 128)) | (1L << (ASSIGN - 128)) | (1L << (GT - 128)) | (1L << (LT - 128)) | (1L << (BANG - 128)) | (1L << (TILDE - 128)) | (1L << (QUESTION - 128)) | (1L << (COLON - 128)) | (1L << (EQUAL - 128)) | (1L << (LE - 128)) | (1L << (GE - 128)) | (1L << (NOTEQUAL - 128)) | (1L << (AND - 128)) | (1L << (OR - 128)) | (1L << (INC - 128)) | (1L << (DEC - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)) | (1L << (BITAND - 128)) | (1L << (BITOR - 128)) | (1L << (CARET - 128)) | (1L << (COMMENT - 128)) | (1L << (LINE_COMMENT - 128)) | (1L << (WS - 128)) | (1L << (WORDS_TO_SKIP - 128)) | (1L << (Skip - 128)) | (1L << (Affil - 128)))) != 0) );
				setState(1138); 
				match(T__121);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitEqnArrayBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqnArrayBodyContext eqnArrayBody() throws RecognitionException {
		EqnArrayBodyContext _localctx = new EqnArrayBodyContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_eqnArrayBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__120 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (IgnoreAlgorithmKeyWords - 128)) | (1L << (IgnoreUrlPrefix - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (INT - 128)) | (1L << (DOUBLE - 128)) | (1L << (NameChar - 128)) | (1L << (NameStartChar - 128)) | (1L << (ASSIGN - 128)) | (1L << (GT - 128)) | (1L << (LT - 128)) | (1L << (BANG - 128)) | (1L << (TILDE - 128)) | (1L << (QUESTION - 128)) | (1L << (COLON - 128)) | (1L << (EQUAL - 128)) | (1L << (LE - 128)) | (1L << (GE - 128)) | (1L << (NOTEQUAL - 128)) | (1L << (AND - 128)) | (1L << (OR - 128)) | (1L << (INC - 128)) | (1L << (DEC - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)) | (1L << (BITAND - 128)) | (1L << (BITOR - 128)) | (1L << (CARET - 128)) | (1L << (COMMENT - 128)) | (1L << (LINE_COMMENT - 128)) | (1L << (WS - 128)) | (1L << (WORDS_TO_SKIP - 128)) | (1L << (Skip - 128)) | (1L << (Affil - 128)))) != 0)) {
				{
				setState(1143);
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
				case T__117:
				case T__118:
				case T__120:
				case T__122:
				case T__123:
				case T__124:
				case T__125:
				case T__126:
				case T__127:
				case T__128:
				case T__129:
				case T__130:
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
					setState(1141); 
					eqnEquation();
					}
					break;
				case BITAND:
					{
					setState(1142); 
					match(BITAND);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1147);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitEqnEquation(this);
			else return visitor.visitChildren(this);
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
			setState(1149); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1148);
					_la = _input.LA(1);
					if ( _la <= 0 || (((((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & ((1L << (T__119 - 120)) | (1L << (T__121 - 120)) | (1L << (BITAND - 120)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1151); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitNewLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewLineContext newLine() throws RecognitionException {
		NewLineContext _localctx = new NewLineContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_newLine);
		int _la;
		try {
			setState(1155);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1153);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(1154); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitDoubleSlash(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleSlashContext doubleSlash() throws RecognitionException {
		DoubleSlashContext _localctx = new DoubleSlashContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_doubleSlash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1157); 
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

	public static class ReferenceContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1159); 
			match(TILDE);
			setState(1161);
			_la = _input.LA(1);
			if (_la==T__101) {
				{
				setState(1160); 
				match(T__101);
				}
			}

			setState(1163); 
			match(T__122);
			setState(1164); 
			text();
			setState(1165); 
			match(T__10);
			setState(1167);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(1166); 
				match(T__102);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitSimpleText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTextContext simpleText() throws RecognitionException {
		SimpleTextContext _localctx = new SimpleTextContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_simpleText);
		try {
			setState(1171);
			switch (_input.LA(1)) {
			case String:
				enterOuterAlt(_localctx, 1);
				{
				setState(1169); 
				match(String);
				}
				break;
			case Num:
				enterOuterAlt(_localctx, 2);
				{
				setState(1170); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1173); 
			numbers();
			setState(1174); 
			match(SUB);
			setState(1175); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitNumbers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumbersContext numbers() throws RecognitionException {
		NumbersContext _localctx = new NumbersContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_numbers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1177); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitArabic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArabicContext arabic() throws RecognitionException {
		ArabicContext _localctx = new ArabicContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_arabic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1179); 
			match(T__123);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitSpecialCharacters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialCharactersContext specialCharacters() throws RecognitionException {
		SpecialCharactersContext _localctx = new SpecialCharactersContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_specialCharacters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1181);
			_la = _input.LA(1);
			if ( !(((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & ((1L << (T__124 - 125)) | (1L << (T__125 - 125)) | (1L << (T__126 - 125)) | (1L << (T__127 - 125)) | (1L << (T__128 - 125)) | (1L << (T__129 - 125)))) != 0)) ) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitIfThenElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenElseContext ifThenElse() throws RecognitionException {
		IfThenElseContext _localctx = new IfThenElseContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_ifThenElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1183); 
			match(T__130);
			setState(1184); 
			block();
			setState(1185); 
			block();
			setState(1186); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitIfThenText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenTextContext ifThenText() throws RecognitionException {
		IfThenTextContext _localctx = new IfThenTextContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_ifThenText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__10) | (1L << T__32))) != 0) || _la==String || _la==Num) {
				{
				setState(1192);
				switch (_input.LA(1)) {
				case String:
				case Num:
					{
					setState(1188); 
					simpleText();
					}
					break;
				case T__32:
					{
					setState(1189); 
					match(T__32);
					}
					break;
				case T__6:
					{
					setState(1190); 
					match(T__6);
					}
					break;
				case T__10:
					{
					setState(1191); 
					match(T__10);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1196);
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

	public static class IsoEntContext extends ParserRuleContext {
		public IsoEntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isoEnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterIsoEnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitIsoEnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitIsoEnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsoEntContext isoEnt() throws RecognitionException {
		IsoEntContext _localctx = new IsoEntContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_isoEnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00a8\u04b2\4\2\t"+
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
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\3\2\7\2\u00cc\n\2\f\2\16\2\u00cf\13"+
		"\2\3\2\3\2\7\2\u00d3\n\2\f\2\16\2\u00d6\13\2\3\2\3\2\3\3\3\3\7\3\u00dc"+
		"\n\3\f\3\16\3\u00df\13\3\3\3\3\3\7\3\u00e3\n\3\f\3\16\3\u00e6\13\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\5\7\5\u00f0\n\5\f\5\16\5\u00f3\13\5\3\5\3\5"+
		"\3\6\7\6\u00f8\n\6\f\6\16\6\u00fb\13\6\3\6\3\6\7\6\u00ff\n\6\f\6\16\6"+
		"\u0102\13\6\3\6\3\6\7\6\u0106\n\6\f\6\16\6\u0109\13\6\3\6\6\6\u010c\n"+
		"\6\r\6\16\6\u010d\3\7\3\7\3\7\7\7\u0113\n\7\f\7\16\7\u0116\13\7\3\7\3"+
		"\7\7\7\u011a\n\7\f\7\16\7\u011d\13\7\3\7\5\7\u0120\n\7\3\7\3\7\3\7\3\7"+
		"\7\7\u0126\n\7\f\7\16\7\u0129\13\7\3\7\3\7\7\7\u012d\n\7\f\7\16\7\u0130"+
		"\13\7\3\7\5\7\u0133\n\7\3\b\3\b\3\b\3\b\7\b\u0139\n\b\f\b\16\b\u013c\13"+
		"\b\3\b\7\b\u013f\n\b\f\b\16\b\u0142\13\b\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u014a"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\6\n\u0151\n\n\r\n\16\n\u0152\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0160\n\f\f\f\16\f\u0163\13\f\3\r\7\r"+
		"\u0166\n\r\f\r\16\r\u0169\13\r\3\16\3\16\7\16\u016d\n\16\f\16\16\16\u0170"+
		"\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u018e\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\6\21\u01a4\n\21\r\21"+
		"\16\21\u01a5\3\21\3\21\3\21\3\21\3\21\5\21\u01ad\n\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\5\22\u01b7\n\22\3\23\3\23\3\23\7\23\u01bc\n\23"+
		"\f\23\16\23\u01bf\13\23\3\23\3\23\3\23\3\23\7\23\u01c5\n\23\f\23\16\23"+
		"\u01c8\13\23\3\23\5\23\u01cb\n\23\3\24\3\24\7\24\u01cf\n\24\f\24\16\24"+
		"\u01d2\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01dd\n"+
		"\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\7"+
		"\31\u01ec\n\31\f\31\16\31\u01ef\13\31\3\31\3\31\3\31\5\31\u01f4\n\31\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\7\33\u01fe\n\33\f\33\16\33\u0201"+
		"\13\33\3\33\3\33\3\34\6\34\u0206\n\34\r\34\16\34\u0207\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\7\35\u0211\n\35\f\35\16\35\u0214\13\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\37\3\37\7\37\u021d\n\37\f\37\16\37\u0220\13\37\3\37"+
		"\3\37\3\37\7\37\u0225\n\37\f\37\16\37\u0228\13\37\3\37\5\37\u022b\n\37"+
		"\3 \3 \3 \3 \3 \7 \u0232\n \f \16 \u0235\13 \3 \3 \3!\3!\7!\u023b\n!\f"+
		"!\16!\u023e\13!\3!\3!\3!\3!\3!\3!\3!\5!\u0247\n!\3\"\7\"\u024a\n\"\f\""+
		"\16\"\u024d\13\"\3#\7#\u0250\n#\f#\16#\u0253\13#\3#\3#\7#\u0257\n#\f#"+
		"\16#\u025a\13#\3$\3$\3$\3$\3%\7%\u0261\n%\f%\16%\u0264\13%\3&\7&\u0267"+
		"\n&\f&\16&\u026a\13&\3&\3&\3&\7&\u026f\n&\f&\16&\u0272\13&\3\'\3\'\7\'"+
		"\u0276\n\'\f\'\16\'\u0279\13\'\3\'\3\'\3(\3(\5(\u027f\n(\3(\7(\u0282\n"+
		"(\f(\16(\u0285\13(\3(\3(\3)\3)\5)\u028b\n)\3)\7)\u028e\n)\f)\16)\u0291"+
		"\13)\3)\7)\u0294\n)\f)\16)\u0297\13)\3)\7)\u029a\n)\f)\16)\u029d\13)\3"+
		")\3)\7)\u02a1\n)\f)\16)\u02a4\13)\3)\3)\7)\u02a8\n)\f)\16)\u02ab\13)\3"+
		")\3)\7)\u02af\n)\f)\16)\u02b2\13)\3)\3)\7)\u02b6\n)\f)\16)\u02b9\13)\3"+
		")\7)\u02bc\n)\f)\16)\u02bf\13)\3)\7)\u02c2\n)\f)\16)\u02c5\13)\3)\3)\3"+
		"*\3*\3*\3+\3+\3+\7+\u02cf\n+\f+\16+\u02d2\13+\3+\3+\7+\u02d6\n+\f+\16"+
		"+\u02d9\13+\3+\3+\3+\5+\u02de\n+\6+\u02e0\n+\r+\16+\u02e1\3+\3+\3,\3,"+
		"\6,\u02e8\n,\r,\16,\u02e9\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\5.\u02f6\n.\3"+
		"/\3/\3/\7/\u02fb\n/\f/\16/\u02fe\13/\3\60\5\60\u0301\n\60\3\60\3\60\5"+
		"\60\u0305\n\60\3\61\3\61\3\61\3\61\3\61\5\61\u030c\n\61\3\62\3\62\7\62"+
		"\u0310\n\62\f\62\16\62\u0313\13\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0322\n\63\3\64\3\64\7\64\u0326\n"+
		"\64\f\64\16\64\u0329\13\64\3\64\3\64\3\65\3\65\5\65\u032f\n\65\3\66\3"+
		"\66\7\66\u0333\n\66\f\66\16\66\u0336\13\66\3\66\3\66\3\66\7\66\u033b\n"+
		"\66\f\66\16\66\u033e\13\66\3\66\3\66\5\66\u0342\n\66\5\66\u0344\n\66\3"+
		"\67\3\67\3\67\3\67\5\67\u034a\n\67\38\38\38\38\39\39\79\u0352\n9\f9\16"+
		"9\u0355\139\39\39\3:\3:\3:\5:\u035c\n:\3:\3:\3:\3;\3;\3;\5;\u0364\n;\3"+
		";\3;\3;\3<\3<\3<\5<\u036c\n<\3<\3<\3<\3=\5=\u0372\n=\3=\3=\7=\u0376\n"+
		"=\f=\16=\u0379\13=\3=\3=\3=\3=\3>\3>\3>\7>\u0382\n>\f>\16>\u0385\13>\3"+
		">\3>\7>\u0389\n>\f>\16>\u038c\13>\7>\u038e\n>\f>\16>\u0391\13>\3?\3?\3"+
		"?\7?\u0396\n?\f?\16?\u0399\13?\3@\3@\3A\3A\5A\u039f\nA\3A\7A\u03a2\nA"+
		"\fA\16A\u03a5\13A\3A\3A\3A\5A\u03aa\nA\3A\7A\u03ad\nA\fA\16A\u03b0\13"+
		"A\3A\5A\u03b3\nA\3B\3B\5B\u03b7\nB\3B\7B\u03ba\nB\fB\16B\u03bd\13B\3B"+
		"\3B\3B\5B\u03c2\nB\3B\7B\u03c5\nB\fB\16B\u03c8\13B\3B\5B\u03cb\nB\3C\3"+
		"C\5C\u03cf\nC\3C\7C\u03d2\nC\fC\16C\u03d5\13C\3C\3C\3D\3D\5D\u03db\nD"+
		"\3D\7D\u03de\nD\fD\16D\u03e1\13D\3D\3D\3E\3E\3E\3F\3F\3F\3G\3G\7G\u03ed"+
		"\nG\fG\16G\u03f0\13G\3G\3G\3H\3H\3H\3I\3I\3I\3J\3J\7J\u03fc\nJ\fJ\16J"+
		"\u03ff\13J\3J\3J\3K\3K\3K\3K\3K\3L\3L\3M\3M\7M\u040c\nM\fM\16M\u040f\13"+
		"M\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\5T\u0421\nT\3T\3T\3"+
		"U\3U\6U\u0427\nU\rU\16U\u0428\3U\3U\3U\3U\6U\u042f\nU\rU\16U\u0430\3U"+
		"\3U\3U\6U\u0436\nU\rU\16U\u0437\3U\3U\3U\6U\u043d\nU\rU\16U\u043e\3U\3"+
		"U\3U\6U\u0444\nU\rU\16U\u0445\3U\3U\5U\u044a\nU\3V\3V\3V\6V\u044f\nV\r"+
		"V\16V\u0450\3V\3V\3V\3V\3V\6V\u0458\nV\rV\16V\u0459\3V\3V\5V\u045e\nV"+
		"\3W\3W\6W\u0462\nW\rW\16W\u0463\3W\3W\3X\3X\6X\u046a\nX\rX\16X\u046b\3"+
		"X\3X\3X\6X\u0471\nX\rX\16X\u0472\3X\5X\u0476\nX\3Y\3Y\7Y\u047a\nY\fY\16"+
		"Y\u047d\13Y\3Z\6Z\u0480\nZ\rZ\16Z\u0481\3[\3[\5[\u0486\n[\3\\\3\\\3]\3"+
		"]\5]\u048c\n]\3]\3]\3]\3]\5]\u0492\n]\3^\3^\5^\u0496\n^\3_\3_\3_\3_\3"+
		"`\3`\3a\3a\3b\3b\3c\3c\3c\3c\3c\3d\3d\3d\3d\7d\u04ab\nd\fd\16d\u04ae\13"+
		"d\3e\3e\3e\2\2f\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\2\31\3\2\3\4\3\2\20\21"+
		"\3\2\r\r\4\2\n\n;<\3\2FG\3\2HI\3\2JK\3\2LO\3\2PQ\3\2\60\60\3\2\22\22\3"+
		"\2jj\3\2ll\3\2nn\3\2pp\3\2rr\3\2tt\3\2vv\3\2xx\3\2zz\3\2||\5\2zz||\u00a0"+
		"\u00a0\3\2\177\u0084\u0519\2\u00cd\3\2\2\2\4\u00d9\3\2\2\2\6\u00ea\3\2"+
		"\2\2\b\u00ec\3\2\2\2\n\u00f9\3\2\2\2\f\u010f\3\2\2\2\16\u0134\3\2\2\2"+
		"\20\u0145\3\2\2\2\22\u014b\3\2\2\2\24\u0156\3\2\2\2\26\u0158\3\2\2\2\30"+
		"\u0167\3\2\2\2\32\u016a\3\2\2\2\34\u018d\3\2\2\2\36\u018f\3\2\2\2 \u01ac"+
		"\3\2\2\2\"\u01b6\3\2\2\2$\u01ca\3\2\2\2&\u01cc\3\2\2\2(\u01dc\3\2\2\2"+
		"*\u01de\3\2\2\2,\u01e1\3\2\2\2.\u01e6\3\2\2\2\60\u01f3\3\2\2\2\62\u01f5"+
		"\3\2\2\2\64\u01f8\3\2\2\2\66\u0205\3\2\2\28\u020b\3\2\2\2:\u0217\3\2\2"+
		"\2<\u022a\3\2\2\2>\u022c\3\2\2\2@\u0246\3\2\2\2B\u024b\3\2\2\2D\u0251"+
		"\3\2\2\2F\u025b\3\2\2\2H\u0262\3\2\2\2J\u0268\3\2\2\2L\u0273\3\2\2\2N"+
		"\u027c\3\2\2\2P\u0288\3\2\2\2R\u02c8\3\2\2\2T\u02cb\3\2\2\2V\u02e5\3\2"+
		"\2\2X\u02ed\3\2\2\2Z\u02f1\3\2\2\2\\\u02f7\3\2\2\2^\u0300\3\2\2\2`\u030b"+
		"\3\2\2\2b\u030d\3\2\2\2d\u0321\3\2\2\2f\u0323\3\2\2\2h\u032e\3\2\2\2j"+
		"\u0343\3\2\2\2l\u0349\3\2\2\2n\u034b\3\2\2\2p\u034f\3\2\2\2r\u0358\3\2"+
		"\2\2t\u0360\3\2\2\2v\u0368\3\2\2\2x\u0371\3\2\2\2z\u037e\3\2\2\2|\u0397"+
		"\3\2\2\2~\u039a\3\2\2\2\u0080\u03b2\3\2\2\2\u0082\u03ca\3\2\2\2\u0084"+
		"\u03cc\3\2\2\2\u0086\u03d8\3\2\2\2\u0088\u03e4\3\2\2\2\u008a\u03e7\3\2"+
		"\2\2\u008c\u03ea\3\2\2\2\u008e\u03f3\3\2\2\2\u0090\u03f6\3\2\2\2\u0092"+
		"\u03f9\3\2\2\2\u0094\u0402\3\2\2\2\u0096\u0407\3\2\2\2\u0098\u0409\3\2"+
		"\2\2\u009a\u0412\3\2\2\2\u009c\u0414\3\2\2\2\u009e\u0416\3\2\2\2\u00a0"+
		"\u0418\3\2\2\2\u00a2\u041a\3\2\2\2\u00a4\u041c\3\2\2\2\u00a6\u041e\3\2"+
		"\2\2\u00a8\u0449\3\2\2\2\u00aa\u045d\3\2\2\2\u00ac\u045f\3\2\2\2\u00ae"+
		"\u0475\3\2\2\2\u00b0\u047b\3\2\2\2\u00b2\u047f\3\2\2\2\u00b4\u0485\3\2"+
		"\2\2\u00b6\u0487\3\2\2\2\u00b8\u0489\3\2\2\2\u00ba\u0495\3\2\2\2\u00bc"+
		"\u0497\3\2\2\2\u00be\u049b\3\2\2\2\u00c0\u049d\3\2\2\2\u00c2\u049f\3\2"+
		"\2\2\u00c4\u04a1\3\2\2\2\u00c6\u04ac\3\2\2\2\u00c8\u04af\3\2\2\2\u00ca"+
		"\u00cc\t\2\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2"+
		"\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0"+
		"\u00d4\5\4\3\2\u00d1\u00d3\t\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2"+
		"\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d7\u00d8\7\2\2\3\u00d8\3\3\2\2\2\u00d9\u00dd\7\5\2\2"+
		"\u00da\u00dc\t\2\2\2\u00db\u00da\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db"+
		"\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0"+
		"\u00e4\5\b\5\2\u00e1\u00e3\t\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2"+
		"\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e7\u00e8\5\6\4\2\u00e8\u00e9\7\6\2\2\u00e9\5\3\2\2\2"+
		"\u00ea\u00eb\5\30\r\2\u00eb\7\3\2\2\2\u00ec\u00ed\7\7\2\2\u00ed\u00f1"+
		"\5\n\6\2\u00ee\u00f0\5\32\16\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2"+
		"\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f1"+
		"\3\2\2\2\u00f4\u00f5\7\b\2\2\u00f5\t\3\2\2\2\u00f6\u00f8\t\2\2\2\u00f7"+
		"\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2"+
		"\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u0100\5\f\7\2\u00fd"+
		"\u00ff\t\2\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2"+
		"\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u0100\3\2\2\2\u0103"+
		"\u0107\5\16\b\2\u0104\u0106\t\2\2\2\u0105\u0104\3\2\2\2\u0106\u0109\3"+
		"\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010b\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u010a\u010c\5\26\f\2\u010b\u010a\3\2\2\2\u010c\u010d\3"+
		"\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\13\3\2\2\2\u010f"+
		"\u0110\7\t\2\2\u0110\u0114\7\n\2\2\u0111\u0113\t\2\2\2\u0112\u0111\3\2"+
		"\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0117\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u011b\7\13\2\2\u0118\u011a\t"+
		"\2\2\2\u0119\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0120\7\f"+
		"\2\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u0122\7\t\2\2\u0122\u0123\5&\24\2\u0123\u0127\7\r\2\2\u0124\u0126\t\2"+
		"\2\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\u012a\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012e\7\r"+
		"\2\2\u012b\u012d\t\2\2\2\u012c\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2"+
		"\2\2\u0131\u0133\7\f\2\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\r\3\2\2\2\u0134\u0135\7\16\2\2\u0135\u013a\5\20\t\2\u0136\u0137\7\17"+
		"\2\2\u0137\u0139\5\20\t\2\u0138\u0136\3\2\2\2\u0139\u013c\3\2\2\2\u013a"+
		"\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u0140\3\2\2\2\u013c\u013a\3\2"+
		"\2\2\u013d\u013f\t\2\2\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2\2\2\u0140"+
		"\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143\3\2\2\2\u0142\u0140\3\2"+
		"\2\2\u0143\u0144\7\16\2\2\u0144\17\3\2\2\2\u0145\u0146\5\24\13\2\u0146"+
		"\u0147\t\3\2\2\u0147\u0149\5\22\n\2\u0148\u014a\7\22\2\2\u0149\u0148\3"+
		"\2\2\2\u0149\u014a\3\2\2\2\u014a\21\3\2\2\2\u014b\u0150\7\t\2\2\u014c"+
		"\u0151\5\u00be`\2\u014d\u0151\7\u009f\2\2\u014e\u0151\5\u00c2b\2\u014f"+
		"\u0151\7\17\2\2\u0150\u014c\3\2\2\2\u0150\u014d\3\2\2\2\u0150\u014e\3"+
		"\2\2\2\u0150\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0150\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\7\r\2\2\u0155\23\3\2\2"+
		"\2\u0156\u0157\5&\24\2\u0157\25\3\2\2\2\u0158\u0159\7\23\2\2\u0159\u015a"+
		"\7\t\2\2\u015a\u015b\5\u00be`\2\u015b\u015c\7\r\2\2\u015c\u015d\5&\24"+
		"\2\u015d\u0161\7\16\2\2\u015e\u0160\t\2\2\2\u015f\u015e\3\2\2\2\u0160"+
		"\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\27\3\2\2"+
		"\2\u0163\u0161\3\2\2\2\u0164\u0166\5\32\16\2\u0165\u0164\3\2\2\2\u0166"+
		"\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\31\3\2\2"+
		"\2\u0169\u0167\3\2\2\2\u016a\u016e\5\34\17\2\u016b\u016d\5\34\17\2\u016c"+
		"\u016b\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2"+
		"\2\2\u016f\33\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u018e\5\u00c2b\2\u0172"+
		"\u018e\5\62\32\2\u0173\u018e\5P)\2\u0174\u018e\5\60\31\2\u0175\u018e\5"+
		" \21\2\u0176\u018e\5\u0080A\2\u0177\u018e\5\u0082B\2\u0178\u018e\5\u0084"+
		"C\2\u0179\u018e\5\u0086D\2\u017a\u018e\5\u0088E\2\u017b\u018e\5\u008a"+
		"F\2\u017c\u018e\5\u008cG\2\u017d\u018e\5\u008eH\2\u017e\u018e\5\u0090"+
		"I\2\u017f\u018e\5\u0092J\2\u0180\u018e\5N(\2\u0181\u018e\5> \2\u0182\u018e"+
		"\5,\27\2\u0183\u018e\5F$\2\u0184\u018e\5r:\2\u0185\u018e\5t;\2\u0186\u018e"+
		"\5v<\2\u0187\u018e\58\35\2\u0188\u018e\5x=\2\u0189\u018e\5\u00b8]\2\u018a"+
		"\u018e\5\u00b4[\2\u018b\u018e\5\u0094K\2\u018c\u018e\5\u00c4c\2\u018d"+
		"\u0171\3\2\2\2\u018d\u0172\3\2\2\2\u018d\u0173\3\2\2\2\u018d\u0174\3\2"+
		"\2\2\u018d\u0175\3\2\2\2\u018d\u0176\3\2\2\2\u018d\u0177\3\2\2\2\u018d"+
		"\u0178\3\2\2\2\u018d\u0179\3\2\2\2\u018d\u017a\3\2\2\2\u018d\u017b\3\2"+
		"\2\2\u018d\u017c\3\2\2\2\u018d\u017d\3\2\2\2\u018d\u017e\3\2\2\2\u018d"+
		"\u017f\3\2\2\2\u018d\u0180\3\2\2\2\u018d\u0181\3\2\2\2\u018d\u0182\3\2"+
		"\2\2\u018d\u0183\3\2\2\2\u018d\u0184\3\2\2\2\u018d\u0185\3\2\2\2\u018d"+
		"\u0186\3\2\2\2\u018d\u0187\3\2\2\2\u018d\u0188\3\2\2\2\u018d\u0189\3\2"+
		"\2\2\u018d\u018a\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018c\3\2\2\2\u018e"+
		"\35\3\2\2\2\u018f\u0190\7\24\2\2\u0190\u0191\5\32\16\2\u0191\u0192\7\25"+
		"\2\2\u0192\37\3\2\2\2\u0193\u01ad\5\u00a6T\2\u0194\u01ad\5\"\22\2\u0195"+
		"\u01ad\5\36\20\2\u0196\u01ad\5\u00a8U\2\u0197\u01ad\5\u00aaV\2\u0198\u01ad"+
		"\5\u00acW\2\u0199\u01ad\5$\23\2\u019a\u01ad\5@!\2\u019b\u01ad\5n8\2\u019c"+
		"\u01ad\5p9\2\u019d\u01ad\5*\26\2\u019e\u01ad\5<\37\2\u019f\u01ad\5`\61"+
		"\2\u01a0\u01ad\5\u00bc_\2\u01a1\u01ad\5~@\2\u01a2\u01a4\5\u00ba^\2\u01a3"+
		"\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2"+
		"\2\2\u01a6\u01ad\3\2\2\2\u01a7\u01ad\5\u00c0a\2\u01a8\u01ad\5:\36\2\u01a9"+
		"\u01ad\5Z.\2\u01aa\u01ad\5\u009eP\2\u01ab\u01ad\5\u009aN\2\u01ac\u0193"+
		"\3\2\2\2\u01ac\u0194\3\2\2\2\u01ac\u0195\3\2\2\2\u01ac\u0196\3\2\2\2\u01ac"+
		"\u0197\3\2\2\2\u01ac\u0198\3\2\2\2\u01ac\u0199\3\2\2\2\u01ac\u019a\3\2"+
		"\2\2\u01ac\u019b\3\2\2\2\u01ac\u019c\3\2\2\2\u01ac\u019d\3\2\2\2\u01ac"+
		"\u019e\3\2\2\2\u01ac\u019f\3\2\2\2\u01ac\u01a0\3\2\2\2\u01ac\u01a1\3\2"+
		"\2\2\u01ac\u01a3\3\2\2\2\u01ac\u01a7\3\2\2\2\u01ac\u01a8\3\2\2\2\u01ac"+
		"\u01a9\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ab\3\2\2\2\u01ad!\3\2\2\2"+
		"\u01ae\u01b7\5\u009cO\2\u01af\u01b7\5\u00a0Q\2\u01b0\u01b7\5\u00a2R\2"+
		"\u01b1\u01b7\5\u00a4S\2\u01b2\u01b7\7\u009e\2\2\u01b3\u01b7\7\26\2\2\u01b4"+
		"\u01b7\7\u009f\2\2\u01b5\u01b7\7\27\2\2\u01b6\u01ae\3\2\2\2\u01b6\u01af"+
		"\3\2\2\2\u01b6\u01b0\3\2\2\2\u01b6\u01b1\3\2\2\2\u01b6\u01b2\3\2\2\2\u01b6"+
		"\u01b3\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b5\3\2\2\2\u01b7#\3\2\2\2"+
		"\u01b8\u01b9\7\30\2\2\u01b9\u01bd\7\t\2\2\u01ba\u01bc\5\32\16\2\u01bb"+
		"\u01ba\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2"+
		"\2\2\u01be\u01c0\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01cb\7\r\2\2\u01c1"+
		"\u01c2\7\31\2\2\u01c2\u01c6\7\t\2\2\u01c3\u01c5\5\32\16\2\u01c4\u01c3"+
		"\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7"+
		"\u01c9\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01cb\7\r\2\2\u01ca\u01b8\3\2"+
		"\2\2\u01ca\u01c1\3\2\2\2\u01cb%\3\2\2\2\u01cc\u01d0\5(\25\2\u01cd\u01cf"+
		"\5(\25\2\u01ce\u01cd\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0"+
		"\u01d1\3\2\2\2\u01d1\'\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01dd\5.\30\2"+
		"\u01d4\u01dd\5`\61\2\u01d5\u01dd\5\u00ba^\2\u01d6\u01dd\5\"\22\2\u01d7"+
		"\u01dd\5\u00a6T\2\u01d8\u01dd\5<\37\2\u01d9\u01dd\5\u009aN\2\u01da\u01dd"+
		"\5\u0094K\2\u01db\u01dd\t\2\2\2\u01dc\u01d3\3\2\2\2\u01dc\u01d4\3\2\2"+
		"\2\u01dc\u01d5\3\2\2\2\u01dc\u01d6\3\2\2\2\u01dc\u01d7\3\2\2\2\u01dc\u01d8"+
		"\3\2\2\2\u01dc\u01d9\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01db\3\2\2\2\u01dd"+
		")\3\2\2\2\u01de\u01df\7\32\2\2\u01df\u01e0\5<\37\2\u01e0+\3\2\2\2\u01e1"+
		"\u01e2\7\33\2\2\u01e2\u01e3\7\t\2\2\u01e3\u01e4\5&\24\2\u01e4\u01e5\7"+
		"\r\2\2\u01e5-\3\2\2\2\u01e6\u01e7\7\34\2\2\u01e7\u01e8\5<\37\2\u01e8/"+
		"\3\2\2\2\u01e9\u01ed\7\35\2\2\u01ea\u01ec\5\32\16\2\u01eb\u01ea\3\2\2"+
		"\2\u01ec\u01ef\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01f0"+
		"\3\2\2\2\u01ef\u01ed\3\2\2\2\u01f0\u01f4\7\36\2\2\u01f1\u01f2\7\37\2\2"+
		"\u01f2\u01f4\5<\37\2\u01f3\u01e9\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4\61"+
		"\3\2\2\2\u01f5\u01f6\7 \2\2\u01f6\u01f7\5<\37\2\u01f7\63\3\2\2\2\u01f8"+
		"\u01f9\7!\2\2\u01f9\u01fa\7\t\2\2\u01fa\u01fb\5:\36\2\u01fb\u01ff\7\r"+
		"\2\2\u01fc\u01fe\5\u0098M\2\u01fd\u01fc\3\2\2\2\u01fe\u0201\3\2\2\2\u01ff"+
		"\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0202\3\2\2\2\u0201\u01ff\3\2"+
		"\2\2\u0202\u0203\5\66\34\2\u0203\65\3\2\2\2\u0204\u0206\n\2\2\2\u0205"+
		"\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2"+
		"\2\2\u0208\u0209\3\2\2\2\u0209\u020a\t\2\2\2\u020a\67\3\2\2\2\u020b\u020c"+
		"\7\"\2\2\u020c\u020d\7\t\2\2\u020d\u020e\5:\36\2\u020e\u0212\7\r\2\2\u020f"+
		"\u0211\5\u0098M\2\u0210\u020f\3\2\2\2\u0211\u0214\3\2\2\2\u0212\u0210"+
		"\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0215\3\2\2\2\u0214\u0212\3\2\2\2\u0215"+
		"\u0216\5\66\34\2\u02169\3\2\2\2\u0217\u0218\7#\2\2\u0218\u0219\5\u00ba"+
		"^\2\u0219;\3\2\2\2\u021a\u021e\7\t\2\2\u021b\u021d\5\32\16\2\u021c\u021b"+
		"\3\2\2\2\u021d\u0220\3\2\2\2\u021e\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021f"+
		"\u0221\3\2\2\2\u0220\u021e\3\2\2\2\u0221\u022b\7\r\2\2\u0222\u0226\7$"+
		"\2\2\u0223\u0225\5\32\16\2\u0224\u0223\3\2\2\2\u0225\u0228\3\2\2\2\u0226"+
		"\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0229\3\2\2\2\u0228\u0226\3\2"+
		"\2\2\u0229\u022b\7%\2\2\u022a\u021a\3\2\2\2\u022a\u0222\3\2\2\2\u022b"+
		"=\3\2\2\2\u022c\u022d\7&\2\2\u022d\u022e\7\t\2\2\u022e\u022f\7\u008a\2"+
		"\2\u022f\u0233\7\r\2\2\u0230\u0232\5\32\16\2\u0231\u0230\3\2\2\2\u0232"+
		"\u0235\3\2\2\2\u0233\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0236\3\2"+
		"\2\2\u0235\u0233\3\2\2\2\u0236\u0237\7\'\2\2\u0237?\3\2\2\2\u0238\u023c"+
		"\7(\2\2\u0239\u023b\5\u0098M\2\u023a\u0239\3\2\2\2\u023b\u023e\3\2\2\2"+
		"\u023c\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023f\3\2\2\2\u023e\u023c"+
		"\3\2\2\2\u023f\u0240\5B\"\2\u0240\u0241\7)\2\2\u0241\u0247\3\2\2\2\u0242"+
		"\u0243\7*\2\2\u0243\u0244\5B\"\2\u0244\u0245\7+\2\2\u0245\u0247\3\2\2"+
		"\2\u0246\u0238\3\2\2\2\u0246\u0242\3\2\2\2\u0247A\3\2\2\2\u0248\u024a"+
		"\5D#\2\u0249\u0248\3\2\2\2\u024a\u024d\3\2\2\2\u024b\u0249\3\2\2\2\u024b"+
		"\u024c\3\2\2\2\u024cC\3\2\2\2\u024d\u024b\3\2\2\2\u024e\u0250\t\2\2\2"+
		"\u024f\u024e\3\2\2\2\u0250\u0253\3\2\2\2\u0251\u024f\3\2\2\2\u0251\u0252"+
		"\3\2\2\2\u0252\u0254\3\2\2\2\u0253\u0251\3\2\2\2\u0254\u0258\7,\2\2\u0255"+
		"\u0257\5\32\16\2\u0256\u0255\3\2\2\2\u0257\u025a\3\2\2\2\u0258\u0256\3"+
		"\2\2\2\u0258\u0259\3\2\2\2\u0259E\3\2\2\2\u025a\u0258\3\2\2\2\u025b\u025c"+
		"\7-\2\2\u025c\u025d\5H%\2\u025d\u025e\7.\2\2\u025eG\3\2\2\2\u025f\u0261"+
		"\5J&\2\u0260\u025f\3\2\2\2\u0261\u0264\3\2\2\2\u0262\u0260\3\2\2\2\u0262"+
		"\u0263\3\2\2\2\u0263I\3\2\2\2\u0264\u0262\3\2\2\2\u0265\u0267\t\2\2\2"+
		"\u0266\u0265\3\2\2\2\u0267\u026a\3\2\2\2\u0268\u0266\3\2\2\2\u0268\u0269"+
		"\3\2\2\2\u0269\u026b\3\2\2\2\u026a\u0268\3\2\2\2\u026b\u026c\7,\2\2\u026c"+
		"\u0270\5L\'\2\u026d\u026f\5\32\16\2\u026e\u026d\3\2\2\2\u026f\u0272\3"+
		"\2\2\2\u0270\u026e\3\2\2\2\u0270\u0271\3\2\2\2\u0271K\3\2\2\2\u0272\u0270"+
		"\3\2\2\2\u0273\u0277\7/\2\2\u0274\u0276\5\32\16\2\u0275\u0274\3\2\2\2"+
		"\u0276\u0279\3\2\2\2\u0277\u0275\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u027a"+
		"\3\2\2\2\u0279\u0277\3\2\2\2\u027a\u027b\7\60\2\2\u027bM\3\2\2\2\u027c"+
		"\u027e\7\61\2\2\u027d\u027f\5\u0098M\2\u027e\u027d\3\2\2\2\u027e\u027f"+
		"\3\2\2\2\u027f\u0283\3\2\2\2\u0280\u0282\5\u00b4[\2\u0281\u0280\3\2\2"+
		"\2\u0282\u0285\3\2\2\2\u0283\u0281\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0286"+
		"\3\2\2\2\u0285\u0283\3\2\2\2\u0286\u0287\5<\37\2\u0287O\3\2\2\2\u0288"+
		"\u028a\7\62\2\2\u0289\u028b\5\u0098M\2\u028a\u0289\3\2\2\2\u028a\u028b"+
		"\3\2\2\2\u028b\u028f\3\2\2\2\u028c\u028e\t\2\2\2\u028d\u028c\3\2\2\2\u028e"+
		"\u0291\3\2\2\2\u028f\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0295\3\2"+
		"\2\2\u0291\u028f\3\2\2\2\u0292\u0294\7\63\2\2\u0293\u0292\3\2\2\2\u0294"+
		"\u0297\3\2\2\2\u0295\u0293\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u029b\3\2"+
		"\2\2\u0297\u0295\3\2\2\2\u0298\u029a\t\2\2\2\u0299\u0298\3\2\2\2\u029a"+
		"\u029d\3\2\2\2\u029b\u0299\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029e\3\2"+
		"\2\2\u029d\u029b\3\2\2\2\u029e\u02a2\5R*\2\u029f\u02a1\t\2\2\2\u02a0\u029f"+
		"\3\2\2\2\u02a1\u02a4\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3"+
		"\u02a5\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a5\u02a9\5T+\2\u02a6\u02a8\t\2\2"+
		"\2\u02a7\u02a6\3\2\2\2\u02a8\u02ab\3\2\2\2\u02a9\u02a7\3\2\2\2\u02a9\u02aa"+
		"\3\2\2\2\u02aa\u02ac\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ac\u02b0\5X-\2\u02ad"+
		"\u02af\t\2\2\2\u02ae\u02ad\3\2\2\2\u02af\u02b2\3\2\2\2\u02b0\u02ae\3\2"+
		"\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b3\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b3"+
		"\u02b7\5,\27\2\u02b4\u02b6\t\2\2\2\u02b5\u02b4\3\2\2\2\u02b6\u02b9\3\2"+
		"\2\2\u02b7\u02b5\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02bd\3\2\2\2\u02b9"+
		"\u02b7\3\2\2\2\u02ba\u02bc\7\64\2\2\u02bb\u02ba\3\2\2\2\u02bc\u02bf\3"+
		"\2\2\2\u02bd\u02bb\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02c3\3\2\2\2\u02bf"+
		"\u02bd\3\2\2\2\u02c0\u02c2\t\2\2\2\u02c1\u02c0\3\2\2\2\u02c2\u02c5\3\2"+
		"\2\2\u02c3\u02c1\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c6\3\2\2\2\u02c5"+
		"\u02c3\3\2\2\2\u02c6\u02c7\7\65\2\2\u02c7Q\3\2\2\2\u02c8\u02c9\7\61\2"+
		"\2\u02c9\u02ca\5<\37\2\u02caS\3\2\2\2\u02cb\u02cc\7\66\2\2\u02cc\u02d0"+
		"\5V,\2\u02cd\u02cf\t\2\2\2\u02ce\u02cd\3\2\2\2\u02cf\u02d2\3\2\2\2\u02d0"+
		"\u02ce\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d3\3\2\2\2\u02d2\u02d0\3\2"+
		"\2\2\u02d3\u02d7\7\67\2\2\u02d4\u02d6\t\2\2\2\u02d5\u02d4\3\2\2\2\u02d6"+
		"\u02d9\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02df\3\2"+
		"\2\2\u02d9\u02d7\3\2\2\2\u02da\u02db\5\\/\2\u02db\u02dd\78\2\2\u02dc\u02de"+
		"\t\2\2\2\u02dd\u02dc\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02e0\3\2\2\2\u02df"+
		"\u02da\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02df\3\2\2\2\u02e1\u02e2\3\2"+
		"\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e4\79\2\2\u02e4U\3\2\2\2\u02e5\u02e7"+
		"\7\t\2\2\u02e6\u02e8\n\4\2\2\u02e7\u02e6\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9"+
		"\u02e7\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ec\7\r"+
		"\2\2\u02ecW\3\2\2\2\u02ed\u02ee\7\7\2\2\u02ee\u02ef\5\32\16\2\u02ef\u02f0"+
		"\7\b\2\2\u02f0Y\3\2\2\2\u02f1\u02f2\7:\2\2\u02f2\u02f3\5<\37\2\u02f3\u02f5"+
		"\5V,\2\u02f4\u02f6\5<\37\2\u02f5\u02f4\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6"+
		"[\3\2\2\2\u02f7\u02fc\5^\60\2\u02f8\u02f9\7\u00a0\2\2\u02f9\u02fb\5^\60"+
		"\2\u02fa\u02f8\3\2\2\2\u02fb\u02fe\3\2\2\2\u02fc\u02fa\3\2\2\2\u02fc\u02fd"+
		"\3\2\2\2\u02fd]\3\2\2\2\u02fe\u02fc\3\2\2\2\u02ff\u0301\7\22\2\2\u0300"+
		"\u02ff\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0304\5\32"+
		"\16\2\u0303\u0305\7\22\2\2\u0304\u0303\3\2\2\2\u0304\u0305\3\2\2\2\u0305"+
		"_\3\2\2\2\u0306\u030c\5h\65\2\u0307\u030c\5f\64\2\u0308\u030c\5d\63\2"+
		"\u0309\u030c\t\5\2\2\u030a\u030c\5b\62\2\u030b\u0306\3\2\2\2\u030b\u0307"+
		"\3\2\2\2\u030b\u0308\3\2\2\2\u030b\u0309\3\2\2\2\u030b\u030a\3\2\2\2\u030c"+
		"a\3\2\2\2\u030d\u0311\7=\2\2\u030e\u0310\5\32\16\2\u030f\u030e\3\2\2\2"+
		"\u0310\u0313\3\2\2\2\u0311\u030f\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0314"+
		"\3\2\2\2\u0313\u0311\3\2\2\2\u0314\u0315\7\r\2\2\u0315c\3\2\2\2\u0316"+
		"\u0317\7\13\2\2\u0317\u0322\5<\37\2\u0318\u0319\7>\2\2\u0319\u031a\5\32"+
		"\16\2\u031a\u031b\7\r\2\2\u031b\u0322\3\2\2\2\u031c\u031d\7\23\2\2\u031d"+
		"\u031e\7\t\2\2\u031e\u031f\5\32\16\2\u031f\u0320\7\r\2\2\u0320\u0322\3"+
		"\2\2\2\u0321\u0316\3\2\2\2\u0321\u0318\3\2\2\2\u0321\u031c\3\2\2\2\u0322"+
		"e\3\2\2\2\u0323\u0327\7?\2\2\u0324\u0326\5&\24\2\u0325\u0324\3\2\2\2\u0326"+
		"\u0329\3\2\2\2\u0327\u0325\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u032a\3\2"+
		"\2\2\u0329\u0327\3\2\2\2\u032a\u032b\7\r\2\2\u032bg\3\2\2\2\u032c\u032f"+
		"\5j\66\2\u032d\u032f\5l\67\2\u032e\u032c\3\2\2\2\u032e\u032d\3\2\2\2\u032f"+
		"i\3\2\2\2\u0330\u0334\7@\2\2\u0331\u0333\5\32\16\2\u0332\u0331\3\2\2\2"+
		"\u0333\u0336\3\2\2\2\u0334\u0332\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0337"+
		"\3\2\2\2\u0336\u0334\3\2\2\2\u0337\u0344\7\r\2\2\u0338\u033c\7A\2\2\u0339"+
		"\u033b\5\32\16\2\u033a\u0339\3\2\2\2\u033b\u033e\3\2\2\2\u033c\u033a\3"+
		"\2\2\2\u033c\u033d\3\2\2\2\u033d\u033f\3\2\2\2\u033e\u033c\3\2\2\2\u033f"+
		"\u0341\7\r\2\2\u0340\u0342\7#\2\2\u0341\u0340\3\2\2\2\u0341\u0342\3\2"+
		"\2\2\u0342\u0344\3\2\2\2\u0343\u0330\3\2\2\2\u0343\u0338\3\2\2\2\u0344"+
		"k\3\2\2\2\u0345\u0346\7B\2\2\u0346\u034a\5<\37\2\u0347\u0348\7C\2\2\u0348"+
		"\u034a\5<\37\2\u0349\u0345\3\2\2\2\u0349\u0347\3\2\2\2\u034am\3\2\2\2"+
		"\u034b\u034c\7\7\2\2\u034c\u034d\5\32\16\2\u034d\u034e\7\b\2\2\u034eo"+
		"\3\2\2\2\u034f\u0353\7D\2\2\u0350\u0352\5\32\16\2\u0351\u0350\3\2\2\2"+
		"\u0352\u0355\3\2\2\2\u0353\u0351\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0356"+
		"\3\2\2\2\u0355\u0353\3\2\2\2\u0356\u0357\7E\2\2\u0357q\3\2\2\2\u0358\u0359"+
		"\t\6\2\2\u0359\u035b\7\t\2\2\u035a\u035c\5,\27\2\u035b\u035a\3\2\2\2\u035b"+
		"\u035c\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u035e\5&\24\2\u035e\u035f\7\r"+
		"\2\2\u035fs\3\2\2\2\u0360\u0361\t\7\2\2\u0361\u0363\7\t\2\2\u0362\u0364"+
		"\5,\27\2\u0363\u0362\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0365\3\2\2\2\u0365"+
		"\u0366\5&\24\2\u0366\u0367\7\r\2\2\u0367u\3\2\2\2\u0368\u0369\t\b\2\2"+
		"\u0369\u036b\7\t\2\2\u036a\u036c\5,\27\2\u036b\u036a\3\2\2\2\u036b\u036c"+
		"\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u036e\5&\24\2\u036e\u036f\7\r\2\2\u036f"+
		"w\3\2\2\2\u0370\u0372\7\u0092\2\2\u0371\u0370\3\2\2\2\u0371\u0372\3\2"+
		"\2\2\u0372\u0373\3\2\2\2\u0373\u0377\t\t\2\2\u0374\u0376\5\u0098M\2\u0375"+
		"\u0374\3\2\2\2\u0376\u0379\3\2\2\2\u0377\u0375\3\2\2\2\u0377\u0378\3\2"+
		"\2\2\u0378\u037a\3\2\2\2\u0379\u0377\3\2\2\2\u037a\u037b\7\t\2\2\u037b"+
		"\u037c\5z>\2\u037c\u037d\7\r\2\2\u037dy\3\2\2\2\u037e\u038f\5|?\2\u037f"+
		"\u0383\7\17\2\2\u0380\u0382\t\2\2\2\u0381\u0380\3\2\2\2\u0382\u0385\3"+
		"\2\2\2\u0383\u0381\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u0386\3\2\2\2\u0385"+
		"\u0383\3\2\2\2\u0386\u038a\5|?\2\u0387\u0389\t\2\2\2\u0388\u0387\3\2\2"+
		"\2\u0389\u038c\3\2\2\2\u038a\u0388\3\2\2\2\u038a\u038b\3\2\2\2\u038b\u038e"+
		"\3\2\2\2\u038c\u038a\3\2\2\2\u038d\u037f\3\2\2\2\u038e\u0391\3\2\2\2\u038f"+
		"\u038d\3\2\2\2\u038f\u0390\3\2\2\2\u0390{\3\2\2\2\u0391\u038f\3\2\2\2"+
		"\u0392\u0396\5\u00ba^\2\u0393\u0396\5\u00a2R\2\u0394\u0396\5\u00a4S\2"+
		"\u0395\u0392\3\2\2\2\u0395\u0393\3\2\2\2\u0395\u0394\3\2\2\2\u0396\u0399"+
		"\3\2\2\2\u0397\u0395\3\2\2\2\u0397\u0398\3\2\2\2\u0398}\3\2\2\2\u0399"+
		"\u0397\3\2\2\2\u039a\u039b\t\n\2\2\u039b\177\3\2\2\2\u039c\u039e\7R\2"+
		"\2\u039d\u039f\5\u0098M\2\u039e\u039d\3\2\2\2\u039e\u039f\3\2\2\2\u039f"+
		"\u03a3\3\2\2\2\u03a0\u03a2\5\32\16\2\u03a1\u03a0\3\2\2\2\u03a2\u03a5\3"+
		"\2\2\2\u03a3\u03a1\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03a6\3\2\2\2\u03a5"+
		"\u03a3\3\2\2\2\u03a6\u03b3\7S\2\2\u03a7\u03a9\7T\2\2\u03a8\u03aa\5\u0098"+
		"M\2\u03a9\u03a8\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03ae\3\2\2\2\u03ab"+
		"\u03ad\5\32\16\2\u03ac\u03ab\3\2\2\2\u03ad\u03b0\3\2\2\2\u03ae\u03ac\3"+
		"\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b1\3\2\2\2\u03b0\u03ae\3\2\2\2\u03b1"+
		"\u03b3\7U\2\2\u03b2\u039c\3\2\2\2\u03b2\u03a7\3\2\2\2\u03b3\u0081\3\2"+
		"\2\2\u03b4\u03b6\7V\2\2\u03b5\u03b7\5\u0098M\2\u03b6\u03b5\3\2\2\2\u03b6"+
		"\u03b7\3\2\2\2\u03b7\u03bb\3\2\2\2\u03b8\u03ba\5\32\16\2\u03b9\u03b8\3"+
		"\2\2\2\u03ba\u03bd\3\2\2\2\u03bb\u03b9\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc"+
		"\u03be\3\2\2\2\u03bd\u03bb\3\2\2\2\u03be\u03cb\7W\2\2\u03bf\u03c1\7X\2"+
		"\2\u03c0\u03c2\5\u0098M\2\u03c1\u03c0\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2"+
		"\u03c6\3\2\2\2\u03c3\u03c5\5\32\16\2\u03c4\u03c3\3\2\2\2\u03c5\u03c8\3"+
		"\2\2\2\u03c6\u03c4\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03c9\3\2\2\2\u03c8"+
		"\u03c6\3\2\2\2\u03c9\u03cb\7Y\2\2\u03ca\u03b4\3\2\2\2\u03ca\u03bf\3\2"+
		"\2\2\u03cb\u0083\3\2\2\2\u03cc\u03ce\7Z\2\2\u03cd\u03cf\5\u0098M\2\u03ce"+
		"\u03cd\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d3\3\2\2\2\u03d0\u03d2\5\32"+
		"\16\2\u03d1\u03d0\3\2\2\2\u03d2\u03d5\3\2\2\2\u03d3\u03d1\3\2\2\2\u03d3"+
		"\u03d4\3\2\2\2\u03d4\u03d6\3\2\2\2\u03d5\u03d3\3\2\2\2\u03d6\u03d7\7["+
		"\2\2\u03d7\u0085\3\2\2\2\u03d8\u03da\7\\\2\2\u03d9\u03db\5\u0098M\2\u03da"+
		"\u03d9\3\2\2\2\u03da\u03db\3\2\2\2\u03db\u03df\3\2\2\2\u03dc\u03de\5\32"+
		"\16\2\u03dd\u03dc\3\2\2\2\u03de\u03e1\3\2\2\2\u03df\u03dd\3\2\2\2\u03df"+
		"\u03e0\3\2\2\2\u03e0\u03e2\3\2\2\2\u03e1\u03df\3\2\2\2\u03e2\u03e3\7]"+
		"\2\2\u03e3\u0087\3\2\2\2\u03e4\u03e5\7^\2\2\u03e5\u03e6\5<\37\2\u03e6"+
		"\u0089\3\2\2\2\u03e7\u03e8\7_\2\2\u03e8\u03e9\5<\37\2\u03e9\u008b\3\2"+
		"\2\2\u03ea\u03ee\7`\2\2\u03eb\u03ed\5 \21\2\u03ec\u03eb\3\2\2\2\u03ed"+
		"\u03f0\3\2\2\2\u03ee\u03ec\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef\u03f1\3\2"+
		"\2\2\u03f0\u03ee\3\2\2\2\u03f1\u03f2\5\u00b4[\2\u03f2\u008d\3\2\2\2\u03f3"+
		"\u03f4\7a\2\2\u03f4\u03f5\5<\37\2\u03f5\u008f\3\2\2\2\u03f6\u03f7\7b\2"+
		"\2\u03f7\u03f8\5<\37\2\u03f8\u0091\3\2\2\2\u03f9\u03fd\7c\2\2\u03fa\u03fc"+
		"\5 \21\2\u03fb\u03fa\3\2\2\2\u03fc\u03ff\3\2\2\2\u03fd\u03fb\3\2\2\2\u03fd"+
		"\u03fe\3\2\2\2\u03fe\u0400\3\2\2\2\u03ff\u03fd\3\2\2\2\u0400\u0401\5\u00b4"+
		"[\2\u0401\u0093\3\2\2\2\u0402\u0403\7d\2\2\u0403\u0404\7\t\2\2\u0404\u0405"+
		"\5\u0096L\2\u0405\u0406\7\r\2\2\u0406\u0095\3\2\2\2\u0407\u0408\5&\24"+
		"\2\u0408\u0097\3\2\2\2\u0409\u040d\7/\2\2\u040a\u040c\n\13\2\2\u040b\u040a"+
		"\3\2\2\2\u040c\u040f\3\2\2\2\u040d\u040b\3\2\2\2\u040d\u040e\3\2\2\2\u040e"+
		"\u0410\3\2\2\2\u040f\u040d\3\2\2\2\u0410\u0411\7\60\2\2\u0411\u0099\3"+
		"\2\2\2\u0412\u0413\7\17\2\2\u0413\u009b\3\2\2\2\u0414\u0415\7e\2\2\u0415"+
		"\u009d\3\2\2\2\u0416\u0417\7f\2\2\u0417\u009f\3\2\2\2\u0418\u0419\7g\2"+
		"\2\u0419\u00a1\3\2\2\2\u041a\u041b\7h\2\2\u041b\u00a3\3\2\2\2\u041c\u041d"+
		"\7i\2\2\u041d\u00a5\3\2\2\2\u041e\u0420\7\22\2\2\u041f\u0421\n\f\2\2\u0420"+
		"\u041f\3\2\2\2\u0420\u0421\3\2\2\2\u0421\u0422\3\2\2\2\u0422\u0423\7\22"+
		"\2\2\u0423\u00a7\3\2\2\2\u0424\u0426\7j\2\2\u0425\u0427\n\r\2\2\u0426"+
		"\u0425\3\2\2\2\u0427\u0428\3\2\2\2\u0428\u0426\3\2\2\2\u0428\u0429\3\2"+
		"\2\2\u0429\u042a\3\2\2\2\u042a\u044a\7j\2\2\u042b\u044a\5\u00a6T\2\u042c"+
		"\u042e\7k\2\2\u042d\u042f\n\16\2\2\u042e\u042d\3\2\2\2\u042f\u0430\3\2"+
		"\2\2\u0430\u042e\3\2\2\2\u0430\u0431\3\2\2\2\u0431\u0432\3\2\2\2\u0432"+
		"\u044a\7l\2\2\u0433\u0435\7m\2\2\u0434\u0436\n\17\2\2\u0435\u0434\3\2"+
		"\2\2\u0436\u0437\3\2\2\2\u0437\u0435\3\2\2\2\u0437\u0438\3\2\2\2\u0438"+
		"\u0439\3\2\2\2\u0439\u044a\7n\2\2\u043a\u043c\7o\2\2\u043b\u043d\n\20"+
		"\2\2\u043c\u043b\3\2\2\2\u043d\u043e\3\2\2\2\u043e\u043c\3\2\2\2\u043e"+
		"\u043f\3\2\2\2\u043f\u0440\3\2\2\2\u0440\u044a\7p\2\2\u0441\u0443\7q\2"+
		"\2\u0442\u0444\n\21\2\2\u0443\u0442\3\2\2\2\u0444\u0445\3\2\2\2\u0445"+
		"\u0443\3\2\2\2\u0445\u0446\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u044a\7r"+
		"\2\2\u0448\u044a\5\u00aeX\2\u0449\u0424\3\2\2\2\u0449\u042b\3\2\2\2\u0449"+
		"\u042c\3\2\2\2\u0449\u0433\3\2\2\2\u0449\u043a\3\2\2\2\u0449\u0441\3\2"+
		"\2\2\u0449\u0448\3\2\2\2\u044a\u00a9\3\2\2\2\u044b\u044c\7s\2\2\u044c"+
		"\u044e\5,\27\2\u044d\u044f\n\22\2\2\u044e\u044d\3\2\2\2\u044f\u0450\3"+
		"\2\2\2\u0450\u044e\3\2\2\2\u0450\u0451\3\2\2\2\u0451\u0452\3\2\2\2\u0452"+
		"\u0453\7t\2\2\u0453\u045e\3\2\2\2\u0454\u0455\7u\2\2\u0455\u0457\5,\27"+
		"\2\u0456\u0458\n\23\2\2\u0457\u0456\3\2\2\2\u0458\u0459\3\2\2\2\u0459"+
		"\u0457\3\2\2\2\u0459\u045a\3\2\2\2\u045a\u045b\3\2\2\2\u045b\u045c\7v"+
		"\2\2\u045c\u045e\3\2\2\2\u045d\u044b\3\2\2\2\u045d\u0454\3\2\2\2\u045e"+
		"\u00ab\3\2\2\2\u045f\u0461\7w\2\2\u0460\u0462\n\24\2\2\u0461\u0460\3\2"+
		"\2\2\u0462\u0463\3\2\2\2\u0463\u0461\3\2\2\2\u0463\u0464\3\2\2\2\u0464"+
		"\u0465\3\2\2\2\u0465\u0466\7x\2\2\u0466\u00ad\3\2\2\2\u0467\u0469\7y\2"+
		"\2\u0468\u046a\n\25\2\2\u0469\u0468\3\2\2\2\u046a\u046b\3\2\2\2\u046b"+
		"\u0469\3\2\2\2\u046b\u046c\3\2\2\2\u046c\u046d\3\2\2\2\u046d\u0476\7z"+
		"\2\2\u046e\u0470\7{\2\2\u046f\u0471\n\26\2\2\u0470\u046f\3\2\2\2\u0471"+
		"\u0472\3\2\2\2\u0472\u0470\3\2\2\2\u0472\u0473\3\2\2\2\u0473\u0474\3\2"+
		"\2\2\u0474\u0476\7|\2\2\u0475\u0467\3\2\2\2\u0475\u046e\3\2\2\2\u0476"+
		"\u00af\3\2\2\2\u0477\u047a\5\u00b2Z\2\u0478\u047a\7\u00a0\2\2\u0479\u0477"+
		"\3\2\2\2\u0479\u0478\3\2\2\2\u047a\u047d\3\2\2\2\u047b\u0479\3\2\2\2\u047b"+
		"\u047c\3\2\2\2\u047c\u00b1\3\2\2\2\u047d\u047b\3\2\2\2\u047e\u0480\n\27"+
		"\2\2\u047f\u047e\3\2\2\2\u0480\u0481\3\2\2\2\u0481\u047f\3\2\2\2\u0481"+
		"\u0482\3\2\2\2\u0482\u00b3\3\2\2\2\u0483\u0486\t\2\2\2\u0484\u0486\5\u00b6"+
		"\\\2\u0485\u0483\3\2\2\2\u0485\u0484\3\2\2\2\u0486\u00b5\3\2\2\2\u0487"+
		"\u0488\7\16\2\2\u0488\u00b7\3\2\2\2\u0489\u048b\7\u0092\2\2\u048a\u048c"+
		"\7h\2\2\u048b\u048a\3\2\2\2\u048b\u048c\3\2\2\2\u048c\u048d\3\2\2\2\u048d"+
		"\u048e\7}\2\2\u048e\u048f\5&\24\2\u048f\u0491\7\r\2\2\u0490\u0492\7i\2"+
		"\2\u0491\u0490\3\2\2\2\u0491\u0492\3\2\2\2\u0492\u00b9\3\2\2\2\u0493\u0496"+
		"\7\u0088\2\2\u0494\u0496\5\u00be`\2\u0495\u0493\3\2\2\2\u0495\u0494\3"+
		"\2\2\2\u0496\u00bb\3\2\2\2\u0497\u0498\5\u00be`\2\u0498\u0499\7\u009e"+
		"\2\2\u0499\u049a\5\u00be`\2\u049a\u00bd\3\2\2\2\u049b\u049c\7\u0089\2"+
		"\2\u049c\u00bf\3\2\2\2\u049d\u049e\7~\2\2\u049e\u00c1\3\2\2\2\u049f\u04a0"+
		"\t\30\2\2\u04a0\u00c3\3\2\2\2\u04a1\u04a2\7\u0085\2\2\u04a2\u04a3\5<\37"+
		"\2\u04a3\u04a4\5<\37\2\u04a4\u04a5\5<\37\2\u04a5\u00c5\3\2\2\2\u04a6\u04ab"+
		"\5\u00ba^\2\u04a7\u04ab\7#\2\2\u04a8\u04ab\7\t\2\2\u04a9\u04ab\7\r\2\2"+
		"\u04aa\u04a6\3\2\2\2\u04aa\u04a7\3\2\2\2\u04aa\u04a8\3\2\2\2\u04aa\u04a9"+
		"\3\2\2\2\u04ab\u04ae\3\2\2\2\u04ac\u04aa\3\2\2\2\u04ac\u04ad\3\2\2\2\u04ad"+
		"\u00c7\3\2\2\2\u04ae\u04ac\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0\u00c9\3\2"+
		"\2\2\u0086\u00cd\u00d4\u00dd\u00e4\u00f1\u00f9\u0100\u0107\u010d\u0114"+
		"\u011b\u011f\u0127\u012e\u0132\u013a\u0140\u0149\u0150\u0152\u0161\u0167"+
		"\u016e\u018d\u01a5\u01ac\u01b6\u01bd\u01c6\u01ca\u01d0\u01dc\u01ed\u01f3"+
		"\u01ff\u0207\u0212\u021e\u0226\u022a\u0233\u023c\u0246\u024b\u0251\u0258"+
		"\u0262\u0268\u0270\u0277\u027e\u0283\u028a\u028f\u0295\u029b\u02a2\u02a9"+
		"\u02b0\u02b7\u02bd\u02c3\u02d0\u02d7\u02dd\u02e1\u02e9\u02f5\u02fc\u0300"+
		"\u0304\u030b\u0311\u0321\u0327\u032e\u0334\u033c\u0341\u0343\u0349\u0353"+
		"\u035b\u0363\u036b\u0371\u0377\u0383\u038a\u038f\u0395\u0397\u039e\u03a3"+
		"\u03a9\u03ae\u03b2\u03b6\u03bb\u03c1\u03c6\u03ca\u03ce\u03d3\u03da\u03df"+
		"\u03ee\u03fd\u040d\u0420\u0428\u0430\u0437\u043e\u0445\u0449\u0450\u0459"+
		"\u045d\u0463\u046b\u0472\u0475\u0479\u047b\u0481\u0485\u048b\u0491\u0495"+
		"\u04aa\u04ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}