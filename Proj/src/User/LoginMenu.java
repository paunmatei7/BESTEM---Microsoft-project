package User;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.Font;

public class LoginMenu {

	private JFrame frame;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginMenu window = new LoginMenu();
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
	public LoginMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 585, 471);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Log in");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String password = passwordField.getText();
				String username = textField_1.getText();
				Users_API ceva = new Users_API();
				
				if(ceva.Check_user(username, password)==1) {
				
					 AfterLogin afl = new AfterLogin();
					 AfterLogin.main(null);
				}
				else
				{
					
					JOptionPane.showMessageDialog(null, "Invalid Login Details !!", "Login Error !!", JOptionPane.ERROR_MESSAGE);
					passwordField.setText(null);
					textField_1.setText(null);
				}
			}
		});
		btnNewButton.setBounds(194, 252, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setBounds(197, 175, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(194, 218, 89, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton_1 = new JButton("Make a new account");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AfterRegister ar1 = new AfterRegister();
				AfterRegister.main(null);
				
			}
		});
		btnNewButton_1.setBounds(173, 299, 131, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel AppName = new JLabel("Log in");
		AppName.setForeground(Color.DARK_GRAY);
		AppName.setFont(new Font("Sitka Banner", Font.BOLD | Font.ITALIC, 39));
		AppName.setBounds(181, 11, 123, 100);
		frame.getContentPane().add(AppName);
		
		JLabel lblNewLabel = new JLabel("User:");
		lblNewLabel.setBounds(141, 178, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Parola:");
		lblNewLabel_1.setBounds(136, 218, 51, 20);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
