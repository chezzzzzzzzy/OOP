package lab8;

import java.awt.*;
import javax.swing.*;

public class SimpleGUI extends JFrame {
	
	public SimpleGUI() {
		setLayout(new BorderLayout());
		JPanel p1 = new JPanel();
		
		p1.setLayout(new GridLayout(2,2));
		p1.add(jbtRect);
		p1.add(jbtOval);
		p1.add(jbtCircle);
		p1.add(jbtExitStyled);
		
		p1.add(jOP);
		
		add(p1, BorderLayout.CENTER);
		add(jText, BorderLayout.NORTH);

		
	}
		
	private JButton jbtRect = new JButton("Rectangle");
	private JButton jbtOval = new JButton("Oval");
	private JButton jbtCircle = new JButton("Circle");
	private JButton jbtExit  = new JButton("Exit");
	private JTextField jText = new JTextField("Name of shapes");
	
	JButton jbtExitStyled = new JButton("<html><center><b><u><font color=#ff0000> E</u>ixt</font></b></br><font color='green'>(close) </font></html>");
	
	String strIn2 = JOptionPane.showInputDialog(null,"Prompt Message", "D", JOptionPane.QUESTION_MESSAGE);

	
	
	JOptionPane jOP = new JOptionPane();
	
	
	
	public static void main(String[] args) {
		
		SimpleGUI frame = new SimpleGUI();
		frame.setTitle("Shapes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,250);
		frame.setVisible(true);
			
	}
	
		
	

}
