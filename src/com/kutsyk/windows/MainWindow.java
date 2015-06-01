package com.kutsyk.windows;

import com.kurpiak.styling.StyledDocument;
import com.kutsyk.TextEditor.TextLineNumber;
import com.kutsyk.convertors.Translator;
import org.bounce.text.LineNumberMargin;
import org.bounce.text.ScrollableEditorPanel;
import org.bounce.text.xml.XMLEditorKit;
import org.bounce.text.xml.XMLFoldingMargin;
import org.bounce.text.xml.XMLStyleConstants;
import org.w3c.dom.Node;
import org.w3c.dom.bootstrap.DOMImplementationRegistry;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;
import org.xml.sax.InputSource;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.*;
import javax.xml.parsers.DocumentBuilderFactory;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * @author Kutsyk Vasyl
 * The Class MainWindow.
 */


// TODO: Auto-generated Javadoc

/**
 * The Class MainWindow.
 */
public class MainWindow extends JFrame {

    /**
     * The program path
     */
    public static String mainPath = "";
    /**
     * The dir path.
     */
    private static String fullPath = "";
    private static String formulasType = "latex";
    private PrintWriter errorLogFile = null;
    private File dir = new File(mainPath + "/LaTEXtoXML");
    private boolean wasAnyLaTEXProceeded = false;
    private JTextArea console;
    private Thread translationThread;

    /**
     * The iso trie.
     */
    private static HashMap<String, String> isoTrie;
    private JEditorPane xmlEditor = null;
    private XMLEditorKit kit = null;

    public MainWindow() {
        initComponents();
        mainPath = System.getProperty("user.dir");

        initLineTextEditor();
        initLabels();
        initProgressBar();
        redirectSystemStreams();
        createIsoTree();

        initStyling();
        initXMlPane();

        File result = new File(mainPath + "/LaTEXtoXML/resultCopy.xml");
        if (result.exists())
            displayXMlTOPane(result);
    }

    private void initStyling() {
        spliPaneWithDoc.setDividerLocation(0.5);
        xmlFileName.setText("Here will be your xml file name");
    }

    private void initProgressBar() {
        progress.setIndeterminate(true);
        progress.setVisible(false);
    }

    private void redirectSystemStreams() {
        try {
            errorLogFile = new PrintWriter(mainPath + "/errorLogLaTEX.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        console = new JTextArea();
        console.setFont(new Font("Arial", 14, 14));
        console.setEditable(false);
        console.setWrapStyleWord(true);
        console.setDragEnabled(true);
        console.setAutoscrolls(true);

        OutputStream out = new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                errorLogFile.println(String.valueOf((char) b));
            }

            @Override
            public void write(byte[] b, int off, int len) throws IOException {
                errorLogFile.println(new String(b, off, len));
            }
        };
//		System.setOut(new PrintStream(out, true));
//		System.setErr(new PrintStream(out, true));
    }

    /**
     * Clear.
     */
    private void clear() {
        deleteFile("result.xml");
        deleteFile("remaked.xml");
        deleteFile("mainFile.tex");
        deleteFile("bodyAndBottom.xml");
        deleteFile("back.xml");
        deleteFile("back.tex");
        deleteFile("newCommands.tex");

        clearDirectory("bibliography");
        clearDirectory("figures");
        clearDirectory("suppFigures");
        clearDirectory("tables");
    }

    /**
     * Delete file.
     *
     * @param deletedFile the deleted file
     */
    private void deleteFile(String deletedFile) {
        File file = new File(mainPath + "/LaTEXtoXML/" + deletedFile);
        file.deleteOnExit();
    }

    /**
     * Clear directory.
     *
     * @param directoryName the directory name
     */
    private void clearDirectory(String directoryName) {
        File dir = new File(mainPath + "/LaTEXtoXML/" + directoryName);
        if (dir.isDirectory()) {
            File[] files = dir.listFiles();
            for (int i = 0; i < files.length; ++i)
                files[i].deleteOnExit();
        }
        dir.deleteOnExit();
    }

    /**
     * Creates the iso - xml map trie.
     *
     * @throws Exception the exception
     */
    private void createIsoTree() {
        if (isoTrie != null) return;
        BufferedReader reader = null;
        try {
            isoTrie = new HashMap<String, String>();
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(mainPath + "/LaTEXbin/ISOENT.csv"))));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] entity = line.split(",");
                isoTrie.put(entity[0], entity[1]);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (Exception e) {
            }
            ;
        }
    }

    public static HashMap<String, String> getIsoTrie() {
        return isoTrie;
    }

    /**
     * Creates the folders and files if need.
     */
    private void createFoldersAndFilesIfNeed() {
        createFolders();
        createFiles();
    }

    /**
     * Creates the folders.
     */
    private void createFolders() {
        if (dir.mkdir())
            ;

        String[] folders = {"bibliography"};
        File dir = new File(mainPath + "/LaTEXtoXML/");
        if (dir.mkdir())
            ;
        for (int i = 0; i < folders.length; ++i) {
            dir = new File(mainPath + "/LaTEXtoXML/" + folders[i]);
            if (dir.mkdir()) ;
        }
    }

    /**
     * Creates the files.
     */
    private void createFiles() {
        String[] files = {"result.xml", "bodyAndBottom.xml", "mainFile.tex", "back.tex",
                "newCommands.tex"};
        for (String file : files) {
            dir = new File(mainPath + "/LaTEXtoXML/" + file);
            try {
                if (dir.createNewFile())
                    ;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Translate action.
     */
    private void translateAction() {
        clear();
        translationThread = new Thread(new Runnable() {
            public void run() {
                Translator translator;
                try {
                    hasRightStructure(fullPath);
                    translator = new Translator(fullPath);
                    createResult();
                    wasAnyLaTEXProceeded = true;
                    File result = new File(mainPath + "/LaTEXtoXML/result.xml");
                    result.deleteOnExit();
                    if (result.exists()) {
                        displayXMlTOPane(result);
                        progress.setVisible(false);
                    }
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
                JOptionPane.showMessageDialog(null, "Translated");
            }
        });
        translationThread.start();
    }

    private void displayXMlTOPane(File result) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(result));
            StringBuilder xmlString = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null)
                xmlString.append(line + "\n");
            String xml = makeXMLStructured(xmlString.toString());
            PrintWriter writer = new PrintWriter(mainPath + "/LaTEXtoXML/remaked.xml");
            writer.append(xml);
            writer.close();

            File file = new File(mainPath + "/LaTEXtoXML/remaked.xml");
            xmlEditor.read(new FileReader(file), file);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    private void initXMlPane() {
        try {
            xmlEditor = new JEditorPane();
            // Instantiate a XMLEditorKit
            kit = new XMLEditorKit();
            xmlEditor.setEditorKit(kit);
            // Set the font style.
            xmlEditor.setFont(new Font("Courier", Font.PLAIN, 14));

            // Set the tab size
            xmlEditor.getDocument().putProperty(PlainDocument.tabSizeAttribute,
                    new Integer(4));

            // Enable auto indentation.
            kit.setAutoIndentation(true);
            // Enable tag completion.
            kit.setTagCompletion(true);

            // Enable error highlighting.
            xmlEditor.getDocument().putProperty(XMLEditorKit.ERROR_HIGHLIGHTING_ATTRIBUTE, new Boolean(true));

            // Set a style
            kit.setStyle(XMLStyleConstants.ATTRIBUTE_NAME, new Color(0x00, 0x99, 0x00),
                    Font.PLAIN);
            // Put the editor in a panel that will force it to resize, when a different
            // view is choosen.
            ScrollableEditorPanel editorPanel = new ScrollableEditorPanel(xmlEditor);
            JScrollPane scroller = new JScrollPane(editorPanel);
            // Add the number margin and folding margin as a Row Header View
            JPanel rowHeader = new JPanel(new BorderLayout());
            rowHeader.add(new XMLFoldingMargin(xmlEditor), BorderLayout.EAST);
            rowHeader.add(new LineNumberMargin(xmlEditor), BorderLayout.WEST);
            scroller.setRowHeaderView(rowHeader);
            xmlDocumentPane.add(scroller, BorderLayout.CENTER);
        } catch (Throwable e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public String makeXMLStructured(String xml) {
        try {
            final InputSource src = new InputSource(new StringReader(xml));
            final Node document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(src).getDocumentElement();
            final Boolean keepDeclaration = Boolean.valueOf(xml.startsWith("<?xml"));

            //May need this: System.setProperty(DOMImplementationRegistry.PROPERTY,"com.sun.org.apache.xerces.internal.dom.DOMImplementationSourceImpl");
            final DOMImplementationRegistry registry = DOMImplementationRegistry.newInstance();
            final DOMImplementationLS impl = (DOMImplementationLS) registry.getDOMImplementation("LS");
            final LSSerializer writer = impl.createLSSerializer();

            writer.getDomConfig().setParameter("format-pretty-print", Boolean.TRUE); // Set this to true if the output needs to be beautified.
            writer.getDomConfig().setParameter("xml-declaration", keepDeclaration); // Set this to true if the declaration is needed to be outputted.

            return writer.writeToString(document);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Creates the result.
     *
     * @throws IOException Signals that an I/O exception has occurred.
     */
    private void createResult() throws IOException {
        PrintWriter resultXml = new PrintWriter(mainPath
                + "/LaTEXtoXML/result.xml");
        InputStream in = null;
        resultXml.append("<article>");
        writePartToResult(resultXml, in, "bodyAndBottom");
        resultXml.append("</body><back>");
        writePartToResult(resultXml, in, "back");
        resultXml.append("</back>");
        resultXml.append("</article>");
        resultXml.close();
    }

    /**
     * Write part to result.
     *
     * @param resultXml the result xml
     * @param in        the in
     * @param part      the part
     * @throws IOException Signals that an I/O exception has occurred.
     */
    private void writePartToResult(PrintWriter resultXml,
                                   InputStream in, String part) throws IOException {
        in = new FileInputStream(new File(mainPath + "/LaTEXtoXML/" + part
                + ".xml"));
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String line;
        while ((line = reader.readLine()) != null)
            resultXml.print(line);
        in.close();
        reader.close();
    }

    private void directoryChoosed(String fileName) {
        boolean canBeProcced = fileName.endsWith(".tex");
        if (!canBeProcced) {
            System.err
                    .println("[ERROR] : Choose folder that contains all necessary files");
            JOptionPane
                    .showMessageDialog(
                            null,
                            "You choosed directory that doesn't contain all necessary files.",
                            "Folder warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        this.fullPath = fileName;
        xmlFileName.setText(fileName.substring(fileName.lastIndexOf("\\") + 1, fileName.length() - 4) + "result");
        createFoldersAndFilesIfNeed();
        writeDocumentToPane(fileName);
        clearXMLPane();
    }

    private void clearXMLPane(){
        xmlEditor.setText("");
    }

    private void writeDocumentToPane(String fileName) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    new FileInputStream(fileName)));
            String line;
            StringBuilder content = new StringBuilder();
            while ((line = reader.readLine()) != null)
                content.append(line).append('\n');
            reader.close();
            documentText.setText(content.toString());
            documentText.setCaretPosition(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void translateButtonActionPerformed(ActionEvent e) {
        clearXMLPane();
        if (fullPath.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Choose neccesary files");
            return;
        }
        try {
            progress.setVisible(true);
            translateAction();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }

    public TextLineNumber lineNumber;
    private static Highlighter highlighter;

    private void initLabels() {
        Dimension minDim = new Dimension(350, 150);
        documentTab.setMinimumSize(minDim);
    }

    private void initLineTextEditor() {
        documentText.setStyledDocument(StyledDocument.getInstance());
        documentText.setFont(new Font("Arial", 14, 14));
        lineNumber = new TextLineNumber(documentText);
        scrollPane.setRowHeaderView(lineNumber);
    }

    private boolean uselessLine(String line) {
        return line.replace(" ", "").startsWith("%")
                || line.replace(" ", "").isEmpty();
    }

    private boolean hasRightStructure(String inputFile) throws Exception {
        InputStream is = new FileInputStream(inputFile);
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        String line;
        StringBuilder text = new StringBuilder();
        while ((line = reader.readLine()) != null)
            text.append(line + '\n');
        is.close();
        int references = countReferences(text);

        return true;
    }

    private int countReferences(StringBuilder text) {
        Pattern p = Pattern.compile("\\ref");
        Matcher m = p.matcher(text.toString());
        while (m.find()) {
        }
        return 0;
    }

    private void highlightError(int line, int errorType) {
        Document doc = documentText.getDocument();
        Element map = doc.getDefaultRootElement();
        Element startLine = map.getElement(line - 1);

        highlighter = documentText.getHighlighter();
        highlighter.removeAllHighlights();

        DefaultHighlighter.DefaultHighlightPainter painter = new DefaultHighlighter.DefaultHighlightPainter(
                new Color(255, 178, 178));

        try {
            if (errorType == 1)
                console.append("[ERROR]: Figure section found, but figure declaration missing"
                        + "\n");
            if (errorType == 2)
                console.append("[ERROR]: Supporting section found, but supporting materials declaration missing"
                        + "\n");
            highlighter.addHighlight(startLine.getStartOffset(),
                    startLine.getEndOffset(), painter);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
    }

    private void scrollToLine(final int line) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JScrollBar verticalBar = scrollPane.getVerticalScrollBar();
                Document doc = documentText.getDocument();
                Element map = doc.getDefaultRootElement();
                Element l = map.getElement(line - 1);
                documentText.setCaretPosition(l.getStartOffset());
                Rectangle rec = null;
                try {
                    rec = documentText.modelToView(l.getStartOffset());
                    if (rec == null)
                        return;
                    verticalBar.setValue((int) rec.getY());
                } catch (BadLocationException e1) {
                    e1.printStackTrace();
                }
            }

        });
    }

    private void thisWindowClosing(WindowEvent e) {
        closeLogFile();
        clear();
    }

    private void closeLogFile() {
        if (translationThread != null)
            translationThread.stop();
        if (errorLogFile != null)
            errorLogFile.close();
    }

    private void exitItemActionPerformed(ActionEvent e) {
        closeLogFile();
        clear();
        System.exit(0);
    }

    private void helpItemActionPerformed(ActionEvent e) {
        try {
            File sourceFolder = new File(mainPath
                    + "/LaTEXbin/documentation/index.html");
            Desktop.getDesktop().open(sourceFolder);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    private void chooseFileMenuActionPerformed(ActionEvent e) {
        wasAnyLaTEXProceeded = false;
        FileNameExtensionFilter filter = new FileNameExtensionFilter("TEX file", "tex", "tex");
        @SuppressWarnings("serial")
        JFileChooser chooser = new JFileChooser() {
            public void approveSelection() {
                super.approveSelection();
            }
        };
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.addChoosableFileFilter(filter);
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            console.setText("");
            directoryChoosed(chooser.getSelectedFile().getAbsolutePath());
        }
    }

    private void MainWindowResized(ComponentEvent e) {
        spliPaneWithDoc.setDividerLocation(0.5);
    }

    private void saveDocumentButtonActionPerformed(ActionEvent e) {
        try {
            String content = documentText.getText();
            content = content.replaceAll("(?!\\r)\\n", "\n");

            File file = new File(fullPath);
            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    private void saveXmlDocumentActionPerformed(ActionEvent e) {
        if (!wasAnyLaTEXProceeded) {
            JOptionPane.showMessageDialog(null,
                    "You have not proceeded any LaTEX file");
            return;
        }

        int save = JOptionPane.showConfirmDialog(null,
                "Do you want to save this file?", "Close Alert",
                JOptionPane.YES_NO_OPTION);

        if (save == JOptionPane.YES_OPTION) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            fileChooser.setSelectedFile(new File(xmlFileName.getText() + ".xml"));
            fileChooser.showSaveDialog(this);
            File file = fileChooser.getSelectedFile();
            try {
                PrintWriter writer = new PrintWriter(file);
                InputStream in = new FileInputStream(mainPath
                        + "/LaTEXtoXML/result.xml");
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(in));
                String line;
                while ((line = reader.readLine()) != null)
                    writer.print(line);

                in.close();
                writer.close();
            } catch (IOException exp) {
            }
        }
    }

    public static String getFullPath() {
        return fullPath;
    }

    public String getMainPath() {
        return mainPath;
    }

    public static String getFormulasType() {
        return formulasType;
    }

    private void latexRadioButtonActionPerformed(ActionEvent e) {
        formulasType = "latex";
        mathmlRadioButton.setSelected(false);
        imageRadioButton.setSelected(false);
    }

    private void mathmlRadioButtonActionPerformed(ActionEvent e) {
        formulasType = "mathml";
        latexRadioButton.setSelected(false);
        imageRadioButton.setSelected(false);
    }

    private void imageRadioButtonActionPerformed(ActionEvent e) {
        formulasType = "images";
        latexRadioButton.setSelected(false);
        mathmlRadioButton.setSelected(false);
    }

    public static boolean getUseIsoCharSymbolReplacign() {
        return useIsoCharSymbolReplacign.isSelected();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY
        // //GEN-BEGIN:initComponents
        menuBar1 = new JMenuBar();
        MainMenu = new JMenu();
        chooseFileMenu = new JMenuItem();
        helpItem = new JMenuItem();
        exitItem = new JMenuItem();
        spliPaneWithDoc = new JSplitPane();
        documentTab = new JTabbedPane();
        panel7 = new JPanel();
        scrollPane = new JScrollPane();
        documentText = new JTextPane();
        xmlPane = new JTabbedPane();
        xmlDocumentPane = new JPanel();
        tabbedPane1 = new JTabbedPane();
        panel1 = new JPanel();
        translateButton = new JButton();
        saveDocumentButton = new JButton();
        saveXmlDocument = new JButton();
        progress = new JProgressBar();
        panel2 = new JPanel();
        tabbedPane2 = new JTabbedPane();
        panel3 = new JPanel();
        useIsoCharSymbolReplacign = new JCheckBox();
        panel4 = new JPanel();
        xmlFileName = new JTextField();
        label1 = new JLabel();
        button1 = new JButton();
        panel5 = new JPanel();
        latexRadioButton = new JRadioButton();
        mathmlRadioButton = new JRadioButton();
        imageRadioButton = new JRadioButton();

        //======== this ========
        setTitle("LaTEX > XML");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setBackground(Color.white);
        setIconImage(new ImageIcon(getClass().getResource("/images/blue-home-icon.png")).getImage());
        setForeground(Color.white);
        setFont(new Font("Calibri", Font.PLAIN, 14));
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                thisWindowClosing(e);
            }
        });
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                MainWindowResized(e);
            }
        });
        Container contentPane = getContentPane();

        //======== menuBar1 ========
        {

            //======== MainMenu ========
            {
                MainMenu.setText("File");
                MainMenu.setFont(new Font("Calibri", Font.PLAIN, 14));

                //---- chooseFileMenu ----
                chooseFileMenu.setText("Choose file");
                chooseFileMenu.setFont(new Font("Calibri", Font.PLAIN, 14));
                chooseFileMenu.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        chooseFileMenuActionPerformed(e);
                    }
                });
                MainMenu.add(chooseFileMenu);
                MainMenu.addSeparator();

                //---- helpItem ----
                helpItem.setText("Help");
                helpItem.setFont(new Font("Calibri", Font.PLAIN, 14));
                helpItem.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        helpItemActionPerformed(e);
                        helpItemActionPerformed(e);
                    }
                });
                MainMenu.add(helpItem);

                //---- exitItem ----
                exitItem.setText("Exit");
                exitItem.setFont(new Font("Calibri", Font.PLAIN, 14));
                exitItem.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        exitItemActionPerformed(e);
                        exitItemActionPerformed(e);
                    }
                });
                MainMenu.add(exitItem);
            }
            menuBar1.add(MainMenu);
        }
        setJMenuBar(menuBar1);

        //======== spliPaneWithDoc ========
        {
            spliPaneWithDoc.setOneTouchExpandable(true);

            //======== documentTab ========
            {
                documentTab.setFont(new Font("Calibri", Font.PLAIN, 14));

                //======== panel7 ========
                {
                    panel7.setLayout(new BoxLayout(panel7, BoxLayout.X_AXIS));

                    //======== scrollPane ========
                    {

                        //---- documentText ----
                        documentText.setFont(new Font("Calibri", Font.PLAIN, 14));
                        scrollPane.setViewportView(documentText);
                    }
                    panel7.add(scrollPane);
                }
                documentTab.addTab("Document:", panel7);

            }
            spliPaneWithDoc.setLeftComponent(documentTab);

            //======== xmlPane ========
            {
                xmlPane.setFont(new Font("Calibri", Font.PLAIN, 14));

                //======== xmlDocumentPane ========
                {
                    xmlDocumentPane.setLayout(new BorderLayout());
                }
                xmlPane.addTab("XML:", xmlDocumentPane);

            }
            spliPaneWithDoc.setRightComponent(xmlPane);
        }

        //======== tabbedPane1 ========
        {
            tabbedPane1.setFont(new Font("Calibri", Font.PLAIN, 14));

            //======== panel1 ========
            {

                //---- translateButton ----
                translateButton.setText("Translate");
                translateButton.setFont(new Font("Calibri", Font.PLAIN, 14));
                translateButton.setIcon(new ImageIcon(getClass().getResource("/images/blue-document-plus-icon.png")));
                translateButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        translateButtonActionPerformed(e);
                    }
                });

                //---- saveDocumentButton ----
                saveDocumentButton.setText("Save document");
                saveDocumentButton.setFont(new Font("Calibri", Font.PLAIN, 14));
                saveDocumentButton.setIcon(new ImageIcon(getClass().getResource("/images/blue-disk-icon.png")));
                saveDocumentButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        saveDocumentButtonActionPerformed(e);
                    }
                });

                //---- saveXmlDocument ----
                saveXmlDocument.setText("Save xml result");
                saveXmlDocument.setFont(new Font("Calibri", Font.PLAIN, 14));
                saveXmlDocument.setIcon(new ImageIcon(getClass().getResource("/images/blue-disk-icon.png")));
                saveXmlDocument.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        saveXmlDocumentActionPerformed(e);
                    }
                });

                GroupLayout panel1Layout = new GroupLayout(panel1);
                panel1.setLayout(panel1Layout);
                panel1Layout.setHorizontalGroup(
                        panel1Layout.createParallelGroup()
                                .addGroup(panel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(translateButton)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(saveDocumentButton)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(saveXmlDocument)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(progress, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                                        .addContainerGap())
                );
                panel1Layout.setVerticalGroup(
                        panel1Layout.createParallelGroup()
                                .addGroup(panel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(panel1Layout.createParallelGroup()
                                                .addComponent(progress, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(translateButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(saveDocumentButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(saveXmlDocument, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addContainerGap(18, Short.MAX_VALUE))
                );
            }
            tabbedPane1.addTab("Main", panel1);


            //======== panel2 ========
            {
                panel2.setLayout(new BorderLayout());

                //======== tabbedPane2 ========
                {

                    //======== panel3 ========
                    {
                        panel3.setLayout(new BoxLayout(panel3, BoxLayout.X_AXIS));

                        //---- useIsoCharSymbolReplacign ----
                        useIsoCharSymbolReplacign.setText("Replace symbol using ISO standarts");
                        useIsoCharSymbolReplacign.setFont(new Font("Calibri", Font.PLAIN, 14));
                        panel3.add(useIsoCharSymbolReplacign);
                    }
                    tabbedPane2.addTab("ISO", panel3);


                    //======== panel4 ========
                    {

                        //---- xmlFileName ----
                        xmlFileName.setFont(new Font("Calibri", xmlFileName.getFont().getStyle(), 14));

                        //---- label1 ----
                        label1.setText("XML result file name:");
                        label1.setFont(new Font("Calibri", label1.getFont().getStyle(), 14));

                        //---- button1 ----
                        button1.setText("Set name");
                        button1.setFont(new Font("Calibri", button1.getFont().getStyle(), 14));

                        GroupLayout panel4Layout = new GroupLayout(panel4);
                        panel4.setLayout(panel4Layout);
                        panel4Layout.setHorizontalGroup(
                                panel4Layout.createParallelGroup()
                                        .addGroup(panel4Layout.createSequentialGroup()
                                                .addComponent(xmlFileName, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(label1)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(button1)
                                                .addGap(328, 328, 328))
                        );
                        panel4Layout.setVerticalGroup(
                                panel4Layout.createParallelGroup()
                                        .addGroup(panel4Layout.createSequentialGroup()
                                                .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(xmlFileName, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label1)
                                                        .addComponent(button1))
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        );
                    }
                    tabbedPane2.addTab("XML file", panel4);


                    //======== panel5 ========
                    {
                        panel5.setLayout(new BoxLayout(panel5, BoxLayout.X_AXIS));

                        //---- latexRadioButton ----
                        latexRadioButton.setText("LaTEX");
                        latexRadioButton.setFont(new Font("Calibri", Font.PLAIN, 14));
                        latexRadioButton.setSelected(true);
                        latexRadioButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                latexRadioButtonActionPerformed(e);
                            }
                        });
                        panel5.add(latexRadioButton);

                        //---- mathmlRadioButton ----
                        mathmlRadioButton.setText("MathML");
                        mathmlRadioButton.setFont(new Font("Calibri", Font.PLAIN, 14));
                        mathmlRadioButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                mathmlRadioButtonActionPerformed(e);
                            }
                        });
                        panel5.add(mathmlRadioButton);

                        //---- imageRadioButton ----
                        imageRadioButton.setText("Image");
                        imageRadioButton.setFont(new Font("Calibri", Font.PLAIN, 14));
                        imageRadioButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                imageRadioButtonActionPerformed(e);
                            }
                        });
                        panel5.add(imageRadioButton);
                    }
                    tabbedPane2.addTab("Formulas", panel5);

                }
                panel2.add(tabbedPane2, BorderLayout.WEST);
            }
            tabbedPane1.addTab("Settings", panel2);

        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addComponent(tabbedPane1, GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addComponent(spliPaneWithDoc, GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
                                .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addComponent(tabbedPane1, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spliPaneWithDoc, GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE))
        );
        setSize(750, 455);
        setLocationRelativeTo(getOwner());
        // //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY
    // //GEN-BEGIN:variables
    private JMenuBar menuBar1;
    private JMenu MainMenu;
    private JMenuItem chooseFileMenu;
    private JMenuItem helpItem;
    private JMenuItem exitItem;
    private JSplitPane spliPaneWithDoc;
    private JTabbedPane documentTab;
    private JPanel panel7;
    private JScrollPane scrollPane;
    private JTextPane documentText;
    private JTabbedPane xmlPane;
    private JPanel xmlDocumentPane;
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JButton translateButton;
    private JButton saveDocumentButton;
    private JButton saveXmlDocument;
    private JProgressBar progress;
    private JPanel panel2;
    private JTabbedPane tabbedPane2;
    private JPanel panel3;
    private static JCheckBox useIsoCharSymbolReplacign;
    private JPanel panel4;
    private JTextField xmlFileName;
    private JLabel label1;
    private JButton button1;
    private JPanel panel5;
    private JRadioButton latexRadioButton;
    private JRadioButton mathmlRadioButton;
    private JRadioButton imageRadioButton;
    // JFormDesigner - End of variables declaration //GEN-END:variables
}