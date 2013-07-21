package Panels;

import java.awt.event.*;

import javax.swing.*;

public class GuestSearch extends JPanel {
	private JTextField inputZIP;
	private JCheckBox advCheck;
	private JLabel zipLabel, typeLabel, breedLabel, genderLabel, ageLabel, logoLabel;
	private JComboBox typeList, breedList, genderList, ageList;
	private JButton searchButton;
	private ImageIcon logo;
	
	public GuestSearch(JFrame frame) {
		GroupLayout layout = new GroupLayout(this);
	    setLayout(layout);
	    layout.setAutoCreateGaps(true);
	    layout.setAutoCreateContainerGaps(true);	    
	    
		logo = new ImageIcon("pet.png");
		logoLabel = new JLabel(logo);

	    advCheck = new JCheckBox("Advanced Search");
	    advCheck.setSelected(false);
	    advCheck.addItemListener(new BoxListener(frame));;
	    
	    zipLabel = new JLabel("Enter Zip: ");
	    inputZIP = new JTextField(5);
	    
	    searchButton = new JButton("Search");
	    searchButton.addActionListener(new SearchListener(frame));

	    //TODO, set visibility based on check box.  these will show under the zip input
	    typeLabel = new JLabel("Type: ");
	    breedLabel = new JLabel("Breed: ");
	    genderLabel = new JLabel("Gender: ");
	    ageLabel = new JLabel("Age: ");
	    
	    typeList = new JComboBox();
	    breedList = new JComboBox();
	    genderList = new JComboBox();
	    ageList = new JComboBox();
	    
	    
	    
	    GroupLayout.SequentialGroup leftToRight = layout.createSequentialGroup();
	    GroupLayout.ParallelGroup col1 = layout.createParallelGroup();
	    col1.addComponent(logoLabel);
	    col1.addComponent(zipLabel);
	    GroupLayout.ParallelGroup col2 = layout.createParallelGroup();
	    col2.addComponent(advCheck);
	    col2.addComponent(inputZIP);
	    col2.addComponent(searchButton);
	 
	    leftToRight.addGroup(col1);
	    leftToRight.addGroup(col2);
	    
	    GroupLayout.SequentialGroup topToBottom = layout.createSequentialGroup();
	    GroupLayout.ParallelGroup row1 = layout.createParallelGroup(GroupLayout.Alignment.CENTER);
	    row1.addComponent(logoLabel);
	    row1.addComponent(advCheck);
	    GroupLayout.ParallelGroup row2 = layout.createParallelGroup(GroupLayout.Alignment.CENTER);
	    row2.addComponent(zipLabel);
	    row2.addComponent(inputZIP);
	    GroupLayout.ParallelGroup row7 = layout.createParallelGroup(GroupLayout.Alignment.CENTER);
	    row7.addComponent(searchButton);
	    
	    topToBottom.addGroup(row1);
	    topToBottom.addGroup(row2);
	    topToBottom.addGroup(row7);
	    
	    layout.setHorizontalGroup(leftToRight);
	    layout.setVerticalGroup(topToBottom);		
	}
	
	private class SearchListener implements ActionListener {
		private JFrame frame;
		public SearchListener(JFrame frame) {
			this.frame = frame;
		}
		
		public void actionPerformed(ActionEvent e) {
			System.out.println("Searching");
		}
		
	}
	
	public class BoxListener implements ItemListener {
		private JFrame frame;
		public BoxListener(JFrame frame){
			this.frame = frame;
		}
		
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				System.out.println("Selected");
			}
		}
	}
	
	private static void changePanel(JPanel newPanel, JFrame frame) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(newPanel);
		frame.pack();
		frame.setVisible(true);
	}
}
