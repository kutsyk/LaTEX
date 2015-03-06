package com.kutsyk.convertors.BibTEX;


import com.kutsyk.grammar.BibTEX.BibPlosBaseListener;
import com.kutsyk.grammar.BibTEX.BibPlosParser;
import org.antlr.v4.runtime.misc.NotNull;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Kutsyk on 04.03.15.
 */
public class BibXML extends BibPlosBaseListener {

    private PrintWriter writer;
    private int refCounter;
    private boolean wasPreviousLineWord;

    public BibXML(PrintWriter writer) throws IOException {
        this.writer = writer;
        refCounter = 0;
    }

    @Override
    public void enterSimpleText(@NotNull BibPlosParser.SimpleTextContext ctx) {
        String line = ctx.getText();
        System.out.println(wasPreviousLineWord);
        System.out.println(line);
        if (wasPreviousLineWord){
            writer.print(' ');
        }
        writer.print(line+' ');
        wasPreviousLineWord = true;
    }

    @Override
    public void exitSimpleText(@NotNull BibPlosParser.SimpleTextContext ctx) {
        wasPreviousLineWord = false;
    }

    @Override
    public void enterAcknowledgment(@NotNull BibPlosParser.AcknowledgmentContext ctx) {
        writer.println("<ack><p>");
    }

    @Override
    public void exitAcknowledgment(@NotNull BibPlosParser.AcknowledgmentContext ctx) {
        writer.println("</p></ack>");
    }

    @Override
    public void enterRefs(@NotNull BibPlosParser.RefsContext ctx) {
        writer.println("<ref-list>");
    }

    @Override
    public void exitRefs(@NotNull BibPlosParser.RefsContext ctx) {
        writer.println("</ref-list>");
    }

    @Override
    public void enterBibItem(@NotNull BibPlosParser.BibItemContext ctx) {
        writer.print("<ref id=\"");
    }

    @Override
    public void enterBibLabel(@NotNull BibPlosParser.BibLabelContext ctx) {
        writer.println(ctx.getText() + "\">");
    }

    @Override
    public void exitBibItem(@NotNull BibPlosParser.BibItemContext ctx) {
        writer.println("</ref>");
    }

    @Override
    public void enterAuthorList(@NotNull BibPlosParser.AuthorListContext ctx) {
        writer.println("<person-group person-group-type=\"author\">");
    }

    @Override
    public void exitAuthorList(@NotNull BibPlosParser.AuthorListContext ctx) {
        writer.println("</person-group>");
    }

    @Override
    public void enterAuthor(@NotNull BibPlosParser.AuthorContext ctx) {
        writer.println("<name>");
    }

    @Override
    public void exitAuthor(@NotNull BibPlosParser.AuthorContext ctx) {
        writer.println("</name>");
    }

    @Override
    public void enterBibYear(@NotNull BibPlosParser.BibYearContext ctx) {
        writer.println("<year>");
    }

    @Override
    public void exitBibYear(@NotNull BibPlosParser.BibYearContext ctx) {
        writer.println("</year>");
    }

    @Override
    public void enterTitle(@NotNull BibPlosParser.TitleContext ctx) {
        writer.println("<article-title>");
    }

    @Override
    public void exitTitle(@NotNull BibPlosParser.TitleContext ctx) {
        writer.println("</article-title>");
    }
}
