package Panels;

import java.awt.event.*;
import javax.swing.*;


public class LoginPanel extends JPanel{
	private JTextField inputID;
	private JPasswordField inputPW;
	private JComboBox shelterList;
	private JLabel idLabel, pwLabel, logoLabel, shelterLabel;
	private JButton loginButton, guestButton;
	private ImageIcon logo;
	private final int HEIGHT = 400, WIDTH = 400;
	
	public LoginPanel(JFrame frame) {
		GroupLayout layout = new GroupLayout(this);
	    setLayout(layout);
	    layout.setAutoCreateGaps(true);
	    layout.setAutoCreateContainerGaps(true);
		
		idLabel = new JLabel("Employee ID: ");
		pwLabel = new JLabel("Password: ");
		shelterLabel = new JLabel("Shelter: ");

		guestButton = new JButton("Guest");
		guestButton.addActionListener(new GuestListener(frame));
		loginButton = new JButton("Login");
		loginButton.addActionListener(new EmployeeListener(frame));
		
		String[] shelterEx = {"HappyVille", "One4All", "PecanPie"};
		shelterList = new JComboBox(shelterEx);
		
		inputID = new JTextField(20);
		inputPW = new JPasswordField(20);
		
		logo = new ImageIcon("pet.png");
		logoLabel = new JLabel(logo);
		
		GroupLayout.SequentialGroup leftToRight = layout.createSequentialGroup();
	    GroupLayout.ParallelGroup col1 = layout.createParallelGroup();
	    col1.addComponent(logoLabel);
	    col1.addComponent(shelterLabel);
	    col1.addComponent(idLabel);
	    col1.addComponent(pwLabel);
	    col1.addComponent(guestButton);
	    GroupLayout.ParallelGroup col2 = layout.createParallelGroup();
	    col2.addComponent(shelterList);
	    col2.addComponent(inputID);
	    col2.addComponent(inputPW);
	    col2.addComponent(loginButton);
	    
	    leftToRight.addGroup(col1);
	    leftToRight.addGroup(col2);
	    
	    GroupLayout.SequentialGroup topToBottom = layout.createSequentialGroup();
	    GroupLayout.ParallelGroup row1 = layout.createParallelGroup(GroupLayout.Alignment.CENTER);
	    row1.addComponent(logoLabel);
	    GroupLayout.ParallelGroup row2 = layout.createParallelGroup(GroupLayout.Alignment.CENTER);
	    row2.addComponent(shelterLabel);
	    row2.addComponent(shelterList);
	    GroupLayout.ParallelGroup row3 = layout.createParallelGroup(GroupLayout.Alignment.CENTER);
	    row3.addComponent(idLabel);
	    row3.addComponent(inputID);
	    GroupLayout.ParallelGroup row4 = layout.createParallelGroup(GroupLayout.Alignment.CENTER);
	    row4.addComponent(pwLabel);
	    row4.addComponent(inputPW);
	    GroupLayout.ParallelGroup row5 = layout.createParallelGroup(GroupLayout.Alignment.CENTER);
	    row5.addComponent(guestButton);
	    row5.addComponent(loginButton);

	    topToBottom.addGroup(row1);
	    topToBottom.addGroup(row2);
	    topToBottom.addGroup(row3);
	    topToBottom.addGroup(row4);
	    topToBottom.addGroup(row5);
	    
	    layout.setHorizontalGroup(leftToRight);
	    layout.setVerticalGroup(topToBottom);		
	}
	
	
	private class EmployeeListener implements ActionListener{
		private JFrame frame;
		public EmployeeListener(JFrame frame) {
			this.frame = frame;
		}
		
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(frame,"Incorrect ID or PW");
		}
		
	}
	
	private class GuestListener implements ActionListener {
		private JFrame frame;
		public GuestListener(JFrame frame) {
			this.frame = frame;
		}
		
		public void actionPerformed(ActionEvent e) {
			changePanel(new GuestSearch(frame),frame);
		}
	}
	
	private static void changePanel(JPanel newPanel, JFrame frame) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(newPanel);
		frame.pack();
		frame.setVisible(true);
	}
}
