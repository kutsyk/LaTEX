package com.kutsyk.windows;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Tue May 05 16:26:31 EEST 2015
 */



/**
 * @author kutsyk
 */
public class TrialWindow extends JFrame {
	public TrialWindow() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		dialogPane = new JPanel();
		contentPanel = new JPanel();
		label1 = new JLabel();
		progressBar1 = new JProgressBar();
		buttonBar = new JPanel();
		okButton = new JButton();

		//======== this ========
		setTitle("Trial LaTEX");
		setFont(new Font("Times New Roman", Font.PLAIN, 14));
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());

		//======== dialogPane ========
		{
			dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
			dialogPane.setLayout(new BorderLayout());

			//======== contentPanel ========
			{

				//---- label1 ----
				label1.setText("Left days:");
				label1.setFont(new Font("Times New Roman", Font.PLAIN, 14));

				//---- progressBar1 ----
				progressBar1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
				progressBar1.setMaximum(30);
				progressBar1.setStringPainted(true);
				progressBar1.setValue(2);

				GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
				contentPanel.setLayout(contentPanelLayout);
				contentPanelLayout.setHorizontalGroup(
					contentPanelLayout.createParallelGroup()
						.addGroup(contentPanelLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(contentPanelLayout.createParallelGroup()
								.addComponent(progressBar1, GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
								.addGroup(contentPanelLayout.createSequentialGroup()
									.addComponent(label1)
									.addContainerGap(302, Short.MAX_VALUE))))
				);
				contentPanelLayout.setVerticalGroup(
					contentPanelLayout.createParallelGroup()
						.addGroup(contentPanelLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(label1)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(progressBar1, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
				);
			}
			dialogPane.add(contentPanel, BorderLayout.CENTER);

			//======== buttonBar ========
			{
				buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
				buttonBar.setLayout(new GridBagLayout());
				((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 80};
				((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0};

				//---- okButton ----
				okButton.setText("OK");
				okButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
				buttonBar.add(okButton, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 0, 0), 0, 0));
			}
			dialogPane.add(buttonBar, BorderLayout.SOUTH);
		}
		contentPane.add(dialogPane, BorderLayout.CENTER);
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JPanel dialogPane;
	private JPanel contentPanel;
	private JLabel label1;
	private JProgressBar progressBar1;
	private JPanel buttonBar;
	private JButton okButton;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
