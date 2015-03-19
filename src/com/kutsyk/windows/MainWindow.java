package com.kutsyk.windows;

import com.kurpiak.styling.StyledDocument;
import com.kutsyk.TextEditor.TextLineNumber;
import com.kutsyk.convertors.Translator;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;

/*
 * @author Kutsyk Vasyl
 * The Class MainWindow.
 */
public class MainWindow extends JFrame {

    public static String mainPath = "";
    /** The dir path. */
	private static String fileName = "";
	private static PrintWriter errorLogFile = null;

	/** The dir. */
	private static File dir = new File(mainPath + "/LaTEXtoXML");
	private static JTextPane documentText;
	private static boolean wasAnyLaTEXProceeded = false;
	private static JTextArea console;
	private static Thread translationThread;

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
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
		setBibliographyComponents(false);
		redirectSystemStreams();
	}
	
	private void initProgressBar()
	{
		ImageIcon prog = new ImageIcon(mainPath+"/LaTEXbin/images/pleasewait.gif");
		label4.setIcon(prog);
		label4.setVisible(false);
	}

	private void setBibliographyComponents(boolean flag) {
		BibLabel.setVisible(flag);
		BibLoaderGif.setVisible(flag);
		BibWaiting.setVisible(flag);
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
		helpPane.add("Help: ", console);

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
	 * @param deletedFile
	 *            the deleted file
	 */
	private static void deleteFile(String deletedFile) {
		File file = new File(mainPath + "/LaTEXtoXML/" + deletedFile);
		file.deleteOnExit();
	}

	/**
	 * Clear directory.
	 *
	 * @param directoryName
	 *            the directory name
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

		String[] folders = { "bibliography"};
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
		String[] files = { "result.xml", "bodyAndBottom.xml", "mainFile.tex", "back.tex",
				"newCommands.tex" };
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
				label4.setVisible(true);
                Translator translator;
				try {
                    translator = new Translator(fileName);
					createResult();
					wasAnyLaTEXProceeded = true;
					File result = new File(mainPath + "/LaTEXtoXML/result.xml");
					result.deleteOnExit();
					if (result.exists())
						Desktop.getDesktop().open(result);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				label4.setVisible(false);
				JOptionPane.showMessageDialog(null, "Translated");
			}
		});
		translationThread.start();
	}

	/**
	 * Creates the result.
	 *
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
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
	 * @param resultXml
	 *            the result xml
	 * @param in
	 *            the in
	 * @param part
	 *            the part
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
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

	private void FileChooseButtonActionPerformed(ActionEvent e) {
		wasAnyLaTEXProceeded = false;
		reinitLabels();
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
//		directoryChoosed(dirPath);
		splitPaneWithConsole.setAutoscrolls(true);
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
        }
        this.fileName = fileName;
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
				translateAction();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

	private void ExitButtonActionPerformed(ActionEvent e) {
		closeLogFile();
		clear();
		System.exit(0);
	}

	private void SaveXmlResultActionPerformed(ActionEvent e) {
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
			fileChooser.setSelectedFile(new File(fileName
					+ " - final.xml"));
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

	public TextLineNumber lineNumber;
	private static JScrollPane scrollPane;
	private static Highlighter highlighter;

	private void initLabels() {
		Dimension to5 = new Dimension(80, 15);
		LaTEXWaiting.setMinimumSize(to5);
		LaTEXWaiting.setPreferredSize(to5);
		LaTEXWaiting.setMaximumSize(to5);

		XMlWaiting.setMinimumSize(to5);
		XMlWaiting.setPreferredSize(to5);
		XMlWaiting.setMaximumSize(to5);

		BibWaiting.setMinimumSize(to5);
		BibWaiting.setPreferredSize(to5);
		BibWaiting.setMaximumSize(to5);
	}

	private void reinitLabels() {
		ImageIcon undone = new ImageIcon(mainPath+"/LaTEXBin/images/green-cross-icon.png");
		LaTEXLoaderGif.setIcon(undone);
		LaTEXWaiting.setText("...waiting...");
		XMlWaiting.setText("...waiting...");
		BibWaiting.setText("...waiting...");
	}

	private void initLineTextEditor() {
		documentText = new JTextPane(StyledDocument.getInstance());
        documentText.setFont(new Font("Arial",14,14));
		lineNumber = new TextLineNumber(documentText);

		scrollPane = new JScrollPane(documentText);
		scrollPane.setRowHeaderView(lineNumber);
		documentTab.add("Document: ", scrollPane);
	}

	private static boolean uselessLine(String line) {
        return line.replace(" ", "").startsWith("%")
                || line.replace(" ", "").isEmpty();
    }

	private static boolean hasRightStructure(String inputFile) throws Exception {
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

	private static void highlightError(int line, int errorType) {
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

	private static void scrollToLine(final int line) {
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

    private void SaveButtonActionPerformed(ActionEvent e) {
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

	private void HowToUseButtonActionPerformed(ActionEvent e) {
		try {
			File sourceFolder = new File(mainPath
					+ "/LaTEXbin/documentation/index.html");
			Desktop.getDesktop().open(sourceFolder);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	private void thisWindowClosing(WindowEvent e) {
		closeLogFile();
		clear();
	}
	
	private void closeLogFile()
	{
        if(translationThread != null)
            translationThread.stop();
		if(errorLogFile!=null)
			errorLogFile.close();
	}

	private void initComponents() {
		toolBar1 = new JToolBar();
		FileChooseButtonFromPanel = new JButton();
		translateButton = new JButton();
		SaveButton = new JButton();
		SaveXmlResult = new JButton();
		label4 = new JLabel();
		toolBar2 = new JToolBar();
		HowToUseButton = new JButton();
		ExitButton = new JButton();
		spliPaneWithDoc = new JSplitPane();
		splitPaneWithConsole = new JSplitPane();
		infoPanel = new JPanel();
		FileChooseButton = new JButton();
		label1 = new JLabel();
		label2 = new JLabel();
		LaTEXWaiting = new JLabel();
		XMLLoaderGif = new JLabel();
		XMlWaiting = new JLabel();
		label3 = new JLabel();
		BibLabel = new JLabel();
		BibWaiting = new JLabel();
		BibLoaderGif = new JLabel();
		LaTEXLoaderGif = new JLabel();
		scrollPane1 = new JScrollPane();
		helpPane = new JTabbedPane();
		documentTab = new JTabbedPane();

		//======== this ========
		setTitle("LaTEX > XML");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setFocusable(false);
		setBackground(Color.white);
		setIconImage(new ImageIcon(getClass().getResource("/images/green-home-icon.png")).getImage());
		setForeground(Color.white);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				thisWindowClosing(e);
			}
		});
		Container contentPane = getContentPane();

		//======== toolBar1 ========
		{
			toolBar1.setFloatable(false);

			//---- FileChooseButtonFromPanel ----
			FileChooseButtonFromPanel.setText("Choose folder");
			FileChooseButtonFromPanel.setFont(new Font("Arial", Font.PLAIN, 14));
			FileChooseButtonFromPanel.setIcon(new ImageIcon(getClass().getResource("/images/green-folder-icon.png")));
			FileChooseButtonFromPanel.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					FileChooseButtonActionPerformed(e);
				}
			});
			toolBar1.add(FileChooseButtonFromPanel);

			//---- translateButton ----
			translateButton.setText("Translate to XML");
			translateButton.setFont(new Font("Arial", Font.PLAIN, 14));
			translateButton.setIcon(new ImageIcon(getClass().getResource("/images/green-address-book-icon.png")));
			translateButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					translateButtonActionPerformed(e);
				}
			});
			toolBar1.add(translateButton);

			//---- SaveButton ----
			SaveButton.setText("Save document");
			SaveButton.setIcon(new ImageIcon(getClass().getResource("/images/green-disk-icon.png")));
			SaveButton.setFont(new Font("Arial", Font.PLAIN, 14));
			SaveButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					SaveButtonActionPerformed(e);
				}
			});
			toolBar1.add(SaveButton);

			//---- SaveXmlResult ----
			SaveXmlResult.setText("Save XML result");
			SaveXmlResult.setFont(new Font("Arial", Font.PLAIN, 14));
			SaveXmlResult.setIcon(new ImageIcon(getClass().getResource("/images/green-document-download-icon.png")));
			SaveXmlResult.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					SaveXmlResultActionPerformed(e);
				}
			});
			toolBar1.add(SaveXmlResult);
			toolBar1.add(label4);
		}

		//======== toolBar2 ========
		{
			toolBar2.setFloatable(false);

			//---- HowToUseButton ----
			HowToUseButton.setText("How to use?");
			HowToUseButton.setFont(new Font("Arial", Font.PLAIN, 14));
			HowToUseButton.setIcon(new ImageIcon(getClass().getResource("/images/green-notes-icon.png")));
			HowToUseButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					HowToUseButtonActionPerformed(e);
				}
			});
			toolBar2.add(HowToUseButton);

			//---- ExitButton ----
			ExitButton.setText("Exit");
			ExitButton.setFont(new Font("Arial", Font.PLAIN, 14));
			ExitButton.setIcon(new ImageIcon(getClass().getResource("/images/green-cross-icon.png")));
			ExitButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					ExitButtonActionPerformed(e);
				}
			});
			toolBar2.add(ExitButton);
		}

		//======== spliPaneWithDoc ========
		{

			//======== splitPaneWithConsole ========
			{
				splitPaneWithConsole.setOrientation(JSplitPane.VERTICAL_SPLIT);

				//======== infoPanel ========
				{

					//---- FileChooseButton ----
					FileChooseButton.setText("Choose folder");
					FileChooseButton.setFont(new Font("Arial", Font.PLAIN, 14));
					FileChooseButton.setIcon(new ImageIcon(getClass().getResource("/images/green-folder-icon.png")));
					FileChooseButton.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							FileChooseButtonActionPerformed(e);
						}
					});

					//---- label1 ----
					label1.setText("Choose folder with all necessary files:");
					label1.setFont(new Font("Arial", Font.PLAIN, 14));

					//---- label2 ----
					label2.setText("LaTEX:");
					label2.setFont(new Font("Arial", Font.PLAIN, 14));

					//---- LaTEXWaiting ----
					LaTEXWaiting.setText("...waiting...");
					LaTEXWaiting.setFont(new Font("Arial", Font.PLAIN, 14));

					//---- XMLLoaderGif ----
					XMLLoaderGif.setIcon(new ImageIcon(getClass().getResource("/images/green-document-cross-icon.png")));

					//---- XMlWaiting ----
					XMlWaiting.setText("...waiting...");
					XMlWaiting.setFont(new Font("Arial", Font.PLAIN, 14));

					//---- label3 ----
					label3.setText("Frontmatter XML:");
					label3.setFont(new Font("Arial", Font.PLAIN, 14));

					//---- BibLabel ----
					BibLabel.setText("Bibliography:");
					BibLabel.setFont(new Font("Arial", Font.PLAIN, 14));

					//---- BibWaiting ----
					BibWaiting.setText("...waiting...");
					BibWaiting.setFont(new Font("Arial", Font.PLAIN, 14));

					//---- BibLoaderGif ----
					BibLoaderGif.setIcon(new ImageIcon(getClass().getResource("/images/green-ok-icon.png")));

					//---- LaTEXLoaderGif ----
					LaTEXLoaderGif.setIcon(new ImageIcon(getClass().getResource("/images/green-document-cross-icon.png")));

					GroupLayout infoPanelLayout = new GroupLayout(infoPanel);
					infoPanel.setLayout(infoPanelLayout);
					infoPanelLayout.setHorizontalGroup(
						infoPanelLayout.createParallelGroup()
							.addGroup(infoPanelLayout.createSequentialGroup()
								.addContainerGap()
								.addGroup(infoPanelLayout.createParallelGroup()
									.addGroup(infoPanelLayout.createSequentialGroup()
										.addComponent(label1)
										.addGap(10, 10, 10)
										.addComponent(FileChooseButton))
									.addGroup(GroupLayout.Alignment.TRAILING, infoPanelLayout.createSequentialGroup()
										.addGroup(infoPanelLayout.createParallelGroup()
											.addComponent(label2)
											.addComponent(label3)
											.addComponent(BibLabel))
										.addGap(39, 39, 39)
										.addGroup(infoPanelLayout.createParallelGroup()
											.addGroup(infoPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
												.addComponent(XMlWaiting, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(LaTEXWaiting))
											.addComponent(BibWaiting))
										.addGap(51, 51, 51)
										.addGroup(infoPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
											.addGroup(infoPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
												.addComponent(LaTEXLoaderGif)
												.addComponent(XMLLoaderGif))
											.addComponent(BibLoaderGif))
										.addGap(98, 98, 98)))
								.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					);
					infoPanelLayout.setVerticalGroup(
						infoPanelLayout.createParallelGroup()
							.addGroup(GroupLayout.Alignment.TRAILING, infoPanelLayout.createSequentialGroup()
								.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(infoPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
									.addComponent(FileChooseButton)
									.addComponent(label1))
								.addGap(18, 18, 18)
								.addGroup(infoPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
									.addGroup(infoPanelLayout.createParallelGroup()
										.addComponent(label2)
										.addComponent(LaTEXWaiting))
									.addComponent(LaTEXLoaderGif))
								.addGap(18, 18, 18)
								.addGroup(infoPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
									.addGroup(infoPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(label3)
										.addComponent(XMlWaiting))
									.addComponent(XMLLoaderGif))
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(infoPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
									.addGroup(infoPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(BibLabel)
										.addComponent(BibWaiting))
									.addComponent(BibLoaderGif))
								.addContainerGap())
					);
				}
				splitPaneWithConsole.setTopComponent(infoPanel);

				//======== scrollPane1 ========
				{

					//======== helpPane ========
					{
						helpPane.setFont(new Font("Arial", Font.PLAIN, 14));
					}
					scrollPane1.setViewportView(helpPane);
				}
				splitPaneWithConsole.setBottomComponent(scrollPane1);
			}
			spliPaneWithDoc.setLeftComponent(splitPaneWithConsole);

			//======== documentTab ========
			{
				documentTab.setFont(new Font("Arial", Font.PLAIN, 14));
			}
			spliPaneWithDoc.setRightComponent(documentTab);
		}

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(spliPaneWithDoc, GroupLayout.DEFAULT_SIZE, 917, Short.MAX_VALUE)
							.addGap(10, 10, 10))
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addComponent(toolBar1, GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(toolBar2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(0, 0, 0))
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addGroup(contentPaneLayout.createParallelGroup()
						.addComponent(toolBar2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(toolBar1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(spliPaneWithDoc, GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
					.addContainerGap())
		);
		setSize(945, 460);
		setLocationRelativeTo(getOwner());
		// //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY
	// //GEN-BEGIN:variables
	private JToolBar toolBar1;
	private JButton FileChooseButtonFromPanel;
	private JButton translateButton;
	private JButton SaveButton;
	private JButton SaveXmlResult;
	private JLabel label4;
	private JToolBar toolBar2;
	private JButton HowToUseButton;
	private JButton ExitButton;
	private JSplitPane spliPaneWithDoc;
	private JSplitPane splitPaneWithConsole;
	private JPanel infoPanel;
	private JButton FileChooseButton;
	private JLabel label1;
	private JLabel label2;
	private JLabel LaTEXWaiting;
	private JLabel XMLLoaderGif;
	private JLabel XMlWaiting;
	private JLabel label3;
	private JLabel BibLabel;
	private JLabel BibWaiting;
	private JLabel BibLoaderGif;
	private JLabel LaTEXLoaderGif;
	private JScrollPane scrollPane1;
	private JTabbedPane helpPane;
	private JTabbedPane documentTab;

}
