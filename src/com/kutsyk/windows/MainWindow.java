package com.kutsyk.windows;

import com.kurpiak.styling.StyledDocument;
import com.kutsyk.TextEditor.TextLineNumber;
import com.kutsyk.convertors.Translator;
import org.bounce.text.xml.XMLEditorKit;
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

/*
 * @author Kutsyk Vasyl
 * The Class MainWindow.
 */


// TODO: Auto-generated Javadoc

/**
 * The Class MainWindow.
 */
public class MainWindow extends JFrame {

    public static String mainPath = "";
    /**
     * The dir path.
     */
    private static String fileName = "";
    private static PrintWriter errorLogFile = null;

    /**
     * The dir.
     */
    private static File dir = new File(mainPath + "/LaTEXtoXML");
    private static boolean wasAnyLaTEXProceeded = false;
    private static JTextArea console;
    private static Thread translationThread;

    /**
     * The iso trie.
     */
    private static HashMap<String, String> isoTrie;

    private static JEditorPane xmlEditor = null;

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        mainPath = System.getProperty("user.dir");
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager
                            .getSystemLookAndFeelClassName());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                new MainWindow().setVisible(true);
            }
        });
    }


    public MainWindow() {
        initComponents();
        initLineTextEditor();
        initLabels();
        initProgressBar();
        redirectSystemStreams();
        createIsoTree();

        initStyling();

    }

    private void initStyling() {
        spliPaneWithDoc.setDividerLocation(0.5);
        progressBar.setVisible(false);
        xmlFileName.setText("Here will be your xml file name");
    }

    private void initProgressBar() {
        ImageIcon prog = new ImageIcon(mainPath + "/LaTEXbin/images/pleasewait.gif");
        progressBar.setIcon(prog);
        progressBar.setIcon(prog);
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
    private static void clear() {
        deleteFile("result.xml");
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
    private static void deleteFile(String deletedFile) {
        File file = new File(mainPath + "/LaTEXtoXML/" + deletedFile);
        file.deleteOnExit();
    }

    /**
     * Clear directory.
     *
     * @param directoryName the directory name
     */
    private static void clearDirectory(String directoryName) {
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
            System.out.println("Here: " + mainPath);
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
    private static void createFoldersAndFilesIfNeed() {
        createFolders();
        createFiles();
    }

    /**
     * Creates the folders.
     */
    private static void createFolders() {
        if (dir.mkdir())
            ;

        String[] folders = {"bibliography"};
        File dir = new File(mainPath + "/LaTEXtoXML/");
        if (dir.mkdir())
            ;
        for (int i = 0; i < folders.length; ++i) {
            dir = new File(mainPath + "/LaTEXtoXML/" + folders[i]);
            if (dir.mkdir())
                ;
        }
    }

    /**
     * Creates the files.
     */
    private static void createFiles() {
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
                    translator = new Translator(fileName);
                    createResult();
                    wasAnyLaTEXProceeded = true;
                    File result = new File(mainPath + "/LaTEXtoXML/result.xml");
                    result.deleteOnExit();
                    if (result.exists()) {
//                        makeXMLStructured(result);
                        displayXMlTOPane(result);
                        progressBar.setVisible(false);
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
//            xmlEditor = new JEditorPane();
//            // Instantiate a XMLEditorKit
//            XMLEditorKit kit = new XMLEditorKit();
//            xmlEditor.setEditorKit(kit);
//            xmlEditor.read(new FileReader(result), result);
//            // Set the font style.
//            xmlEditor.setFont(new Font("Calibri", Font.PLAIN, 14));
//            // Set the tab size
//            xmlEditor.getDocument().putProperty(PlainDocument.tabSizeAttribute,
//                    new Integer(4));
//            // Enable auto indentation.
//            kit.setAutoIndentation(true);
//            // Enable tag completion.
//            kit.setTagCompletion(true);
//
//            // Enable error highlighting.
//            xmlEditor.getDocument().putProperty(XMLEditorKit.ERROR_HIGHLIGHTING_ATTRIBUTE, new Boolean(true));
//            // Set a style
//            kit.setStyle(XMLStyleConstants.ATTRIBUTE_NAME, new Color(255, 0, 0),
//                    Font.BOLD);
//
//            // Put the editor in a panel that will force it to resize, when a different
//            // view is choosen.
//            ScrollableEditorPanel editorPanel = new ScrollableEditorPanel(xmlEditor);
//
//            JScrollPane scroller = new JScrollPane(editorPanel);
//
//            // Add the number margin and folding margin as a Row Header View
//            JPanel rowHeader = new JPanel(new BorderLayout());
//            rowHeader.add(new XMLFoldingMargin(xmlEditor), BorderLayout.EAST);
//            rowHeader.add(new LineNumberMargin(xmlEditor), BorderLayout.WEST);
//            scroller.setRowHeaderView(rowHeader);
//            xmlScrollPane.add(scroller);

            xmlEditor=new JEditorPane();
            xmlEditor.setFont(new Font("Calibri", Font.PLAIN, 14));
            xmlEditor.setEditorKit(new XMLEditorKit());
//            xmlEditor.read(new FileInputStream(result), result);
//            or
            BufferedReader reader = new BufferedReader(new FileReader(result));
            StringBuilder xmlString = new StringBuilder();
            String line;
            while((line = reader.readLine())!=null)
                xmlString.append(line);
//            some code to init the string
            String xml = makeXMLStructured(xmlString.toString());
            xmlEditor.setText(xml);
            jXmlPane.add(xmlEditor);
        } catch (Throwable e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public static String makeXMLStructured(String xml) {
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
    private static void createResult() throws IOException {
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
    private static void writePartToResult(PrintWriter resultXml,
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
        this.fileName = fileName;
        xmlFileName.setText(fileName.substring(fileName.lastIndexOf("\\") + 1, fileName.length() - 4) + "result");
        createFoldersAndFilesIfNeed();
        writeDocumentToPane(fileName);
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
        if (fileName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Choose neccesary files");
            return;
        }
        try {
            progressBar.setVisible(true);
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

        boolean figureSection = false;
        boolean supportingSection = false;

        boolean wasSupportingFigureDeclared = false;
        boolean supportingFigureDeclared = false;
        boolean figureStarted = false;
        boolean figureDeclared = false;

        int startOfFigureSection = 0;
        int startOfSupportingSection = 0;
        int i = 0;
        while ((line = reader.readLine()) != null) {
            ++i;
            if (uselessLine(line))
                continue;

			/*
             * Checks if figure section has started or not
			 */
            if (!figureSection) {
                figureSection = (line.contains("\\section"))
                        && (line.contains("Figure Legends") || line
                        .contains("Figures"));
                if (figureSection)
                    startOfFigureSection = i;
            }

			/*
             * Checks if supporting figure section has started or not
			 */
            if (!supportingSection) {
                supportingSection = (line.contains("\\section") && (line
                        .contains("Supporting Information")))
                        || ((line.contains("\\renewcommand") && line
                        .contains("S\\arabic")));
                if (supportingSection)
                    startOfSupportingSection = i;
            }

			/*
             * If the figure section has started and no figures had been
			 * declared then we are looking for some
			 */
            if (figureSection && !figureDeclared) {
                if (line.contains("\\begin{figure*}")
                        || line.contains("\\begin{figure}"))
                    figureStarted = true;

				/*
                 * If the figure block ends it means that there is the right
				 * figure structure so the figure is declared
				 */
                if (line.contains("\\end{figure*}")
                        || line.contains("\\end{figure}"))
                    if (figureStarted) {
                        figureDeclared = true;
                        figureSection = false;
                    }
            }

			/*
			 * If the supporting figure section has started and no figures had
			 * been declared then we are looking for some
			 */
            if (supportingSection && !supportingFigureDeclared) {
                if (line.contains("\\begin{suppfigure*}")
                        || line.contains("\\begin{suppfigure}"))
                    wasSupportingFigureDeclared = true;
				/*
				 * If the supporting figure block ends it means that there is
				 * the right supporting figure structure so the supporting
				 * figure is declared
				 */
                if (line.contains("\\end{suppfigure*}")
                        || line.contains("\\end{suppfigure}"))
                    if (wasSupportingFigureDeclared) {
                        supportingFigureDeclared = true;
                        supportingSection = false;
                    }
            }
        }

        is.close();
		/*
		 * If the figure section is declared and no figures declared than we
		 * throwing error
		 */
        if (figureSection && !figureDeclared) {
            highlightError(startOfFigureSection, 1);
            scrollToLine(startOfFigureSection);
            return false;
        }
		/*
		 * If the supporting figure section is declared and no supporting
		 * figures declared, than we throwing error
		 */
        if (supportingSection && !supportingFigureDeclared) {
            highlightError(startOfSupportingSection, 2);
            scrollToLine(startOfSupportingSection);
            return false;
        }
        return true;
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
//		JFileChooser chooser = new JFileChooser(new File("D:\\Charlesworth\\plos_template")) {
                JFileChooser chooser = new JFileChooser(new File("D:\\Charlesworth\\Testing documents\\latex\\latex")) {
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
        settingsSplitPane.setDividerLocation(0.5);
    }

    private void saveDocumentButtonActionPerformed(ActionEvent e) {
        try {
            String content = documentText.getText();
            content = content.replaceAll("(?!\\r)\\n", "\r\n");

            File file = new File(fileName);
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
		paneWIthXMLDocument = new JPanel();
		xmlScrollPane = new JScrollPane();
		jXmlPane = new JPanel();
		tabbedPane1 = new JTabbedPane();
		panel1 = new JPanel();
		translateButton = new JButton();
		saveDocumentButton = new JButton();
		progressBar = new JLabel();
		saveXmlDocument = new JButton();
		panel2 = new JPanel();
		settingsSplitPane = new JSplitPane();
		panel3 = new JPanel();
		button1 = new JButton();
		xmlFileName = new JTextField();
		label1 = new JLabel();
		panel4 = new JPanel();
		checkBox1 = new JCheckBox();

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

				//======== paneWIthXMLDocument ========
				{
					paneWIthXMLDocument.setLayout(new BorderLayout());

					//======== xmlScrollPane ========
					{

						//======== jXmlPane ========
						{
							jXmlPane.setLayout(new BoxLayout(jXmlPane, BoxLayout.X_AXIS));
						}
						xmlScrollPane.setViewportView(jXmlPane);
					}
					paneWIthXMLDocument.add(xmlScrollPane, BorderLayout.CENTER);
				}
				xmlPane.addTab("XML:", paneWIthXMLDocument);

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
							.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(55, Short.MAX_VALUE))
				);
				panel1Layout.setVerticalGroup(
					panel1Layout.createParallelGroup()
						.addGroup(panel1Layout.createSequentialGroup()
							.addContainerGap()
							.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
								.addComponent(progressBar, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(translateButton, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(saveDocumentButton, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(saveXmlDocument, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);
			}
			tabbedPane1.addTab("Main", panel1);


			//======== panel2 ========
			{

				//======== settingsSplitPane ========
				{

					//======== panel3 ========
					{

						//---- button1 ----
						button1.setText("Set name");
						button1.setFont(new Font("Calibri", Font.PLAIN, 14));

						//---- xmlFileName ----
						xmlFileName.setFont(new Font("Calibri", xmlFileName.getFont().getStyle(), 14));

						//---- label1 ----
						label1.setText("XML result file name:");
						label1.setFont(new Font("Calibri", label1.getFont().getStyle(), 14));

						GroupLayout panel3Layout = new GroupLayout(panel3);
						panel3.setLayout(panel3Layout);
						panel3Layout.setHorizontalGroup(
							panel3Layout.createParallelGroup()
								.addGroup(panel3Layout.createSequentialGroup()
									.addContainerGap()
									.addComponent(label1)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addComponent(xmlFileName, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addComponent(button1)
									.addContainerGap(58, Short.MAX_VALUE))
						);
						panel3Layout.setVerticalGroup(
							panel3Layout.createParallelGroup()
								.addGroup(panel3Layout.createSequentialGroup()
									.addContainerGap()
									.addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(label1)
										.addComponent(xmlFileName, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
										.addComponent(button1))
									.addGap(25, 25, 25))
						);
					}
					settingsSplitPane.setLeftComponent(panel3);

					//======== panel4 ========
					{

						//---- checkBox1 ----
						checkBox1.setText("Replace symbol using ISO standarts");
						checkBox1.setFont(new Font("Calibri", Font.PLAIN, 14));

						GroupLayout panel4Layout = new GroupLayout(panel4);
						panel4.setLayout(panel4Layout);
						panel4Layout.setHorizontalGroup(
							panel4Layout.createParallelGroup()
								.addGroup(panel4Layout.createSequentialGroup()
									.addContainerGap()
									.addComponent(checkBox1)
									.addContainerGap(28, Short.MAX_VALUE))
						);
						panel4Layout.setVerticalGroup(
							panel4Layout.createParallelGroup()
								.addGroup(panel4Layout.createSequentialGroup()
									.addContainerGap()
									.addComponent(checkBox1)
									.addContainerGap(16, Short.MAX_VALUE))
						);
					}
					settingsSplitPane.setRightComponent(panel4);
				}

				GroupLayout panel2Layout = new GroupLayout(panel2);
				panel2.setLayout(panel2Layout);
				panel2Layout.setHorizontalGroup(
					panel2Layout.createParallelGroup()
						.addComponent(settingsSplitPane, GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)
				);
				panel2Layout.setVerticalGroup(
					panel2Layout.createParallelGroup()
						.addGroup(panel2Layout.createSequentialGroup()
							.addComponent(settingsSplitPane, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);
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
	private JPanel paneWIthXMLDocument;
	private JScrollPane xmlScrollPane;
	private JPanel jXmlPane;
	private JTabbedPane tabbedPane1;
	private JPanel panel1;
	private JButton translateButton;
	private JButton saveDocumentButton;
	private JLabel progressBar;
	private JButton saveXmlDocument;
	private JPanel panel2;
	private JSplitPane settingsSplitPane;
	private JPanel panel3;
	private JButton button1;
	private JTextField xmlFileName;
	private JLabel label1;
	private JPanel panel4;
	private JCheckBox checkBox1;
    // JFormDesigner - End of variables declaration //GEN-END:variables
}