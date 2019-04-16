package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;

import test.userapps.Deadlines;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserApps {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserApps window = new UserApps();
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
	public UserApps() {
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
		
		JLabel lblUserFunctions = new JLabel("User Functions");
		lblUserFunctions.setForeground(Color.DARK_GRAY);
		lblUserFunctions.setFont(new Font("Sitka Banner", Font.BOLD | Font.ITALIC, 39));
		lblUserFunctions.setBounds(91, 11, 261, 57);
		frame.getContentPane().add(lblUserFunctions);
		
		JButton btnDeadlines = new JButton("Deadlines");
		btnDeadlines.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Deadlines d = new Deadlines();
				Deadlines.main(null);
			}
		});
		btnDeadlines.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 14));
		btnDeadlines.setBounds(10, 79, 125, 43);
		frame.getContentPane().add(btnDeadlines);
	}

}
