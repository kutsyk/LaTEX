package com.kutsyk.TextEditor;
import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;

public class JTextEditor extends JPanel {

	public JTextComponent component;
	public TextLineNumber lineNumber;
	private JScrollPane scrollPane;
	private Highlighter highlighter;
	
	public static final int FIGURE_MISSING = 1;
	public static final int SUPPORTING_MISSING = 2;

	public JTextEditor(JTextComponent component) {
		this.component = component;
		lineNumber = new TextLineNumber(component);

		scrollPane = new JScrollPane(component);
		scrollPane.setRowHeaderView(lineNumber);

		add(scrollPane);
	}

	public void highlightError(int line, int errorType) {
		Document doc = component.getDocument();
		Element map = doc.getDefaultRootElement();
		Element startLine = map.getElement(line - 1);

		highlighter = component.getHighlighter();
		highlighter.removeAllHighlights();

		DefaultHighlighter.DefaultHighlightPainter painter = new DefaultHighlighter.DefaultHighlightPainter(
				new Color(255, 178, 178));

		try {
			if(errorType == FIGURE_MISSING)
				System.out.println("[ERROR]: Figure section found, but figure declaration missing");
			if(errorType == SUPPORTING_MISSING)
				System.out.println("[ERROR]: Supporting section found, but supporting materials declaration missing");
			highlighter.addHighlight(startLine.getStartOffset(),
					startLine.getEndOffset(), painter);
		} catch (BadLocationException e) {
			e.printStackTrace();
		}

	}
	
	public void removeHighlight() {
		highlighter.removeAllHighlights();
	}

	public void scrollToLine(final int line) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JScrollBar verticalBar = scrollPane.getVerticalScrollBar();
				Document doc = component.getDocument();
				Element map = doc.getDefaultRootElement();
				Element l = map.getElement(line - 1);
				component.setCaretPosition(l.getStartOffset());
				Rectangle rec = null;
				try {
					rec = component.modelToView(l.getStartOffset());
					if (rec == null) return;
					verticalBar.setValue((int) rec.getY());
				} catch (BadLocationException e1) {
					e1.printStackTrace();
				}
				
			}
			
		});
	}

}
