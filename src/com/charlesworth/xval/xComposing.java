package com.charlesworth.xval;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.io.*;
import java.util.regex.*;
import java.util.ArrayList;

/**
 * Created by Dapeng on 2015-08-08, Gramma level checking
 * Validate xml composition,
 * encoding, completedness--done
 * valid--not done
 * built in instruction node--not done
 * empty node--ignore in this release
 */
public class xComposing {
    //warning message, code and msg
    private ArrayList<String> m_WarningMsgList;
    //error message, code and msg
    private ArrayList<String> m_ErrMsgList;
    private String m_fileInputString;

    public xComposing() {
        m_WarningMsgList = new ArrayList<String>();
        m_ErrMsgList = new ArrayList<String>();
    }

    public void checkComposing(String fileName) {
        String fileInput = getFileString(fileName);
        if (fileInput==null) {
            m_WarningMsgList.add("File does not exists or gets locked");
            return;
        }
        //check the xml encoding, find the non-ascii code
        checkTextEncoding(fileInput);
        //check the xml completeness
        checkCompleteness(fileInput);
        //check the xml for validness
        checkValidness(fileInput);
    }

    //check text encoding, must be ASCII only
    //a-zA-Z, under score,
    private void checkTextEncoding(String input) {
        //check the xml declaration for encoding--not done;
        int length = input.length();
        String resultStr= null;
        char vChar;
        for (int index=0; index<length; index++) {
            vChar =input.charAt(index);
            if (vChar>=127) {
                if (resultStr==null)
                    resultStr= ""+vChar;
                else if (resultStr.contains(""+vChar))
                    continue;
                else
                    resultStr= resultStr+","+vChar;
            }
        }
        if (resultStr!=null)
            m_ErrMsgList.add("Invalid character:"+resultStr);
    }


    //validate against dtd, ignore at current moment, DTD must be presented
    private void checkValidness(String fileInput) {

    }


    //validate tag completedness
    private void checkCompleteness(String input) {
        //remove comments node
        String str ="<!--[^<>]*-->";
        Pattern pattern = Pattern.compile(str);
        while (pattern.matcher(input).find())
        {
            input = input.replaceAll(str, "");
        }

        //remove empty node
        str="<[a-zA-Z_-]+/\\s*>";
        pattern = Pattern.compile(str);
        while (pattern.matcher(input).find())
        {
            input = input.replaceAll(str, "");
        }
        str ="<(?<tag>[a-zA-Z_-]+)\\b[^<>]*>[^<>]*</\\k<tag>>";
        pattern = Pattern.compile(str);
        while (pattern.matcher(input).find()) {
            input = input.replaceAll(str, "");
        }

        if (input.trim().length()==0)
            return;

        //remove close tag
        input = input.trim();
        str= "^<(?<tag>[a-zA-Z_-]+)\\b[^<>]*>";
        pattern =pattern.compile(str);
        while (pattern.matcher(input).matches())
        {
            String tag = pattern.matcher(input).group("tag");

            if (input.endsWith("</"+tag+">"))
            {
                input = input.replaceAll(str,"").trim();
                input = input.substring(0,input.length()-tag.length()+3);
            }
        }
        m_WarningMsgList.add(input.trim());
    }

    //@para: fileName
    //Return:all file in string with encoding UTF-8
    private String getFileString(String fileName) {
        try {
            StringBuilder sb = new StringBuilder();
            String input;
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(new FileInputStream(fileName), "UTF-8"));
            while ((input = reader.readLine()) != null) {
                sb.append(input);
            }
            reader.close();
            return sb.toString();
        } catch (Exception e ) {
            return null;
        }
    } //~getFileString

    public ArrayList<String> getWarningMsgList()
    {
        return m_WarningMsgList;
    }

    public ArrayList<String> getM_ErrMsgList()
    {
        return m_ErrMsgList;
    }

}
