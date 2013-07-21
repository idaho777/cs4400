import javax.swing.JFrame;
import Panels.*;

public class mainPet extends JFrame{
	public static void main(String[] args) {
		JFrame frame = new JFrame("Atlanta Pet Adoption");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		LoginPanel login = new LoginPanel(frame);
		
		frame.getContentPane().add(login);
		frame.pack();
		frame.setVisible(true);
	}
}
