package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AfterLogin {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AfterLogin window = new AfterLogin();
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
	public AfterLogin() {
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
		
		JLabel lblNewLabel = new JLabel("Te-ai logat cu succes !");
		lblNewLabel.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 42));
		lblNewLabel.setBounds(10, -23, 424, 183);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnContinua = new JButton("Continua");
		btnContinua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserApps ua = new UserApps();
				UserApps.main(null);
			}
		});
		btnContinua.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnContinua.setBounds(143, 173, 136, 32);
		frame.getContentPane().add(btnContinua);
	}
}
