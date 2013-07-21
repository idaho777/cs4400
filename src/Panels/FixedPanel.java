package Panels;

import java.awt.*;
import javax.swing.*;

public class FixedPanel extends JPanel{
	public FixedPanel(){
		setSize(450,100);
		setVisible(true);
		ImageIcon pic = new ImageIcon("pet.png");
		JLabel l = new JLabel();
		
		
	}
	
	public void paint(Graphics g){
		Color myColor = new Color(230,230,250);
		g.setColor(myColor);
		g.fillRect(0, 0, 450, 100);
		
		
	}
	
}
