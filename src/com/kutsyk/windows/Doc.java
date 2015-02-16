package com.kutsyk.windows;

import java.awt.*;
import javax.swing.text.*;

public class Doc {
	
	public static final DefaultStyledDocument DOCUMENT = getDoc();
	
	private Doc(){ }
	
	private static DefaultStyledDocument getDoc(){
		DefaultStyledDocument doc = new DefaultStyledDocument() {
			final Color tagColor 				= new Color(0x00, 	0x99, 	0x00);
			final Color commentColor 			= new Color(0x54, 	0x54, 	0x54);
			final Color simpleTextColor 		= new Color(0x00, 	0x00, 	0x00);
			final Color mathExpressionsColor	= new Color(0xff, 	0x00, 	0x00);
			
        	final StyleContext cont = StyleContext.getDefaultStyleContext();
        	
            final AttributeSet tag = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground,tagColor);
            final AttributeSet math = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground,Color.red);
            final AttributeSet comment = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, commentColor);
            final AttributeSet otherText = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, simpleTextColor);
        	private int start(String text, int offset){
            	if(text.length() == 0) { return 0; }
            	if(offset == text.length()) { offset--; }
            	int flag = 2;
            	while(flag != 0){
            		if(offset < 1) 					{ break; }
            		if(text.charAt(offset) == '\n'){
            			flag--;
            			if(flag == 0) { break; }
            		}
            		offset--;
            	}
            	if(text.charAt(offset) == '\n') return offset+1;
            	return offset;
            }
            private int end(String text, int offset){
            	int flag = 2;
            	while(flag != 0){
            		if(offset == text.length()) { break; }
            		if(text.charAt(offset++) == '\n') { flag--; }
            	}
            	return offset;
            }
            private void highlight(String str, int offset){
            	//-------------------------

                String text = null;
                try {
                    text = getText(0, getLength());
                } catch (BadLocationException e) {
                    e.printStackTrace();
                }
                int start = start(text,offset);
                int end = end(text, offset);
                if(str.length() > end - start){
                	start = offset;
                	end = offset + str.length();
                }
                setCharacterAttributes(start, end - start, otherText, false);
                //-------------------------
                //*
                //-------------------------
                //tag words
                int startTag = start;
                int endTag = start;
                while(endTag <= end) {
                    if (endTag == end || String.valueOf(text.charAt(endTag)).matches("\\W")) {
                        if(text.substring(startTag, endTag).matches("\\\\([a-zA-Z]+)")){
                            setCharacterAttributes(startTag, endTag - startTag, tag, false);
                        }
                        startTag = endTag;
                    }
                    endTag++;
                }
                //---------------------------
                
                //---------------------------
                //comments
                int startComment = start;
                int endComment = start;
                while(startComment <= end){
                	startComment = text.indexOf("%",startComment);
                	if(startComment  < 0) { break; }
                	if(startComment == 0 || text.charAt(startComment-1) != '\\'){
                		endComment = text.indexOf("\n",startComment);
                		if(endComment == -1) { endComment = text.length(); }
                		setCharacterAttributes(startComment, endComment-startComment, comment, false);
                	}
                	startComment++;
                }
                //---------------------------------------
                /*/
                //math expressions
                int startMath = start;
                int endMath = start;
                startMath = text.indexOf("$",startMath);
                while(startMath <= end){
                	if(startMath == -1) { break; }
                	if(startMath == 0 || text.charAt(startMath-1) != '\\'){
                		endMath = startMath;
                		int index = text.indexOf("\n", startMath);
                		while(endMath != -1 && endMath <= end && text.charAt(endMath-1) != '\\'){
                			endMath = text.indexOf("$", endMath+1);
                		}
                		if(endMath == -1) { endMath = text.length(); }
                		else if(endMath > index) { endMath = index; }
                		String s = text.substring(startMath, endMath);
                		System.out.println(s);
                		setCharacterAttributes(startMath, endMath - startMath, math, false);
                		startMath = text.indexOf("$",endMath+1);
                	} else {
                		startMath = text.indexOf("$",startMath+1);
                	}
                }
                //*/
            }
        	
        	public void insertString (int offset, String str, AttributeSet a) throws BadLocationException {
                super.insertString(offset, str, a);
                highlight(str, offset);
            }

            public void remove (int offset, int len) throws BadLocationException {
                super.remove(offset, len);
                highlight("", offset);
            }
        };
        return doc;
	}
	
}
