import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class FixedPanel extends JPanel{
	FixedPanel(){
		setSize(450,100);
		setVisible(true);
		ImageIcon pic = new ImageIcon("pet.png");
		JLabel l = new JLabel();
		l.add(pic);
		
		
	}
	
	public void paint(Graphics g){
		Color myColor = new Color(230,230,250);
		g.setColor(myColor);
		g.fillRect(0, 0, 450, 100);
		
		
	}
	
}
