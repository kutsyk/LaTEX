package com.kurpiak.styling;

import java.awt.*;

import javax.swing.text.*;

public class StyledDocument {
	private StyledDocument() {
	}

	public static DefaultStyledDocument getInstance() {
		return styledDocument;
	}

	private static final DefaultStyledDocument styledDocument = new DefaultStyledDocument() {
		/* all text from text component */
		private String text;

		private static final int ZERO_NEWLINE_CHARACTER_REACHED = 0;
		private static final int TWO_NEWLINE_CHARACTER_REACHED = 2;

		public void insertString(int offset, String str, AttributeSet a) throws BadLocationException {
			super.insertString(offset, str, a);
			highlight(str, offset);
		}

		public void remove(int offset, int len) throws BadLocationException {
			super.remove(offset, len);
			highlight("", offset);
		}

		private void highlight(String inputString, int offset) {
			try {
				text = getText(0, getLength());
			} catch (BadLocationException e) { }
			int startIndex = indexOfNewlineCharacterBeforeCaretPosition(text, offset);
			int endIndex = indexOfNewlineCharacterAfterCaretPosition(text, offset + inputString.length());

			removeHightlight(startIndex, endIndex);
			highlightTags(startIndex, endIndex);
			highlightComments(startIndex, endIndex);
			highlightMathExpressions(startIndex, endIndex);
		}

		private void removeHightlight(int startIndex, int endIndex) {
			setCharacterAttributes(startIndex, endIndex - startIndex, SIMPLE_TEXT_ATTRIBUTE, false);
		}

		private void highlightTags(int startIndex, int endIndex) {
			int startTag = startIndex;
			int endTag = startIndex;
			while (endTag <= endIndex) {
				if (endTag == endIndex || String.valueOf(text.charAt(endTag)).matches("\\W")) {
					if (text.substring(startTag, endTag).matches("\\\\[a-zA-Z]+"))
						setCharacterAttributes(startTag, endTag - startTag, TAG_ATTRIBUTE, false);
					startTag = endTag;
				}
				++endTag;
			}
		}

		private void highlightComments(int startIndex, int endIndex) {
			int startComment = text.indexOf("%", startIndex);
			int endComment = startIndex;
			while (startComment <= endIndex) {
				if (startComment < 0)
					break;
				if (startComment == 0 || text.charAt(startComment - 1) != '\\') {
					endComment = text.indexOf("\n", startComment);
					if (endComment == -1)
						endComment = text.length();
					setCharacterAttributes(startComment, endComment - startComment, COMMENT_ATTRIBUTE, false);
				}
				startComment = text.indexOf("%", startComment + 1);
			}
		}

		private void highlightMathExpressions(int startIndex, int endIndex) {
			int startMath = text.indexOf("$", startIndex);
			int endMath;
			while (startMath != -1 && startMath <= endIndex) {
				if (startMath == 0 || text.charAt(startMath - 1) != '\\') {
					int indexOfNewLine = text.indexOf("\n", startMath + 1);

					endMath = text.indexOf("$", startMath + 1);
					// search index char of '$' where char before it don't equals to '\'
					while (endMath != -1 && text.charAt(endMath) == '$' && text.charAt(endMath - 1) == '\\')
						endMath = text.indexOf("$", endMath + 1);
					
					// if index of '$' bigger then index of '\n'. set endMath equals to index of '\n'
					if (indexOfNewLine != -1 && indexOfNewLine < endMath)
						endMath = indexOfNewLine;

					// if index of '$' = -1, change it to index of '\n' or to end of text
					if (endMath == -1) {
						endMath = text.indexOf("\n", startMath);
						if (endMath == -1)
							endMath = text.length();
					}
					setCharacterAttributes(startMath, endMath - startMath + 1, MATH_ATTRIBUTE, false);
					startMath = text.indexOf("$", endMath + 1);
				} else {
					startMath = text.indexOf("$", startMath + 1);
				}
			}
		}

		/* line before caret position */
		private int indexOfNewlineCharacterBeforeCaretPosition(String text, int offset) {
			if (text.length() == 0)
				return 0;
			
			int flag = ZERO_NEWLINE_CHARACTER_REACHED;
			while (flag != TWO_NEWLINE_CHARACTER_REACHED) {
				if (offset < 1)
					break;
				if (text.charAt(offset) == '\n') {
					++flag;
					if (flag == TWO_NEWLINE_CHARACTER_REACHED)
						break;
				}
				--offset;
			}
			return offset;
		}

		/* line after caret position */
		private int indexOfNewlineCharacterAfterCaretPosition(String text,
				int offset) {
			int flag = ZERO_NEWLINE_CHARACTER_REACHED;
			while (flag != TWO_NEWLINE_CHARACTER_REACHED) {
				if (offset == text.length())
					break;
				if (text.charAt(offset++) == '\n')
					++flag;
			}
			return offset;
		}
		
		private final Color TAG_COLOR 				= new Color(0x00, 0x99, 0x00);
		private final Color COMMENT_COLOR 			= new Color(0x54, 0x54, 0x54);
		private final Color SIMPLE_TEXT_COLOR 		= new Color(0x00, 0x00, 0x00);
		private final Color MATH_EXPRESSIONS_COLOR 	= new Color(0xe5, 0x00, 0x00);

		private final StyleContext CONTEXT = StyleContext.getDefaultStyleContext();
		
		private final AttributeSet TAG_ATTRIBUTE 			= CONTEXT.addAttribute(CONTEXT.getEmptySet(), StyleConstants.Foreground, TAG_COLOR);
		private final AttributeSet MATH_ATTRIBUTE 			= CONTEXT.addAttribute(CONTEXT.getEmptySet(), StyleConstants.Foreground,MATH_EXPRESSIONS_COLOR);
		private final AttributeSet COMMENT_ATTRIBUTE 		= CONTEXT.addAttribute(CONTEXT.getEmptySet(), StyleConstants.Foreground,COMMENT_COLOR);
		private final AttributeSet SIMPLE_TEXT_ATTRIBUTE 	= CONTEXT.addAttribute(CONTEXT.getEmptySet(), StyleConstants.Foreground,SIMPLE_TEXT_COLOR);
	};
}
