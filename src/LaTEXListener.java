// Generated from LaTEX.g4 by ANTLR 4.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LaTEXParser}.
 */
public interface LaTEXListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#descriptionList}.
	 * @param ctx the parse tree
	 */
	void enterDescriptionList(@NotNull LaTEXParser.DescriptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#descriptionList}.
	 * @param ctx the parse tree
	 */
	void exitDescriptionList(@NotNull LaTEXParser.DescriptionListContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#laTEXFigRef}.
	 * @param ctx the parse tree
	 */
	void enterLaTEXFigRef(@NotNull LaTEXParser.LaTEXFigRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#laTEXFigRef}.
	 * @param ctx the parse tree
	 */
	void exitLaTEXFigRef(@NotNull LaTEXParser.LaTEXFigRefContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#bibYear}.
	 * @param ctx the parse tree
	 */
	void enterBibYear(@NotNull LaTEXParser.BibYearContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#bibYear}.
	 * @param ctx the parse tree
	 */
	void exitBibYear(@NotNull LaTEXParser.BibYearContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#renewcommandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterRenewcommandDeclaration(@NotNull LaTEXParser.RenewcommandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#renewcommandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitRenewcommandDeclaration(@NotNull LaTEXParser.RenewcommandDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#italicBlock}.
	 * @param ctx the parse tree
	 */
	void enterItalicBlock(@NotNull LaTEXParser.ItalicBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#italicBlock}.
	 * @param ctx the parse tree
	 */
	void exitItalicBlock(@NotNull LaTEXParser.ItalicBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#multicolsBlock}.
	 * @param ctx the parse tree
	 */
	void enterMulticolsBlock(@NotNull LaTEXParser.MulticolsBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#multicolsBlock}.
	 * @param ctx the parse tree
	 */
	void exitMulticolsBlock(@NotNull LaTEXParser.MulticolsBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#suppFigureReferenceList}.
	 * @param ctx the parse tree
	 */
	void enterSuppFigureReferenceList(@NotNull LaTEXParser.SuppFigureReferenceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#suppFigureReferenceList}.
	 * @param ctx the parse tree
	 */
	void exitSuppFigureReferenceList(@NotNull LaTEXParser.SuppFigureReferenceListContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(@NotNull LaTEXParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(@NotNull LaTEXParser.OutputContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#measures}.
	 * @param ctx the parse tree
	 */
	void enterMeasures(@NotNull LaTEXParser.MeasuresContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#measures}.
	 * @param ctx the parse tree
	 */
	void exitMeasures(@NotNull LaTEXParser.MeasuresContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#newCommandList}.
	 * @param ctx the parse tree
	 */
	void enterNewCommandList(@NotNull LaTEXParser.NewCommandListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#newCommandList}.
	 * @param ctx the parse tree
	 */
	void exitNewCommandList(@NotNull LaTEXParser.NewCommandListContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#options}.
	 * @param ctx the parse tree
	 */
	void enterOptions(@NotNull LaTEXParser.OptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#options}.
	 * @param ctx the parse tree
	 */
	void exitOptions(@NotNull LaTEXParser.OptionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull LaTEXParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull LaTEXParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(@NotNull LaTEXParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(@NotNull LaTEXParser.TextContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#italicOutBlock}.
	 * @param ctx the parse tree
	 */
	void enterItalicOutBlock(@NotNull LaTEXParser.ItalicOutBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#italicOutBlock}.
	 * @param ctx the parse tree
	 */
	void exitItalicOutBlock(@NotNull LaTEXParser.ItalicOutBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(@NotNull LaTEXParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(@NotNull LaTEXParser.StateContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#pubNumbers}.
	 * @param ctx the parse tree
	 */
	void enterPubNumbers(@NotNull LaTEXParser.PubNumbersContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#pubNumbers}.
	 * @param ctx the parse tree
	 */
	void exitPubNumbers(@NotNull LaTEXParser.PubNumbersContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#ttStyle}.
	 * @param ctx the parse tree
	 */
	void enterTtStyle(@NotNull LaTEXParser.TtStyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#ttStyle}.
	 * @param ctx the parse tree
	 */
	void exitTtStyle(@NotNull LaTEXParser.TtStyleContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#descriptionItems}.
	 * @param ctx the parse tree
	 */
	void enterDescriptionItems(@NotNull LaTEXParser.DescriptionItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#descriptionItems}.
	 * @param ctx the parse tree
	 */
	void exitDescriptionItems(@NotNull LaTEXParser.DescriptionItemsContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(@NotNull LaTEXParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(@NotNull LaTEXParser.IfBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(@NotNull LaTEXParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(@NotNull LaTEXParser.ItemContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#tableColBody}.
	 * @param ctx the parse tree
	 */
	void enterTableColBody(@NotNull LaTEXParser.TableColBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#tableColBody}.
	 * @param ctx the parse tree
	 */
	void exitTableColBody(@NotNull LaTEXParser.TableColBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#boxBlock}.
	 * @param ctx the parse tree
	 */
	void enterBoxBlock(@NotNull LaTEXParser.BoxBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#boxBlock}.
	 * @param ctx the parse tree
	 */
	void exitBoxBlock(@NotNull LaTEXParser.BoxBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#subsubsectionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSubsubsectionDeclaration(@NotNull LaTEXParser.SubsubsectionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#subsubsectionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSubsubsectionDeclaration(@NotNull LaTEXParser.SubsubsectionDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#bibAuthor}.
	 * @param ctx the parse tree
	 */
	void enterBibAuthor(@NotNull LaTEXParser.BibAuthorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#bibAuthor}.
	 * @param ctx the parse tree
	 */
	void exitBibAuthor(@NotNull LaTEXParser.BibAuthorContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#descriptionTitle}.
	 * @param ctx the parse tree
	 */
	void enterDescriptionTitle(@NotNull LaTEXParser.DescriptionTitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#descriptionTitle}.
	 * @param ctx the parse tree
	 */
	void exitDescriptionTitle(@NotNull LaTEXParser.DescriptionTitleContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#pagesDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPagesDeclaration(@NotNull LaTEXParser.PagesDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#pagesDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPagesDeclaration(@NotNull LaTEXParser.PagesDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#tableStyle}.
	 * @param ctx the parse tree
	 */
	void enterTableStyle(@NotNull LaTEXParser.TableStyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#tableStyle}.
	 * @param ctx the parse tree
	 */
	void exitTableStyle(@NotNull LaTEXParser.TableStyleContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#onePage}.
	 * @param ctx the parse tree
	 */
	void enterOnePage(@NotNull LaTEXParser.OnePageContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#onePage}.
	 * @param ctx the parse tree
	 */
	void exitOnePage(@NotNull LaTEXParser.OnePageContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#bibItemAuthorList}.
	 * @param ctx the parse tree
	 */
	void enterBibItemAuthorList(@NotNull LaTEXParser.BibItemAuthorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#bibItemAuthorList}.
	 * @param ctx the parse tree
	 */
	void exitBibItemAuthorList(@NotNull LaTEXParser.BibItemAuthorListContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#bibItemAuthor}.
	 * @param ctx the parse tree
	 */
	void enterBibItemAuthor(@NotNull LaTEXParser.BibItemAuthorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#bibItemAuthor}.
	 * @param ctx the parse tree
	 */
	void exitBibItemAuthor(@NotNull LaTEXParser.BibItemAuthorContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(@NotNull LaTEXParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(@NotNull LaTEXParser.InputContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#textformatingBlockFlushLeft}.
	 * @param ctx the parse tree
	 */
	void enterTextformatingBlockFlushLeft(@NotNull LaTEXParser.TextformatingBlockFlushLeftContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#textformatingBlockFlushLeft}.
	 * @param ctx the parse tree
	 */
	void exitTextformatingBlockFlushLeft(@NotNull LaTEXParser.TextformatingBlockFlushLeftContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#bibVolume}.
	 * @param ctx the parse tree
	 */
	void enterBibVolume(@NotNull LaTEXParser.BibVolumeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#bibVolume}.
	 * @param ctx the parse tree
	 */
	void exitBibVolume(@NotNull LaTEXParser.BibVolumeContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#rparen}.
	 * @param ctx the parse tree
	 */
	void enterRparen(@NotNull LaTEXParser.RparenContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#rparen}.
	 * @param ctx the parse tree
	 */
	void exitRparen(@NotNull LaTEXParser.RparenContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#textformatingBlockCenter}.
	 * @param ctx the parse tree
	 */
	void enterTextformatingBlockCenter(@NotNull LaTEXParser.TextformatingBlockCenterContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#textformatingBlockCenter}.
	 * @param ctx the parse tree
	 */
	void exitTextformatingBlockCenter(@NotNull LaTEXParser.TextformatingBlockCenterContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(@NotNull LaTEXParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(@NotNull LaTEXParser.IntervalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#documentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDocumentDeclaration(@NotNull LaTEXParser.DocumentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#documentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDocumentDeclaration(@NotNull LaTEXParser.DocumentDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#eqnEquation}.
	 * @param ctx the parse tree
	 */
	void enterEqnEquation(@NotNull LaTEXParser.EqnEquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#eqnEquation}.
	 * @param ctx the parse tree
	 */
	void exitEqnEquation(@NotNull LaTEXParser.EqnEquationContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#items}.
	 * @param ctx the parse tree
	 */
	void enterItems(@NotNull LaTEXParser.ItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#items}.
	 * @param ctx the parse tree
	 */
	void exitItems(@NotNull LaTEXParser.ItemsContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#etAlAuthors}.
	 * @param ctx the parse tree
	 */
	void enterEtAlAuthors(@NotNull LaTEXParser.EtAlAuthorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#etAlAuthors}.
	 * @param ctx the parse tree
	 */
	void exitEtAlAuthors(@NotNull LaTEXParser.EtAlAuthorsContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#algorithmBlock}.
	 * @param ctx the parse tree
	 */
	void enterAlgorithmBlock(@NotNull LaTEXParser.AlgorithmBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#algorithmBlock}.
	 * @param ctx the parse tree
	 */
	void exitAlgorithmBlock(@NotNull LaTEXParser.AlgorithmBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#displayEquation}.
	 * @param ctx the parse tree
	 */
	void enterDisplayEquation(@NotNull LaTEXParser.DisplayEquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#displayEquation}.
	 * @param ctx the parse tree
	 */
	void exitDisplayEquation(@NotNull LaTEXParser.DisplayEquationContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#bibliographyList}.
	 * @param ctx the parse tree
	 */
	void enterBibliographyList(@NotNull LaTEXParser.BibliographyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#bibliographyList}.
	 * @param ctx the parse tree
	 */
	void exitBibliographyList(@NotNull LaTEXParser.BibliographyListContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void enterParagraph(@NotNull LaTEXParser.ParagraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void exitParagraph(@NotNull LaTEXParser.ParagraphContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#other}.
	 * @param ctx the parse tree
	 */
	void enterOther(@NotNull LaTEXParser.OtherContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#other}.
	 * @param ctx the parse tree
	 */
	void exitOther(@NotNull LaTEXParser.OtherContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#newLine}.
	 * @param ctx the parse tree
	 */
	void enterNewLine(@NotNull LaTEXParser.NewLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#newLine}.
	 * @param ctx the parse tree
	 */
	void exitNewLine(@NotNull LaTEXParser.NewLineContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#bibJournal}.
	 * @param ctx the parse tree
	 */
	void enterBibJournal(@NotNull LaTEXParser.BibJournalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#bibJournal}.
	 * @param ctx the parse tree
	 */
	void exitBibJournal(@NotNull LaTEXParser.BibJournalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#boldTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBoldTypeDeclaration(@NotNull LaTEXParser.BoldTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#boldTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBoldTypeDeclaration(@NotNull LaTEXParser.BoldTypeDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#dot}.
	 * @param ctx the parse tree
	 */
	void enterDot(@NotNull LaTEXParser.DotContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#dot}.
	 * @param ctx the parse tree
	 */
	void exitDot(@NotNull LaTEXParser.DotContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#textBody}.
	 * @param ctx the parse tree
	 */
	void enterTextBody(@NotNull LaTEXParser.TextBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#textBody}.
	 * @param ctx the parse tree
	 */
	void exitTextBody(@NotNull LaTEXParser.TextBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#multicolumn}.
	 * @param ctx the parse tree
	 */
	void enterMulticolumn(@NotNull LaTEXParser.MulticolumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#multicolumn}.
	 * @param ctx the parse tree
	 */
	void exitMulticolumn(@NotNull LaTEXParser.MulticolumnContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#bibNumber}.
	 * @param ctx the parse tree
	 */
	void enterBibNumber(@NotNull LaTEXParser.BibNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#bibNumber}.
	 * @param ctx the parse tree
	 */
	void exitBibNumber(@NotNull LaTEXParser.BibNumberContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#appos}.
	 * @param ctx the parse tree
	 */
	void enterAppos(@NotNull LaTEXParser.ApposContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#appos}.
	 * @param ctx the parse tree
	 */
	void exitAppos(@NotNull LaTEXParser.ApposContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#memberList}.
	 * @param ctx the parse tree
	 */
	void enterMemberList(@NotNull LaTEXParser.MemberListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#memberList}.
	 * @param ctx the parse tree
	 */
	void exitMemberList(@NotNull LaTEXParser.MemberListContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#commandBody}.
	 * @param ctx the parse tree
	 */
	void enterCommandBody(@NotNull LaTEXParser.CommandBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#commandBody}.
	 * @param ctx the parse tree
	 */
	void exitCommandBody(@NotNull LaTEXParser.CommandBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#blockDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBlockDeclaration(@NotNull LaTEXParser.BlockDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#blockDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBlockDeclaration(@NotNull LaTEXParser.BlockDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#newcommandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNewcommandDeclaration(@NotNull LaTEXParser.NewcommandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#newcommandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNewcommandDeclaration(@NotNull LaTEXParser.NewcommandDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#simpleText}.
	 * @param ctx the parse tree
	 */
	void enterSimpleText(@NotNull LaTEXParser.SimpleTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#simpleText}.
	 * @param ctx the parse tree
	 */
	void exitSimpleText(@NotNull LaTEXParser.SimpleTextContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#bibItemPages}.
	 * @param ctx the parse tree
	 */
	void enterBibItemPages(@NotNull LaTEXParser.BibItemPagesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#bibItemPages}.
	 * @param ctx the parse tree
	 */
	void exitBibItemPages(@NotNull LaTEXParser.BibItemPagesContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#thebibmissinfo}.
	 * @param ctx the parse tree
	 */
	void enterThebibmissinfo(@NotNull LaTEXParser.ThebibmissinfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#thebibmissinfo}.
	 * @param ctx the parse tree
	 */
	void exitThebibmissinfo(@NotNull LaTEXParser.ThebibmissinfoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#arabic}.
	 * @param ctx the parse tree
	 */
	void enterArabic(@NotNull LaTEXParser.ArabicContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#arabic}.
	 * @param ctx the parse tree
	 */
	void exitArabic(@NotNull LaTEXParser.ArabicContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#member}.
	 * @param ctx the parse tree
	 */
	void enterMember(@NotNull LaTEXParser.MemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#member}.
	 * @param ctx the parse tree
	 */
	void exitMember(@NotNull LaTEXParser.MemberContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(@NotNull LaTEXParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(@NotNull LaTEXParser.TableContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#newRow}.
	 * @param ctx the parse tree
	 */
	void enterNewRow(@NotNull LaTEXParser.NewRowContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#newRow}.
	 * @param ctx the parse tree
	 */
	void exitNewRow(@NotNull LaTEXParser.NewRowContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#dots}.
	 * @param ctx the parse tree
	 */
	void enterDots(@NotNull LaTEXParser.DotsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#dots}.
	 * @param ctx the parse tree
	 */
	void exitDots(@NotNull LaTEXParser.DotsContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#ifThenElse}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElse(@NotNull LaTEXParser.IfThenElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#ifThenElse}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElse(@NotNull LaTEXParser.IfThenElseContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#tabular}.
	 * @param ctx the parse tree
	 */
	void enterTabular(@NotNull LaTEXParser.TabularContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#tabular}.
	 * @param ctx the parse tree
	 */
	void exitTabular(@NotNull LaTEXParser.TabularContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#eqnArrayBody}.
	 * @param ctx the parse tree
	 */
	void enterEqnArrayBody(@NotNull LaTEXParser.EqnArrayBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#eqnArrayBody}.
	 * @param ctx the parse tree
	 */
	void exitEqnArrayBody(@NotNull LaTEXParser.EqnArrayBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#figureBlock}.
	 * @param ctx the parse tree
	 */
	void enterFigureBlock(@NotNull LaTEXParser.FigureBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#figureBlock}.
	 * @param ctx the parse tree
	 */
	void exitFigureBlock(@NotNull LaTEXParser.FigureBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#url}.
	 * @param ctx the parse tree
	 */
	void enterUrl(@NotNull LaTEXParser.UrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#url}.
	 * @param ctx the parse tree
	 */
	void exitUrl(@NotNull LaTEXParser.UrlContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#identificator}.
	 * @param ctx the parse tree
	 */
	void enterIdentificator(@NotNull LaTEXParser.IdentificatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#identificator}.
	 * @param ctx the parse tree
	 */
	void exitIdentificator(@NotNull LaTEXParser.IdentificatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#captionBlock}.
	 * @param ctx the parse tree
	 */
	void enterCaptionBlock(@NotNull LaTEXParser.CaptionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#captionBlock}.
	 * @param ctx the parse tree
	 */
	void exitCaptionBlock(@NotNull LaTEXParser.CaptionBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#tableCol}.
	 * @param ctx the parse tree
	 */
	void enterTableCol(@NotNull LaTEXParser.TableColContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#tableCol}.
	 * @param ctx the parse tree
	 */
	void exitTableCol(@NotNull LaTEXParser.TableColContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#comma}.
	 * @param ctx the parse tree
	 */
	void enterComma(@NotNull LaTEXParser.CommaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#comma}.
	 * @param ctx the parse tree
	 */
	void exitComma(@NotNull LaTEXParser.CommaContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#firstBlock}.
	 * @param ctx the parse tree
	 */
	void enterFirstBlock(@NotNull LaTEXParser.FirstBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#firstBlock}.
	 * @param ctx the parse tree
	 */
	void exitFirstBlock(@NotNull LaTEXParser.FirstBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#subsectionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSubsectionDeclaration(@NotNull LaTEXParser.SubsectionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#subsectionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSubsectionDeclaration(@NotNull LaTEXParser.SubsectionDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#documentBody}.
	 * @param ctx the parse tree
	 */
	void enterDocumentBody(@NotNull LaTEXParser.DocumentBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#documentBody}.
	 * @param ctx the parse tree
	 */
	void exitDocumentBody(@NotNull LaTEXParser.DocumentBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#bibItemPubTtl}.
	 * @param ctx the parse tree
	 */
	void enterBibItemPubTtl(@NotNull LaTEXParser.BibItemPubTtlContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#bibItemPubTtl}.
	 * @param ctx the parse tree
	 */
	void exitBibItemPubTtl(@NotNull LaTEXParser.BibItemPubTtlContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#bibItem}.
	 * @param ctx the parse tree
	 */
	void enterBibItem(@NotNull LaTEXParser.BibItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#bibItem}.
	 * @param ctx the parse tree
	 */
	void exitBibItem(@NotNull LaTEXParser.BibItemContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#ifThenText}.
	 * @param ctx the parse tree
	 */
	void enterIfThenText(@NotNull LaTEXParser.IfThenTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#ifThenText}.
	 * @param ctx the parse tree
	 */
	void exitIfThenText(@NotNull LaTEXParser.IfThenTextContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#bibliographyBlock}.
	 * @param ctx the parse tree
	 */
	void enterBibliographyBlock(@NotNull LaTEXParser.BibliographyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#bibliographyBlock}.
	 * @param ctx the parse tree
	 */
	void exitBibliographyBlock(@NotNull LaTEXParser.BibliographyBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#tblRef}.
	 * @param ctx the parse tree
	 */
	void enterTblRef(@NotNull LaTEXParser.TblRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#tblRef}.
	 * @param ctx the parse tree
	 */
	void exitTblRef(@NotNull LaTEXParser.TblRefContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#bibLabel}.
	 * @param ctx the parse tree
	 */
	void enterBibLabel(@NotNull LaTEXParser.BibLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#bibLabel}.
	 * @param ctx the parse tree
	 */
	void exitBibLabel(@NotNull LaTEXParser.BibLabelContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#textSC}.
	 * @param ctx the parse tree
	 */
	void enterTextSC(@NotNull LaTEXParser.TextSCContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#textSC}.
	 * @param ctx the parse tree
	 */
	void exitTextSC(@NotNull LaTEXParser.TextSCContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#tableRefListTypeNumbers}.
	 * @param ctx the parse tree
	 */
	void enterTableRefListTypeNumbers(@NotNull LaTEXParser.TableRefListTypeNumbersContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#tableRefListTypeNumbers}.
	 * @param ctx the parse tree
	 */
	void exitTableRefListTypeNumbers(@NotNull LaTEXParser.TableRefListTypeNumbersContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#texttypeDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterTexttypeDeclarator(@NotNull LaTEXParser.TexttypeDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#texttypeDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitTexttypeDeclarator(@NotNull LaTEXParser.TexttypeDeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#numbers}.
	 * @param ctx the parse tree
	 */
	void enterNumbers(@NotNull LaTEXParser.NumbersContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#numbers}.
	 * @param ctx the parse tree
	 */
	void exitNumbers(@NotNull LaTEXParser.NumbersContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#bibItemList}.
	 * @param ctx the parse tree
	 */
	void enterBibItemList(@NotNull LaTEXParser.BibItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#bibItemList}.
	 * @param ctx the parse tree
	 */
	void exitBibItemList(@NotNull LaTEXParser.BibItemListContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#tableRow}.
	 * @param ctx the parse tree
	 */
	void enterTableRow(@NotNull LaTEXParser.TableRowContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#tableRow}.
	 * @param ctx the parse tree
	 */
	void exitTableRow(@NotNull LaTEXParser.TableRowContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#bibItemBody}.
	 * @param ctx the parse tree
	 */
	void enterBibItemBody(@NotNull LaTEXParser.BibItemBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#bibItemBody}.
	 * @param ctx the parse tree
	 */
	void exitBibItemBody(@NotNull LaTEXParser.BibItemBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#descriptionItem}.
	 * @param ctx the parse tree
	 */
	void enterDescriptionItem(@NotNull LaTEXParser.DescriptionItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#descriptionItem}.
	 * @param ctx the parse tree
	 */
	void exitDescriptionItem(@NotNull LaTEXParser.DescriptionItemContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#equationBlock}.
	 * @param ctx the parse tree
	 */
	void enterEquationBlock(@NotNull LaTEXParser.EquationBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#equationBlock}.
	 * @param ctx the parse tree
	 */
	void exitEquationBlock(@NotNull LaTEXParser.EquationBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#ref}.
	 * @param ctx the parse tree
	 */
	void enterRef(@NotNull LaTEXParser.RefContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#ref}.
	 * @param ctx the parse tree
	 */
	void exitRef(@NotNull LaTEXParser.RefContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#isoEnt}.
	 * @param ctx the parse tree
	 */
	void enterIsoEnt(@NotNull LaTEXParser.IsoEntContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#isoEnt}.
	 * @param ctx the parse tree
	 */
	void exitIsoEnt(@NotNull LaTEXParser.IsoEntContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#dollarBlock}.
	 * @param ctx the parse tree
	 */
	void enterDollarBlock(@NotNull LaTEXParser.DollarBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#dollarBlock}.
	 * @param ctx the parse tree
	 */
	void exitDollarBlock(@NotNull LaTEXParser.DollarBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#bibItemCittl}.
	 * @param ctx the parse tree
	 */
	void enterBibItemCittl(@NotNull LaTEXParser.BibItemCittlContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#bibItemCittl}.
	 * @param ctx the parse tree
	 */
	void exitBibItemCittl(@NotNull LaTEXParser.BibItemCittlContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#hat}.
	 * @param ctx the parse tree
	 */
	void enterHat(@NotNull LaTEXParser.HatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#hat}.
	 * @param ctx the parse tree
	 */
	void exitHat(@NotNull LaTEXParser.HatContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#figureRefList}.
	 * @param ctx the parse tree
	 */
	void enterFigureRefList(@NotNull LaTEXParser.FigureRefListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#figureRefList}.
	 * @param ctx the parse tree
	 */
	void exitFigureRefList(@NotNull LaTEXParser.FigureRefListContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#bibDate}.
	 * @param ctx the parse tree
	 */
	void enterBibDate(@NotNull LaTEXParser.BibDateContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#bibDate}.
	 * @param ctx the parse tree
	 */
	void exitBibDate(@NotNull LaTEXParser.BibDateContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#suppTableReferenceList}.
	 * @param ctx the parse tree
	 */
	void enterSuppTableReferenceList(@NotNull LaTEXParser.SuppTableReferenceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#suppTableReferenceList}.
	 * @param ctx the parse tree
	 */
	void exitSuppTableReferenceList(@NotNull LaTEXParser.SuppTableReferenceListContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#citeReferences}.
	 * @param ctx the parse tree
	 */
	void enterCiteReferences(@NotNull LaTEXParser.CiteReferencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#citeReferences}.
	 * @param ctx the parse tree
	 */
	void exitCiteReferences(@NotNull LaTEXParser.CiteReferencesContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#pubTitleText}.
	 * @param ctx the parse tree
	 */
	void enterPubTitleText(@NotNull LaTEXParser.PubTitleTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#pubTitleText}.
	 * @param ctx the parse tree
	 */
	void exitPubTitleText(@NotNull LaTEXParser.PubTitleTextContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#sectionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSectionDeclaration(@NotNull LaTEXParser.SectionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#sectionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSectionDeclaration(@NotNull LaTEXParser.SectionDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(@NotNull LaTEXParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(@NotNull LaTEXParser.ListContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void enterForBlock(@NotNull LaTEXParser.ForBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void exitForBlock(@NotNull LaTEXParser.ForBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#figureReference}.
	 * @param ctx the parse tree
	 */
	void enterFigureReference(@NotNull LaTEXParser.FigureReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#figureReference}.
	 * @param ctx the parse tree
	 */
	void exitFigureReference(@NotNull LaTEXParser.FigureReferenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#bibMember}.
	 * @param ctx the parse tree
	 */
	void enterBibMember(@NotNull LaTEXParser.BibMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#bibMember}.
	 * @param ctx the parse tree
	 */
	void exitBibMember(@NotNull LaTEXParser.BibMemberContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#article}.
	 * @param ctx the parse tree
	 */
	void enterArticle(@NotNull LaTEXParser.ArticleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#article}.
	 * @param ctx the parse tree
	 */
	void exitArticle(@NotNull LaTEXParser.ArticleContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#bibTitle}.
	 * @param ctx the parse tree
	 */
	void enterBibTitle(@NotNull LaTEXParser.BibTitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#bibTitle}.
	 * @param ctx the parse tree
	 */
	void exitBibTitle(@NotNull LaTEXParser.BibTitleContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#doubleNumbers}.
	 * @param ctx the parse tree
	 */
	void enterDoubleNumbers(@NotNull LaTEXParser.DoubleNumbersContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#doubleNumbers}.
	 * @param ctx the parse tree
	 */
	void exitDoubleNumbers(@NotNull LaTEXParser.DoubleNumbersContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#citeReferencesList}.
	 * @param ctx the parse tree
	 */
	void enterCiteReferencesList(@NotNull LaTEXParser.CiteReferencesListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#citeReferencesList}.
	 * @param ctx the parse tree
	 */
	void exitCiteReferencesList(@NotNull LaTEXParser.CiteReferencesListContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(@NotNull LaTEXParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(@NotNull LaTEXParser.CompilationUnitContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#algorithmicBlock}.
	 * @param ctx the parse tree
	 */
	void enterAlgorithmicBlock(@NotNull LaTEXParser.AlgorithmicBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#algorithmicBlock}.
	 * @param ctx the parse tree
	 */
	void exitAlgorithmicBlock(@NotNull LaTEXParser.AlgorithmicBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#startingDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStartingDeclaration(@NotNull LaTEXParser.StartingDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#startingDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStartingDeclaration(@NotNull LaTEXParser.StartingDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#textRules}.
	 * @param ctx the parse tree
	 */
	void enterTextRules(@NotNull LaTEXParser.TextRulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#textRules}.
	 * @param ctx the parse tree
	 */
	void exitTextRules(@NotNull LaTEXParser.TextRulesContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#lparen}.
	 * @param ctx the parse tree
	 */
	void enterLparen(@NotNull LaTEXParser.LparenContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#lparen}.
	 * @param ctx the parse tree
	 */
	void exitLparen(@NotNull LaTEXParser.LparenContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#bibOther}.
	 * @param ctx the parse tree
	 */
	void enterBibOther(@NotNull LaTEXParser.BibOtherContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#bibOther}.
	 * @param ctx the parse tree
	 */
	void exitBibOther(@NotNull LaTEXParser.BibOtherContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#tableRows}.
	 * @param ctx the parse tree
	 */
	void enterTableRows(@NotNull LaTEXParser.TableRowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#tableRows}.
	 * @param ctx the parse tree
	 */
	void exitTableRows(@NotNull LaTEXParser.TableRowsContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#bibBookTiltle}.
	 * @param ctx the parse tree
	 */
	void enterBibBookTiltle(@NotNull LaTEXParser.BibBookTiltleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#bibBookTiltle}.
	 * @param ctx the parse tree
	 */
	void exitBibBookTiltle(@NotNull LaTEXParser.BibBookTiltleContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#eqnArray}.
	 * @param ctx the parse tree
	 */
	void enterEqnArray(@NotNull LaTEXParser.EqnArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#eqnArray}.
	 * @param ctx the parse tree
	 */
	void exitEqnArray(@NotNull LaTEXParser.EqnArrayContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#citeReference}.
	 * @param ctx the parse tree
	 */
	void enterCiteReference(@NotNull LaTEXParser.CiteReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#citeReference}.
	 * @param ctx the parse tree
	 */
	void exitCiteReference(@NotNull LaTEXParser.CiteReferenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#amp}.
	 * @param ctx the parse tree
	 */
	void enterAmp(@NotNull LaTEXParser.AmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#amp}.
	 * @param ctx the parse tree
	 */
	void exitAmp(@NotNull LaTEXParser.AmpContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#book}.
	 * @param ctx the parse tree
	 */
	void enterBook(@NotNull LaTEXParser.BookContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#book}.
	 * @param ctx the parse tree
	 */
	void exitBook(@NotNull LaTEXParser.BookContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#doubleSlash}.
	 * @param ctx the parse tree
	 */
	void enterDoubleSlash(@NotNull LaTEXParser.DoubleSlashContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#doubleSlash}.
	 * @param ctx the parse tree
	 */
	void exitDoubleSlash(@NotNull LaTEXParser.DoubleSlashContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(@NotNull LaTEXParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(@NotNull LaTEXParser.TitleContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#tableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTableDeclaration(@NotNull LaTEXParser.TableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#tableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTableDeclaration(@NotNull LaTEXParser.TableDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#abstractBlock}.
	 * @param ctx the parse tree
	 */
	void enterAbstractBlock(@NotNull LaTEXParser.AbstractBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#abstractBlock}.
	 * @param ctx the parse tree
	 */
	void exitAbstractBlock(@NotNull LaTEXParser.AbstractBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#smallcapsDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSmallcapsDeclaration(@NotNull LaTEXParser.SmallcapsDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#smallcapsDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSmallcapsDeclaration(@NotNull LaTEXParser.SmallcapsDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#landScapeBlock}.
	 * @param ctx the parse tree
	 */
	void enterLandScapeBlock(@NotNull LaTEXParser.LandScapeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#landScapeBlock}.
	 * @param ctx the parse tree
	 */
	void exitLandScapeBlock(@NotNull LaTEXParser.LandScapeBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#supplementaryFigureBlock}.
	 * @param ctx the parse tree
	 */
	void enterSupplementaryFigureBlock(@NotNull LaTEXParser.SupplementaryFigureBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#supplementaryFigureBlock}.
	 * @param ctx the parse tree
	 */
	void exitSupplementaryFigureBlock(@NotNull LaTEXParser.SupplementaryFigureBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#italictypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterItalictypeDeclaration(@NotNull LaTEXParser.ItalictypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#italictypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitItalictypeDeclaration(@NotNull LaTEXParser.ItalictypeDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#authorText}.
	 * @param ctx the parse tree
	 */
	void enterAuthorText(@NotNull LaTEXParser.AuthorTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#authorText}.
	 * @param ctx the parse tree
	 */
	void exitAuthorText(@NotNull LaTEXParser.AuthorTextContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#bibMemberList}.
	 * @param ctx the parse tree
	 */
	void enterBibMemberList(@NotNull LaTEXParser.BibMemberListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#bibMemberList}.
	 * @param ctx the parse tree
	 */
	void exitBibMemberList(@NotNull LaTEXParser.BibMemberListContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#tableBody}.
	 * @param ctx the parse tree
	 */
	void enterTableBody(@NotNull LaTEXParser.TableBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#tableBody}.
	 * @param ctx the parse tree
	 */
	void exitTableBody(@NotNull LaTEXParser.TableBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#referenceList}.
	 * @param ctx the parse tree
	 */
	void enterReferenceList(@NotNull LaTEXParser.ReferenceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#referenceList}.
	 * @param ctx the parse tree
	 */
	void exitReferenceList(@NotNull LaTEXParser.ReferenceListContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#bibItemYear}.
	 * @param ctx the parse tree
	 */
	void enterBibItemYear(@NotNull LaTEXParser.BibItemYearContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#bibItemYear}.
	 * @param ctx the parse tree
	 */
	void exitBibItemYear(@NotNull LaTEXParser.BibItemYearContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#bibPublisher}.
	 * @param ctx the parse tree
	 */
	void enterBibPublisher(@NotNull LaTEXParser.BibPublisherContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#bibPublisher}.
	 * @param ctx the parse tree
	 */
	void exitBibPublisher(@NotNull LaTEXParser.BibPublisherContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#blockPages}.
	 * @param ctx the parse tree
	 */
	void enterBlockPages(@NotNull LaTEXParser.BlockPagesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#blockPages}.
	 * @param ctx the parse tree
	 */
	void exitBlockPages(@NotNull LaTEXParser.BlockPagesContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(@NotNull LaTEXParser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(@NotNull LaTEXParser.EquationContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#urlText}.
	 * @param ctx the parse tree
	 */
	void enterUrlText(@NotNull LaTEXParser.UrlTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#urlText}.
	 * @param ctx the parse tree
	 */
	void exitUrlText(@NotNull LaTEXParser.UrlTextContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#listPages}.
	 * @param ctx the parse tree
	 */
	void enterListPages(@NotNull LaTEXParser.ListPagesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#listPages}.
	 * @param ctx the parse tree
	 */
	void exitListPages(@NotNull LaTEXParser.ListPagesContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#textSymbols}.
	 * @param ctx the parse tree
	 */
	void enterTextSymbols(@NotNull LaTEXParser.TextSymbolsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#textSymbols}.
	 * @param ctx the parse tree
	 */
	void exitTextSymbols(@NotNull LaTEXParser.TextSymbolsContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(@NotNull LaTEXParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(@NotNull LaTEXParser.LabelContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#figureRefListTypeNumbers}.
	 * @param ctx the parse tree
	 */
	void enterFigureRefListTypeNumbers(@NotNull LaTEXParser.FigureRefListTypeNumbersContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#figureRefListTypeNumbers}.
	 * @param ctx the parse tree
	 */
	void exitFigureRefListTypeNumbers(@NotNull LaTEXParser.FigureRefListTypeNumbersContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#returnBlock}.
	 * @param ctx the parse tree
	 */
	void enterReturnBlock(@NotNull LaTEXParser.ReturnBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#returnBlock}.
	 * @param ctx the parse tree
	 */
	void exitReturnBlock(@NotNull LaTEXParser.ReturnBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#authorItemMiss}.
	 * @param ctx the parse tree
	 */
	void enterAuthorItemMiss(@NotNull LaTEXParser.AuthorItemMissContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#authorItemMiss}.
	 * @param ctx the parse tree
	 */
	void exitAuthorItemMiss(@NotNull LaTEXParser.AuthorItemMissContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void enterTableReference(@NotNull LaTEXParser.TableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void exitTableReference(@NotNull LaTEXParser.TableReferenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#curveOptionBlock}.
	 * @param ctx the parse tree
	 */
	void enterCurveOptionBlock(@NotNull LaTEXParser.CurveOptionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#curveOptionBlock}.
	 * @param ctx the parse tree
	 */
	void exitCurveOptionBlock(@NotNull LaTEXParser.CurveOptionBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#colon}.
	 * @param ctx the parse tree
	 */
	void enterColon(@NotNull LaTEXParser.ColonContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#colon}.
	 * @param ctx the parse tree
	 */
	void exitColon(@NotNull LaTEXParser.ColonContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#bibItemVol}.
	 * @param ctx the parse tree
	 */
	void enterBibItemVol(@NotNull LaTEXParser.BibItemVolContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#bibItemVol}.
	 * @param ctx the parse tree
	 */
	void exitBibItemVol(@NotNull LaTEXParser.BibItemVolContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#bibPages}.
	 * @param ctx the parse tree
	 */
	void enterBibPages(@NotNull LaTEXParser.BibPagesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#bibPages}.
	 * @param ctx the parse tree
	 */
	void exitBibPages(@NotNull LaTEXParser.BibPagesContext ctx);
}