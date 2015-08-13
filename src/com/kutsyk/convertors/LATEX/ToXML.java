package com.kutsyk.convertors.LATEX;

import com.kutsyk.convertors.Translator;
import com.kutsyk.grammar.LaTEX.*;
import com.kutsyk.windows.MainWindow;
import net.sourceforge.jeuclid.MathMLParserSupport;
import net.sourceforge.jeuclid.MutableLayoutContext;
import net.sourceforge.jeuclid.context.LayoutContextImpl;
import net.sourceforge.jeuclid.context.Parameter;
import net.sourceforge.jeuclid.converter.Converter;
import org.antlr.v4.runtime.misc.NotNull;
import org.w3c.dom.Document;
import uk.ac.ed.ph.snuggletex.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

// TODO: Auto-generated Javadoc

/*
 *  @author Kutsyk Vasyl
 * The Class ToXML.
 */
public class ToXML extends LaTEXBaseListener {

    /**
     * The writer.
     */
    public static PrintWriter writer;

    /**
     * The section counter.
     */
    private int sectionCounter;

    /**
     * The section id.
     */
    private int sectionId;

    /**
     * The subsection counter.
     */
    private int subsectionCounter;

    /**
     * The subsubsection counter.
     */
    private int subsubsectionCounter;

    /**
     * The was section counter.
     */
    private int wasSectionCounter;

    /**
     * The figure counter.
     */
    private int figureCounter;

    /**
     * The figure number.
     */
    private int figureNumber;

    private boolean figureDeclared;
    private boolean listDeclared;
    private boolean tableDeclared;

    /**
     * The was figure first dot.
     */
    private boolean wasFigureFirstDot;
    /**
     * The new command name.
     */
    private String newCommandName;

    /**
     * The author reference.
     */
    private boolean authorReference;

    /**
     * The was section declared.
     */
    private boolean wasSectionDeclared;

    /**
     * The was acknowledgement.
     */
    private boolean wasAcknowledgement;

    /**
     * The should text be missed.
     */
    private boolean shouldTextBeMissed;

    /**
     * The skip level.
     */
    private int skipLevel;

    /**
     * The paragraph counter.
     */
    private int paragraphCounter;

    /**
     * The was paragraph filled.
     */
    private boolean wasParagraphFilled;

    /**
     * The was space between lines filled.
     */
    private boolean wasSpaceBetweenLinesFilled;

    /**
     * The is paragraph active.
     */
    private boolean isParagraphActive;

    /**
     * The new line counter.
     */
    private int newLineCounter;

    /**
     * The list counter.
     */
    private int listCounter;

    /**
     * The item counter.
     */
    private int itemCounter;

    /**
     * The was previous line word.
     */
    private boolean wasPreviousLineWord;

    /**
     * The bibliography declared.
     */
    private boolean bibliographyDeclared;

    /**
     * The app counter.
     */
    private int appCounter;

    /**
     * The was apps declared.
     */
    private boolean wasAppsDeclared;

    /**
     * The writing queue.
     */
    private static ArrayList<String> writingQueue;

    /**
     * The was algorithm declared.
     */
    private boolean wasAlgorithmDeclared;

    private int algorithmCounter;

    private int equationCounter;
    private boolean wasAbstractDeclared = false;


    /**
     * Instantiates a new to xml.
     *
     * @param writer the file into which we will write all xml
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public ToXML(PrintWriter writer) throws IOException {
        this.writer = writer;
        paragraphCounter = 1;
    }

    @Override
    public void enterFrontBody(@NotNull LaTEXParser.FrontBodyContext ctx) {
        writer.println("<front><article-meta>");
    }

    @Override
    public void enterMainTitle(@NotNull LaTEXParser.MainTitleContext ctx) {
        writer.println("<title-group>");
        writer.println("<article-title>");
    }

    @Override
    public void exitMainTitle(@NotNull LaTEXParser.MainTitleContext ctx) {
        writer.println("</article-title>");
        writer.println("</title-group>");
    }

    @Override
    public void enterAuthorList(@NotNull LaTEXParser.AuthorListContext ctx) {
        writer.println("<contrib-group>");
    }

    @Override
    public void exitAuthorList(@NotNull LaTEXParser.AuthorListContext ctx) {
        writer.println("</contrib-group>");
    }

    @Override
    public void enterAuthor(@NotNull LaTEXParser.AuthorContext ctx) {
        writer.println("<contrib contrib-type=\"author\">");
    }

    @Override
    public void exitAuthor(@NotNull LaTEXParser.AuthorContext ctx) {
        writer.println("</contrib>");
    }

    @Override
    public void enterAddress(@NotNull LaTEXParser.AddressContext ctx) {
        writer.println("<aff>");
    }

    @Override
    public void exitAddress(@NotNull LaTEXParser.AddressContext ctx) {
        writer.println("</aff>");
    }

    public void enterSimpleText(LaTEXParser.SimpleTextContext ctx) {
        if (shouldTextBeMissed)
            return;

        if (ctx.getText().startsWith("\\"))
            return;

        String line = ctx.getText();
        paragraphInserter();                        //Inserts paragraph if needed

        if (figureDeclared && !figureTitleDeclared) {
            writer.print("<emph type=\"bold\">");
            writer.print("Figure " + figureCounter + ". ");
            figureTitleDeclared = true;
        }

        if (line.contains("supplementary") || line.contains("Supplementary"))
            line = cutOutSupplementaryLinks(line);

        if (wasPreviousLineWord)
            writer.print(' ');

        writer.print(line);
        wasPreviousLineWord = true;
    }


    public void exitTextRules(LaTEXParser.TextRulesContext ctx) {
        wasPreviousLineWord = false;
    }

    /**
     * Cut out supplementary links.
     *
     * @param line the line
     * @return the string
     */
    private String cutOutSupplementaryLinks(String line) {
        line = line.replaceAll("supplementary", "S");
        line = line.replaceAll("Supplementary", "S");
        return line;
    }

    /**
     * Paragraph inserter.
     */
    private void paragraphInserter() {
        if (figureDeclared || listDeclared || tableDeclared) {
            paragraphCounter = 0;
            wasParagraphFilled = false;
            return;
        }
        if (shouldTextBeMissed || bibliographyDeclared)
            return;

        if (wasSectionDeclared)
            wasParagraphFilled = true;


        if (isParagraphActive)
            newLineCounter = 0;

        if (wasParagraphFilled && !isParagraphActive)
            paragraphStarter();
    }

	/* (non-Javadoc)
     * @see LaTEXBaseListener#enterTextRules(LaTEXParser.TextRulesContext)
	 */

    public void enterTextRules(LaTEXParser.TextRulesContext ctx) {
        if (shouldTextBeMissed)
            return;
    }

	/* (non-Javadoc)
     * @see LaTEXBaseListener#enterTextSymbols(LaTEXParser.TextSymbolsContext)
	 */

    public void enterTextSymbols(LaTEXParser.TextSymbolsContext ctx) {
        if (shouldTextBeMissed)
            return;
        wasPreviousLineWord = false;
    }

	/* (non-Javadoc)
     * @see LaTEXBaseListener#enterText(LaTEXParser.TextContext)
	 */

    public void enterText(LaTEXParser.TextContext ctx) {
        if (isParagraphActive)
            newLineCounter = 0;
    }

	/* (non-Javadoc)
     * @see LaTEXBaseListener#enterTitle(LaTEXParser.TitleContext)
	 */

    public void enterTitle(LaTEXParser.TitleContext ctx) {
        shouldTextBeMissed = true;
    }

	/* (non-Javadoc)
     * @see LaTEXBaseListener#exitTitle(LaTEXParser.TitleContext)
	 */

    public void exitTitle(LaTEXParser.TitleContext ctx) {
        shouldTextBeMissed = false;
    }

    public void enterAbstractBlock(LaTEXParser.AbstractBlockContext ctx) {
        writer.print("<abstract>");
    }

    public void exitAbstractBlock(LaTEXParser.AbstractBlockContext ctx) {
        writer.print("</abstract></article-meta></front><body>");
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterParagraph(LaTEXParser.ParagraphContext)
	 */

    public void enterParagraph(LaTEXParser.ParagraphContext ctx) {
        if (wasParagraphFilled)
            paragraphCloser();

        while (subsubsectionCounter > 0) {
            writer.print("</section>");
            --subsubsectionCounter;
        }
        ++subsubsectionCounter;
        ++sectionId;
        writer.print("\n<section level=\"3\" id=\"section" + sectionId + "\">");
        writer.print("<title>");
        wasSectionDeclared = false;
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitParagraph(LaTEXParser.ParagraphContext)
	 */

    public void exitParagraph(LaTEXParser.ParagraphContext ctx) {
        writer.print("</title>");
        wasSectionDeclared = true;
    }

    private static final String abstractString = "abstract";
    private boolean abstractDone = false;

    public void enterSectionDeclaration(
            LaTEXParser.SectionDeclarationContext ctx) {

        String title = ctx.text().getText();
        shouldTextBeMissed = false;

        sectionCloser();

        String littleTitle = title.toLowerCase();
        wasAbstractDeclared = (littleTitle.length() == abstractString.length() ||
                littleTitle.length() == abstractString.length() + 1) && littleTitle.contains(abstractString);
        if (wasAbstractDeclared)
            abstractDone = true;

        shouldTextBeMissed = false;

        if (wasAbstractDeclared) {
            writer.append("<abstract>");
            writer.print("<title>");
            wasSectionDeclared = false;
            return;
        }

        if (littleTitle.equals("acknowledgements") || littleTitle.equals("acknowledgement")
                || littleTitle.equals("acknowledgments")) {
            wasAcknowledgement = true;
            wasAcknowledgement = true;
            writer.append("</body><back><acks><title>");
            wasSectionDeclared = false;
            return;
        }

        ++sectionId;
        ++sectionCounter;
        if (bibliographyDeclared)
            wasAppsDeclared = true;

        if (wasAppsDeclared) {
            if (appCounter == 1)
                writer.print("<apps>");
            writer.print("<app id=\"app" + (appCounter++) + "\">");
            writer.print("<title>");
            wasSectionDeclared = false;
            return;
        }

        ++sectionId;
        writer.print("<section id=\""+sectionId+"\">");

        writer.print("<title>");
        wasSectionDeclared = false;
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitSectionDeclaration(LaTEXParser.SectionDeclarationContext)
	 */

    public void exitSectionDeclaration(LaTEXParser.SectionDeclarationContext ctx) {
        if (shouldTextBeMissed)
            return;
        if (wasAppsDeclared) {
            writer.print("</title>");
            writer.print("\n<section level=\"1\" id=\"section" + sectionId
                    + "\">");
            wasSectionDeclared = true;
            shouldTextBeMissed = true;
            return;
        }
        writer.print("</title>");
        wasSectionDeclared = true;
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterSubsectionDeclaration(LaTEXParser.SubsectionDeclarationContext)
	 */

    public void enterSubsectionDeclaration(
            LaTEXParser.SubsectionDeclarationContext ctx) {
        if (wasAppsDeclared) {
            shouldTextBeMissed = true;
            return;
        }

        shouldTextBeMissed = false;

        if (wasParagraphFilled)
            paragraphCloser();

        while (subsectionCounter > 0) {
            writer.print("</section>");
            --subsectionCounter;
        }

        ++subsectionCounter;
        ++sectionId;
        writer.print("\n<section level=\"2\" id=\"section" + sectionId + "\">");
        writer.print("<title>");
        wasSectionDeclared = false;
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitSubsectionDeclaration(LaTEXParser.SubsectionDeclarationContext)
	 */

    public void exitSubsectionDeclaration(
            LaTEXParser.SubsectionDeclarationContext ctx) {
        if (wasAppsDeclared) {
            shouldTextBeMissed = false;
            return;
        }
        writer.print("</title>");
        wasSectionDeclared = true;
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterSubsubsectionDeclaration(LaTEXParser.SubsubsectionDeclarationContext)
	 */

    public void enterSubsubsectionDeclaration(
            LaTEXParser.SubsubsectionDeclarationContext ctx) {
        shouldTextBeMissed = false;
        if (wasParagraphFilled)
            paragraphCloser();

        wasSectionDeclared = false;
        while (subsubsectionCounter > 0) {
            writer.print("</section>");
            --subsubsectionCounter;
        }

        writer.print("\n<section level=\"3\" id=\"section" + sectionId + "\">");
        ++subsubsectionCounter;
        ++sectionId;
        writer.print("<title>");
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitSubsubsectionDeclaration(LaTEXParser.SubsubsectionDeclarationContext)
	 */

    public void exitSubsubsectionDeclaration(
            LaTEXParser.SubsubsectionDeclarationContext ctx) {
        writer.print("</title>");
        wasSectionDeclared = true;
    }

    /**
     * Section closer.
     */
    private void sectionCloser() {
        if (wasParagraphFilled)
            paragraphCloser();
        if (abstractDone) {
            writer.print("</abstract></article-meta></front><body>");
            abstractDone = false;
            return;
        }
        if (wasAcknowledgement) {
            writer.print("</acks>");
            wasAcknowledgement = false;
            return;
        }

        while ((sectionCounter - wasSectionCounter) > 0) {
            while (subsectionCounter > 0) {
                writer.print("</section>");
                --subsectionCounter;
            }

            while (subsubsectionCounter > 0) {
                writer.print("</section>");
                --subsubsectionCounter;
            }

            writer.print("</section>");
            ++wasSectionCounter;
        }

        if (wasAppsDeclared)
            writer.print("</app>");
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterCiteReferencesList(LaTEXParser.CiteReferencesListContext)
	 */

    public void enterCiteReferencesList(
            LaTEXParser.CiteReferencesListContext ctx) {
        citeReference(ctx);
        shouldTextBeMissed = true;
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitCiteReferences(LaTEXParser.CiteReferencesContext)
	 */

    public void exitCiteReferences(LaTEXParser.CiteReferencesContext ctx) {
        shouldTextBeMissed = false;
    }

    /**
     * Cite reference.
     *
     * @param ctx the ctx
     */
    private void citeReference(LaTEXParser.CiteReferencesListContext ctx) {
        int ctxSize = ctx.citeReference().size();
        ArrayList<Integer> sortedNumbers = new ArrayList<Integer>();

        int number = 0;
        for (int i = 0; i < ctxSize; ++i) {
            if (!Translator.bibReferences.containsKey(ctx.citeReference(i).getText()))
                number = -1;
            else
                number = Translator.bibReferences.get(ctx.citeReference(i).getText());
            sortedNumbers.add(number);
        }
        Collections.sort(sortedNumbers);

        int beginIndex = 0;
        for (int i = 0; i < sortedNumbers.size() - 2; ++i)
            if (sortedNumbers.get(i) + 1 == sortedNumbers.get(i + 1)
                    && sortedNumbers.get(i + 1) + 1 == sortedNumbers.get(i + 2)) {
                beginIndex = i;
                break;
            }

        int endIndex = 0;
        for (int i = sortedNumbers.size() - 1; i > 1; --i)
            if (sortedNumbers.get(i) - 1 == sortedNumbers.get(i - 1)
                    && sortedNumbers.get(i - 1) - 1 == sortedNumbers.get(i - 2)) {
                endIndex = i;
                break;
            }
        writer.print(" <citref rids=\"");

        for (int i = 0; i < sortedNumbers.size(); ++i) {
            number = sortedNumbers.get(i);
            if (i == (ctxSize - 1)) {
                writer.print("ref" + number);
                break;
            }

            writer.print("ref" + number + " ");
        }
        writer.print("\">");

        for (int i = 0; i < sortedNumbers.size(); ++i) {
            number = sortedNumbers.get(i);
            if ((beginIndex != endIndex) && i == beginIndex) {
                if(MainWindow.getUseIsoCharSymbolReplacign())
                    writer.print(number + "&ndash;");
                else writer.print(number + "-");
                i = endIndex - 1;
                continue;
            }

            if (i == (sortedNumbers.size() - 1))
                writer.print(number);
            else
                writer.print(number + ",");
        }
        writer.print("</citref>");
        shouldTextBeMissed = true;
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>Add <xref>.</p>
     */
    @Override
    public void enterReference(@NotNull LaTEXParser.ReferenceContext ctx) {
        writer.print("<xref>");
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>Add </xref>.</p>
     */
    @Override
    public void exitReference(@NotNull LaTEXParser.ReferenceContext ctx) {
        writer.print("</xref>");
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterItalictypeDeclaration(LaTEXParser.ItalictypeDeclarationContext)
	 */

    public void enterItalictypeDeclaration(
            LaTEXParser.ItalictypeDeclarationContext ctx) {
        paragraphInserter();
        if (shouldTextBeMissed)
            return;

        writer.print("<emph type=\"italic\">");
        wasPreviousLineWord = false;
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitItalictypeDeclaration(LaTEXParser.ItalictypeDeclarationContext)
	 */

    public void exitItalictypeDeclaration(
            LaTEXParser.ItalictypeDeclarationContext ctx) {
        if (shouldTextBeMissed)
            return;
        writer.print("</emph>");
    }

    /**
     * The figure title declared.
     */
    private boolean figureTitleDeclared = false;

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterBoldTypeDeclaration(LaTEXParser.BoldTypeDeclarationContext)
	 */

    public void enterBoldTypeDeclaration(
            LaTEXParser.BoldTypeDeclarationContext ctx) {
        paragraphInserter();
        writer.print("<emph type=\"bold\">");
//        if (figureDeclared)
//        {
//            shouldTextBeMissed = false;
//            figureTitleDeclared = true;
//        }
    }

    /**
     * Close the bold tag
     */

    public void exitBoldTypeDeclaration(
            LaTEXParser.BoldTypeDeclarationContext ctx) {
		/*
		 * We exit from this method when figure is declared,
		 * because it will close bold tag in the place where
		 * the first sentence of the figure will finish
		 */
//        if (figureDeclared)
//            return;

        writer.print("</emph>");
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterMeasures(LaTEXParser.MeasuresContext)
	 */

    public void enterMeasures(LaTEXParser.MeasuresContext ctx) {
        String[] tokens = ctx.getText().split(" ");
        writer.print("&emsp14;" + tokens[1]);
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterComma(LaTEXParser.CommaContext)
	 */

    public void enterComma(LaTEXParser.CommaContext ctx) {
        if (shouldTextBeMissed)
            return;

        writer.print(", ");
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterDot(LaTEXParser.DotContext)
	 */

    public void enterDot(LaTEXParser.DotContext ctx) {
        if (shouldTextBeMissed)
            return;

        writer.print('.');
        if (figureDeclared && !wasFigureFirstDot) {
            writer.print("</emph>");
            wasFigureFirstDot = true;
        }

        writer.print(' ');
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterNumbers(LaTEXParser.NumbersContext)
	 */

    public void enterNumbers(LaTEXParser.NumbersContext ctx) {
        writer.print(" ");
    }

    /* (non-Javadoc)
     * @see LaTEXBaseListener#enterDollarBlock(LaTEXParser.DollarBlockContext)
     */
    private int imageId;

    public void enterDollarBlock(LaTEXParser.DollarBlockContext ctx) {
        if (shouldTextBeMissed)
            return;

        if (authorReference)
            return;
        ++equationCounter;
        if (MainWindow.getFormulasType().equals("latex")) {
            writer.println("<equ id=\"equ" + equationCounter + "\" type=\"inline\">");
            writeFormula(ctx.getText());
            writer.println("</equ>");
        } else if (MainWindow.getFormulasType().equals("images")) {
            ++imageId;
            SnuggleEngine engine = new SnuggleEngine();
            SnuggleSession session = engine.createSession();

            /* Parse some LaTeX input */
            SnuggleInput input = new SnuggleInput(ctx.getText());
            try {
                session.parseInput(input);
            } catch (IOException e) {
                System.out.println("Parse error: ");
                e.printStackTrace();
                System.out.println("Parse error: ");
            }
            /* Specify how we want the resulting XML */
            XMLStringOutputOptions options = new XMLStringOutputOptions();
            options.setSerializationMethod(SerializationMethod.XHTML);
            options.setIndenting(true);
            options.setEncoding("UTF-8");
            options.setAddingMathSourceAnnotations(true);
            options.setUsingNamedEntities(true); /* (Only used if caller has an XSLT 2.0 processor) */

            /* Convert the results to an XML String, which in this case will
             * be a single MathML <math>...</math> element. */
            try {
                Document doc = MathMLParserSupport
                        .parseString(session.buildXMLString(options));
                String fileName = MainWindow.getFullPath().substring(MainWindow.getFullPath().lastIndexOf("\\") + 1, MainWindow.getFullPath().length() - 4);
                String folder = MainWindow.getFullPath().substring(0, MainWindow.getFullPath().lastIndexOf("\\")+1);
                File f = new File(folder+fileName+"\\");
                if(!f.exists())
                    f.mkdir();
                String path = folder+fileName+"\\"+fileName+"-formula-" + imageId + ".png";
                System.out.println("Folder: "+folder);
                System.out.println("P: "+path);
                File file = new File(path);
                MutableLayoutContext params = new LayoutContextImpl(
                        LayoutContextImpl.getDefaultLayoutContext());
                params.setParameter(Parameter.MATHSIZE, 25f);

                Converter.getInstance().convert(doc, file, "image/" + "png",
                        params);
                writer.print("<inline-graphic id=\"g" + imageId + "\" href=\"" + path + "\"/>");
            } catch (Exception e) {
                writer.println("<equ id=\"equ" + equationCounter + "\" type=\"inline\">");
                writeFormula(ctx.getText());
                writer.println("</equ>");
                e.printStackTrace();
                System.out.println("Parse error: ");
            }
        } else {
            /* Create vanilla SnuggleEngine and new SnuggleSession */
            SnuggleEngine engine = new SnuggleEngine();
            SnuggleSession session = engine.createSession();

            /* Parse some LaTeX input */
            SnuggleInput input = new SnuggleInput(ctx.getText());
            try {
                session.parseInput(input);
            } catch (IOException e) {
                writer.println("<equ id=\"equ" + equationCounter + "\" type=\"inline\">");
                writeFormula(ctx.getText());
                writer.println("</equ>");
                e.printStackTrace();
                System.out.println("Parse error: ");
                return;
            }
            /* Specify how we want the resulting XML */
            XMLStringOutputOptions options = new XMLStringOutputOptions();
            options.setSerializationMethod(SerializationMethod.XHTML);
            options.setIndenting(true);
            options.setEncoding("UTF-8");
            options.setAddingMathSourceAnnotations(true);
            options.setUsingNamedEntities(true); /* (Only used if caller has an XSLT 2.0 processor) */

            /* Convert the results to an XML String, which in this case will
             * be a single MathML <math>...</math> element. */
            writer.print(session.buildXMLString(options));
        }
    }

    public void enterEquationBlock(LaTEXParser.EquationBlockContext ctx) {
        if (authorReference)
            return;

        newLineCounter = 0;
        ++equationCounter;
        writer.println("<equ id=\"equ" + equationCounter + "\" type=\"inline\">");
        writeFormula(ctx.getText());
        writer.println("</equ>");
    }


    public void enterDisplayEquation(LaTEXParser.DisplayEquationContext ctx) {
        if (authorReference)
            return;

        newLineCounter = 0;
        ++equationCounter;
        writer.println("<equ id=\"equ" + equationCounter + "\" type=\"display\">");
        writeFormula(ctx.getText());
        writer.println("</equ>");
    }

    /**
     * Write formula.
     *
     * @param formula the formula
     */
    private void writeFormula(String formula) {
        writer.print("<tex>");
        writer.println("\n" + formula + "\n");
        writer.print("</tex>");
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterFigureBlock(LaTEXParser.FigureBlockContext)
	 */

    public void enterFigureBlock(LaTEXParser.FigureBlockContext ctx) {
        sectionCloser();

        figureStarts();
        writer.print("<fig id=\"fig" + figureCounter + "\" num=\""
                + figureCounter + "\"><caption>");
    }

    /**
     * Figure starts.
     */
    private void figureStarts() {
        figureCounter++;
        figureDeclared = true;
        figureTitleDeclared = false;
    }

    /* (non-Javadoc)
     * @see LaTEXBaseListener#exitFigureBlock(LaTEXParser.FigureBlockContext)
     */
    public void exitFigureBlock(LaTEXParser.FigureBlockContext ctx) {
        writer.println("</caption>");
        writer.println("</fig>");
        figureDeclared = false;
        wasFigureFirstDot = false;
        figureTitleDeclared = false;
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitNewcommandDeclaration(LaTEXParser.NewcommandDeclarationContext)
	 */

    public void exitNewcommandDeclaration(
            LaTEXParser.NewcommandDeclarationContext ctx) {
        shouldTextBeMissed = false;
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterRenewcommandDeclaration(LaTEXParser.RenewcommandDeclarationContext)
	 */

    public void enterRenewcommandDeclaration(
            LaTEXParser.RenewcommandDeclarationContext ctx) {
        shouldTextBeMissed = true;
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitRenewcommandDeclaration(LaTEXParser.RenewcommandDeclarationContext)
	 */

    public void exitRenewcommandDeclaration(
            LaTEXParser.RenewcommandDeclarationContext ctx) {
        shouldTextBeMissed = false;
    }

    public void enterTable(LaTEXParser.TableContext ctx) {
        sectionCloser();

        tableDeclared = true;
        writer.print("<tbl>");
    }

    public void exitTable(LaTEXParser.TableContext ctx) {
        writer.print("</tbl>");
        tableDeclared = false;
    }

    @Override
    public void enterLparen(@NotNull LaTEXParser.LparenContext ctx) {
        writer.print('(');
    }

    @Override
    public void enterRparen(@NotNull LaTEXParser.RparenContext ctx) {
        writer.print(')');
    }

    @Override
    public void enterIsoEnt(@NotNull LaTEXParser.IsoEntContext ctx) {
        if (shouldTextBeMissed)
            return;

        if (MainWindow.getUseIsoCharSymbolReplacign())
            writer.print(MainWindow.getIsoTrie().get(ctx.getText().toString()));
    }

    public void enterTableRow(LaTEXParser.TableRowContext ctx) {
        writer.print("<tr>");
    }

    public void exitTableRow(LaTEXParser.TableRowContext ctx) {
        writer.print("</tr>");
    }

    public void enterTableCell(LaTEXParser.TableCellContext ctx) {
        writer.print("<td>");
    }

    public void exitTableCell(LaTEXParser.TableCellContext ctx) {
        writer.print("</td>");
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitCaptionBlock(LaTEXParser.CaptionBlockContext)
	 */

    public void exitCaptionBlock(LaTEXParser.CaptionBlockContext ctx) {
        if (wasAlgorithmDeclared)
            paragraphCloser();
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterOptions(LaTEXParser.OptionsContext)
	 */

    public void enterOptions(LaTEXParser.OptionsContext ctx) {
        shouldTextBeMissed = true;
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitOptions(LaTEXParser.OptionsContext)
	 */

    public void exitOptions(LaTEXParser.OptionsContext ctx) {
        shouldTextBeMissed = false;
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterNewLine(LaTEXParser.NewLineContext)
	 */

    public void enterNewLine(LaTEXParser.NewLineContext ctx) {
        if (!wasSectionDeclared || figureDeclared || listDeclared)
            return;

        if (wasParagraphFilled) {
            if (newLineCounter == 1 && wasSpaceBetweenLinesFilled)
                newLineCounter = 0;

            ++newLineCounter;
            if (newLineCounter == 2)
                paragraphCloser();
        }
    }

    private void paragraphStarter() {
        if (wasAppsDeclared)
            shouldTextBeMissed = false;

        ++paragraphCounter;
        isParagraphActive = true;
        writer.print("<p id=\""+paragraphCounter+"\">");
        wasSpaceBetweenLinesFilled = false;
        newLineCounter = 0;
    }

    /**
     * Paragraph closer.
     */
    private void paragraphCloser() {
        if (bibliographyDeclared || !wasSectionDeclared)
            return;

        wasParagraphFilled = false;
        isParagraphActive = false;
        wasSpaceBetweenLinesFilled = false;
        newLineCounter = 0;
        writer.print("</p>");
    }

    /**
     * Rewrite figure from file.
     *
     * @param figureFileName the figure file name
     * @throws Exception the exception
     */
    private void rewriteFigureFromFile(String figureFileName) throws Exception {
        FileInputStream is = new FileInputStream(figureFileName);
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        String line = "";
        while ((line = reader.readLine()) != null)
            writer.print(line);
        is.close();
    }

    public void enterLabel(LaTEXParser.LabelContext ctx) {
        shouldTextBeMissed = true;
    }

    /* (non-Javadoc)
     * @see LaTEXBaseListener#exitLabel(LaTEXParser.LabelContext)
     */
    public void exitLabel(LaTEXParser.LabelContext ctx) {
        shouldTextBeMissed = false;
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterDots(LaTEXParser.DotsContext)
	 */

    public void enterDots(LaTEXParser.DotsContext ctx) {
        writer.print("...");
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterList(LaTEXParser.ListContext)
	 */

    public void enterList(LaTEXParser.ListContext ctx) {
        ++listCounter;
        listDeclared = true;
        writer.print("<item-list type=\"Arabic\" id=\"list" + listCounter
                + "\">");
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitList(LaTEXParser.ListContext)
	 */

    public void exitList(LaTEXParser.ListContext ctx) {
        writer.print("</item-list>");
        listDeclared = false;
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterItem(LaTEXParser.ItemContext)
	 */

    public void enterItem(LaTEXParser.ItemContext ctx) {
        ++itemCounter;
        writer.print("<item num=\"" + itemCounter + ".\">");
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitItem(LaTEXParser.ItemContext)
	 */

    public void exitItem(LaTEXParser.ItemContext ctx) {
        writer.print("</item>");
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterSmallcapsDeclaration(LaTEXParser.SmallcapsDeclarationContext)
	 */

    public void enterSmallcapsDeclaration(
            LaTEXParser.SmallcapsDeclarationContext ctx) {

        paragraphInserter();

        boolean wasSmallDeclared = false;
        boolean wasCaps = false;
        String string = "";
        for (LaTEXParser.TextContext str : ctx.text())
            string += str.getText();
        for (int i = 0; i < string.length(); ++i) {
            if (Character.isLowerCase(string.charAt(i)))
                wasSmallDeclared = true;
            else
                wasSmallDeclared = false;

            if (wasSmallDeclared && !wasCaps) {
                wasCaps = true;
                writer.print("<emph type=\"smallcaps\">");
            }

            if (!wasSmallDeclared && wasCaps) {
                wasCaps = false;
                writer.print("</emph>");
            }
            writer.print(string.charAt(i));
        }

        if (wasCaps) {
            wasCaps = false;
            writer.print("</emph>");
        }
        shouldTextBeMissed = true;
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitSmallcapsDeclaration(LaTEXParser.SmallcapsDeclarationContext)
	 */

    public void exitSmallcapsDeclaration(
            LaTEXParser.SmallcapsDeclarationContext ctx) {
        shouldTextBeMissed = false;
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterDescriptionTitle(LaTEXParser.DescriptionTitleContext)
	 */

    public void enterDescriptionTitle(LaTEXParser.DescriptionTitleContext ctx) {
        ++sectionId;
        writer.print("\n<section level=\"3\" id=\"section" + sectionId + "\">");
        writer.print("<title>");
        wasSectionDeclared = false;
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitDescriptionTitle(LaTEXParser.DescriptionTitleContext)
	 */

    public void exitDescriptionTitle(LaTEXParser.DescriptionTitleContext ctx) {
        writer.print("</title>");
        wasSectionDeclared = true;
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitDescriptionItem(LaTEXParser.DescriptionItemContext)
	 */

    public void exitDescriptionItem(LaTEXParser.DescriptionItemContext ctx) {
        writer.print("</section>");
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterUrlText(LaTEXParser.UrlTextContext)
	 */

    @Override
    public void enterUrlText(LaTEXParser.UrlTextContext ctx) {
        String url = ctx.getText();
        if(url.length()>2)
            url = url.substring(1, url.length() - 1);
        writer.print("<url url=\"" + url + "\">");
        shouldTextBeMissed = true;
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitUrlText(LaTEXParser.UrlTextContext)
	 */

    public void exitUrlText(LaTEXParser.UrlTextContext ctx) {
        shouldTextBeMissed = false;
        writer.print("</url>");
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterAlgorithmBlock(LaTEXParser.AlgorithmBlockContext)
	 */

    public void enterAlgorithmBlock(LaTEXParser.AlgorithmBlockContext ctx) {
        wasAlgorithmDeclared = true;
        ++algorithmCounter;
    }

    /* (non-Javadoc)
	 * @see LaTEXBaseListener#exitAlgorithmBlock(LaTEXParser.AlgorithmBlockContext)
	 */

    public void exitAlgorithmBlock(LaTEXParser.AlgorithmBlockContext ctx) {
        wasAlgorithmDeclared = false;
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterInput(LaTEXParser.InputContext)
	 */

    public void enterInput(LaTEXParser.InputContext ctx) {
        paragraphStarter();
        writer.print("<emph type=\"bold\">Input&colon;</emph>");
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitInput(LaTEXParser.InputContext)
	 */

    public void exitInput(LaTEXParser.InputContext ctx) {
        paragraphCloser();
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterOutput(LaTEXParser.OutputContext)
	 */

    public void enterOutput(LaTEXParser.OutputContext ctx) {
        paragraphStarter();
        writer.print("<emph type=\"bold\">Output&colon;</emph>");
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitOutput(LaTEXParser.OutputContext)
	 */

    public void exitOutput(LaTEXParser.OutputContext ctx) {
        paragraphCloser();
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterState(LaTEXParser.StateContext)
	 */

    public void enterState(LaTEXParser.StateContext ctx) {
        paragraphStarter();
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitState(LaTEXParser.StateContext)
	 */

    public void exitState(LaTEXParser.StateContext ctx) {
        paragraphCloser();
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterForBlock(LaTEXParser.ForBlockContext)
	 */

    public void enterForBlock(LaTEXParser.ForBlockContext ctx) {
        paragraphStarter();
        writer.print("<emph type=\"bold\">for</emph>");
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitForBlock(LaTEXParser.ForBlockContext)
	 */

    public void exitForBlock(LaTEXParser.ForBlockContext ctx) {
        writer.print("<emph type=\"bold\">do</emph>");
        paragraphCloser();
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterIfBlock(LaTEXParser.IfBlockContext)
	 */

    public void enterIfBlock(LaTEXParser.IfBlockContext ctx) {
        paragraphStarter();
        writer.print("<emph type=\"bold\">if</emph>");
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitIfBlock(LaTEXParser.IfBlockContext)
	 */

    public void exitIfBlock(LaTEXParser.IfBlockContext ctx) {
        writer.print("<emph type=\"bold\">then</emph>");
        paragraphCloser();
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterReturnBlock(LaTEXParser.ReturnBlockContext)
	 */

    public void enterReturnBlock(LaTEXParser.ReturnBlockContext ctx) {
        paragraphStarter();
        writer.print("<emph type=\"bold\">retunr</emph>");
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitReturnBlock(LaTEXParser.ReturnBlockContext)
	 */

    public void exitReturnBlock(LaTEXParser.ReturnBlockContext ctx) {
        paragraphCloser();
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitDocumentDeclaration(LaTEXParser.DocumentDeclarationContext)
	 */

    public void exitDocumentDeclaration(
            LaTEXParser.DocumentDeclarationContext ctx) {
        sectionCloser();
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterIfThenElse(LaTEXParser.IfThenElseContext)
	 */

    public void enterIfThenElse(LaTEXParser.IfThenElseContext ctx) {
        shouldTextBeMissed = true;
    }

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitIfThenElse(LaTEXParser.IfThenElseContext)
	 */

    public void exitIfThenElse(LaTEXParser.IfThenElseContext ctx) {
        shouldTextBeMissed = false;
    }

}