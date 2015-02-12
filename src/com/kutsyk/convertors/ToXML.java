package com.kutsyk.convertors;/*
 * 
 */

import com.kutsyk.grammar.LaTEX.LaTEXBaseListener;
import com.kutsyk.grammar.LaTEX.LaTEXParser;
import com.kutsyk.windows.MainWindow;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;
import java.util.*;

// TODO: Auto-generated Javadoc
/**
 * The Class ToXML.
 */
public class ToXML extends LaTEXBaseListener {

	/** The writer. */
	public static PrintWriter writer;

	/** The skip data. */
	public static PrintWriter skipData;

	/** The work with back data. */
	private boolean workWithBackData;

	/** The section counter. */
	private int sectionCounter;

	/** The section id. */
	private int sectionId;

	/** The subsection counter. */
	private int subsectionCounter;

	/** The subsubsection counter. */
	private int subsubsectionCounter;

	/** The was section counter. */
	private int wasSectionCounter;

	/** The figure counter. */
	private int figureCounter;

	/** The figure number. */
	private int figureNumber;

	/** The figure declared. */
	private boolean figureDeclared;

	/** The was figure first dot. */
	private boolean wasFigureFirstDot;

	/** The figure references. */
	private static HashMap<String, Integer> figureReferences;

	/** The should be inserted figures. */
	private static HashMap<String, Integer> shouldBeInsertedFigures;

	/** The declared figures. */
	private static ArrayList<String> declaredFigures;

	/** The table counter. */
	private int tableCounter;

	/** The table declared. */
	private boolean tableDeclared;

	/** The table references. */
	private static HashMap<String, Integer> tableReferences;

	/** The should be inserted tables. */
	private static HashMap<String, Integer> shouldBeInsertedTables;

	/** The declared tables. */
	private static ArrayList<String> declaredTables;

	/** The id. */
	private static int ID;

	/** The new commands. */
	private HashMap<String, String> newCommands;

	/** The new command name. */
	private String newCommandName;

	/** The author reference. */
	private boolean authorReference;

	/** The was section declared. */
	private boolean wasSectionDeclared;

	/** The was acknowledgement. */
	private boolean wasAcknowledgement;

	/** The should text be missed. */
	private boolean shouldTextBeMissed;

	/** The skip level. */
	private int skipLevel;

	/** The paragraph counter. */
	private int paragraphCounter;

	/** The was paragraph filled. */
	private boolean wasParagraphFilled;

	/** The was space between lines filled. */
	private boolean wasSpaceBetweenLinesFilled;

	/** The is paragraph active. */
	private boolean isParagraphActive;

	/** The new line counter. */
	private int newLineCounter;

	/** The list counter. */
	private int listCounter;

	/** The item counter. */
	private int itemCounter;

	/** The was previous line word. */
	private boolean wasPreviousLineWord;

	/** The bibliography declared. */
	private boolean bibliographyDeclared;

	/** The app counter. */
	private int appCounter;

	/** The was apps declared. */
	private boolean wasAppsDeclared;

	/** The writing queue. */
	private static ArrayList<String> writingQueue;

	/** The was algorithm declared. */
	private boolean wasAlgorithmDeclared;

	/** The algorithm counter. */
	private int algorithmCounter;
	private boolean wasAuthorSection;

	private String id = "";

	private int equationCounter;


	/**
	 * Instantiates a new to xml.
	 *
	 * @param writer the file into which we will write all xml
	 * @param data the will we work with backmatter data or not
	 * @param newCommands the new commands map
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	ToXML(PrintWriter writer, boolean data, HashMap<String, String> newCommands) throws IOException {
		if (data)
				this.writer = new PrintWriter(MainWindow.mainPath + "/LaTEXtoXML/tables/tables.xml");
		else {
			this.writer = new PrintWriter(MainWindow.mainPath + "/LaTEXtoXML/skipData.xml");
			skipData = writer;
		}
		this.newCommands = newCommands;
		workWithBackData = data;
		figureNumber = -1;

		if (ID < 1) {
			figureReferences = new HashMap<String, Integer>();
			shouldBeInsertedFigures = new HashMap<String, Integer>();
			declaredFigures = new ArrayList<String>();

			tableReferences = new HashMap<String, Integer>();
			shouldBeInsertedTables = new HashMap<String, Integer>();
			declaredTables = new ArrayList<String>();
			writingQueue = new ArrayList<String>();
			++ID;
		}
		newCommands = new HashMap<String, String>();
		shouldBeInsertedFigures.clear();
		shouldBeInsertedTables.clear();
		paragraphCounter = 1;
	}


	public void enterSimpleText(LaTEXParser.SimpleTextContext ctx) {
		if (shouldTextBeMissed)
			return;

		if(ctx.getText().startsWith("\\"))
			return;

		String line = ctx.getText();
		paragraphInserter();						//Inserts paragraph if needed

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


	public void exitTextRules(LaTEXParser.TextRulesContext ctx)
	{
		wasPreviousLineWord = false;
	}

	/**
	 * Cut out supplementary links.
	 *
	 * @param line the line
	 * @return the string
	 */
	private String cutOutSupplementaryLinks(String line)
	{
		line = line.replaceAll("supplementary", "S");
		line = line.replaceAll("Supplementary", "S");
		return line;
	}

	/**
	 * Paragraph inserter.
	 */
	private void paragraphInserter() {
		if (shouldTextBeMissed || bibliographyDeclared)
			return;

		if (wasSectionDeclared)
			wasParagraphFilled = true;


		if (isParagraphActive)
			newLineCounter = 0;

		if (wasParagraphFilled && !isParagraphActive && !figureDeclared)
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

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterAbstractBlock(LaTEXParser.AbstractBlockContext)
	 */

	public void enterAbstractBlock(LaTEXParser.AbstractBlockContext ctx) {
		shouldTextBeMissed = true;
		++skipLevel;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitAbstractBlock(LaTEXParser.AbstractBlockContext)
	 */

	public void exitAbstractBlock(LaTEXParser.AbstractBlockContext ctx) {
		--skipLevel;
		if (skipLevel == 0)
			shouldTextBeMissed = false;
		;
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

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterSectionDeclaration(LaTEXParser.SectionDeclarationContext)
	 */

	public void enterSectionDeclaration(
			LaTEXParser.SectionDeclarationContext ctx) {

		String title = ctx.text().getText();

		if (skipAbstractIfExist(title))
			return;

		startBody();

		shouldTextBeMissed = false;
		if (wasParagraphFilled)
			paragraphCloser();

		authorReference = false;
		sectionCloser();

		if (writeAuthorSummary(title)) {
			writer.print("<title>");
			wasSectionDeclared = false;
			return;
		}

		if(title.equals("Tables"))
		{
			shouldTextBeMissed = true;
			return;
		}

		if (title.equals("Acknowledgements") || title.equals("Acknowledgement")
				|| title.equals("Acknowledgments")) {
			supplementaryInformationWriter();
			wasAcknowledgement = true;
			writer.print("</body>");
			writer.print("<back>");
			writer.print("<acks>");
			writer.print("<title>");
			wasSectionDeclared = false;
			return;
		}

		++sectionId;
		++sectionCounter;

        if(bibliographyDeclared)
            wasAppsDeclared = true;

		bibliographyCloser();

		if (wasAppsDeclared) {
			if(appCounter == 1)
				writer.print("<apps>");
			writer.print("<app id=\"app" + (appCounter++) + "\">");
			writer.print("<title>");
			wasSectionDeclared = false;
			return;
		}

		if(!wasAuthorSection)
		{
			writer.print("<body>");
			wasAuthorSection = true;
		}

		writer.print("\n<section level=\"1\" id=\"section" + sectionId
					+ "\">");

		writer.print("<title>");
		wasSectionDeclared = false;
	}

    /**
	 * Bibliography closer.
	 */
	private void bibliographyCloser()
	{
        if (bibliographyDeclared) {
            bibliographyInserter();
            ++appCounter;
            shouldTextBeMissed = false;
            writer.print("</refs></back>");
            bibliographyDeclared = false;
            wasSectionDeclared = false;
        }
    }

	/**
	 * Bibliography inserter.
	 */
	private void bibliographyInserter(){
		File bibFiles = new File(MainWindow.mainPath + "/LaTEXtoXML/bibliography");
		File[] bibFileList = bibFiles.listFiles();

		writer.println();
		for(File file: bibFileList)
		{
			InputStream in;
			try {
				in = new FileInputStream(file);
				BufferedReader reader = new BufferedReader(new InputStreamReader(in));
				String line = "";
				while((line = reader.readLine()) != null)
					writer.println(line);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Write author summary.
	 *
	 * @param title the title
	 * @return true, if successful
	 */
	private boolean writeAuthorSummary(String title) {
		if (title.contains("Authorsummary") || title.contains("AuthorSummary")) {
			++sectionId;
			++sectionCounter;
			writer.print("<body>");
			writer.print("<section level=\"1\" type=\"TextBox\" id=\"section"
					+ sectionId + "\">");
			++sectionId;
			++sectionCounter;
			writer.print("<section level=\"2\" id=\"section2\">");
			shouldTextBeMissed = false;
			wasAuthorSection = true;
			return true;
		}
		return false;
	}

	/**
	 * Skip abstract if exist.
	 *
	 * @param title the title
	 * @return true, if successful
	 */
	private boolean skipAbstractIfExist(String title) {
		if (title.equals("Abstract")) {
			shouldTextBeMissed = true;
			return true;
		}

		return false;
	}

	/**
	 * Start body.
	 */
	private void startBody() {
		if (sectionCounter == 0) {
			writer.print("</front>");
			if (this.skipData != null) {
				writer = this.skipData;
				try {
					this.skipData = new PrintWriter("D:/LaTEXtoXML/skipData.xml");
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				return;
			}

			try {
				this.skipData = new PrintWriter("D:/LaTEXtoXML/skipData.xml");
			} catch (FileNotFoundException e) {

			}
		}
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitSectionDeclaration(LaTEXParser.SectionDeclarationContext)
	 */

	public void exitSectionDeclaration(LaTEXParser.SectionDeclarationContext ctx)
	{
		if(shouldTextBeMissed)
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
		if(suppDataDeclared)
			return;

		if (wasAppsDeclared) {
			shouldTextBeMissed = true;
			return;
		}

		String title = ctx.text().getText();
		if (skipAbstractIfExist(title))
			return;

		startBody();

		shouldTextBeMissed = false;
		if (wasParagraphFilled)
			paragraphCloser();

		while (subsectionCounter > 0) {
			writer.print("</section>");
			--subsectionCounter;
		}

		if (writeAuthorSummary(title)) {
			writer.print("<title>");
			wasSectionDeclared = false;
			return;
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
		if(suppDataDeclared)
			return;

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
		if(suppDataDeclared)
			return;

		String title = ctx.text().getText();
		if (skipAbstractIfExist(title))
			return;

		startBody();

		shouldTextBeMissed = false;
		if (wasParagraphFilled)
			paragraphCloser();

		wasSectionDeclared = false;
		while (subsubsectionCounter > 0) {
			writer.print("</section>");
			--subsubsectionCounter;
		}

		if (writeAuthorSummary(title)) {
			writer.print("<title>");
			wasSectionDeclared = false;
			return;
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
		if(suppDataDeclared)
			return;

		writer.print("</title>");
		wasSectionDeclared = true;
	}

	/**
	 * Section closer.
	 */
	private void sectionCloser() {
		if (wasParagraphFilled)
			paragraphCloser();

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
			if(!Translator.bibReferences.containsKey(ctx.citeReference(i).getText()))
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
				writer.print(number + "&ndash;");
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

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterDocumentDeclaration(LaTEXParser.DocumentDeclarationContext)
	 */
	public void enterDocumentDeclaration(
			LaTEXParser.DocumentDeclarationContext ctx) {
		writer.print("<doc>");
		writer.print("<article>");
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterItalictypeDeclaration(LaTEXParser.ItalictypeDeclarationContext)
	 */

	public void enterItalictypeDeclaration(
			LaTEXParser.ItalictypeDeclarationContext ctx) {
		paragraphInserter();
		if(shouldTextBeMissed)
			return;

		writer.print("<emph type=\"italic\">");
		wasPreviousLineWord = false;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitItalictypeDeclaration(LaTEXParser.ItalictypeDeclarationContext)
	 */

	public void exitItalictypeDeclaration(
			LaTEXParser.ItalictypeDeclarationContext ctx) {
		if(shouldTextBeMissed)
			return;
		writer.print("</emph>");
	}

	/** The figure title declared. */
	private boolean figureTitleDeclared = false;

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterBoldTypeDeclaration(LaTEXParser.BoldTypeDeclarationContext)
	 */

	public void enterBoldTypeDeclaration(
			LaTEXParser.BoldTypeDeclarationContext ctx) {
		paragraphInserter();
		writer.print("<emph type=\"bold\">");

		if (figureDeclared) {
			shouldTextBeMissed = false;
			figureTitleDeclared = true;
			return;
		}
	}

	/**
	 * Close the bold tag
	 **/

	public void exitBoldTypeDeclaration(
			LaTEXParser.BoldTypeDeclarationContext ctx) {
		/*
		 * We exit from this method when figure is declared,
		 * because it will close bold tag in the place where
		 * the first sentence of the figure will finish
		 */
		if(figureDeclared)
			return;

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
	 * @see LaTEXBaseListener#enterInterval(LaTEXParser.IntervalContext)
	 */

	public void enterInterval(LaTEXParser.IntervalContext ctx) {
		if (shouldTextBeMissed)
			return;

		writer.print(ctx.numbers(0).getText());
		writer.print("&ndash;");
		writer.print(ctx.numbers(1).getText());
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
		if (figureDeclared) {
			if (!wasFigureFirstDot) {
				writer.print("</emph>");
				writer.print("<?FIGTITLE 1?>");
				wasFigureFirstDot = true;
			} else
				writer.print("<?FIGTITLE 0?>");
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

	public void enterDollarBlock(LaTEXParser.DollarBlockContext ctx) {
		if (shouldTextBeMissed)
			return;

		if (authorReference)
			return;
		++equationCounter;
		writer.println("<equ id=\"equ"+equationCounter+"\" type=\"inline\">");
		writeFormula(ctx.getText());
		writer.println("</equ>");
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterEquationBlock(LaTEXParser.EquationBlockContext)
	 */

	public void enterEquationBlock(LaTEXParser.EquationBlockContext ctx) {
		if (authorReference)
			return;

		newLineCounter = 0;
		++equationCounter;
		writer.println("<equ id=\"equ"+equationCounter+"\" type=\"inline\">");
		writeFormula(ctx.getText());
		writer.println("</equ>");
	}


	public void enterDisplayEquation(LaTEXParser.DisplayEquationContext ctx)
	{
		if (authorReference)
			return;

		newLineCounter = 0;
		++equationCounter;
		writer.println("<equ id=\"equ"+equationCounter+"\" type=\"display\">");
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
		writer.println("\n"+formula+"\n");
		writer.print("</tex>");
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterFigureBlock(LaTEXParser.FigureBlockContext)
	 */

	public void enterFigureBlock(LaTEXParser.FigureBlockContext ctx) {
		if (!workWithBackData)
			return;

		figureStarts();
		changeFileForFigures();
		writer.print("<fig id=\"fig" + figureCounter + "\" num=\""
				+ figureCounter + "\" type=\"figure\">");
		shouldTextBeMissed = true;
	}

	/**
	 * Figure starts.
	 */
	private void figureStarts(){
		figureCounter++;
		figureDeclared = true;
		figureTitleDeclared = false;
	}

	/**
	 * Change file for figures.
	 */
	private void changeFileForFigures()
	{
		try {
			skipData = writer;
			writer = new PrintWriter(new File(MainWindow.mainPath + "/LaTEXtoXML/figures/" + figureCounter
					+ ".xml"));
		} catch (IOException e) {
			System.out.println("Couldn't create figure file");
		}
	}

	/** The supp figure type. */
	private String suppFigureType = "";

	/** The supp text counter. */
	private int suppTextCounter = 0;

	/** The supp table counter. */
	private int suppTableCounter = 0;

	/** The supp data set counter. */
	private int suppDataSetCounter = 0;

	/** The supp data declared. */
	private boolean suppDataDeclared = false;
	
	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterSupplementaryFigureBlock(LaTEXParser.SupplementaryFigureBlockContext)
	 */

	public void enterSupplementaryFigureBlock(
			LaTEXParser.SupplementaryFigureBlockContext ctx) {
		if (!workWithBackData)
			return;

		suppDataDeclared = true;
		suppFigureType = "Figure";
		int counter = 0;
		String data = ctx.getText();
		if(data.contains("TextS"))
		{
			suppFigureType = "Text";
			++suppTextCounter;
			counter = suppTextCounter;
		}
		else if(data.contains("TableS"))
		{
			suppFigureType = "Table";
			++suppTableCounter;
			counter = suppTableCounter;
		}else if(data.contains("DatasetS"))
		{
			suppFigureType = "Dataset";
			++suppDataSetCounter;
			counter = suppDataSetCounter;
		}
		String path = MainWindow.mainPath + "/LaTEXtoXML/suppFigures/"+suppFigureType + counter + ".xml";
		writingQueue.add(suppFigureType+ counter);
		try {
			skipData = writer;
			writer = new PrintWriter(new File(path));
			shouldTextBeMissed = false;
		} catch (IOException e) {
			System.out.println("Couldn't create supplementary figure file");
		}
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitSupplementaryFigureBlock(LaTEXParser.SupplementaryFigureBlockContext)
	 */

	public void exitSupplementaryFigureBlock(
			LaTEXParser.SupplementaryFigureBlockContext ctx) {
		if (!workWithBackData)
			return;
		suppDataDeclared = false;
		writer.println("Here");
		setNormalWriter();
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitFigureBlock(LaTEXParser.FigureBlockContext)
	 */

	public void exitFigureBlock(LaTEXParser.FigureBlockContext ctx) {
		if (!workWithBackData)
			return;

		try {
			getJournalIDInfo();
		} catch (Exception e) {
			System.out.println("[ERROR]: Journal reference missing;");
		}
        writer.println("</caption>");
		writer.println("<caption type=\"doi\">"+ FrontmatterCreator.workoutString(id)+".g00"+figureCounter+"</caption>");
        writer.println("<graphic id=\""+id.substring(id.indexOf("/")+1)+".g00"+figureCounter+".tif\"></graphic>");
		writer.println("</fig>");
		figureDeclared = false;
		wasFigureFirstDot = false;
		shouldTextBeMissed = false;
		figureTitleDeclared = false;
		setNormalWriter();
	}

	private void getJournalIDInfo() throws Exception
	{
		Document doc = openDoc();
		doc.getDocumentElement().normalize();
		getInformation(doc);
	}

	private void getInformation(Document doc)
	{
		NodeList nList = doc.getElementsByTagName("article-id");
		for (int i = 0; i < nList.getLength(); ++i) {
			Node node = nList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) node;
				if (eElement.getAttribute("pub-id-type").equals("doi"))
					id = node.getTextContent();
			}
		}
	}

	private Document openDoc() throws Exception
	{
		File metaFile = new File(Translator.metaDataFile);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(metaFile);
		doc.getDocumentElement().normalize();
		return  dBuilder.parse(metaFile);
    }

	/**
	 * Supplementary information writer.
	 */
	private void supplementaryInformationWriter()
	{
		File folder = new File(MainWindow.mainPath + "/LaTEXtoXML/suppFigures");
		File[] files = folder.listFiles();
		if(files.length == 0)
			return;

		writer.print("<section level=\"1\" type=\"SupportingInformation\" id=\"section"
				+ sectionId + "\"><title>Supporting Information</title>");
		for (String file: writingQueue)
		{
			try {
				writeSuppMaterial(MainWindow.mainPath + "/LaTEXtoXML/suppFigures/"+file+".xml", file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/** The supp figure id. */
	private int suppFigureId = 0;

	/**
	 * Write supp material.
	 *
	 * @param fileName the file name
	 * @param suppType the supp type
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	private void writeSuppMaterial(String fileName, String suppType) throws IOException {
		suppFigureType = "";
		String number = "";
		for(int i=0;i<suppType.length();++i)
			if(Character.isDigit(suppType.charAt(i)))
				number += suppType.charAt(i);
			else
				suppFigureType += suppType.charAt(i);

		suppFigureId = Integer.valueOf(number);
		InputStream is = new FileInputStream(fileName);
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		String line = "";
		++sectionId;
		writer.print("<section level=\"2\" type=\"supplementary-material\" id=\"section"
				+ sectionId + "\">");
		++paragraphCounter;
		writer.print("<p id=\"para" + paragraphCounter
				+ "\" type=\"label\">"+suppFigureType+" S" + suppFigureId + "</p>");
		++sectionId;
		++paragraphCounter;
		writer.print("<section level=\"3\" type=\"caption\" id=\"section25\"><p id=\"para"
				+ paragraphCounter + "\" type=\"p\">");
		while ((line = reader.readLine()) != null)
			writer.print(line);
		is.close();
		++paragraphCounter;
		writer.print("</p><p id=\"para" + paragraphCounter
				+ "\" type=\"p\">&lpar;XXX&rpar;</p></section></section>");
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterNewcommandDeclaration(LaTEXParser.NewcommandDeclarationContext)
	 */

	public void enterNewcommandDeclaration(
			LaTEXParser.NewcommandDeclarationContext ctx) {
		if (ctx.identificator() == null)
			return;

		newCommandName = ctx.identificator().getText();
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterCommandBody(LaTEXParser.CommandBodyContext)
	 */

	public void enterCommandBody(LaTEXParser.CommandBodyContext ctx) {
		if (newCommandName != null) {
			newCommands.put(newCommandName, ctx.getText());
			newCommandName = "";
		}
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

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitRef(LaTEXParser.RefContext)
	 */

	public void exitRef(LaTEXParser.RefContext ctx) {
		shouldTextBeMissed = false;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterTable(LaTEXParser.TableContext)
	 */

	public void enterTable(LaTEXParser.TableContext ctx) {
		if (!workWithBackData)
			return;

		tableCounter++;
		tableDeclared = true;

		try {
			skipData = writer;
            writer = new PrintWriter(new File(MainWindow.mainPath + "/LaTEXtoXML/skipData.xml"));
//			writer = new PrintWriter(new File(MainWindow.mainPath + "/LaTEXtoXML/tables/" + tableCounter
//					+ ".xml"));
		} catch (IOException e) {
			System.out.println("Couldn't create table file");
		}
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitTable(LaTEXParser.TableContext)
	 */

	public void exitTable(LaTEXParser.TableContext ctx) {
		writer.print("</tbl>");
		setNormalWriter();
		tableDeclared = false;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterTableRow(LaTEXParser.TableRowContext)
	 */

	public void enterTableRow(LaTEXParser.TableRowContext ctx) {
		writer.print("<tr>");
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitTableRow(LaTEXParser.TableRowContext)
	 */

	public void exitTableRow(LaTEXParser.TableRowContext ctx) {
		writer.print("</tr>");
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterCaptionBlock(LaTEXParser.CaptionBlockContext)
	 */

	public void enterCaptionBlock(LaTEXParser.CaptionBlockContext ctx) {

		if (tableDeclared) {
            writer.close();
            try{
                writer = new PrintWriter(new File(MainWindow.mainPath + "/LaTEXtoXML/tables/" + tableCounter+ ".xml"));
            }catch(IOException e)
            {
                e.printStackTrace();
            }
            writer.print("<tbl id=\"tbl" + tableCounter + "\" num=\""
                    + tableCounter + "\">");
			writer.print("<tbl:title>");
			writer.print("<emph type=\"bold\">Table " + tableCounter
					+ ".</emph>");
			writer.print("</tbl:title>");
            try{
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream(MainWindow.mainPath + "/LaTEXtoXML/tables/skipData.xml")));
                String line = "";
                while((line = reader.readLine())!=null)
                    writer.println(line);
                reader.close();
            }catch(IOException e)
            {};
			return;
		} else if (figureDeclared) {
			shouldTextBeMissed = false;
			writer.print("<caption>");
		} else if (wasAlgorithmDeclared) {
			paragraphStarter();
			writer.print("<emph type=\"bold\">Algorithm " + algorithmCounter
					+ ".</emph>");
		}
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
		if (!wasSectionDeclared || figureDeclared)
			return;

		if (wasParagraphFilled) {
			if (newLineCounter == 1 && wasSpaceBetweenLinesFilled)
				newLineCounter = 0;

			++newLineCounter;
			if (newLineCounter == 2)
				paragraphCloser();
		}
	}

	/**
	 * Paragraph starter.
	 */
	private void paragraphStarter() {
		if (wasAppsDeclared)
			shouldTextBeMissed = false;

		++paragraphCounter;
		isParagraphActive = true;
		writer.print("<p id=\"para" + paragraphCounter + "\">");
		wasSpaceBetweenLinesFilled = false;
		newLineCounter = 0;
	}

	/**
	 * Paragraph closer.
	 */
	private void paragraphCloser() {
		if(bibliographyDeclared || !wasSectionDeclared)
			return;

		wasParagraphFilled = false;
		isParagraphActive = false;
		wasSpaceBetweenLinesFilled = false;
		newLineCounter = 0;
		writer.print("</p>");
		if (shouldBeInsertedFigures.size() > 0)
			figuresInserter();

		if (shouldBeInsertedTables.size() > 0)
			tablesInserter();
	}

	/**
	 * Tables inserter.
	 */
	private void tablesInserter() {
		for (String key : shouldBeInsertedTables.keySet()) {
			if (!declaredTables.contains(key))
				declaredTables.add(key);
			else
				continue;

			int tableFileNumber = shouldBeInsertedTables.get(key);
			try {
				rewriteFigureFromFile(MainWindow.mainPath + "/LaTEXtoXML/tables/" + tableFileNumber
						+ ".xml");
			} catch (Exception e) {
				System.out.println("Table file number: " + tableFileNumber
						+ " not found!!!");
			}
		}
		shouldBeInsertedTables.clear();
	}

	/**
	 * Figures inserter.
	 */
	private void figuresInserter() {
		for (String key : shouldBeInsertedFigures.keySet()) {
			if (!declaredFigures.contains(key))
				declaredFigures.add(key);
			else
				continue;

			int figureFileNumber = shouldBeInsertedFigures.get(key);
			try {
				rewriteFigureFromFile(MainWindow.mainPath + "/LaTEXtoXML/figures/" + figureFileNumber
						+ ".xml");
			} catch (Exception e) {
				System.out.println("Figure file number: " + figureFileNumber
						+ " not found!!!");
			}
		}
		shouldBeInsertedFigures.clear();
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
		if (figureDeclared) {
			String label = ctx.text().getText();
			if (!figureReferences.containsKey(label))
				figureReferences.put(ctx.text().getText(), figureCounter);
			else
				figureReferences.put("" + figureCounter, figureCounter);
		} else if (tableDeclared)
			tableReferences.put(ctx.text().getText(), tableCounter);

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
		writer.print("<item-list type=\"Arabic\" id=\"list" + listCounter
				+ "\">");
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitList(LaTEXParser.ListContext)
	 */

	public void exitList(LaTEXParser.ListContext ctx) {
		writer.print("</item-list>");
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterItem(LaTEXParser.ItemContext)
	 */

	public void enterItem(LaTEXParser.ItemContext ctx) {
		++itemCounter;
		writer.print("<item num=\"" + itemCounter + ".\">");
		++paragraphCounter;
		writer.print("<p id=\"para" + paragraphCounter + "\">");
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitItem(LaTEXParser.ItemContext)
	 */

	public void exitItem(LaTEXParser.ItemContext ctx) {
		writer.print("</p></item>");
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
        url = url.substring(1,url.length()-1);
		writer.print("<?up?><?show +\"linkList\"tpmkset \"web2\",\"description\",\"\",\"*"
				+ url
				+ "\",0,0,2$10#?><?show $60#?tbklnk==\"web2\"$62#?>"
				+ "<url url=\"" + url + "\">");
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitUrlText(LaTEXParser.UrlTextContext)
	 */

	public void exitUrlText(LaTEXParser.UrlTextContext ctx) {
		writer.print("</url><?tbklnk?><?down?>\"");
	}



	/**
	 * Sets the normal writer.
	 */
	private void setNormalWriter() {
		writer.close();
		writer = skipData;
	}

    @Override
    public void enterLparen(LaTEXParser.LparenContext ctx) {
        writer.print("&lpar;");
    }

    @Override
    public void enterRparen(LaTEXParser.RparenContext ctx) {
        writer.print("&rpar;");
    }


	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterColon(LaTEXParser.ColonContext)
	 */

	public void enterColon(LaTEXParser.ColonContext ctx) {
		if(shouldTextBeMissed)
			return;

		writer.print("&colon;");
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
		bibliographyCloser();
		writer.print("</article></doc>");
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