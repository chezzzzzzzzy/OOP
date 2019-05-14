package lab8;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import keeptoo.KGradientPanel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class CoolGUI2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CoolGUI2 window = new CoolGUI2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CoolGUI2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.getContentPane().setFont(new Font("Avenir", Font.PLAIN, 13));
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.kBorderRadius = 0;
		frame.getContentPane().add(gradientPanel);
		
		JLabel label = new JLabel("Username");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Avenir", Font.BOLD, 20));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Password");
		lblNewLabel.setFont(new Font("Avenir", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField = new JTextField();
		textField.setColumns(10);
		GroupLayout gl_gradientPanel = new GroupLayout(gradientPanel);
		gl_gradientPanel.setHorizontalGroup(
			gl_gradientPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_gradientPanel.createSequentialGroup()
					.addGap(109)
					.addGroup(gl_gradientPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(label)
						.addComponent(lblNewLabel))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_gradientPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(115))
		);
		gl_gradientPanel.setVerticalGroup(
			gl_gradientPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_gradientPanel.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_gradientPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label))
					.addGap(5)
					.addGroup(gl_gradientPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel)))
		);
		gradientPanel.setLayout(gl_gradientPanel);
	}

}
