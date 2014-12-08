/*
 * 
 */

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import javax.swing.*;
import java.io.*;
import java.util.HashMap;

// TODO: Auto-generated Javadoc

/**
 * The Class Translator.
 */
public class Translator {

    /**
     * The commands.
     */
    private static HashMap<String, String> commands;

    /**
     * The writer.
     */
    public static PrintWriter writer;

    /**
     * The iso trie.
     */
    protected static HashMap<String, String> isoTrie;

    /**
     * The bib references.
     */
    public static HashMap<String, Integer> bibReferences;

    /**
     * The dir.
     */
    private String dir;

    /**
     * The tex file.
     */
    protected static String texFile;

    /**
     * The meta data file.
     */
    protected static String metaDataFile;

    /**
     * Instantiates a new translator.
     *
     * @param dirPath the path to the directory with all necessary files
     * @throws Exception the exception
     */
    Translator(String dirPath) throws Exception {
        dir = dirPath;
        getFilesNames(dir);
        writer = new PrintWriter(MainWindow.mainPath
                + "/LaTEXtoXML/bodyAndBottom.xml");
        createIsoTree();
        getBibReferences(texFile);
        if (changeMainFile(texFile)) {
            ToXML.skipData.close();
            ToXML.writer.close();
            FrontmatterCreator front = new FrontmatterCreator(metaDataFile);
            front.run();
        } else {
            System.out.println("Eror see log file");
        }
    }

    /**
     * Gets the files names.
     *
     * @param dirPath the dir path
     * @return the files names
     */
    private void getFilesNames(String dirPath) {
        File directory = new File(dirPath);
        File[] files = directory.listFiles();
        String tex = "";
        metaDataFile = "";
        for (File file : files) {
            String fileName = file.getName();
            String type = fileName.substring(fileName.length() - 4,
                    fileName.length());
            if (type.equals(".tex")) {
                tex = file.getPath();
            } else if (type.equals(".xml")) {
                metaDataFile = file.getPath();
            }
        }
        texFile = tex;
    }

    /**
     * Creates the iso - xml map trie.
     *
     * @throws Exception the exception
     */
    private void createIsoTree() throws Exception {
        isoTrie = new HashMap<String, String>();
        InputStream is = getClass().getResourceAsStream("ISOENT.csv");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader reader = new BufferedReader(isr);
        String line = "";
        while ((line = reader.readLine()) != null) {
            String[] entity = line.split(",");
            isoTrie.put(entity[0], entity[1]);
        }
        reader.close();
    }

    /**
     * Gets the bib references.
     *
     * @param inputFile the input file
     * @return the bib references
     * @throws Exception the exception
     */
    private void getBibReferences(String inputFile) throws Exception {
        bibReferences = new HashMap<String, Integer>();
        StringBuilder referenceString = new StringBuilder();
        StringBuilder documentText = new StringBuilder();

        InputStream is = new FileInputStream(inputFile);
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        String line = "";
        while ((line = reader.readLine()) != null) {
            if (uselessLine(line))
                continue;
            line.replace("\n", "");
            documentText.append(line);
        }
        is.close();
        cutReferencesFromText(documentText, referenceString);
        String listWithouWhiteSpaces = referenceString.toString().replace(" ",
                "");
        createBibRefList(listWithouWhiteSpaces);
    }

    /**
     * Cut references from text.
     *
     * @param text            the text
     * @param referenceString the reference string
     */
    private void cutReferencesFromText(StringBuilder text,
                                       StringBuilder referenceString) {
        String[] references = {"\\cite{", "\\citep{", "\\citet{",
                "\\citemain{"};
        for (String ref : references) {
            StringBuilder textCopy = text;
            boolean nextLine = false;
            while (textCopy.indexOf(ref) != -1 || nextLine) {
                int startIndex = textCopy.indexOf(ref);
                int finishIndex = textCopy.substring(startIndex).indexOf("}")
                        + startIndex;
                if (textCopy.substring(startIndex).indexOf("}") == -1)
                    nextLine = true;
                else
                    nextLine = false;
                referenceString.append(textCopy.substring(
                        startIndex + ref.length(), finishIndex));
                referenceString.append(",");
                textCopy = new StringBuilder(textCopy.substring(finishIndex));
            }
        }
    }

    /**
     * Creates the bib ref list.
     *
     * @param refList the ref list
     */
    private void createBibRefList(String refList) {
        String[] references = refList.split(",");
        int counter = 0;
        for (String ref : references) {
            if (!bibReferences.containsKey(ref))
                bibReferences.put(ref, ++counter);
        }
    }

    /**
     * Change main file.
     *
     * @param inputFile the input file
     * @return true, if successful
     * @throws Exception the exception
     */
    private boolean changeMainFile(String inputFile) throws Exception {
        commands = new HashMap<String, String>();
        getCommandsNames(inputFile);
        createMainFile(inputFile);

        if (!createBackMatterFile(inputFile))
            return false;

        getBackmatterData(MainWindow.mainPath + "/LaTEXtoXML/backmatter.tex");
        bodyProcessing(MainWindow.mainPath + "/LaTEXtoXML/mainFile.tex");

        return true;
    }

    /**
     * Gets the commands names.
     *
     * @param inputFile the input file
     * @return the commands names
     * @throws Exception the exception
     */
    private void getCommandsNames(String inputFile) throws Exception {
        createNewCommandsFile(inputFile);
        InputStream is = new FileInputStream(MainWindow.mainPath
                + "/LaTEXtoXML/newCommands.tex");
        ANTLRInputStream mainInput = new ANTLRInputStream(is);
        LaTEXLexer mainLexer = new LaTEXLexer(mainInput);
        CommonTokenStream mainTokens = new CommonTokenStream(mainLexer);
        LaTEXParser mainParser = new LaTEXParser(mainTokens);
        ParseTree mainTree = mainParser.compilationUnit();// parse

        ParseTreeWalker walker = new ParseTreeWalker(); // create standard

        ToXML translator = new ToXML(null, false, commands);
        walker.walk(translator, mainTree); // initiate walk of tree with
        commands.remove("");
    }

    /**
     * Creates the new commands file.
     *
     * @param inputFile the input file
     * @throws Exception the exception
     */
    private void createNewCommandsFile(String inputFile) throws Exception {
        InputStream is = new FileInputStream(inputFile);
        File osFile = new File(MainWindow.mainPath
                + "/LaTEXtoXML/newCommands.tex");
        if (osFile.createNewFile()) ;

        PrintWriter os = new PrintWriter(osFile);
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        String line = "";

        while ((line = reader.readLine()) != null)
            if (line.contains("\\newcommand")
                    || line.contains("\\renewcommand"))
                os.println(line);

        os.close();
        is.close();
    }

    /**
     * Creates LaTEX file with body of document for translating to xml with
     * replaced newcommands declarations and inserted or changed bibliography.
     * <p/>
     * Deletes figures and tables from file, so they won't translate with this
     * file.
     *
     * @param inputFile
     * @throws IOException
     */
    private boolean wasBibItemDeclared = false;

    private void createMainFile(String inputFile) throws IOException {
        String dataFile = MainWindow.mainPath + "/LaTEXtoXML/mainFile.tex";
        File file = new File(inputFile);
        PrintWriter os = new PrintWriter(dataFile);

        boolean skip = true;
        boolean skipSection = false;
        boolean wasBibliogrpahyDeclared = false;
        FileInputStream fin = new FileInputStream(file);
        byte fileContent[] = new byte[(int) file.length()];
        fin.read(fileContent);
        String s = new String(fileContent);
        String[] content = s.split("\n");
        for (String line : content) {
            if (line.replace(" ", "").startsWith("%"))
                continue;
            /*
			 * Skips all unnecessary information before document body When
			 * docment body starts it will start to rewrite it
			 */
            if (line.contains("\\begin{document}"))
                skip = false;

			/*
			 * Checks if current line is begining of section
			 */
            if (sectionBegins(line)) {
                skip = false;
                skipSection = false;
                /*
				 * Check if current line is start of figure materials. If it is
				 * than it will skip this section, because we don't need it to
				 * be in body of file
				 */
                String nLine = line.toLowerCase();
                if ((nLine.contains("figure legends")
                        || nLine.contains("figures") || nLine.contains("tables"))) {
                    skip = true;
                    skipSection = true;
                    continue;
                }
            }

            if(supplementarySecionStarted(line))
            {
                skip = false;
                skipSection = false;
            }
            boolean begin = beginMaterial(line);
            if (begin)
                skip = true;

			/*
			 * Here we check if figure or table ends So we can know where
			 * section ends
			 */
            boolean end = endMaterial(line);
            if (end) {
                skip = false;
                continue;
            }

			/*
			 * \\bibliography{parameter} contains the bibliography file name as
			 * parameter We cut out this file name and rewrite it to our main
			 * LaTEX file
			 */
            if (line.contains("\\bibliography{")) {
                String bibFileName = getBibFileName(line);
                writeBibToLaTEX(bibFileName, os);
                wasBibliogrpahyDeclared = true;
                continue;
            }

			/*
			 * If line
			 */
            if (line.contains("\\bibitem{")) {
                skip = false;
                wasBibliogrpahyDeclared = true;
            }

            if (!skip && !skipSection)
                os.println(replaceCommandIfFound(line));
			/*
			 * If bibliography started then we should skip all unnecessary
			 * information between \\begin{thebibliography} and first
			 * bibliography item
			 */
            if (line.contains("\\begin{thebibliography}")) {
                skip = true;
                wasBibliogrpahyDeclared = true;
            }
        }
		/*
		 * If bibliography was not declared so we have to throw error, because
		 * we can't find bibliography file
		 */
        if (!wasBibliogrpahyDeclared)
            JOptionPane.showMessageDialog(null,
                    "[ERROR]: Bibliography declaration missing");

        os.println("\\end{document}");
        os.close();
    }

    private boolean sectionBegins(String line) {
        if (line.contains("\\section*") || line.contains("\\section"))
            return true;
        return false;
    }

    /**
     * @param line Checks if the line is a comment or an empty
     * @return
     */
    private boolean uselessLine(String line) {
        if (line.replace(" ", "").startsWith("%")
                || line.replace(" ", "").isEmpty())
            return true;
        return false;
    }

    /**
     * Begin material.
     *
     * @param line the line
     * @return true, if successful
     */
    private boolean beginMaterial(String line) {
        if (line.contains("\\begin{figure*}")
                || line.contains("\\begin{figure}")
                || line.contains("\\begin{suppfigure}")
                || line.contains("\\begin{suppfigure*}")
                || line.contains("\\begin{table}")
                || line.contains("\\begin{table*}"))
            return true;
        return false;
    }

    /**
     * End material.
     *
     * @param line the line
     * @return true, if successful
     */
    private boolean endMaterial(String line) {
        if (line.contains("\\end{figure*}") || line.contains("\\end{figure}")
                || line.contains("\\end{suppfigure}")
                || line.contains("\\end{suppfigure*}")
                || line.contains("\\end{table}")
                || line.contains("\\end{table*}"))
            return true;
        return false;
    }

    /**
     * Gets the bib file name.
     *
     * @param line the line
     * @return the bib file name
     */
    private String getBibFileName(String line) {
        int first = line.indexOf("\\bibliography{") + 14;
        int last = line.indexOf("}");
        return line.substring(first, last);
    }

    /**
     * Write bib to LaTex main body file.
     *
     * @param fileName the bibliography file name
     * @param os       the stream in which bib is written
     * @throws IOException Signals that an I/O exception has occurred.
     */
    private void writeBibToLaTEX(String fileName, PrintWriter os)
            throws IOException {
        String bibPath = "";

        bibPath = getProperBibFileName(fileName);
        rewriteBibToLaTEX(bibPath, os);
    }

    /**
     * Check if file name contains type of file in the end If not then it should
     * add it to the end of file name
     *
     * @param fileName
     * @return
     */
    private String getProperBibFileName(String fileName) {
        if (fileName.contains(".bbl"))
            return dir + "\\" + fileName.toLowerCase();
        else
            return (dir + "\\" + fileName.toLowerCase() + ".bib");
    }

    /**
     * Rewrites bibliography file to LaTEX main file
     *
     * @param bibPath
     * @param os
     * @throws IOException
     */
    private void rewriteBibToLaTEX(String bibPath, PrintWriter os)
            throws IOException {
        InputStream is = null;
        is = new FileInputStream(bibPath);
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        String line = "";
        while ((line = reader.readLine()) != null)
            os.println(line);
        is.close();
    }

    /**
     * Replace LaTex command if found in the line.
     *
     * @param line the line
     * @return the line with replaced command equivalents
     */
    private String replaceCommandIfFound(String line) {
        String res = line;
        for (String key : commands.keySet()) {
            String replaceString = commands.get(key);
            if (line.contains(key + " ") || line.contains(key + "\n")
                    || line.endsWith(key))
                line = res = line.replace(key,
                        replaceString.substring(1, replaceString.length() - 2));
        }
        return res;
    }

    /**
     * Creates the back matter file.
     *
     * @param inputFile the input file
     * @return true, if successful
     * @throws Exception the exception
     */
    private boolean createBackMatterFile(String inputFile) throws Exception {
        InputStream is = new FileInputStream(inputFile);
        String dataFile = MainWindow.mainPath + "/LaTEXtoXML/backmatter.tex";
        PrintWriter os = new PrintWriter(dataFile);
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));

        String line = "";
        boolean wasBackmatterDeclared = false;
        os.println("\\begin{document}");

        while ((line = reader.readLine()) != null) {
            if (line.replaceAll(" ", "").startsWith("%"))
                continue;

            if (beginMaterial(line))
                wasBackmatterDeclared = true;

            if (endMaterial(line)) {
                wasBackmatterDeclared = false;
                os.println(line);
            }

            if (wasBackmatterDeclared)
                os.println(line);
        }
        os.println("\\end{document}");
        os.close();
        is.close();

        return true;
    }

    /**
     * Supplementary secion started.
     *
     * @param line the line
     * @return true, if successful
     */
    private boolean supplementarySecionStarted(String line) {
        line = line.toLowerCase();
        if ((line.contains("\\section*") && (line
                .contains("supporting information")))
                || (line.contains("\\renewcommand") && line
                .contains("s\\arabic")))
            return true;
        return false;
    }

    /**
     * Gets the backmatter data.
     *
     * @param inputFile the input file
     * @return the backmatter data
     * @throws Exception the exception
     */
    private void getBackmatterData(String inputFile) throws Exception {
        InputStream is = new FileInputStream(inputFile);
        ANTLRInputStream mainInput = new ANTLRInputStream(is);
        LaTEXLexer mainLexer = new LaTEXLexer(mainInput);
        CommonTokenStream mainTokens = new CommonTokenStream(mainLexer);
        LaTEXParser mainParser = new LaTEXParser(mainTokens);
        ParseTree mainTree = mainParser.compilationUnit();// parse

        ParseTreeWalker walker = new ParseTreeWalker(); // create standard
        boolean getBackData = true;
        ToXML translator = new ToXML(writer, getBackData, null);
        walker.walk(translator, mainTree); // initiate walk of tree with
        // listener
    }

    /**
     * Body processing.
     *
     * @param inputFile the input file
     * @throws Exception the exception
     */
    private void bodyProcessing(String inputFile) throws Exception {
        InputStream is = new FileInputStream(inputFile);
        ANTLRInputStream mainInput = new ANTLRInputStream(is);
        LaTEXLexer mainLexer = new LaTEXLexer(mainInput);
        CommonTokenStream mainTokens = new CommonTokenStream(mainLexer);
        LaTEXParser mainParser = new LaTEXParser(mainTokens);
        ParseTree mainTree = mainParser.compilationUnit();// parse
        ParseTreeWalker walker = new ParseTreeWalker(); // create standard

        writer = new PrintWriter(MainWindow.mainPath
                + "/LaTEXtoXML/bodyAndBottom.xml");
        ToXML translator = new ToXML(writer, false, null);
        walker.walk(translator, mainTree); // initiate walk of tree with
        // listener
        writer.close();
    }

}
