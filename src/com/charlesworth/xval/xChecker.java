package com.charlesworth.xval;
import java.io.*;
import java.util.ArrayList;
import java.awt.Desktop;
import java.net.URI;

/**
 * Created by Dapeng Li on 2015-08-10
 * XMl validation against gramma
 * xml validation against customer specification, this is typically for XML out
 */
public class xChecker {
    private String m_account;
    private String m_fileName;
    private ArrayList<String> m_errorMsgList;
    private ArrayList<String> m_warningMsgList;

    public xChecker(String account) {
        this.m_account = account;

    }

    public void checkIt(String fileName) {
        try {
            m_warningMsgList = new ArrayList<String>();
            m_errorMsgList = new ArrayList<String>();

            xComposing xComposing = new xComposing();
            xComposing.checkComposing(fileName);
            xComposing=null;
            ArrayList<String> rList = xComposing.getWarningMsgList();
            for (String str: rList) {
                m_warningMsgList.add(str);
            }

            rList = xComposing.getM_ErrMsgList();
            for (String str: rList) {
                m_errorMsgList.add(str);
            }
            makeReport();
            showReport();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showReport() {
        try {
            Desktop.getDesktop().browse(new URI("report.html"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void makeReport()  throws IOException {
        PrintWriter writer=new PrintWriter(new OutputStreamWriter(new FileOutputStream("report.html"),"UTF-8"));

        writer.println("<html><head><meta charset=\"UTF-8\"></head><body>");

        writer.println("<table>");
        writer.println("<p>Error Message: "+m_errorMsgList.size()+"</p>");

        for (int index=0; index<m_errorMsgList.size(); index++) {
            writer.println("<tr><td>"+(index+1)+"</td>");
            writer.println("<td>");
            writer.println(m_errorMsgList.get(index));
            writer.println("</td></tr>");
        }
        writer.println("</table>");

        writer.println("<p>Error Message: "+m_warningMsgList.size()+"</p>");
        writer.println("<table>");
        for (int index=0; index<m_warningMsgList.size(); index++) {
            writer.println("<tr><td>"+(index+1)+"</td>");
            writer.println("<td>");
            writer.println(m_warningMsgList.get(index));
            writer.println("</td></tr>");
        }
        writer.println("</table>");
        writer.println("</body><html>");
        writer.flush();
        writer.close();
    }



}
