// Generated from D:/Charlesworth/LaTEX/src/com/kutsyk/grammar/LaTEX\LaTEX.g4 by ANTLR 4.5
package com.kutsyk.grammar.LaTEX;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LaTEXParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LaTEXVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(@NotNull LaTEXParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#documentDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocumentDeclaration(@NotNull LaTEXParser.DocumentDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#documentBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocumentBody(@NotNull LaTEXParser.DocumentBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#frontPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrontPart(@NotNull LaTEXParser.FrontPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#frontBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrontBody(@NotNull LaTEXParser.FrontBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#mainTitle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainTitle(@NotNull LaTEXParser.MainTitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#authorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuthorList(@NotNull LaTEXParser.AuthorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#author}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuthor(@NotNull LaTEXParser.AuthorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#textsuperscriptBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextsuperscriptBlock(@NotNull LaTEXParser.TextsuperscriptBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#authorName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuthorName(@NotNull LaTEXParser.AuthorNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#address}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddress(@NotNull LaTEXParser.AddressContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#bodyPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyPart(@NotNull LaTEXParser.BodyPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#memberList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberList(@NotNull LaTEXParser.MemberListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember(@NotNull LaTEXParser.MemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#landScapeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLandScapeBlock(@NotNull LaTEXParser.LandScapeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#textRules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextRules(@NotNull LaTEXParser.TextRulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#textSymbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextSymbols(@NotNull LaTEXParser.TextSymbolsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#paragraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParagraph(@NotNull LaTEXParser.ParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(@NotNull LaTEXParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#textBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextBody(@NotNull LaTEXParser.TextBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#textSC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextSC(@NotNull LaTEXParser.TextSCContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(@NotNull LaTEXParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#boxBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoxBlock(@NotNull LaTEXParser.BoxBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#abstractBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractBlock(@NotNull LaTEXParser.AbstractBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitle(@NotNull LaTEXParser.TitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#newcommandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewcommandDeclaration(@NotNull LaTEXParser.NewcommandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#commandBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandBody(@NotNull LaTEXParser.CommandBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#renewcommandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenewcommandDeclaration(@NotNull LaTEXParser.RenewcommandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#identificator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificator(@NotNull LaTEXParser.IdentificatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull LaTEXParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#multicolsBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulticolsBlock(@NotNull LaTEXParser.MulticolsBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(@NotNull LaTEXParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItems(@NotNull LaTEXParser.ItemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem(@NotNull LaTEXParser.ItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#descriptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescriptionList(@NotNull LaTEXParser.DescriptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#descriptionItems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescriptionItems(@NotNull LaTEXParser.DescriptionItemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#descriptionItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescriptionItem(@NotNull LaTEXParser.DescriptionItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#descriptionTitle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescriptionTitle(@NotNull LaTEXParser.DescriptionTitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#captionBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaptionBlock(@NotNull LaTEXParser.CaptionBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(@NotNull LaTEXParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#tableCaption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableCaption(@NotNull LaTEXParser.TableCaptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#tabular}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTabular(@NotNull LaTEXParser.TabularContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#tableSkipBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableSkipBlock(@NotNull LaTEXParser.TableSkipBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#tableDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableDefinition(@NotNull LaTEXParser.TableDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#multicolumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulticolumn(@NotNull LaTEXParser.MulticolumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#tableRow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableRow(@NotNull LaTEXParser.TableRowContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#tableCell}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableCell(@NotNull LaTEXParser.TableCellContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#texttypeDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTexttypeDeclarator(@NotNull LaTEXParser.TexttypeDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#ttStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTtStyle(@NotNull LaTEXParser.TtStyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#boldTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoldTypeDeclaration(@NotNull LaTEXParser.BoldTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#smallcapsDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmallcapsDeclaration(@NotNull LaTEXParser.SmallcapsDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#italictypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItalictypeDeclaration(@NotNull LaTEXParser.ItalictypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#italicBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItalicBlock(@NotNull LaTEXParser.ItalicBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#italicOutBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItalicOutBlock(@NotNull LaTEXParser.ItalicOutBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#textformatingBlockFlushLeft}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextformatingBlockFlushLeft(@NotNull LaTEXParser.TextformatingBlockFlushLeftContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#textformatingBlockCenter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextformatingBlockCenter(@NotNull LaTEXParser.TextformatingBlockCenterContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#sectionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSectionDeclaration(@NotNull LaTEXParser.SectionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#subsectionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubsectionDeclaration(@NotNull LaTEXParser.SubsectionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#subsubsectionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubsubsectionDeclaration(@NotNull LaTEXParser.SubsubsectionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#citeReferences}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiteReferences(@NotNull LaTEXParser.CiteReferencesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#citeReferencesList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiteReferencesList(@NotNull LaTEXParser.CiteReferencesListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#citeReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiteReference(@NotNull LaTEXParser.CiteReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#measures}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeasures(@NotNull LaTEXParser.MeasuresContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#figureBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFigureBlock(@NotNull LaTEXParser.FigureBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#supplementaryFigureBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupplementaryFigureBlock(@NotNull LaTEXParser.SupplementaryFigureBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#algorithmBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgorithmBlock(@NotNull LaTEXParser.AlgorithmBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#algorithmicBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgorithmicBlock(@NotNull LaTEXParser.AlgorithmicBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(@NotNull LaTEXParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(@NotNull LaTEXParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState(@NotNull LaTEXParser.StateContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#forBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForBlock(@NotNull LaTEXParser.ForBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(@NotNull LaTEXParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#returnBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnBlock(@NotNull LaTEXParser.ReturnBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#url}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrl(@NotNull LaTEXParser.UrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#urlText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrlText(@NotNull LaTEXParser.UrlTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptions(@NotNull LaTEXParser.OptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#comma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma(@NotNull LaTEXParser.CommaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#dot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot(@NotNull LaTEXParser.DotContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#dots}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDots(@NotNull LaTEXParser.DotsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#appos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppos(@NotNull LaTEXParser.ApposContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#lparen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLparen(@NotNull LaTEXParser.LparenContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#rparen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRparen(@NotNull LaTEXParser.RparenContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#dollarBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDollarBlock(@NotNull LaTEXParser.DollarBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#inlineEquation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineEquation(@NotNull LaTEXParser.InlineEquationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#equationBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquationBlock(@NotNull LaTEXParser.EquationBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#displayEquation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplayEquation(@NotNull LaTEXParser.DisplayEquationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#eqnArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqnArray(@NotNull LaTEXParser.EqnArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#eqnArrayBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqnArrayBody(@NotNull LaTEXParser.EqnArrayBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#eqnEquation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqnEquation(@NotNull LaTEXParser.EqnEquationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#newLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewLine(@NotNull LaTEXParser.NewLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#doubleSlash}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleSlash(@NotNull LaTEXParser.DoubleSlashContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference(@NotNull LaTEXParser.ReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#simpleText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleText(@NotNull LaTEXParser.SimpleTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval(@NotNull LaTEXParser.IntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#numbers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumbers(@NotNull LaTEXParser.NumbersContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#arabic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArabic(@NotNull LaTEXParser.ArabicContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#specialCharacters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialCharacters(@NotNull LaTEXParser.SpecialCharactersContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#ifThenElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElse(@NotNull LaTEXParser.IfThenElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTEXParser#ifThenText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenText(@NotNull LaTEXParser.IfThenTextContext ctx);
}