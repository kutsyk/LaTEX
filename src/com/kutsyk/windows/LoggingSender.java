package com.kutsyk.windows;

import com.kutsyk.logger.SwingFileUploadFTP;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Mon Jun 01 21:41:04 MSD 2015
 */



/**
 * @author Vasyl Kutsyk
 */
public class LoggingSender extends JFrame {
    
	public LoggingSender() {
		initComponents();
        initUserName();
	}

    private void initUserName(){
        File userNameFile = new File(System.getenv("APPDATA") + "/Charlesworth/.user");
        if(userNameFile.exists())
            nameField.setText(getNameFromFile(userNameFile));
    }

    public static String getNameFromFile(File nameFile){
        StringBuilder result = new StringBuilder("");
        try{
            BufferedReader reader = new BufferedReader(new FileReader(nameFile));
            String line;
            while((line = reader.readLine())!= null)
                result.append(line);
        }catch(IOException e){
            e.printStackTrace();
        }
        return result.toString();
    }

    private boolean isUserRegistred(){
        return new File(System.getenv("APPDATA") + "/Charlesworth/.user").exists();
    }

	private void howToButtonActionPerformed(ActionEvent e) {

	}

	private void okButtonActionPerformed(ActionEvent e) {
        String userName = nameField.getText();
        if(userName.isEmpty() || userName.equals("...name...")) {
            JOptionPane.showMessageDialog(this, "Input your login please for login remembering");
            return;
        }
        if(!isUserRegistred())
            registerUser(userName);

        SwingFileUploadFTP form = new SwingFileUploadFTP();
        form.setVisible(true);
	}

    private void registerUser(String name){
        try {
            PrintWriter writer = new PrintWriter(System.getenv("APPDATA") + "/Charlesworth/.user");
            writer.append(name);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

	private void cancelButtonActionPerformed(ActionEvent e) {
        this.dispose();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Vasyl Kutsyk
		howToButton = new JButton();
		okButton = new JButton();
		cancelButton = new JButton();
		label1 = new JLabel();
		label2 = new JLabel();
		label3 = new JLabel();
		nameField = new JTextField();
		scrollPane1 = new JScrollPane();
		desirePane = new JTextPane();

		//======== this ========
		setIconImage(((ImageIcon)UIManager.getIcon("OptionPane.informationIcon")).getImage());
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setFont(new Font("Calibri", Font.PLAIN, 14));
		setTitle("Logger sender");
		Container contentPane = getContentPane();

		//---- howToButton ----
		howToButton.setText("How to");
		howToButton.setFont(new Font("Calibri", Font.PLAIN, 14));
		howToButton.setIcon(UIManager.getIcon("OptionPane.questionIcon"));
		howToButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				howToButtonActionPerformed(e);
			}
		});

		//---- okButton ----
		okButton.setText("OK");
		okButton.setFont(new Font("Calibri", Font.PLAIN, 14));
		okButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				okButtonActionPerformed(e);
			}
		});

		//---- cancelButton ----
		cancelButton.setText("Cancel");
		cancelButton.setFont(new Font("Calibri", Font.PLAIN, 14));
		cancelButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cancelButtonActionPerformed(e);
			}
		});

		//---- label1 ----
		label1.setText("Send log to us, so we can make our program better for you");
		label1.setFont(new Font("Calibri", Font.PLAIN, 16));

		//---- label2 ----
		label2.setText("Name:");
		label2.setFont(new Font("Calibri", Font.PLAIN, 16));

		//---- label3 ----
		label3.setText("Desire:");
		label3.setFont(new Font("Calibri", Font.PLAIN, 16));

		//---- nameField ----
		nameField.setText("...name...");

		//======== scrollPane1 ========
		{
			scrollPane1.setViewportView(desirePane);
		}

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGap(46, 46, 46)
							.addComponent(howToButton, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(okButton, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(cancelButton, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(label1))
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(label2))
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(label3))
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(nameField, GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE))
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)))
					.addContainerGap())
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(label1)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(label2)
					.addGap(4, 4, 4)
					.addComponent(nameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(label3)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(cancelButton, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(okButton, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(howToButton, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Vasyl Kutsyk
	private JButton howToButton;
	private JButton okButton;
	private JButton cancelButton;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JTextField nameField;
	private JScrollPane scrollPane1;
	private JTextPane desirePane;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
