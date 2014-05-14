import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

import org.antlr.v4.runtime.misc.NotNull;

public class LaTEXtoXML extends LaTEXBaseListener {

	private PrintWriter writer;

	private int sectionCounter;
	private int subsectionCounter;
	private int subsubsectionCounter;
	private int wasSectionCounter;

	private boolean wasAbstract;
	private boolean wasAbstractText;

	private int paragraphCounter;

	private boolean wasLink;
	private boolean wasItalic;

	private HashMap<String, Integer> citeReferences;
	private int citeCounter;

	LaTEXtoXML(LaTEXParser parser, PrintWriter writer) {
		this.writer = writer;

		sectionCounter = 0;
		subsectionCounter = 0;
		subsubsectionCounter = 0;

		wasSectionCounter = 0;

		wasAbstract = false;
		wasAbstractText = false;

		paragraphCounter = 0;		

		wasLink = false;
		wasItalic = false;

		citeReferences = new HashMap<String, Integer>();
		citeCounter = 0;
	}

	@Override
	public void enterSectionDeclaration(
			LaTEXParser.SectionDeclarationContext ctx) {
		sectionCloser();
		String title = ctx.simpleText().getText();
		if (title.equals("Abstract")) {
			writer.print("<abstract>");
			wasAbstract = true;
			wasAbstractText = true;
			return;
		}

		if (sectionCounter == 0) {
			writer.print("</front>");
			writer.print("<body>");
		}

		++sectionCounter;
		writer.print("<section level=\"1\" id=\"section" + sectionCounter
				+ "\">");
		writer.print("<title>");
	}

	@Override
	public void exitSectionDeclaration(LaTEXParser.SectionDeclarationContext ctx) {
		if (!wasAbstract)
			writer.print("</title>");
	}

	@Override
	public void enterSubsectionDeclaration(
			LaTEXParser.SubsectionDeclarationContext ctx) {
		while (subsectionCounter > 0) {
			writer.print("</section>");
			--subsectionCounter;
		}
		++subsectionCounter;
		writer.print("<section level=\"2\" id=\"section" + sectionCounter
				+ "\">");
		writer.print("<title>");
	}

	@Override
	public void exitSubsectionDeclaration(
			LaTEXParser.SubsectionDeclarationContext ctx) {
		writer.print("</title>");
		paragraphStarter();
	}

	@Override
	public void enterSubsubsectionDeclaration(
			LaTEXParser.SubsubsectionDeclarationContext ctx) {
		while (subsubsectionCounter > 0) {
			writer.print("</section>");
			--subsubsectionCounter;
		}

		++subsubsectionCounter;
		writer.print("<section level=\"3\" id=\"section" + sectionCounter
				+ "\">");
		writer.print("<title>");
	}

	@Override
	public void exitSubsubsectionDeclaration(
			LaTEXParser.SubsubsectionDeclarationContext ctx) {
		writer.println("</title>");
		paragraphStarter();
	}

	private void sectionCloser() {
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
		if (wasAbstract) {
			writer.print("</abstract>");
			wasAbstract = false;
			return;
		}
	}

	@Override
	public void enterReferencesList(
			@NotNull LaTEXParser.ReferencesListContext ctx) {
		int ctxSize = ctx.simpleText().size();

		for (int i = 0; i < ctxSize; ++i)
			if (!citeReferences.containsKey(ctx.simpleText(i).getText())) {
				++citeCounter;
				citeReferences.put(ctx.simpleText(i).getText(), citeCounter);
			}
		
		ArrayList<Integer> sortedNumbers = new ArrayList<Integer>();
		
		int number = 0;
		for (int i = 0; i < ctxSize; ++i) 
		{
			number = citeReferences.get(ctx.simpleText(i).getText());
			sortedNumbers.add(number);
		}
		Collections.sort(sortedNumbers);
		
		int beginIndex = 0;
		for (int i = 0; i < sortedNumbers.size() - 2; ++i)
			if(sortedNumbers.get(i)+1 == sortedNumbers.get(i+1) && sortedNumbers.get(i+1)+1 == sortedNumbers.get(i+2))
			{
				beginIndex = i;
				break;
			}
		
		int endIndex = 0;
		for (int i = sortedNumbers.size()-1; i > 1; --i)
			if(sortedNumbers.get(i)-1 == sortedNumbers.get(i-1) && sortedNumbers.get(i-1)-1 == sortedNumbers.get(i-2))
			{
				endIndex = i;
				break;
			}		
		
		writer.print("<citref rids=\"");

		for (int i = 0; i < sortedNumbers.size(); ++i) 
		{
			number = sortedNumbers.get(i);
			if (i == (ctxSize - 1))
				writer.print("ref" + number);
			else
				writer.print("ref" + number + " ");
		}
		writer.print("\">");
		
		for (int i = 0; i < sortedNumbers.size(); ++i) {
			number = sortedNumbers.get(i);
			if((beginIndex!=endIndex) && i == beginIndex)
			{
				writer.print(number+"&ndash;");
				i = endIndex-1;
				continue;
			}
			
			if (i == (sortedNumbers.size() - 1))
				writer.print(number);
			else
				writer.print(number + ",");
		}
		writer.print("</citref>");
		wasLink = true;
	}

	@Override
	public void exitReferencesList(
			@NotNull LaTEXParser.ReferencesListContext ctx) {

	}

	@Override
	public void exitReferences(LaTEXParser.ReferencesContext ctx) {
		wasLink = false;
	}

	@Override
	public void enterDocumentBodyDeclaration(
			LaTEXParser.DocumentBodyDeclarationContext ctx) {
		writer.print("<doc>");
		writer.print("<front>");
	}

	@Override
	public void exitDocumentBodyDeclaration(
			LaTEXParser.DocumentBodyDeclarationContext ctx) {
		sectionCloser();
		writer.print("</body>");
		writer.print("</doc>");
	}

	@Override
	public void enterItalictypeDeclaration(
			LaTEXParser.ItalictypeDeclarationContext ctx) {
		writer.print("<italic>");
	}

	@Override
	public void exitItalictypeDeclaration(
			LaTEXParser.ItalictypeDeclarationContext ctx) {
		writer.print("</italic>");
	}

	@Override public void enterItalicDollar(@NotNull LaTEXParser.ItalicDollarContext ctx)
	{
		if(wasItalic)
		{
			writer.print("</italic>");
			wasItalic = false;
		}
		else
		{
			writer.print("<italic>");
			wasItalic = true;
		}
	}
	
	@Override
	public void enterSimpleText(LaTEXParser.SimpleTextContext ctx) {
		if (wasLink)
			return;

		if (wasAbstractText) {
			wasAbstractText = false;
			return;
		}
		writer.print(ctx.getText());
	}

	@Override public void enterParagraph(@NotNull LaTEXParser.ParagraphContext ctx) 
	{
		paragraphStarter();
	}
	
	@Override public void exitParagraph(@NotNull LaTEXParser.ParagraphContext ctx) 
	{
		writer.println("</p>");
	}
	
	private void paragraphStarter() 
	{
		++paragraphCounter;
		writer.print("<p id=\"para" + paragraphCounter + "\">");
	}

	@Override
	public void enterLeftBrace(@NotNull LaTEXParser.LeftBraceContext ctx) {
		writer.print("&lpar;");
	}

	@Override
	public void enterRightBrace(@NotNull LaTEXParser.RightBraceContext ctx) {
		writer.print("&rpar;");
	}

	@Override
	public void enterHyphen(@NotNull LaTEXParser.HyphenContext ctx) {
		writer.print("&hyphen;");
	}

	@Override
	public void enterApostrophe(@NotNull LaTEXParser.ApostropheContext ctx) {
		writer.print("&apos;");
	}

}
