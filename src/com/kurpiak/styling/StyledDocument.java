package com.kurpiak.styling;

import java.awt.*;

import javax.swing.text.*;

public class StyledDocument {
	
	public static final DefaultStyledDocument STYLED_CODUMENT = getDoc();
	
	private StyledDocument(){ }
	
	private static DefaultStyledDocument getDoc(){
		@SuppressWarnings("serial")
		DefaultStyledDocument styledDocument = new DefaultStyledDocument() {
			/*all text from text component*/
			private String text;
			
			private static final int ZERO_NEWLINE_CHARACTER_REACHED = 0;
			private static final int TWO_NEWLINE_CHARACTER_REACHED = 2;
			
        	public void insertString (int offset, String str, AttributeSet a) throws BadLocationException{
                super.insertString(offset, str, a);
                highlight(str, offset);
            }

            public void remove (int offset, int len) throws BadLocationException{
                super.remove(offset, len);
                highlight("", offset);
            }
            
            private void highlight(String inputString, int offset){
            	try {
					text = getText(0, getLength());
				} catch (BadLocationException e) { }
                int startIndex = indexOfNewlineCharacterBeforeCaretPosition(text,offset);
                int endIndex = indexOfNewlineCharacterAfterCaretPosition(text, offset + inputString.length());
                
                removeHightlight(startIndex, endIndex);
                highlightTags(startIndex, endIndex);
                highlightComments(startIndex, endIndex);
                highlightMathExpressions(startIndex, endIndex);
            }
            
            private void removeHightlight(int startIndex, int endIndex){
            	setCharacterAttributes(startIndex, endIndex - startIndex, SIMPLE_TEXT_ATTRIBUTE, false);
            }
            
            private void highlightTags(int startIndex, int endIndex){
            	int startTag = startIndex;
                int endTag = startIndex;
                while(endTag <= endIndex) {
                    if (endTag == endIndex || String.valueOf(text.charAt(endTag)).matches("\\W")) {
                        if(text.substring(startTag, endTag).matches("\\\\[a-zA-Z]+")){
                            setCharacterAttributes(startTag, endTag - startTag, TAG_ATTRIBUTE, false);
                        }
                        startTag = endTag;
                    }
                    endTag++;
                }
            }
            
            private void highlightComments(int startIndex, int endIndex){
            	int startComment = startIndex;
                int endComment = startIndex;
                while(startComment <= endIndex){
                	startComment = text.indexOf("%",startComment);
                	if(startComment  < 0) { break; }
                	if(startComment == 0 || text.charAt(startComment-1) != '\\'){
                		endComment = text.indexOf("\n",startComment);
                		if(endComment == -1) { endComment = text.length(); }
                		setCharacterAttributes(startComment, endComment-startComment, COMMENT_ATTRIBUTE, false);
                	}
                	startComment++;
                }
            }
            
            private void highlightMathExpressions(int startIndex, int endIndex){
            	/*
                //math expressions
                int startMath = start;
                int endMath = start;
                startMath = text.indexOf("$",startMath);
                while(startMath <= end){
                	if(startMath == -1) { break; }
                	if(startMath == 0 || text.charAt(startMath-1) != '\\'){
                		end = searchWhile(text, startMath+1);
                		System.out.println(text.length());
                		String s = text.substring(startMath, endMath);
                	} else {
                		startMath = text.indexOf("$", startMath+1);
                		end = searchWhile(text, startMath+1);
                	}
                }
                */
            }
            /*line before caret position*/
            private int indexOfNewlineCharacterBeforeCaretPosition(String text, int offset){
            	if(text.length() == 0) { return 0; }
            	
            	int flag = ZERO_NEWLINE_CHARACTER_REACHED;
            	while(flag != TWO_NEWLINE_CHARACTER_REACHED){
            		if(offset < 1) { break; }
            		if(text.charAt(offset) == '\n'){
            			flag++;
            			if(flag == TWO_NEWLINE_CHARACTER_REACHED) { break; }
            		}
            		offset--;
            	}
            	return offset;
            }
            /*line after caret position*/
            private int indexOfNewlineCharacterAfterCaretPosition(String text, int offset){
            	int flag = ZERO_NEWLINE_CHARACTER_REACHED;
            	while(flag != TWO_NEWLINE_CHARACTER_REACHED){
            		if(offset == text.length()) 		{ break; }
            		if(text.charAt(offset++) == '\n') 	{ flag++; }
            	}
            	return offset;
            }
            
            
			private final Color TAG_COLOR 				= new Color(0x00, 	0x99, 	0x00);
			private final Color COMMENT_COLOR 			= new Color(0x54, 	0x54, 	0x54);
			private final Color SIMPLE_TEXT_COLOR 		= new Color(0x00, 	0x00, 	0x00);
			private final Color MATH_EXPRESSIONS_COLOR	= new Color(0xff, 	0x00, 	0x00);
			
        	private final StyleContext CONTEXT = StyleContext.getDefaultStyleContext();
        	
            private final AttributeSet TAG_ATTRIBUTE 			= CONTEXT.addAttribute(CONTEXT.getEmptySet(), StyleConstants.Foreground, TAG_COLOR);
            private final AttributeSet MATH_ATTRIBUTE 			= CONTEXT.addAttribute(CONTEXT.getEmptySet(), StyleConstants.Foreground, MATH_EXPRESSIONS_COLOR);
            private final AttributeSet COMMENT_ATTRIBUTE 		= CONTEXT.addAttribute(CONTEXT.getEmptySet(), StyleConstants.Foreground, COMMENT_COLOR);
            private final AttributeSet SIMPLE_TEXT_ATTRIBUTE 	= CONTEXT.addAttribute(CONTEXT.getEmptySet(), StyleConstants.Foreground, SIMPLE_TEXT_COLOR);
        	
        };
        return styledDocument;
	}
	
}
