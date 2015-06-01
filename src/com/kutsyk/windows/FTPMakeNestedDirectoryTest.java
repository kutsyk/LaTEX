package com.kutsyk.windows;

import com.kutsyk.logger.FTPException;
import com.kutsyk.logger.FTPUtility;
import org.apache.commons.net.ftp.FTPClient;

import java.io.IOException;

/**
 * Created by Kutsyk on 02.06.2015.
 */
public class FTPMakeNestedDirectoryTest {
    public static void main(String[] args) {
        String server = "www.codejava.net";
        int port = 21;
        String user = "username";
        String pass = "password";

//        FTPClient ftpClient = new FTPClient();
        try {
            // connect and login to the server
//            ftpClient.connect(server, port);
//            ftpClient.login(user, pass);
//
            // use local passive mode to pass firewall
//            ftpClient.enterLocalPassiveMode();

            System.out.println("Connected");

            String dirPath = "/software/java/ftp/demo/connect";
            FTPUtility util = new FTPUtility("ftp.charlesworth-group.com", 21, "guest", "guest99");
            try {
                util.connect();
            } catch (FTPException e) {
                e.printStackTrace();
            }
            util.makeDirectories(dirPath);

            // log out and disconnect from the server
//            ftpClient.logout();
//            ftpClient.disconnect();

            System.out.println("Disconnected");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
