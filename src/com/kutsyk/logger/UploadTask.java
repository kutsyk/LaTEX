package com.kutsyk.logger;

/**
 * Created by Kutsyk on 01.06.2015.
 */
import java.io.File;
import java.io.FileInputStream;

import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

/**
 * Executes the file upload in a background thread and updates progress to
 * listeners that implement the java.beans.PropertyChangeListener interface.
 * @author www.codejava.net
 *
 */
public class UploadTask extends SwingWorker<Void, Void> {
    private static final int BUFFER_SIZE = 4096;

    private String host;
    private int port;
    private String username;
    private String password;

    private String destDir;
    private File uploadFile;

    public UploadTask(String host, int port, String username, String password,
                      String destDir, File uploadFile) {
        this.host = host;
        this.port = port;
        this.username = username;
        this.password = password;
        this.destDir = destDir;
        this.uploadFile = uploadFile;
    }

    /**
     * Executed in background thread
     */
    @Override
    protected Void doInBackground() throws Exception {
        FTPUtility util = new FTPUtility(host, port, username, password);
        try {
            util.connect();
            util.uploadFile(uploadFile, destDir);

            FileInputStream inputStream = new FileInputStream(uploadFile);
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead = -1;
            long totalBytesRead = 0;
            int percentCompleted = 0;
            long fileSize = uploadFile.length();

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                util.writeFileBytes(buffer, 0, bytesRead);
                totalBytesRead += bytesRead;
                percentCompleted = (int) (totalBytesRead * 100 / fileSize);
                setProgress(percentCompleted);
            }
            inputStream.close();
            util.finish();
        } catch (FTPException ex) {
            JOptionPane.showMessageDialog(null, "Error uploading file: " + ex.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            setProgress(0);
            cancel(true);
        } finally {
            util.disconnect();
        }

        return null;
    }

    /**
     * Executed in Swing's event dispatching thread
     */
    @Override
    protected void done() {
        if (!isCancelled()) {
//            JOptionPane.showMessageDialog(null,
//                    "File has been uploaded successfully!", "Message",
//                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
