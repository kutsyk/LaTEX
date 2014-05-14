// Generated from LaTEX.g4 by ANTLR 4.2.2
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
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__75=1, T__74=2, T__73=3, T__72=4, T__71=5, T__70=6, T__69=7, T__68=8, 
		T__67=9, T__66=10, T__65=11, T__64=12, T__63=13, T__62=14, T__61=15, T__60=16, 
		T__59=17, T__58=18, T__57=19, T__56=20, T__55=21, T__54=22, T__53=23, 
		T__52=24, T__51=25, T__50=26, T__49=27, T__48=28, T__47=29, T__46=30, 
		T__45=31, T__44=32, T__43=33, T__42=34, T__41=35, T__40=36, T__39=37, 
		T__38=38, T__37=39, T__36=40, T__35=41, T__34=42, T__33=43, T__32=44, 
		T__31=45, T__30=46, T__29=47, T__28=48, T__27=49, T__26=50, T__25=51, 
		T__24=52, T__23=53, T__22=54, T__21=55, T__20=56, T__19=57, T__18=58, 
		T__17=59, T__16=60, T__15=61, T__14=62, T__13=63, T__12=64, T__11=65, 
		T__10=66, T__9=67, T__8=68, T__7=69, T__6=70, T__5=71, T__4=72, T__3=73, 
		T__2=74, T__1=75, T__0=76, INT=77, Identificator=78, INDEX=79, TEXT=80, 
		CHARACTER=81, STRING=82, WS=83, COMMENT=84, NEW_COUNTER=85, SET_COUNTER=86, 
		LINE_COMMENT=87, DEFINE=88, LABEL=89, BEGIN_OF_DOCUMENT=90;
	public static final String[] tokenNames = {
		"<INVALID>", "'\\textbf'", "'\\end{flushleft}'", "'\\textit'", "'\\tilde'", 
		"'\\sum'", "'{'", "'\\alpha'", "'\\cdot'", "'^'", "'\\Psi'", "'\\section*'", 
		"'\\item'", "'\\end{document}'", "'$'", "'\\phi'", "'('", "'\\rho'", "','", 
		"'\\neq'", "'\\begin{center}'", "'\n'", "'\\psi'", "'\\it'", "'\\kappa'", 
		"'\r'", "'\\subsubsection*'", "'\\bf'", "'\\left'", "']'", "'\\newcommand'", 
		"'\\pm'", "'\\times'", "'\\overline'", "'\\circ'", "'\\hline'", "'\\mathcal'", 
		"'\\begin{figure}'", "'\\Large'", "'\\bibliography'", "'\\langle'", "'\\end{equation}'", 
		"'\\caption'", "'\\begin{tabular}'", "'\\subsection*'", "'\\begin{flushleft}'", 
		"'\\end{itemize}'", "'\\dot'", "'}'", "'\\begin{itemize}'", "'\\overset'", 
		"'\\frac'", "'\\\\'", "'&'", "'\\underset'", "'''", "'\\end{figure}'", 
		"'\\begin{equation}'", "'\\chi'", "'\\right'", "'\\omega'", "'\\rangle'", 
		"'\\large'", "'\\Phi'", "':'", "'\\in'", "'\\end{center}'", "'\\LARGE'", 
		"'['", "'\\sqrt'", "'\\begin{document}'", "'\\end{tabular}'", "')'", "'\\cite'", 
		"'\\ast'", "'-'", "'\\theta'", "INT", "Identificator", "INDEX", "TEXT", 
		"CHARACTER", "STRING", "WS", "COMMENT", "NEW_COUNTER", "SET_COUNTER", 
		"LINE_COMMENT", "DEFINE", "LABEL", "BEGIN_OF_DOCUMENT"
	};
	public static final int
		RULE_compilationUnit = 0, RULE_documentDeclaration = 1, RULE_documentBody = 2, 
		RULE_documentBodyDeclaration = 3, RULE_memberList = 4, RULE_member = 5, 
		RULE_newcommandDeclaration = 6, RULE_block = 7, RULE_blockDeclaration = 8, 
		RULE_items = 9, RULE_itemList = 10, RULE_item = 11, RULE_table = 12, RULE_tableDeclaration = 13, 
		RULE_tableOptions = 14, RULE_tableStyle = 15, RULE_tableBody = 16, RULE_tableBodyDeclaration = 17, 
		RULE_newTableLine = 18, RULE_tableLines = 19, RULE_tableLine = 20, RULE_tableColumns = 21, 
		RULE_tableColumn = 22, RULE_italicDollar = 23, RULE_italicTextDeclaration = 24, 
		RULE_numbers = 25, RULE_equation = 26, RULE_texttypeDeclarator = 27, RULE_italictypeDeclaration = 28, 
		RULE_textformatingBlock = 29, RULE_sectionDeclaration = 30, RULE_subsectionDeclaration = 31, 
		RULE_subsubsectionDeclaration = 32, RULE_captionDeclarator = 33, RULE_references = 34, 
		RULE_referencesList = 35, RULE_formula = 36, RULE_mathFormula = 37, RULE_mathSymbols = 38, 
		RULE_bibliography = 39, RULE_paragraph = 40, RULE_simpleText = 41, RULE_apostrophe = 42, 
		RULE_hyphen = 43, RULE_colon = 44, RULE_leftBrace = 45, RULE_rightBrace = 46, 
		RULE_comma = 47, RULE_newLine = 48, RULE_upperHead = 49;
	public static final String[] ruleNames = {
		"compilationUnit", "documentDeclaration", "documentBody", "documentBodyDeclaration", 
		"memberList", "member", "newcommandDeclaration", "block", "blockDeclaration", 
		"items", "itemList", "item", "table", "tableDeclaration", "tableOptions", 
		"tableStyle", "tableBody", "tableBodyDeclaration", "newTableLine", "tableLines", 
		"tableLine", "tableColumns", "tableColumn", "italicDollar", "italicTextDeclaration", 
		"numbers", "equation", "texttypeDeclarator", "italictypeDeclaration", 
		"textformatingBlock", "sectionDeclaration", "subsectionDeclaration", "subsubsectionDeclaration", 
		"captionDeclarator", "references", "referencesList", "formula", "mathFormula", 
		"mathSymbols", "bibliography", "paragraph", "simpleText", "apostrophe", 
		"hyphen", "colon", "leftBrace", "rightBrace", "comma", "newLine", "upperHead"
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
		public TerminalNode EOF() { return getToken(LaTEXParser.EOF, 0); }
		public DocumentDeclarationContext documentDeclaration() {
			return getRuleContext(DocumentDeclarationContext.class,0);
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
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100); documentDeclaration();
			setState(101); match(EOF);
			}
		}
		catch (RecognitionException re) {
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
	}

	public final DocumentDeclarationContext documentDeclaration() throws RecognitionException {
		DocumentDeclarationContext _localctx = new DocumentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_documentDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); match(70);
			setState(104); documentBody();
			setState(105); match(13);
			}
		}
		catch (RecognitionException re) {
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
		public DocumentBodyDeclarationContext documentBodyDeclaration() {
			return getRuleContext(DocumentBodyDeclarationContext.class,0);
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
			setState(107); documentBodyDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DocumentBodyDeclarationContext extends ParserRuleContext {
		public MemberListContext memberList(int i) {
			return getRuleContext(MemberListContext.class,i);
		}
		public List<MemberListContext> memberList() {
			return getRuleContexts(MemberListContext.class);
		}
		public DocumentBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_documentBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterDocumentBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitDocumentBodyDeclaration(this);
		}
	}

	public final DocumentBodyDeclarationContext documentBodyDeclaration() throws RecognitionException {
		DocumentBodyDeclarationContext _localctx = new DocumentBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_documentBodyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 3) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 20) | (1L << 21) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 30) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 36) | (1L << 37) | (1L << 38) | (1L << 39) | (1L << 40) | (1L << 42) | (1L << 43) | (1L << 44) | (1L << 45) | (1L << 47) | (1L << 49) | (1L << 50) | (1L << 51) | (1L << 52) | (1L << 54) | (1L << 55) | (1L << 57) | (1L << 58) | (1L << 60) | (1L << 61) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (65 - 64)) | (1L << (67 - 64)) | (1L << (69 - 64)) | (1L << (72 - 64)) | (1L << (73 - 64)) | (1L << (74 - 64)) | (1L << (75 - 64)) | (1L << (76 - 64)) | (1L << (INT - 64)) | (1L << (TEXT - 64)))) != 0)) {
				{
				{
				setState(109); memberList();
				}
				}
				setState(114);
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
		public MemberContext member(int i) {
			return getRuleContext(MemberContext.class,i);
		}
		public List<MemberContext> member() {
			return getRuleContexts(MemberContext.class);
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
		enterRule(_localctx, 8, RULE_memberList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(115); member();
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(116); member();
					}
					} 
				}
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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
		public NewcommandDeclarationContext newcommandDeclaration() {
			return getRuleContext(NewcommandDeclarationContext.class,0);
		}
		public UpperHeadContext upperHead() {
			return getRuleContext(UpperHeadContext.class,0);
		}
		public TextformatingBlockContext textformatingBlock() {
			return getRuleContext(TextformatingBlockContext.class,0);
		}
		public BibliographyContext bibliography() {
			return getRuleContext(BibliographyContext.class,0);
		}
		public CaptionDeclaratorContext captionDeclarator() {
			return getRuleContext(CaptionDeclaratorContext.class,0);
		}
		public ItemsContext items() {
			return getRuleContext(ItemsContext.class,0);
		}
		public SubsectionDeclarationContext subsectionDeclaration() {
			return getRuleContext(SubsectionDeclarationContext.class,0);
		}
		public SectionDeclarationContext sectionDeclaration() {
			return getRuleContext(SectionDeclarationContext.class,0);
		}
		public NewLineContext newLine() {
			return getRuleContext(NewLineContext.class,0);
		}
		public HyphenContext hyphen() {
			return getRuleContext(HyphenContext.class,0);
		}
		public ItalicDollarContext italicDollar() {
			return getRuleContext(ItalicDollarContext.class,0);
		}
		public RightBraceContext rightBrace() {
			return getRuleContext(RightBraceContext.class,0);
		}
		public EquationContext equation() {
			return getRuleContext(EquationContext.class,0);
		}
		public LeftBraceContext leftBrace() {
			return getRuleContext(LeftBraceContext.class,0);
		}
		public ReferencesContext references() {
			return getRuleContext(ReferencesContext.class,0);
		}
		public TexttypeDeclaratorContext texttypeDeclarator() {
			return getRuleContext(TexttypeDeclaratorContext.class,0);
		}
		public ParagraphContext paragraph() {
			return getRuleContext(ParagraphContext.class,0);
		}
		public ColonContext colon() {
			return getRuleContext(ColonContext.class,0);
		}
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public ApostropheContext apostrophe() {
			return getRuleContext(ApostropheContext.class,0);
		}
		public NumbersContext numbers() {
			return getRuleContext(NumbersContext.class,0);
		}
		public CommaContext comma() {
			return getRuleContext(CommaContext.class,0);
		}
		public SimpleTextContext simpleText() {
			return getRuleContext(SimpleTextContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
	}

	public final MemberContext member() throws RecognitionException {
		MemberContext _localctx = new MemberContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_member);
		try {
			setState(147);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122); simpleText();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123); numbers();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(124); captionDeclarator();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(125); table();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(126); textformatingBlock();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(127); block();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(128); texttypeDeclarator();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(129); references();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(130); newcommandDeclaration();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(131); sectionDeclaration();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(132); subsectionDeclaration();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(133); subsubsectionDeclaration();
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(134); items();
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(135); equation();
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(136); paragraph();
				}
				break;

			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(137); leftBrace();
				}
				break;

			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(138); rightBrace();
				}
				break;

			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(139); hyphen();
				}
				break;

			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(140); colon();
				}
				break;

			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(141); comma();
				}
				break;

			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(142); italicDollar();
				}
				break;

			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(143); newLine();
				}
				break;

			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(144); apostrophe();
				}
				break;

			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(145); upperHead();
				}
				break;

			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(146); bibliography();
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

	public static class NewcommandDeclarationContext extends ParserRuleContext {
		public TerminalNode Identificator() { return getToken(LaTEXParser.Identificator, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		enterRule(_localctx, 12, RULE_newcommandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149); match(30);
			setState(150); match(6);
			setState(151); match(Identificator);
			setState(152); match(48);
			setState(153); block();
			}
		}
		catch (RecognitionException re) {
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
		public BlockDeclarationContext blockDeclaration(int i) {
			return getRuleContext(BlockDeclarationContext.class,i);
		}
		public List<BlockDeclarationContext> blockDeclaration() {
			return getRuleContexts(BlockDeclarationContext.class);
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
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			setState(171);
			switch (_input.LA(1)) {
			case 6:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(155); match(6);
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 3) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 20) | (1L << 21) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 30) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 36) | (1L << 37) | (1L << 38) | (1L << 39) | (1L << 40) | (1L << 42) | (1L << 43) | (1L << 44) | (1L << 45) | (1L << 47) | (1L << 49) | (1L << 50) | (1L << 51) | (1L << 52) | (1L << 54) | (1L << 55) | (1L << 57) | (1L << 58) | (1L << 60) | (1L << 61) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (65 - 64)) | (1L << (67 - 64)) | (1L << (69 - 64)) | (1L << (72 - 64)) | (1L << (73 - 64)) | (1L << (74 - 64)) | (1L << (75 - 64)) | (1L << (76 - 64)) | (1L << (INT - 64)) | (1L << (TEXT - 64)))) != 0)) {
					{
					{
					setState(156); blockDeclaration();
					}
					}
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(162); match(48);
				}
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(163); match(28);
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 3) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 20) | (1L << 21) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 30) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 36) | (1L << 37) | (1L << 38) | (1L << 39) | (1L << 40) | (1L << 42) | (1L << 43) | (1L << 44) | (1L << 45) | (1L << 47) | (1L << 49) | (1L << 50) | (1L << 51) | (1L << 52) | (1L << 54) | (1L << 55) | (1L << 57) | (1L << 58) | (1L << 60) | (1L << 61) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (65 - 64)) | (1L << (67 - 64)) | (1L << (69 - 64)) | (1L << (72 - 64)) | (1L << (73 - 64)) | (1L << (74 - 64)) | (1L << (75 - 64)) | (1L << (76 - 64)) | (1L << (INT - 64)) | (1L << (TEXT - 64)))) != 0)) {
					{
					{
					setState(164); blockDeclaration();
					}
					}
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(170); match(59);
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

	public static class BlockDeclarationContext extends ParserRuleContext {
		public MemberListContext memberList() {
			return getRuleContext(MemberListContext.class,0);
		}
		public BlockDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterBlockDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitBlockDeclaration(this);
		}
	}

	public final BlockDeclarationContext blockDeclaration() throws RecognitionException {
		BlockDeclarationContext _localctx = new BlockDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_blockDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173); memberList();
			}
		}
		catch (RecognitionException re) {
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
		public ItemListContext itemList() {
			return getRuleContext(ItemListContext.class,0);
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
		enterRule(_localctx, 18, RULE_items);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175); match(49);
			setState(176); itemList();
			setState(177); match(46);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ItemListContext extends ParserRuleContext {
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterItemList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitItemList(this);
		}
	}

	public final ItemListContext itemList() throws RecognitionException {
		ItemListContext _localctx = new ItemListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_itemList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==12) {
				{
				{
				setState(179); item();
				}
				}
				setState(184);
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
		public MemberListContext memberList() {
			return getRuleContext(MemberListContext.class,0);
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
		enterRule(_localctx, 22, RULE_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185); match(12);
			setState(186); memberList();
			}
		}
		catch (RecognitionException re) {
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
		public TableDeclarationContext tableDeclaration() {
			return getRuleContext(TableDeclarationContext.class,0);
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
		enterRule(_localctx, 24, RULE_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188); match(43);
			setState(189); tableDeclaration();
			setState(190); match(71);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableDeclarationContext extends ParserRuleContext {
		public TableBodyContext tableBody() {
			return getRuleContext(TableBodyContext.class,0);
		}
		public TableOptionsContext tableOptions() {
			return getRuleContext(TableOptionsContext.class,0);
		}
		public TableStyleContext tableStyle() {
			return getRuleContext(TableStyleContext.class,0);
		}
		public TableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterTableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitTableDeclaration(this);
		}
	}

	public final TableDeclarationContext tableDeclaration() throws RecognitionException {
		TableDeclarationContext _localctx = new TableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_la = _input.LA(1);
			if (_la==68) {
				{
				setState(192); tableOptions();
				}
			}

			setState(196);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(195); tableStyle();
				}
				break;
			}
			setState(198); tableBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableOptionsContext extends ParserRuleContext {
		public SimpleTextContext simpleText() {
			return getRuleContext(SimpleTextContext.class,0);
		}
		public TableOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableOptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterTableOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitTableOptions(this);
		}
	}

	public final TableOptionsContext tableOptions() throws RecognitionException {
		TableOptionsContext _localctx = new TableOptionsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tableOptions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200); match(68);
			setState(201); simpleText();
			setState(202); match(29);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableStyleContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TableStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableStyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterTableStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitTableStyle(this);
		}
	}

	public final TableStyleContext tableStyle() throws RecognitionException {
		TableStyleContext _localctx = new TableStyleContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tableStyle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableBodyContext extends ParserRuleContext {
		public TableBodyDeclarationContext tableBodyDeclaration() {
			return getRuleContext(TableBodyDeclarationContext.class,0);
		}
		public TableBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterTableBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitTableBody(this);
		}
	}

	public final TableBodyContext tableBody() throws RecognitionException {
		TableBodyContext _localctx = new TableBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tableBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206); tableBodyDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableBodyDeclarationContext extends ParserRuleContext {
		public List<NewTableLineContext> newTableLine() {
			return getRuleContexts(NewTableLineContext.class);
		}
		public NewTableLineContext newTableLine(int i) {
			return getRuleContext(NewTableLineContext.class,i);
		}
		public TableBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterTableBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitTableBodyDeclaration(this);
		}
	}

	public final TableBodyDeclarationContext tableBodyDeclaration() throws RecognitionException {
		TableBodyDeclarationContext _localctx = new TableBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tableBodyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 3) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 20) | (1L << 21) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 30) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 37) | (1L << 38) | (1L << 39) | (1L << 40) | (1L << 42) | (1L << 43) | (1L << 44) | (1L << 45) | (1L << 47) | (1L << 49) | (1L << 50) | (1L << 51) | (1L << 52) | (1L << 54) | (1L << 55) | (1L << 57) | (1L << 58) | (1L << 60) | (1L << 61) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (65 - 64)) | (1L << (67 - 64)) | (1L << (69 - 64)) | (1L << (72 - 64)) | (1L << (73 - 64)) | (1L << (74 - 64)) | (1L << (75 - 64)) | (1L << (76 - 64)) | (1L << (INT - 64)) | (1L << (TEXT - 64)))) != 0)) {
				{
				{
				setState(208); newTableLine();
				}
				}
				setState(213);
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

	public static class NewTableLineContext extends ParserRuleContext {
		public TableColumnsContext tableColumns() {
			return getRuleContext(TableColumnsContext.class,0);
		}
		public TableLineContext tableLine() {
			return getRuleContext(TableLineContext.class,0);
		}
		public NewTableLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newTableLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterNewTableLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitNewTableLine(this);
		}
	}

	public final NewTableLineContext newTableLine() throws RecognitionException {
		NewTableLineContext _localctx = new NewTableLineContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_newTableLine);
		try {
			setState(216);
			switch (_input.LA(1)) {
			case 35:
				enterOuterAlt(_localctx, 1);
				{
				setState(214); tableLine();
				}
				break;
			case 1:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
			case 14:
			case 15:
			case 16:
			case 17:
			case 18:
			case 19:
			case 20:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 30:
			case 31:
			case 32:
			case 33:
			case 34:
			case 36:
			case 37:
			case 38:
			case 39:
			case 40:
			case 42:
			case 43:
			case 44:
			case 45:
			case 47:
			case 49:
			case 50:
			case 51:
			case 52:
			case 54:
			case 55:
			case 57:
			case 58:
			case 60:
			case 61:
			case 62:
			case 63:
			case 64:
			case 65:
			case 67:
			case 69:
			case 72:
			case 73:
			case 74:
			case 75:
			case 76:
			case INT:
			case TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(215); tableColumns();
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

	public static class TableLinesContext extends ParserRuleContext {
		public TableLineContext tableLine(int i) {
			return getRuleContext(TableLineContext.class,i);
		}
		public List<TableLineContext> tableLine() {
			return getRuleContexts(TableLineContext.class);
		}
		public TableLinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableLines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterTableLines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitTableLines(this);
		}
	}

	public final TableLinesContext tableLines() throws RecognitionException {
		TableLinesContext _localctx = new TableLinesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_tableLines);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218); tableLine();
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==35) {
				{
				{
				setState(219); tableLine();
				}
				}
				setState(224);
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

	public static class TableLineContext extends ParserRuleContext {
		public TableLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterTableLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitTableLine(this);
		}
	}

	public final TableLineContext tableLine() throws RecognitionException {
		TableLineContext _localctx = new TableLineContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tableLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225); match(35);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableColumnsContext extends ParserRuleContext {
		public List<TableColumnContext> tableColumn() {
			return getRuleContexts(TableColumnContext.class);
		}
		public TableColumnContext tableColumn(int i) {
			return getRuleContext(TableColumnContext.class,i);
		}
		public TableColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableColumns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterTableColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitTableColumns(this);
		}
	}

	public final TableColumnsContext tableColumns() throws RecognitionException {
		TableColumnsContext _localctx = new TableColumnsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_tableColumns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227); tableColumn();
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==53) {
				{
				{
				setState(228); match(53);
				setState(229); tableColumn();
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(235); match(52);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableColumnContext extends ParserRuleContext {
		public MemberListContext memberList() {
			return getRuleContext(MemberListContext.class,0);
		}
		public TableColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterTableColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitTableColumn(this);
		}
	}

	public final TableColumnContext tableColumn() throws RecognitionException {
		TableColumnContext _localctx = new TableColumnContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tableColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237); memberList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ItalicDollarContext extends ParserRuleContext {
		public ItalicDollarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_italicDollar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterItalicDollar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitItalicDollar(this);
		}
	}

	public final ItalicDollarContext italicDollar() throws RecognitionException {
		ItalicDollarContext _localctx = new ItalicDollarContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_italicDollar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239); match(14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ItalicTextDeclarationContext extends ParserRuleContext {
		public MemberListContext memberList() {
			return getRuleContext(MemberListContext.class,0);
		}
		public ItalicTextDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_italicTextDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterItalicTextDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitItalicTextDeclaration(this);
		}
	}

	public final ItalicTextDeclarationContext italicTextDeclaration() throws RecognitionException {
		ItalicTextDeclarationContext _localctx = new ItalicTextDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_italicTextDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241); memberList();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode INT() { return getToken(LaTEXParser.INT, 0); }
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
		enterRule(_localctx, 50, RULE_numbers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243); match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EquationContext extends ParserRuleContext {
		public MemberListContext memberList() {
			return getRuleContext(MemberListContext.class,0);
		}
		public EquationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterEquation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitEquation(this);
		}
	}

	public final EquationContext equation() throws RecognitionException {
		EquationContext _localctx = new EquationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_equation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245); match(57);
			setState(246); memberList();
			setState(247); match(41);
			}
		}
		catch (RecognitionException re) {
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
		public MemberListContext memberList(int i) {
			return getRuleContext(MemberListContext.class,i);
		}
		public List<MemberListContext> memberList() {
			return getRuleContexts(MemberListContext.class);
		}
		public ItalictypeDeclarationContext italictypeDeclaration() {
			return getRuleContext(ItalictypeDeclarationContext.class,0);
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
		enterRule(_localctx, 54, RULE_texttypeDeclarator);
		int _la;
		try {
			int _alt;
			setState(259);
			switch (_input.LA(1)) {
			case 27:
				enterOuterAlt(_localctx, 1);
				{
				setState(249); match(27);
				}
				break;
			case 3:
			case 23:
				enterOuterAlt(_localctx, 2);
				{
				setState(250); italictypeDeclaration();
				}
				break;
			case 38:
			case 62:
			case 67:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				_la = _input.LA(1);
				if ( !(((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & ((1L << (38 - 38)) | (1L << (62 - 38)) | (1L << (67 - 38)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case 1:
				enterOuterAlt(_localctx, 4);
				{
				setState(252); match(1);
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(253); memberList();
						}
						} 
					}
					setState(258);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class ItalictypeDeclarationContext extends ParserRuleContext {
		public MemberListContext memberList(int i) {
			return getRuleContext(MemberListContext.class,i);
		}
		public List<MemberListContext> memberList() {
			return getRuleContexts(MemberListContext.class);
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
		enterRule(_localctx, 56, RULE_italictypeDeclaration);
		try {
			int _alt;
			setState(275);
			switch (_input.LA(1)) {
			case 23:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(261); match(23);
				setState(265);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(262); memberList();
						}
						} 
					}
					setState(267);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(268); match(3);
				setState(272);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(269); memberList();
						}
						} 
					}
					setState(274);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class TextformatingBlockContext extends ParserRuleContext {
		public MemberListContext memberList() {
			return getRuleContext(MemberListContext.class,0);
		}
		public TextformatingBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textformatingBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterTextformatingBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitTextformatingBlock(this);
		}
	}

	public final TextformatingBlockContext textformatingBlock() throws RecognitionException {
		TextformatingBlockContext _localctx = new TextformatingBlockContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_textformatingBlock);
		try {
			setState(289);
			switch (_input.LA(1)) {
			case 45:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(277); match(45);
				setState(278); memberList();
				setState(279); match(2);
				}
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(281); match(37);
				setState(282); memberList();
				setState(283); match(56);
				}
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(285); match(20);
				setState(286); memberList();
				setState(287); match(66);
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

	public static class SectionDeclarationContext extends ParserRuleContext {
		public SimpleTextContext simpleText() {
			return getRuleContext(SimpleTextContext.class,0);
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
		enterRule(_localctx, 60, RULE_sectionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291); match(11);
			setState(292); match(6);
			setState(293); simpleText();
			setState(294); match(48);
			}
		}
		catch (RecognitionException re) {
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
		public SimpleTextContext simpleText() {
			return getRuleContext(SimpleTextContext.class,0);
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
		enterRule(_localctx, 62, RULE_subsectionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296); match(44);
			setState(297); match(6);
			setState(298); simpleText();
			setState(299); match(48);
			}
		}
		catch (RecognitionException re) {
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
		public SimpleTextContext simpleText() {
			return getRuleContext(SimpleTextContext.class,0);
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
		enterRule(_localctx, 64, RULE_subsubsectionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301); match(26);
			setState(302); match(6);
			setState(303); simpleText();
			setState(304); match(48);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaptionDeclaratorContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CaptionDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_captionDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterCaptionDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitCaptionDeclarator(this);
		}
	}

	public final CaptionDeclaratorContext captionDeclarator() throws RecognitionException {
		CaptionDeclaratorContext _localctx = new CaptionDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_captionDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306); match(42);
			setState(307); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferencesContext extends ParserRuleContext {
		public ReferencesListContext referencesList() {
			return getRuleContext(ReferencesListContext.class,0);
		}
		public ReferencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_references; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterReferences(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitReferences(this);
		}
	}

	public final ReferencesContext references() throws RecognitionException {
		ReferencesContext _localctx = new ReferencesContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_references);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309); match(73);
			setState(310); match(6);
			setState(311); referencesList();
			setState(312); match(48);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferencesListContext extends ParserRuleContext {
		public List<SimpleTextContext> simpleText() {
			return getRuleContexts(SimpleTextContext.class);
		}
		public SimpleTextContext simpleText(int i) {
			return getRuleContext(SimpleTextContext.class,i);
		}
		public ReferencesListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referencesList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterReferencesList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitReferencesList(this);
		}
	}

	public final ReferencesListContext referencesList() throws RecognitionException {
		ReferencesListContext _localctx = new ReferencesListContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_referencesList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314); simpleText();
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==18) {
				{
				{
				setState(315); match(18);
				setState(316); simpleText();
				}
				}
				setState(321);
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

	public static class FormulaContext extends ParserRuleContext {
		public MathSymbolsContext mathSymbols() {
			return getRuleContext(MathSymbolsContext.class,0);
		}
		public MathFormulaContext mathFormula() {
			return getRuleContext(MathFormulaContext.class,0);
		}
		public FormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitFormula(this);
		}
	}

	public final FormulaContext formula() throws RecognitionException {
		FormulaContext _localctx = new FormulaContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_formula);
		try {
			setState(324);
			switch (_input.LA(1)) {
			case 51:
				enterOuterAlt(_localctx, 1);
				{
				setState(322); mathFormula();
				}
				break;
			case 4:
			case 5:
			case 7:
			case 8:
			case 10:
			case 15:
			case 17:
			case 19:
			case 22:
			case 24:
			case 31:
			case 32:
			case 33:
			case 34:
			case 36:
			case 40:
			case 47:
			case 50:
			case 54:
			case 58:
			case 60:
			case 61:
			case 63:
			case 65:
			case 69:
			case 74:
			case 76:
				enterOuterAlt(_localctx, 2);
				{
				setState(323); mathSymbols();
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

	public static class MathFormulaContext extends ParserRuleContext {
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public MathFormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathFormula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterMathFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitMathFormula(this);
		}
	}

	public final MathFormulaContext mathFormula() throws RecognitionException {
		MathFormulaContext _localctx = new MathFormulaContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_mathFormula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326); match(51);
			setState(327); block();
			setState(328); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MathSymbolsContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MathSymbolsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathSymbols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterMathSymbols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitMathSymbols(this);
		}
	}

	public final MathSymbolsContext mathSymbols() throws RecognitionException {
		MathSymbolsContext _localctx = new MathSymbolsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_mathSymbols);
		int _la;
		try {
			setState(359);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(330); match(36);
				setState(331); block();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(332); match(47);
				setState(333); block();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(334);
				_la = _input.LA(1);
				if ( !(_la==10 || _la==22) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(335); match(24);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(336); match(58);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(337); match(76);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(338);
				_la = _input.LA(1);
				if ( !(_la==15 || _la==63) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(339); match(8);
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(340); match(60);
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(341); match(34);
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(342); match(74);
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(343); match(7);
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(344); match(65);
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(345); match(74);
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(346); match(17);
				}
				break;

			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(347); match(50);
				}
				break;

			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(348); match(54);
				}
				break;

			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(349); match(5);
				}
				break;

			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(350); match(33);
				}
				break;

			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(351); match(69);
				}
				break;

			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(352); match(33);
				}
				break;

			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(353); match(40);
				}
				break;

			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(354); match(61);
				}
				break;

			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(355); match(4);
				}
				break;

			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(356); match(19);
				}
				break;

			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(357); match(32);
				}
				break;

			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(358); match(31);
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

	public static class BibliographyContext extends ParserRuleContext {
		public BibliographyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bibliography; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterBibliography(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitBibliography(this);
		}
	}

	public final BibliographyContext bibliography() throws RecognitionException {
		BibliographyContext _localctx = new BibliographyContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_bibliography);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361); match(39);
			}
		}
		catch (RecognitionException re) {
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
		public SimpleTextContext simpleText() {
			return getRuleContext(SimpleTextContext.class,0);
		}
		public List<NewLineContext> newLine() {
			return getRuleContexts(NewLineContext.class);
		}
		public NewLineContext newLine(int i) {
			return getRuleContext(NewLineContext.class,i);
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
		enterRule(_localctx, 80, RULE_paragraph);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 21) | (1L << 25) | (1L << 52))) != 0)) {
				{
				{
				setState(363); newLine();
				}
				}
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(369); simpleText();
			setState(372);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(370); newLine();
				}
				break;

			case 2:
				{
				setState(371); match(52);
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
		public TerminalNode TEXT() { return getToken(LaTEXParser.TEXT, 0); }
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
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
		enterRule(_localctx, 82, RULE_simpleText);
		try {
			setState(376);
			switch (_input.LA(1)) {
			case TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(374); match(TEXT);
				}
				break;
			case 4:
			case 5:
			case 7:
			case 8:
			case 10:
			case 15:
			case 17:
			case 19:
			case 22:
			case 24:
			case 31:
			case 32:
			case 33:
			case 34:
			case 36:
			case 40:
			case 47:
			case 50:
			case 51:
			case 54:
			case 58:
			case 60:
			case 61:
			case 63:
			case 65:
			case 69:
			case 74:
			case 76:
				enterOuterAlt(_localctx, 2);
				{
				setState(375); formula();
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

	public static class ApostropheContext extends ParserRuleContext {
		public ApostropheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_apostrophe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterApostrophe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitApostrophe(this);
		}
	}

	public final ApostropheContext apostrophe() throws RecognitionException {
		ApostropheContext _localctx = new ApostropheContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_apostrophe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378); match(55);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HyphenContext extends ParserRuleContext {
		public HyphenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hyphen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterHyphen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitHyphen(this);
		}
	}

	public final HyphenContext hyphen() throws RecognitionException {
		HyphenContext _localctx = new HyphenContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_hyphen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380); match(75);
			}
		}
		catch (RecognitionException re) {
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
	}

	public final ColonContext colon() throws RecognitionException {
		ColonContext _localctx = new ColonContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_colon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382); match(64);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeftBraceContext extends ParserRuleContext {
		public LeftBraceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftBrace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterLeftBrace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitLeftBrace(this);
		}
	}

	public final LeftBraceContext leftBrace() throws RecognitionException {
		LeftBraceContext _localctx = new LeftBraceContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_leftBrace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384); match(16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RightBraceContext extends ParserRuleContext {
		public RightBraceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightBrace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterRightBrace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitRightBrace(this);
		}
	}

	public final RightBraceContext rightBrace() throws RecognitionException {
		RightBraceContext _localctx = new RightBraceContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_rightBrace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386); match(72);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 94, RULE_comma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388); match(18);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 96, RULE_newLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 21) | (1L << 25) | (1L << 52))) != 0)) ) {
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

	public static class UpperHeadContext extends ParserRuleContext {
		public UpperHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upperHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).enterUpperHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTEXListener ) ((LaTEXListener)listener).exitUpperHead(this);
		}
	}

	public final UpperHeadContext upperHead() throws RecognitionException {
		UpperHeadContext _localctx = new UpperHeadContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_upperHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392); match(9);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\\\u018d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\7\5q\n\5\f\5\16\5t\13\5\3\6\3\6\7\6x"+
		"\n\6\f\6\16\6{\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0096\n\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\7\t\u00a0\n\t\f\t\16\t\u00a3\13\t\3\t\3\t\3"+
		"\t\7\t\u00a8\n\t\f\t\16\t\u00ab\13\t\3\t\5\t\u00ae\n\t\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\f\7\f\u00b7\n\f\f\f\16\f\u00ba\13\f\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\17\5\17\u00c4\n\17\3\17\5\17\u00c7\n\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\7\23\u00d4\n\23\f\23\16\23\u00d7"+
		"\13\23\3\24\3\24\5\24\u00db\n\24\3\25\3\25\7\25\u00df\n\25\f\25\16\25"+
		"\u00e2\13\25\3\26\3\26\3\27\3\27\3\27\7\27\u00e9\n\27\f\27\16\27\u00ec"+
		"\13\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\7\35\u0101\n\35\f\35\16\35\u0104\13\35"+
		"\5\35\u0106\n\35\3\36\3\36\7\36\u010a\n\36\f\36\16\36\u010d\13\36\3\36"+
		"\3\36\7\36\u0111\n\36\f\36\16\36\u0114\13\36\5\36\u0116\n\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0124\n\37\3 "+
		"\3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3"+
		"$\3%\3%\3%\7%\u0140\n%\f%\16%\u0143\13%\3&\3&\5&\u0147\n&\3\'\3\'\3\'"+
		"\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\5(\u016a\n(\3)\3)\3*\7*\u016f\n*\f*\16*\u0172\13"+
		"*\3*\3*\3*\5*\u0177\n*\3+\3+\5+\u017b\n+\3,\3,\3-\3-\3.\3.\3/\3/\3\60"+
		"\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\2\2\64\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd\2\6\5\2("+
		"(@@EE\4\2\f\f\30\30\4\2\21\21AA\5\2\27\27\33\33\66\66\u01a6\2f\3\2\2\2"+
		"\4i\3\2\2\2\6m\3\2\2\2\br\3\2\2\2\nu\3\2\2\2\f\u0095\3\2\2\2\16\u0097"+
		"\3\2\2\2\20\u00ad\3\2\2\2\22\u00af\3\2\2\2\24\u00b1\3\2\2\2\26\u00b8\3"+
		"\2\2\2\30\u00bb\3\2\2\2\32\u00be\3\2\2\2\34\u00c3\3\2\2\2\36\u00ca\3\2"+
		"\2\2 \u00ce\3\2\2\2\"\u00d0\3\2\2\2$\u00d5\3\2\2\2&\u00da\3\2\2\2(\u00dc"+
		"\3\2\2\2*\u00e3\3\2\2\2,\u00e5\3\2\2\2.\u00ef\3\2\2\2\60\u00f1\3\2\2\2"+
		"\62\u00f3\3\2\2\2\64\u00f5\3\2\2\2\66\u00f7\3\2\2\28\u0105\3\2\2\2:\u0115"+
		"\3\2\2\2<\u0123\3\2\2\2>\u0125\3\2\2\2@\u012a\3\2\2\2B\u012f\3\2\2\2D"+
		"\u0134\3\2\2\2F\u0137\3\2\2\2H\u013c\3\2\2\2J\u0146\3\2\2\2L\u0148\3\2"+
		"\2\2N\u0169\3\2\2\2P\u016b\3\2\2\2R\u0170\3\2\2\2T\u017a\3\2\2\2V\u017c"+
		"\3\2\2\2X\u017e\3\2\2\2Z\u0180\3\2\2\2\\\u0182\3\2\2\2^\u0184\3\2\2\2"+
		"`\u0186\3\2\2\2b\u0188\3\2\2\2d\u018a\3\2\2\2fg\5\4\3\2gh\7\2\2\3h\3\3"+
		"\2\2\2ij\7H\2\2jk\5\6\4\2kl\7\17\2\2l\5\3\2\2\2mn\5\b\5\2n\7\3\2\2\2o"+
		"q\5\n\6\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\t\3\2\2\2tr\3\2\2\2"+
		"uy\5\f\7\2vx\5\f\7\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\13\3\2\2"+
		"\2{y\3\2\2\2|\u0096\5T+\2}\u0096\5\64\33\2~\u0096\5D#\2\177\u0096\5\32"+
		"\16\2\u0080\u0096\5<\37\2\u0081\u0096\5\20\t\2\u0082\u0096\58\35\2\u0083"+
		"\u0096\5F$\2\u0084\u0096\5\16\b\2\u0085\u0096\5> \2\u0086\u0096\5@!\2"+
		"\u0087\u0096\5B\"\2\u0088\u0096\5\24\13\2\u0089\u0096\5\66\34\2\u008a"+
		"\u0096\5R*\2\u008b\u0096\5\\/\2\u008c\u0096\5^\60\2\u008d\u0096\5X-\2"+
		"\u008e\u0096\5Z.\2\u008f\u0096\5`\61\2\u0090\u0096\5\60\31\2\u0091\u0096"+
		"\5b\62\2\u0092\u0096\5V,\2\u0093\u0096\5d\63\2\u0094\u0096\5P)\2\u0095"+
		"|\3\2\2\2\u0095}\3\2\2\2\u0095~\3\2\2\2\u0095\177\3\2\2\2\u0095\u0080"+
		"\3\2\2\2\u0095\u0081\3\2\2\2\u0095\u0082\3\2\2\2\u0095\u0083\3\2\2\2\u0095"+
		"\u0084\3\2\2\2\u0095\u0085\3\2\2\2\u0095\u0086\3\2\2\2\u0095\u0087\3\2"+
		"\2\2\u0095\u0088\3\2\2\2\u0095\u0089\3\2\2\2\u0095\u008a\3\2\2\2\u0095"+
		"\u008b\3\2\2\2\u0095\u008c\3\2\2\2\u0095\u008d\3\2\2\2\u0095\u008e\3\2"+
		"\2\2\u0095\u008f\3\2\2\2\u0095\u0090\3\2\2\2\u0095\u0091\3\2\2\2\u0095"+
		"\u0092\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096\r\3\2\2\2"+
		"\u0097\u0098\7 \2\2\u0098\u0099\7\b\2\2\u0099\u009a\7P\2\2\u009a\u009b"+
		"\7\62\2\2\u009b\u009c\5\20\t\2\u009c\17\3\2\2\2\u009d\u00a1\7\b\2\2\u009e"+
		"\u00a0\5\22\n\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3"+
		"\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4"+
		"\u00ae\7\62\2\2\u00a5\u00a9\7\36\2\2\u00a6\u00a8\5\22\n\2\u00a7\u00a6"+
		"\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ae\7=\2\2\u00ad\u009d\3\2"+
		"\2\2\u00ad\u00a5\3\2\2\2\u00ae\21\3\2\2\2\u00af\u00b0\5\n\6\2\u00b0\23"+
		"\3\2\2\2\u00b1\u00b2\7\63\2\2\u00b2\u00b3\5\26\f\2\u00b3\u00b4\7\60\2"+
		"\2\u00b4\25\3\2\2\2\u00b5\u00b7\5\30\r\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba"+
		"\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\27\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00bb\u00bc\7\16\2\2\u00bc\u00bd\5\n\6\2\u00bd\31\3\2\2"+
		"\2\u00be\u00bf\7-\2\2\u00bf\u00c0\5\34\17\2\u00c0\u00c1\7I\2\2\u00c1\33"+
		"\3\2\2\2\u00c2\u00c4\5\36\20\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2"+
		"\u00c4\u00c6\3\2\2\2\u00c5\u00c7\5 \21\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7"+
		"\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\5\"\22\2\u00c9\35\3\2\2\2\u00ca"+
		"\u00cb\7F\2\2\u00cb\u00cc\5T+\2\u00cc\u00cd\7\37\2\2\u00cd\37\3\2\2\2"+
		"\u00ce\u00cf\5\20\t\2\u00cf!\3\2\2\2\u00d0\u00d1\5$\23\2\u00d1#\3\2\2"+
		"\2\u00d2\u00d4\5&\24\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3"+
		"\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6%\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8"+
		"\u00db\5*\26\2\u00d9\u00db\5,\27\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2"+
		"\2\2\u00db\'\3\2\2\2\u00dc\u00e0\5*\26\2\u00dd\u00df\5*\26\2\u00de\u00dd"+
		"\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		")\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\7%\2\2\u00e4+\3\2\2\2\u00e5"+
		"\u00ea\5.\30\2\u00e6\u00e7\7\67\2\2\u00e7\u00e9\5.\30\2\u00e8\u00e6\3"+
		"\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\7\66\2\2\u00ee-\3\2\2\2"+
		"\u00ef\u00f0\5\n\6\2\u00f0/\3\2\2\2\u00f1\u00f2\7\20\2\2\u00f2\61\3\2"+
		"\2\2\u00f3\u00f4\5\n\6\2\u00f4\63\3\2\2\2\u00f5\u00f6\7O\2\2\u00f6\65"+
		"\3\2\2\2\u00f7\u00f8\7;\2\2\u00f8\u00f9\5\n\6\2\u00f9\u00fa\7+\2\2\u00fa"+
		"\67\3\2\2\2\u00fb\u0106\7\35\2\2\u00fc\u0106\5:\36\2\u00fd\u0106\t\2\2"+
		"\2\u00fe\u0102\7\3\2\2\u00ff\u0101\5\n\6\2\u0100\u00ff\3\2\2\2\u0101\u0104"+
		"\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0106\3\2\2\2\u0104"+
		"\u0102\3\2\2\2\u0105\u00fb\3\2\2\2\u0105\u00fc\3\2\2\2\u0105\u00fd\3\2"+
		"\2\2\u0105\u00fe\3\2\2\2\u01069\3\2\2\2\u0107\u010b\7\31\2\2\u0108\u010a"+
		"\5\n\6\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\u0116\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u0112\7\5"+
		"\2\2\u010f\u0111\5\n\6\2\u0110\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2"+
		"\2\2\u0115\u0107\3\2\2\2\u0115\u010e\3\2\2\2\u0116;\3\2\2\2\u0117\u0118"+
		"\7/\2\2\u0118\u0119\5\n\6\2\u0119\u011a\7\4\2\2\u011a\u0124\3\2\2\2\u011b"+
		"\u011c\7\'\2\2\u011c\u011d\5\n\6\2\u011d\u011e\7:\2\2\u011e\u0124\3\2"+
		"\2\2\u011f\u0120\7\26\2\2\u0120\u0121\5\n\6\2\u0121\u0122\7D\2\2\u0122"+
		"\u0124\3\2\2\2\u0123\u0117\3\2\2\2\u0123\u011b\3\2\2\2\u0123\u011f\3\2"+
		"\2\2\u0124=\3\2\2\2\u0125\u0126\7\r\2\2\u0126\u0127\7\b\2\2\u0127\u0128"+
		"\5T+\2\u0128\u0129\7\62\2\2\u0129?\3\2\2\2\u012a\u012b\7.\2\2\u012b\u012c"+
		"\7\b\2\2\u012c\u012d\5T+\2\u012d\u012e\7\62\2\2\u012eA\3\2\2\2\u012f\u0130"+
		"\7\34\2\2\u0130\u0131\7\b\2\2\u0131\u0132\5T+\2\u0132\u0133\7\62\2\2\u0133"+
		"C\3\2\2\2\u0134\u0135\7,\2\2\u0135\u0136\5\20\t\2\u0136E\3\2\2\2\u0137"+
		"\u0138\7K\2\2\u0138\u0139\7\b\2\2\u0139\u013a\5H%\2\u013a\u013b\7\62\2"+
		"\2\u013bG\3\2\2\2\u013c\u0141\5T+\2\u013d\u013e\7\24\2\2\u013e\u0140\5"+
		"T+\2\u013f\u013d\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141"+
		"\u0142\3\2\2\2\u0142I\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0147\5L\'\2\u0145"+
		"\u0147\5N(\2\u0146\u0144\3\2\2\2\u0146\u0145\3\2\2\2\u0147K\3\2\2\2\u0148"+
		"\u0149\7\65\2\2\u0149\u014a\5\20\t\2\u014a\u014b\5\20\t\2\u014bM\3\2\2"+
		"\2\u014c\u014d\7&\2\2\u014d\u016a\5\20\t\2\u014e\u014f\7\61\2\2\u014f"+
		"\u016a\5\20\t\2\u0150\u016a\t\3\2\2\u0151\u016a\7\32\2\2\u0152\u016a\7"+
		"<\2\2\u0153\u016a\7N\2\2\u0154\u016a\t\4\2\2\u0155\u016a\7\n\2\2\u0156"+
		"\u016a\7>\2\2\u0157\u016a\7$\2\2\u0158\u016a\7L\2\2\u0159\u016a\7\t\2"+
		"\2\u015a\u016a\7C\2\2\u015b\u016a\7L\2\2\u015c\u016a\7\23\2\2\u015d\u016a"+
		"\7\64\2\2\u015e\u016a\78\2\2\u015f\u016a\7\7\2\2\u0160\u016a\7#\2\2\u0161"+
		"\u016a\7G\2\2\u0162\u016a\7#\2\2\u0163\u016a\7*\2\2\u0164\u016a\7?\2\2"+
		"\u0165\u016a\7\6\2\2\u0166\u016a\7\25\2\2\u0167\u016a\7\"\2\2\u0168\u016a"+
		"\7!\2\2\u0169\u014c\3\2\2\2\u0169\u014e\3\2\2\2\u0169\u0150\3\2\2\2\u0169"+
		"\u0151\3\2\2\2\u0169\u0152\3\2\2\2\u0169\u0153\3\2\2\2\u0169\u0154\3\2"+
		"\2\2\u0169\u0155\3\2\2\2\u0169\u0156\3\2\2\2\u0169\u0157\3\2\2\2\u0169"+
		"\u0158\3\2\2\2\u0169\u0159\3\2\2\2\u0169\u015a\3\2\2\2\u0169\u015b\3\2"+
		"\2\2\u0169\u015c\3\2\2\2\u0169\u015d\3\2\2\2\u0169\u015e\3\2\2\2\u0169"+
		"\u015f\3\2\2\2\u0169\u0160\3\2\2\2\u0169\u0161\3\2\2\2\u0169\u0162\3\2"+
		"\2\2\u0169\u0163\3\2\2\2\u0169\u0164\3\2\2\2\u0169\u0165\3\2\2\2\u0169"+
		"\u0166\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u0168\3\2\2\2\u016aO\3\2\2\2"+
		"\u016b\u016c\7)\2\2\u016cQ\3\2\2\2\u016d\u016f\5b\62\2\u016e\u016d\3\2"+
		"\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171"+
		"\u0173\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0176\5T+\2\u0174\u0177\5b\62"+
		"\2\u0175\u0177\7\66\2\2\u0176\u0174\3\2\2\2\u0176\u0175\3\2\2\2\u0177"+
		"S\3\2\2\2\u0178\u017b\7R\2\2\u0179\u017b\5J&\2\u017a\u0178\3\2\2\2\u017a"+
		"\u0179\3\2\2\2\u017bU\3\2\2\2\u017c\u017d\79\2\2\u017dW\3\2\2\2\u017e"+
		"\u017f\7M\2\2\u017fY\3\2\2\2\u0180\u0181\7B\2\2\u0181[\3\2\2\2\u0182\u0183"+
		"\7\22\2\2\u0183]\3\2\2\2\u0184\u0185\7J\2\2\u0185_\3\2\2\2\u0186\u0187"+
		"\7\24\2\2\u0187a\3\2\2\2\u0188\u0189\t\5\2\2\u0189c\3\2\2\2\u018a\u018b"+
		"\7\13\2\2\u018be\3\2\2\2\33ry\u0095\u00a1\u00a9\u00ad\u00b8\u00c3\u00c6"+
		"\u00d5\u00da\u00e0\u00ea\u0102\u0105\u010b\u0112\u0115\u0123\u0141\u0146"+
		"\u0169\u0170\u0176\u017a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}