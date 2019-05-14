package lab8;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.*;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TempConversion extends JFrame implements ActionListener {
	
	
	
	public static void main(String[] args) {
		
		TempConversion frame = new TempConversion();
		frame.setTitle("Temperature conversion");
		frame.setSize(500,250);
		frame.setVisible(true);
		
	

	}
	
	public TempConversion() {
		
		setLayout(new BorderLayout());
		JPanel input = new JPanel();
		JPanel choice = new JPanel();
		JPanel output = new JPanel();
		
			
		input.setLayout(new GridLayout(1,5));
		choice.setLayout(new FlowLayout());
		output.setLayout(new GridLayout(1,2));	
		
		input.add(startingLabel);
		input.add(starting);
		input.add(tillLabel);
		input.add(till);
		input.add(withStepLabel);
		input.add(withStep);
		
		
		choice.add(cToFbutton);
		choice.add(cToF);
		choice.add(fToCbutton);
		choice.add(fToC);
		
		choice.add(convertButton);
		choice.add(resetButton);
		
		output.add(boxA);
		output.add(boxB);
		
		
		add(input, BorderLayout.NORTH);
		add(choice, BorderLayout.CENTER);
		add(output, BorderLayout.SOUTH);
		
		ButtonGroup group = new ButtonGroup();
	    group.add(cToFbutton);
	    group.add(fToCbutton);
	    
	    cToFbutton.addActionListener(this);
	    fToCbutton.addActionListener(this);
	    
	    resetButton.addActionListener(this);
	    convertButton.addActionListener(this);

	  
		
	}
	
	private JButton convertButton = new JButton("Convert");
	private JButton resetButton = new JButton("Reset");
	
	private JLabel startingLabel = new JLabel("Starting from:");
	private JLabel tillLabel = new JLabel("Till:");
	private JLabel withStepLabel = new JLabel("With step: ");

	private JTextField starting = new JTextField("");
	private JTextField till = new JTextField("");
	private JTextField withStep = new JTextField("");
	
	private JRadioButton cToFbutton = new JRadioButton();
	private JRadioButton fToCbutton = new JRadioButton();
	 
	private JLabel cToF = new JLabel("From celsius to fahrenheit");
	private JLabel fToC = new JLabel("From fahrenheit to celsius");
	
	private JTextArea boxA = new JTextArea("");
	private JTextArea boxB = new JTextArea("");
	
	
	Converter convertCtoF = new Converter();
	Converter convertFtoC = new Converter();
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		
		if (e.getSource() == resetButton) {
			starting.setText("");
			till.setText("");
			withStep.setText("");
			boxA.setText("");
			boxB.setText("");

		}
		
		
		if (e.getSource() == convertButton) {
			System.out.println("pressed");
			
			
			try {
			    int number = Integer.valueOf(starting.getText());
			    int step = Integer.valueOf(withStep.getText());

			 

				
			} catch(NumberFormatException ex){
			    System.out.println("Not a valid number!");
			    JOptionPane alert = new JOptionPane();
			    alert.showConfirmDialog(null, "Invalid input!", "", JOptionPane.DEFAULT_OPTION);

			}
			


			if (cToFbutton.isSelected()) {
				
				
				
				boxA.setText("");
				boxB.setText("");
				
				System.out.println("pressed cToFbutton");

				double convertedF;
				
				for (int i = Integer.valueOf(starting.getText()); i < Integer.valueOf(till.getText()); i+=Integer.valueOf(withStep.getText())) {
					
					withStep.getText();
					System.out.println(withStep.getText());
				
					
					boxA.setText(boxA.getText() + "\n" + Integer.toString(i));
//					System.out.println(i);
					
					convertedF = convertCtoF.cToF(Integer.valueOf(i));
					boxB.setText(boxB.getText() + "\n" + Double.toString(convertedF));

//					System.out.println(convertedF);

					
				}
				
				
				
			}
			
			if (fToCbutton.isSelected()) {
				
				boxA.setText("");
				boxB.setText("");
				
				System.out.println("pressed fToCbutton");

				double convertedC;
				
				for (int i = Integer.valueOf(starting.getText()); i < Integer.valueOf(till.getText()); i+=Integer.valueOf(withStep.getText())) {
					
					withStep.getText();

					
					boxB.setText(boxB.getText() + "\n" + Integer.toString(i));
//					System.out.println(i);
					
					convertedC = convertFtoC.fToC(Integer.valueOf(i));
					boxA.setText(boxA.getText() + "\n" + Double.toString(convertedC));

//					System.out.println(convertedF);

					
				}
				
				
				
			}
			
		
		
			
//			
		}
		
		
	}
	

	

}
