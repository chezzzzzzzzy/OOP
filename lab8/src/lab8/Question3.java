package lab8;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Question3 extends JFrame implements ActionListener {

	
	public Question3() {
		
		setLayout(new BorderLayout());
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		
		panel.setLayout(new GridLayout(4,3));
		panel2.setLayout(new GridLayout(1,3));
		
		panel2.add(jbtA);
		panel2.add(jbtB);
		panel2.add(jbtF);
		
		panel.add(jTfA0);
		panel.add(jTfB0);
		panel.add(jTfF0);

		
		panel.add(jTfA1);
		panel.add(jTfB1);
		panel.add(jTfF1);

		
		panel.add(jTfA2);
		panel.add(jTfB2);
		panel.add(jTfF2);

		
		panel.add(jTfA3);
		panel.add(jTfB3);
		panel.add(jTfF3);
		
		
		add(panel2, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		
		
;
	}
	
	private JButton jbtA = new JButton("A");
	private JButton jbtB = new JButton("B");
	private JButton jbtF = new JButton("F");
	
	private JTextField jTfA0 = new JTextField("0");
	private JTextField jTfA1 = new JTextField("0");
	private JTextField jTfA2 = new JTextField("1");
	private JTextField jTfA3 = new JTextField("1");

	private JTextField jTfB0 = new JTextField("0");
	private JTextField jTfB1 = new JTextField("1");
	private JTextField jTfB2 = new JTextField("0");
	private JTextField jTfB3 = new JTextField("1");

	private JTextField jTfF0 = new JTextField();
	private JTextField jTfF1 = new JTextField();
	private JTextField jTfF2 = new JTextField();
	private JTextField jTfF3 = new JTextField();

	
	
	
	public static void main(String[] args) {
		Question3 frame = new Question3();
		frame.setTitle("Truth table");
		frame.setSize(300,300);
		frame.setVisible(true);
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
//		if (e.getSource() == jbtA) {
//			jTfF0.setText("0");
//			jTfF1.setText("0");
//			jTfF2.setText("0");
//			jTfF3.setText("0");
//		}
		
		
		
		
	}
	
	

	
	
	

}
