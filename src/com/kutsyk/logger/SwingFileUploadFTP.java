package com.kutsyk.logger;

/**
 * Created by Kutsyk on 01.06.2015.
 */
import com.kutsyk.windows.LoggingSender;
import com.kutsyk.windows.Main;
import com.kutsyk.windows.MainWindow;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 * A Swing application that uploads files to a FTP server.
 * @author www.codejava.net
 *
 */
public class SwingFileUploadFTP extends JFrame implements
        PropertyChangeListener {

    private JButton buttonUpload = new JButton("Send");
    private JLabel labelProgress = new JLabel("Progress:");
    private JProgressBar progressBar = new JProgressBar(0, 100);

    public SwingFileUploadFTP() {
        super("Send");

        // set up layout
        setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(5, 5, 5, 5);

        buttonUpload.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                buttonUploadActionPerformed(event);
            }
        });

        progressBar.setPreferredSize(new Dimension(200, 30));
        progressBar.setStringPainted(true);
        constraints.gridx = 0;
        constraints.gridwidth = 2;
        constraints.gridy = 5;
        constraints.anchor = GridBagConstraints.WEST;

        constraints.gridx = 0;
        constraints.gridy = 6;
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.fill = GridBagConstraints.NONE;
        add(buttonUpload, constraints);

        constraints.gridx = 0;
        constraints.gridy = 7;
        constraints.gridwidth = 1;
        constraints.anchor = GridBagConstraints.WEST;
        add(labelProgress, constraints);

        constraints.gridx = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        add(progressBar, constraints);

        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    /**
     * handle click event of the Upload button
     */
    private void buttonUploadActionPerformed(ActionEvent event) {
        String filePath = MainWindow.mainPath+"/errorLogLaTEX.txt";
        File uploadFile = new File(filePath);
        progressBar.setValue(0);
        UploadTask task = new UploadTask("ftp.charlesworth-group.com", 21, "guest", "guest99",
                "/software/feedback/"+ LoggingSender.getNameFromFile(new File(System.getenv("APPDATA")+"/Charlesworth/.user"))+"/"+new Date().toString(), uploadFile);
        task.addPropertyChangeListener(this);
        task.execute();

        filePath = MainWindow.mainPath+"/LaTEXtoXML/result.xml";
        uploadFile = new File(filePath);
        progressBar.setValue(0);
        task = new UploadTask("ftp.charlesworth-group.com", 21, "guest", "guest99",
                "/software/feedback/"+ LoggingSender.getNameFromFile(new File(System.getenv("APPDATA")+"/Charlesworth/.user"))+"/"+new Date().toString(), uploadFile);
        task.addPropertyChangeListener(this);
        task.execute();

        filePath = MainWindow.mainPath+"/LaTEXtoXML/result.xml";
        uploadFile = new File(filePath);
        progressBar.setValue(0);
        task = new UploadTask("ftp.charlesworth-group.com", 21, "guest", "guest99",
                "/software/feedback/"+ LoggingSender.getNameFromFile(new File(System.getenv("APPDATA")+"/Charlesworth/.user"))+"/"+new Date().toString(), uploadFile);
        task.addPropertyChangeListener(this);
        task.execute();
    }

    /**
     * Update the progress bar's state whenever the progress of upload changes.
     */
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if ("progress" == evt.getPropertyName()) {
            int progress = (Integer) evt.getNewValue();
            progressBar.setValue(progress);
        }
    }

    /**
     * Launch the application
     */
    public static void main(String[] args) {
        try {
            // set look and feel to system dependent
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingFileUploadFTP().setVisible(true);
            }
        });
    }
}