package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu window = new MainMenu();
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
	public MainMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.getContentPane().setLayout(null);
		
		JButton btnStudent = new JButton("Student");
		btnStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginMenu lm = new LoginMenu();
				LoginMenu.main(null);
			}
		});
		btnStudent.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 14));
		btnStudent.setBounds(31, 148, 161, 63);
		frame.getContentPane().add(btnStudent);
		
		JLabel lblTroubleHmmm = new JLabel("Trouble Hmmm");
		lblTroubleHmmm.setForeground(Color.DARK_GRAY);
		lblTroubleHmmm.setFont(new Font("Sitka Banner", Font.BOLD | Font.ITALIC, 39));
		lblTroubleHmmm.setBounds(87, 11, 250, 100);
		frame.getContentPane().add(lblTroubleHmmm);
		
		JButton btnDatabase = new JButton("Data Base");
		btnDatabase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DataBaseMenu dbm = new DataBaseMenu();
				DataBaseMenu.main(null);
			}
		});
		btnDatabase.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 14));
		btnDatabase.setBounds(238, 148, 161, 63);
		frame.getContentPane().add(btnDatabase);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
