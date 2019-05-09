package lab8;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class InteractiveGUI extends JFrame implements ActionListener {
	
	public InteractiveGUI() {
		setLayout(new BorderLayout());
		JPanel p1 = new JPanel();
		
		p1.setLayout(new GridLayout(2,2));
		p1.add(jbtRect);
		p1.add(jbtOval);
		p1.add(jbtCircle);
		p1.add(jbtExitStyled);
				
		add(p1, BorderLayout.CENTER);
		add(jText, BorderLayout.NORTH);
		
		jbtRect.addActionListener(this);
		jbtExit.addActionListener(this);
		


		
	}
	
	public void actionPerfomed(ActionEvent e) {
		

	}
		
	private JButton jbtRect = new JButton("Rectangle");
	private JButton jbtOval = new JButton("Oval");
	private JButton jbtCircle = new JButton("Circle");
	private JButton jbtExit  = new JButton("Exit");
	private JTextField jText = new JTextField("");
	
	JButton jbtExitStyled = new JButton("<html><center><b><u><font color=#ff0000> E</u>ixt</font></b></br><font color='green'>(close) </font></html>");
	

	
	public static void main(String[] args) {
		
		InteractiveGUI frame = new InteractiveGUI();
		frame.setTitle("Shapes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,250);
		frame.setVisible(true);
			
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == jbtRect) {
			jText.setText("You pressed the rect button");
		} else if(e.getSource() == jbtOval) {
			jText.setText("You pressed the oval button");
		} else if (e.getSource() == jbtCircle) {
			jText.setText("You pressed the cirlce button");
		} else if (e.getSource() == jbtExit) {
//			System.exit();
		}
		
	}





	
	
	
	
	
	
		
	

}
