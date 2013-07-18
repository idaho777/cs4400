import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class petAdoptionPanel {
	petAdoptionPanel(){
		JFrame f = new JFrame();
		FixedPanel fp = new FixedPanel();
		f.setSize(450,450);
		f.add(fp);
		JPanel fixed, input = new JPanel();
		JTextField empNum, password = new JTextField();
		fp.add(f);
		
		
	}
	
}
