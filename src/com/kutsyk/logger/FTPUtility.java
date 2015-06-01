package com.kutsyk.logger;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

/**
 * A utility class that provides functionality for uploading files to a FTP
 * server.
 *
 * @author www.codejava.net
 * @author kutsyk
 */
public class FTPUtility {

    private String host;
    private int port;
    private String username;
    private String password;

    private FTPClient ftpClient = new FTPClient();
    private int replyCode;

    private OutputStream outputStream;

    public FTPUtility(String host, int port, String user, String pass) {
        this.host = host;
        this.port = port;
        this.username = user;
        this.password = pass;
    }

    /**
     * Connect and login to the server.
     *
     * @throws FTPException
     */
    public void connect() throws FTPException {
        try {
            ftpClient.connect(host, port);
            replyCode = ftpClient.getReplyCode();
            if (!FTPReply.isPositiveCompletion(replyCode)) {
                throw new FTPException("FTP serve refused connection.");
            }

            boolean logged = ftpClient.login(username, password);
            if (!logged) {
                // failed to login
                ftpClient.disconnect();
                throw new FTPException("Could not login to the server.");
            }

            ftpClient.enterLocalPassiveMode();
        } catch (IOException ex) {
            throw new FTPException("I/O error: " + ex.getMessage());
        }
    }

    /**
     *  * This utility class provides a method that creates a nested directory
     *  * structure on a FTP server, based on Apache Commons Net library.
     *  * @author www.codejava.net
     *  *
     *  
     */
    public boolean makeDirectories(String dirPath) throws IOException {
//        System.out.println("-"+dirPath);
//        String[] pathElements = dirPath.split("/");
//        for (String singleDir :pathElements)
//            System.out.println(singleDir);
//        System.out.println("---------------------");
        String[] pathElements = dirPath.split("/");
        if (pathElements != null && pathElements.length > 0) {
            for (String singleDir :pathElements) {
                if(singleDir.isEmpty())
                    continue;
                boolean existed = ftpClient.changeWorkingDirectory(singleDir);
                if (!existed) {
                    System.out.println(singleDir);
                    boolean created = ftpClient.makeDirectory(singleDir);
                    if (created) {
                        System.out.println("CREATED directory: " + singleDir);
                        ftpClient.changeWorkingDirectory(singleDir);
                    } else {
                        System.out.println("COULD NOT create directory: " + singleDir);
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /**
     * Start uploading a file to the server
     *
     * @param uploadFile the file to be uploaded
     * @param destDir    destination directory on the server
     *                   where the file is stored
     * @throws FTPException if client-server communication error occurred
     */
    public void uploadFile(File uploadFile, String destDir) throws FTPException {
        try {
            makeDirectories(destDir);
            boolean success = ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
            if (!success) {
                throw new FTPException("Could not set binary file type.");
            }
            outputStream = ftpClient.storeFileStream(uploadFile.getName());

        } catch (IOException ex) {
            throw new FTPException("Error uploading file: " + ex.getMessage());
        }
    }

    /**
     * Write an array of bytes to the output stream.
     */
    public void writeFileBytes(byte[] bytes, int offset, int length)
            throws IOException {
        outputStream.write(bytes, offset, length);
    }

    /**
     * Complete the upload operation.
     */
    public void finish() throws IOException {
        outputStream.close();
        ftpClient.completePendingCommand();
    }

    /**
     * Log out and disconnect from the server
     */
    public void disconnect() throws FTPException {
        if (ftpClient.isConnected()) {
            try {
                if (!ftpClient.logout()) {
                    throw new FTPException("Could not log out from the server");
                }
                ftpClient.disconnect();
            } catch (IOException ex) {
                throw new FTPException("Error disconnect from the server: "
                        + ex.getMessage());
            }
        }
    }
}