// Generated from LaTEX.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LaTEXParser}.
 */
public interface LaTEXListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LaTEXParser#references}.
	 * @param ctx the parse tree
	 */
	void enterReferences(@NotNull LaTEXParser.ReferencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#references}.
	 * @param ctx the parse tree
	 */
	void exitReferences(@NotNull LaTEXParser.ReferencesContext ctx);

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
	 * Enter a parse tree produced by {@link LaTEXParser#referencesList}.
	 * @param ctx the parse tree
	 */
	void enterReferencesList(@NotNull LaTEXParser.ReferencesListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#referencesList}.
	 * @param ctx the parse tree
	 */
	void exitReferencesList(@NotNull LaTEXParser.ReferencesListContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#tableLines}.
	 * @param ctx the parse tree
	 */
	void enterTableLines(@NotNull LaTEXParser.TableLinesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#tableLines}.
	 * @param ctx the parse tree
	 */
	void exitTableLines(@NotNull LaTEXParser.TableLinesContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#italicTextDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterItalicTextDeclaration(@NotNull LaTEXParser.ItalicTextDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#italicTextDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitItalicTextDeclaration(@NotNull LaTEXParser.ItalicTextDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#tableLine}.
	 * @param ctx the parse tree
	 */
	void enterTableLine(@NotNull LaTEXParser.TableLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#tableLine}.
	 * @param ctx the parse tree
	 */
	void exitTableLine(@NotNull LaTEXParser.TableLineContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#captionDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterCaptionDeclarator(@NotNull LaTEXParser.CaptionDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#captionDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitCaptionDeclarator(@NotNull LaTEXParser.CaptionDeclaratorContext ctx);

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
	 * Enter a parse tree produced by {@link LaTEXParser#tableBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTableBodyDeclaration(@NotNull LaTEXParser.TableBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#tableBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTableBodyDeclaration(@NotNull LaTEXParser.TableBodyDeclarationContext ctx);

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
	 * Enter a parse tree produced by {@link LaTEXParser#mathFormula}.
	 * @param ctx the parse tree
	 */
	void enterMathFormula(@NotNull LaTEXParser.MathFormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#mathFormula}.
	 * @param ctx the parse tree
	 */
	void exitMathFormula(@NotNull LaTEXParser.MathFormulaContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#newTableLine}.
	 * @param ctx the parse tree
	 */
	void enterNewTableLine(@NotNull LaTEXParser.NewTableLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#newTableLine}.
	 * @param ctx the parse tree
	 */
	void exitNewTableLine(@NotNull LaTEXParser.NewTableLineContext ctx);

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
	 * Enter a parse tree produced by {@link LaTEXParser#rightBrace}.
	 * @param ctx the parse tree
	 */
	void enterRightBrace(@NotNull LaTEXParser.RightBraceContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#rightBrace}.
	 * @param ctx the parse tree
	 */
	void exitRightBrace(@NotNull LaTEXParser.RightBraceContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#tableOptions}.
	 * @param ctx the parse tree
	 */
	void enterTableOptions(@NotNull LaTEXParser.TableOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#tableOptions}.
	 * @param ctx the parse tree
	 */
	void exitTableOptions(@NotNull LaTEXParser.TableOptionsContext ctx);

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
	 * Enter a parse tree produced by {@link LaTEXParser#mathSymbols}.
	 * @param ctx the parse tree
	 */
	void enterMathSymbols(@NotNull LaTEXParser.MathSymbolsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#mathSymbols}.
	 * @param ctx the parse tree
	 */
	void exitMathSymbols(@NotNull LaTEXParser.MathSymbolsContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#documentBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDocumentBodyDeclaration(@NotNull LaTEXParser.DocumentBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#documentBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDocumentBodyDeclaration(@NotNull LaTEXParser.DocumentBodyDeclarationContext ctx);

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
	 * Enter a parse tree produced by {@link LaTEXParser#bibliography}.
	 * @param ctx the parse tree
	 */
	void enterBibliography(@NotNull LaTEXParser.BibliographyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#bibliography}.
	 * @param ctx the parse tree
	 */
	void exitBibliography(@NotNull LaTEXParser.BibliographyContext ctx);

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
	 * Enter a parse tree produced by {@link LaTEXParser#leftBrace}.
	 * @param ctx the parse tree
	 */
	void enterLeftBrace(@NotNull LaTEXParser.LeftBraceContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#leftBrace}.
	 * @param ctx the parse tree
	 */
	void exitLeftBrace(@NotNull LaTEXParser.LeftBraceContext ctx);

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
	 * Enter a parse tree produced by {@link LaTEXParser#tableColumn}.
	 * @param ctx the parse tree
	 */
	void enterTableColumn(@NotNull LaTEXParser.TableColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#tableColumn}.
	 * @param ctx the parse tree
	 */
	void exitTableColumn(@NotNull LaTEXParser.TableColumnContext ctx);

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
	 * Enter a parse tree produced by {@link LaTEXParser#italicDollar}.
	 * @param ctx the parse tree
	 */
	void enterItalicDollar(@NotNull LaTEXParser.ItalicDollarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#italicDollar}.
	 * @param ctx the parse tree
	 */
	void exitItalicDollar(@NotNull LaTEXParser.ItalicDollarContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#tableColumns}.
	 * @param ctx the parse tree
	 */
	void enterTableColumns(@NotNull LaTEXParser.TableColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#tableColumns}.
	 * @param ctx the parse tree
	 */
	void exitTableColumns(@NotNull LaTEXParser.TableColumnsContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#textformatingBlock}.
	 * @param ctx the parse tree
	 */
	void enterTextformatingBlock(@NotNull LaTEXParser.TextformatingBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#textformatingBlock}.
	 * @param ctx the parse tree
	 */
	void exitTextformatingBlock(@NotNull LaTEXParser.TextformatingBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#upperHead}.
	 * @param ctx the parse tree
	 */
	void enterUpperHead(@NotNull LaTEXParser.UpperHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#upperHead}.
	 * @param ctx the parse tree
	 */
	void exitUpperHead(@NotNull LaTEXParser.UpperHeadContext ctx);

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
	 * Enter a parse tree produced by {@link LaTEXParser#hyphen}.
	 * @param ctx the parse tree
	 */
	void enterHyphen(@NotNull LaTEXParser.HyphenContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#hyphen}.
	 * @param ctx the parse tree
	 */
	void exitHyphen(@NotNull LaTEXParser.HyphenContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#apostrophe}.
	 * @param ctx the parse tree
	 */
	void enterApostrophe(@NotNull LaTEXParser.ApostropheContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#apostrophe}.
	 * @param ctx the parse tree
	 */
	void exitApostrophe(@NotNull LaTEXParser.ApostropheContext ctx);

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
	 * Enter a parse tree produced by {@link LaTEXParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterFormula(@NotNull LaTEXParser.FormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitFormula(@NotNull LaTEXParser.FormulaContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaTEXParser#itemList}.
	 * @param ctx the parse tree
	 */
	void enterItemList(@NotNull LaTEXParser.ItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTEXParser#itemList}.
	 * @param ctx the parse tree
	 */
	void exitItemList(@NotNull LaTEXParser.ItemListContext ctx);
}