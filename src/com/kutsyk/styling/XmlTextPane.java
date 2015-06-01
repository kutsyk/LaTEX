package com.kutsyk.styling;

import javax.swing.*;

/**
 * Created by Kutsyk on 01.06.2015.
 */
public class XmlTextPane extends JTextPane {

    private static final long serialVersionUID = 6270183148379328084L;

    public XmlTextPane() {
        // Set editor kit
        this.setEditorKitForContentType("text/xml", new XmlEditorKit());
        this.setContentType("text/xml");
    }

}