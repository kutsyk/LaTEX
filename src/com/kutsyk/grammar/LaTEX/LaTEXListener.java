// Generated from D:/Charlesworth/LaTEX/src/com/kutsyk/grammar/LaTEX\LaTEX.g4 by ANTLR 4.5
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
	void enterCompilationUnit(@NotNull LaTEXParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(@NotNull LaTEXParser.CompilationUnitContext ctx);
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
	 * Enter a parse tree produced by {@link LaTEXParser#frontPart}.
	 * @param ctx the parse tree
	 */
	void enterFrontPart(@NotNull LaTEXParser.FrontPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#frontPart}.
	 * @param ctx the parse tree
	 */
	void exitFrontPart(@NotNull LaTEXParser.FrontPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#frontBody}.
	 * @param ctx the parse tree
	 */
	void enterFrontBody(@NotNull LaTEXParser.FrontBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#frontBody}.
	 * @param ctx the parse tree
	 */
	void exitFrontBody(@NotNull LaTEXParser.FrontBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#mainTitle}.
	 * @param ctx the parse tree
	 */
	void enterMainTitle(@NotNull LaTEXParser.MainTitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#mainTitle}.
	 * @param ctx the parse tree
	 */
	void exitMainTitle(@NotNull LaTEXParser.MainTitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#authorList}.
	 * @param ctx the parse tree
	 */
	void enterAuthorList(@NotNull LaTEXParser.AuthorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#authorList}.
	 * @param ctx the parse tree
	 */
	void exitAuthorList(@NotNull LaTEXParser.AuthorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#author}.
	 * @param ctx the parse tree
	 */
	void enterAuthor(@NotNull LaTEXParser.AuthorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#author}.
	 * @param ctx the parse tree
	 */
	void exitAuthor(@NotNull LaTEXParser.AuthorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#textsuperscriptBlock}.
	 * @param ctx the parse tree
	 */
	void enterTextsuperscriptBlock(@NotNull LaTEXParser.TextsuperscriptBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#textsuperscriptBlock}.
	 * @param ctx the parse tree
	 */
	void exitTextsuperscriptBlock(@NotNull LaTEXParser.TextsuperscriptBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#authorName}.
	 * @param ctx the parse tree
	 */
	void enterAuthorName(@NotNull LaTEXParser.AuthorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#authorName}.
	 * @param ctx the parse tree
	 */
	void exitAuthorName(@NotNull LaTEXParser.AuthorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#address}.
	 * @param ctx the parse tree
	 */
	void enterAddress(@NotNull LaTEXParser.AddressContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#address}.
	 * @param ctx the parse tree
	 */
	void exitAddress(@NotNull LaTEXParser.AddressContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#bodyPart}.
	 * @param ctx the parse tree
	 */
	void enterBodyPart(@NotNull LaTEXParser.BodyPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#bodyPart}.
	 * @param ctx the parse tree
	 */
	void exitBodyPart(@NotNull LaTEXParser.BodyPartContext ctx);
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
	 * Enter a parse tree produced by {@link LaTEXParser#tableCaption}.
	 * @param ctx the parse tree
	 */
	void enterTableCaption(@NotNull LaTEXParser.TableCaptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#tableCaption}.
	 * @param ctx the parse tree
	 */
	void exitTableCaption(@NotNull LaTEXParser.TableCaptionContext ctx);
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
	 * Enter a parse tree produced by {@link LaTEXParser#tableSkipBlock}.
	 * @param ctx the parse tree
	 */
	void enterTableSkipBlock(@NotNull LaTEXParser.TableSkipBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#tableSkipBlock}.
	 * @param ctx the parse tree
	 */
	void exitTableSkipBlock(@NotNull LaTEXParser.TableSkipBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#tableDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTableDefinition(@NotNull LaTEXParser.TableDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#tableDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTableDefinition(@NotNull LaTEXParser.TableDefinitionContext ctx);
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
	 * Enter a parse tree produced by {@link LaTEXParser#tableCell}.
	 * @param ctx the parse tree
	 */
	void enterTableCell(@NotNull LaTEXParser.TableCellContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#tableCell}.
	 * @param ctx the parse tree
	 */
	void exitTableCell(@NotNull LaTEXParser.TableCellContext ctx);
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
	 * Enter a parse tree produced by {@link LaTEXParser#inlineEquation}.
	 * @param ctx the parse tree
	 */
	void enterInlineEquation(@NotNull LaTEXParser.InlineEquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#inlineEquation}.
	 * @param ctx the parse tree
	 */
	void exitInlineEquation(@NotNull LaTEXParser.InlineEquationContext ctx);
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
	 * Enter a parse tree produced by {@link LaTEXParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(@NotNull LaTEXParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(@NotNull LaTEXParser.ReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#href}.
	 * @param ctx the parse tree
	 */
	void enterHref(@NotNull LaTEXParser.HrefContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#href}.
	 * @param ctx the parse tree
	 */
	void exitHref(@NotNull LaTEXParser.HrefContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#hrefUrl}.
	 * @param ctx the parse tree
	 */
	void enterHrefUrl(@NotNull LaTEXParser.HrefUrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#hrefUrl}.
	 * @param ctx the parse tree
	 */
	void exitHrefUrl(@NotNull LaTEXParser.HrefUrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#hrefName}.
	 * @param ctx the parse tree
	 */
	void enterHrefName(@NotNull LaTEXParser.HrefNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#hrefName}.
	 * @param ctx the parse tree
	 */
	void exitHrefName(@NotNull LaTEXParser.HrefNameContext ctx);
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
	 * Enter a parse tree produced by {@link LaTEXParser#isoEnt}.
	 * @param ctx the parse tree
	 */
	void enterIsoEnt(@NotNull LaTEXParser.IsoEntContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#isoEnt}.
	 * @param ctx the parse tree
	 */
	void exitIsoEnt(@NotNull LaTEXParser.IsoEntContext ctx);
}