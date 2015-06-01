package com.kutsyk.windows;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
/*
 * Created by JFormDesigner on Tue May 05 16:26:31 EEST 2015
 */


/**
 * @author kutsyk
 */
public class TrialWindow extends JFrame {

    private File securityDateFile;
    private String dateFormat = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
    private boolean validTrial = false;
    private int trialLength;

    public TrialWindow() {
        initComponents();
        trialLength = 30;
        trialVersionCheck();
    }

    private void trialVersionCheck() {
        writeDateToFile();
        validTrial = isTrialPeriod();
    }

    private void writeDateToFile() {
        try {
            File appFolder = new File(System.getenv("APPDATA") + "/Charlesworth");
            if (!appFolder.exists())
                appFolder.mkdir();
            securityDateFile = new File(System.getenv("APPDATA") + "/Charlesworth/.security");
            if (!securityDateFile.exists())
                securityDateFile.createNewFile();
            addDateToFile(securityDateFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void addDateToFile(File securityDateFile) throws IOException{
        PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(securityDateFile, true)));
        writer.append("LaTEX"+encryptDate());
        writer.close();
    }

    private String encryptDate(){
        Date today = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        return sdf.format(today);
    }

    private boolean isTrialPeriod() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(securityDateFile));
            String line;
            StringBuilder content = new StringBuilder();
            while ((line = reader.readLine()) != null)
                content.append(line);
            reader.close();
            String datesLine = content.toString();
            return checkDates(datesLine);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    private boolean checkDates(String datesLine) {
        String[] stringDates = datesLine.split("LaTEX");
        ArrayList<Date> dates = new ArrayList<Date>();
        for (int i=1;i<stringDates.length;++i) {
            String date = stringDates[i];
            try {
                dates.add(dateFromString(date));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        Date today = new Date();
        Date firstInit = dates.get(0);
        Date endTrialDate = getFinishDate(firstInit);
        trialProgressBar.setMaximum(trialLength);
        int diffInDays = (int)( (today.getTime() - firstInit.getTime())
                / (1000 * 60 * 60 * 24) );
        daysleftLabel.setText((30-diffInDays)+" day(s) remaining");
        trialProgressBar.setValue(diffInDays);
        return today.after(dates.get(0)) && today.before(endTrialDate);
    }

    private Date getFinishDate(Date startDate){
        Calendar cal = Calendar.getInstance();
        cal.setTime(startDate);
        cal.add(Calendar.DATE, trialLength);
        return cal.getTime();
    }

    private Date decryptDate(String date) throws ParseException{
        return dateFromString(date);
    }

    private Date dateFromString(String strDate) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        return sdf.parse(strDate);
    }

    private void okButtonActionPerformed(ActionEvent e) {
        if(validTrial) {
            openMainWindow();
        }else
            System.exit(1);
    }

    private void openMainWindow(){
        this.setEnabled(false);
        this.setVisible(false);
        new MainWindow().setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Vasyl Kutsyk
        trialProgressBar = new JProgressBar();
        okButton = new JButton();
        label1 = new JLabel();
        label2 = new JLabel();
        daysleftLabel = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();

        //======== this ========
        setTitle("Trial LaTEX");
        setFont(new Font("Times New Roman", Font.PLAIN, 14));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setIconImage(((ImageIcon)UIManager.getIcon("OptionPane.warningIcon")).getImage());
        setResizable(false);
        Container contentPane = getContentPane();

        //---- okButton ----
        okButton.setText("Ok");
        okButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                okButtonActionPerformed(e);
            }
        });

        //---- label1 ----
        label1.setText("0");
        label1.setFont(new Font("Arial", Font.PLAIN, 14));

        //---- label2 ----
        label2.setText("30");
        label2.setFont(new Font("Arial", Font.PLAIN, 14));

        //---- daysleftLabel ----
        daysleftLabel.setText("X day(s) remaining");
        daysleftLabel.setFont(new Font("Arial", Font.PLAIN, 14));

        //---- label4 ----
        label4.setText("<html>LaTEXtoXML is demo version of programm and has 30 days of testing period. This version is only for testing purpose.</html>");
        label4.setFont(new Font("Arial", Font.PLAIN, 14));

        //---- label5 ----
        label5.setText("LaTEX");
        label5.setFont(new Font("Baskerville Old Face", Font.PLAIN, 48));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(123, 123, 123)
                                                .addComponent(label5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(112, 112, 112))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addComponent(label4, GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                                                .addContainerGap())
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGroup(contentPaneLayout.createParallelGroup()
                                                        .addComponent(okButton, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(trialProgressBar, GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                .addComponent(label1)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                                                                .addComponent(daysleftLabel)
                                                                .addGap(110, 110, 110)
                                                                .addComponent(label2)))
                                                .addContainerGap())))
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label4, GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(label1)
                                        .addComponent(label2)
                                        .addComponent(daysleftLabel))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(trialProgressBar, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(okButton)
                                .addGap(17, 17, 17))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Vasyl Kutsyk
    private JProgressBar trialProgressBar;
    private JButton okButton;
    private JLabel label1;
    private JLabel label2;
    private JLabel daysleftLabel;
    private JLabel label4;
    private JLabel label5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}