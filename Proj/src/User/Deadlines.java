package test.userapps;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import test.Users_API;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Deadlines {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Deadlines window = new Deadlines();
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
	public Deadlines() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblDeadlines = new JLabel("Deadlines");
		lblDeadlines.setForeground(Color.DARK_GRAY);
		lblDeadlines.setFont(new Font("Sitka Banner", Font.BOLD | Font.ITALIC, 39));
		lblDeadlines.setBounds(132, 11, 186, 57);
		frame.getContentPane().add(lblDeadlines);
		
		JLabel lblNewLabel = new JLabel("Luna");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(47, 103, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(103, 102, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Luna = Integer.parseInt(textField.getText());
				Users_API ceva = new Users_API();
				ceva.Deadl_uri(Luna);
			}
		});
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		btnSubmit.setBounds(225, 101, 89, 23);
		frame.getContentPane().add(btnSubmit);
	}

}
