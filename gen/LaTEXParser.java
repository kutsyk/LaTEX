// Generated from D:/Charlesworth/LaTEX/src\LaTEX.g4 by ANTLR 4.4.1-dev
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
	static { RuntimeMetaData.checkVersion("4.4.1-dev", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__128=1, T__127=2, T__126=3, T__125=4, T__124=5, T__123=6, T__122=7, 
		T__121=8, T__120=9, T__119=10, T__118=11, T__117=12, T__116=13, T__115=14, 
		T__114=15, T__113=16, T__112=17, T__111=18, T__110=19, T__109=20, T__108=21, 
		T__107=22, T__106=23, T__105=24, T__104=25, T__103=26, T__102=27, T__101=28, 
		T__100=29, T__99=30, T__98=31, T__97=32, T__96=33, T__95=34, T__94=35, 
		T__93=36, T__92=37, T__91=38, T__90=39, T__89=40, T__88=41, T__87=42, 
		T__86=43, T__85=44, T__84=45, T__83=46, T__82=47, T__81=48, T__80=49, 
		T__79=50, T__78=51, T__77=52, T__76=53, T__75=54, T__74=55, T__73=56, 
		T__72=57, T__71=58, T__70=59, T__69=60, T__68=61, T__67=62, T__66=63, 
		T__65=64, T__64=65, T__63=66, T__62=67, T__61=68, T__60=69, T__59=70, 
		T__58=71, T__57=72, T__56=73, T__55=74, T__54=75, T__53=76, T__52=77, 
		T__51=78, T__50=79, T__49=80, T__48=81, T__47=82, T__46=83, T__45=84, 
		T__44=85, T__43=86, T__42=87, T__41=88, T__40=89, T__39=90, T__38=91, 
		T__37=92, T__36=93, T__35=94, T__34=95, T__33=96, T__32=97, T__31=98, 
		T__30=99, T__29=100, T__28=101, T__27=102, T__26=103, T__25=104, T__24=105, 
		T__23=106, T__22=107, T__21=108, T__20=109, T__19=110, T__18=111, T__17=112, 
		T__16=113, T__15=114, T__14=115, T__13=116, T__12=117, T__11=118, T__10=119, 
		T__9=120, T__8=121, T__7=122, T__6=123, T__5=124, T__4=125, T__3=126, 
		T__2=127, T__1=128, T__0=129, IgnoreAlgorithmKeyWords=130, IgnoreUrlPrefix=131, 
		String=132, Num=133, INT=134, ASSIGN=135, GT=136, LT=137, BANG=138, TILDE=139, 
		QUESTION=140, COLON=141, EQUAL=142, LE=143, GE=144, NOTEQUAL=145, AND=146, 
		OR=147, INC=148, DEC=149, ADD=150, SUB=151, MUL=152, DIV=153, BITAND=154, 
		BITOR=155, CARET=156, MOD=157, COMMENT=158, LINE_COMMENT=159, WS=160, 
		WORDS_TO_SKIP=161, Skip=162, Affil=163;
	public static final String[] tokenNames = {
		"<INVALID>", "'$$'", "'\\end{adjustwidth}'", "'\\textsc'", "'\\end{table}'", 
		"'\\renewcommand'", "'\\begin{equation*}'", "'\\citet'", "'\\end{tabular}'", 
		"'}'", "'\\Large'", "'\\begin{multicols}'", "')'", "'\\end{algorithmic}'", 
		"'@'", "'\\begin{enumerate}'", "'\\section'", "'\\end{document}'", "'\\begin{algorithm}'", 
		"'\\'", "'\\Yinyang'", "'\\textpilcrow'", "'\\end{itemize}'", "'\\\\ \\hline'", 
		"'\\begin{tabular}'", "'\\end{figure*}'", "','", "'\\subsubsection'", 
		"'\\paragraph*'", "'\\begin{eqnarray*}'", "'\\IF'", "'\\textbf'", "'\\STATE'", 
		"'\\begin{table}'", "'\\begin{suppfigure*}'", "'\\begin{suppfigure}'", 
		"'\\textit'", "'\\end{suppfigure}'", "'$'", "'\\newcommand'", "'\\item'", 
		"'\\beqa'", "'.'", "'\\caption'", "'\\begin{itemize}'", "'\\author'", 
		"'\\ENSURE'", "'\\large'", "'\\]'", "'\\Abstract'", "'\\begin{abstract}'", 
		"'\\begin{subequations}'", "'\\label'", "'\\end{eqnarray}'", "'\\begin{figure*}'", 
		"'\\emph'", "'\\eea'", "'\\begin{center}'", "'\\hline'", "'{\\tt'", "'['", 
		"'\\title'", "'\\subsection*'", "'{\\sc'", "'\\end{equation}'", "'\\end{align}'", 
		"'\\cite'", "'\\newline'", "'\\begin{landscape}'", "'\\end{center}'", 
		"'\\url'", "'\\textsuperscript'", "'\\textcurrency a'", "'\\dots'", "'\\begin{adjustwidth}{-2.25in}{0in}'", 
		"'\\REQUIRE'", "'\\begin{algorithmic}'", "'{\\em'", "'\\end{abstract}'", 
		"'\\mbox'", "'\\end{equation*}'", "'\\citep'", "'\\end{figure}'", "'\\multicolumn'", 
		"'\\subsubsection*'", "'\\end{eqnarray*}'", "'\\ifthenelse'", "'\\begin{description}'", 
		"'\\['", "'\\ref{'", "'\\ddag'", "']'", "'\\RETURN'", "'\n'", "'('", "'\\left'", 
		"' ms'", "'\\citemain'", "'\\begin{align}'", "'\\end{algorithm}'", "'{'", 
		"'\\\\'", "'\\begin{figure}'", "'\\end{flushleft}'", "'\\FOR'", "'\\arabic'", 
		"'\\end{description}'", "'\\end{suppfigure*}'", "'\\begin{eqnarray}'", 
		"' Hz'", "'\\right'", "'\\subsection'", "'{\\it'", "'\\begin{document}'", 
		"'\\section*'", "'\\''", "'{\\bf'", "'\\LARGE'", "'\\end{enumerate}'", 
		"'\\begin{equation}'", "'\\dag'", "'\\paragraph'", "'\\end{subequations}'", 
		"'\\end{align*}'", "'\\end{multicols}'", "'\\textcurrency'", "'\\begin{align*}'", 
		"'\\end{landscape}'", "'\\bf'", "'\\begin{flushleft}'", "IgnoreAlgorithmKeyWords", 
		"IgnoreUrlPrefix", "String", "Num", "INT", "'='", "'>'", "'<'", "'!'", 
		"'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", 
		"'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "COMMENT", 
		"LINE_COMMENT", "WS", "WORDS_TO_SKIP", "Skip", "Affil"
	};
	public static final int
		RULE_compilationUnit = 0, RULE_documentDeclaration = 1, RULE_startingDeclaration = 2, 
		RULE_newCommandList = 3, RULE_documentBody = 4, RULE_frontPart = 5, RULE_frontBody = 6, 
		RULE_mainTitle = 7, RULE_authorList = 8, RULE_author = 9, RULE_textsuperscriptBlock = 10, 
		RULE_authorName = 11, RULE_address = 12, RULE_bodyPart = 13, RULE_memberList = 14, 
		RULE_member = 15, RULE_landScapeBlock = 16, RULE_textRules = 17, RULE_textSymbols = 18, 
		RULE_paragraph = 19, RULE_text = 20, RULE_textBody = 21, RULE_textSC = 22, 
		RULE_label = 23, RULE_boxBlock = 24, RULE_abstractBlock = 25, RULE_title = 26, 
		RULE_newcommandDeclaration = 27, RULE_commandBody = 28, RULE_renewcommandDeclaration = 29, 
		RULE_identificator = 30, RULE_block = 31, RULE_multicolsBlock = 32, RULE_list = 33, 
		RULE_items = 34, RULE_item = 35, RULE_descriptionList = 36, RULE_descriptionItems = 37, 
		RULE_descriptionItem = 38, RULE_descriptionTitle = 39, RULE_captionBlock = 40, 
		RULE_table = 41, RULE_tableCaption = 42, RULE_tabular = 43, RULE_tableSkipBlock = 44, 
		RULE_tableDefinition = 45, RULE_multicolumn = 46, RULE_tableRow = 47, 
		RULE_tableCell = 48, RULE_texttypeDeclarator = 49, RULE_ttStyle = 50, 
		RULE_boldTypeDeclaration = 51, RULE_smallcapsDeclaration = 52, RULE_italictypeDeclaration = 53, 
		RULE_italicBlock = 54, RULE_italicOutBlock = 55, RULE_textformatingBlockFlushLeft = 56, 
		RULE_textformatingBlockCenter = 57, RULE_sectionDeclaration = 58, RULE_subsectionDeclaration = 59, 
		RULE_subsubsectionDeclaration = 60, RULE_citeReferences = 61, RULE_citeReferencesList = 62, 
		RULE_citeReference = 63, RULE_measures = 64, RULE_figureBlock = 65, RULE_supplementaryFigureBlock = 66, 
		RULE_algorithmBlock = 67, RULE_algorithmicBlock = 68, RULE_input = 69, 
		RULE_output = 70, RULE_state = 71, RULE_forBlock = 72, RULE_ifBlock = 73, 
		RULE_returnBlock = 74, RULE_url = 75, RULE_urlText = 76, RULE_options = 77, 
		RULE_comma = 78, RULE_dot = 79, RULE_dots = 80, RULE_appos = 81, RULE_colon = 82, 
		RULE_lparen = 83, RULE_rparen = 84, RULE_dollarBlock = 85, RULE_inlineEquation = 86, 
		RULE_equationBlock = 87, RULE_displayEquation = 88, RULE_eqnArray = 89, 
		RULE_eqnArrayBody = 90, RULE_eqnEquation = 91, RULE_newLine = 92, RULE_doubleSlash = 93, 
		RULE_ref = 94, RULE_simpleText = 95, RULE_interval = 96, RULE_numbers = 97, 
		RULE_arabic = 98, RULE_specialCharacters = 99, RULE_ifThenElse = 100, 
		RULE_ifThenText = 101, RULE_authorItemMiss = 102;
	public static final String[] ruleNames = {
		"compilationUnit", "documentDeclaration", "startingDeclaration", "newCommandList", 
		"documentBody", "frontPart", "frontBody", "mainTitle", "authorList", "author", 
		"textsuperscriptBlock", "authorName", "address", "bodyPart", "memberList", 
		"member", "landScapeBlock", "textRules", "textSymbols", "paragraph", "text", 
		"textBody", "textSC", "label", "boxBlock", "abstractBlock", "title", "newcommandDeclaration", 
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
		"colon", "lparen", "rparen", "dollarBlock", "inlineEquation", "equationBlock", 
		"displayEquation", "eqnArray", "eqnArrayBody", "eqnEquation", "newLine", 
		"doubleSlash", "ref", "simpleText", "interval", "numbers", "arabic", "specialCharacters", 
		"ifThenElse", "ifThenText", "authorItemMiss"
	};

	@Override
	public String getGrammarFileName() { return "LaTEX.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

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
		public List<NewLineContext> newLine() {
			return getRuleContexts(NewLineContext.class);
		}
		public TerminalNode EOF() { return getToken(LaTEXParser.EOF, 0); }
		public List<StartingDeclarationContext> startingDeclaration() {
			return getRuleContexts(StartingDeclarationContext.class);
		}
		public NewLineContext newLine(int i) {
			return getRuleContext(NewLineContext.class,i);
		}
		public DocumentDeclarationContext documentDeclaration() {
			return getRuleContext(DocumentDeclarationContext.class,0);
		}
		public StartingDeclarationContext startingDeclaration(int i) {
			return getRuleContext(StartingDeclarationContext.class,i);
		}
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(206); newLine();
					}
					} 
				}
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__124 || _la==T__90) {
				{
				{
				setState(212); startingDeclaration();
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__36 || _la==T__28) {
				{
				{
				setState(218); newLine();
				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(224); documentDeclaration();
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__36 || _la==T__28) {
				{
				{
				setState(225); newLine();
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(231); match(EOF);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233); match(T__16);
			setState(234); documentBody();
			setState(235); match(T__112);
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

	public static class StartingDeclarationContext extends ParserRuleContext {
		public NewCommandListContext newCommandList() {
			return getRuleContext(NewCommandListContext.class,0);
		}
		public StartingDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startingDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterStartingDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitStartingDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitStartingDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartingDeclarationContext startingDeclaration() throws RecognitionException {
		StartingDeclarationContext _localctx = new StartingDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_startingDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237); newCommandList();
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

	public static class NewCommandListContext extends ParserRuleContext {
		public List<NewLineContext> newLine() {
			return getRuleContexts(NewLineContext.class);
		}
		public List<NewcommandDeclarationContext> newcommandDeclaration() {
			return getRuleContexts(NewcommandDeclarationContext.class);
		}
		public NewcommandDeclarationContext newcommandDeclaration(int i) {
			return getRuleContext(NewcommandDeclarationContext.class,i);
		}
		public List<RenewcommandDeclarationContext> renewcommandDeclaration() {
			return getRuleContexts(RenewcommandDeclarationContext.class);
		}
		public NewLineContext newLine(int i) {
			return getRuleContext(NewLineContext.class,i);
		}
		public RenewcommandDeclarationContext renewcommandDeclaration(int i) {
			return getRuleContext(RenewcommandDeclarationContext.class,i);
		}
		public NewCommandListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newCommandList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterNewCommandList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitNewCommandList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitNewCommandList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewCommandListContext newCommandList() throws RecognitionException {
		NewCommandListContext _localctx = new NewCommandListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_newCommandList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			switch (_input.LA(1)) {
			case T__90:
				{
				setState(239); newcommandDeclaration();
				}
				break;
			case T__124:
				{
				setState(240); renewcommandDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(248);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(246);
					switch (_input.LA(1)) {
					case T__90:
						{
						setState(243); newcommandDeclaration();
						}
						break;
					case T__124:
						{
						setState(244); renewcommandDeclaration();
						}
						break;
					case T__36:
					case T__28:
						{
						setState(245); newLine();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class DocumentBodyContext extends ParserRuleContext {
		public BodyPartContext bodyPart() {
			return getRuleContext(BodyPartContext.class,0);
		}
		public FrontPartContext frontPart() {
			return getRuleContext(FrontPartContext.class,0);
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
		enterRule(_localctx, 8, RULE_documentBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__36) {
				{
				{
				setState(251); match(T__36);
				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(257); frontPart();
			setState(261);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(258); match(T__36);
					}
					} 
				}
				setState(263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(264); bodyPart();
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
		enterRule(_localctx, 10, RULE_frontPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266); match(T__0);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__36) {
				{
				{
				setState(267); match(T__36);
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(273); frontBody();
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__36) {
				{
				{
				setState(274); match(T__36);
				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(280); match(T__26);
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
		public AddressContext address(int i) {
			return getRuleContext(AddressContext.class,i);
		}
		public MemberListContext memberList() {
			return getRuleContext(MemberListContext.class,0);
		}
		public List<AddressContext> address() {
			return getRuleContexts(AddressContext.class);
		}
		public MainTitleContext mainTitle() {
			return getRuleContext(MainTitleContext.class,0);
		}
		public AuthorListContext authorList() {
			return getRuleContext(AuthorListContext.class,0);
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
		enterRule(_localctx, 12, RULE_frontBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(282); mainTitle();
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__36) {
				{
				{
				setState(283); match(T__36);
				}
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(289); authorList();
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__36) {
				{
				{
				setState(290); match(T__36);
				}
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(297); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(296); address();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(299); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(301); memberList();
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
		enterRule(_localctx, 14, RULE_mainTitle);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(303); match(T__29);
			setState(304); match(T__119);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__36) {
				{
				{
				setState(305); match(T__36);
				}
				}
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(311); match(T__98);
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__36) {
				{
				{
				setState(312); match(T__36);
				}
				}
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(319);
			_la = _input.LA(1);
			if (_la==T__62) {
				{
				setState(318); match(T__62);
				}
			}

			setState(321); match(T__29);
			setState(322); text();
			setState(323); match(T__120);
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__36) {
				{
				{
				setState(324); match(T__36);
				}
				}
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(330); match(T__120);
			setState(334);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(331); match(T__36);
					}
					} 
				}
				setState(336);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(338);
			_la = _input.LA(1);
			if (_la==T__62) {
				{
				setState(337); match(T__62);
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
		enterRule(_localctx, 16, RULE_authorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340); match(T__28);
			setState(341); author();
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__103) {
				{
				{
				setState(342); match(T__103);
				setState(343); author();
				}
				}
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__36) {
				{
				{
				setState(349); match(T__36);
				}
				}
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(355); match(T__28);
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
		public TextsuperscriptBlockContext textsuperscriptBlock() {
			return getRuleContext(TextsuperscriptBlockContext.class,0);
		}
		public AuthorNameContext authorName() {
			return getRuleContext(AuthorNameContext.class,0);
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
		enterRule(_localctx, 18, RULE_author);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357); authorName();
			setState(358); match(T__58);
			setState(359); textsuperscriptBlock();
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
		public SpecialCharactersContext specialCharacters(int i) {
			return getRuleContext(SpecialCharactersContext.class,i);
		}
		public NumbersContext numbers(int i) {
			return getRuleContext(NumbersContext.class,i);
		}
		public List<NumbersContext> numbers() {
			return getRuleContexts(NumbersContext.class);
		}
		public List<SpecialCharactersContext> specialCharacters() {
			return getRuleContexts(SpecialCharactersContext.class);
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
		enterRule(_localctx, 20, RULE_textsuperscriptBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361); match(T__29);
			setState(366); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(366);
				switch (_input.LA(1)) {
				case Num:
					{
					setState(362); numbers();
					}
					break;
				case MUL:
					{
					setState(363); match(MUL);
					}
					break;
				case T__109:
				case T__108:
				case T__57:
				case T__39:
				case T__9:
				case T__4:
					{
					setState(364); specialCharacters();
					}
					break;
				case T__103:
					{
					setState(365); match(T__103);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(368); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (T__109 - 20)) | (1L << (T__108 - 20)) | (1L << (T__103 - 20)) | (1L << (T__57 - 20)))) != 0) || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (T__39 - 90)) | (1L << (T__9 - 90)) | (1L << (T__4 - 90)) | (1L << (Num - 90)) | (1L << (MUL - 90)))) != 0) );
			setState(370); match(T__120);
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
		enterRule(_localctx, 22, RULE_authorName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372); text();
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
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public NumbersContext numbers() {
			return getRuleContext(NumbersContext.class,0);
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
		enterRule(_localctx, 24, RULE_address);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(374); match(T__1);
			setState(375); match(T__29);
			setState(376); numbers();
			setState(377); match(T__120);
			setState(378); text();
			setState(379); match(T__28);
			setState(383);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(380); match(T__36);
					}
					} 
				}
				setState(385);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		enterRule(_localctx, 26, RULE_bodyPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__128) | (1L << T__126) | (1L << T__124) | (1L << T__123) | (1L << T__122) | (1L << T__119) | (1L << T__118) | (1L << T__117) | (1L << T__115) | (1L << T__114) | (1L << T__113) | (1L << T__111) | (1L << T__110) | (1L << T__109) | (1L << T__108) | (1L << T__103) | (1L << T__102) | (1L << T__101) | (1L << T__100) | (1L << T__99) | (1L << T__98) | (1L << T__97) | (1L << T__96) | (1L << T__95) | (1L << T__94) | (1L << T__93) | (1L << T__91) | (1L << T__88) | (1L << T__87) | (1L << T__86) | (1L << T__85) | (1L << T__84) | (1L << T__83) | (1L << T__82) | (1L << T__80) | (1L << T__79) | (1L << T__78) | (1L << T__77) | (1L << T__75) | (1L << T__74) | (1L << T__72) | (1L << T__70) | (1L << T__68) | (1L << T__67) | (1L << T__66))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__63 - 66)) | (1L << (T__61 - 66)) | (1L << (T__59 - 66)) | (1L << (T__57 - 66)) | (1L << (T__56 - 66)) | (1L << (T__54 - 66)) | (1L << (T__53 - 66)) | (1L << (T__52 - 66)) | (1L << (T__48 - 66)) | (1L << (T__46 - 66)) | (1L << (T__45 - 66)) | (1L << (T__43 - 66)) | (1L << (T__42 - 66)) | (1L << (T__41 - 66)) | (1L << (T__39 - 66)) | (1L << (T__37 - 66)) | (1L << (T__36 - 66)) | (1L << (T__35 - 66)) | (1L << (T__34 - 66)) | (1L << (T__33 - 66)) | (1L << (T__32 - 66)) | (1L << (T__31 - 66)) | (1L << (T__29 - 66)) | (1L << (T__28 - 66)) | (1L << (T__27 - 66)) | (1L << (T__25 - 66)) | (1L << (T__24 - 66)) | (1L << (T__21 - 66)) | (1L << (T__20 - 66)) | (1L << (T__18 - 66)) | (1L << (T__17 - 66)) | (1L << (T__15 - 66)) | (1L << (T__14 - 66)) | (1L << (T__13 - 66)) | (1L << (T__12 - 66)) | (1L << (T__10 - 66)) | (1L << (T__9 - 66)) | (1L << (T__8 - 66)) | (1L << (T__4 - 66)) | (1L << (T__3 - 66)) | (1L << (T__1 - 66)) | (1L << (T__0 - 66)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (String - 132)) | (1L << (Num - 132)) | (1L << (TILDE - 132)) | (1L << (COLON - 132)) | (1L << (SUB - 132)) | (1L << (MUL - 132)) | (1L << (DIV - 132)))) != 0)) {
				{
				{
				setState(386); memberList();
				}
				}
				setState(391);
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
		enterRule(_localctx, 28, RULE_memberList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(392); member();
			setState(396);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(393); member();
					}
					} 
				}
				setState(398);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		public AlgorithmBlockContext algorithmBlock() {
			return getRuleContext(AlgorithmBlockContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public SubsectionDeclarationContext subsectionDeclaration() {
			return getRuleContext(SubsectionDeclarationContext.class,0);
		}
		public RenewcommandDeclarationContext renewcommandDeclaration() {
			return getRuleContext(RenewcommandDeclarationContext.class,0);
		}
		public FigureBlockContext figureBlock() {
			return getRuleContext(FigureBlockContext.class,0);
		}
		public ReturnBlockContext returnBlock() {
			return getRuleContext(ReturnBlockContext.class,0);
		}
		public CiteReferencesContext citeReferences() {
			return getRuleContext(CiteReferencesContext.class,0);
		}
		public AlgorithmicBlockContext algorithmicBlock() {
			return getRuleContext(AlgorithmicBlockContext.class,0);
		}
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public RefContext ref() {
			return getRuleContext(RefContext.class,0);
		}
		public TextRulesContext textRules() {
			return getRuleContext(TextRulesContext.class,0);
		}
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public AuthorItemMissContext authorItemMiss() {
			return getRuleContext(AuthorItemMissContext.class,0);
		}
		public MulticolsBlockContext multicolsBlock() {
			return getRuleContext(MulticolsBlockContext.class,0);
		}
		public AbstractBlockContext abstractBlock() {
			return getRuleContext(AbstractBlockContext.class,0);
		}
		public SupplementaryFigureBlockContext supplementaryFigureBlock() {
			return getRuleContext(SupplementaryFigureBlockContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public DescriptionListContext descriptionList() {
			return getRuleContext(DescriptionListContext.class,0);
		}
		public CaptionBlockContext captionBlock() {
			return getRuleContext(CaptionBlockContext.class,0);
		}
		public StateContext state() {
			return getRuleContext(StateContext.class,0);
		}
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public NewLineContext newLine() {
			return getRuleContext(NewLineContext.class,0);
		}
		public SectionDeclarationContext sectionDeclaration() {
			return getRuleContext(SectionDeclarationContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public SpecialCharactersContext specialCharacters() {
			return getRuleContext(SpecialCharactersContext.class,0);
		}
		public ForBlockContext forBlock() {
			return getRuleContext(ForBlockContext.class,0);
		}
		public IfThenElseContext ifThenElse() {
			return getRuleContext(IfThenElseContext.class,0);
		}
		public SubsubsectionDeclarationContext subsubsectionDeclaration() {
			return getRuleContext(SubsubsectionDeclarationContext.class,0);
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
		enterRule(_localctx, 30, RULE_member);
		try {
			setState(428);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(399); specialCharacters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(400); title();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(401); table();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(402); abstractBlock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(403); textRules();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(404); figureBlock();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(405); supplementaryFigureBlock();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(406); algorithmBlock();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(407); algorithmicBlock();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(408); input();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(409); output();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(410); state();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(411); forBlock();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(412); ifBlock();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(413); returnBlock();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(414); captionBlock();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(415); multicolsBlock();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(416); label();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(417); descriptionList();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(418); sectionDeclaration();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(419); subsectionDeclaration();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(420); subsubsectionDeclaration();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(421); renewcommandDeclaration();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(422); citeReferences();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(423); ref();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(424); newLine();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(425); url();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(426); ifThenElse();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(427); authorItemMiss();
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
		enterRule(_localctx, 32, RULE_landScapeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430); match(T__61);
			setState(431); memberList();
			setState(432); match(T__2);
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
		public CommaContext comma() {
			return getRuleContext(CommaContext.class,0);
		}
		public DotsContext dots() {
			return getRuleContext(DotsContext.class,0);
		}
		public MulticolumnContext multicolumn() {
			return getRuleContext(MulticolumnContext.class,0);
		}
		public TextformatingBlockFlushLeftContext textformatingBlockFlushLeft() {
			return getRuleContext(TextformatingBlockFlushLeftContext.class,0);
		}
		public SimpleTextContext simpleText(int i) {
			return getRuleContext(SimpleTextContext.class,i);
		}
		public MeasuresContext measures() {
			return getRuleContext(MeasuresContext.class,0);
		}
		public TexttypeDeclaratorContext texttypeDeclarator() {
			return getRuleContext(TexttypeDeclaratorContext.class,0);
		}
		public ParagraphContext paragraph() {
			return getRuleContext(ParagraphContext.class,0);
		}
		public TextformatingBlockCenterContext textformatingBlockCenter() {
			return getRuleContext(TextformatingBlockCenterContext.class,0);
		}
		public DollarBlockContext dollarBlock() {
			return getRuleContext(DollarBlockContext.class,0);
		}
		public List<SimpleTextContext> simpleText() {
			return getRuleContexts(SimpleTextContext.class);
		}
		public TextSCContext textSC() {
			return getRuleContext(TextSCContext.class,0);
		}
		public InlineEquationContext inlineEquation() {
			return getRuleContext(InlineEquationContext.class,0);
		}
		public ArabicContext arabic() {
			return getRuleContext(ArabicContext.class,0);
		}
		public IdentificatorContext identificator() {
			return getRuleContext(IdentificatorContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ColonContext colon() {
			return getRuleContext(ColonContext.class,0);
		}
		public EquationBlockContext equationBlock() {
			return getRuleContext(EquationBlockContext.class,0);
		}
		public DisplayEquationContext displayEquation() {
			return getRuleContext(DisplayEquationContext.class,0);
		}
		public TextSymbolsContext textSymbols() {
			return getRuleContext(TextSymbolsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public LandScapeBlockContext landScapeBlock() {
			return getRuleContext(LandScapeBlockContext.class,0);
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
		enterRule(_localctx, 34, RULE_textRules);
		try {
			int _alt;
			setState(460);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(434); dollarBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(435); textSymbols();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(436); landScapeBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(437); inlineEquation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(438); equationBlock();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(439); displayEquation();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(440); paragraph();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(441); list();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(442); textformatingBlockFlushLeft();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(443); textformatingBlockCenter();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(444); textSC();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(445); block();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(446); texttypeDeclarator();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(447); interval();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(448); measures();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(450); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(449); simpleText();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(452); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(454); arabic();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(455); identificator();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(456); multicolumn();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(457); dots();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(458); comma();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(459); colon();
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
		public LparenContext lparen() {
			return getRuleContext(LparenContext.class,0);
		}
		public DotContext dot() {
			return getRuleContext(DotContext.class,0);
		}
		public RparenContext rparen() {
			return getRuleContext(RparenContext.class,0);
		}
		public ApposContext appos() {
			return getRuleContext(ApposContext.class,0);
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
		enterRule(_localctx, 36, RULE_textSymbols);
		try {
			setState(470);
			switch (_input.LA(1)) {
			case T__87:
				enterOuterAlt(_localctx, 1);
				{
				setState(462); dot();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(463); appos();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 3);
				{
				setState(464); lparen();
				}
				break;
			case T__117:
				enterOuterAlt(_localctx, 4);
				{
				setState(465); rparen();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 5);
				{
				setState(466); match(SUB);
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 6);
				{
				setState(467); match(DIV);
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 7);
				{
				setState(468); match(MUL);
				}
				break;
			case T__115:
				enterOuterAlt(_localctx, 8);
				{
				setState(469); match(T__115);
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
		enterRule(_localctx, 38, RULE_paragraph);
		int _la;
		try {
			setState(490);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(472); match(T__8);
				setState(473); match(T__29);
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__128) | (1L << T__126) | (1L << T__124) | (1L << T__123) | (1L << T__122) | (1L << T__119) | (1L << T__118) | (1L << T__117) | (1L << T__115) | (1L << T__114) | (1L << T__113) | (1L << T__111) | (1L << T__110) | (1L << T__109) | (1L << T__108) | (1L << T__103) | (1L << T__102) | (1L << T__101) | (1L << T__100) | (1L << T__99) | (1L << T__98) | (1L << T__97) | (1L << T__96) | (1L << T__95) | (1L << T__94) | (1L << T__93) | (1L << T__91) | (1L << T__88) | (1L << T__87) | (1L << T__86) | (1L << T__85) | (1L << T__84) | (1L << T__83) | (1L << T__82) | (1L << T__80) | (1L << T__79) | (1L << T__78) | (1L << T__77) | (1L << T__75) | (1L << T__74) | (1L << T__72) | (1L << T__70) | (1L << T__68) | (1L << T__67) | (1L << T__66))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__63 - 66)) | (1L << (T__61 - 66)) | (1L << (T__59 - 66)) | (1L << (T__57 - 66)) | (1L << (T__56 - 66)) | (1L << (T__54 - 66)) | (1L << (T__53 - 66)) | (1L << (T__52 - 66)) | (1L << (T__48 - 66)) | (1L << (T__46 - 66)) | (1L << (T__45 - 66)) | (1L << (T__43 - 66)) | (1L << (T__42 - 66)) | (1L << (T__41 - 66)) | (1L << (T__39 - 66)) | (1L << (T__37 - 66)) | (1L << (T__36 - 66)) | (1L << (T__35 - 66)) | (1L << (T__34 - 66)) | (1L << (T__33 - 66)) | (1L << (T__32 - 66)) | (1L << (T__31 - 66)) | (1L << (T__29 - 66)) | (1L << (T__28 - 66)) | (1L << (T__27 - 66)) | (1L << (T__25 - 66)) | (1L << (T__24 - 66)) | (1L << (T__21 - 66)) | (1L << (T__20 - 66)) | (1L << (T__18 - 66)) | (1L << (T__17 - 66)) | (1L << (T__15 - 66)) | (1L << (T__14 - 66)) | (1L << (T__13 - 66)) | (1L << (T__12 - 66)) | (1L << (T__10 - 66)) | (1L << (T__9 - 66)) | (1L << (T__8 - 66)) | (1L << (T__4 - 66)) | (1L << (T__3 - 66)) | (1L << (T__1 - 66)) | (1L << (T__0 - 66)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (String - 132)) | (1L << (Num - 132)) | (1L << (TILDE - 132)) | (1L << (COLON - 132)) | (1L << (SUB - 132)) | (1L << (MUL - 132)) | (1L << (DIV - 132)))) != 0)) {
					{
					{
					setState(474); memberList();
					}
					}
					setState(479);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(480); match(T__120);
				}
				}
				break;
			case T__101:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(481); match(T__101);
				setState(482); match(T__29);
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__128) | (1L << T__126) | (1L << T__124) | (1L << T__123) | (1L << T__122) | (1L << T__119) | (1L << T__118) | (1L << T__117) | (1L << T__115) | (1L << T__114) | (1L << T__113) | (1L << T__111) | (1L << T__110) | (1L << T__109) | (1L << T__108) | (1L << T__103) | (1L << T__102) | (1L << T__101) | (1L << T__100) | (1L << T__99) | (1L << T__98) | (1L << T__97) | (1L << T__96) | (1L << T__95) | (1L << T__94) | (1L << T__93) | (1L << T__91) | (1L << T__88) | (1L << T__87) | (1L << T__86) | (1L << T__85) | (1L << T__84) | (1L << T__83) | (1L << T__82) | (1L << T__80) | (1L << T__79) | (1L << T__78) | (1L << T__77) | (1L << T__75) | (1L << T__74) | (1L << T__72) | (1L << T__70) | (1L << T__68) | (1L << T__67) | (1L << T__66))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__63 - 66)) | (1L << (T__61 - 66)) | (1L << (T__59 - 66)) | (1L << (T__57 - 66)) | (1L << (T__56 - 66)) | (1L << (T__54 - 66)) | (1L << (T__53 - 66)) | (1L << (T__52 - 66)) | (1L << (T__48 - 66)) | (1L << (T__46 - 66)) | (1L << (T__45 - 66)) | (1L << (T__43 - 66)) | (1L << (T__42 - 66)) | (1L << (T__41 - 66)) | (1L << (T__39 - 66)) | (1L << (T__37 - 66)) | (1L << (T__36 - 66)) | (1L << (T__35 - 66)) | (1L << (T__34 - 66)) | (1L << (T__33 - 66)) | (1L << (T__32 - 66)) | (1L << (T__31 - 66)) | (1L << (T__29 - 66)) | (1L << (T__28 - 66)) | (1L << (T__27 - 66)) | (1L << (T__25 - 66)) | (1L << (T__24 - 66)) | (1L << (T__21 - 66)) | (1L << (T__20 - 66)) | (1L << (T__18 - 66)) | (1L << (T__17 - 66)) | (1L << (T__15 - 66)) | (1L << (T__14 - 66)) | (1L << (T__13 - 66)) | (1L << (T__12 - 66)) | (1L << (T__10 - 66)) | (1L << (T__9 - 66)) | (1L << (T__8 - 66)) | (1L << (T__4 - 66)) | (1L << (T__3 - 66)) | (1L << (T__1 - 66)) | (1L << (T__0 - 66)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (String - 132)) | (1L << (Num - 132)) | (1L << (TILDE - 132)) | (1L << (COLON - 132)) | (1L << (SUB - 132)) | (1L << (MUL - 132)) | (1L << (DIV - 132)))) != 0)) {
					{
					{
					setState(483); memberList();
					}
					}
					setState(488);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(489); match(T__120);
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
		public TextBodyContext textBody(int i) {
			return getRuleContext(TextBodyContext.class,i);
		}
		public List<TextBodyContext> textBody() {
			return getRuleContexts(TextBodyContext.class);
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
		enterRule(_localctx, 40, RULE_text);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(492); textBody();
			setState(496);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(493); textBody();
					}
					} 
				}
				setState(498);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
		public CommaContext comma() {
			return getRuleContext(CommaContext.class,0);
		}
		public BoxBlockContext boxBlock() {
			return getRuleContext(BoxBlockContext.class,0);
		}
		public TexttypeDeclaratorContext texttypeDeclarator() {
			return getRuleContext(TexttypeDeclaratorContext.class,0);
		}
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public ColonContext colon() {
			return getRuleContext(ColonContext.class,0);
		}
		public DollarBlockContext dollarBlock() {
			return getRuleContext(DollarBlockContext.class,0);
		}
		public SimpleTextContext simpleText() {
			return getRuleContext(SimpleTextContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TextSymbolsContext textSymbols() {
			return getRuleContext(TextSymbolsContext.class,0);
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
		enterRule(_localctx, 42, RULE_textBody);
		try {
			setState(509);
			switch (_input.LA(1)) {
			case T__50:
				enterOuterAlt(_localctx, 1);
				{
				setState(499); boxBlock();
				}
				break;
			case T__119:
			case T__98:
			case T__93:
			case T__82:
			case T__74:
			case T__70:
			case T__66:
			case T__52:
			case T__17:
			case T__13:
			case T__12:
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(500); texttypeDeclarator();
				}
				break;
			case String:
			case Num:
				enterOuterAlt(_localctx, 3);
				{
				setState(501); simpleText();
				}
				break;
			case T__117:
			case T__115:
			case T__87:
			case T__35:
			case T__14:
			case SUB:
			case MUL:
			case DIV:
				enterOuterAlt(_localctx, 4);
				{
				setState(502); textSymbols();
				}
				break;
			case T__91:
				enterOuterAlt(_localctx, 5);
				{
				setState(503); dollarBlock();
				}
				break;
			case T__34:
			case T__29:
				enterOuterAlt(_localctx, 6);
				{
				setState(504); block();
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 7);
				{
				setState(505); colon();
				}
				break;
			case T__103:
				enterOuterAlt(_localctx, 8);
				{
				setState(506); comma();
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 9);
				{
				setState(507); url();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 10);
				{
				setState(508); match(T__36);
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
		enterRule(_localctx, 44, RULE_textSC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511); match(T__126);
			setState(512); block();
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
		enterRule(_localctx, 46, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514); match(T__77);
			setState(515); match(T__29);
			setState(516); text();
			setState(517); match(T__120);
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
		enterRule(_localctx, 48, RULE_boxBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519); match(T__50);
			setState(520); block();
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
		enterRule(_localctx, 50, RULE_abstractBlock);
		int _la;
		try {
			setState(532);
			switch (_input.LA(1)) {
			case T__79:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(522); match(T__79);
				setState(526);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__128) | (1L << T__126) | (1L << T__124) | (1L << T__123) | (1L << T__122) | (1L << T__119) | (1L << T__118) | (1L << T__117) | (1L << T__115) | (1L << T__114) | (1L << T__113) | (1L << T__111) | (1L << T__110) | (1L << T__109) | (1L << T__108) | (1L << T__103) | (1L << T__102) | (1L << T__101) | (1L << T__100) | (1L << T__99) | (1L << T__98) | (1L << T__97) | (1L << T__96) | (1L << T__95) | (1L << T__94) | (1L << T__93) | (1L << T__91) | (1L << T__88) | (1L << T__87) | (1L << T__86) | (1L << T__85) | (1L << T__84) | (1L << T__83) | (1L << T__82) | (1L << T__80) | (1L << T__79) | (1L << T__78) | (1L << T__77) | (1L << T__75) | (1L << T__74) | (1L << T__72) | (1L << T__70) | (1L << T__68) | (1L << T__67) | (1L << T__66))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__63 - 66)) | (1L << (T__61 - 66)) | (1L << (T__59 - 66)) | (1L << (T__57 - 66)) | (1L << (T__56 - 66)) | (1L << (T__54 - 66)) | (1L << (T__53 - 66)) | (1L << (T__52 - 66)) | (1L << (T__48 - 66)) | (1L << (T__46 - 66)) | (1L << (T__45 - 66)) | (1L << (T__43 - 66)) | (1L << (T__42 - 66)) | (1L << (T__41 - 66)) | (1L << (T__39 - 66)) | (1L << (T__37 - 66)) | (1L << (T__36 - 66)) | (1L << (T__35 - 66)) | (1L << (T__34 - 66)) | (1L << (T__33 - 66)) | (1L << (T__32 - 66)) | (1L << (T__31 - 66)) | (1L << (T__29 - 66)) | (1L << (T__28 - 66)) | (1L << (T__27 - 66)) | (1L << (T__25 - 66)) | (1L << (T__24 - 66)) | (1L << (T__21 - 66)) | (1L << (T__20 - 66)) | (1L << (T__18 - 66)) | (1L << (T__17 - 66)) | (1L << (T__15 - 66)) | (1L << (T__14 - 66)) | (1L << (T__13 - 66)) | (1L << (T__12 - 66)) | (1L << (T__10 - 66)) | (1L << (T__9 - 66)) | (1L << (T__8 - 66)) | (1L << (T__4 - 66)) | (1L << (T__3 - 66)) | (1L << (T__1 - 66)) | (1L << (T__0 - 66)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (String - 132)) | (1L << (Num - 132)) | (1L << (TILDE - 132)) | (1L << (COLON - 132)) | (1L << (SUB - 132)) | (1L << (MUL - 132)) | (1L << (DIV - 132)))) != 0)) {
					{
					{
					setState(523); memberList();
					}
					}
					setState(528);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(529); match(T__51);
				}
				}
				break;
			case T__80:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(530); match(T__80);
				setState(531); block();
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
		enterRule(_localctx, 52, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534); match(T__68);
			setState(535); block();
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
		public List<OptionsContext> options() {
			return getRuleContexts(OptionsContext.class);
		}
		public OptionsContext options(int i) {
			return getRuleContext(OptionsContext.class,i);
		}
		public CommandBodyContext commandBody() {
			return getRuleContext(CommandBodyContext.class,0);
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
		enterRule(_localctx, 54, RULE_newcommandDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(537); match(T__90);
			setState(538); match(T__29);
			setState(539); identificator();
			setState(540); match(T__120);
			setState(544);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(541); options();
					}
					} 
				}
				setState(546);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			setState(547); commandBody();
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
		enterRule(_localctx, 56, RULE_commandBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(549);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==T__36) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(552); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__128) | (1L << T__127) | (1L << T__126) | (1L << T__125) | (1L << T__124) | (1L << T__123) | (1L << T__122) | (1L << T__121) | (1L << T__120) | (1L << T__119) | (1L << T__118) | (1L << T__117) | (1L << T__116) | (1L << T__115) | (1L << T__114) | (1L << T__113) | (1L << T__112) | (1L << T__111) | (1L << T__110) | (1L << T__109) | (1L << T__108) | (1L << T__107) | (1L << T__106) | (1L << T__105) | (1L << T__104) | (1L << T__103) | (1L << T__102) | (1L << T__101) | (1L << T__100) | (1L << T__99) | (1L << T__98) | (1L << T__97) | (1L << T__96) | (1L << T__95) | (1L << T__94) | (1L << T__93) | (1L << T__92) | (1L << T__91) | (1L << T__90) | (1L << T__89) | (1L << T__88) | (1L << T__87) | (1L << T__86) | (1L << T__85) | (1L << T__84) | (1L << T__83) | (1L << T__82) | (1L << T__81) | (1L << T__80) | (1L << T__79) | (1L << T__78) | (1L << T__77) | (1L << T__76) | (1L << T__75) | (1L << T__74) | (1L << T__73) | (1L << T__72) | (1L << T__71) | (1L << T__70) | (1L << T__69) | (1L << T__68) | (1L << T__67) | (1L << T__66))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__65 - 64)) | (1L << (T__64 - 64)) | (1L << (T__63 - 64)) | (1L << (T__62 - 64)) | (1L << (T__61 - 64)) | (1L << (T__60 - 64)) | (1L << (T__59 - 64)) | (1L << (T__58 - 64)) | (1L << (T__57 - 64)) | (1L << (T__56 - 64)) | (1L << (T__55 - 64)) | (1L << (T__54 - 64)) | (1L << (T__53 - 64)) | (1L << (T__52 - 64)) | (1L << (T__51 - 64)) | (1L << (T__50 - 64)) | (1L << (T__49 - 64)) | (1L << (T__48 - 64)) | (1L << (T__47 - 64)) | (1L << (T__46 - 64)) | (1L << (T__45 - 64)) | (1L << (T__44 - 64)) | (1L << (T__43 - 64)) | (1L << (T__42 - 64)) | (1L << (T__41 - 64)) | (1L << (T__40 - 64)) | (1L << (T__39 - 64)) | (1L << (T__38 - 64)) | (1L << (T__37 - 64)) | (1L << (T__35 - 64)) | (1L << (T__34 - 64)) | (1L << (T__33 - 64)) | (1L << (T__32 - 64)) | (1L << (T__31 - 64)) | (1L << (T__30 - 64)) | (1L << (T__29 - 64)) | (1L << (T__28 - 64)) | (1L << (T__27 - 64)) | (1L << (T__26 - 64)) | (1L << (T__25 - 64)) | (1L << (T__24 - 64)) | (1L << (T__23 - 64)) | (1L << (T__22 - 64)) | (1L << (T__21 - 64)) | (1L << (T__20 - 64)) | (1L << (T__19 - 64)) | (1L << (T__18 - 64)) | (1L << (T__17 - 64)) | (1L << (T__16 - 64)) | (1L << (T__15 - 64)) | (1L << (T__14 - 64)) | (1L << (T__13 - 64)) | (1L << (T__12 - 64)) | (1L << (T__11 - 64)) | (1L << (T__10 - 64)) | (1L << (T__9 - 64)) | (1L << (T__8 - 64)) | (1L << (T__7 - 64)) | (1L << (T__6 - 64)) | (1L << (T__5 - 64)) | (1L << (T__4 - 64)) | (1L << (T__3 - 64)) | (1L << (T__2 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__1 - 128)) | (1L << (T__0 - 128)) | (1L << (IgnoreAlgorithmKeyWords - 128)) | (1L << (IgnoreUrlPrefix - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (INT - 128)) | (1L << (ASSIGN - 128)) | (1L << (GT - 128)) | (1L << (LT - 128)) | (1L << (BANG - 128)) | (1L << (TILDE - 128)) | (1L << (QUESTION - 128)) | (1L << (COLON - 128)) | (1L << (EQUAL - 128)) | (1L << (LE - 128)) | (1L << (GE - 128)) | (1L << (NOTEQUAL - 128)) | (1L << (AND - 128)) | (1L << (OR - 128)) | (1L << (INC - 128)) | (1L << (DEC - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)) | (1L << (DIV - 128)) | (1L << (BITAND - 128)) | (1L << (BITOR - 128)) | (1L << (CARET - 128)) | (1L << (MOD - 128)) | (1L << (COMMENT - 128)) | (1L << (LINE_COMMENT - 128)) | (1L << (WS - 128)) | (1L << (WORDS_TO_SKIP - 128)) | (1L << (Skip - 128)) | (1L << (Affil - 128)))) != 0) );
			setState(554); match(T__36);
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
		public List<OptionsContext> options() {
			return getRuleContexts(OptionsContext.class);
		}
		public OptionsContext options(int i) {
			return getRuleContext(OptionsContext.class,i);
		}
		public CommandBodyContext commandBody() {
			return getRuleContext(CommandBodyContext.class,0);
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
		enterRule(_localctx, 58, RULE_renewcommandDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(556); match(T__124);
			setState(557); match(T__29);
			setState(558); identificator();
			setState(559); match(T__120);
			setState(563);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(560); options();
					}
					} 
				}
				setState(565);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			setState(566); commandBody();
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
		enterRule(_localctx, 60, RULE_identificator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568); match(T__110);
			setState(569); simpleText();
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
		enterRule(_localctx, 62, RULE_block);
		int _la;
		try {
			setState(587);
			switch (_input.LA(1)) {
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(571); match(T__29);
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__128) | (1L << T__126) | (1L << T__124) | (1L << T__123) | (1L << T__122) | (1L << T__119) | (1L << T__118) | (1L << T__117) | (1L << T__115) | (1L << T__114) | (1L << T__113) | (1L << T__111) | (1L << T__110) | (1L << T__109) | (1L << T__108) | (1L << T__103) | (1L << T__102) | (1L << T__101) | (1L << T__100) | (1L << T__99) | (1L << T__98) | (1L << T__97) | (1L << T__96) | (1L << T__95) | (1L << T__94) | (1L << T__93) | (1L << T__91) | (1L << T__88) | (1L << T__87) | (1L << T__86) | (1L << T__85) | (1L << T__84) | (1L << T__83) | (1L << T__82) | (1L << T__80) | (1L << T__79) | (1L << T__78) | (1L << T__77) | (1L << T__75) | (1L << T__74) | (1L << T__72) | (1L << T__70) | (1L << T__68) | (1L << T__67) | (1L << T__66))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__63 - 66)) | (1L << (T__61 - 66)) | (1L << (T__59 - 66)) | (1L << (T__57 - 66)) | (1L << (T__56 - 66)) | (1L << (T__54 - 66)) | (1L << (T__53 - 66)) | (1L << (T__52 - 66)) | (1L << (T__48 - 66)) | (1L << (T__46 - 66)) | (1L << (T__45 - 66)) | (1L << (T__43 - 66)) | (1L << (T__42 - 66)) | (1L << (T__41 - 66)) | (1L << (T__39 - 66)) | (1L << (T__37 - 66)) | (1L << (T__36 - 66)) | (1L << (T__35 - 66)) | (1L << (T__34 - 66)) | (1L << (T__33 - 66)) | (1L << (T__32 - 66)) | (1L << (T__31 - 66)) | (1L << (T__29 - 66)) | (1L << (T__28 - 66)) | (1L << (T__27 - 66)) | (1L << (T__25 - 66)) | (1L << (T__24 - 66)) | (1L << (T__21 - 66)) | (1L << (T__20 - 66)) | (1L << (T__18 - 66)) | (1L << (T__17 - 66)) | (1L << (T__15 - 66)) | (1L << (T__14 - 66)) | (1L << (T__13 - 66)) | (1L << (T__12 - 66)) | (1L << (T__10 - 66)) | (1L << (T__9 - 66)) | (1L << (T__8 - 66)) | (1L << (T__4 - 66)) | (1L << (T__3 - 66)) | (1L << (T__1 - 66)) | (1L << (T__0 - 66)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (String - 132)) | (1L << (Num - 132)) | (1L << (TILDE - 132)) | (1L << (COLON - 132)) | (1L << (SUB - 132)) | (1L << (MUL - 132)) | (1L << (DIV - 132)))) != 0)) {
					{
					{
					setState(572); memberList();
					}
					}
					setState(577);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(578); match(T__120);
				}
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(579); match(T__34);
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__128) | (1L << T__126) | (1L << T__124) | (1L << T__123) | (1L << T__122) | (1L << T__119) | (1L << T__118) | (1L << T__117) | (1L << T__115) | (1L << T__114) | (1L << T__113) | (1L << T__111) | (1L << T__110) | (1L << T__109) | (1L << T__108) | (1L << T__103) | (1L << T__102) | (1L << T__101) | (1L << T__100) | (1L << T__99) | (1L << T__98) | (1L << T__97) | (1L << T__96) | (1L << T__95) | (1L << T__94) | (1L << T__93) | (1L << T__91) | (1L << T__88) | (1L << T__87) | (1L << T__86) | (1L << T__85) | (1L << T__84) | (1L << T__83) | (1L << T__82) | (1L << T__80) | (1L << T__79) | (1L << T__78) | (1L << T__77) | (1L << T__75) | (1L << T__74) | (1L << T__72) | (1L << T__70) | (1L << T__68) | (1L << T__67) | (1L << T__66))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__63 - 66)) | (1L << (T__61 - 66)) | (1L << (T__59 - 66)) | (1L << (T__57 - 66)) | (1L << (T__56 - 66)) | (1L << (T__54 - 66)) | (1L << (T__53 - 66)) | (1L << (T__52 - 66)) | (1L << (T__48 - 66)) | (1L << (T__46 - 66)) | (1L << (T__45 - 66)) | (1L << (T__43 - 66)) | (1L << (T__42 - 66)) | (1L << (T__41 - 66)) | (1L << (T__39 - 66)) | (1L << (T__37 - 66)) | (1L << (T__36 - 66)) | (1L << (T__35 - 66)) | (1L << (T__34 - 66)) | (1L << (T__33 - 66)) | (1L << (T__32 - 66)) | (1L << (T__31 - 66)) | (1L << (T__29 - 66)) | (1L << (T__28 - 66)) | (1L << (T__27 - 66)) | (1L << (T__25 - 66)) | (1L << (T__24 - 66)) | (1L << (T__21 - 66)) | (1L << (T__20 - 66)) | (1L << (T__18 - 66)) | (1L << (T__17 - 66)) | (1L << (T__15 - 66)) | (1L << (T__14 - 66)) | (1L << (T__13 - 66)) | (1L << (T__12 - 66)) | (1L << (T__10 - 66)) | (1L << (T__9 - 66)) | (1L << (T__8 - 66)) | (1L << (T__4 - 66)) | (1L << (T__3 - 66)) | (1L << (T__1 - 66)) | (1L << (T__0 - 66)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (String - 132)) | (1L << (Num - 132)) | (1L << (TILDE - 132)) | (1L << (COLON - 132)) | (1L << (SUB - 132)) | (1L << (MUL - 132)) | (1L << (DIV - 132)))) != 0)) {
					{
					{
					setState(580); memberList();
					}
					}
					setState(585);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(586); match(T__19);
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
		public List<MemberListContext> memberList() {
			return getRuleContexts(MemberListContext.class);
		}
		public TerminalNode INT() { return getToken(LaTEXParser.INT, 0); }
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
		enterRule(_localctx, 64, RULE_multicolsBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589); match(T__118);
			setState(590); match(T__29);
			setState(591); match(INT);
			setState(592); match(T__120);
			setState(596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__128) | (1L << T__126) | (1L << T__124) | (1L << T__123) | (1L << T__122) | (1L << T__119) | (1L << T__118) | (1L << T__117) | (1L << T__115) | (1L << T__114) | (1L << T__113) | (1L << T__111) | (1L << T__110) | (1L << T__109) | (1L << T__108) | (1L << T__103) | (1L << T__102) | (1L << T__101) | (1L << T__100) | (1L << T__99) | (1L << T__98) | (1L << T__97) | (1L << T__96) | (1L << T__95) | (1L << T__94) | (1L << T__93) | (1L << T__91) | (1L << T__88) | (1L << T__87) | (1L << T__86) | (1L << T__85) | (1L << T__84) | (1L << T__83) | (1L << T__82) | (1L << T__80) | (1L << T__79) | (1L << T__78) | (1L << T__77) | (1L << T__75) | (1L << T__74) | (1L << T__72) | (1L << T__70) | (1L << T__68) | (1L << T__67) | (1L << T__66))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__63 - 66)) | (1L << (T__61 - 66)) | (1L << (T__59 - 66)) | (1L << (T__57 - 66)) | (1L << (T__56 - 66)) | (1L << (T__54 - 66)) | (1L << (T__53 - 66)) | (1L << (T__52 - 66)) | (1L << (T__48 - 66)) | (1L << (T__46 - 66)) | (1L << (T__45 - 66)) | (1L << (T__43 - 66)) | (1L << (T__42 - 66)) | (1L << (T__41 - 66)) | (1L << (T__39 - 66)) | (1L << (T__37 - 66)) | (1L << (T__36 - 66)) | (1L << (T__35 - 66)) | (1L << (T__34 - 66)) | (1L << (T__33 - 66)) | (1L << (T__32 - 66)) | (1L << (T__31 - 66)) | (1L << (T__29 - 66)) | (1L << (T__28 - 66)) | (1L << (T__27 - 66)) | (1L << (T__25 - 66)) | (1L << (T__24 - 66)) | (1L << (T__21 - 66)) | (1L << (T__20 - 66)) | (1L << (T__18 - 66)) | (1L << (T__17 - 66)) | (1L << (T__15 - 66)) | (1L << (T__14 - 66)) | (1L << (T__13 - 66)) | (1L << (T__12 - 66)) | (1L << (T__10 - 66)) | (1L << (T__9 - 66)) | (1L << (T__8 - 66)) | (1L << (T__4 - 66)) | (1L << (T__3 - 66)) | (1L << (T__1 - 66)) | (1L << (T__0 - 66)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (String - 132)) | (1L << (Num - 132)) | (1L << (TILDE - 132)) | (1L << (COLON - 132)) | (1L << (SUB - 132)) | (1L << (MUL - 132)) | (1L << (DIV - 132)))) != 0)) {
				{
				{
				setState(593); memberList();
				}
				}
				setState(598);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(599); match(T__5);
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
		public List<OptionsContext> options() {
			return getRuleContexts(OptionsContext.class);
		}
		public ItemsContext items() {
			return getRuleContext(ItemsContext.class,0);
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
		enterRule(_localctx, 66, RULE_list);
		int _la;
		try {
			setState(615);
			switch (_input.LA(1)) {
			case T__114:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(601); match(T__114);
				setState(605);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__69) {
					{
					{
					setState(602); options();
					}
					}
					setState(607);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(608); items();
				setState(609); match(T__11);
				}
				}
				break;
			case T__85:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(611); match(T__85);
				setState(612); items();
				setState(613); match(T__107);
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
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
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
		enterRule(_localctx, 68, RULE_items);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__89 || _la==T__36) {
				{
				{
				setState(617); item();
				}
				}
				setState(622);
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
		enterRule(_localctx, 70, RULE_item);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__36) {
				{
				{
				setState(623); match(T__36);
				}
				}
				setState(628);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(629); match(T__89);
			setState(633);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(630); memberList();
					}
					} 
				}
				setState(635);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
		enterRule(_localctx, 72, RULE_descriptionList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(636); match(T__42);
			setState(637); descriptionItems();
			setState(638); match(T__23);
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
		enterRule(_localctx, 74, RULE_descriptionItems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__89 || _la==T__36) {
				{
				{
				setState(640); descriptionItem();
				}
				}
				setState(645);
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
		public List<MemberListContext> memberList() {
			return getRuleContexts(MemberListContext.class);
		}
		public MemberListContext memberList(int i) {
			return getRuleContext(MemberListContext.class,i);
		}
		public DescriptionTitleContext descriptionTitle() {
			return getRuleContext(DescriptionTitleContext.class,0);
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
		enterRule(_localctx, 76, RULE_descriptionItem);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__36) {
				{
				{
				setState(646); match(T__36);
				}
				}
				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(652); match(T__89);
			setState(653); descriptionTitle();
			setState(657);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(654); memberList();
					}
					} 
				}
				setState(659);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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
		enterRule(_localctx, 78, RULE_descriptionTitle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660); match(T__69);
			setState(664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__128) | (1L << T__126) | (1L << T__124) | (1L << T__123) | (1L << T__122) | (1L << T__119) | (1L << T__118) | (1L << T__117) | (1L << T__115) | (1L << T__114) | (1L << T__113) | (1L << T__111) | (1L << T__110) | (1L << T__109) | (1L << T__108) | (1L << T__103) | (1L << T__102) | (1L << T__101) | (1L << T__100) | (1L << T__99) | (1L << T__98) | (1L << T__97) | (1L << T__96) | (1L << T__95) | (1L << T__94) | (1L << T__93) | (1L << T__91) | (1L << T__88) | (1L << T__87) | (1L << T__86) | (1L << T__85) | (1L << T__84) | (1L << T__83) | (1L << T__82) | (1L << T__80) | (1L << T__79) | (1L << T__78) | (1L << T__77) | (1L << T__75) | (1L << T__74) | (1L << T__72) | (1L << T__70) | (1L << T__68) | (1L << T__67) | (1L << T__66))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__63 - 66)) | (1L << (T__61 - 66)) | (1L << (T__59 - 66)) | (1L << (T__57 - 66)) | (1L << (T__56 - 66)) | (1L << (T__54 - 66)) | (1L << (T__53 - 66)) | (1L << (T__52 - 66)) | (1L << (T__48 - 66)) | (1L << (T__46 - 66)) | (1L << (T__45 - 66)) | (1L << (T__43 - 66)) | (1L << (T__42 - 66)) | (1L << (T__41 - 66)) | (1L << (T__39 - 66)) | (1L << (T__37 - 66)) | (1L << (T__36 - 66)) | (1L << (T__35 - 66)) | (1L << (T__34 - 66)) | (1L << (T__33 - 66)) | (1L << (T__32 - 66)) | (1L << (T__31 - 66)) | (1L << (T__29 - 66)) | (1L << (T__28 - 66)) | (1L << (T__27 - 66)) | (1L << (T__25 - 66)) | (1L << (T__24 - 66)) | (1L << (T__21 - 66)) | (1L << (T__20 - 66)) | (1L << (T__18 - 66)) | (1L << (T__17 - 66)) | (1L << (T__15 - 66)) | (1L << (T__14 - 66)) | (1L << (T__13 - 66)) | (1L << (T__12 - 66)) | (1L << (T__10 - 66)) | (1L << (T__9 - 66)) | (1L << (T__8 - 66)) | (1L << (T__4 - 66)) | (1L << (T__3 - 66)) | (1L << (T__1 - 66)) | (1L << (T__0 - 66)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (String - 132)) | (1L << (Num - 132)) | (1L << (TILDE - 132)) | (1L << (COLON - 132)) | (1L << (SUB - 132)) | (1L << (MUL - 132)) | (1L << (DIV - 132)))) != 0)) {
				{
				{
				setState(661); memberList();
				}
				}
				setState(666);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(667); match(T__38);
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
		public List<NewLineContext> newLine() {
			return getRuleContexts(NewLineContext.class);
		}
		public OptionsContext options() {
			return getRuleContext(OptionsContext.class,0);
		}
		public NewLineContext newLine(int i) {
			return getRuleContext(NewLineContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		enterRule(_localctx, 80, RULE_captionBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669); match(T__86);
			setState(671);
			_la = _input.LA(1);
			if (_la==T__69) {
				{
				setState(670); options();
				}
			}

			setState(676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__36 || _la==T__28) {
				{
				{
				setState(673); newLine();
				}
				}
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(679); block();
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
		public OptionsContext options() {
			return getRuleContext(OptionsContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TabularContext tabular() {
			return getRuleContext(TabularContext.class,0);
		}
		public TableCaptionContext tableCaption() {
			return getRuleContext(TableCaptionContext.class,0);
		}
		public TableDefinitionContext tableDefinition() {
			return getRuleContext(TableDefinitionContext.class,0);
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
		enterRule(_localctx, 82, RULE_table);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(681); match(T__96);
			setState(683);
			_la = _input.LA(1);
			if (_la==T__69) {
				{
				setState(682); options();
				}
			}

			setState(688);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(685); match(T__36);
					}
					} 
				}
				setState(690);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			setState(694);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__55) {
				{
				{
				setState(691); match(T__55);
				}
				}
				setState(696);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__36) {
				{
				{
				setState(697); match(T__36);
				}
				}
				setState(702);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(703); tableCaption();
			setState(707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__36) {
				{
				{
				setState(704); match(T__36);
				}
				}
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(710); tabular();
			setState(714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__36) {
				{
				{
				setState(711); match(T__36);
				}
				}
				setState(716);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(717); tableDefinition();
			setState(721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__36) {
				{
				{
				setState(718); match(T__36);
				}
				}
				setState(723);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(724); label();
			setState(728);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(725); match(T__36);
					}
					} 
				}
				setState(730);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			setState(734);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__127) {
				{
				{
				setState(731); match(T__127);
				}
				}
				setState(736);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(740);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__36) {
				{
				{
				setState(737); match(T__36);
				}
				}
				setState(742);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(743); match(T__125);
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
		enterRule(_localctx, 84, RULE_tableCaption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745); match(T__86);
			setState(746); block();
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
		public TableRowContext tableRow(int i) {
			return getRuleContext(TableRowContext.class,i);
		}
		public List<TableRowContext> tableRow() {
			return getRuleContexts(TableRowContext.class);
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
		enterRule(_localctx, 86, RULE_tabular);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(748); match(T__105);
			setState(749); tableSkipBlock();
			setState(753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__36) {
				{
				{
				setState(750); match(T__36);
				}
				}
				setState(755);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(756); match(T__71);
			setState(760);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(757); match(T__36);
					}
					} 
				}
				setState(762);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			setState(767); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(763); tableRow();
				setState(764); match(T__106);
				setState(765); match(T__36);
				}
				}
				setState(769); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__128) | (1L << T__126) | (1L << T__124) | (1L << T__123) | (1L << T__122) | (1L << T__119) | (1L << T__118) | (1L << T__117) | (1L << T__115) | (1L << T__114) | (1L << T__113) | (1L << T__111) | (1L << T__110) | (1L << T__109) | (1L << T__108) | (1L << T__103) | (1L << T__102) | (1L << T__101) | (1L << T__100) | (1L << T__99) | (1L << T__98) | (1L << T__97) | (1L << T__96) | (1L << T__95) | (1L << T__94) | (1L << T__93) | (1L << T__91) | (1L << T__88) | (1L << T__87) | (1L << T__86) | (1L << T__85) | (1L << T__84) | (1L << T__83) | (1L << T__82) | (1L << T__80) | (1L << T__79) | (1L << T__78) | (1L << T__77) | (1L << T__75) | (1L << T__74) | (1L << T__72) | (1L << T__70) | (1L << T__68) | (1L << T__67) | (1L << T__66))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__63 - 66)) | (1L << (T__61 - 66)) | (1L << (T__59 - 66)) | (1L << (T__57 - 66)) | (1L << (T__56 - 66)) | (1L << (T__54 - 66)) | (1L << (T__53 - 66)) | (1L << (T__52 - 66)) | (1L << (T__48 - 66)) | (1L << (T__46 - 66)) | (1L << (T__45 - 66)) | (1L << (T__43 - 66)) | (1L << (T__42 - 66)) | (1L << (T__41 - 66)) | (1L << (T__39 - 66)) | (1L << (T__37 - 66)) | (1L << (T__36 - 66)) | (1L << (T__35 - 66)) | (1L << (T__34 - 66)) | (1L << (T__33 - 66)) | (1L << (T__32 - 66)) | (1L << (T__31 - 66)) | (1L << (T__29 - 66)) | (1L << (T__28 - 66)) | (1L << (T__27 - 66)) | (1L << (T__25 - 66)) | (1L << (T__24 - 66)) | (1L << (T__21 - 66)) | (1L << (T__20 - 66)) | (1L << (T__18 - 66)) | (1L << (T__17 - 66)) | (1L << (T__15 - 66)) | (1L << (T__14 - 66)) | (1L << (T__13 - 66)) | (1L << (T__12 - 66)) | (1L << (T__10 - 66)) | (1L << (T__9 - 66)) | (1L << (T__8 - 66)) | (1L << (T__4 - 66)) | (1L << (T__3 - 66)) | (1L << (T__1 - 66)) | (1L << (T__0 - 66)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (String - 132)) | (1L << (Num - 132)) | (1L << (TILDE - 132)) | (1L << (COLON - 132)) | (1L << (SUB - 132)) | (1L << (MUL - 132)) | (1L << (DIV - 132)))) != 0) );
			setState(771); match(T__121);
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
		enterRule(_localctx, 88, RULE_tableSkipBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773); match(T__29);
			setState(775); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(774);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==T__120) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(777); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__128) | (1L << T__127) | (1L << T__126) | (1L << T__125) | (1L << T__124) | (1L << T__123) | (1L << T__122) | (1L << T__121) | (1L << T__119) | (1L << T__118) | (1L << T__117) | (1L << T__116) | (1L << T__115) | (1L << T__114) | (1L << T__113) | (1L << T__112) | (1L << T__111) | (1L << T__110) | (1L << T__109) | (1L << T__108) | (1L << T__107) | (1L << T__106) | (1L << T__105) | (1L << T__104) | (1L << T__103) | (1L << T__102) | (1L << T__101) | (1L << T__100) | (1L << T__99) | (1L << T__98) | (1L << T__97) | (1L << T__96) | (1L << T__95) | (1L << T__94) | (1L << T__93) | (1L << T__92) | (1L << T__91) | (1L << T__90) | (1L << T__89) | (1L << T__88) | (1L << T__87) | (1L << T__86) | (1L << T__85) | (1L << T__84) | (1L << T__83) | (1L << T__82) | (1L << T__81) | (1L << T__80) | (1L << T__79) | (1L << T__78) | (1L << T__77) | (1L << T__76) | (1L << T__75) | (1L << T__74) | (1L << T__73) | (1L << T__72) | (1L << T__71) | (1L << T__70) | (1L << T__69) | (1L << T__68) | (1L << T__67) | (1L << T__66))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__65 - 64)) | (1L << (T__64 - 64)) | (1L << (T__63 - 64)) | (1L << (T__62 - 64)) | (1L << (T__61 - 64)) | (1L << (T__60 - 64)) | (1L << (T__59 - 64)) | (1L << (T__58 - 64)) | (1L << (T__57 - 64)) | (1L << (T__56 - 64)) | (1L << (T__55 - 64)) | (1L << (T__54 - 64)) | (1L << (T__53 - 64)) | (1L << (T__52 - 64)) | (1L << (T__51 - 64)) | (1L << (T__50 - 64)) | (1L << (T__49 - 64)) | (1L << (T__48 - 64)) | (1L << (T__47 - 64)) | (1L << (T__46 - 64)) | (1L << (T__45 - 64)) | (1L << (T__44 - 64)) | (1L << (T__43 - 64)) | (1L << (T__42 - 64)) | (1L << (T__41 - 64)) | (1L << (T__40 - 64)) | (1L << (T__39 - 64)) | (1L << (T__38 - 64)) | (1L << (T__37 - 64)) | (1L << (T__36 - 64)) | (1L << (T__35 - 64)) | (1L << (T__34 - 64)) | (1L << (T__33 - 64)) | (1L << (T__32 - 64)) | (1L << (T__31 - 64)) | (1L << (T__30 - 64)) | (1L << (T__29 - 64)) | (1L << (T__28 - 64)) | (1L << (T__27 - 64)) | (1L << (T__26 - 64)) | (1L << (T__25 - 64)) | (1L << (T__24 - 64)) | (1L << (T__23 - 64)) | (1L << (T__22 - 64)) | (1L << (T__21 - 64)) | (1L << (T__20 - 64)) | (1L << (T__19 - 64)) | (1L << (T__18 - 64)) | (1L << (T__17 - 64)) | (1L << (T__16 - 64)) | (1L << (T__15 - 64)) | (1L << (T__14 - 64)) | (1L << (T__13 - 64)) | (1L << (T__12 - 64)) | (1L << (T__11 - 64)) | (1L << (T__10 - 64)) | (1L << (T__9 - 64)) | (1L << (T__8 - 64)) | (1L << (T__7 - 64)) | (1L << (T__6 - 64)) | (1L << (T__5 - 64)) | (1L << (T__4 - 64)) | (1L << (T__3 - 64)) | (1L << (T__2 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__1 - 128)) | (1L << (T__0 - 128)) | (1L << (IgnoreAlgorithmKeyWords - 128)) | (1L << (IgnoreUrlPrefix - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (INT - 128)) | (1L << (ASSIGN - 128)) | (1L << (GT - 128)) | (1L << (LT - 128)) | (1L << (BANG - 128)) | (1L << (TILDE - 128)) | (1L << (QUESTION - 128)) | (1L << (COLON - 128)) | (1L << (EQUAL - 128)) | (1L << (LE - 128)) | (1L << (GE - 128)) | (1L << (NOTEQUAL - 128)) | (1L << (AND - 128)) | (1L << (OR - 128)) | (1L << (INC - 128)) | (1L << (DEC - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)) | (1L << (DIV - 128)) | (1L << (BITAND - 128)) | (1L << (BITOR - 128)) | (1L << (CARET - 128)) | (1L << (MOD - 128)) | (1L << (COMMENT - 128)) | (1L << (LINE_COMMENT - 128)) | (1L << (WS - 128)) | (1L << (WORDS_TO_SKIP - 128)) | (1L << (Skip - 128)) | (1L << (Affil - 128)))) != 0) );
			setState(779); match(T__120);
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
		enterRule(_localctx, 90, RULE_tableDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781); match(T__0);
			setState(782); memberList();
			setState(783); match(T__26);
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
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TableSkipBlockContext tableSkipBlock() {
			return getRuleContext(TableSkipBlockContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
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
		enterRule(_localctx, 92, RULE_multicolumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785); match(T__46);
			setState(786); block();
			setState(787); tableSkipBlock();
			setState(789);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(788); block();
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
		public TableCellContext tableCell(int i) {
			return getRuleContext(TableCellContext.class,i);
		}
		public List<TableCellContext> tableCell() {
			return getRuleContexts(TableCellContext.class);
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
		enterRule(_localctx, 94, RULE_tableRow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791); tableCell();
			setState(796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(792); match(BITAND);
				setState(793); tableCell();
				}
				}
				setState(798);
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
		enterRule(_localctx, 96, RULE_tableCell);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(799); match(T__91);
				}
				break;
			}
			setState(802); memberList();
			setState(804);
			_la = _input.LA(1);
			if (_la==T__91) {
				{
				setState(803); match(T__91);
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
		public SmallcapsDeclarationContext smallcapsDeclaration() {
			return getRuleContext(SmallcapsDeclarationContext.class,0);
		}
		public BoldTypeDeclarationContext boldTypeDeclaration() {
			return getRuleContext(BoldTypeDeclarationContext.class,0);
		}
		public ItalictypeDeclarationContext italictypeDeclaration() {
			return getRuleContext(ItalictypeDeclarationContext.class,0);
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
		enterRule(_localctx, 98, RULE_texttypeDeclarator);
		int _la;
		try {
			setState(811);
			switch (_input.LA(1)) {
			case T__93:
			case T__74:
			case T__52:
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(806); italictypeDeclaration();
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 2);
				{
				setState(807); smallcapsDeclaration();
				}
				break;
			case T__98:
			case T__13:
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(808); boldTypeDeclaration();
				}
				break;
			case T__119:
			case T__82:
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(809);
				_la = _input.LA(1);
				if ( !(_la==T__119 || _la==T__82 || _la==T__12) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case T__70:
				enterOuterAlt(_localctx, 5);
				{
				setState(810); ttStyle();
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
		enterRule(_localctx, 100, RULE_ttStyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813); match(T__70);
			setState(817);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__128) | (1L << T__126) | (1L << T__124) | (1L << T__123) | (1L << T__122) | (1L << T__119) | (1L << T__118) | (1L << T__117) | (1L << T__115) | (1L << T__114) | (1L << T__113) | (1L << T__111) | (1L << T__110) | (1L << T__109) | (1L << T__108) | (1L << T__103) | (1L << T__102) | (1L << T__101) | (1L << T__100) | (1L << T__99) | (1L << T__98) | (1L << T__97) | (1L << T__96) | (1L << T__95) | (1L << T__94) | (1L << T__93) | (1L << T__91) | (1L << T__88) | (1L << T__87) | (1L << T__86) | (1L << T__85) | (1L << T__84) | (1L << T__83) | (1L << T__82) | (1L << T__80) | (1L << T__79) | (1L << T__78) | (1L << T__77) | (1L << T__75) | (1L << T__74) | (1L << T__72) | (1L << T__70) | (1L << T__68) | (1L << T__67) | (1L << T__66))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__63 - 66)) | (1L << (T__61 - 66)) | (1L << (T__59 - 66)) | (1L << (T__57 - 66)) | (1L << (T__56 - 66)) | (1L << (T__54 - 66)) | (1L << (T__53 - 66)) | (1L << (T__52 - 66)) | (1L << (T__48 - 66)) | (1L << (T__46 - 66)) | (1L << (T__45 - 66)) | (1L << (T__43 - 66)) | (1L << (T__42 - 66)) | (1L << (T__41 - 66)) | (1L << (T__39 - 66)) | (1L << (T__37 - 66)) | (1L << (T__36 - 66)) | (1L << (T__35 - 66)) | (1L << (T__34 - 66)) | (1L << (T__33 - 66)) | (1L << (T__32 - 66)) | (1L << (T__31 - 66)) | (1L << (T__29 - 66)) | (1L << (T__28 - 66)) | (1L << (T__27 - 66)) | (1L << (T__25 - 66)) | (1L << (T__24 - 66)) | (1L << (T__21 - 66)) | (1L << (T__20 - 66)) | (1L << (T__18 - 66)) | (1L << (T__17 - 66)) | (1L << (T__15 - 66)) | (1L << (T__14 - 66)) | (1L << (T__13 - 66)) | (1L << (T__12 - 66)) | (1L << (T__10 - 66)) | (1L << (T__9 - 66)) | (1L << (T__8 - 66)) | (1L << (T__4 - 66)) | (1L << (T__3 - 66)) | (1L << (T__1 - 66)) | (1L << (T__0 - 66)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (String - 132)) | (1L << (Num - 132)) | (1L << (TILDE - 132)) | (1L << (COLON - 132)) | (1L << (SUB - 132)) | (1L << (MUL - 132)) | (1L << (DIV - 132)))) != 0)) {
				{
				{
				setState(814); memberList();
				}
				}
				setState(819);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(820); match(T__120);
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
		public List<MemberListContext> memberList() {
			return getRuleContexts(MemberListContext.class);
		}
		public MemberListContext memberList(int i) {
			return getRuleContext(MemberListContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		enterRule(_localctx, 102, RULE_boldTypeDeclaration);
		int _la;
		try {
			setState(841);
			switch (_input.LA(1)) {
			case T__98:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(822); match(T__98);
				setState(823); block();
				}
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(824); match(T__13);
				setState(828);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__128) | (1L << T__126) | (1L << T__124) | (1L << T__123) | (1L << T__122) | (1L << T__119) | (1L << T__118) | (1L << T__117) | (1L << T__115) | (1L << T__114) | (1L << T__113) | (1L << T__111) | (1L << T__110) | (1L << T__109) | (1L << T__108) | (1L << T__103) | (1L << T__102) | (1L << T__101) | (1L << T__100) | (1L << T__99) | (1L << T__98) | (1L << T__97) | (1L << T__96) | (1L << T__95) | (1L << T__94) | (1L << T__93) | (1L << T__91) | (1L << T__88) | (1L << T__87) | (1L << T__86) | (1L << T__85) | (1L << T__84) | (1L << T__83) | (1L << T__82) | (1L << T__80) | (1L << T__79) | (1L << T__78) | (1L << T__77) | (1L << T__75) | (1L << T__74) | (1L << T__72) | (1L << T__70) | (1L << T__68) | (1L << T__67) | (1L << T__66))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__63 - 66)) | (1L << (T__61 - 66)) | (1L << (T__59 - 66)) | (1L << (T__57 - 66)) | (1L << (T__56 - 66)) | (1L << (T__54 - 66)) | (1L << (T__53 - 66)) | (1L << (T__52 - 66)) | (1L << (T__48 - 66)) | (1L << (T__46 - 66)) | (1L << (T__45 - 66)) | (1L << (T__43 - 66)) | (1L << (T__42 - 66)) | (1L << (T__41 - 66)) | (1L << (T__39 - 66)) | (1L << (T__37 - 66)) | (1L << (T__36 - 66)) | (1L << (T__35 - 66)) | (1L << (T__34 - 66)) | (1L << (T__33 - 66)) | (1L << (T__32 - 66)) | (1L << (T__31 - 66)) | (1L << (T__29 - 66)) | (1L << (T__28 - 66)) | (1L << (T__27 - 66)) | (1L << (T__25 - 66)) | (1L << (T__24 - 66)) | (1L << (T__21 - 66)) | (1L << (T__20 - 66)) | (1L << (T__18 - 66)) | (1L << (T__17 - 66)) | (1L << (T__15 - 66)) | (1L << (T__14 - 66)) | (1L << (T__13 - 66)) | (1L << (T__12 - 66)) | (1L << (T__10 - 66)) | (1L << (T__9 - 66)) | (1L << (T__8 - 66)) | (1L << (T__4 - 66)) | (1L << (T__3 - 66)) | (1L << (T__1 - 66)) | (1L << (T__0 - 66)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (String - 132)) | (1L << (Num - 132)) | (1L << (TILDE - 132)) | (1L << (COLON - 132)) | (1L << (SUB - 132)) | (1L << (MUL - 132)) | (1L << (DIV - 132)))) != 0)) {
					{
					{
					setState(825); memberList();
					}
					}
					setState(830);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(831); match(T__120);
				}
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(832); match(T__1);
				setState(833); match(T__29);
				setState(837);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__128) | (1L << T__126) | (1L << T__124) | (1L << T__123) | (1L << T__122) | (1L << T__119) | (1L << T__118) | (1L << T__117) | (1L << T__115) | (1L << T__114) | (1L << T__113) | (1L << T__111) | (1L << T__110) | (1L << T__109) | (1L << T__108) | (1L << T__103) | (1L << T__102) | (1L << T__101) | (1L << T__100) | (1L << T__99) | (1L << T__98) | (1L << T__97) | (1L << T__96) | (1L << T__95) | (1L << T__94) | (1L << T__93) | (1L << T__91) | (1L << T__88) | (1L << T__87) | (1L << T__86) | (1L << T__85) | (1L << T__84) | (1L << T__83) | (1L << T__82) | (1L << T__80) | (1L << T__79) | (1L << T__78) | (1L << T__77) | (1L << T__75) | (1L << T__74) | (1L << T__72) | (1L << T__70) | (1L << T__68) | (1L << T__67) | (1L << T__66))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__63 - 66)) | (1L << (T__61 - 66)) | (1L << (T__59 - 66)) | (1L << (T__57 - 66)) | (1L << (T__56 - 66)) | (1L << (T__54 - 66)) | (1L << (T__53 - 66)) | (1L << (T__52 - 66)) | (1L << (T__48 - 66)) | (1L << (T__46 - 66)) | (1L << (T__45 - 66)) | (1L << (T__43 - 66)) | (1L << (T__42 - 66)) | (1L << (T__41 - 66)) | (1L << (T__39 - 66)) | (1L << (T__37 - 66)) | (1L << (T__36 - 66)) | (1L << (T__35 - 66)) | (1L << (T__34 - 66)) | (1L << (T__33 - 66)) | (1L << (T__32 - 66)) | (1L << (T__31 - 66)) | (1L << (T__29 - 66)) | (1L << (T__28 - 66)) | (1L << (T__27 - 66)) | (1L << (T__25 - 66)) | (1L << (T__24 - 66)) | (1L << (T__21 - 66)) | (1L << (T__20 - 66)) | (1L << (T__18 - 66)) | (1L << (T__17 - 66)) | (1L << (T__15 - 66)) | (1L << (T__14 - 66)) | (1L << (T__13 - 66)) | (1L << (T__12 - 66)) | (1L << (T__10 - 66)) | (1L << (T__9 - 66)) | (1L << (T__8 - 66)) | (1L << (T__4 - 66)) | (1L << (T__3 - 66)) | (1L << (T__1 - 66)) | (1L << (T__0 - 66)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (String - 132)) | (1L << (Num - 132)) | (1L << (TILDE - 132)) | (1L << (COLON - 132)) | (1L << (SUB - 132)) | (1L << (MUL - 132)) | (1L << (DIV - 132)))) != 0)) {
					{
					{
					setState(834); memberList();
					}
					}
					setState(839);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(840); match(T__120);
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
		enterRule(_localctx, 104, RULE_smallcapsDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843); match(T__66);
			setState(847);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__119) | (1L << T__117) | (1L << T__115) | (1L << T__103) | (1L << T__98) | (1L << T__93) | (1L << T__91) | (1L << T__87) | (1L << T__82) | (1L << T__74) | (1L << T__70) | (1L << T__66))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__59 - 70)) | (1L << (T__52 - 70)) | (1L << (T__50 - 70)) | (1L << (T__36 - 70)) | (1L << (T__35 - 70)) | (1L << (T__34 - 70)) | (1L << (T__29 - 70)) | (1L << (T__17 - 70)) | (1L << (T__14 - 70)) | (1L << (T__13 - 70)) | (1L << (T__12 - 70)) | (1L << (T__1 - 70)) | (1L << (String - 70)) | (1L << (Num - 70)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (COLON - 141)) | (1L << (SUB - 141)) | (1L << (MUL - 141)) | (1L << (DIV - 141)))) != 0)) {
				{
				{
				setState(844); text();
				}
				}
				setState(849);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(850); match(T__120);
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
		public ItalicOutBlockContext italicOutBlock() {
			return getRuleContext(ItalicOutBlockContext.class,0);
		}
		public ItalicBlockContext italicBlock() {
			return getRuleContext(ItalicBlockContext.class,0);
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
		enterRule(_localctx, 106, RULE_italictypeDeclaration);
		try {
			setState(854);
			switch (_input.LA(1)) {
			case T__52:
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(852); italicBlock();
				}
				break;
			case T__93:
			case T__74:
				enterOuterAlt(_localctx, 2);
				{
				setState(853); italicOutBlock();
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
		enterRule(_localctx, 108, RULE_italicBlock);
		int _la;
		try {
			setState(875);
			switch (_input.LA(1)) {
			case T__52:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(856); match(T__52);
				setState(860);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__128) | (1L << T__126) | (1L << T__124) | (1L << T__123) | (1L << T__122) | (1L << T__119) | (1L << T__118) | (1L << T__117) | (1L << T__115) | (1L << T__114) | (1L << T__113) | (1L << T__111) | (1L << T__110) | (1L << T__109) | (1L << T__108) | (1L << T__103) | (1L << T__102) | (1L << T__101) | (1L << T__100) | (1L << T__99) | (1L << T__98) | (1L << T__97) | (1L << T__96) | (1L << T__95) | (1L << T__94) | (1L << T__93) | (1L << T__91) | (1L << T__88) | (1L << T__87) | (1L << T__86) | (1L << T__85) | (1L << T__84) | (1L << T__83) | (1L << T__82) | (1L << T__80) | (1L << T__79) | (1L << T__78) | (1L << T__77) | (1L << T__75) | (1L << T__74) | (1L << T__72) | (1L << T__70) | (1L << T__68) | (1L << T__67) | (1L << T__66))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__63 - 66)) | (1L << (T__61 - 66)) | (1L << (T__59 - 66)) | (1L << (T__57 - 66)) | (1L << (T__56 - 66)) | (1L << (T__54 - 66)) | (1L << (T__53 - 66)) | (1L << (T__52 - 66)) | (1L << (T__48 - 66)) | (1L << (T__46 - 66)) | (1L << (T__45 - 66)) | (1L << (T__43 - 66)) | (1L << (T__42 - 66)) | (1L << (T__41 - 66)) | (1L << (T__39 - 66)) | (1L << (T__37 - 66)) | (1L << (T__36 - 66)) | (1L << (T__35 - 66)) | (1L << (T__34 - 66)) | (1L << (T__33 - 66)) | (1L << (T__32 - 66)) | (1L << (T__31 - 66)) | (1L << (T__29 - 66)) | (1L << (T__28 - 66)) | (1L << (T__27 - 66)) | (1L << (T__25 - 66)) | (1L << (T__24 - 66)) | (1L << (T__21 - 66)) | (1L << (T__20 - 66)) | (1L << (T__18 - 66)) | (1L << (T__17 - 66)) | (1L << (T__15 - 66)) | (1L << (T__14 - 66)) | (1L << (T__13 - 66)) | (1L << (T__12 - 66)) | (1L << (T__10 - 66)) | (1L << (T__9 - 66)) | (1L << (T__8 - 66)) | (1L << (T__4 - 66)) | (1L << (T__3 - 66)) | (1L << (T__1 - 66)) | (1L << (T__0 - 66)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (String - 132)) | (1L << (Num - 132)) | (1L << (TILDE - 132)) | (1L << (COLON - 132)) | (1L << (SUB - 132)) | (1L << (MUL - 132)) | (1L << (DIV - 132)))) != 0)) {
					{
					{
					setState(857); memberList();
					}
					}
					setState(862);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(863); match(T__120);
				}
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(864); match(T__17);
				setState(868);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__128) | (1L << T__126) | (1L << T__124) | (1L << T__123) | (1L << T__122) | (1L << T__119) | (1L << T__118) | (1L << T__117) | (1L << T__115) | (1L << T__114) | (1L << T__113) | (1L << T__111) | (1L << T__110) | (1L << T__109) | (1L << T__108) | (1L << T__103) | (1L << T__102) | (1L << T__101) | (1L << T__100) | (1L << T__99) | (1L << T__98) | (1L << T__97) | (1L << T__96) | (1L << T__95) | (1L << T__94) | (1L << T__93) | (1L << T__91) | (1L << T__88) | (1L << T__87) | (1L << T__86) | (1L << T__85) | (1L << T__84) | (1L << T__83) | (1L << T__82) | (1L << T__80) | (1L << T__79) | (1L << T__78) | (1L << T__77) | (1L << T__75) | (1L << T__74) | (1L << T__72) | (1L << T__70) | (1L << T__68) | (1L << T__67) | (1L << T__66))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__63 - 66)) | (1L << (T__61 - 66)) | (1L << (T__59 - 66)) | (1L << (T__57 - 66)) | (1L << (T__56 - 66)) | (1L << (T__54 - 66)) | (1L << (T__53 - 66)) | (1L << (T__52 - 66)) | (1L << (T__48 - 66)) | (1L << (T__46 - 66)) | (1L << (T__45 - 66)) | (1L << (T__43 - 66)) | (1L << (T__42 - 66)) | (1L << (T__41 - 66)) | (1L << (T__39 - 66)) | (1L << (T__37 - 66)) | (1L << (T__36 - 66)) | (1L << (T__35 - 66)) | (1L << (T__34 - 66)) | (1L << (T__33 - 66)) | (1L << (T__32 - 66)) | (1L << (T__31 - 66)) | (1L << (T__29 - 66)) | (1L << (T__28 - 66)) | (1L << (T__27 - 66)) | (1L << (T__25 - 66)) | (1L << (T__24 - 66)) | (1L << (T__21 - 66)) | (1L << (T__20 - 66)) | (1L << (T__18 - 66)) | (1L << (T__17 - 66)) | (1L << (T__15 - 66)) | (1L << (T__14 - 66)) | (1L << (T__13 - 66)) | (1L << (T__12 - 66)) | (1L << (T__10 - 66)) | (1L << (T__9 - 66)) | (1L << (T__8 - 66)) | (1L << (T__4 - 66)) | (1L << (T__3 - 66)) | (1L << (T__1 - 66)) | (1L << (T__0 - 66)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (String - 132)) | (1L << (Num - 132)) | (1L << (TILDE - 132)) | (1L << (COLON - 132)) | (1L << (SUB - 132)) | (1L << (MUL - 132)) | (1L << (DIV - 132)))) != 0)) {
					{
					{
					setState(865); memberList();
					}
					}
					setState(870);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(871); match(T__120);
				setState(873);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(872); match(T__110);
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
		enterRule(_localctx, 110, RULE_italicOutBlock);
		try {
			setState(881);
			switch (_input.LA(1)) {
			case T__93:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(877); match(T__93);
				setState(878); block();
				}
				}
				break;
			case T__74:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(879); match(T__74);
				setState(880); block();
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
		enterRule(_localctx, 112, RULE_textformatingBlockFlushLeft);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(883); match(T__0);
			setState(884); memberList();
			setState(885); match(T__26);
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
		enterRule(_localctx, 114, RULE_textformatingBlockCenter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887); match(T__72);
			setState(891);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__128) | (1L << T__126) | (1L << T__124) | (1L << T__123) | (1L << T__122) | (1L << T__119) | (1L << T__118) | (1L << T__117) | (1L << T__115) | (1L << T__114) | (1L << T__113) | (1L << T__111) | (1L << T__110) | (1L << T__109) | (1L << T__108) | (1L << T__103) | (1L << T__102) | (1L << T__101) | (1L << T__100) | (1L << T__99) | (1L << T__98) | (1L << T__97) | (1L << T__96) | (1L << T__95) | (1L << T__94) | (1L << T__93) | (1L << T__91) | (1L << T__88) | (1L << T__87) | (1L << T__86) | (1L << T__85) | (1L << T__84) | (1L << T__83) | (1L << T__82) | (1L << T__80) | (1L << T__79) | (1L << T__78) | (1L << T__77) | (1L << T__75) | (1L << T__74) | (1L << T__72) | (1L << T__70) | (1L << T__68) | (1L << T__67) | (1L << T__66))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__63 - 66)) | (1L << (T__61 - 66)) | (1L << (T__59 - 66)) | (1L << (T__57 - 66)) | (1L << (T__56 - 66)) | (1L << (T__54 - 66)) | (1L << (T__53 - 66)) | (1L << (T__52 - 66)) | (1L << (T__48 - 66)) | (1L << (T__46 - 66)) | (1L << (T__45 - 66)) | (1L << (T__43 - 66)) | (1L << (T__42 - 66)) | (1L << (T__41 - 66)) | (1L << (T__39 - 66)) | (1L << (T__37 - 66)) | (1L << (T__36 - 66)) | (1L << (T__35 - 66)) | (1L << (T__34 - 66)) | (1L << (T__33 - 66)) | (1L << (T__32 - 66)) | (1L << (T__31 - 66)) | (1L << (T__29 - 66)) | (1L << (T__28 - 66)) | (1L << (T__27 - 66)) | (1L << (T__25 - 66)) | (1L << (T__24 - 66)) | (1L << (T__21 - 66)) | (1L << (T__20 - 66)) | (1L << (T__18 - 66)) | (1L << (T__17 - 66)) | (1L << (T__15 - 66)) | (1L << (T__14 - 66)) | (1L << (T__13 - 66)) | (1L << (T__12 - 66)) | (1L << (T__10 - 66)) | (1L << (T__9 - 66)) | (1L << (T__8 - 66)) | (1L << (T__4 - 66)) | (1L << (T__3 - 66)) | (1L << (T__1 - 66)) | (1L << (T__0 - 66)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (String - 132)) | (1L << (Num - 132)) | (1L << (TILDE - 132)) | (1L << (COLON - 132)) | (1L << (SUB - 132)) | (1L << (MUL - 132)) | (1L << (DIV - 132)))) != 0)) {
				{
				{
				setState(888); memberList();
				}
				}
				setState(893);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(894); match(T__60);
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
		enterRule(_localctx, 116, RULE_sectionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(896);
			_la = _input.LA(1);
			if ( !(_la==T__113 || _la==T__15) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(897); match(T__29);
			setState(899);
			_la = _input.LA(1);
			if (_la==T__77) {
				{
				setState(898); label();
				}
			}

			setState(901); text();
			setState(902); match(T__120);
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
		enterRule(_localctx, 118, RULE_subsectionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(904);
			_la = _input.LA(1);
			if ( !(_la==T__67 || _la==T__18) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(905); match(T__29);
			setState(907);
			_la = _input.LA(1);
			if (_la==T__77) {
				{
				setState(906); label();
				}
			}

			setState(909); text();
			setState(910); match(T__120);
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
		enterRule(_localctx, 120, RULE_subsubsectionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(912);
			_la = _input.LA(1);
			if ( !(_la==T__102 || _la==T__45) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(913); match(T__29);
			setState(915);
			_la = _input.LA(1);
			if (_la==T__77) {
				{
				setState(914); label();
				}
			}

			setState(917); text();
			setState(918); match(T__120);
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
		public List<OptionsContext> options() {
			return getRuleContexts(OptionsContext.class);
		}
		public CiteReferencesListContext citeReferencesList() {
			return getRuleContext(CiteReferencesListContext.class,0);
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
		enterRule(_localctx, 122, RULE_citeReferences);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(921);
			_la = _input.LA(1);
			if (_la==TILDE) {
				{
				setState(920); match(TILDE);
				}
			}

			setState(923);
			_la = _input.LA(1);
			if ( !(_la==T__122 || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__63 - 66)) | (1L << (T__48 - 66)) | (1L << (T__32 - 66)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(927);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__69) {
				{
				{
				setState(924); options();
				}
				}
				setState(929);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(930); match(T__29);
			setState(931); citeReferencesList();
			setState(932); match(T__120);
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
		public CiteReferenceContext citeReference(int i) {
			return getRuleContext(CiteReferenceContext.class,i);
		}
		public List<CiteReferenceContext> citeReference() {
			return getRuleContexts(CiteReferenceContext.class);
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
		enterRule(_localctx, 124, RULE_citeReferencesList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(934); citeReference();
			setState(951);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__103) {
				{
				{
				setState(935); match(T__103);
				setState(939);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(936); match(T__36);
						}
						} 
					}
					setState(941);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				}
				setState(942); citeReference();
				setState(946);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__36) {
					{
					{
					setState(943); match(T__36);
					}
					}
					setState(948);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(953);
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
		public List<LparenContext> lparen() {
			return getRuleContexts(LparenContext.class);
		}
		public SimpleTextContext simpleText(int i) {
			return getRuleContext(SimpleTextContext.class,i);
		}
		public List<RparenContext> rparen() {
			return getRuleContexts(RparenContext.class);
		}
		public ColonContext colon(int i) {
			return getRuleContext(ColonContext.class,i);
		}
		public List<ColonContext> colon() {
			return getRuleContexts(ColonContext.class);
		}
		public List<SimpleTextContext> simpleText() {
			return getRuleContexts(SimpleTextContext.class);
		}
		public LparenContext lparen(int i) {
			return getRuleContext(LparenContext.class,i);
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
		enterRule(_localctx, 126, RULE_citeReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__117 || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (T__35 - 94)) | (1L << (String - 94)) | (1L << (Num - 94)) | (1L << (COLON - 94)))) != 0)) {
				{
				setState(958);
				switch (_input.LA(1)) {
				case String:
				case Num:
					{
					setState(954); simpleText();
					}
					break;
				case T__35:
					{
					setState(955); lparen();
					}
					break;
				case T__117:
					{
					setState(956); rparen();
					}
					break;
				case COLON:
					{
					setState(957); colon();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(962);
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
		enterRule(_localctx, 128, RULE_measures);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(963);
			_la = _input.LA(1);
			if ( !(_la==T__33 || _la==T__20) ) {
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
		public List<MemberListContext> memberList() {
			return getRuleContexts(MemberListContext.class);
		}
		public OptionsContext options() {
			return getRuleContext(OptionsContext.class,0);
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
		enterRule(_localctx, 130, RULE_figureBlock);
		int _la;
		try {
			setState(987);
			switch (_input.LA(1)) {
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(965); match(T__27);
				setState(967);
				_la = _input.LA(1);
				if (_la==T__69) {
					{
					setState(966); options();
					}
				}

				setState(972);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__128) | (1L << T__126) | (1L << T__124) | (1L << T__123) | (1L << T__122) | (1L << T__119) | (1L << T__118) | (1L << T__117) | (1L << T__115) | (1L << T__114) | (1L << T__113) | (1L << T__111) | (1L << T__110) | (1L << T__109) | (1L << T__108) | (1L << T__103) | (1L << T__102) | (1L << T__101) | (1L << T__100) | (1L << T__99) | (1L << T__98) | (1L << T__97) | (1L << T__96) | (1L << T__95) | (1L << T__94) | (1L << T__93) | (1L << T__91) | (1L << T__88) | (1L << T__87) | (1L << T__86) | (1L << T__85) | (1L << T__84) | (1L << T__83) | (1L << T__82) | (1L << T__80) | (1L << T__79) | (1L << T__78) | (1L << T__77) | (1L << T__75) | (1L << T__74) | (1L << T__72) | (1L << T__70) | (1L << T__68) | (1L << T__67) | (1L << T__66))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__63 - 66)) | (1L << (T__61 - 66)) | (1L << (T__59 - 66)) | (1L << (T__57 - 66)) | (1L << (T__56 - 66)) | (1L << (T__54 - 66)) | (1L << (T__53 - 66)) | (1L << (T__52 - 66)) | (1L << (T__48 - 66)) | (1L << (T__46 - 66)) | (1L << (T__45 - 66)) | (1L << (T__43 - 66)) | (1L << (T__42 - 66)) | (1L << (T__41 - 66)) | (1L << (T__39 - 66)) | (1L << (T__37 - 66)) | (1L << (T__36 - 66)) | (1L << (T__35 - 66)) | (1L << (T__34 - 66)) | (1L << (T__33 - 66)) | (1L << (T__32 - 66)) | (1L << (T__31 - 66)) | (1L << (T__29 - 66)) | (1L << (T__28 - 66)) | (1L << (T__27 - 66)) | (1L << (T__25 - 66)) | (1L << (T__24 - 66)) | (1L << (T__21 - 66)) | (1L << (T__20 - 66)) | (1L << (T__18 - 66)) | (1L << (T__17 - 66)) | (1L << (T__15 - 66)) | (1L << (T__14 - 66)) | (1L << (T__13 - 66)) | (1L << (T__12 - 66)) | (1L << (T__10 - 66)) | (1L << (T__9 - 66)) | (1L << (T__8 - 66)) | (1L << (T__4 - 66)) | (1L << (T__3 - 66)) | (1L << (T__1 - 66)) | (1L << (T__0 - 66)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (String - 132)) | (1L << (Num - 132)) | (1L << (TILDE - 132)) | (1L << (COLON - 132)) | (1L << (SUB - 132)) | (1L << (MUL - 132)) | (1L << (DIV - 132)))) != 0)) {
					{
					{
					setState(969); memberList();
					}
					}
					setState(974);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(975); match(T__47);
				}
				}
				break;
			case T__75:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(976); match(T__75);
				setState(978);
				_la = _input.LA(1);
				if (_la==T__69) {
					{
					setState(977); options();
					}
				}

				setState(983);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__128) | (1L << T__126) | (1L << T__124) | (1L << T__123) | (1L << T__122) | (1L << T__119) | (1L << T__118) | (1L << T__117) | (1L << T__115) | (1L << T__114) | (1L << T__113) | (1L << T__111) | (1L << T__110) | (1L << T__109) | (1L << T__108) | (1L << T__103) | (1L << T__102) | (1L << T__101) | (1L << T__100) | (1L << T__99) | (1L << T__98) | (1L << T__97) | (1L << T__96) | (1L << T__95) | (1L << T__94) | (1L << T__93) | (1L << T__91) | (1L << T__88) | (1L << T__87) | (1L << T__86) | (1L << T__85) | (1L << T__84) | (1L << T__83) | (1L << T__82) | (1L << T__80) | (1L << T__79) | (1L << T__78) | (1L << T__77) | (1L << T__75) | (1L << T__74) | (1L << T__72) | (1L << T__70) | (1L << T__68) | (1L << T__67) | (1L << T__66))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__63 - 66)) | (1L << (T__61 - 66)) | (1L << (T__59 - 66)) | (1L << (T__57 - 66)) | (1L << (T__56 - 66)) | (1L << (T__54 - 66)) | (1L << (T__53 - 66)) | (1L << (T__52 - 66)) | (1L << (T__48 - 66)) | (1L << (T__46 - 66)) | (1L << (T__45 - 66)) | (1L << (T__43 - 66)) | (1L << (T__42 - 66)) | (1L << (T__41 - 66)) | (1L << (T__39 - 66)) | (1L << (T__37 - 66)) | (1L << (T__36 - 66)) | (1L << (T__35 - 66)) | (1L << (T__34 - 66)) | (1L << (T__33 - 66)) | (1L << (T__32 - 66)) | (1L << (T__31 - 66)) | (1L << (T__29 - 66)) | (1L << (T__28 - 66)) | (1L << (T__27 - 66)) | (1L << (T__25 - 66)) | (1L << (T__24 - 66)) | (1L << (T__21 - 66)) | (1L << (T__20 - 66)) | (1L << (T__18 - 66)) | (1L << (T__17 - 66)) | (1L << (T__15 - 66)) | (1L << (T__14 - 66)) | (1L << (T__13 - 66)) | (1L << (T__12 - 66)) | (1L << (T__10 - 66)) | (1L << (T__9 - 66)) | (1L << (T__8 - 66)) | (1L << (T__4 - 66)) | (1L << (T__3 - 66)) | (1L << (T__1 - 66)) | (1L << (T__0 - 66)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (String - 132)) | (1L << (Num - 132)) | (1L << (TILDE - 132)) | (1L << (COLON - 132)) | (1L << (SUB - 132)) | (1L << (MUL - 132)) | (1L << (DIV - 132)))) != 0)) {
					{
					{
					setState(980); memberList();
					}
					}
					setState(985);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(986); match(T__104);
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
		public List<MemberListContext> memberList() {
			return getRuleContexts(MemberListContext.class);
		}
		public OptionsContext options() {
			return getRuleContext(OptionsContext.class,0);
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
		enterRule(_localctx, 132, RULE_supplementaryFigureBlock);
		int _la;
		try {
			setState(1011);
			switch (_input.LA(1)) {
			case T__94:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(989); match(T__94);
				setState(991);
				_la = _input.LA(1);
				if (_la==T__69) {
					{
					setState(990); options();
					}
				}

				setState(996);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__128) | (1L << T__126) | (1L << T__124) | (1L << T__123) | (1L << T__122) | (1L << T__119) | (1L << T__118) | (1L << T__117) | (1L << T__115) | (1L << T__114) | (1L << T__113) | (1L << T__111) | (1L << T__110) | (1L << T__109) | (1L << T__108) | (1L << T__103) | (1L << T__102) | (1L << T__101) | (1L << T__100) | (1L << T__99) | (1L << T__98) | (1L << T__97) | (1L << T__96) | (1L << T__95) | (1L << T__94) | (1L << T__93) | (1L << T__91) | (1L << T__88) | (1L << T__87) | (1L << T__86) | (1L << T__85) | (1L << T__84) | (1L << T__83) | (1L << T__82) | (1L << T__80) | (1L << T__79) | (1L << T__78) | (1L << T__77) | (1L << T__75) | (1L << T__74) | (1L << T__72) | (1L << T__70) | (1L << T__68) | (1L << T__67) | (1L << T__66))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__63 - 66)) | (1L << (T__61 - 66)) | (1L << (T__59 - 66)) | (1L << (T__57 - 66)) | (1L << (T__56 - 66)) | (1L << (T__54 - 66)) | (1L << (T__53 - 66)) | (1L << (T__52 - 66)) | (1L << (T__48 - 66)) | (1L << (T__46 - 66)) | (1L << (T__45 - 66)) | (1L << (T__43 - 66)) | (1L << (T__42 - 66)) | (1L << (T__41 - 66)) | (1L << (T__39 - 66)) | (1L << (T__37 - 66)) | (1L << (T__36 - 66)) | (1L << (T__35 - 66)) | (1L << (T__34 - 66)) | (1L << (T__33 - 66)) | (1L << (T__32 - 66)) | (1L << (T__31 - 66)) | (1L << (T__29 - 66)) | (1L << (T__28 - 66)) | (1L << (T__27 - 66)) | (1L << (T__25 - 66)) | (1L << (T__24 - 66)) | (1L << (T__21 - 66)) | (1L << (T__20 - 66)) | (1L << (T__18 - 66)) | (1L << (T__17 - 66)) | (1L << (T__15 - 66)) | (1L << (T__14 - 66)) | (1L << (T__13 - 66)) | (1L << (T__12 - 66)) | (1L << (T__10 - 66)) | (1L << (T__9 - 66)) | (1L << (T__8 - 66)) | (1L << (T__4 - 66)) | (1L << (T__3 - 66)) | (1L << (T__1 - 66)) | (1L << (T__0 - 66)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (String - 132)) | (1L << (Num - 132)) | (1L << (TILDE - 132)) | (1L << (COLON - 132)) | (1L << (SUB - 132)) | (1L << (MUL - 132)) | (1L << (DIV - 132)))) != 0)) {
					{
					{
					setState(993); memberList();
					}
					}
					setState(998);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(999); match(T__92);
				}
				}
				break;
			case T__95:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1000); match(T__95);
				setState(1002);
				_la = _input.LA(1);
				if (_la==T__69) {
					{
					setState(1001); options();
					}
				}

				setState(1007);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__128) | (1L << T__126) | (1L << T__124) | (1L << T__123) | (1L << T__122) | (1L << T__119) | (1L << T__118) | (1L << T__117) | (1L << T__115) | (1L << T__114) | (1L << T__113) | (1L << T__111) | (1L << T__110) | (1L << T__109) | (1L << T__108) | (1L << T__103) | (1L << T__102) | (1L << T__101) | (1L << T__100) | (1L << T__99) | (1L << T__98) | (1L << T__97) | (1L << T__96) | (1L << T__95) | (1L << T__94) | (1L << T__93) | (1L << T__91) | (1L << T__88) | (1L << T__87) | (1L << T__86) | (1L << T__85) | (1L << T__84) | (1L << T__83) | (1L << T__82) | (1L << T__80) | (1L << T__79) | (1L << T__78) | (1L << T__77) | (1L << T__75) | (1L << T__74) | (1L << T__72) | (1L << T__70) | (1L << T__68) | (1L << T__67) | (1L << T__66))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__63 - 66)) | (1L << (T__61 - 66)) | (1L << (T__59 - 66)) | (1L << (T__57 - 66)) | (1L << (T__56 - 66)) | (1L << (T__54 - 66)) | (1L << (T__53 - 66)) | (1L << (T__52 - 66)) | (1L << (T__48 - 66)) | (1L << (T__46 - 66)) | (1L << (T__45 - 66)) | (1L << (T__43 - 66)) | (1L << (T__42 - 66)) | (1L << (T__41 - 66)) | (1L << (T__39 - 66)) | (1L << (T__37 - 66)) | (1L << (T__36 - 66)) | (1L << (T__35 - 66)) | (1L << (T__34 - 66)) | (1L << (T__33 - 66)) | (1L << (T__32 - 66)) | (1L << (T__31 - 66)) | (1L << (T__29 - 66)) | (1L << (T__28 - 66)) | (1L << (T__27 - 66)) | (1L << (T__25 - 66)) | (1L << (T__24 - 66)) | (1L << (T__21 - 66)) | (1L << (T__20 - 66)) | (1L << (T__18 - 66)) | (1L << (T__17 - 66)) | (1L << (T__15 - 66)) | (1L << (T__14 - 66)) | (1L << (T__13 - 66)) | (1L << (T__12 - 66)) | (1L << (T__10 - 66)) | (1L << (T__9 - 66)) | (1L << (T__8 - 66)) | (1L << (T__4 - 66)) | (1L << (T__3 - 66)) | (1L << (T__1 - 66)) | (1L << (T__0 - 66)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (String - 132)) | (1L << (Num - 132)) | (1L << (TILDE - 132)) | (1L << (COLON - 132)) | (1L << (SUB - 132)) | (1L << (MUL - 132)) | (1L << (DIV - 132)))) != 0)) {
					{
					{
					setState(1004); memberList();
					}
					}
					setState(1009);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1010); match(T__22);
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
		public List<MemberListContext> memberList() {
			return getRuleContexts(MemberListContext.class);
		}
		public OptionsContext options() {
			return getRuleContext(OptionsContext.class,0);
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
		enterRule(_localctx, 134, RULE_algorithmBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1013); match(T__111);
			setState(1015);
			_la = _input.LA(1);
			if (_la==T__69) {
				{
				setState(1014); options();
				}
			}

			setState(1020);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__128) | (1L << T__126) | (1L << T__124) | (1L << T__123) | (1L << T__122) | (1L << T__119) | (1L << T__118) | (1L << T__117) | (1L << T__115) | (1L << T__114) | (1L << T__113) | (1L << T__111) | (1L << T__110) | (1L << T__109) | (1L << T__108) | (1L << T__103) | (1L << T__102) | (1L << T__101) | (1L << T__100) | (1L << T__99) | (1L << T__98) | (1L << T__97) | (1L << T__96) | (1L << T__95) | (1L << T__94) | (1L << T__93) | (1L << T__91) | (1L << T__88) | (1L << T__87) | (1L << T__86) | (1L << T__85) | (1L << T__84) | (1L << T__83) | (1L << T__82) | (1L << T__80) | (1L << T__79) | (1L << T__78) | (1L << T__77) | (1L << T__75) | (1L << T__74) | (1L << T__72) | (1L << T__70) | (1L << T__68) | (1L << T__67) | (1L << T__66))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__63 - 66)) | (1L << (T__61 - 66)) | (1L << (T__59 - 66)) | (1L << (T__57 - 66)) | (1L << (T__56 - 66)) | (1L << (T__54 - 66)) | (1L << (T__53 - 66)) | (1L << (T__52 - 66)) | (1L << (T__48 - 66)) | (1L << (T__46 - 66)) | (1L << (T__45 - 66)) | (1L << (T__43 - 66)) | (1L << (T__42 - 66)) | (1L << (T__41 - 66)) | (1L << (T__39 - 66)) | (1L << (T__37 - 66)) | (1L << (T__36 - 66)) | (1L << (T__35 - 66)) | (1L << (T__34 - 66)) | (1L << (T__33 - 66)) | (1L << (T__32 - 66)) | (1L << (T__31 - 66)) | (1L << (T__29 - 66)) | (1L << (T__28 - 66)) | (1L << (T__27 - 66)) | (1L << (T__25 - 66)) | (1L << (T__24 - 66)) | (1L << (T__21 - 66)) | (1L << (T__20 - 66)) | (1L << (T__18 - 66)) | (1L << (T__17 - 66)) | (1L << (T__15 - 66)) | (1L << (T__14 - 66)) | (1L << (T__13 - 66)) | (1L << (T__12 - 66)) | (1L << (T__10 - 66)) | (1L << (T__9 - 66)) | (1L << (T__8 - 66)) | (1L << (T__4 - 66)) | (1L << (T__3 - 66)) | (1L << (T__1 - 66)) | (1L << (T__0 - 66)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (String - 132)) | (1L << (Num - 132)) | (1L << (TILDE - 132)) | (1L << (COLON - 132)) | (1L << (SUB - 132)) | (1L << (MUL - 132)) | (1L << (DIV - 132)))) != 0)) {
				{
				{
				setState(1017); memberList();
				}
				}
				setState(1022);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1023); match(T__30);
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
		public List<MemberListContext> memberList() {
			return getRuleContexts(MemberListContext.class);
		}
		public OptionsContext options() {
			return getRuleContext(OptionsContext.class,0);
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
		enterRule(_localctx, 136, RULE_algorithmicBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1025); match(T__53);
			setState(1027);
			_la = _input.LA(1);
			if (_la==T__69) {
				{
				setState(1026); options();
				}
			}

			setState(1032);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__128) | (1L << T__126) | (1L << T__124) | (1L << T__123) | (1L << T__122) | (1L << T__119) | (1L << T__118) | (1L << T__117) | (1L << T__115) | (1L << T__114) | (1L << T__113) | (1L << T__111) | (1L << T__110) | (1L << T__109) | (1L << T__108) | (1L << T__103) | (1L << T__102) | (1L << T__101) | (1L << T__100) | (1L << T__99) | (1L << T__98) | (1L << T__97) | (1L << T__96) | (1L << T__95) | (1L << T__94) | (1L << T__93) | (1L << T__91) | (1L << T__88) | (1L << T__87) | (1L << T__86) | (1L << T__85) | (1L << T__84) | (1L << T__83) | (1L << T__82) | (1L << T__80) | (1L << T__79) | (1L << T__78) | (1L << T__77) | (1L << T__75) | (1L << T__74) | (1L << T__72) | (1L << T__70) | (1L << T__68) | (1L << T__67) | (1L << T__66))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__63 - 66)) | (1L << (T__61 - 66)) | (1L << (T__59 - 66)) | (1L << (T__57 - 66)) | (1L << (T__56 - 66)) | (1L << (T__54 - 66)) | (1L << (T__53 - 66)) | (1L << (T__52 - 66)) | (1L << (T__48 - 66)) | (1L << (T__46 - 66)) | (1L << (T__45 - 66)) | (1L << (T__43 - 66)) | (1L << (T__42 - 66)) | (1L << (T__41 - 66)) | (1L << (T__39 - 66)) | (1L << (T__37 - 66)) | (1L << (T__36 - 66)) | (1L << (T__35 - 66)) | (1L << (T__34 - 66)) | (1L << (T__33 - 66)) | (1L << (T__32 - 66)) | (1L << (T__31 - 66)) | (1L << (T__29 - 66)) | (1L << (T__28 - 66)) | (1L << (T__27 - 66)) | (1L << (T__25 - 66)) | (1L << (T__24 - 66)) | (1L << (T__21 - 66)) | (1L << (T__20 - 66)) | (1L << (T__18 - 66)) | (1L << (T__17 - 66)) | (1L << (T__15 - 66)) | (1L << (T__14 - 66)) | (1L << (T__13 - 66)) | (1L << (T__12 - 66)) | (1L << (T__10 - 66)) | (1L << (T__9 - 66)) | (1L << (T__8 - 66)) | (1L << (T__4 - 66)) | (1L << (T__3 - 66)) | (1L << (T__1 - 66)) | (1L << (T__0 - 66)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (String - 132)) | (1L << (Num - 132)) | (1L << (TILDE - 132)) | (1L << (COLON - 132)) | (1L << (SUB - 132)) | (1L << (MUL - 132)) | (1L << (DIV - 132)))) != 0)) {
				{
				{
				setState(1029); memberList();
				}
				}
				setState(1034);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1035); match(T__116);
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
		enterRule(_localctx, 138, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1037); match(T__54);
			setState(1038); block();
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
		enterRule(_localctx, 140, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1040); match(T__83);
			setState(1041); block();
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
		enterRule(_localctx, 142, RULE_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1043); match(T__97);
			setState(1047);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__128) | (1L << T__126) | (1L << T__123) | (1L << T__119) | (1L << T__117) | (1L << T__115) | (1L << T__114) | (1L << T__110) | (1L << T__103) | (1L << T__101) | (1L << T__100) | (1L << T__98) | (1L << T__93) | (1L << T__91) | (1L << T__88) | (1L << T__87) | (1L << T__85) | (1L << T__82) | (1L << T__78) | (1L << T__74) | (1L << T__72) | (1L << T__70) | (1L << T__66))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T__61 - 68)) | (1L << (T__56 - 68)) | (1L << (T__52 - 68)) | (1L << (T__46 - 68)) | (1L << (T__41 - 68)) | (1L << (T__35 - 68)) | (1L << (T__34 - 68)) | (1L << (T__33 - 68)) | (1L << (T__31 - 68)) | (1L << (T__29 - 68)) | (1L << (T__24 - 68)) | (1L << (T__21 - 68)) | (1L << (T__20 - 68)) | (1L << (T__17 - 68)) | (1L << (T__14 - 68)) | (1L << (T__13 - 68)) | (1L << (T__12 - 68)) | (1L << (T__10 - 68)) | (1L << (T__8 - 68)) | (1L << (T__3 - 68)) | (1L << (T__1 - 68)) | (1L << (T__0 - 68)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (String - 132)) | (1L << (Num - 132)) | (1L << (COLON - 132)) | (1L << (SUB - 132)) | (1L << (MUL - 132)) | (1L << (DIV - 132)))) != 0)) {
				{
				{
				setState(1044); textRules();
				}
				}
				setState(1049);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1050); newLine();
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
		enterRule(_localctx, 144, RULE_forBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1052); match(T__25);
			setState(1053); block();
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
		enterRule(_localctx, 146, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1055); match(T__99);
			setState(1056); block();
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
		enterRule(_localctx, 148, RULE_returnBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1058); match(T__37);
			setState(1062);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__128) | (1L << T__126) | (1L << T__123) | (1L << T__119) | (1L << T__117) | (1L << T__115) | (1L << T__114) | (1L << T__110) | (1L << T__103) | (1L << T__101) | (1L << T__100) | (1L << T__98) | (1L << T__93) | (1L << T__91) | (1L << T__88) | (1L << T__87) | (1L << T__85) | (1L << T__82) | (1L << T__78) | (1L << T__74) | (1L << T__72) | (1L << T__70) | (1L << T__66))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T__61 - 68)) | (1L << (T__56 - 68)) | (1L << (T__52 - 68)) | (1L << (T__46 - 68)) | (1L << (T__41 - 68)) | (1L << (T__35 - 68)) | (1L << (T__34 - 68)) | (1L << (T__33 - 68)) | (1L << (T__31 - 68)) | (1L << (T__29 - 68)) | (1L << (T__24 - 68)) | (1L << (T__21 - 68)) | (1L << (T__20 - 68)) | (1L << (T__17 - 68)) | (1L << (T__14 - 68)) | (1L << (T__13 - 68)) | (1L << (T__12 - 68)) | (1L << (T__10 - 68)) | (1L << (T__8 - 68)) | (1L << (T__3 - 68)) | (1L << (T__1 - 68)) | (1L << (T__0 - 68)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (String - 132)) | (1L << (Num - 132)) | (1L << (COLON - 132)) | (1L << (SUB - 132)) | (1L << (MUL - 132)) | (1L << (DIV - 132)))) != 0)) {
				{
				{
				setState(1059); textRules();
				}
				}
				setState(1064);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1065); newLine();
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
		enterRule(_localctx, 150, RULE_url);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1067); match(T__59);
			setState(1068); match(T__29);
			setState(1069); urlText();
			setState(1070); match(T__120);
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
		enterRule(_localctx, 152, RULE_urlText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1072); text();
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
		enterRule(_localctx, 154, RULE_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1074); match(T__69);
			setState(1078);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__128) | (1L << T__127) | (1L << T__126) | (1L << T__125) | (1L << T__124) | (1L << T__123) | (1L << T__122) | (1L << T__121) | (1L << T__120) | (1L << T__119) | (1L << T__118) | (1L << T__117) | (1L << T__116) | (1L << T__115) | (1L << T__114) | (1L << T__113) | (1L << T__112) | (1L << T__111) | (1L << T__110) | (1L << T__109) | (1L << T__108) | (1L << T__107) | (1L << T__106) | (1L << T__105) | (1L << T__104) | (1L << T__103) | (1L << T__102) | (1L << T__101) | (1L << T__100) | (1L << T__99) | (1L << T__98) | (1L << T__97) | (1L << T__96) | (1L << T__95) | (1L << T__94) | (1L << T__93) | (1L << T__92) | (1L << T__91) | (1L << T__90) | (1L << T__89) | (1L << T__88) | (1L << T__87) | (1L << T__86) | (1L << T__85) | (1L << T__84) | (1L << T__83) | (1L << T__82) | (1L << T__81) | (1L << T__80) | (1L << T__79) | (1L << T__78) | (1L << T__77) | (1L << T__76) | (1L << T__75) | (1L << T__74) | (1L << T__73) | (1L << T__72) | (1L << T__71) | (1L << T__70) | (1L << T__69) | (1L << T__68) | (1L << T__67) | (1L << T__66))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__65 - 64)) | (1L << (T__64 - 64)) | (1L << (T__63 - 64)) | (1L << (T__62 - 64)) | (1L << (T__61 - 64)) | (1L << (T__60 - 64)) | (1L << (T__59 - 64)) | (1L << (T__58 - 64)) | (1L << (T__57 - 64)) | (1L << (T__56 - 64)) | (1L << (T__55 - 64)) | (1L << (T__54 - 64)) | (1L << (T__53 - 64)) | (1L << (T__52 - 64)) | (1L << (T__51 - 64)) | (1L << (T__50 - 64)) | (1L << (T__49 - 64)) | (1L << (T__48 - 64)) | (1L << (T__47 - 64)) | (1L << (T__46 - 64)) | (1L << (T__45 - 64)) | (1L << (T__44 - 64)) | (1L << (T__43 - 64)) | (1L << (T__42 - 64)) | (1L << (T__41 - 64)) | (1L << (T__40 - 64)) | (1L << (T__39 - 64)) | (1L << (T__37 - 64)) | (1L << (T__36 - 64)) | (1L << (T__35 - 64)) | (1L << (T__34 - 64)) | (1L << (T__33 - 64)) | (1L << (T__32 - 64)) | (1L << (T__31 - 64)) | (1L << (T__30 - 64)) | (1L << (T__29 - 64)) | (1L << (T__28 - 64)) | (1L << (T__27 - 64)) | (1L << (T__26 - 64)) | (1L << (T__25 - 64)) | (1L << (T__24 - 64)) | (1L << (T__23 - 64)) | (1L << (T__22 - 64)) | (1L << (T__21 - 64)) | (1L << (T__20 - 64)) | (1L << (T__19 - 64)) | (1L << (T__18 - 64)) | (1L << (T__17 - 64)) | (1L << (T__16 - 64)) | (1L << (T__15 - 64)) | (1L << (T__14 - 64)) | (1L << (T__13 - 64)) | (1L << (T__12 - 64)) | (1L << (T__11 - 64)) | (1L << (T__10 - 64)) | (1L << (T__9 - 64)) | (1L << (T__8 - 64)) | (1L << (T__7 - 64)) | (1L << (T__6 - 64)) | (1L << (T__5 - 64)) | (1L << (T__4 - 64)) | (1L << (T__3 - 64)) | (1L << (T__2 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__1 - 128)) | (1L << (T__0 - 128)) | (1L << (IgnoreAlgorithmKeyWords - 128)) | (1L << (IgnoreUrlPrefix - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (INT - 128)) | (1L << (ASSIGN - 128)) | (1L << (GT - 128)) | (1L << (LT - 128)) | (1L << (BANG - 128)) | (1L << (TILDE - 128)) | (1L << (QUESTION - 128)) | (1L << (COLON - 128)) | (1L << (EQUAL - 128)) | (1L << (LE - 128)) | (1L << (GE - 128)) | (1L << (NOTEQUAL - 128)) | (1L << (AND - 128)) | (1L << (OR - 128)) | (1L << (INC - 128)) | (1L << (DEC - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)) | (1L << (DIV - 128)) | (1L << (BITAND - 128)) | (1L << (BITOR - 128)) | (1L << (CARET - 128)) | (1L << (MOD - 128)) | (1L << (COMMENT - 128)) | (1L << (LINE_COMMENT - 128)) | (1L << (WS - 128)) | (1L << (WORDS_TO_SKIP - 128)) | (1L << (Skip - 128)) | (1L << (Affil - 128)))) != 0)) {
				{
				{
				setState(1075);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==T__38) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(1080);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1081); match(T__38);
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
		enterRule(_localctx, 156, RULE_comma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1083); match(T__103);
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
		enterRule(_localctx, 158, RULE_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1085); match(T__87);
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
		enterRule(_localctx, 160, RULE_dots);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1087); match(T__56);
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
		enterRule(_localctx, 162, RULE_appos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1089); match(T__14);
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

	public static class ColonContext extends ParserRuleContext {
		public ColonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterColon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitColon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitColon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColonContext colon() throws RecognitionException {
		ColonContext _localctx = new ColonContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_colon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1091); match(COLON);
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
		enterRule(_localctx, 166, RULE_lparen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1093); match(T__35);
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
		enterRule(_localctx, 168, RULE_rparen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1095); match(T__117);
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
		enterRule(_localctx, 170, RULE_dollarBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1097); match(T__91);
			setState(1099);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__128) | (1L << T__127) | (1L << T__126) | (1L << T__125) | (1L << T__124) | (1L << T__123) | (1L << T__122) | (1L << T__121) | (1L << T__120) | (1L << T__119) | (1L << T__118) | (1L << T__117) | (1L << T__116) | (1L << T__115) | (1L << T__114) | (1L << T__113) | (1L << T__112) | (1L << T__111) | (1L << T__110) | (1L << T__109) | (1L << T__108) | (1L << T__107) | (1L << T__106) | (1L << T__105) | (1L << T__104) | (1L << T__103) | (1L << T__102) | (1L << T__101) | (1L << T__100) | (1L << T__99) | (1L << T__98) | (1L << T__97) | (1L << T__96) | (1L << T__95) | (1L << T__94) | (1L << T__93) | (1L << T__92) | (1L << T__90) | (1L << T__89) | (1L << T__88) | (1L << T__87) | (1L << T__86) | (1L << T__85) | (1L << T__84) | (1L << T__83) | (1L << T__82) | (1L << T__81) | (1L << T__80) | (1L << T__79) | (1L << T__78) | (1L << T__77) | (1L << T__76) | (1L << T__75) | (1L << T__74) | (1L << T__73) | (1L << T__72) | (1L << T__71) | (1L << T__70) | (1L << T__69) | (1L << T__68) | (1L << T__67) | (1L << T__66))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__65 - 64)) | (1L << (T__64 - 64)) | (1L << (T__63 - 64)) | (1L << (T__62 - 64)) | (1L << (T__61 - 64)) | (1L << (T__60 - 64)) | (1L << (T__59 - 64)) | (1L << (T__58 - 64)) | (1L << (T__57 - 64)) | (1L << (T__56 - 64)) | (1L << (T__55 - 64)) | (1L << (T__54 - 64)) | (1L << (T__53 - 64)) | (1L << (T__52 - 64)) | (1L << (T__51 - 64)) | (1L << (T__50 - 64)) | (1L << (T__49 - 64)) | (1L << (T__48 - 64)) | (1L << (T__47 - 64)) | (1L << (T__46 - 64)) | (1L << (T__45 - 64)) | (1L << (T__44 - 64)) | (1L << (T__43 - 64)) | (1L << (T__42 - 64)) | (1L << (T__41 - 64)) | (1L << (T__40 - 64)) | (1L << (T__39 - 64)) | (1L << (T__38 - 64)) | (1L << (T__37 - 64)) | (1L << (T__36 - 64)) | (1L << (T__35 - 64)) | (1L << (T__34 - 64)) | (1L << (T__33 - 64)) | (1L << (T__32 - 64)) | (1L << (T__31 - 64)) | (1L << (T__30 - 64)) | (1L << (T__29 - 64)) | (1L << (T__28 - 64)) | (1L << (T__27 - 64)) | (1L << (T__26 - 64)) | (1L << (T__25 - 64)) | (1L << (T__24 - 64)) | (1L << (T__23 - 64)) | (1L << (T__22 - 64)) | (1L << (T__21 - 64)) | (1L << (T__20 - 64)) | (1L << (T__19 - 64)) | (1L << (T__18 - 64)) | (1L << (T__17 - 64)) | (1L << (T__16 - 64)) | (1L << (T__15 - 64)) | (1L << (T__14 - 64)) | (1L << (T__13 - 64)) | (1L << (T__12 - 64)) | (1L << (T__11 - 64)) | (1L << (T__10 - 64)) | (1L << (T__9 - 64)) | (1L << (T__8 - 64)) | (1L << (T__7 - 64)) | (1L << (T__6 - 64)) | (1L << (T__5 - 64)) | (1L << (T__4 - 64)) | (1L << (T__3 - 64)) | (1L << (T__2 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__1 - 128)) | (1L << (T__0 - 128)) | (1L << (IgnoreAlgorithmKeyWords - 128)) | (1L << (IgnoreUrlPrefix - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (INT - 128)) | (1L << (ASSIGN - 128)) | (1L << (GT - 128)) | (1L << (LT - 128)) | (1L << (BANG - 128)) | (1L << (TILDE - 128)) | (1L << (QUESTION - 128)) | (1L << (COLON - 128)) | (1L << (EQUAL - 128)) | (1L << (LE - 128)) | (1L << (GE - 128)) | (1L << (NOTEQUAL - 128)) | (1L << (AND - 128)) | (1L << (OR - 128)) | (1L << (INC - 128)) | (1L << (DEC - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)) | (1L << (DIV - 128)) | (1L << (BITAND - 128)) | (1L << (BITOR - 128)) | (1L << (CARET - 128)) | (1L << (MOD - 128)) | (1L << (COMMENT - 128)) | (1L << (LINE_COMMENT - 128)) | (1L << (WS - 128)) | (1L << (WORDS_TO_SKIP - 128)) | (1L << (Skip - 128)) | (1L << (Affil - 128)))) != 0)) {
				{
				setState(1098);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==T__91) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(1101); match(T__91);
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
		public EqnArrayContext eqnArray() {
			return getRuleContext(EqnArrayContext.class,0);
		}
		public DollarBlockContext dollarBlock() {
			return getRuleContext(DollarBlockContext.class,0);
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
		enterRule(_localctx, 172, RULE_inlineEquation);
		int _la;
		try {
			setState(1140);
			switch (_input.LA(1)) {
			case T__128:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1103); match(T__128);
				setState(1105); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1104);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__128) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(1107); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__127) | (1L << T__126) | (1L << T__125) | (1L << T__124) | (1L << T__123) | (1L << T__122) | (1L << T__121) | (1L << T__120) | (1L << T__119) | (1L << T__118) | (1L << T__117) | (1L << T__116) | (1L << T__115) | (1L << T__114) | (1L << T__113) | (1L << T__112) | (1L << T__111) | (1L << T__110) | (1L << T__109) | (1L << T__108) | (1L << T__107) | (1L << T__106) | (1L << T__105) | (1L << T__104) | (1L << T__103) | (1L << T__102) | (1L << T__101) | (1L << T__100) | (1L << T__99) | (1L << T__98) | (1L << T__97) | (1L << T__96) | (1L << T__95) | (1L << T__94) | (1L << T__93) | (1L << T__92) | (1L << T__91) | (1L << T__90) | (1L << T__89) | (1L << T__88) | (1L << T__87) | (1L << T__86) | (1L << T__85) | (1L << T__84) | (1L << T__83) | (1L << T__82) | (1L << T__81) | (1L << T__80) | (1L << T__79) | (1L << T__78) | (1L << T__77) | (1L << T__76) | (1L << T__75) | (1L << T__74) | (1L << T__73) | (1L << T__72) | (1L << T__71) | (1L << T__70) | (1L << T__69) | (1L << T__68) | (1L << T__67) | (1L << T__66))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__65 - 64)) | (1L << (T__64 - 64)) | (1L << (T__63 - 64)) | (1L << (T__62 - 64)) | (1L << (T__61 - 64)) | (1L << (T__60 - 64)) | (1L << (T__59 - 64)) | (1L << (T__58 - 64)) | (1L << (T__57 - 64)) | (1L << (T__56 - 64)) | (1L << (T__55 - 64)) | (1L << (T__54 - 64)) | (1L << (T__53 - 64)) | (1L << (T__52 - 64)) | (1L << (T__51 - 64)) | (1L << (T__50 - 64)) | (1L << (T__49 - 64)) | (1L << (T__48 - 64)) | (1L << (T__47 - 64)) | (1L << (T__46 - 64)) | (1L << (T__45 - 64)) | (1L << (T__44 - 64)) | (1L << (T__43 - 64)) | (1L << (T__42 - 64)) | (1L << (T__41 - 64)) | (1L << (T__40 - 64)) | (1L << (T__39 - 64)) | (1L << (T__38 - 64)) | (1L << (T__37 - 64)) | (1L << (T__36 - 64)) | (1L << (T__35 - 64)) | (1L << (T__34 - 64)) | (1L << (T__33 - 64)) | (1L << (T__32 - 64)) | (1L << (T__31 - 64)) | (1L << (T__30 - 64)) | (1L << (T__29 - 64)) | (1L << (T__28 - 64)) | (1L << (T__27 - 64)) | (1L << (T__26 - 64)) | (1L << (T__25 - 64)) | (1L << (T__24 - 64)) | (1L << (T__23 - 64)) | (1L << (T__22 - 64)) | (1L << (T__21 - 64)) | (1L << (T__20 - 64)) | (1L << (T__19 - 64)) | (1L << (T__18 - 64)) | (1L << (T__17 - 64)) | (1L << (T__16 - 64)) | (1L << (T__15 - 64)) | (1L << (T__14 - 64)) | (1L << (T__13 - 64)) | (1L << (T__12 - 64)) | (1L << (T__11 - 64)) | (1L << (T__10 - 64)) | (1L << (T__9 - 64)) | (1L << (T__8 - 64)) | (1L << (T__7 - 64)) | (1L << (T__6 - 64)) | (1L << (T__5 - 64)) | (1L << (T__4 - 64)) | (1L << (T__3 - 64)) | (1L << (T__2 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__1 - 128)) | (1L << (T__0 - 128)) | (1L << (IgnoreAlgorithmKeyWords - 128)) | (1L << (IgnoreUrlPrefix - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (INT - 128)) | (1L << (ASSIGN - 128)) | (1L << (GT - 128)) | (1L << (LT - 128)) | (1L << (BANG - 128)) | (1L << (TILDE - 128)) | (1L << (QUESTION - 128)) | (1L << (COLON - 128)) | (1L << (EQUAL - 128)) | (1L << (LE - 128)) | (1L << (GE - 128)) | (1L << (NOTEQUAL - 128)) | (1L << (AND - 128)) | (1L << (OR - 128)) | (1L << (INC - 128)) | (1L << (DEC - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)) | (1L << (DIV - 128)) | (1L << (BITAND - 128)) | (1L << (BITOR - 128)) | (1L << (CARET - 128)) | (1L << (MOD - 128)) | (1L << (COMMENT - 128)) | (1L << (LINE_COMMENT - 128)) | (1L << (WS - 128)) | (1L << (WORDS_TO_SKIP - 128)) | (1L << (Skip - 128)) | (1L << (Affil - 128)))) != 0) );
				setState(1109); match(T__128);
				}
				}
				break;
			case T__91:
				enterOuterAlt(_localctx, 2);
				{
				setState(1110); dollarBlock();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1111); match(T__31);
				setState(1113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1112);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__64) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(1115); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__128) | (1L << T__127) | (1L << T__126) | (1L << T__125) | (1L << T__124) | (1L << T__123) | (1L << T__122) | (1L << T__121) | (1L << T__120) | (1L << T__119) | (1L << T__118) | (1L << T__117) | (1L << T__116) | (1L << T__115) | (1L << T__114) | (1L << T__113) | (1L << T__112) | (1L << T__111) | (1L << T__110) | (1L << T__109) | (1L << T__108) | (1L << T__107) | (1L << T__106) | (1L << T__105) | (1L << T__104) | (1L << T__103) | (1L << T__102) | (1L << T__101) | (1L << T__100) | (1L << T__99) | (1L << T__98) | (1L << T__97) | (1L << T__96) | (1L << T__95) | (1L << T__94) | (1L << T__93) | (1L << T__92) | (1L << T__91) | (1L << T__90) | (1L << T__89) | (1L << T__88) | (1L << T__87) | (1L << T__86) | (1L << T__85) | (1L << T__84) | (1L << T__83) | (1L << T__82) | (1L << T__81) | (1L << T__80) | (1L << T__79) | (1L << T__78) | (1L << T__77) | (1L << T__76) | (1L << T__75) | (1L << T__74) | (1L << T__73) | (1L << T__72) | (1L << T__71) | (1L << T__70) | (1L << T__69) | (1L << T__68) | (1L << T__67) | (1L << T__66))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__65 - 64)) | (1L << (T__63 - 64)) | (1L << (T__62 - 64)) | (1L << (T__61 - 64)) | (1L << (T__60 - 64)) | (1L << (T__59 - 64)) | (1L << (T__58 - 64)) | (1L << (T__57 - 64)) | (1L << (T__56 - 64)) | (1L << (T__55 - 64)) | (1L << (T__54 - 64)) | (1L << (T__53 - 64)) | (1L << (T__52 - 64)) | (1L << (T__51 - 64)) | (1L << (T__50 - 64)) | (1L << (T__49 - 64)) | (1L << (T__48 - 64)) | (1L << (T__47 - 64)) | (1L << (T__46 - 64)) | (1L << (T__45 - 64)) | (1L << (T__44 - 64)) | (1L << (T__43 - 64)) | (1L << (T__42 - 64)) | (1L << (T__41 - 64)) | (1L << (T__40 - 64)) | (1L << (T__39 - 64)) | (1L << (T__38 - 64)) | (1L << (T__37 - 64)) | (1L << (T__36 - 64)) | (1L << (T__35 - 64)) | (1L << (T__34 - 64)) | (1L << (T__33 - 64)) | (1L << (T__32 - 64)) | (1L << (T__31 - 64)) | (1L << (T__30 - 64)) | (1L << (T__29 - 64)) | (1L << (T__28 - 64)) | (1L << (T__27 - 64)) | (1L << (T__26 - 64)) | (1L << (T__25 - 64)) | (1L << (T__24 - 64)) | (1L << (T__23 - 64)) | (1L << (T__22 - 64)) | (1L << (T__21 - 64)) | (1L << (T__20 - 64)) | (1L << (T__19 - 64)) | (1L << (T__18 - 64)) | (1L << (T__17 - 64)) | (1L << (T__16 - 64)) | (1L << (T__15 - 64)) | (1L << (T__14 - 64)) | (1L << (T__13 - 64)) | (1L << (T__12 - 64)) | (1L << (T__11 - 64)) | (1L << (T__10 - 64)) | (1L << (T__9 - 64)) | (1L << (T__8 - 64)) | (1L << (T__7 - 64)) | (1L << (T__6 - 64)) | (1L << (T__5 - 64)) | (1L << (T__4 - 64)) | (1L << (T__3 - 64)) | (1L << (T__2 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__1 - 128)) | (1L << (T__0 - 128)) | (1L << (IgnoreAlgorithmKeyWords - 128)) | (1L << (IgnoreUrlPrefix - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (INT - 128)) | (1L << (ASSIGN - 128)) | (1L << (GT - 128)) | (1L << (LT - 128)) | (1L << (BANG - 128)) | (1L << (TILDE - 128)) | (1L << (QUESTION - 128)) | (1L << (COLON - 128)) | (1L << (EQUAL - 128)) | (1L << (LE - 128)) | (1L << (GE - 128)) | (1L << (NOTEQUAL - 128)) | (1L << (AND - 128)) | (1L << (OR - 128)) | (1L << (INC - 128)) | (1L << (DEC - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)) | (1L << (DIV - 128)) | (1L << (BITAND - 128)) | (1L << (BITOR - 128)) | (1L << (CARET - 128)) | (1L << (MOD - 128)) | (1L << (COMMENT - 128)) | (1L << (LINE_COMMENT - 128)) | (1L << (WS - 128)) | (1L << (WORDS_TO_SKIP - 128)) | (1L << (Skip - 128)) | (1L << (Affil - 128)))) != 0) );
				setState(1117); match(T__64);
				}
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(1118); match(T__3);
				setState(1120); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1119);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__6) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(1122); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__128) | (1L << T__127) | (1L << T__126) | (1L << T__125) | (1L << T__124) | (1L << T__123) | (1L << T__122) | (1L << T__121) | (1L << T__120) | (1L << T__119) | (1L << T__118) | (1L << T__117) | (1L << T__116) | (1L << T__115) | (1L << T__114) | (1L << T__113) | (1L << T__112) | (1L << T__111) | (1L << T__110) | (1L << T__109) | (1L << T__108) | (1L << T__107) | (1L << T__106) | (1L << T__105) | (1L << T__104) | (1L << T__103) | (1L << T__102) | (1L << T__101) | (1L << T__100) | (1L << T__99) | (1L << T__98) | (1L << T__97) | (1L << T__96) | (1L << T__95) | (1L << T__94) | (1L << T__93) | (1L << T__92) | (1L << T__91) | (1L << T__90) | (1L << T__89) | (1L << T__88) | (1L << T__87) | (1L << T__86) | (1L << T__85) | (1L << T__84) | (1L << T__83) | (1L << T__82) | (1L << T__81) | (1L << T__80) | (1L << T__79) | (1L << T__78) | (1L << T__77) | (1L << T__76) | (1L << T__75) | (1L << T__74) | (1L << T__73) | (1L << T__72) | (1L << T__71) | (1L << T__70) | (1L << T__69) | (1L << T__68) | (1L << T__67) | (1L << T__66))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__65 - 64)) | (1L << (T__64 - 64)) | (1L << (T__63 - 64)) | (1L << (T__62 - 64)) | (1L << (T__61 - 64)) | (1L << (T__60 - 64)) | (1L << (T__59 - 64)) | (1L << (T__58 - 64)) | (1L << (T__57 - 64)) | (1L << (T__56 - 64)) | (1L << (T__55 - 64)) | (1L << (T__54 - 64)) | (1L << (T__53 - 64)) | (1L << (T__52 - 64)) | (1L << (T__51 - 64)) | (1L << (T__50 - 64)) | (1L << (T__49 - 64)) | (1L << (T__48 - 64)) | (1L << (T__47 - 64)) | (1L << (T__46 - 64)) | (1L << (T__45 - 64)) | (1L << (T__44 - 64)) | (1L << (T__43 - 64)) | (1L << (T__42 - 64)) | (1L << (T__41 - 64)) | (1L << (T__40 - 64)) | (1L << (T__39 - 64)) | (1L << (T__38 - 64)) | (1L << (T__37 - 64)) | (1L << (T__36 - 64)) | (1L << (T__35 - 64)) | (1L << (T__34 - 64)) | (1L << (T__33 - 64)) | (1L << (T__32 - 64)) | (1L << (T__31 - 64)) | (1L << (T__30 - 64)) | (1L << (T__29 - 64)) | (1L << (T__28 - 64)) | (1L << (T__27 - 64)) | (1L << (T__26 - 64)) | (1L << (T__25 - 64)) | (1L << (T__24 - 64)) | (1L << (T__23 - 64)) | (1L << (T__22 - 64)) | (1L << (T__21 - 64)) | (1L << (T__20 - 64)) | (1L << (T__19 - 64)) | (1L << (T__18 - 64)) | (1L << (T__17 - 64)) | (1L << (T__16 - 64)) | (1L << (T__15 - 64)) | (1L << (T__14 - 64)) | (1L << (T__13 - 64)) | (1L << (T__12 - 64)) | (1L << (T__11 - 64)) | (1L << (T__10 - 64)) | (1L << (T__9 - 64)) | (1L << (T__8 - 64)) | (1L << (T__7 - 64)) | (1L << (T__5 - 64)) | (1L << (T__4 - 64)) | (1L << (T__3 - 64)) | (1L << (T__2 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__1 - 128)) | (1L << (T__0 - 128)) | (1L << (IgnoreAlgorithmKeyWords - 128)) | (1L << (IgnoreUrlPrefix - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (INT - 128)) | (1L << (ASSIGN - 128)) | (1L << (GT - 128)) | (1L << (LT - 128)) | (1L << (BANG - 128)) | (1L << (TILDE - 128)) | (1L << (QUESTION - 128)) | (1L << (COLON - 128)) | (1L << (EQUAL - 128)) | (1L << (LE - 128)) | (1L << (GE - 128)) | (1L << (NOTEQUAL - 128)) | (1L << (AND - 128)) | (1L << (OR - 128)) | (1L << (INC - 128)) | (1L << (DEC - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)) | (1L << (DIV - 128)) | (1L << (BITAND - 128)) | (1L << (BITOR - 128)) | (1L << (CARET - 128)) | (1L << (MOD - 128)) | (1L << (COMMENT - 128)) | (1L << (LINE_COMMENT - 128)) | (1L << (WS - 128)) | (1L << (WORDS_TO_SKIP - 128)) | (1L << (Skip - 128)) | (1L << (Affil - 128)))) != 0) );
				setState(1124); match(T__6);
				}
				}
				break;
			case T__78:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(1125); match(T__78);
				setState(1127); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1126);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__7) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(1129); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__128) | (1L << T__127) | (1L << T__126) | (1L << T__125) | (1L << T__124) | (1L << T__123) | (1L << T__122) | (1L << T__121) | (1L << T__120) | (1L << T__119) | (1L << T__118) | (1L << T__117) | (1L << T__116) | (1L << T__115) | (1L << T__114) | (1L << T__113) | (1L << T__112) | (1L << T__111) | (1L << T__110) | (1L << T__109) | (1L << T__108) | (1L << T__107) | (1L << T__106) | (1L << T__105) | (1L << T__104) | (1L << T__103) | (1L << T__102) | (1L << T__101) | (1L << T__100) | (1L << T__99) | (1L << T__98) | (1L << T__97) | (1L << T__96) | (1L << T__95) | (1L << T__94) | (1L << T__93) | (1L << T__92) | (1L << T__91) | (1L << T__90) | (1L << T__89) | (1L << T__88) | (1L << T__87) | (1L << T__86) | (1L << T__85) | (1L << T__84) | (1L << T__83) | (1L << T__82) | (1L << T__81) | (1L << T__80) | (1L << T__79) | (1L << T__78) | (1L << T__77) | (1L << T__76) | (1L << T__75) | (1L << T__74) | (1L << T__73) | (1L << T__72) | (1L << T__71) | (1L << T__70) | (1L << T__69) | (1L << T__68) | (1L << T__67) | (1L << T__66))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__65 - 64)) | (1L << (T__64 - 64)) | (1L << (T__63 - 64)) | (1L << (T__62 - 64)) | (1L << (T__61 - 64)) | (1L << (T__60 - 64)) | (1L << (T__59 - 64)) | (1L << (T__58 - 64)) | (1L << (T__57 - 64)) | (1L << (T__56 - 64)) | (1L << (T__55 - 64)) | (1L << (T__54 - 64)) | (1L << (T__53 - 64)) | (1L << (T__52 - 64)) | (1L << (T__51 - 64)) | (1L << (T__50 - 64)) | (1L << (T__49 - 64)) | (1L << (T__48 - 64)) | (1L << (T__47 - 64)) | (1L << (T__46 - 64)) | (1L << (T__45 - 64)) | (1L << (T__44 - 64)) | (1L << (T__43 - 64)) | (1L << (T__42 - 64)) | (1L << (T__41 - 64)) | (1L << (T__40 - 64)) | (1L << (T__39 - 64)) | (1L << (T__38 - 64)) | (1L << (T__37 - 64)) | (1L << (T__36 - 64)) | (1L << (T__35 - 64)) | (1L << (T__34 - 64)) | (1L << (T__33 - 64)) | (1L << (T__32 - 64)) | (1L << (T__31 - 64)) | (1L << (T__30 - 64)) | (1L << (T__29 - 64)) | (1L << (T__28 - 64)) | (1L << (T__27 - 64)) | (1L << (T__26 - 64)) | (1L << (T__25 - 64)) | (1L << (T__24 - 64)) | (1L << (T__23 - 64)) | (1L << (T__22 - 64)) | (1L << (T__21 - 64)) | (1L << (T__20 - 64)) | (1L << (T__19 - 64)) | (1L << (T__18 - 64)) | (1L << (T__17 - 64)) | (1L << (T__16 - 64)) | (1L << (T__15 - 64)) | (1L << (T__14 - 64)) | (1L << (T__13 - 64)) | (1L << (T__12 - 64)) | (1L << (T__11 - 64)) | (1L << (T__10 - 64)) | (1L << (T__9 - 64)) | (1L << (T__8 - 64)) | (1L << (T__6 - 64)) | (1L << (T__5 - 64)) | (1L << (T__4 - 64)) | (1L << (T__3 - 64)) | (1L << (T__2 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__1 - 128)) | (1L << (T__0 - 128)) | (1L << (IgnoreAlgorithmKeyWords - 128)) | (1L << (IgnoreUrlPrefix - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (INT - 128)) | (1L << (ASSIGN - 128)) | (1L << (GT - 128)) | (1L << (LT - 128)) | (1L << (BANG - 128)) | (1L << (TILDE - 128)) | (1L << (QUESTION - 128)) | (1L << (COLON - 128)) | (1L << (EQUAL - 128)) | (1L << (LE - 128)) | (1L << (GE - 128)) | (1L << (NOTEQUAL - 128)) | (1L << (AND - 128)) | (1L << (OR - 128)) | (1L << (INC - 128)) | (1L << (DEC - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)) | (1L << (DIV - 128)) | (1L << (BITAND - 128)) | (1L << (BITOR - 128)) | (1L << (CARET - 128)) | (1L << (MOD - 128)) | (1L << (COMMENT - 128)) | (1L << (LINE_COMMENT - 128)) | (1L << (WS - 128)) | (1L << (WORDS_TO_SKIP - 128)) | (1L << (Skip - 128)) | (1L << (Affil - 128)))) != 0) );
				setState(1131); match(T__7);
				}
				}
				break;
			case T__88:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(1132); match(T__88);
				setState(1134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1133);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__73) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(1136); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__128) | (1L << T__127) | (1L << T__126) | (1L << T__125) | (1L << T__124) | (1L << T__123) | (1L << T__122) | (1L << T__121) | (1L << T__120) | (1L << T__119) | (1L << T__118) | (1L << T__117) | (1L << T__116) | (1L << T__115) | (1L << T__114) | (1L << T__113) | (1L << T__112) | (1L << T__111) | (1L << T__110) | (1L << T__109) | (1L << T__108) | (1L << T__107) | (1L << T__106) | (1L << T__105) | (1L << T__104) | (1L << T__103) | (1L << T__102) | (1L << T__101) | (1L << T__100) | (1L << T__99) | (1L << T__98) | (1L << T__97) | (1L << T__96) | (1L << T__95) | (1L << T__94) | (1L << T__93) | (1L << T__92) | (1L << T__91) | (1L << T__90) | (1L << T__89) | (1L << T__88) | (1L << T__87) | (1L << T__86) | (1L << T__85) | (1L << T__84) | (1L << T__83) | (1L << T__82) | (1L << T__81) | (1L << T__80) | (1L << T__79) | (1L << T__78) | (1L << T__77) | (1L << T__76) | (1L << T__75) | (1L << T__74) | (1L << T__72) | (1L << T__71) | (1L << T__70) | (1L << T__69) | (1L << T__68) | (1L << T__67) | (1L << T__66))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__65 - 64)) | (1L << (T__64 - 64)) | (1L << (T__63 - 64)) | (1L << (T__62 - 64)) | (1L << (T__61 - 64)) | (1L << (T__60 - 64)) | (1L << (T__59 - 64)) | (1L << (T__58 - 64)) | (1L << (T__57 - 64)) | (1L << (T__56 - 64)) | (1L << (T__55 - 64)) | (1L << (T__54 - 64)) | (1L << (T__53 - 64)) | (1L << (T__52 - 64)) | (1L << (T__51 - 64)) | (1L << (T__50 - 64)) | (1L << (T__49 - 64)) | (1L << (T__48 - 64)) | (1L << (T__47 - 64)) | (1L << (T__46 - 64)) | (1L << (T__45 - 64)) | (1L << (T__44 - 64)) | (1L << (T__43 - 64)) | (1L << (T__42 - 64)) | (1L << (T__41 - 64)) | (1L << (T__40 - 64)) | (1L << (T__39 - 64)) | (1L << (T__38 - 64)) | (1L << (T__37 - 64)) | (1L << (T__36 - 64)) | (1L << (T__35 - 64)) | (1L << (T__34 - 64)) | (1L << (T__33 - 64)) | (1L << (T__32 - 64)) | (1L << (T__31 - 64)) | (1L << (T__30 - 64)) | (1L << (T__29 - 64)) | (1L << (T__28 - 64)) | (1L << (T__27 - 64)) | (1L << (T__26 - 64)) | (1L << (T__25 - 64)) | (1L << (T__24 - 64)) | (1L << (T__23 - 64)) | (1L << (T__22 - 64)) | (1L << (T__21 - 64)) | (1L << (T__20 - 64)) | (1L << (T__19 - 64)) | (1L << (T__18 - 64)) | (1L << (T__17 - 64)) | (1L << (T__16 - 64)) | (1L << (T__15 - 64)) | (1L << (T__14 - 64)) | (1L << (T__13 - 64)) | (1L << (T__12 - 64)) | (1L << (T__11 - 64)) | (1L << (T__10 - 64)) | (1L << (T__9 - 64)) | (1L << (T__8 - 64)) | (1L << (T__7 - 64)) | (1L << (T__6 - 64)) | (1L << (T__5 - 64)) | (1L << (T__4 - 64)) | (1L << (T__3 - 64)) | (1L << (T__2 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__1 - 128)) | (1L << (T__0 - 128)) | (1L << (IgnoreAlgorithmKeyWords - 128)) | (1L << (IgnoreUrlPrefix - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (INT - 128)) | (1L << (ASSIGN - 128)) | (1L << (GT - 128)) | (1L << (LT - 128)) | (1L << (BANG - 128)) | (1L << (TILDE - 128)) | (1L << (QUESTION - 128)) | (1L << (COLON - 128)) | (1L << (EQUAL - 128)) | (1L << (LE - 128)) | (1L << (GE - 128)) | (1L << (NOTEQUAL - 128)) | (1L << (AND - 128)) | (1L << (OR - 128)) | (1L << (INC - 128)) | (1L << (DEC - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)) | (1L << (DIV - 128)) | (1L << (BITAND - 128)) | (1L << (BITOR - 128)) | (1L << (CARET - 128)) | (1L << (MOD - 128)) | (1L << (COMMENT - 128)) | (1L << (LINE_COMMENT - 128)) | (1L << (WS - 128)) | (1L << (WORDS_TO_SKIP - 128)) | (1L << (Skip - 128)) | (1L << (Affil - 128)))) != 0) );
				setState(1138); match(T__73);
				}
				}
				break;
			case T__100:
			case T__21:
				enterOuterAlt(_localctx, 7);
				{
				setState(1139); eqnArray();
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
		enterRule(_localctx, 174, RULE_equationBlock);
		int _la;
		try {
			setState(1160);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1142); match(T__10);
				setState(1143); label();
				setState(1145); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1144);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__65) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(1147); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__128) | (1L << T__127) | (1L << T__126) | (1L << T__125) | (1L << T__124) | (1L << T__123) | (1L << T__122) | (1L << T__121) | (1L << T__120) | (1L << T__119) | (1L << T__118) | (1L << T__117) | (1L << T__116) | (1L << T__115) | (1L << T__114) | (1L << T__113) | (1L << T__112) | (1L << T__111) | (1L << T__110) | (1L << T__109) | (1L << T__108) | (1L << T__107) | (1L << T__106) | (1L << T__105) | (1L << T__104) | (1L << T__103) | (1L << T__102) | (1L << T__101) | (1L << T__100) | (1L << T__99) | (1L << T__98) | (1L << T__97) | (1L << T__96) | (1L << T__95) | (1L << T__94) | (1L << T__93) | (1L << T__92) | (1L << T__91) | (1L << T__90) | (1L << T__89) | (1L << T__88) | (1L << T__87) | (1L << T__86) | (1L << T__85) | (1L << T__84) | (1L << T__83) | (1L << T__82) | (1L << T__81) | (1L << T__80) | (1L << T__79) | (1L << T__78) | (1L << T__77) | (1L << T__76) | (1L << T__75) | (1L << T__74) | (1L << T__73) | (1L << T__72) | (1L << T__71) | (1L << T__70) | (1L << T__69) | (1L << T__68) | (1L << T__67) | (1L << T__66))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__64 - 65)) | (1L << (T__63 - 65)) | (1L << (T__62 - 65)) | (1L << (T__61 - 65)) | (1L << (T__60 - 65)) | (1L << (T__59 - 65)) | (1L << (T__58 - 65)) | (1L << (T__57 - 65)) | (1L << (T__56 - 65)) | (1L << (T__55 - 65)) | (1L << (T__54 - 65)) | (1L << (T__53 - 65)) | (1L << (T__52 - 65)) | (1L << (T__51 - 65)) | (1L << (T__50 - 65)) | (1L << (T__49 - 65)) | (1L << (T__48 - 65)) | (1L << (T__47 - 65)) | (1L << (T__46 - 65)) | (1L << (T__45 - 65)) | (1L << (T__44 - 65)) | (1L << (T__43 - 65)) | (1L << (T__42 - 65)) | (1L << (T__41 - 65)) | (1L << (T__40 - 65)) | (1L << (T__39 - 65)) | (1L << (T__38 - 65)) | (1L << (T__37 - 65)) | (1L << (T__36 - 65)) | (1L << (T__35 - 65)) | (1L << (T__34 - 65)) | (1L << (T__33 - 65)) | (1L << (T__32 - 65)) | (1L << (T__31 - 65)) | (1L << (T__30 - 65)) | (1L << (T__29 - 65)) | (1L << (T__28 - 65)) | (1L << (T__27 - 65)) | (1L << (T__26 - 65)) | (1L << (T__25 - 65)) | (1L << (T__24 - 65)) | (1L << (T__23 - 65)) | (1L << (T__22 - 65)) | (1L << (T__21 - 65)) | (1L << (T__20 - 65)) | (1L << (T__19 - 65)) | (1L << (T__18 - 65)) | (1L << (T__17 - 65)) | (1L << (T__16 - 65)) | (1L << (T__15 - 65)) | (1L << (T__14 - 65)) | (1L << (T__13 - 65)) | (1L << (T__12 - 65)) | (1L << (T__11 - 65)) | (1L << (T__10 - 65)) | (1L << (T__9 - 65)) | (1L << (T__8 - 65)) | (1L << (T__7 - 65)) | (1L << (T__6 - 65)) | (1L << (T__5 - 65)) | (1L << (T__4 - 65)) | (1L << (T__3 - 65)) | (1L << (T__2 - 65)) | (1L << (T__1 - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (T__0 - 129)) | (1L << (IgnoreAlgorithmKeyWords - 129)) | (1L << (IgnoreUrlPrefix - 129)) | (1L << (String - 129)) | (1L << (Num - 129)) | (1L << (INT - 129)) | (1L << (ASSIGN - 129)) | (1L << (GT - 129)) | (1L << (LT - 129)) | (1L << (BANG - 129)) | (1L << (TILDE - 129)) | (1L << (QUESTION - 129)) | (1L << (COLON - 129)) | (1L << (EQUAL - 129)) | (1L << (LE - 129)) | (1L << (GE - 129)) | (1L << (NOTEQUAL - 129)) | (1L << (AND - 129)) | (1L << (OR - 129)) | (1L << (INC - 129)) | (1L << (DEC - 129)) | (1L << (ADD - 129)) | (1L << (SUB - 129)) | (1L << (MUL - 129)) | (1L << (DIV - 129)) | (1L << (BITAND - 129)) | (1L << (BITOR - 129)) | (1L << (CARET - 129)) | (1L << (MOD - 129)) | (1L << (COMMENT - 129)) | (1L << (LINE_COMMENT - 129)) | (1L << (WS - 129)) | (1L << (WORDS_TO_SKIP - 129)) | (1L << (Skip - 129)) | (1L << (Affil - 129)))) != 0) );
				setState(1149); match(T__65);
				}
				}
				break;
			case T__123:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1151); match(T__123);
				setState(1152); label();
				setState(1154); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1153);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__49) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(1156); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__128) | (1L << T__127) | (1L << T__126) | (1L << T__125) | (1L << T__124) | (1L << T__123) | (1L << T__122) | (1L << T__121) | (1L << T__120) | (1L << T__119) | (1L << T__118) | (1L << T__117) | (1L << T__116) | (1L << T__115) | (1L << T__114) | (1L << T__113) | (1L << T__112) | (1L << T__111) | (1L << T__110) | (1L << T__109) | (1L << T__108) | (1L << T__107) | (1L << T__106) | (1L << T__105) | (1L << T__104) | (1L << T__103) | (1L << T__102) | (1L << T__101) | (1L << T__100) | (1L << T__99) | (1L << T__98) | (1L << T__97) | (1L << T__96) | (1L << T__95) | (1L << T__94) | (1L << T__93) | (1L << T__92) | (1L << T__91) | (1L << T__90) | (1L << T__89) | (1L << T__88) | (1L << T__87) | (1L << T__86) | (1L << T__85) | (1L << T__84) | (1L << T__83) | (1L << T__82) | (1L << T__81) | (1L << T__80) | (1L << T__79) | (1L << T__78) | (1L << T__77) | (1L << T__76) | (1L << T__75) | (1L << T__74) | (1L << T__73) | (1L << T__72) | (1L << T__71) | (1L << T__70) | (1L << T__69) | (1L << T__68) | (1L << T__67) | (1L << T__66))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__65 - 64)) | (1L << (T__64 - 64)) | (1L << (T__63 - 64)) | (1L << (T__62 - 64)) | (1L << (T__61 - 64)) | (1L << (T__60 - 64)) | (1L << (T__59 - 64)) | (1L << (T__58 - 64)) | (1L << (T__57 - 64)) | (1L << (T__56 - 64)) | (1L << (T__55 - 64)) | (1L << (T__54 - 64)) | (1L << (T__53 - 64)) | (1L << (T__52 - 64)) | (1L << (T__51 - 64)) | (1L << (T__50 - 64)) | (1L << (T__48 - 64)) | (1L << (T__47 - 64)) | (1L << (T__46 - 64)) | (1L << (T__45 - 64)) | (1L << (T__44 - 64)) | (1L << (T__43 - 64)) | (1L << (T__42 - 64)) | (1L << (T__41 - 64)) | (1L << (T__40 - 64)) | (1L << (T__39 - 64)) | (1L << (T__38 - 64)) | (1L << (T__37 - 64)) | (1L << (T__36 - 64)) | (1L << (T__35 - 64)) | (1L << (T__34 - 64)) | (1L << (T__33 - 64)) | (1L << (T__32 - 64)) | (1L << (T__31 - 64)) | (1L << (T__30 - 64)) | (1L << (T__29 - 64)) | (1L << (T__28 - 64)) | (1L << (T__27 - 64)) | (1L << (T__26 - 64)) | (1L << (T__25 - 64)) | (1L << (T__24 - 64)) | (1L << (T__23 - 64)) | (1L << (T__22 - 64)) | (1L << (T__21 - 64)) | (1L << (T__20 - 64)) | (1L << (T__19 - 64)) | (1L << (T__18 - 64)) | (1L << (T__17 - 64)) | (1L << (T__16 - 64)) | (1L << (T__15 - 64)) | (1L << (T__14 - 64)) | (1L << (T__13 - 64)) | (1L << (T__12 - 64)) | (1L << (T__11 - 64)) | (1L << (T__10 - 64)) | (1L << (T__9 - 64)) | (1L << (T__8 - 64)) | (1L << (T__7 - 64)) | (1L << (T__6 - 64)) | (1L << (T__5 - 64)) | (1L << (T__4 - 64)) | (1L << (T__3 - 64)) | (1L << (T__2 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__1 - 128)) | (1L << (T__0 - 128)) | (1L << (IgnoreAlgorithmKeyWords - 128)) | (1L << (IgnoreUrlPrefix - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (INT - 128)) | (1L << (ASSIGN - 128)) | (1L << (GT - 128)) | (1L << (LT - 128)) | (1L << (BANG - 128)) | (1L << (TILDE - 128)) | (1L << (QUESTION - 128)) | (1L << (COLON - 128)) | (1L << (EQUAL - 128)) | (1L << (LE - 128)) | (1L << (GE - 128)) | (1L << (NOTEQUAL - 128)) | (1L << (AND - 128)) | (1L << (OR - 128)) | (1L << (INC - 128)) | (1L << (DEC - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)) | (1L << (DIV - 128)) | (1L << (BITAND - 128)) | (1L << (BITOR - 128)) | (1L << (CARET - 128)) | (1L << (MOD - 128)) | (1L << (COMMENT - 128)) | (1L << (LINE_COMMENT - 128)) | (1L << (WS - 128)) | (1L << (WORDS_TO_SKIP - 128)) | (1L << (Skip - 128)) | (1L << (Affil - 128)))) != 0) );
				setState(1158); match(T__49);
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
		enterRule(_localctx, 176, RULE_displayEquation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1162); match(T__41);
			setState(1164); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1163);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==T__81) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(1166); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__128) | (1L << T__127) | (1L << T__126) | (1L << T__125) | (1L << T__124) | (1L << T__123) | (1L << T__122) | (1L << T__121) | (1L << T__120) | (1L << T__119) | (1L << T__118) | (1L << T__117) | (1L << T__116) | (1L << T__115) | (1L << T__114) | (1L << T__113) | (1L << T__112) | (1L << T__111) | (1L << T__110) | (1L << T__109) | (1L << T__108) | (1L << T__107) | (1L << T__106) | (1L << T__105) | (1L << T__104) | (1L << T__103) | (1L << T__102) | (1L << T__101) | (1L << T__100) | (1L << T__99) | (1L << T__98) | (1L << T__97) | (1L << T__96) | (1L << T__95) | (1L << T__94) | (1L << T__93) | (1L << T__92) | (1L << T__91) | (1L << T__90) | (1L << T__89) | (1L << T__88) | (1L << T__87) | (1L << T__86) | (1L << T__85) | (1L << T__84) | (1L << T__83) | (1L << T__82) | (1L << T__80) | (1L << T__79) | (1L << T__78) | (1L << T__77) | (1L << T__76) | (1L << T__75) | (1L << T__74) | (1L << T__73) | (1L << T__72) | (1L << T__71) | (1L << T__70) | (1L << T__69) | (1L << T__68) | (1L << T__67) | (1L << T__66))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__65 - 64)) | (1L << (T__64 - 64)) | (1L << (T__63 - 64)) | (1L << (T__62 - 64)) | (1L << (T__61 - 64)) | (1L << (T__60 - 64)) | (1L << (T__59 - 64)) | (1L << (T__58 - 64)) | (1L << (T__57 - 64)) | (1L << (T__56 - 64)) | (1L << (T__55 - 64)) | (1L << (T__54 - 64)) | (1L << (T__53 - 64)) | (1L << (T__52 - 64)) | (1L << (T__51 - 64)) | (1L << (T__50 - 64)) | (1L << (T__49 - 64)) | (1L << (T__48 - 64)) | (1L << (T__47 - 64)) | (1L << (T__46 - 64)) | (1L << (T__45 - 64)) | (1L << (T__44 - 64)) | (1L << (T__43 - 64)) | (1L << (T__42 - 64)) | (1L << (T__41 - 64)) | (1L << (T__40 - 64)) | (1L << (T__39 - 64)) | (1L << (T__38 - 64)) | (1L << (T__37 - 64)) | (1L << (T__36 - 64)) | (1L << (T__35 - 64)) | (1L << (T__34 - 64)) | (1L << (T__33 - 64)) | (1L << (T__32 - 64)) | (1L << (T__31 - 64)) | (1L << (T__30 - 64)) | (1L << (T__29 - 64)) | (1L << (T__28 - 64)) | (1L << (T__27 - 64)) | (1L << (T__26 - 64)) | (1L << (T__25 - 64)) | (1L << (T__24 - 64)) | (1L << (T__23 - 64)) | (1L << (T__22 - 64)) | (1L << (T__21 - 64)) | (1L << (T__20 - 64)) | (1L << (T__19 - 64)) | (1L << (T__18 - 64)) | (1L << (T__17 - 64)) | (1L << (T__16 - 64)) | (1L << (T__15 - 64)) | (1L << (T__14 - 64)) | (1L << (T__13 - 64)) | (1L << (T__12 - 64)) | (1L << (T__11 - 64)) | (1L << (T__10 - 64)) | (1L << (T__9 - 64)) | (1L << (T__8 - 64)) | (1L << (T__7 - 64)) | (1L << (T__6 - 64)) | (1L << (T__5 - 64)) | (1L << (T__4 - 64)) | (1L << (T__3 - 64)) | (1L << (T__2 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__1 - 128)) | (1L << (T__0 - 128)) | (1L << (IgnoreAlgorithmKeyWords - 128)) | (1L << (IgnoreUrlPrefix - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (INT - 128)) | (1L << (ASSIGN - 128)) | (1L << (GT - 128)) | (1L << (LT - 128)) | (1L << (BANG - 128)) | (1L << (TILDE - 128)) | (1L << (QUESTION - 128)) | (1L << (COLON - 128)) | (1L << (EQUAL - 128)) | (1L << (LE - 128)) | (1L << (GE - 128)) | (1L << (NOTEQUAL - 128)) | (1L << (AND - 128)) | (1L << (OR - 128)) | (1L << (INC - 128)) | (1L << (DEC - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)) | (1L << (DIV - 128)) | (1L << (BITAND - 128)) | (1L << (BITOR - 128)) | (1L << (CARET - 128)) | (1L << (MOD - 128)) | (1L << (COMMENT - 128)) | (1L << (LINE_COMMENT - 128)) | (1L << (WS - 128)) | (1L << (WORDS_TO_SKIP - 128)) | (1L << (Skip - 128)) | (1L << (Affil - 128)))) != 0) );
			setState(1168); match(T__81);
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
		enterRule(_localctx, 178, RULE_eqnArray);
		int _la;
		try {
			setState(1184);
			switch (_input.LA(1)) {
			case T__100:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1170); match(T__100);
				setState(1172); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1171);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__44) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(1174); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__128) | (1L << T__127) | (1L << T__126) | (1L << T__125) | (1L << T__124) | (1L << T__123) | (1L << T__122) | (1L << T__121) | (1L << T__120) | (1L << T__119) | (1L << T__118) | (1L << T__117) | (1L << T__116) | (1L << T__115) | (1L << T__114) | (1L << T__113) | (1L << T__112) | (1L << T__111) | (1L << T__110) | (1L << T__109) | (1L << T__108) | (1L << T__107) | (1L << T__106) | (1L << T__105) | (1L << T__104) | (1L << T__103) | (1L << T__102) | (1L << T__101) | (1L << T__100) | (1L << T__99) | (1L << T__98) | (1L << T__97) | (1L << T__96) | (1L << T__95) | (1L << T__94) | (1L << T__93) | (1L << T__92) | (1L << T__91) | (1L << T__90) | (1L << T__89) | (1L << T__88) | (1L << T__87) | (1L << T__86) | (1L << T__85) | (1L << T__84) | (1L << T__83) | (1L << T__82) | (1L << T__81) | (1L << T__80) | (1L << T__79) | (1L << T__78) | (1L << T__77) | (1L << T__76) | (1L << T__75) | (1L << T__74) | (1L << T__73) | (1L << T__72) | (1L << T__71) | (1L << T__70) | (1L << T__69) | (1L << T__68) | (1L << T__67) | (1L << T__66))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__65 - 64)) | (1L << (T__64 - 64)) | (1L << (T__63 - 64)) | (1L << (T__62 - 64)) | (1L << (T__61 - 64)) | (1L << (T__60 - 64)) | (1L << (T__59 - 64)) | (1L << (T__58 - 64)) | (1L << (T__57 - 64)) | (1L << (T__56 - 64)) | (1L << (T__55 - 64)) | (1L << (T__54 - 64)) | (1L << (T__53 - 64)) | (1L << (T__52 - 64)) | (1L << (T__51 - 64)) | (1L << (T__50 - 64)) | (1L << (T__49 - 64)) | (1L << (T__48 - 64)) | (1L << (T__47 - 64)) | (1L << (T__46 - 64)) | (1L << (T__45 - 64)) | (1L << (T__43 - 64)) | (1L << (T__42 - 64)) | (1L << (T__41 - 64)) | (1L << (T__40 - 64)) | (1L << (T__39 - 64)) | (1L << (T__38 - 64)) | (1L << (T__37 - 64)) | (1L << (T__36 - 64)) | (1L << (T__35 - 64)) | (1L << (T__34 - 64)) | (1L << (T__33 - 64)) | (1L << (T__32 - 64)) | (1L << (T__31 - 64)) | (1L << (T__30 - 64)) | (1L << (T__29 - 64)) | (1L << (T__28 - 64)) | (1L << (T__27 - 64)) | (1L << (T__26 - 64)) | (1L << (T__25 - 64)) | (1L << (T__24 - 64)) | (1L << (T__23 - 64)) | (1L << (T__22 - 64)) | (1L << (T__21 - 64)) | (1L << (T__20 - 64)) | (1L << (T__19 - 64)) | (1L << (T__18 - 64)) | (1L << (T__17 - 64)) | (1L << (T__16 - 64)) | (1L << (T__15 - 64)) | (1L << (T__14 - 64)) | (1L << (T__13 - 64)) | (1L << (T__12 - 64)) | (1L << (T__11 - 64)) | (1L << (T__10 - 64)) | (1L << (T__9 - 64)) | (1L << (T__8 - 64)) | (1L << (T__7 - 64)) | (1L << (T__6 - 64)) | (1L << (T__5 - 64)) | (1L << (T__4 - 64)) | (1L << (T__3 - 64)) | (1L << (T__2 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__1 - 128)) | (1L << (T__0 - 128)) | (1L << (IgnoreAlgorithmKeyWords - 128)) | (1L << (IgnoreUrlPrefix - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (INT - 128)) | (1L << (ASSIGN - 128)) | (1L << (GT - 128)) | (1L << (LT - 128)) | (1L << (BANG - 128)) | (1L << (TILDE - 128)) | (1L << (QUESTION - 128)) | (1L << (COLON - 128)) | (1L << (EQUAL - 128)) | (1L << (LE - 128)) | (1L << (GE - 128)) | (1L << (NOTEQUAL - 128)) | (1L << (AND - 128)) | (1L << (OR - 128)) | (1L << (INC - 128)) | (1L << (DEC - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)) | (1L << (DIV - 128)) | (1L << (BITAND - 128)) | (1L << (BITOR - 128)) | (1L << (CARET - 128)) | (1L << (MOD - 128)) | (1L << (COMMENT - 128)) | (1L << (LINE_COMMENT - 128)) | (1L << (WS - 128)) | (1L << (WORDS_TO_SKIP - 128)) | (1L << (Skip - 128)) | (1L << (Affil - 128)))) != 0) );
				setState(1176); match(T__44);
				}
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1177); match(T__21);
				setState(1179); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1178);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__76) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(1181); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__128) | (1L << T__127) | (1L << T__126) | (1L << T__125) | (1L << T__124) | (1L << T__123) | (1L << T__122) | (1L << T__121) | (1L << T__120) | (1L << T__119) | (1L << T__118) | (1L << T__117) | (1L << T__116) | (1L << T__115) | (1L << T__114) | (1L << T__113) | (1L << T__112) | (1L << T__111) | (1L << T__110) | (1L << T__109) | (1L << T__108) | (1L << T__107) | (1L << T__106) | (1L << T__105) | (1L << T__104) | (1L << T__103) | (1L << T__102) | (1L << T__101) | (1L << T__100) | (1L << T__99) | (1L << T__98) | (1L << T__97) | (1L << T__96) | (1L << T__95) | (1L << T__94) | (1L << T__93) | (1L << T__92) | (1L << T__91) | (1L << T__90) | (1L << T__89) | (1L << T__88) | (1L << T__87) | (1L << T__86) | (1L << T__85) | (1L << T__84) | (1L << T__83) | (1L << T__82) | (1L << T__81) | (1L << T__80) | (1L << T__79) | (1L << T__78) | (1L << T__77) | (1L << T__75) | (1L << T__74) | (1L << T__73) | (1L << T__72) | (1L << T__71) | (1L << T__70) | (1L << T__69) | (1L << T__68) | (1L << T__67) | (1L << T__66))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__65 - 64)) | (1L << (T__64 - 64)) | (1L << (T__63 - 64)) | (1L << (T__62 - 64)) | (1L << (T__61 - 64)) | (1L << (T__60 - 64)) | (1L << (T__59 - 64)) | (1L << (T__58 - 64)) | (1L << (T__57 - 64)) | (1L << (T__56 - 64)) | (1L << (T__55 - 64)) | (1L << (T__54 - 64)) | (1L << (T__53 - 64)) | (1L << (T__52 - 64)) | (1L << (T__51 - 64)) | (1L << (T__50 - 64)) | (1L << (T__49 - 64)) | (1L << (T__48 - 64)) | (1L << (T__47 - 64)) | (1L << (T__46 - 64)) | (1L << (T__45 - 64)) | (1L << (T__44 - 64)) | (1L << (T__43 - 64)) | (1L << (T__42 - 64)) | (1L << (T__41 - 64)) | (1L << (T__40 - 64)) | (1L << (T__39 - 64)) | (1L << (T__38 - 64)) | (1L << (T__37 - 64)) | (1L << (T__36 - 64)) | (1L << (T__35 - 64)) | (1L << (T__34 - 64)) | (1L << (T__33 - 64)) | (1L << (T__32 - 64)) | (1L << (T__31 - 64)) | (1L << (T__30 - 64)) | (1L << (T__29 - 64)) | (1L << (T__28 - 64)) | (1L << (T__27 - 64)) | (1L << (T__26 - 64)) | (1L << (T__25 - 64)) | (1L << (T__24 - 64)) | (1L << (T__23 - 64)) | (1L << (T__22 - 64)) | (1L << (T__21 - 64)) | (1L << (T__20 - 64)) | (1L << (T__19 - 64)) | (1L << (T__18 - 64)) | (1L << (T__17 - 64)) | (1L << (T__16 - 64)) | (1L << (T__15 - 64)) | (1L << (T__14 - 64)) | (1L << (T__13 - 64)) | (1L << (T__12 - 64)) | (1L << (T__11 - 64)) | (1L << (T__10 - 64)) | (1L << (T__9 - 64)) | (1L << (T__8 - 64)) | (1L << (T__7 - 64)) | (1L << (T__6 - 64)) | (1L << (T__5 - 64)) | (1L << (T__4 - 64)) | (1L << (T__3 - 64)) | (1L << (T__2 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__1 - 128)) | (1L << (T__0 - 128)) | (1L << (IgnoreAlgorithmKeyWords - 128)) | (1L << (IgnoreUrlPrefix - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (INT - 128)) | (1L << (ASSIGN - 128)) | (1L << (GT - 128)) | (1L << (LT - 128)) | (1L << (BANG - 128)) | (1L << (TILDE - 128)) | (1L << (QUESTION - 128)) | (1L << (COLON - 128)) | (1L << (EQUAL - 128)) | (1L << (LE - 128)) | (1L << (GE - 128)) | (1L << (NOTEQUAL - 128)) | (1L << (AND - 128)) | (1L << (OR - 128)) | (1L << (INC - 128)) | (1L << (DEC - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)) | (1L << (DIV - 128)) | (1L << (BITAND - 128)) | (1L << (BITOR - 128)) | (1L << (CARET - 128)) | (1L << (MOD - 128)) | (1L << (COMMENT - 128)) | (1L << (LINE_COMMENT - 128)) | (1L << (WS - 128)) | (1L << (WORDS_TO_SKIP - 128)) | (1L << (Skip - 128)) | (1L << (Affil - 128)))) != 0) );
				setState(1183); match(T__76);
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
		public EqnEquationContext eqnEquation(int i) {
			return getRuleContext(EqnEquationContext.class,i);
		}
		public List<EqnEquationContext> eqnEquation() {
			return getRuleContexts(EqnEquationContext.class);
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
		enterRule(_localctx, 180, RULE_eqnArrayBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__128) | (1L << T__127) | (1L << T__126) | (1L << T__125) | (1L << T__124) | (1L << T__123) | (1L << T__122) | (1L << T__121) | (1L << T__120) | (1L << T__119) | (1L << T__118) | (1L << T__117) | (1L << T__116) | (1L << T__115) | (1L << T__114) | (1L << T__113) | (1L << T__112) | (1L << T__111) | (1L << T__110) | (1L << T__109) | (1L << T__108) | (1L << T__107) | (1L << T__106) | (1L << T__105) | (1L << T__104) | (1L << T__103) | (1L << T__102) | (1L << T__101) | (1L << T__100) | (1L << T__99) | (1L << T__98) | (1L << T__97) | (1L << T__96) | (1L << T__95) | (1L << T__94) | (1L << T__93) | (1L << T__92) | (1L << T__91) | (1L << T__90) | (1L << T__89) | (1L << T__88) | (1L << T__87) | (1L << T__86) | (1L << T__85) | (1L << T__84) | (1L << T__83) | (1L << T__82) | (1L << T__81) | (1L << T__80) | (1L << T__79) | (1L << T__78) | (1L << T__77) | (1L << T__75) | (1L << T__74) | (1L << T__73) | (1L << T__72) | (1L << T__71) | (1L << T__70) | (1L << T__69) | (1L << T__68) | (1L << T__67) | (1L << T__66))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__65 - 64)) | (1L << (T__64 - 64)) | (1L << (T__63 - 64)) | (1L << (T__62 - 64)) | (1L << (T__61 - 64)) | (1L << (T__60 - 64)) | (1L << (T__59 - 64)) | (1L << (T__58 - 64)) | (1L << (T__57 - 64)) | (1L << (T__56 - 64)) | (1L << (T__55 - 64)) | (1L << (T__54 - 64)) | (1L << (T__53 - 64)) | (1L << (T__52 - 64)) | (1L << (T__51 - 64)) | (1L << (T__50 - 64)) | (1L << (T__49 - 64)) | (1L << (T__48 - 64)) | (1L << (T__47 - 64)) | (1L << (T__46 - 64)) | (1L << (T__45 - 64)) | (1L << (T__43 - 64)) | (1L << (T__42 - 64)) | (1L << (T__41 - 64)) | (1L << (T__40 - 64)) | (1L << (T__39 - 64)) | (1L << (T__38 - 64)) | (1L << (T__37 - 64)) | (1L << (T__36 - 64)) | (1L << (T__35 - 64)) | (1L << (T__34 - 64)) | (1L << (T__33 - 64)) | (1L << (T__32 - 64)) | (1L << (T__31 - 64)) | (1L << (T__30 - 64)) | (1L << (T__29 - 64)) | (1L << (T__28 - 64)) | (1L << (T__27 - 64)) | (1L << (T__26 - 64)) | (1L << (T__25 - 64)) | (1L << (T__24 - 64)) | (1L << (T__23 - 64)) | (1L << (T__22 - 64)) | (1L << (T__21 - 64)) | (1L << (T__20 - 64)) | (1L << (T__19 - 64)) | (1L << (T__18 - 64)) | (1L << (T__17 - 64)) | (1L << (T__16 - 64)) | (1L << (T__15 - 64)) | (1L << (T__14 - 64)) | (1L << (T__13 - 64)) | (1L << (T__12 - 64)) | (1L << (T__11 - 64)) | (1L << (T__10 - 64)) | (1L << (T__9 - 64)) | (1L << (T__8 - 64)) | (1L << (T__7 - 64)) | (1L << (T__6 - 64)) | (1L << (T__5 - 64)) | (1L << (T__4 - 64)) | (1L << (T__3 - 64)) | (1L << (T__2 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__1 - 128)) | (1L << (T__0 - 128)) | (1L << (IgnoreAlgorithmKeyWords - 128)) | (1L << (IgnoreUrlPrefix - 128)) | (1L << (String - 128)) | (1L << (Num - 128)) | (1L << (INT - 128)) | (1L << (ASSIGN - 128)) | (1L << (GT - 128)) | (1L << (LT - 128)) | (1L << (BANG - 128)) | (1L << (TILDE - 128)) | (1L << (QUESTION - 128)) | (1L << (COLON - 128)) | (1L << (EQUAL - 128)) | (1L << (LE - 128)) | (1L << (GE - 128)) | (1L << (NOTEQUAL - 128)) | (1L << (AND - 128)) | (1L << (OR - 128)) | (1L << (INC - 128)) | (1L << (DEC - 128)) | (1L << (ADD - 128)) | (1L << (SUB - 128)) | (1L << (MUL - 128)) | (1L << (DIV - 128)) | (1L << (BITAND - 128)) | (1L << (BITOR - 128)) | (1L << (CARET - 128)) | (1L << (MOD - 128)) | (1L << (COMMENT - 128)) | (1L << (LINE_COMMENT - 128)) | (1L << (WS - 128)) | (1L << (WORDS_TO_SKIP - 128)) | (1L << (Skip - 128)) | (1L << (Affil - 128)))) != 0)) {
				{
				setState(1188);
				switch (_input.LA(1)) {
				case T__128:
				case T__127:
				case T__126:
				case T__125:
				case T__124:
				case T__123:
				case T__122:
				case T__121:
				case T__120:
				case T__119:
				case T__118:
				case T__117:
				case T__116:
				case T__115:
				case T__114:
				case T__113:
				case T__112:
				case T__111:
				case T__110:
				case T__109:
				case T__108:
				case T__107:
				case T__106:
				case T__105:
				case T__104:
				case T__103:
				case T__102:
				case T__101:
				case T__100:
				case T__99:
				case T__98:
				case T__97:
				case T__96:
				case T__95:
				case T__94:
				case T__93:
				case T__92:
				case T__91:
				case T__90:
				case T__89:
				case T__88:
				case T__87:
				case T__86:
				case T__85:
				case T__84:
				case T__83:
				case T__82:
				case T__81:
				case T__80:
				case T__79:
				case T__78:
				case T__77:
				case T__75:
				case T__74:
				case T__73:
				case T__72:
				case T__71:
				case T__70:
				case T__69:
				case T__68:
				case T__67:
				case T__66:
				case T__65:
				case T__64:
				case T__63:
				case T__62:
				case T__61:
				case T__60:
				case T__59:
				case T__58:
				case T__57:
				case T__56:
				case T__55:
				case T__54:
				case T__53:
				case T__52:
				case T__51:
				case T__50:
				case T__49:
				case T__48:
				case T__47:
				case T__46:
				case T__45:
				case T__43:
				case T__42:
				case T__41:
				case T__40:
				case T__39:
				case T__38:
				case T__37:
				case T__36:
				case T__35:
				case T__34:
				case T__33:
				case T__32:
				case T__31:
				case T__30:
				case T__29:
				case T__28:
				case T__27:
				case T__26:
				case T__25:
				case T__24:
				case T__23:
				case T__22:
				case T__21:
				case T__20:
				case T__19:
				case T__18:
				case T__17:
				case T__16:
				case T__15:
				case T__14:
				case T__13:
				case T__12:
				case T__11:
				case T__10:
				case T__9:
				case T__8:
				case T__7:
				case T__6:
				case T__5:
				case T__4:
				case T__3:
				case T__2:
				case T__1:
				case T__0:
				case IgnoreAlgorithmKeyWords:
				case IgnoreUrlPrefix:
				case String:
				case Num:
				case INT:
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
				case DIV:
				case BITOR:
				case CARET:
				case MOD:
				case COMMENT:
				case LINE_COMMENT:
				case WS:
				case WORDS_TO_SKIP:
				case Skip:
				case Affil:
					{
					setState(1186); eqnEquation();
					}
					break;
				case BITAND:
					{
					setState(1187); match(BITAND);
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
		enterRule(_localctx, 182, RULE_eqnEquation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1194); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1193);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__76 || _la==T__44 || _la==BITAND) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1196); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
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
		enterRule(_localctx, 184, RULE_newLine);
		try {
			setState(1200);
			switch (_input.LA(1)) {
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(1198); match(T__36);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(1199); doubleSlash();
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
		enterRule(_localctx, 186, RULE_doubleSlash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1202); match(T__28);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefContext ref() throws RecognitionException {
		RefContext _localctx = new RefContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_ref);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1204); match(TILDE);
			setState(1206);
			_la = _input.LA(1);
			if (_la==T__35) {
				{
				setState(1205); match(T__35);
				}
			}

			setState(1208); match(T__40);
			setState(1209); text();
			setState(1210); match(T__120);
			setState(1212);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(1211); match(T__117);
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
		enterRule(_localctx, 190, RULE_simpleText);
		try {
			setState(1216);
			switch (_input.LA(1)) {
			case String:
				enterOuterAlt(_localctx, 1);
				{
				setState(1214); match(String);
				}
				break;
			case Num:
				enterOuterAlt(_localctx, 2);
				{
				setState(1215); numbers();
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
		public NumbersContext numbers(int i) {
			return getRuleContext(NumbersContext.class,i);
		}
		public List<NumbersContext> numbers() {
			return getRuleContexts(NumbersContext.class);
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
		enterRule(_localctx, 192, RULE_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1218); numbers();
			setState(1219); match(SUB);
			setState(1220); numbers();
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
		enterRule(_localctx, 194, RULE_numbers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1222); match(Num);
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
		enterRule(_localctx, 196, RULE_arabic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1224); match(T__24);
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
		enterRule(_localctx, 198, RULE_specialCharacters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1226);
			_la = _input.LA(1);
			if ( !(_la==T__109 || _la==T__108 || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (T__57 - 72)) | (1L << (T__39 - 72)) | (1L << (T__9 - 72)) | (1L << (T__4 - 72)))) != 0)) ) {
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
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
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
		enterRule(_localctx, 200, RULE_ifThenElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1228); match(T__43);
			setState(1229); block();
			setState(1230); block();
			setState(1231); block();
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
		public SimpleTextContext simpleText(int i) {
			return getRuleContext(SimpleTextContext.class,i);
		}
		public List<SimpleTextContext> simpleText() {
			return getRuleContexts(SimpleTextContext.class);
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
		enterRule(_localctx, 202, RULE_ifThenText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__120 || _la==T__110 || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (T__29 - 100)) | (1L << (String - 100)) | (1L << (Num - 100)))) != 0)) {
				{
				setState(1237);
				switch (_input.LA(1)) {
				case String:
				case Num:
					{
					setState(1233); simpleText();
					}
					break;
				case T__110:
					{
					setState(1234); match(T__110);
					}
					break;
				case T__29:
					{
					setState(1235); match(T__29);
					}
					break;
				case T__120:
					{
					setState(1236); match(T__120);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1241);
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

	public static class AuthorItemMissContext extends ParserRuleContext {
		public List<OptionsContext> options() {
			return getRuleContexts(OptionsContext.class);
		}
		public OptionsContext options(int i) {
			return getRuleContext(OptionsContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AuthorItemMissContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_authorItemMiss; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterAuthorItemMiss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitAuthorItemMiss(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTEXVisitor ) return ((LaTEXVisitor<? extends T>)visitor).visitAuthorItemMiss(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuthorItemMissContext authorItemMiss() throws RecognitionException {
		AuthorItemMissContext _localctx = new AuthorItemMissContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_authorItemMiss);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1242); match(T__84);
			setState(1246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__69) {
				{
				{
				setState(1243); options();
				}
				}
				setState(1248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1249); block();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00a5\u04e6\4\2\t"+
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
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\3\2\7\2\u00d2\n\2"+
		"\f\2\16\2\u00d5\13\2\3\2\7\2\u00d8\n\2\f\2\16\2\u00db\13\2\3\2\7\2\u00de"+
		"\n\2\f\2\16\2\u00e1\13\2\3\2\3\2\7\2\u00e5\n\2\f\2\16\2\u00e8\13\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\5\5\u00f4\n\5\3\5\3\5\3\5\7\5\u00f9"+
		"\n\5\f\5\16\5\u00fc\13\5\3\6\7\6\u00ff\n\6\f\6\16\6\u0102\13\6\3\6\3\6"+
		"\7\6\u0106\n\6\f\6\16\6\u0109\13\6\3\6\3\6\3\7\3\7\7\7\u010f\n\7\f\7\16"+
		"\7\u0112\13\7\3\7\3\7\7\7\u0116\n\7\f\7\16\7\u0119\13\7\3\7\3\7\3\b\3"+
		"\b\7\b\u011f\n\b\f\b\16\b\u0122\13\b\3\b\3\b\7\b\u0126\n\b\f\b\16\b\u0129"+
		"\13\b\3\b\6\b\u012c\n\b\r\b\16\b\u012d\3\b\3\b\3\t\3\t\3\t\7\t\u0135\n"+
		"\t\f\t\16\t\u0138\13\t\3\t\3\t\7\t\u013c\n\t\f\t\16\t\u013f\13\t\3\t\5"+
		"\t\u0142\n\t\3\t\3\t\3\t\3\t\7\t\u0148\n\t\f\t\16\t\u014b\13\t\3\t\3\t"+
		"\7\t\u014f\n\t\f\t\16\t\u0152\13\t\3\t\5\t\u0155\n\t\3\n\3\n\3\n\3\n\7"+
		"\n\u015b\n\n\f\n\16\n\u015e\13\n\3\n\7\n\u0161\n\n\f\n\16\n\u0164\13\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\6\f\u0171\n\f\r\f\16"+
		"\f\u0172\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0180"+
		"\n\16\f\16\16\16\u0183\13\16\3\17\7\17\u0186\n\17\f\17\16\17\u0189\13"+
		"\17\3\20\3\20\7\20\u018d\n\20\f\20\16\20\u0190\13\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u01af"+
		"\n\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\6\23\u01c5\n\23\r\23\16\23\u01c6\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\5\23\u01cf\n\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u01d9\n\24\3\25\3\25\3\25\7\25\u01de\n\25\f\25\16"+
		"\25\u01e1\13\25\3\25\3\25\3\25\3\25\7\25\u01e7\n\25\f\25\16\25\u01ea\13"+
		"\25\3\25\5\25\u01ed\n\25\3\26\3\26\7\26\u01f1\n\26\f\26\16\26\u01f4\13"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0200\n\27"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\7\33"+
		"\u020f\n\33\f\33\16\33\u0212\13\33\3\33\3\33\3\33\5\33\u0217\n\33\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\7\35\u0221\n\35\f\35\16\35\u0224\13"+
		"\35\3\35\3\35\3\36\6\36\u0229\n\36\r\36\16\36\u022a\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\7\37\u0234\n\37\f\37\16\37\u0237\13\37\3\37\3\37\3 \3"+
		" \3 \3!\3!\7!\u0240\n!\f!\16!\u0243\13!\3!\3!\3!\7!\u0248\n!\f!\16!\u024b"+
		"\13!\3!\5!\u024e\n!\3\"\3\"\3\"\3\"\3\"\7\"\u0255\n\"\f\"\16\"\u0258\13"+
		"\"\3\"\3\"\3#\3#\7#\u025e\n#\f#\16#\u0261\13#\3#\3#\3#\3#\3#\3#\3#\5#"+
		"\u026a\n#\3$\7$\u026d\n$\f$\16$\u0270\13$\3%\7%\u0273\n%\f%\16%\u0276"+
		"\13%\3%\3%\7%\u027a\n%\f%\16%\u027d\13%\3&\3&\3&\3&\3\'\7\'\u0284\n\'"+
		"\f\'\16\'\u0287\13\'\3(\7(\u028a\n(\f(\16(\u028d\13(\3(\3(\3(\7(\u0292"+
		"\n(\f(\16(\u0295\13(\3)\3)\7)\u0299\n)\f)\16)\u029c\13)\3)\3)\3*\3*\5"+
		"*\u02a2\n*\3*\7*\u02a5\n*\f*\16*\u02a8\13*\3*\3*\3+\3+\5+\u02ae\n+\3+"+
		"\7+\u02b1\n+\f+\16+\u02b4\13+\3+\7+\u02b7\n+\f+\16+\u02ba\13+\3+\7+\u02bd"+
		"\n+\f+\16+\u02c0\13+\3+\3+\7+\u02c4\n+\f+\16+\u02c7\13+\3+\3+\7+\u02cb"+
		"\n+\f+\16+\u02ce\13+\3+\3+\7+\u02d2\n+\f+\16+\u02d5\13+\3+\3+\7+\u02d9"+
		"\n+\f+\16+\u02dc\13+\3+\7+\u02df\n+\f+\16+\u02e2\13+\3+\7+\u02e5\n+\f"+
		"+\16+\u02e8\13+\3+\3+\3,\3,\3,\3-\3-\3-\7-\u02f2\n-\f-\16-\u02f5\13-\3"+
		"-\3-\7-\u02f9\n-\f-\16-\u02fc\13-\3-\3-\3-\3-\6-\u0302\n-\r-\16-\u0303"+
		"\3-\3-\3.\3.\6.\u030a\n.\r.\16.\u030b\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60"+
		"\3\60\5\60\u0318\n\60\3\61\3\61\3\61\7\61\u031d\n\61\f\61\16\61\u0320"+
		"\13\61\3\62\5\62\u0323\n\62\3\62\3\62\5\62\u0327\n\62\3\63\3\63\3\63\3"+
		"\63\3\63\5\63\u032e\n\63\3\64\3\64\7\64\u0332\n\64\f\64\16\64\u0335\13"+
		"\64\3\64\3\64\3\65\3\65\3\65\3\65\7\65\u033d\n\65\f\65\16\65\u0340\13"+
		"\65\3\65\3\65\3\65\3\65\7\65\u0346\n\65\f\65\16\65\u0349\13\65\3\65\5"+
		"\65\u034c\n\65\3\66\3\66\7\66\u0350\n\66\f\66\16\66\u0353\13\66\3\66\3"+
		"\66\3\67\3\67\5\67\u0359\n\67\38\38\78\u035d\n8\f8\168\u0360\138\38\3"+
		"8\38\78\u0365\n8\f8\168\u0368\138\38\38\58\u036c\n8\58\u036e\n8\39\39"+
		"\39\39\59\u0374\n9\3:\3:\3:\3:\3;\3;\7;\u037c\n;\f;\16;\u037f\13;\3;\3"+
		";\3<\3<\3<\5<\u0386\n<\3<\3<\3<\3=\3=\3=\5=\u038e\n=\3=\3=\3=\3>\3>\3"+
		">\5>\u0396\n>\3>\3>\3>\3?\5?\u039c\n?\3?\3?\7?\u03a0\n?\f?\16?\u03a3\13"+
		"?\3?\3?\3?\3?\3@\3@\3@\7@\u03ac\n@\f@\16@\u03af\13@\3@\3@\7@\u03b3\n@"+
		"\f@\16@\u03b6\13@\7@\u03b8\n@\f@\16@\u03bb\13@\3A\3A\3A\3A\7A\u03c1\n"+
		"A\fA\16A\u03c4\13A\3B\3B\3C\3C\5C\u03ca\nC\3C\7C\u03cd\nC\fC\16C\u03d0"+
		"\13C\3C\3C\3C\5C\u03d5\nC\3C\7C\u03d8\nC\fC\16C\u03db\13C\3C\5C\u03de"+
		"\nC\3D\3D\5D\u03e2\nD\3D\7D\u03e5\nD\fD\16D\u03e8\13D\3D\3D\3D\5D\u03ed"+
		"\nD\3D\7D\u03f0\nD\fD\16D\u03f3\13D\3D\5D\u03f6\nD\3E\3E\5E\u03fa\nE\3"+
		"E\7E\u03fd\nE\fE\16E\u0400\13E\3E\3E\3F\3F\5F\u0406\nF\3F\7F\u0409\nF"+
		"\fF\16F\u040c\13F\3F\3F\3G\3G\3G\3H\3H\3H\3I\3I\7I\u0418\nI\fI\16I\u041b"+
		"\13I\3I\3I\3J\3J\3J\3K\3K\3K\3L\3L\7L\u0427\nL\fL\16L\u042a\13L\3L\3L"+
		"\3M\3M\3M\3M\3M\3N\3N\3O\3O\7O\u0437\nO\fO\16O\u043a\13O\3O\3O\3P\3P\3"+
		"Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\5W\u044e\nW\3W\3W\3X\3X\6X\u0454"+
		"\nX\rX\16X\u0455\3X\3X\3X\3X\6X\u045c\nX\rX\16X\u045d\3X\3X\3X\6X\u0463"+
		"\nX\rX\16X\u0464\3X\3X\3X\6X\u046a\nX\rX\16X\u046b\3X\3X\3X\6X\u0471\n"+
		"X\rX\16X\u0472\3X\3X\5X\u0477\nX\3Y\3Y\3Y\6Y\u047c\nY\rY\16Y\u047d\3Y"+
		"\3Y\3Y\3Y\3Y\6Y\u0485\nY\rY\16Y\u0486\3Y\3Y\5Y\u048b\nY\3Z\3Z\6Z\u048f"+
		"\nZ\rZ\16Z\u0490\3Z\3Z\3[\3[\6[\u0497\n[\r[\16[\u0498\3[\3[\3[\6[\u049e"+
		"\n[\r[\16[\u049f\3[\5[\u04a3\n[\3\\\3\\\7\\\u04a7\n\\\f\\\16\\\u04aa\13"+
		"\\\3]\6]\u04ad\n]\r]\16]\u04ae\3^\3^\5^\u04b3\n^\3_\3_\3`\3`\5`\u04b9"+
		"\n`\3`\3`\3`\3`\5`\u04bf\n`\3a\3a\5a\u04c3\na\3b\3b\3b\3b\3c\3c\3d\3d"+
		"\3e\3e\3f\3f\3f\3f\3f\3g\3g\3g\3g\7g\u04d8\ng\fg\16g\u04db\13g\3h\3h\7"+
		"h\u04df\nh\fh\16h\u04e2\13h\3h\3h\3h\2\2i\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\2\30\3\2__\3\2\13\13\5\2\f\f\61\61ww\4\2\22\22tt\4"+
		"\2@@qq\4\2\35\35VV\6\2\t\tDDSScc\4\2bboo\3\2]]\3\2((\3\2\3\3\3\2CC\3\2"+
		"}}\3\2||\3\2::\3\2BB\3\2RR\3\2\62\62\3\2WW\3\2\67\67\5\2\67\67WW\u009c"+
		"\u009c\7\2\26\27JJ\\\\zz\177\177\u0555\2\u00d3\3\2\2\2\4\u00eb\3\2\2\2"+
		"\6\u00ef\3\2\2\2\b\u00f3\3\2\2\2\n\u0100\3\2\2\2\f\u010c\3\2\2\2\16\u011c"+
		"\3\2\2\2\20\u0131\3\2\2\2\22\u0156\3\2\2\2\24\u0167\3\2\2\2\26\u016b\3"+
		"\2\2\2\30\u0176\3\2\2\2\32\u0178\3\2\2\2\34\u0187\3\2\2\2\36\u018a\3\2"+
		"\2\2 \u01ae\3\2\2\2\"\u01b0\3\2\2\2$\u01ce\3\2\2\2&\u01d8\3\2\2\2(\u01ec"+
		"\3\2\2\2*\u01ee\3\2\2\2,\u01ff\3\2\2\2.\u0201\3\2\2\2\60\u0204\3\2\2\2"+
		"\62\u0209\3\2\2\2\64\u0216\3\2\2\2\66\u0218\3\2\2\28\u021b\3\2\2\2:\u0228"+
		"\3\2\2\2<\u022e\3\2\2\2>\u023a\3\2\2\2@\u024d\3\2\2\2B\u024f\3\2\2\2D"+
		"\u0269\3\2\2\2F\u026e\3\2\2\2H\u0274\3\2\2\2J\u027e\3\2\2\2L\u0285\3\2"+
		"\2\2N\u028b\3\2\2\2P\u0296\3\2\2\2R\u029f\3\2\2\2T\u02ab\3\2\2\2V\u02eb"+
		"\3\2\2\2X\u02ee\3\2\2\2Z\u0307\3\2\2\2\\\u030f\3\2\2\2^\u0313\3\2\2\2"+
		"`\u0319\3\2\2\2b\u0322\3\2\2\2d\u032d\3\2\2\2f\u032f\3\2\2\2h\u034b\3"+
		"\2\2\2j\u034d\3\2\2\2l\u0358\3\2\2\2n\u036d\3\2\2\2p\u0373\3\2\2\2r\u0375"+
		"\3\2\2\2t\u0379\3\2\2\2v\u0382\3\2\2\2x\u038a\3\2\2\2z\u0392\3\2\2\2|"+
		"\u039b\3\2\2\2~\u03a8\3\2\2\2\u0080\u03c2\3\2\2\2\u0082\u03c5\3\2\2\2"+
		"\u0084\u03dd\3\2\2\2\u0086\u03f5\3\2\2\2\u0088\u03f7\3\2\2\2\u008a\u0403"+
		"\3\2\2\2\u008c\u040f\3\2\2\2\u008e\u0412\3\2\2\2\u0090\u0415\3\2\2\2\u0092"+
		"\u041e\3\2\2\2\u0094\u0421\3\2\2\2\u0096\u0424\3\2\2\2\u0098\u042d\3\2"+
		"\2\2\u009a\u0432\3\2\2\2\u009c\u0434\3\2\2\2\u009e\u043d\3\2\2\2\u00a0"+
		"\u043f\3\2\2\2\u00a2\u0441\3\2\2\2\u00a4\u0443\3\2\2\2\u00a6\u0445\3\2"+
		"\2\2\u00a8\u0447\3\2\2\2\u00aa\u0449\3\2\2\2\u00ac\u044b\3\2\2\2\u00ae"+
		"\u0476\3\2\2\2\u00b0\u048a\3\2\2\2\u00b2\u048c\3\2\2\2\u00b4\u04a2\3\2"+
		"\2\2\u00b6\u04a8\3\2\2\2\u00b8\u04ac\3\2\2\2\u00ba\u04b2\3\2\2\2\u00bc"+
		"\u04b4\3\2\2\2\u00be\u04b6\3\2\2\2\u00c0\u04c2\3\2\2\2\u00c2\u04c4\3\2"+
		"\2\2\u00c4\u04c8\3\2\2\2\u00c6\u04ca\3\2\2\2\u00c8\u04cc\3\2\2\2\u00ca"+
		"\u04ce\3\2\2\2\u00cc\u04d9\3\2\2\2\u00ce\u04dc\3\2\2\2\u00d0\u00d2\5\u00ba"+
		"^\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00d9\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d8\5\6"+
		"\4\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\u00df\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00de\5\u00ba"+
		"^\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e6\5\4"+
		"\3\2\u00e3\u00e5\5\u00ba^\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e6\3\2"+
		"\2\2\u00e9\u00ea\7\2\2\3\u00ea\3\3\2\2\2\u00eb\u00ec\7s\2\2\u00ec\u00ed"+
		"\5\n\6\2\u00ed\u00ee\7\23\2\2\u00ee\5\3\2\2\2\u00ef\u00f0\5\b\5\2\u00f0"+
		"\7\3\2\2\2\u00f1\u00f4\58\35\2\u00f2\u00f4\5<\37\2\u00f3\u00f1\3\2\2\2"+
		"\u00f3\u00f2\3\2\2\2\u00f4\u00fa\3\2\2\2\u00f5\u00f9\58\35\2\u00f6\u00f9"+
		"\5<\37\2\u00f7\u00f9\5\u00ba^\2\u00f8\u00f5\3\2\2\2\u00f8\u00f6\3\2\2"+
		"\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb"+
		"\3\2\2\2\u00fb\t\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00ff\7_\2\2\u00fe"+
		"\u00fd\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2"+
		"\2\2\u0101\u0103\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0107\5\f\7\2\u0104"+
		"\u0106\7_\2\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2"+
		"\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u0107\3\2\2\2\u010a"+
		"\u010b\5\34\17\2\u010b\13\3\2\2\2\u010c\u0110\7\u0083\2\2\u010d\u010f"+
		"\7_\2\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111\u0113\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0117\5\16"+
		"\b\2\u0114\u0116\7_\2\2\u0115\u0114\3\2\2\2\u0116\u0119\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u0117\3\2"+
		"\2\2\u011a\u011b\7i\2\2\u011b\r\3\2\2\2\u011c\u0120\5\20\t\2\u011d\u011f"+
		"\7_\2\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0127\5\22"+
		"\n\2\u0124\u0126\7_\2\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127"+
		"\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2"+
		"\2\2\u012a\u012c\5\32\16\2\u012b\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\5\36"+
		"\20\2\u0130\17\3\2\2\2\u0131\u0132\7f\2\2\u0132\u0136\7\f\2\2\u0133\u0135"+
		"\7_\2\2\u0134\u0133\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\u0139\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013d\7!"+
		"\2\2\u013a\u013c\7_\2\2\u013b\u013a\3\2\2\2\u013c\u013f\3\2\2\2\u013d"+
		"\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2"+
		"\2\2\u0140\u0142\7E\2\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\u0144\7f\2\2\u0144\u0145\5*\26\2\u0145\u0149\7\13"+
		"\2\2\u0146\u0148\7_\2\2\u0147\u0146\3\2\2\2\u0148\u014b\3\2\2\2\u0149"+
		"\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b\u0149\3\2"+
		"\2\2\u014c\u0150\7\13\2\2\u014d\u014f\7_\2\2\u014e\u014d\3\2\2\2\u014f"+
		"\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0154\3\2"+
		"\2\2\u0152\u0150\3\2\2\2\u0153\u0155\7E\2\2\u0154\u0153\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155\21\3\2\2\2\u0156\u0157\7g\2\2\u0157\u015c\5\24\13"+
		"\2\u0158\u0159\7\34\2\2\u0159\u015b\5\24\13\2\u015a\u0158\3\2\2\2\u015b"+
		"\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u0162\3\2"+
		"\2\2\u015e\u015c\3\2\2\2\u015f\u0161\7_\2\2\u0160\u015f\3\2\2\2\u0161"+
		"\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0165\3\2"+
		"\2\2\u0164\u0162\3\2\2\2\u0165\u0166\7g\2\2\u0166\23\3\2\2\2\u0167\u0168"+
		"\5\30\r\2\u0168\u0169\7I\2\2\u0169\u016a\5\26\f\2\u016a\25\3\2\2\2\u016b"+
		"\u0170\7f\2\2\u016c\u0171\5\u00c4c\2\u016d\u0171\7\u009a\2\2\u016e\u0171"+
		"\5\u00c8e\2\u016f\u0171\7\34\2\2\u0170\u016c\3\2\2\2\u0170\u016d\3\2\2"+
		"\2\u0170\u016e\3\2\2\2\u0170\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0170"+
		"\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\7\13\2\2"+
		"\u0175\27\3\2\2\2\u0176\u0177\5*\26\2\u0177\31\3\2\2\2\u0178\u0179\7\u0082"+
		"\2\2\u0179\u017a\7f\2\2\u017a\u017b\5\u00c4c\2\u017b\u017c\7\13\2\2\u017c"+
		"\u017d\5*\26\2\u017d\u0181\7g\2\2\u017e\u0180\7_\2\2\u017f\u017e\3\2\2"+
		"\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\33"+
		"\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0186\5\36\20\2\u0185\u0184\3\2\2\2"+
		"\u0186\u0189\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\35"+
		"\3\2\2\2\u0189\u0187\3\2\2\2\u018a\u018e\5 \21\2\u018b\u018d\5 \21\2\u018c"+
		"\u018b\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2"+
		"\2\2\u018f\37\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u01af\5\u00c8e\2\u0192"+
		"\u01af\5\66\34\2\u0193\u01af\5T+\2\u0194\u01af\5\64\33\2\u0195\u01af\5"+
		"$\23\2\u0196\u01af\5\u0084C\2\u0197\u01af\5\u0086D\2\u0198\u01af\5\u0088"+
		"E\2\u0199\u01af\5\u008aF\2\u019a\u01af\5\u008cG\2\u019b\u01af\5\u008e"+
		"H\2\u019c\u01af\5\u0090I\2\u019d\u01af\5\u0092J\2\u019e\u01af\5\u0094"+
		"K\2\u019f\u01af\5\u0096L\2\u01a0\u01af\5R*\2\u01a1\u01af\5B\"\2\u01a2"+
		"\u01af\5\60\31\2\u01a3\u01af\5J&\2\u01a4\u01af\5v<\2\u01a5\u01af\5x=\2"+
		"\u01a6\u01af\5z>\2\u01a7\u01af\5<\37\2\u01a8\u01af\5|?\2\u01a9\u01af\5"+
		"\u00be`\2\u01aa\u01af\5\u00ba^\2\u01ab\u01af\5\u0098M\2\u01ac\u01af\5"+
		"\u00caf\2\u01ad\u01af\5\u00ceh\2\u01ae\u0191\3\2\2\2\u01ae\u0192\3\2\2"+
		"\2\u01ae\u0193\3\2\2\2\u01ae\u0194\3\2\2\2\u01ae\u0195\3\2\2\2\u01ae\u0196"+
		"\3\2\2\2\u01ae\u0197\3\2\2\2\u01ae\u0198\3\2\2\2\u01ae\u0199\3\2\2\2\u01ae"+
		"\u019a\3\2\2\2\u01ae\u019b\3\2\2\2\u01ae\u019c\3\2\2\2\u01ae\u019d\3\2"+
		"\2\2\u01ae\u019e\3\2\2\2\u01ae\u019f\3\2\2\2\u01ae\u01a0\3\2\2\2\u01ae"+
		"\u01a1\3\2\2\2\u01ae\u01a2\3\2\2\2\u01ae\u01a3\3\2\2\2\u01ae\u01a4\3\2"+
		"\2\2\u01ae\u01a5\3\2\2\2\u01ae\u01a6\3\2\2\2\u01ae\u01a7\3\2\2\2\u01ae"+
		"\u01a8\3\2\2\2\u01ae\u01a9\3\2\2\2\u01ae\u01aa\3\2\2\2\u01ae\u01ab\3\2"+
		"\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01ad\3\2\2\2\u01af!\3\2\2\2\u01b0\u01b1"+
		"\7F\2\2\u01b1\u01b2\5\36\20\2\u01b2\u01b3\7\u0081\2\2\u01b3#\3\2\2\2\u01b4"+
		"\u01cf\5\u00acW\2\u01b5\u01cf\5&\24\2\u01b6\u01cf\5\"\22\2\u01b7\u01cf"+
		"\5\u00aeX\2\u01b8\u01cf\5\u00b0Y\2\u01b9\u01cf\5\u00b2Z\2\u01ba\u01cf"+
		"\5(\25\2\u01bb\u01cf\5D#\2\u01bc\u01cf\5r:\2\u01bd\u01cf\5t;\2\u01be\u01cf"+
		"\5.\30\2\u01bf\u01cf\5@!\2\u01c0\u01cf\5d\63\2\u01c1\u01cf\5\u00c2b\2"+
		"\u01c2\u01cf\5\u0082B\2\u01c3\u01c5\5\u00c0a\2\u01c4\u01c3\3\2\2\2\u01c5"+
		"\u01c6\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01cf\3\2"+
		"\2\2\u01c8\u01cf\5\u00c6d\2\u01c9\u01cf\5> \2\u01ca\u01cf\5^\60\2\u01cb"+
		"\u01cf\5\u00a2R\2\u01cc\u01cf\5\u009eP\2\u01cd\u01cf\5\u00a6T\2\u01ce"+
		"\u01b4\3\2\2\2\u01ce\u01b5\3\2\2\2\u01ce\u01b6\3\2\2\2\u01ce\u01b7\3\2"+
		"\2\2\u01ce\u01b8\3\2\2\2\u01ce\u01b9\3\2\2\2\u01ce\u01ba\3\2\2\2\u01ce"+
		"\u01bb\3\2\2\2\u01ce\u01bc\3\2\2\2\u01ce\u01bd\3\2\2\2\u01ce\u01be\3\2"+
		"\2\2\u01ce\u01bf\3\2\2\2\u01ce\u01c0\3\2\2\2\u01ce\u01c1\3\2\2\2\u01ce"+
		"\u01c2\3\2\2\2\u01ce\u01c4\3\2\2\2\u01ce\u01c8\3\2\2\2\u01ce\u01c9\3\2"+
		"\2\2\u01ce\u01ca\3\2\2\2\u01ce\u01cb\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce"+
		"\u01cd\3\2\2\2\u01cf%\3\2\2\2\u01d0\u01d9\5\u00a0Q\2\u01d1\u01d9\5\u00a4"+
		"S\2\u01d2\u01d9\5\u00a8U\2\u01d3\u01d9\5\u00aaV\2\u01d4\u01d9\7\u0099"+
		"\2\2\u01d5\u01d9\7\u009b\2\2\u01d6\u01d9\7\u009a\2\2\u01d7\u01d9\7\20"+
		"\2\2\u01d8\u01d0\3\2\2\2\u01d8\u01d1\3\2\2\2\u01d8\u01d2\3\2\2\2\u01d8"+
		"\u01d3\3\2\2\2\u01d8\u01d4\3\2\2\2\u01d8\u01d5\3\2\2\2\u01d8\u01d6\3\2"+
		"\2\2\u01d8\u01d7\3\2\2\2\u01d9\'\3\2\2\2\u01da\u01db\7{\2\2\u01db\u01df"+
		"\7f\2\2\u01dc\u01de\5\36\20\2\u01dd\u01dc\3\2\2\2\u01de\u01e1\3\2\2\2"+
		"\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e2\3\2\2\2\u01e1\u01df"+
		"\3\2\2\2\u01e2\u01ed\7\13\2\2\u01e3\u01e4\7\36\2\2\u01e4\u01e8\7f\2\2"+
		"\u01e5\u01e7\5\36\20\2\u01e6\u01e5\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6"+
		"\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01eb\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb"+
		"\u01ed\7\13\2\2\u01ec\u01da\3\2\2\2\u01ec\u01e3\3\2\2\2\u01ed)\3\2\2\2"+
		"\u01ee\u01f2\5,\27\2\u01ef\u01f1\5,\27\2\u01f0\u01ef\3\2\2\2\u01f1\u01f4"+
		"\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3+\3\2\2\2\u01f4"+
		"\u01f2\3\2\2\2\u01f5\u0200\5\62\32\2\u01f6\u0200\5d\63\2\u01f7\u0200\5"+
		"\u00c0a\2\u01f8\u0200\5&\24\2\u01f9\u0200\5\u00acW\2\u01fa\u0200\5@!\2"+
		"\u01fb\u0200\5\u00a6T\2\u01fc\u0200\5\u009eP\2\u01fd\u0200\5\u0098M\2"+
		"\u01fe\u0200\7_\2\2\u01ff\u01f5\3\2\2\2\u01ff\u01f6\3\2\2\2\u01ff\u01f7"+
		"\3\2\2\2\u01ff\u01f8\3\2\2\2\u01ff\u01f9\3\2\2\2\u01ff\u01fa\3\2\2\2\u01ff"+
		"\u01fb\3\2\2\2\u01ff\u01fc\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u01fe\3\2"+
		"\2\2\u0200-\3\2\2\2\u0201\u0202\7\5\2\2\u0202\u0203\5@!\2\u0203/\3\2\2"+
		"\2\u0204\u0205\7\66\2\2\u0205\u0206\7f\2\2\u0206\u0207\5*\26\2\u0207\u0208"+
		"\7\13\2\2\u0208\61\3\2\2\2\u0209\u020a\7Q\2\2\u020a\u020b\5@!\2\u020b"+
		"\63\3\2\2\2\u020c\u0210\7\64\2\2\u020d\u020f\5\36\20\2\u020e\u020d\3\2"+
		"\2\2\u020f\u0212\3\2\2\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211"+
		"\u0213\3\2\2\2\u0212\u0210\3\2\2\2\u0213\u0217\7P\2\2\u0214\u0215\7\63"+
		"\2\2\u0215\u0217\5@!\2\u0216\u020c\3\2\2\2\u0216\u0214\3\2\2\2\u0217\65"+
		"\3\2\2\2\u0218\u0219\7?\2\2\u0219\u021a\5@!\2\u021a\67\3\2\2\2\u021b\u021c"+
		"\7)\2\2\u021c\u021d\7f\2\2\u021d\u021e\5> \2\u021e\u0222\7\13\2\2\u021f"+
		"\u0221\5\u009cO\2\u0220\u021f\3\2\2\2\u0221\u0224\3\2\2\2\u0222\u0220"+
		"\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0225\3\2\2\2\u0224\u0222\3\2\2\2\u0225"+
		"\u0226\5:\36\2\u02269\3\2\2\2\u0227\u0229\n\2\2\2\u0228\u0227\3\2\2\2"+
		"\u0229\u022a\3\2\2\2\u022a\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022c"+
		"\3\2\2\2\u022c\u022d\7_\2\2\u022d;\3\2\2\2\u022e\u022f\7\7\2\2\u022f\u0230"+
		"\7f\2\2\u0230\u0231\5> \2\u0231\u0235\7\13\2\2\u0232\u0234\5\u009cO\2"+
		"\u0233\u0232\3\2\2\2\u0234\u0237\3\2\2\2\u0235\u0233\3\2\2\2\u0235\u0236"+
		"\3\2\2\2\u0236\u0238\3\2\2\2\u0237\u0235\3\2\2\2\u0238\u0239\5:\36\2\u0239"+
		"=\3\2\2\2\u023a\u023b\7\25\2\2\u023b\u023c\5\u00c0a\2\u023c?\3\2\2\2\u023d"+
		"\u0241\7f\2\2\u023e\u0240\5\36\20\2\u023f\u023e\3\2\2\2\u0240\u0243\3"+
		"\2\2\2\u0241\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0244\3\2\2\2\u0243"+
		"\u0241\3\2\2\2\u0244\u024e\7\13\2\2\u0245\u0249\7a\2\2\u0246\u0248\5\36"+
		"\20\2\u0247\u0246\3\2\2\2\u0248\u024b\3\2\2\2\u0249\u0247\3\2\2\2\u0249"+
		"\u024a\3\2\2\2\u024a\u024c\3\2\2\2\u024b\u0249\3\2\2\2\u024c\u024e\7p"+
		"\2\2\u024d\u023d\3\2\2\2\u024d\u0245\3\2\2\2\u024eA\3\2\2\2\u024f\u0250"+
		"\7\r\2\2\u0250\u0251\7f\2\2\u0251\u0252\7\u0088\2\2\u0252\u0256\7\13\2"+
		"\2\u0253\u0255\5\36\20\2\u0254\u0253\3\2\2\2\u0255\u0258\3\2\2\2\u0256"+
		"\u0254\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0259\3\2\2\2\u0258\u0256\3\2"+
		"\2\2\u0259\u025a\7~\2\2\u025aC\3\2\2\2\u025b\u025f\7\21\2\2\u025c\u025e"+
		"\5\u009cO\2\u025d\u025c\3\2\2\2\u025e\u0261\3\2\2\2\u025f\u025d\3\2\2"+
		"\2\u025f\u0260\3\2\2\2\u0260\u0262\3\2\2\2\u0261\u025f\3\2\2\2\u0262\u0263"+
		"\5F$\2\u0263\u0264\7x\2\2\u0264\u026a\3\2\2\2\u0265\u0266\7.\2\2\u0266"+
		"\u0267\5F$\2\u0267\u0268\7\30\2\2\u0268\u026a\3\2\2\2\u0269\u025b\3\2"+
		"\2\2\u0269\u0265\3\2\2\2\u026aE\3\2\2\2\u026b\u026d\5H%\2\u026c\u026b"+
		"\3\2\2\2\u026d\u0270\3\2\2\2\u026e\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026f"+
		"G\3\2\2\2\u0270\u026e\3\2\2\2\u0271\u0273\7_\2\2\u0272\u0271\3\2\2\2\u0273"+
		"\u0276\3\2\2\2\u0274\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0277\3\2"+
		"\2\2\u0276\u0274\3\2\2\2\u0277\u027b\7*\2\2\u0278\u027a\5\36\20\2\u0279"+
		"\u0278\3\2\2\2\u027a\u027d\3\2\2\2\u027b\u0279\3\2\2\2\u027b\u027c\3\2"+
		"\2\2\u027cI\3\2\2\2\u027d\u027b\3\2\2\2\u027e\u027f\7Y\2\2\u027f\u0280"+
		"\5L\'\2\u0280\u0281\7l\2\2\u0281K\3\2\2\2\u0282\u0284\5N(\2\u0283\u0282"+
		"\3\2\2\2\u0284\u0287\3\2\2\2\u0285\u0283\3\2\2\2\u0285\u0286\3\2\2\2\u0286"+
		"M\3\2\2\2\u0287\u0285\3\2\2\2\u0288\u028a\7_\2\2\u0289\u0288\3\2\2\2\u028a"+
		"\u028d\3\2\2\2\u028b\u0289\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u028e\3\2"+
		"\2\2\u028d\u028b\3\2\2\2\u028e\u028f\7*\2\2\u028f\u0293\5P)\2\u0290\u0292"+
		"\5\36\20\2\u0291\u0290\3\2\2\2\u0292\u0295\3\2\2\2\u0293\u0291\3\2\2\2"+
		"\u0293\u0294\3\2\2\2\u0294O\3\2\2\2\u0295\u0293\3\2\2\2\u0296\u029a\7"+
		">\2\2\u0297\u0299\5\36\20\2\u0298\u0297\3\2\2\2\u0299\u029c\3\2\2\2\u029a"+
		"\u0298\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u029d\3\2\2\2\u029c\u029a\3\2"+
		"\2\2\u029d\u029e\7]\2\2\u029eQ\3\2\2\2\u029f\u02a1\7-\2\2\u02a0\u02a2"+
		"\5\u009cO\2\u02a1\u02a0\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a6\3\2\2"+
		"\2\u02a3\u02a5\5\u00ba^\2\u02a4\u02a3\3\2\2\2\u02a5\u02a8\3\2\2\2\u02a6"+
		"\u02a4\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a9\3\2\2\2\u02a8\u02a6\3\2"+
		"\2\2\u02a9\u02aa\5@!\2\u02aaS\3\2\2\2\u02ab\u02ad\7#\2\2\u02ac\u02ae\5"+
		"\u009cO\2\u02ad\u02ac\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02b2\3\2\2\2"+
		"\u02af\u02b1\7_\2\2\u02b0\u02af\3\2\2\2\u02b1\u02b4\3\2\2\2\u02b2\u02b0"+
		"\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b8\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b5"+
		"\u02b7\7L\2\2\u02b6\u02b5\3\2\2\2\u02b7\u02ba\3\2\2\2\u02b8\u02b6\3\2"+
		"\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02be\3\2\2\2\u02ba\u02b8\3\2\2\2\u02bb"+
		"\u02bd\7_\2\2\u02bc\u02bb\3\2\2\2\u02bd\u02c0\3\2\2\2\u02be\u02bc\3\2"+
		"\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c1\3\2\2\2\u02c0\u02be\3\2\2\2\u02c1"+
		"\u02c5\5V,\2\u02c2\u02c4\7_\2\2\u02c3\u02c2\3\2\2\2\u02c4\u02c7\3\2\2"+
		"\2\u02c5\u02c3\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c8\3\2\2\2\u02c7\u02c5"+
		"\3\2\2\2\u02c8\u02cc\5X-\2\u02c9\u02cb\7_\2\2\u02ca\u02c9\3\2\2\2\u02cb"+
		"\u02ce\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02cf\3\2"+
		"\2\2\u02ce\u02cc\3\2\2\2\u02cf\u02d3\5\\/\2\u02d0\u02d2\7_\2\2\u02d1\u02d0"+
		"\3\2\2\2\u02d2\u02d5\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4"+
		"\u02d6\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d6\u02da\5\60\31\2\u02d7\u02d9\7"+
		"_\2\2\u02d8\u02d7\3\2\2\2\u02d9\u02dc\3\2\2\2\u02da\u02d8\3\2\2\2\u02da"+
		"\u02db\3\2\2\2\u02db\u02e0\3\2\2\2\u02dc\u02da\3\2\2\2\u02dd\u02df\7\4"+
		"\2\2\u02de\u02dd\3\2\2\2\u02df\u02e2\3\2\2\2\u02e0\u02de\3\2\2\2\u02e0"+
		"\u02e1\3\2\2\2\u02e1\u02e6\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e3\u02e5\7_"+
		"\2\2\u02e4\u02e3\3\2\2\2\u02e5\u02e8\3\2\2\2\u02e6\u02e4\3\2\2\2\u02e6"+
		"\u02e7\3\2\2\2\u02e7\u02e9\3\2\2\2\u02e8\u02e6\3\2\2\2\u02e9\u02ea\7\6"+
		"\2\2\u02eaU\3\2\2\2\u02eb\u02ec\7-\2\2\u02ec\u02ed\5@!\2\u02edW\3\2\2"+
		"\2\u02ee\u02ef\7\32\2\2\u02ef\u02f3\5Z.\2\u02f0\u02f2\7_\2\2\u02f1\u02f0"+
		"\3\2\2\2\u02f2\u02f5\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4"+
		"\u02f6\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f6\u02fa\7<\2\2\u02f7\u02f9\7_\2"+
		"\2\u02f8\u02f7\3\2\2\2\u02f9\u02fc\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fa\u02fb"+
		"\3\2\2\2\u02fb\u0301\3\2\2\2\u02fc\u02fa\3\2\2\2\u02fd\u02fe\5`\61\2\u02fe"+
		"\u02ff\7\31\2\2\u02ff\u0300\7_\2\2\u0300\u0302\3\2\2\2\u0301\u02fd\3\2"+
		"\2\2\u0302\u0303\3\2\2\2\u0303\u0301\3\2\2\2\u0303\u0304\3\2\2\2\u0304"+
		"\u0305\3\2\2\2\u0305\u0306\7\n\2\2\u0306Y\3\2\2\2\u0307\u0309\7f\2\2\u0308"+
		"\u030a\n\3\2\2\u0309\u0308\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u0309\3\2"+
		"\2\2\u030b\u030c\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u030e\7\13\2\2\u030e"+
		"[\3\2\2\2\u030f\u0310\7\u0083\2\2\u0310\u0311\5\36\20\2\u0311\u0312\7"+
		"i\2\2\u0312]\3\2\2\2\u0313\u0314\7U\2\2\u0314\u0315\5@!\2\u0315\u0317"+
		"\5Z.\2\u0316\u0318\5@!\2\u0317\u0316\3\2\2\2\u0317\u0318\3\2\2\2\u0318"+
		"_\3\2\2\2\u0319\u031e\5b\62\2\u031a\u031b\7\u009c\2\2\u031b\u031d\5b\62"+
		"\2\u031c\u031a\3\2\2\2\u031d\u0320\3\2\2\2\u031e\u031c\3\2\2\2\u031e\u031f"+
		"\3\2\2\2\u031fa\3\2\2\2\u0320\u031e\3\2\2\2\u0321\u0323\7(\2\2\u0322\u0321"+
		"\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0326\5\36\20\2"+
		"\u0325\u0327\7(\2\2\u0326\u0325\3\2\2\2\u0326\u0327\3\2\2\2\u0327c\3\2"+
		"\2\2\u0328\u032e\5l\67\2\u0329\u032e\5j\66\2\u032a\u032e\5h\65\2\u032b"+
		"\u032e\t\4\2\2\u032c\u032e\5f\64\2\u032d\u0328\3\2\2\2\u032d\u0329\3\2"+
		"\2\2\u032d\u032a\3\2\2\2\u032d\u032b\3\2\2\2\u032d\u032c\3\2\2\2\u032e"+
		"e\3\2\2\2\u032f\u0333\7=\2\2\u0330\u0332\5\36\20\2\u0331\u0330\3\2\2\2"+
		"\u0332\u0335\3\2\2\2\u0333\u0331\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0336"+
		"\3\2\2\2\u0335\u0333\3\2\2\2\u0336\u0337\7\13\2\2\u0337g\3\2\2\2\u0338"+
		"\u0339\7!\2\2\u0339\u034c\5@!\2\u033a\u033e\7v\2\2\u033b\u033d\5\36\20"+
		"\2\u033c\u033b\3\2\2\2\u033d\u0340\3\2\2\2\u033e\u033c\3\2\2\2\u033e\u033f"+
		"\3\2\2\2\u033f\u0341\3\2\2\2\u0340\u033e\3\2\2\2\u0341\u034c\7\13\2\2"+
		"\u0342\u0343\7\u0082\2\2\u0343\u0347\7f\2\2\u0344\u0346\5\36\20\2\u0345"+
		"\u0344\3\2\2\2\u0346\u0349\3\2\2\2\u0347\u0345\3\2\2\2\u0347\u0348\3\2"+
		"\2\2\u0348\u034a\3\2\2\2\u0349\u0347\3\2\2\2\u034a\u034c\7\13\2\2\u034b"+
		"\u0338\3\2\2\2\u034b\u033a\3\2\2\2\u034b\u0342\3\2\2\2\u034ci\3\2\2\2"+
		"\u034d\u0351\7A\2\2\u034e\u0350\5*\26\2\u034f\u034e\3\2\2\2\u0350\u0353"+
		"\3\2\2\2\u0351\u034f\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0354\3\2\2\2\u0353"+
		"\u0351\3\2\2\2\u0354\u0355\7\13\2\2\u0355k\3\2\2\2\u0356\u0359\5n8\2\u0357"+
		"\u0359\5p9\2\u0358\u0356\3\2\2\2\u0358\u0357\3\2\2\2\u0359m\3\2\2\2\u035a"+
		"\u035e\7O\2\2\u035b\u035d\5\36\20\2\u035c\u035b\3\2\2\2\u035d\u0360\3"+
		"\2\2\2\u035e\u035c\3\2\2\2\u035e\u035f\3\2\2\2\u035f\u0361\3\2\2\2\u0360"+
		"\u035e\3\2\2\2\u0361\u036e\7\13\2\2\u0362\u0366\7r\2\2\u0363\u0365\5\36"+
		"\20\2\u0364\u0363\3\2\2\2\u0365\u0368\3\2\2\2\u0366\u0364\3\2\2\2\u0366"+
		"\u0367\3\2\2\2\u0367\u0369\3\2\2\2\u0368\u0366\3\2\2\2\u0369\u036b\7\13"+
		"\2\2\u036a\u036c\7\25\2\2\u036b\u036a\3\2\2\2\u036b\u036c\3\2\2\2\u036c"+
		"\u036e\3\2\2\2\u036d\u035a\3\2\2\2\u036d\u0362\3\2\2\2\u036eo\3\2\2\2"+
		"\u036f\u0370\7&\2\2\u0370\u0374\5@!\2\u0371\u0372\79\2\2\u0372\u0374\5"+
		"@!\2\u0373\u036f\3\2\2\2\u0373\u0371\3\2\2\2\u0374q\3\2\2\2\u0375\u0376"+
		"\7\u0083\2\2\u0376\u0377\5\36\20\2\u0377\u0378\7i\2\2\u0378s\3\2\2\2\u0379"+
		"\u037d\7;\2\2\u037a\u037c\5\36\20\2\u037b\u037a\3\2\2\2\u037c\u037f\3"+
		"\2\2\2\u037d\u037b\3\2\2\2\u037d\u037e\3\2\2\2\u037e\u0380\3\2\2\2\u037f"+
		"\u037d\3\2\2\2\u0380\u0381\7G\2\2\u0381u\3\2\2\2\u0382\u0383\t\5\2\2\u0383"+
		"\u0385\7f\2\2\u0384\u0386\5\60\31\2\u0385\u0384\3\2\2\2\u0385\u0386\3"+
		"\2\2\2\u0386\u0387\3\2\2\2\u0387\u0388\5*\26\2\u0388\u0389\7\13\2\2\u0389"+
		"w\3\2\2\2\u038a\u038b\t\6\2\2\u038b\u038d\7f\2\2\u038c\u038e\5\60\31\2"+
		"\u038d\u038c\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u038f\3\2\2\2\u038f\u0390"+
		"\5*\26\2\u0390\u0391\7\13\2\2\u0391y\3\2\2\2\u0392\u0393\t\7\2\2\u0393"+
		"\u0395\7f\2\2\u0394\u0396\5\60\31\2\u0395\u0394\3\2\2\2\u0395\u0396\3"+
		"\2\2\2\u0396\u0397\3\2\2\2\u0397\u0398\5*\26\2\u0398\u0399\7\13\2\2\u0399"+
		"{\3\2\2\2\u039a\u039c\7\u008d\2\2\u039b\u039a\3\2\2\2\u039b\u039c\3\2"+
		"\2\2\u039c\u039d\3\2\2\2\u039d\u03a1\t\b\2\2\u039e\u03a0\5\u009cO\2\u039f"+
		"\u039e\3\2\2\2\u03a0\u03a3\3\2\2\2\u03a1\u039f\3\2\2\2\u03a1\u03a2\3\2"+
		"\2\2\u03a2\u03a4\3\2\2\2\u03a3\u03a1\3\2\2\2\u03a4\u03a5\7f\2\2\u03a5"+
		"\u03a6\5~@\2\u03a6\u03a7\7\13\2\2\u03a7}\3\2\2\2\u03a8\u03b9\5\u0080A"+
		"\2\u03a9\u03ad\7\34\2\2\u03aa\u03ac\7_\2\2\u03ab\u03aa\3\2\2\2\u03ac\u03af"+
		"\3\2\2\2\u03ad\u03ab\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae\u03b0\3\2\2\2\u03af"+
		"\u03ad\3\2\2\2\u03b0\u03b4\5\u0080A\2\u03b1\u03b3\7_\2\2\u03b2\u03b1\3"+
		"\2\2\2\u03b3\u03b6\3\2\2\2\u03b4\u03b2\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5"+
		"\u03b8\3\2\2\2\u03b6\u03b4\3\2\2\2\u03b7\u03a9\3\2\2\2\u03b8\u03bb\3\2"+
		"\2\2\u03b9\u03b7\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\177\3\2\2\2\u03bb\u03b9"+
		"\3\2\2\2\u03bc\u03c1\5\u00c0a\2\u03bd\u03c1\5\u00a8U\2\u03be\u03c1\5\u00aa"+
		"V\2\u03bf\u03c1\5\u00a6T\2\u03c0\u03bc\3\2\2\2\u03c0\u03bd\3\2\2\2\u03c0"+
		"\u03be\3\2\2\2\u03c0\u03bf\3\2\2\2\u03c1\u03c4\3\2\2\2\u03c2\u03c0\3\2"+
		"\2\2\u03c2\u03c3\3\2\2\2\u03c3\u0081\3\2\2\2\u03c4\u03c2\3\2\2\2\u03c5"+
		"\u03c6\t\t\2\2\u03c6\u0083\3\2\2\2\u03c7\u03c9\7h\2\2\u03c8\u03ca\5\u009c"+
		"O\2\u03c9\u03c8\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03ce\3\2\2\2\u03cb"+
		"\u03cd\5\36\20\2\u03cc\u03cb\3\2\2\2\u03cd\u03d0\3\2\2\2\u03ce\u03cc\3"+
		"\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d1\3\2\2\2\u03d0\u03ce\3\2\2\2\u03d1"+
		"\u03de\7T\2\2\u03d2\u03d4\78\2\2\u03d3\u03d5\5\u009cO\2\u03d4\u03d3\3"+
		"\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03d9\3\2\2\2\u03d6\u03d8\5\36\20\2\u03d7"+
		"\u03d6\3\2\2\2\u03d8\u03db\3\2\2\2\u03d9\u03d7\3\2\2\2\u03d9\u03da\3\2"+
		"\2\2\u03da\u03dc\3\2\2\2\u03db\u03d9\3\2\2\2\u03dc\u03de\7\33\2\2\u03dd"+
		"\u03c7\3\2\2\2\u03dd\u03d2\3\2\2\2\u03de\u0085\3\2\2\2\u03df\u03e1\7%"+
		"\2\2\u03e0\u03e2\5\u009cO\2\u03e1\u03e0\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2"+
		"\u03e6\3\2\2\2\u03e3\u03e5\5\36\20\2\u03e4\u03e3\3\2\2\2\u03e5\u03e8\3"+
		"\2\2\2\u03e6\u03e4\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u03e9\3\2\2\2\u03e8"+
		"\u03e6\3\2\2\2\u03e9\u03f6\7\'\2\2\u03ea\u03ec\7$\2\2\u03eb\u03ed\5\u009c"+
		"O\2\u03ec\u03eb\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u03f1\3\2\2\2\u03ee"+
		"\u03f0\5\36\20\2\u03ef\u03ee\3\2\2\2\u03f0\u03f3\3\2\2\2\u03f1\u03ef\3"+
		"\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f4\3\2\2\2\u03f3\u03f1\3\2\2\2\u03f4"+
		"\u03f6\7m\2\2\u03f5\u03df\3\2\2\2\u03f5\u03ea\3\2\2\2\u03f6\u0087\3\2"+
		"\2\2\u03f7\u03f9\7\24\2\2\u03f8\u03fa\5\u009cO\2\u03f9\u03f8\3\2\2\2\u03f9"+
		"\u03fa\3\2\2\2\u03fa\u03fe\3\2\2\2\u03fb\u03fd\5\36\20\2\u03fc\u03fb\3"+
		"\2\2\2\u03fd\u0400\3\2\2\2\u03fe\u03fc\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff"+
		"\u0401\3\2\2\2\u0400\u03fe\3\2\2\2\u0401\u0402\7e\2\2\u0402\u0089\3\2"+
		"\2\2\u0403\u0405\7N\2\2\u0404\u0406\5\u009cO\2\u0405\u0404\3\2\2\2\u0405"+
		"\u0406\3\2\2\2\u0406\u040a\3\2\2\2\u0407\u0409\5\36\20\2\u0408\u0407\3"+
		"\2\2\2\u0409\u040c\3\2\2\2\u040a\u0408\3\2\2\2\u040a\u040b\3\2\2\2\u040b"+
		"\u040d\3\2\2\2\u040c\u040a\3\2\2\2\u040d\u040e\7\17\2\2\u040e\u008b\3"+
		"\2\2\2\u040f\u0410\7M\2\2\u0410\u0411\5@!\2\u0411\u008d\3\2\2\2\u0412"+
		"\u0413\7\60\2\2\u0413\u0414\5@!\2\u0414\u008f\3\2\2\2\u0415\u0419\7\""+
		"\2\2\u0416\u0418\5$\23\2\u0417\u0416\3\2\2\2\u0418\u041b\3\2\2\2\u0419"+
		"\u0417\3\2\2\2\u0419\u041a\3\2\2\2\u041a\u041c\3\2\2\2\u041b\u0419\3\2"+
		"\2\2\u041c\u041d\5\u00ba^\2\u041d\u0091\3\2\2\2\u041e\u041f\7j\2\2\u041f"+
		"\u0420\5@!\2\u0420\u0093\3\2\2\2\u0421\u0422\7 \2\2\u0422\u0423\5@!\2"+
		"\u0423\u0095\3\2\2\2\u0424\u0428\7^\2\2\u0425\u0427\5$\23\2\u0426\u0425"+
		"\3\2\2\2\u0427\u042a\3\2\2\2\u0428\u0426\3\2\2\2\u0428\u0429\3\2\2\2\u0429"+
		"\u042b\3\2\2\2\u042a\u0428\3\2\2\2\u042b\u042c\5\u00ba^\2\u042c\u0097"+
		"\3\2\2\2\u042d\u042e\7H\2\2\u042e\u042f\7f\2\2\u042f\u0430\5\u009aN\2"+
		"\u0430\u0431\7\13\2\2\u0431\u0099\3\2\2\2\u0432\u0433\5*\26\2\u0433\u009b"+
		"\3\2\2\2\u0434\u0438\7>\2\2\u0435\u0437\n\n\2\2\u0436\u0435\3\2\2\2\u0437"+
		"\u043a\3\2\2\2\u0438\u0436\3\2\2\2\u0438\u0439\3\2\2\2\u0439\u043b\3\2"+
		"\2\2\u043a\u0438\3\2\2\2\u043b\u043c\7]\2\2\u043c\u009d\3\2\2\2\u043d"+
		"\u043e\7\34\2\2\u043e\u009f\3\2\2\2\u043f\u0440\7,\2\2\u0440\u00a1\3\2"+
		"\2\2\u0441\u0442\7K\2\2\u0442\u00a3\3\2\2\2\u0443\u0444\7u\2\2\u0444\u00a5"+
		"\3\2\2\2\u0445\u0446\7\u008f\2\2\u0446\u00a7\3\2\2\2\u0447\u0448\7`\2"+
		"\2\u0448\u00a9\3\2\2\2\u0449\u044a\7\16\2\2\u044a\u00ab\3\2\2\2\u044b"+
		"\u044d\7(\2\2\u044c\u044e\n\13\2\2\u044d\u044c\3\2\2\2\u044d\u044e\3\2"+
		"\2\2\u044e\u044f\3\2\2\2\u044f\u0450\7(\2\2\u0450\u00ad\3\2\2\2\u0451"+
		"\u0453\7\3\2\2\u0452\u0454\n\f\2\2\u0453\u0452\3\2\2\2\u0454\u0455\3\2"+
		"\2\2\u0455\u0453\3\2\2\2\u0455\u0456\3\2\2\2\u0456\u0457\3\2\2\2\u0457"+
		"\u0477\7\3\2\2\u0458\u0477\5\u00acW\2\u0459\u045b\7d\2\2\u045a\u045c\n"+
		"\r\2\2\u045b\u045a\3\2\2\2\u045c\u045d\3\2\2\2\u045d\u045b\3\2\2\2\u045d"+
		"\u045e\3\2\2\2\u045e\u045f\3\2\2\2\u045f\u0477\7C\2\2\u0460\u0462\7\u0080"+
		"\2\2\u0461\u0463\n\16\2\2\u0462\u0461\3\2\2\2\u0463\u0464\3\2\2\2\u0464"+
		"\u0462\3\2\2\2\u0464\u0465\3\2\2\2\u0465\u0466\3\2\2\2\u0466\u0477\7}"+
		"\2\2\u0467\u0469\7\65\2\2\u0468\u046a\n\17\2\2\u0469\u0468\3\2\2\2\u046a"+
		"\u046b\3\2\2\2\u046b\u0469\3\2\2\2\u046b\u046c\3\2\2\2\u046c\u046d\3\2"+
		"\2\2\u046d\u0477\7|\2\2\u046e\u0470\7+\2\2\u046f\u0471\n\20\2\2\u0470"+
		"\u046f\3\2\2\2\u0471\u0472\3\2\2\2\u0472\u0470\3\2\2\2\u0472\u0473\3\2"+
		"\2\2\u0473\u0474\3\2\2\2\u0474\u0477\7:\2\2\u0475\u0477\5\u00b4[\2\u0476"+
		"\u0451\3\2\2\2\u0476\u0458\3\2\2\2\u0476\u0459\3\2\2\2\u0476\u0460\3\2"+
		"\2\2\u0476\u0467\3\2\2\2\u0476\u046e\3\2\2\2\u0476\u0475\3\2\2\2\u0477"+
		"\u00af\3\2\2\2\u0478\u0479\7y\2\2\u0479\u047b\5\60\31\2\u047a\u047c\n"+
		"\21\2\2\u047b\u047a\3\2\2\2\u047c\u047d\3\2\2\2\u047d\u047b\3\2\2\2\u047d"+
		"\u047e\3\2\2\2\u047e\u047f\3\2\2\2\u047f\u0480\7B\2\2\u0480\u048b\3\2"+
		"\2\2\u0481\u0482\7\b\2\2\u0482\u0484\5\60\31\2\u0483\u0485\n\22\2\2\u0484"+
		"\u0483\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u0484\3\2\2\2\u0486\u0487\3\2"+
		"\2\2\u0487\u0488\3\2\2\2\u0488\u0489\7R\2\2\u0489\u048b\3\2\2\2\u048a"+
		"\u0478\3\2\2\2\u048a\u0481\3\2\2\2\u048b\u00b1\3\2\2\2\u048c\u048e\7Z"+
		"\2\2\u048d\u048f\n\23\2\2\u048e\u048d\3\2\2\2\u048f\u0490\3\2\2\2\u0490"+
		"\u048e\3\2\2\2\u0490\u0491\3\2\2\2\u0491\u0492\3\2\2\2\u0492\u0493\7\62"+
		"\2\2\u0493\u00b3\3\2\2\2\u0494\u0496\7\37\2\2\u0495\u0497\n\24\2\2\u0496"+
		"\u0495\3\2\2\2\u0497\u0498\3\2\2\2\u0498\u0496\3\2\2\2\u0498\u0499\3\2"+
		"\2\2\u0499\u049a\3\2\2\2\u049a\u04a3\7W\2\2\u049b\u049d\7n\2\2\u049c\u049e"+
		"\n\25\2\2\u049d\u049c\3\2\2\2\u049e\u049f\3\2\2\2\u049f\u049d\3\2\2\2"+
		"\u049f\u04a0\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1\u04a3\7\67\2\2\u04a2\u0494"+
		"\3\2\2\2\u04a2\u049b\3\2\2\2\u04a3\u00b5\3\2\2\2\u04a4\u04a7\5\u00b8]"+
		"\2\u04a5\u04a7\7\u009c\2\2\u04a6\u04a4\3\2\2\2\u04a6\u04a5\3\2\2\2\u04a7"+
		"\u04aa\3\2\2\2\u04a8\u04a6\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9\u00b7\3\2"+
		"\2\2\u04aa\u04a8\3\2\2\2\u04ab\u04ad\n\26\2\2\u04ac\u04ab\3\2\2\2\u04ad"+
		"\u04ae\3\2\2\2\u04ae\u04ac\3\2\2\2\u04ae\u04af\3\2\2\2\u04af\u00b9\3\2"+
		"\2\2\u04b0\u04b3\7_\2\2\u04b1\u04b3\5\u00bc_\2\u04b2\u04b0\3\2\2\2\u04b2"+
		"\u04b1\3\2\2\2\u04b3\u00bb\3\2\2\2\u04b4\u04b5\7g\2\2\u04b5\u00bd\3\2"+
		"\2\2\u04b6\u04b8\7\u008d\2\2\u04b7\u04b9\7`\2\2\u04b8\u04b7\3\2\2\2\u04b8"+
		"\u04b9\3\2\2\2\u04b9\u04ba\3\2\2\2\u04ba\u04bb\7[\2\2\u04bb\u04bc\5*\26"+
		"\2\u04bc\u04be\7\13\2\2\u04bd\u04bf\7\16\2\2\u04be\u04bd\3\2\2\2\u04be"+
		"\u04bf\3\2\2\2\u04bf\u00bf\3\2\2\2\u04c0\u04c3\7\u0086\2\2\u04c1\u04c3"+
		"\5\u00c4c\2\u04c2\u04c0\3\2\2\2\u04c2\u04c1\3\2\2\2\u04c3\u00c1\3\2\2"+
		"\2\u04c4\u04c5\5\u00c4c\2\u04c5\u04c6\7\u0099\2\2\u04c6\u04c7\5\u00c4"+
		"c\2\u04c7\u00c3\3\2\2\2\u04c8\u04c9\7\u0087\2\2\u04c9\u00c5\3\2\2\2\u04ca"+
		"\u04cb\7k\2\2\u04cb\u00c7\3\2\2\2\u04cc\u04cd\t\27\2\2\u04cd\u00c9\3\2"+
		"\2\2\u04ce\u04cf\7X\2\2\u04cf\u04d0\5@!\2\u04d0\u04d1\5@!\2\u04d1\u04d2"+
		"\5@!\2\u04d2\u00cb\3\2\2\2\u04d3\u04d8\5\u00c0a\2\u04d4\u04d8\7\25\2\2"+
		"\u04d5\u04d8\7f\2\2\u04d6\u04d8\7\13\2\2\u04d7\u04d3\3\2\2\2\u04d7\u04d4"+
		"\3\2\2\2\u04d7\u04d5\3\2\2\2\u04d7\u04d6\3\2\2\2\u04d8\u04db\3\2\2\2\u04d9"+
		"\u04d7\3\2\2\2\u04d9\u04da\3\2\2\2\u04da\u00cd\3\2\2\2\u04db\u04d9\3\2"+
		"\2\2\u04dc\u04e0\7/\2\2\u04dd\u04df\5\u009cO\2\u04de\u04dd\3\2\2\2\u04df"+
		"\u04e2\3\2\2\2\u04e0\u04de\3\2\2\2\u04e0\u04e1\3\2\2\2\u04e1\u04e3\3\2"+
		"\2\2\u04e2\u04e0\3\2\2\2\u04e3\u04e4\5@!\2\u04e4\u00cf\3\2\2\2\u008c\u00d3"+
		"\u00d9\u00df\u00e6\u00f3\u00f8\u00fa\u0100\u0107\u0110\u0117\u0120\u0127"+
		"\u012d\u0136\u013d\u0141\u0149\u0150\u0154\u015c\u0162\u0170\u0172\u0181"+
		"\u0187\u018e\u01ae\u01c6\u01ce\u01d8\u01df\u01e8\u01ec\u01f2\u01ff\u0210"+
		"\u0216\u0222\u022a\u0235\u0241\u0249\u024d\u0256\u025f\u0269\u026e\u0274"+
		"\u027b\u0285\u028b\u0293\u029a\u02a1\u02a6\u02ad\u02b2\u02b8\u02be\u02c5"+
		"\u02cc\u02d3\u02da\u02e0\u02e6\u02f3\u02fa\u0303\u030b\u0317\u031e\u0322"+
		"\u0326\u032d\u0333\u033e\u0347\u034b\u0351\u0358\u035e\u0366\u036b\u036d"+
		"\u0373\u037d\u0385\u038d\u0395\u039b\u03a1\u03ad\u03b4\u03b9\u03c0\u03c2"+
		"\u03c9\u03ce\u03d4\u03d9\u03dd\u03e1\u03e6\u03ec\u03f1\u03f5\u03f9\u03fe"+
		"\u0405\u040a\u0419\u0428\u0438\u044d\u0455\u045d\u0464\u046b\u0472\u0476"+
		"\u047d\u0486\u048a\u0490\u0498\u049f\u04a2\u04a6\u04a8\u04ae\u04b2\u04b8"+
		"\u04be\u04c2\u04d7\u04d9\u04e0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}