package com.kutsyk.styling;

import javax.swing.text.Element;
import javax.swing.text.View;
import javax.swing.text.ViewFactory;

/**
 * Created by Kutsyk on 01.06.2015.
 */
public class XmlViewFactory extends Object implements ViewFactory {

    /**
     * @see javax.swing.text.ViewFactory#create(javax.swing.text.Element)
     */
    public View create(Element element) {

        return new XmlView(element);
    }

}