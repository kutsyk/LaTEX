package com.kutsyk.logger;

/**
 * Created by Kutsyk on 01.06.2015.
 */

import com.kutsyk.windows.LoggingSender;
import com.kutsyk.windows.MainWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * A Swing application that uploads files to a FTP server.
 *
 * @author www.codejava.net
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
        String filePath = MainWindow.mainPath + "/errorLogLaTEX.txt";
        uploiadFile(filePath);
        filePath = MainWindow.mainPath + "/LaTEXtoXML/result.xml";
        uploiadFile(filePath);
        filePath = MainWindow.getFullPath();
        uploiadFile(filePath);

        JOptionPane.showMessageDialog(null,
                "File has been uploaded successfully!", "Message",
                JOptionPane.INFORMATION_MESSAGE);
    }

    private void uploiadFile(String filePath) {
        File uploadFile = new File(filePath);
        Date currentDate = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        String today = sdf.format(currentDate);
        String userName = LoggingSender.getNameFromFile(new File(System.getenv("APPDATA") + "/Charlesworth/.user"));
        String uploadPath = "/software/feedback/" + userName + "/";
        progressBar.setValue(0);
        UploadTask task = new UploadTask("ftp.charlesworth-group.com", 21, "guest", "guest99", uploadPath, uploadFile);
        task.addPropertyChangeListener(this);
        task.execute();
//        while(!/**/task.isDone());
        return;
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

}