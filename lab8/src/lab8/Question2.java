package lab8;

import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Question2 extends JFrame implements ActionListener {
	
	public Question2() {
		
		
		setLayout(new BorderLayout());
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		
		panel.setLayout(new GridLayout(4, 3));
		panel2.setLayout(new GridLayout(2,1));
		
		panel.add(jbt1);
		panel.add(jbt2);
		panel.add(jbt3);
		panel.add(jbt4);
		panel.add(jbt5);
		panel.add(jbt6);
		panel.add(jbt7);
		panel.add(jbt8);
		panel.add(jbt9);
		panel.add(jbtEnter);
		panel.add(jbt0);
		panel.add(jbtClose);
		
		panel2.add(jLabel);
		panel2.add(jTf);
		
		add(panel, BorderLayout.CENTER);
		add(panel2, BorderLayout.NORTH);
		
		jbt1.addActionListener(this);
		jbt2.addActionListener(this);
		jbt3.addActionListener(this);
		jbt4.addActionListener(this);
		jbt5.addActionListener(this);
		jbt6.addActionListener(this);
		jbt7.addActionListener(this);
		jbt8.addActionListener(this);
		jbt9.addActionListener(this);
		jbt0.addActionListener(this);
		jbtClose.addActionListener(this);
		jbtEnter.addActionListener(this);

	}
	
	private JButton jbt1 = new JButton("1");
	private JButton jbt2 = new JButton("2");
	private JButton jbt3 = new JButton("3");
	private JButton jbt4 = new JButton("4");
	private JButton jbt5 = new JButton("5");
	private JButton jbt6 = new JButton("6");
	private JButton jbt7 = new JButton("7");
	private JButton jbt8 = new JButton("8");
	private JButton jbt9 = new JButton("9");
	private JButton jbt0 = new JButton("0");
	private JButton jbtEnter = new JButton("Enter");
	private JButton jbtClose = new JButton("Close");
	private static JTextField jTf = new JTextField();
	private JLabel jLabel = new JLabel("Please enter your pin");
	private JOptionPane jOP = new JOptionPane("Successful");
	

	
	public static void main(String[] args){
		
		Question2 frame = new Question2();
		frame.setTitle("Pin pad");
		frame.setSize(500,500);
		frame.setVisible(true);

		
	}
	
	
	
	


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == jbt1) {
			jTf.setText(jTf.getText() + "1");
		} else if (e.getSource() == jbt2) {
			jTf.setText(jTf.getText() + "2");
		} else if (e.getSource() == jbt3) {
			jTf.setText(jTf.getText() + "3");
		} else if (e.getSource() == jbt4) {
			jTf.setText(jTf.getText() + "4");
		} else if (e.getSource() == jbt5) {
			jTf.setText(jTf.getText() + "5");
		} else if (e.getSource() == jbt6) {
			jTf.setText(jTf.getText() + "6");
		} else if (e.getSource() == jbt7) {
			jTf.setText(jTf.getText() + "7");
		} else if (e.getSource() == jbt8) {
			jTf.setText(jTf.getText() + "8");
		} else if (e.getSource() == jbt9) {
			jTf.setText(jTf.getText() + "9");
		} else if (e.getSource() == jbt0) {
			jTf.setText(jTf.getText() + "0");
		} else if (e.getSource() == jbtClose) {
			jTf.setText("");
		} 
		
		if (e.getSource() == jbtEnter) {
			
			String pw;
			pw = jTf.getText();
			System.out.print(pw);
			
			if(pw.equals("1234")) {
				JFrame f = new JFrame();
				jOP.showMessageDialog(f, "success");
			}
			

		} 
	
		
	
	
	}
}
