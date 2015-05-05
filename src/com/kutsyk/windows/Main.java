package com.kutsyk.windows;

import javax.swing.*;
import java.awt.*;
import java.io.File;

/**
 * Created by Kutsyk on 5/5/2015.
 */
public class Main {

    private static File appDataFolder = new File(System.getenv("APPDATA"));

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
                new TrialWindow().setVisible(true);
            }
        });
    }
}
