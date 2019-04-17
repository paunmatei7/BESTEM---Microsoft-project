package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DataBaseMenu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DataBaseMenu window = new DataBaseMenu();
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
	public DataBaseMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.getContentPane().setLayout(null);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DataBaseAdd dba = new DataBaseAdd();
				DataBaseAdd.main(null);
			}
		});
		btnAdd.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 14));
		btnAdd.setBounds(22, 153, 161, 63);
		frame.getContentPane().add(btnAdd);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DataBaseRemove dbr = new DataBaseRemove();
				DataBaseRemove.main(null);
			}
		});
		btnRemove.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 14));
		btnRemove.setBounds(229, 153, 161, 63);
		frame.getContentPane().add(btnRemove);
		
		JLabel lblDataBase = new JLabel("Data Base");
		lblDataBase.setForeground(Color.DARK_GRAY);
		lblDataBase.setFont(new Font("Sitka Banner", Font.BOLD | Font.ITALIC, 39));
		lblDataBase.setBounds(127, 11, 179, 100);
		frame.getContentPane().add(lblDataBase);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
