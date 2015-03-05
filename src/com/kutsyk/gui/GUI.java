package com.kutsyk.gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Kutsyk on 04.03.15.
 */
public class GUI extends JFrame{
    private JPanel MainPanel;
    private JToolBar UpperToolBar;
    private JButton chooseFileButton;
    private JButton convertButton;
    private JButton saveTexDocumentButton;
    private JButton saveXMLFileButton;
    private JButton helpButton;
    private JButton exitButton;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager
                            .getSystemLookAndFeelClassName());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                new GUI().setVisible(true);
            }
        });

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
