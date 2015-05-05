package com.kutsyk.windows;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Kutsyk on 26.04.2015.
 */
public class SwingProgressBarExample extends JPanel {

    JProgressBar pbar;
    JButton pbut;

    public SwingProgressBarExample() {
        // initialize Progress Bar
        pbar = new JProgressBar();
        pbut = new JButton("Ok");
        pbut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                okButton(e);
            }
        });
        // add to JPanel
        add(pbar);
        add(pbut);
    }

    private void okButton(ActionEvent e) {
    }

    public void updateBar(int newValue) {
        pbar.setValue(newValue);
    }

    public JProgressBar getPbar() {
        return pbar;
    }

    public void setPbar(JProgressBar pbar) {
        this.pbar = pbar;
    }

    public JButton getPbut() {
        return pbut;
    }

    public void setPbut(JButton pbut) {
        this.pbut = pbut;
    }

    public static void main(String args[]) {

        final SwingProgressBarExample it = new SwingProgressBarExample();

        JFrame frame = new JFrame("Progress Bar Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(it);
        frame.pack();
        frame.setVisible(true);

        // run a loop to demonstrate raising
//        for (int i = MY_MINIMUM; i <= MY_MAXIMUM; i++) {
//            final int percent = i;
//            try {
//                SwingUtilities.invokeLater(new Runnable() {
//                    public void run() {
//                        it.updateBar(percent);
//                    }
//                });
//                java.lang.Thread.sleep(100);
//            } catch (InterruptedException e) {
//                ;
//            }
//        }
    }
}