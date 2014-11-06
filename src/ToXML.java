/*
 * 
 */

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
	
	/** The bib author. */
	private String bibAuthor;
	
	/** The bib date. */
	private String bibDate;
	
	/** The bib cittl. */
	private String bibCittl;
	
	/** The bib pubtl. */
	private String bibPubtl;
	
	/** The bib vol. */
	private String bibVol;
	
	/** The bib pages. */
	private String bibPages;

	/** The bib ref counter. */
	private int bibRefCounter;

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

	@Override
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
	
	@Override 
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
		if (shouldTextBeMissed)
			return;

		if (wasSectionDeclared)
		{	
			wasParagraphFilled = true;
		}

		if (isParagraphActive)
			newLineCounter = 0;

		if (wasParagraphFilled && !isParagraphActive && !figureDeclared)
			paragraphStarter();

	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterTextRules(LaTEXParser.TextRulesContext)
	 */
	@Override
	public void enterTextRules(LaTEXParser.TextRulesContext ctx) {
		if (shouldTextBeMissed)
			return;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterTextSymbols(LaTEXParser.TextSymbolsContext)
	 */
	@Override
	public void enterTextSymbols(LaTEXParser.TextSymbolsContext ctx) {
		if (shouldTextBeMissed)
			return;

		wasPreviousLineWord = false;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterText(LaTEXParser.TextContext)
	 */
	@Override
	public void enterText(LaTEXParser.TextContext ctx) {
		if (isParagraphActive)
			newLineCounter = 0;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterTitle(LaTEXParser.TitleContext)
	 */
	@Override
	public void enterTitle(LaTEXParser.TitleContext ctx) {
		shouldTextBeMissed = true;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitTitle(LaTEXParser.TitleContext)
	 */
	@Override
	public void exitTitle(LaTEXParser.TitleContext ctx) {
		shouldTextBeMissed = false;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterAbstractBlock(LaTEXParser.AbstractBlockContext)
	 */
	@Override
	public void enterAbstractBlock(LaTEXParser.AbstractBlockContext ctx) {
		shouldTextBeMissed = true;
		++skipLevel;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitAbstractBlock(LaTEXParser.AbstractBlockContext)
	 */
	@Override
	public void exitAbstractBlock(LaTEXParser.AbstractBlockContext ctx) {
		--skipLevel;
		if (skipLevel == 0)
			shouldTextBeMissed = false;
		;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterParagraph(LaTEXParser.ParagraphContext)
	 */
	@Override
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
	@Override
	public void exitParagraph(LaTEXParser.ParagraphContext ctx) {
		writer.print("</title>");
		wasSectionDeclared = true;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterSectionDeclaration(LaTEXParser.SectionDeclarationContext)
	 */
	@Override
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
		if (bibliographyDeclared) 
		{
			bibliographyInserter();
			++appCounter;
			wasAppsDeclared = true;
			shouldTextBeMissed = false;
			writer.print("</refs></back>");
			bibliographyDeclared = false;
		}
	}
	
	/**
	 * Bibliography inserter.
	 */
	private void bibliographyInserter(){
		File bibFiles = new File(MainWindow.mainPath + "/LaTEXtoXML/bibliography");
		File[] bibFileList = bibFiles.listFiles();
		
		
		Arrays.sort(bibFileList, new AlphanumComparator());
		
		
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
	@Override
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
	@Override
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
	@Override
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
	@Override
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
	@Override
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
			startRefs();
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
	@Override
	public void enterCiteReferencesList(
			LaTEXParser.CiteReferencesListContext ctx) {
		citeReference(ctx);
		shouldTextBeMissed = true;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitCiteReferences(LaTEXParser.CiteReferencesContext)
	 */
	@Override
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
		writer.print("</citref> ");
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
	@Override
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
	@Override
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
	@Override
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
	@Override
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
	@Override
	public void enterMeasures(LaTEXParser.MeasuresContext ctx) {
		String[] tokens = ctx.getText().split(" ");
		writer.print("&emsp14;" + tokens[1]);
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterInterval(LaTEXParser.IntervalContext)
	 */
	@Override
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
	@Override
	public void enterComma(LaTEXParser.CommaContext ctx) {
		if (shouldTextBeMissed)
			return;

		writer.print(", ");
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterDot(LaTEXParser.DotContext)
	 */
	@Override
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
	@Override
	public void enterNumbers(LaTEXParser.NumbersContext ctx) {
		if(bibYearNumber)
			return;
		writer.print(" ");
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterDollarBlock(LaTEXParser.DollarBlockContext)
	 */
	@Override
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
	@Override
	public void enterEquationBlock(LaTEXParser.EquationBlockContext ctx) {
		if (authorReference)
			return;

		newLineCounter = 0;
		++equationCounter;
		writer.println("<equ id=\"equ"+equationCounter+"\" type=\"inline\">");
		writeFormula(ctx.getText());
		writer.println("</equ>");
	}
	
	@Override 
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

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterEquation(LaTEXParser.EquationContext)
	 */
	@Override
	public void enterEquation(LaTEXParser.EquationContext ctx) {
		newLineCounter = 0;
		if (authorReference)
			return;
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
	@Override
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
		labelDeclared = false;
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
	@Override
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
	@Override
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
	@Override
	public void exitFigureBlock(LaTEXParser.FigureBlockContext ctx) {
		if (!workWithBackData)
			return;

		if (!labelDeclared)
			figureReferences.put("" + figureCounter, figureCounter);
		try {
			getJournalIDInfo();
		} catch (Exception e) {
			System.out.println("[ERROR]: Journal reference missing;");
		}
		System.out.println(id);
		writer.println("<caption type=\"doi\">"+FrontmatterCreator.workoutString(id)+".g00"+figureCounter);
		writer.println("</caption>");
		writer.print("</caption></fig>");
		figureDeclared = false;
		wasFigureFirstDot = false;
		shouldTextBeMissed = false;
		figureTitleDeclared = false;
		labelDeclared = false;
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

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterFigureRefListTypeNumbers(LaTEXParser.FigureRefListTypeNumbersContext)
	 */
	@Override
	public void enterFigureRefListTypeNumbers(
			LaTEXParser.FigureRefListTypeNumbersContext ctx) {
		List<LaTEXParser.NumbersContext> numbers = ctx.numbers();
		String figureNumber = "";
		for (int i = 0; i < numbers.size(); ++i) {
			figureNumber = numbers.get(i).getText();
			this.figureNumber = Integer.valueOf(numbers.get(i).getText());
			for (String key : figureReferences.keySet()) {
				if (this.figureNumber == figureReferences.get(key)) {
					figureReference(this.figureNumber, key);
					break;
				}
			}
		}
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
		writer.print("</section></body><back><acks>");
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
	@Override
	public void enterNewcommandDeclaration(
			LaTEXParser.NewcommandDeclarationContext ctx) {
		if (ctx.identificator() == null)
			return;

		newCommandName = ctx.identificator().getText();
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterCommandBody(LaTEXParser.CommandBodyContext)
	 */
	@Override
	public void enterCommandBody(LaTEXParser.CommandBodyContext ctx) {
		if (newCommandName != null) {
			newCommands.put(newCommandName, ctx.getText());
			newCommandName = "";
		}
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitNewcommandDeclaration(LaTEXParser.NewcommandDeclarationContext)
	 */
	@Override
	public void exitNewcommandDeclaration(
			LaTEXParser.NewcommandDeclarationContext ctx) {
		shouldTextBeMissed = false;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterRenewcommandDeclaration(LaTEXParser.RenewcommandDeclarationContext)
	 */
	@Override
	public void enterRenewcommandDeclaration(
			LaTEXParser.RenewcommandDeclarationContext ctx) {
		shouldTextBeMissed = true;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitRenewcommandDeclaration(LaTEXParser.RenewcommandDeclarationContext)
	 */
	@Override
	public void exitRenewcommandDeclaration(
			LaTEXParser.RenewcommandDeclarationContext ctx) {
		shouldTextBeMissed = false;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitRef(LaTEXParser.RefContext)
	 */
	@Override
	public void exitRef(LaTEXParser.RefContext ctx) {
		shouldTextBeMissed = false;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterTable(LaTEXParser.TableContext)
	 */
	@Override
	public void enterTable(LaTEXParser.TableContext ctx) {
		if (!workWithBackData)
			return;

		tableCounter++;
		tableDeclared = true;

		try {
			skipData = writer;
			writer = new PrintWriter(new File(MainWindow.mainPath + "/LaTEXtoXML/tables/" + tableCounter
					+ ".xml"));
		} catch (IOException e) {
			System.out.println("Couldn't create table file");
		}
		writer.print("<tbl id=\"tbl" + tableCounter + "\" num=\""
				+ tableCounter + "\">");
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitTable(LaTEXParser.TableContext)
	 */
	@Override
	public void exitTable(LaTEXParser.TableContext ctx) {
		writer.print("</tbl>");
		setNormalWriter();
		tableDeclared = false;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterTableRow(LaTEXParser.TableRowContext)
	 */
	@Override
	public void enterTableRow(LaTEXParser.TableRowContext ctx) {
		writer.print("<tr>");
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitTableRow(LaTEXParser.TableRowContext)
	 */
	@Override
	public void exitTableRow(LaTEXParser.TableRowContext ctx) {
		writer.print("</tr>");
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterTableCol(LaTEXParser.TableColContext)
	 */
	@Override
	public void enterTableCol(LaTEXParser.TableColContext ctx) {
		writer.print("<td>");
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitTableCol(LaTEXParser.TableColContext)
	 */
	@Override
	public void exitTableCol(LaTEXParser.TableColContext ctx) {
		writer.print("</td>");
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterCaptionBlock(LaTEXParser.CaptionBlockContext)
	 */
	@Override
	public void enterCaptionBlock(LaTEXParser.CaptionBlockContext ctx) {

		if (tableDeclared) {
			writer.print("<tbl:title>");
			writer.print("<emph type=\"bold\">Table " + tableCounter
					+ ".</emph>");
			writer.print("</tbl:title>");
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
	@Override
	public void exitCaptionBlock(LaTEXParser.CaptionBlockContext ctx) {
		if (wasAlgorithmDeclared)
			paragraphCloser();
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterOptions(LaTEXParser.OptionsContext)
	 */
	@Override
	public void enterOptions(LaTEXParser.OptionsContext ctx) {
		shouldTextBeMissed = true;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitOptions(LaTEXParser.OptionsContext)
	 */
	@Override
	public void exitOptions(LaTEXParser.OptionsContext ctx) {
		shouldTextBeMissed = false;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterTableStyle(LaTEXParser.TableStyleContext)
	 */
	@Override
	public void enterTableStyle(LaTEXParser.TableStyleContext ctx) {
		shouldTextBeMissed = true;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitTableStyle(LaTEXParser.TableStyleContext)
	 */
	@Override
	public void exitTableStyle(LaTEXParser.TableStyleContext ctx) {
		shouldTextBeMissed = false;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterNewLine(LaTEXParser.NewLineContext)
	 */
	@Override
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
		if(bibliographyDeclared)
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

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterReferenceList(LaTEXParser.ReferenceListContext)
	 */
	@Override
	public void enterReferenceList(LaTEXParser.ReferenceListContext ctx) {
		shouldTextBeMissed = true;
		List<LaTEXParser.RefContext> referenceList = ctx.ref();
		for (int i = 0; i < referenceList.size(); ++i) {
			int number = 0;
			String label = referenceList.get(i).text().getText();

			if (figureReferences.containsKey(label)) {
				number = figureReferences.get(label);
				figureReference(number, label);
				continue;
			}

			if (tableReferences.containsKey(label)) {
				number = tableReferences.get(label);
				tableReference(number, label);
			}
		}
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterLaTEXFigRef(LaTEXParser.LaTEXFigRefContext)
	 */
	@Override
	public void enterLaTEXFigRef(LaTEXParser.LaTEXFigRefContext ctx) {

		shouldTextBeMissed = true;
		int number = 0;
		String label = ctx.text().getText();
		if (figureReferences.containsKey(label)) {
			number = figureReferences.get(label);
			figureReference(number, label);
		} else if (figureReferences.containsKey("fig:" + label)) {
			number = figureReferences.get("fig:" + label);
			figureReference(number, "fig:" + label);
		}
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitLaTEXFigRef(LaTEXParser.LaTEXFigRefContext)
	 */
	@Override
	public void exitLaTEXFigRef(LaTEXParser.LaTEXFigRefContext ctx) {
		shouldTextBeMissed = false;
	}

	/**
	 * Figure reference.
	 *
	 * @param number the number
	 * @param label the label
	 */
	private void figureReference(int number, String label) {
		figureNumber = number;
		writer.print("<figref rids=\"fig" + number + "\">");
		writer.print("Figure&#146;" + number);
		writer.print("</figref>");
		shouldBeInsertedFigures.put(label, number);
	}

	/**
	 * Table reference.
	 *
	 * @param number the number
	 * @param label the label
	 */
	private void tableReference(int number, String label) {
		writer.print("<tblref rids=\"tbl" + number + "\">");
		writer.print("Table&#146;" + number);
		writer.print("</tblref>");
		shouldBeInsertedTables.put(label, number);
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitReferenceList(LaTEXParser.ReferenceListContext)
	 */
	@Override
	public void exitReferenceList(LaTEXParser.ReferenceListContext ctx) {
		shouldTextBeMissed = false;
	}

	/** The label declared. */
	boolean labelDeclared = false;

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterLabel(LaTEXParser.LabelContext)
	 */
	@Override
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
		labelDeclared = true;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitLabel(LaTEXParser.LabelContext)
	 */
	@Override
	public void exitLabel(LaTEXParser.LabelContext ctx) {
		shouldTextBeMissed = false;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterDots(LaTEXParser.DotsContext)
	 */
	@Override
	public void enterDots(LaTEXParser.DotsContext ctx) {
		writer.print("...");
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterList(LaTEXParser.ListContext)
	 */
	@Override
	public void enterList(LaTEXParser.ListContext ctx) {
		++listCounter;
		writer.print("<item-list type=\"Arabic\" id=\"list" + listCounter
				+ "\">");
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitList(LaTEXParser.ListContext)
	 */
	@Override
	public void exitList(LaTEXParser.ListContext ctx) {
		writer.print("</item-list>");
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterItem(LaTEXParser.ItemContext)
	 */
	@Override
	public void enterItem(LaTEXParser.ItemContext ctx) {
		++itemCounter;
		writer.print("<item num=\"" + itemCounter + ".\">");
		++paragraphCounter;
		writer.print("<p id=\"para" + paragraphCounter + "\">");
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitItem(LaTEXParser.ItemContext)
	 */
	@Override
	public void exitItem(LaTEXParser.ItemContext ctx) {
		writer.print("</p></item>");
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterIsoEnt(LaTEXParser.IsoEntContext)
	 */
	@Override
	public void enterIsoEnt(LaTEXParser.IsoEntContext ctx) {
		if (shouldTextBeMissed)
			return;

		writer.print(Translator.isoTrie.get(ctx.getText().toString()));
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterSmallcapsDeclaration(LaTEXParser.SmallcapsDeclarationContext)
	 */
	@Override
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
	@Override
	public void exitSmallcapsDeclaration(
			LaTEXParser.SmallcapsDeclarationContext ctx) {
		shouldTextBeMissed = false;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterDescriptionTitle(LaTEXParser.DescriptionTitleContext)
	 */
	@Override
	public void enterDescriptionTitle(LaTEXParser.DescriptionTitleContext ctx) {
		++sectionId;
		writer.print("\n<section level=\"3\" id=\"section" + sectionId + "\">");
		writer.print("<title>");
		wasSectionDeclared = false;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitDescriptionTitle(LaTEXParser.DescriptionTitleContext)
	 */
	@Override
	public void exitDescriptionTitle(LaTEXParser.DescriptionTitleContext ctx) {
		writer.print("</title>");
		wasSectionDeclared = true;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitDescriptionItem(LaTEXParser.DescriptionItemContext)
	 */
	@Override
	public void exitDescriptionItem(LaTEXParser.DescriptionItemContext ctx) {
		writer.print("</section>");
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterUrlText(LaTEXParser.UrlTextContext)
	 */
	@Override
	public void enterUrlText(LaTEXParser.UrlTextContext ctx) {
		String url = ctx.getText();
		writer.print("<?up?><?show +\"linkList\"tpmkset \"web2\",\"description\",\"\",\"*"
				+ url
				+ "\",0,0,2$10#?><?show $60#?tbklnk==\"web2\"$62#?>"
				+ "<url url=\"" + url + "\">");
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitUrlText(LaTEXParser.UrlTextContext)
	 */
	@Override
	public void exitUrlText(LaTEXParser.UrlTextContext ctx) {
		writer.print("</url><?tbklnk?><?down?>\"");
	}

	/** The should item be added to xml. */
	private boolean shouldItemBeAddedToXML = false;

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterArticle(LaTEXParser.ArticleContext)
	 */
	@Override
	public void enterArticle(LaTEXParser.ArticleContext ctx) {
		enterBibMember(ctx.bibLabel().getText());
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterBook(LaTEXParser.BookContext)
	 */
	@Override
	public void enterBook(LaTEXParser.BookContext ctx) {
		enterBibMember(ctx.bibLabel().getText());
	}

	/** The bib label. */
	private String bibLabel;
	
	/**
	 * Enter bib member.
	 *
	 * @param label the label
	 */
	private void enterBibMember(String label) 
	{
		bibLabel = label = label.substring(0, label.length() - 1);
		if (Translator.bibReferences.containsKey(label)) {
			shouldItemBeAddedToXML = true;
		} else
			shouldItemBeAddedToXML = false;

		if (!shouldItemBeAddedToXML)
		{
			shouldTextBeMissed = true;
			return;
		}
		
		startRefs();

		++bibRefCounter;
		skipData = writer;
		writeIntoFile();
		shouldTextBeMissed = true;
		bibliographyDeclared = true;
	}
	
	/**
	 * Exit bib member.
	 *
	 * @param type the type
	 */
	private void exitBibMember(String type) {
		if (!shouldItemBeAddedToXML)
		{
			shouldTextBeMissed = true;
			return;
		}

		writeIntoFile();
		writer.print("<cit id=\"ref" + Translator.bibReferences.get(bibLabel) + "\" num=\""
				+ Translator.bibReferences.get(bibLabel) + "\" type=\"" + type + "\">");
		writer.print(bibAuthor);
		writer.print(bibDate);
		writer.print(bibCittl);
		writer.print(bibPubtl);
		writer.print(bibVol);
		writer.print(bibPages);
		writer.print(".");
		writer.print("</cit>");
		bibLabel = "";
		setNormalWriter();
		shouldTextBeMissed = false;
		shouldTextBeMissed = true;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterOther(LaTEXParser.OtherContext)
	 */
	@Override
	public void enterOther(LaTEXParser.OtherContext ctx) {
		enterBibMember(ctx.bibLabel().getText());
	}

	/**
	 * Change files.
	 */
	private void changeFiles() {
		try {
			writer = new PrintWriter(MainWindow.mainPath + "/LaTEXtoXML/buffer.xml");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return;
	}

	/**
	 * Sets the normal writer.
	 */
	private void setNormalWriter() {
		writer.close();
		writer = skipData;
	}
	
	/**
	 * Write into file.
	 */
	private void writeIntoFile()
	{
		try {
			writer = new PrintWriter(MainWindow.mainPath + "/LaTEXtoXML/bibliography/"+Translator.bibReferences.get(bibLabel)+".xml");
		} catch (IOException e) {
			e.printStackTrace();	
		}
	}

	/**
	 * Gets the info.
	 *
	 * @return the info
	 */
	private String getInfo() {
		String result = "";
		try {
			InputStream in = new FileInputStream(new File(MainWindow.mainPath + "/LaTEXtoXML/buffer.xml"));
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			String line = "";
			while((line = reader.readLine()) != null)
				result += line;
			reader.close();
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitBook(LaTEXParser.BookContext)
	 */
	@Override
	public void exitBook(LaTEXParser.BookContext ctx) {
		exitBibMember("book");
	}
	
	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitArticle(LaTEXParser.ArticleContext)
	 */
	@Override
	public void exitArticle(LaTEXParser.ArticleContext ctx) {
		exitBibMember("journal");
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitOther(LaTEXParser.OtherContext)
	 */
	@Override
	public void exitOther(LaTEXParser.OtherContext ctx) {
		exitBibMember("other");
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterBibAuthor(LaTEXParser.BibAuthorContext)
	 */
	@Override
	public void enterBibAuthor(LaTEXParser.BibAuthorContext ctx) {
		if (!shouldItemBeAddedToXML)
		{
			shouldTextBeMissed = true;
			return;
		}

		shouldTextBeMissed = true;
		changeFiles();
		getAuthorsData(ctx.getText());
	}

	/** The was author before. */
	private boolean wasAuthorBefore = false;

	/**
	 * Gets the authors data.
	 *
	 * @param data the data
	 * @return the authors data
	 */
	private void getAuthorsData(String data) {
		data = data.substring(data.indexOf('{') + 1, data.lastIndexOf('}'));
		data = insertSpacesBerweenWords(data);
		String[] authors;
		if(data.indexOf("and ") == -1)
		{
			authors = new String[1];
			authors[0] = data;
		}else if(data.split("and ").length == 1)
			authors = data.split("A N D");
		else
			authors = data.split("and ");
		
		for (int i = 0; i < authors.length; ++i) 
		{
			if (authors[i].split(",").length > 1)
				getAuthorsSeparetedWithComma(authors[i]);
			else
				getUnseparetedAuthors(authors[i]);
		}
	}

	/**
	 * Insert spaces berween words.
	 *
	 * @param dat the dat
	 * @return the string
	 */
	private String insertSpacesBerweenWords(String dat) {
		String data = dat;
		int j = data.indexOf("and") + 3;
		StringBuilder result = new StringBuilder();
		boolean onceAgain = true;
		while(true)
		{
			result.append(data.substring(0, j));
			if(!onceAgain)
				break;
				
			if(!Character.isLowerCase(data.charAt(j)))
				result.append(" ");
			
			data = data.substring(j, data.length());
			j = data.indexOf("and") + 3;
			if(j == 2)
			{
				onceAgain = false;
				j = data.length();
			}
		}
		return result.toString();
	}

	/**
	 * Gets the authors separeted with comma.
	 *
	 * @param authorData the author data
	 * @return the authors separeted with comma
	 */
	private void getAuthorsSeparetedWithComma(String authorData) {
		if (wasAuthorBefore)
			writer.print(',');

		writer.print("<author>");
		String[] data = authorData.split(",");
		writeSurname(data[0]);
		writeInitials(data[1]);
		wasAuthorBefore = true;
		writer.print("</author>");
	}

	/**
	 * Write surname.
	 *
	 * @param surname the surname
	 */
	private void writeSurname(String surname) 
	{
		writer.print("<surname>"+ FrontmatterCreator.workoutString(surname) + "</surname>");
	}

	/**
	 * Write initials.
	 *
	 * @param name the name
	 */
	private void writeInitials(String name) {
		for (int i = 0; i < name.length(); ++i)
			if (Character.isUpperCase(name.charAt(i)))
				writer.print("<initial>" + name.charAt(i) + "</initial>");
	}

	/**
	 * Gets the unsepareted authors.
	 *
	 * @param authorData the author data
	 * @return the unsepareted authors
	 */
	private void getUnseparetedAuthors(String authorData) {
		if (wasAuthorBefore)
			writer.print(',');
		
		String surname = "";
		boolean isName = true;
		int j = findFirstLetterOfName(authorData);
		String name = authorData.charAt(j) + "";

		for (int i = 1; i < authorData.length(); ++i) {
			char ch = authorData.charAt(i);

			if (Character.isUpperCase(ch))
				isName = false;

			if (isName) {
				if (Character.isAlphabetic(ch))
					name += ch;
			} else {
				if (Character.isAlphabetic(ch))
					surname += ch;
			}
		}

		writer.print("<author>");
		writer.print("<surname>" +  FrontmatterCreator.workoutString(surname) + "</surname>");
		writeInitials(name);
		writer.print("</author>");
	}

	/**
	 * Find first letter of name.
	 *
	 * @param authorData the author data
	 * @return the int
	 */
	private int findFirstLetterOfName(String authorData) {
		int j = 0;
		for(j = 0;j<authorData.length();++j)
			if(Character.isUpperCase(authorData.charAt(j)))
				break;
		return j;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitBibAuthor(LaTEXParser.BibAuthorContext)
	 */
	@Override
	public void exitBibAuthor(LaTEXParser.BibAuthorContext ctx) {
		if (!shouldItemBeAddedToXML)
		{
			shouldTextBeMissed = true;
			return;
		}
		
		writer.close();
		bibAuthor = getInfo();
		shouldTextBeMissed = true;
		wasAuthorBefore = false;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterBibDate(LaTEXParser.BibDateContext)
	 */
	@Override
	public void enterBibDate(LaTEXParser.BibDateContext ctx) {
		if (!shouldItemBeAddedToXML)
		{
			shouldTextBeMissed = true;
			return;
		}
		changeFiles();
		writer.print("&lpar;<date>");
		shouldTextBeMissed = true;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitBibDate(LaTEXParser.BibDateContext)
	 */
	@Override
	public void exitBibDate(LaTEXParser.BibDateContext ctx) {
		if (!shouldItemBeAddedToXML)
		{
			shouldTextBeMissed = true;
			return;
		}

		writer.print("</date>&rpar;");
		writer.close();
		bibDate = getInfo();
		shouldTextBeMissed = true;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterBibYear(LaTEXParser.BibYearContext)
	 */
	private boolean bibYearNumber = false;
	@Override
	public void enterBibYear(LaTEXParser.BibYearContext ctx) {
		if (!shouldItemBeAddedToXML)
		{
			shouldTextBeMissed = true;
			return;
		}
		shouldTextBeMissed = false;
		bibYearNumber = true;
		writer.print("<year>");
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitBibYear(LaTEXParser.BibYearContext)
	 */
	@Override
	public void exitBibYear(LaTEXParser.BibYearContext ctx) {
		if (!shouldItemBeAddedToXML)
		{
			shouldTextBeMissed = true;
			return;
		}

		writer.print("</year>");
		shouldTextBeMissed = true;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterBibTitle(LaTEXParser.BibTitleContext)
	 */
	@Override
	public void enterBibTitle(LaTEXParser.BibTitleContext ctx) {
		if (!shouldItemBeAddedToXML)
		{
			shouldTextBeMissed = true;
			return;
		}

		changeFiles();
		writer.print("<cit-tl>");
		shouldTextBeMissed = false;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitBibTitle(LaTEXParser.BibTitleContext)
	 */
	@Override
	public void exitBibTitle(LaTEXParser.BibTitleContext ctx) {
		if (!shouldItemBeAddedToXML)
		{
			shouldTextBeMissed = false;
			return;
		}
		if(bibCittl != null && !bibCittl.endsWith("."))
			writer.print(".");
		writer.print("</cit-tl>");
		writer.close();
		bibCittl = getInfo();
		shouldTextBeMissed = true;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterBibJournal(LaTEXParser.BibJournalContext)
	 */
	@Override
	public void enterBibJournal(LaTEXParser.BibJournalContext ctx) {
		if (!shouldItemBeAddedToXML)
		{
			shouldTextBeMissed = true;
			return;
		}

		changeFiles();
		writer.print("<pub-tl>");
		shouldTextBeMissed = false;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitBibJournal(LaTEXParser.BibJournalContext)
	 */
	@Override
	public void exitBibJournal(LaTEXParser.BibJournalContext ctx) {
		if (!shouldItemBeAddedToXML)
		{
			shouldTextBeMissed = true;
			return;
		}

		writer.print("</pub-tl>");
		writer.close();
		bibPubtl = getInfo();
		shouldTextBeMissed = true;
	}
	
	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterBibPublisher(LaTEXParser.BibPublisherContext)
	 */
	@Override 
	public void enterBibPublisher(LaTEXParser.BibPublisherContext ctx) 
	{
		if (!shouldItemBeAddedToXML)
		{
			shouldTextBeMissed = true;
			return;
		}
	}
	
	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitBibPublisher(LaTEXParser.BibPublisherContext)
	 */
	@Override 
	public void exitBibPublisher(LaTEXParser.BibPublisherContext ctx) 
	{
		if (!shouldItemBeAddedToXML)
		{
			shouldTextBeMissed = true;
			return;
		}
	}
	
	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterBibVolume(LaTEXParser.BibVolumeContext)
	 */
	@Override
	public void enterBibVolume(LaTEXParser.BibVolumeContext ctx) {
		if (!shouldItemBeAddedToXML)
		{
			shouldTextBeMissed = true;
			return;
		}
		changeFiles();
		writer.print("<vol>");
		shouldTextBeMissed = false;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitBibVolume(LaTEXParser.BibVolumeContext)
	 */
	@Override
	public void exitBibVolume(LaTEXParser.BibVolumeContext ctx) {
		if (!shouldItemBeAddedToXML)
		{
			shouldTextBeMissed = true;
			return;
		}
		writer.print("</vol> &colon;");
		writer.close();
		bibVol = getInfo();
		shouldTextBeMissed = true;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterBibPages(LaTEXParser.BibPagesContext)
	 */
	@Override
	public void enterBibPages(LaTEXParser.BibPagesContext ctx) {
		if (!shouldItemBeAddedToXML)
		{
			shouldTextBeMissed = true;
			return;
		}
		changeFiles();
		writer.print("<pages>");
		shouldTextBeMissed = false;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitBibPages(LaTEXParser.BibPagesContext)
	 */
	@Override
	public void exitBibPages(LaTEXParser.BibPagesContext ctx) {
		if (!shouldItemBeAddedToXML)
		{
			shouldTextBeMissed = true;
			return;
		}
		writer.print("</pages>");
		writer.close();
		bibPages = getInfo();
		shouldTextBeMissed = true;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterOnePage(LaTEXParser.OnePageContext)
	 */
	@Override
	public void enterOnePage(LaTEXParser.OnePageContext ctx) {
		if (!shouldItemBeAddedToXML)
		{
			shouldTextBeMissed = true;
			return;
		}
		
		writer.print("<fpage>");
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitOnePage(LaTEXParser.OnePageContext)
	 */
	@Override
	public void exitOnePage(LaTEXParser.OnePageContext ctx) {
		if (!shouldItemBeAddedToXML)
		{
			shouldTextBeMissed = true;
			return;
		}
		writer.print("</fpage>");
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterListPages(LaTEXParser.ListPagesContext)
	 */
	@Override
	public void enterListPages(LaTEXParser.ListPagesContext ctx) {
		if (!shouldItemBeAddedToXML)
		{
			shouldTextBeMissed = true;
			return;
		}
		
		writer.print("<fpage>" + ctx.simpleText(0).getText()
				+ "</fpage>&ndash;<lpage>" + ctx.simpleText(1).getText()
				+ "</lpage>");
		shouldTextBeMissed = true;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitListPages(LaTEXParser.ListPagesContext)
	 */
	@Override
	public void exitListPages(LaTEXParser.ListPagesContext ctx) {
		if (!shouldItemBeAddedToXML)
		{
			shouldTextBeMissed = true;
			return;
		}
		shouldTextBeMissed = false;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterBibLabel(LaTEXParser.BibLabelContext)
	 */
	@Override
	public void enterBibLabel(LaTEXParser.BibLabelContext ctx) {
		if (!shouldItemBeAddedToXML)
		{
			shouldTextBeMissed = true;
			return;
		}
		shouldTextBeMissed = true;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitBibLabel(LaTEXParser.BibLabelContext)
	 */
	@Override
	public void exitBibLabel(LaTEXParser.BibLabelContext ctx) {
		if (!shouldItemBeAddedToXML)
		{
			shouldTextBeMissed = true;
			return;
		}
		shouldTextBeMissed = false;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterBibOther(LaTEXParser.BibOtherContext)
	 */
	@Override
	public void enterBibOther(LaTEXParser.BibOtherContext ctx) {
		shouldTextBeMissed = true;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterBibBookTiltle(LaTEXParser.BibBookTiltleContext)
	 */
	@Override 
	public void enterBibBookTiltle(LaTEXParser.BibBookTiltleContext ctx) 
	{
		shouldTextBeMissed = true;
	}
	
	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterBibItem(LaTEXParser.BibItemContext)
	 */
	@Override
	public void enterBibItem(LaTEXParser.BibItemContext ctx) {
		startRefs();

		++bibRefCounter;
		writer.print("\n<cit id=\"ref" + bibRefCounter + "\" num=\""
				+ bibRefCounter + "\" type=\"journal\">");
		skipData = writer;
	}
	
	/**
	 * Start refs.
	 */
	private void startRefs()
	{
		if (wasAcknowledgement) 
		{
			writer.print("</acks>");
			wasAcknowledgement = false;
		}

		if (bibRefCounter == 0)
			writer.print("<refs><title>References</title>");
		
		shouldTextBeMissed = true;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitBibItem(LaTEXParser.BibItemContext)
	 */
	@Override
	public void exitBibItem(LaTEXParser.BibItemContext ctx) {
		writer.print("</cit>");
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterBibItemAuthor(LaTEXParser.BibItemAuthorContext)
	 */
	@Override
	public void enterBibItemAuthor(LaTEXParser.BibItemAuthorContext ctx) {
		String result = "";
		int j = 0;
		for (j = 0; j < ctx.authorText().size(); ++j)
			if (ctx.authorText(j).getText().length() >= 2)
				break;

		if (ctx.authorText().size() > 1) 
		{
			result = "<author><surname>" + ctx.authorText(j).getText();
			result += "</surname>";
			System.out.println(ctx.authorText(j).getText());
			result += "<initial>";
			result += ctx.authorText(j + 1).getText();
			result += "</initial>";
			result += "</author>";
		} else
			result += "<etal/>";
		writer.print(result);
		shouldTextBeMissed = true;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitBibItemAuthor(LaTEXParser.BibItemAuthorContext)
	 */
	@Override
	public void exitBibItemAuthor(LaTEXParser.BibItemAuthorContext ctx) {
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterBibItemYear(LaTEXParser.BibItemYearContext)
	 */
	@Override
	public void enterBibItemYear(LaTEXParser.BibItemYearContext ctx) {
		writer.print("&lpar;");
		writer.print("<date>");
		writer.print("<year>");
		writer.print(ctx.numbers().getText());
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitBibItemYear(LaTEXParser.BibItemYearContext)
	 */
	@Override
	public void exitBibItemYear(LaTEXParser.BibItemYearContext ctx) {
		writer.print("</year>");
		writer.print("</date>");
		writer.print("&rpar;");
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterBibItemCittl(LaTEXParser.BibItemCittlContext)
	 */
	@Override
	public void enterBibItemCittl(LaTEXParser.BibItemCittlContext ctx) {
		writer.print("<cit-tl>");
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitBibItemCittl(LaTEXParser.BibItemCittlContext)
	 */
	@Override
	public void exitBibItemCittl(LaTEXParser.BibItemCittlContext ctx) {
		writer.print("</cit-tl>");
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterBibItemPubTtl(LaTEXParser.BibItemPubTtlContext)
	 */
	@Override
	public void enterBibItemPubTtl(LaTEXParser.BibItemPubTtlContext ctx) {
		writer.print("<pub-tl>");
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterPubTitleText(LaTEXParser.PubTitleTextContext)
	 */
	@Override
	public void enterPubTitleText(LaTEXParser.PubTitleTextContext ctx) {
		writer.print(ctx.getText());
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitBibItemPubTtl(LaTEXParser.BibItemPubTtlContext)
	 */
	@Override
	public void exitBibItemPubTtl(LaTEXParser.BibItemPubTtlContext ctx) {
		writer.print("</pub-tl>");
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterBibItemVol(LaTEXParser.BibItemVolContext)
	 */
	@Override
	public void enterBibItemVol(LaTEXParser.BibItemVolContext ctx) {
		writer.print("<vol>");
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitBibItemVol(LaTEXParser.BibItemVolContext)
	 */
	@Override
	public void exitBibItemVol(LaTEXParser.BibItemVolContext ctx) {
		writer.print("</vol>");
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterBibItemPages(LaTEXParser.BibItemPagesContext)
	 */
	@Override
	public void enterBibItemPages(LaTEXParser.BibItemPagesContext ctx) {
		writer.print("<pages>");
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitBibItemPages(LaTEXParser.BibItemPagesContext)
	 */
	@Override
	public void exitBibItemPages(LaTEXParser.BibItemPagesContext ctx) {
		writer.print("</pages>");
		writer.print("&colon;");
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterColon(LaTEXParser.ColonContext)
	 */
	@Override
	public void enterColon(LaTEXParser.ColonContext ctx) {
		if(shouldTextBeMissed)
			return;
		
		writer.print("&colon;");
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterAlgorithmBlock(LaTEXParser.AlgorithmBlockContext)
	 */
	@Override
	public void enterAlgorithmBlock(LaTEXParser.AlgorithmBlockContext ctx) {
		wasAlgorithmDeclared = true;
		++algorithmCounter;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitAlgorithmBlock(LaTEXParser.AlgorithmBlockContext)
	 */
	@Override
	public void exitAlgorithmBlock(LaTEXParser.AlgorithmBlockContext ctx) {
		wasAlgorithmDeclared = false;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterInput(LaTEXParser.InputContext)
	 */
	@Override
	public void enterInput(LaTEXParser.InputContext ctx) {
		paragraphStarter();
		writer.print("<emph type=\"bold\">Input&colon;</emph>");
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitInput(LaTEXParser.InputContext)
	 */
	@Override
	public void exitInput(LaTEXParser.InputContext ctx) {
		paragraphCloser();
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterOutput(LaTEXParser.OutputContext)
	 */
	@Override
	public void enterOutput(LaTEXParser.OutputContext ctx) {
		paragraphStarter();
		writer.print("<emph type=\"bold\">Output&colon;</emph>");
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitOutput(LaTEXParser.OutputContext)
	 */
	@Override
	public void exitOutput(LaTEXParser.OutputContext ctx) {
		paragraphCloser();
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterState(LaTEXParser.StateContext)
	 */
	@Override
	public void enterState(LaTEXParser.StateContext ctx) {
		paragraphStarter();
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitState(LaTEXParser.StateContext)
	 */
	@Override
	public void exitState(LaTEXParser.StateContext ctx) {
		paragraphCloser();
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterForBlock(LaTEXParser.ForBlockContext)
	 */
	@Override
	public void enterForBlock(LaTEXParser.ForBlockContext ctx) {
		paragraphStarter();
		writer.print("<emph type=\"bold\">for</emph>");
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitForBlock(LaTEXParser.ForBlockContext)
	 */
	@Override
	public void exitForBlock(LaTEXParser.ForBlockContext ctx) {
		writer.print("<emph type=\"bold\">do</emph>");
		paragraphCloser();
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterIfBlock(LaTEXParser.IfBlockContext)
	 */
	@Override
	public void enterIfBlock(LaTEXParser.IfBlockContext ctx) {
		paragraphStarter();
		writer.print("<emph type=\"bold\">if</emph>");
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitIfBlock(LaTEXParser.IfBlockContext)
	 */
	@Override
	public void exitIfBlock(LaTEXParser.IfBlockContext ctx) {
		writer.print("<emph type=\"bold\">then</emph>");
		paragraphCloser();
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterReturnBlock(LaTEXParser.ReturnBlockContext)
	 */
	@Override
	public void enterReturnBlock(LaTEXParser.ReturnBlockContext ctx) {
		paragraphStarter();
		writer.print("<emph type=\"bold\">retunr</emph>");
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitReturnBlock(LaTEXParser.ReturnBlockContext)
	 */
	@Override
	public void exitReturnBlock(LaTEXParser.ReturnBlockContext ctx) {
		paragraphCloser();
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitDocumentDeclaration(LaTEXParser.DocumentDeclarationContext)
	 */
	@Override
	public void exitDocumentDeclaration(
			LaTEXParser.DocumentDeclarationContext ctx) {
		sectionCloser();
		bibliographyCloser();
		writer.print("</article></doc>");
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#enterIfThenElse(LaTEXParser.IfThenElseContext)
	 */
	@Override
	public void enterIfThenElse(LaTEXParser.IfThenElseContext ctx) {
		shouldTextBeMissed = true;
	}

	/* (non-Javadoc)
	 * @see LaTEXBaseListener#exitIfThenElse(LaTEXParser.IfThenElseContext)
	 */
	@Override
	public void exitIfThenElse(LaTEXParser.IfThenElseContext ctx) {
		shouldTextBeMissed = false;
	}

}