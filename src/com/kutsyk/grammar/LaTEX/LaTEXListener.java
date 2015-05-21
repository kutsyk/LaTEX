// Generated from LaTEX.g4 by ANTLR 4.5
package com.kutsyk.grammar.LaTEX;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LaTEXParser}.
 */
public interface LaTEXListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(LaTEXParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(LaTEXParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#documentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDocumentDeclaration(LaTEXParser.DocumentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#documentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDocumentDeclaration(LaTEXParser.DocumentDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#documentBody}.
	 * @param ctx the parse tree
	 */
	void enterDocumentBody(LaTEXParser.DocumentBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#documentBody}.
	 * @param ctx the parse tree
	 */
	void exitDocumentBody(LaTEXParser.DocumentBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#frontPart}.
	 * @param ctx the parse tree
	 */
	void enterFrontPart(LaTEXParser.FrontPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#frontPart}.
	 * @param ctx the parse tree
	 */
	void exitFrontPart(LaTEXParser.FrontPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#frontBody}.
	 * @param ctx the parse tree
	 */
	void enterFrontBody(LaTEXParser.FrontBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#frontBody}.
	 * @param ctx the parse tree
	 */
	void exitFrontBody(LaTEXParser.FrontBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#mainTitle}.
	 * @param ctx the parse tree
	 */
	void enterMainTitle(LaTEXParser.MainTitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#mainTitle}.
	 * @param ctx the parse tree
	 */
	void exitMainTitle(LaTEXParser.MainTitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#authorList}.
	 * @param ctx the parse tree
	 */
	void enterAuthorList(LaTEXParser.AuthorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#authorList}.
	 * @param ctx the parse tree
	 */
	void exitAuthorList(LaTEXParser.AuthorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#author}.
	 * @param ctx the parse tree
	 */
	void enterAuthor(LaTEXParser.AuthorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#author}.
	 * @param ctx the parse tree
	 */
	void exitAuthor(LaTEXParser.AuthorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#textsuperscriptBlock}.
	 * @param ctx the parse tree
	 */
	void enterTextsuperscriptBlock(LaTEXParser.TextsuperscriptBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#textsuperscriptBlock}.
	 * @param ctx the parse tree
	 */
	void exitTextsuperscriptBlock(LaTEXParser.TextsuperscriptBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#authorName}.
	 * @param ctx the parse tree
	 */
	void enterAuthorName(LaTEXParser.AuthorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#authorName}.
	 * @param ctx the parse tree
	 */
	void exitAuthorName(LaTEXParser.AuthorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#address}.
	 * @param ctx the parse tree
	 */
	void enterAddress(LaTEXParser.AddressContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#address}.
	 * @param ctx the parse tree
	 */
	void exitAddress(LaTEXParser.AddressContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#bodyPart}.
	 * @param ctx the parse tree
	 */
	void enterBodyPart(LaTEXParser.BodyPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#bodyPart}.
	 * @param ctx the parse tree
	 */
	void exitBodyPart(LaTEXParser.BodyPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#memberList}.
	 * @param ctx the parse tree
	 */
	void enterMemberList(LaTEXParser.MemberListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#memberList}.
	 * @param ctx the parse tree
	 */
	void exitMemberList(LaTEXParser.MemberListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#member}.
	 * @param ctx the parse tree
	 */
	void enterMember(LaTEXParser.MemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#member}.
	 * @param ctx the parse tree
	 */
	void exitMember(LaTEXParser.MemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#landScapeBlock}.
	 * @param ctx the parse tree
	 */
	void enterLandScapeBlock(LaTEXParser.LandScapeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#landScapeBlock}.
	 * @param ctx the parse tree
	 */
	void exitLandScapeBlock(LaTEXParser.LandScapeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#textRules}.
	 * @param ctx the parse tree
	 */
	void enterTextRules(LaTEXParser.TextRulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#textRules}.
	 * @param ctx the parse tree
	 */
	void exitTextRules(LaTEXParser.TextRulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#textSymbols}.
	 * @param ctx the parse tree
	 */
	void enterTextSymbols(LaTEXParser.TextSymbolsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#textSymbols}.
	 * @param ctx the parse tree
	 */
	void exitTextSymbols(LaTEXParser.TextSymbolsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void enterParagraph(LaTEXParser.ParagraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void exitParagraph(LaTEXParser.ParagraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(LaTEXParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(LaTEXParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#textBody}.
	 * @param ctx the parse tree
	 */
	void enterTextBody(LaTEXParser.TextBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#textBody}.
	 * @param ctx the parse tree
	 */
	void exitTextBody(LaTEXParser.TextBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#textSC}.
	 * @param ctx the parse tree
	 */
	void enterTextSC(LaTEXParser.TextSCContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#textSC}.
	 * @param ctx the parse tree
	 */
	void exitTextSC(LaTEXParser.TextSCContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(LaTEXParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(LaTEXParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#boxBlock}.
	 * @param ctx the parse tree
	 */
	void enterBoxBlock(LaTEXParser.BoxBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#boxBlock}.
	 * @param ctx the parse tree
	 */
	void exitBoxBlock(LaTEXParser.BoxBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#abstractBlock}.
	 * @param ctx the parse tree
	 */
	void enterAbstractBlock(LaTEXParser.AbstractBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#abstractBlock}.
	 * @param ctx the parse tree
	 */
	void exitAbstractBlock(LaTEXParser.AbstractBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(LaTEXParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(LaTEXParser.TitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#newcommandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNewcommandDeclaration(LaTEXParser.NewcommandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#newcommandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNewcommandDeclaration(LaTEXParser.NewcommandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#commandBody}.
	 * @param ctx the parse tree
	 */
	void enterCommandBody(LaTEXParser.CommandBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#commandBody}.
	 * @param ctx the parse tree
	 */
	void exitCommandBody(LaTEXParser.CommandBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#renewcommandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterRenewcommandDeclaration(LaTEXParser.RenewcommandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#renewcommandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitRenewcommandDeclaration(LaTEXParser.RenewcommandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#latexTag}.
	 * @param ctx the parse tree
	 */
	void enterLatexTag(LaTEXParser.LatexTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#latexTag}.
	 * @param ctx the parse tree
	 */
	void exitLatexTag(LaTEXParser.LatexTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(LaTEXParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(LaTEXParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#multicolsBlock}.
	 * @param ctx the parse tree
	 */
	void enterMulticolsBlock(LaTEXParser.MulticolsBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#multicolsBlock}.
	 * @param ctx the parse tree
	 */
	void exitMulticolsBlock(LaTEXParser.MulticolsBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(LaTEXParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(LaTEXParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#items}.
	 * @param ctx the parse tree
	 */
	void enterItems(LaTEXParser.ItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#items}.
	 * @param ctx the parse tree
	 */
	void exitItems(LaTEXParser.ItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(LaTEXParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(LaTEXParser.ItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#descriptionList}.
	 * @param ctx the parse tree
	 */
	void enterDescriptionList(LaTEXParser.DescriptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#descriptionList}.
	 * @param ctx the parse tree
	 */
	void exitDescriptionList(LaTEXParser.DescriptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#descriptionItems}.
	 * @param ctx the parse tree
	 */
	void enterDescriptionItems(LaTEXParser.DescriptionItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#descriptionItems}.
	 * @param ctx the parse tree
	 */
	void exitDescriptionItems(LaTEXParser.DescriptionItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#descriptionItem}.
	 * @param ctx the parse tree
	 */
	void enterDescriptionItem(LaTEXParser.DescriptionItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#descriptionItem}.
	 * @param ctx the parse tree
	 */
	void exitDescriptionItem(LaTEXParser.DescriptionItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#descriptionTitle}.
	 * @param ctx the parse tree
	 */
	void enterDescriptionTitle(LaTEXParser.DescriptionTitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#descriptionTitle}.
	 * @param ctx the parse tree
	 */
	void exitDescriptionTitle(LaTEXParser.DescriptionTitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#captionBlock}.
	 * @param ctx the parse tree
	 */
	void enterCaptionBlock(LaTEXParser.CaptionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#captionBlock}.
	 * @param ctx the parse tree
	 */
	void exitCaptionBlock(LaTEXParser.CaptionBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(LaTEXParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(LaTEXParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#tableCaption}.
	 * @param ctx the parse tree
	 */
	void enterTableCaption(LaTEXParser.TableCaptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#tableCaption}.
	 * @param ctx the parse tree
	 */
	void exitTableCaption(LaTEXParser.TableCaptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#tabular}.
	 * @param ctx the parse tree
	 */
	void enterTabular(LaTEXParser.TabularContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#tabular}.
	 * @param ctx the parse tree
	 */
	void exitTabular(LaTEXParser.TabularContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#tableSkipBlock}.
	 * @param ctx the parse tree
	 */
	void enterTableSkipBlock(LaTEXParser.TableSkipBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#tableSkipBlock}.
	 * @param ctx the parse tree
	 */
	void exitTableSkipBlock(LaTEXParser.TableSkipBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#tableDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTableDefinition(LaTEXParser.TableDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#tableDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTableDefinition(LaTEXParser.TableDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#multicolumn}.
	 * @param ctx the parse tree
	 */
	void enterMulticolumn(LaTEXParser.MulticolumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#multicolumn}.
	 * @param ctx the parse tree
	 */
	void exitMulticolumn(LaTEXParser.MulticolumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#tableRow}.
	 * @param ctx the parse tree
	 */
	void enterTableRow(LaTEXParser.TableRowContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#tableRow}.
	 * @param ctx the parse tree
	 */
	void exitTableRow(LaTEXParser.TableRowContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#tableCell}.
	 * @param ctx the parse tree
	 */
	void enterTableCell(LaTEXParser.TableCellContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#tableCell}.
	 * @param ctx the parse tree
	 */
	void exitTableCell(LaTEXParser.TableCellContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#texttypeDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterTexttypeDeclarator(LaTEXParser.TexttypeDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#texttypeDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitTexttypeDeclarator(LaTEXParser.TexttypeDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#ttStyle}.
	 * @param ctx the parse tree
	 */
	void enterTtStyle(LaTEXParser.TtStyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#ttStyle}.
	 * @param ctx the parse tree
	 */
	void exitTtStyle(LaTEXParser.TtStyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#boldTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBoldTypeDeclaration(LaTEXParser.BoldTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#boldTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBoldTypeDeclaration(LaTEXParser.BoldTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#smallcapsDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSmallcapsDeclaration(LaTEXParser.SmallcapsDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#smallcapsDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSmallcapsDeclaration(LaTEXParser.SmallcapsDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#italictypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterItalictypeDeclaration(LaTEXParser.ItalictypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#italictypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitItalictypeDeclaration(LaTEXParser.ItalictypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#italicBlock}.
	 * @param ctx the parse tree
	 */
	void enterItalicBlock(LaTEXParser.ItalicBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#italicBlock}.
	 * @param ctx the parse tree
	 */
	void exitItalicBlock(LaTEXParser.ItalicBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#italicOutBlock}.
	 * @param ctx the parse tree
	 */
	void enterItalicOutBlock(LaTEXParser.ItalicOutBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#italicOutBlock}.
	 * @param ctx the parse tree
	 */
	void exitItalicOutBlock(LaTEXParser.ItalicOutBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#textformatingBlockFlushLeft}.
	 * @param ctx the parse tree
	 */
	void enterTextformatingBlockFlushLeft(LaTEXParser.TextformatingBlockFlushLeftContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#textformatingBlockFlushLeft}.
	 * @param ctx the parse tree
	 */
	void exitTextformatingBlockFlushLeft(LaTEXParser.TextformatingBlockFlushLeftContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#textformatingBlockCenter}.
	 * @param ctx the parse tree
	 */
	void enterTextformatingBlockCenter(LaTEXParser.TextformatingBlockCenterContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#textformatingBlockCenter}.
	 * @param ctx the parse tree
	 */
	void exitTextformatingBlockCenter(LaTEXParser.TextformatingBlockCenterContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#sectionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSectionDeclaration(LaTEXParser.SectionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#sectionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSectionDeclaration(LaTEXParser.SectionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#subsectionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSubsectionDeclaration(LaTEXParser.SubsectionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#subsectionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSubsectionDeclaration(LaTEXParser.SubsectionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#subsubsectionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSubsubsectionDeclaration(LaTEXParser.SubsubsectionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#subsubsectionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSubsubsectionDeclaration(LaTEXParser.SubsubsectionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#citeReferences}.
	 * @param ctx the parse tree
	 */
	void enterCiteReferences(LaTEXParser.CiteReferencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#citeReferences}.
	 * @param ctx the parse tree
	 */
	void exitCiteReferences(LaTEXParser.CiteReferencesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#citeReferencesList}.
	 * @param ctx the parse tree
	 */
	void enterCiteReferencesList(LaTEXParser.CiteReferencesListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#citeReferencesList}.
	 * @param ctx the parse tree
	 */
	void exitCiteReferencesList(LaTEXParser.CiteReferencesListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#citeReference}.
	 * @param ctx the parse tree
	 */
	void enterCiteReference(LaTEXParser.CiteReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#citeReference}.
	 * @param ctx the parse tree
	 */
	void exitCiteReference(LaTEXParser.CiteReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#measures}.
	 * @param ctx the parse tree
	 */
	void enterMeasures(LaTEXParser.MeasuresContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#measures}.
	 * @param ctx the parse tree
	 */
	void exitMeasures(LaTEXParser.MeasuresContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#figureBlock}.
	 * @param ctx the parse tree
	 */
	void enterFigureBlock(LaTEXParser.FigureBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#figureBlock}.
	 * @param ctx the parse tree
	 */
	void exitFigureBlock(LaTEXParser.FigureBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#supplementaryFigureBlock}.
	 * @param ctx the parse tree
	 */
	void enterSupplementaryFigureBlock(LaTEXParser.SupplementaryFigureBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#supplementaryFigureBlock}.
	 * @param ctx the parse tree
	 */
	void exitSupplementaryFigureBlock(LaTEXParser.SupplementaryFigureBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#algorithmBlock}.
	 * @param ctx the parse tree
	 */
	void enterAlgorithmBlock(LaTEXParser.AlgorithmBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#algorithmBlock}.
	 * @param ctx the parse tree
	 */
	void exitAlgorithmBlock(LaTEXParser.AlgorithmBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#algorithmicBlock}.
	 * @param ctx the parse tree
	 */
	void enterAlgorithmicBlock(LaTEXParser.AlgorithmicBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#algorithmicBlock}.
	 * @param ctx the parse tree
	 */
	void exitAlgorithmicBlock(LaTEXParser.AlgorithmicBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(LaTEXParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(LaTEXParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(LaTEXParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(LaTEXParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(LaTEXParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(LaTEXParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void enterForBlock(LaTEXParser.ForBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void exitForBlock(LaTEXParser.ForBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(LaTEXParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(LaTEXParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#returnBlock}.
	 * @param ctx the parse tree
	 */
	void enterReturnBlock(LaTEXParser.ReturnBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#returnBlock}.
	 * @param ctx the parse tree
	 */
	void exitReturnBlock(LaTEXParser.ReturnBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#url}.
	 * @param ctx the parse tree
	 */
	void enterUrl(LaTEXParser.UrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#url}.
	 * @param ctx the parse tree
	 */
	void exitUrl(LaTEXParser.UrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#urlText}.
	 * @param ctx the parse tree
	 */
	void enterUrlText(LaTEXParser.UrlTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#urlText}.
	 * @param ctx the parse tree
	 */
	void exitUrlText(LaTEXParser.UrlTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#options}.
	 * @param ctx the parse tree
	 */
	void enterOptions(LaTEXParser.OptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#options}.
	 * @param ctx the parse tree
	 */
	void exitOptions(LaTEXParser.OptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#comma}.
	 * @param ctx the parse tree
	 */
	void enterComma(LaTEXParser.CommaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#comma}.
	 * @param ctx the parse tree
	 */
	void exitComma(LaTEXParser.CommaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#dot}.
	 * @param ctx the parse tree
	 */
	void enterDot(LaTEXParser.DotContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#dot}.
	 * @param ctx the parse tree
	 */
	void exitDot(LaTEXParser.DotContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#dots}.
	 * @param ctx the parse tree
	 */
	void enterDots(LaTEXParser.DotsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#dots}.
	 * @param ctx the parse tree
	 */
	void exitDots(LaTEXParser.DotsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#lparen}.
	 * @param ctx the parse tree
	 */
	void enterLparen(LaTEXParser.LparenContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#lparen}.
	 * @param ctx the parse tree
	 */
	void exitLparen(LaTEXParser.LparenContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#rparen}.
	 * @param ctx the parse tree
	 */
	void enterRparen(LaTEXParser.RparenContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#rparen}.
	 * @param ctx the parse tree
	 */
	void exitRparen(LaTEXParser.RparenContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#dollarBlock}.
	 * @param ctx the parse tree
	 */
	void enterDollarBlock(LaTEXParser.DollarBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#dollarBlock}.
	 * @param ctx the parse tree
	 */
	void exitDollarBlock(LaTEXParser.DollarBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#inlineEquation}.
	 * @param ctx the parse tree
	 */
	void enterInlineEquation(LaTEXParser.InlineEquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#inlineEquation}.
	 * @param ctx the parse tree
	 */
	void exitInlineEquation(LaTEXParser.InlineEquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#equationBlock}.
	 * @param ctx the parse tree
	 */
	void enterEquationBlock(LaTEXParser.EquationBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#equationBlock}.
	 * @param ctx the parse tree
	 */
	void exitEquationBlock(LaTEXParser.EquationBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#displayEquation}.
	 * @param ctx the parse tree
	 */
	void enterDisplayEquation(LaTEXParser.DisplayEquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#displayEquation}.
	 * @param ctx the parse tree
	 */
	void exitDisplayEquation(LaTEXParser.DisplayEquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#eqnArray}.
	 * @param ctx the parse tree
	 */
	void enterEqnArray(LaTEXParser.EqnArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#eqnArray}.
	 * @param ctx the parse tree
	 */
	void exitEqnArray(LaTEXParser.EqnArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#eqnArrayBody}.
	 * @param ctx the parse tree
	 */
	void enterEqnArrayBody(LaTEXParser.EqnArrayBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#eqnArrayBody}.
	 * @param ctx the parse tree
	 */
	void exitEqnArrayBody(LaTEXParser.EqnArrayBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#eqnEquation}.
	 * @param ctx the parse tree
	 */
	void enterEqnEquation(LaTEXParser.EqnEquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#eqnEquation}.
	 * @param ctx the parse tree
	 */
	void exitEqnEquation(LaTEXParser.EqnEquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#newLine}.
	 * @param ctx the parse tree
	 */
	void enterNewLine(LaTEXParser.NewLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#newLine}.
	 * @param ctx the parse tree
	 */
	void exitNewLine(LaTEXParser.NewLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#doubleSlash}.
	 * @param ctx the parse tree
	 */
	void enterDoubleSlash(LaTEXParser.DoubleSlashContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#doubleSlash}.
	 * @param ctx the parse tree
	 */
	void exitDoubleSlash(LaTEXParser.DoubleSlashContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(LaTEXParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(LaTEXParser.ReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#href}.
	 * @param ctx the parse tree
	 */
	void enterHref(LaTEXParser.HrefContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#href}.
	 * @param ctx the parse tree
	 */
	void exitHref(LaTEXParser.HrefContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#hrefUrl}.
	 * @param ctx the parse tree
	 */
	void enterHrefUrl(LaTEXParser.HrefUrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#hrefUrl}.
	 * @param ctx the parse tree
	 */
	void exitHrefUrl(LaTEXParser.HrefUrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#hrefName}.
	 * @param ctx the parse tree
	 */
	void enterHrefName(LaTEXParser.HrefNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#hrefName}.
	 * @param ctx the parse tree
	 */
	void exitHrefName(LaTEXParser.HrefNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#simpleText}.
	 * @param ctx the parse tree
	 */
	void enterSimpleText(LaTEXParser.SimpleTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#simpleText}.
	 * @param ctx the parse tree
	 */
	void exitSimpleText(LaTEXParser.SimpleTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(LaTEXParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(LaTEXParser.IntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#numbers}.
	 * @param ctx the parse tree
	 */
	void enterNumbers(LaTEXParser.NumbersContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#numbers}.
	 * @param ctx the parse tree
	 */
	void exitNumbers(LaTEXParser.NumbersContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#arabic}.
	 * @param ctx the parse tree
	 */
	void enterArabic(LaTEXParser.ArabicContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#arabic}.
	 * @param ctx the parse tree
	 */
	void exitArabic(LaTEXParser.ArabicContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#ifThenElse}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElse(LaTEXParser.IfThenElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#ifThenElse}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElse(LaTEXParser.IfThenElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#ifThenText}.
	 * @param ctx the parse tree
	 */
	void enterIfThenText(LaTEXParser.IfThenTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#ifThenText}.
	 * @param ctx the parse tree
	 */
	void exitIfThenText(LaTEXParser.IfThenTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#isoEnt}.
	 * @param ctx the parse tree
	 */
	void enterIsoEnt(LaTEXParser.IsoEntContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#isoEnt}.
	 * @param ctx the parse tree
	 */
	void exitIsoEnt(LaTEXParser.IsoEntContext ctx);
}