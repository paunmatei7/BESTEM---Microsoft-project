package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class AfterRegister {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AfterRegister window = new AfterRegister();
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
	public AfterRegister() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 464, 384);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password = passwordField.getText();
				String username = textField.getText();
				String code = textField_1.getText();
				int student_id = Integer.parseInt(textField_2.getText());
				DB_API ceva = new DB_API();
				if(ceva.Add_Users(code, username, password, student_id) == 1) {
					
					 JOptionPane.showMessageDialog(null, "Inregistrare reusita", "Success", JOptionPane.ERROR_MESSAGE);
			}
			else
			{
				
				JOptionPane.showMessageDialog(null, "Invalid code !!", "Code error !!", JOptionPane.ERROR_MESSAGE);
				passwordField.setText(null);
				textField_1.setText(null);
				textField.setText(null);
			}
		
		
		
	
				
				
				
			}	
			
		});
		btnRegister.setBounds(176, 298, 89, 23);
		frame.getContentPane().add(btnRegister);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(204, 192, 86, 20);
		frame.getContentPane().add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(204, 235, 86, 20);
		frame.getContentPane().add(passwordField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(204, 110, 86, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(204, 144, 86, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel lblNewLabel = new JLabel("Student_ID");
		lblNewLabel.setBounds(115, 135, 71, 39);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Code:");
		lblNewLabel_1.setBounds(134, 113, 46, 17);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("User:");
		lblNewLabel_2.setBounds(134, 192, 46, 20);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Parola:");
		lblNewLabel_3.setBounds(134, 235, 46, 20);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblRegistration = new JLabel("Registration");
		lblRegistration.setForeground(Color.DARK_GRAY);
		lblRegistration.setFont(new Font("Sitka Banner", Font.BOLD | Font.ITALIC, 39));
		lblRegistration.setBounds(134, -1, 221, 100);
		frame.getContentPane().add(lblRegistration);
	}

}
