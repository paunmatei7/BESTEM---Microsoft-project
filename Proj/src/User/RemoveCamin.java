package test.remove;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import test.DB_API;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RemoveCamin {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemoveCamin window = new RemoveCamin();
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
	public RemoveCamin() {
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
		
		JLabel lblCaminid = new JLabel("Camin_ID");
		lblCaminid.setBounds(57, 101, 285, 48);
		frame.getContentPane().add(lblCaminid);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(140, 98, 202, 51);
		frame.getContentPane().add(textField);
		
		JLabel lblCamin = new JLabel("Camin");
		lblCamin.setForeground(Color.DARK_GRAY);
		lblCamin.setFont(new Font("Sitka Banner", Font.BOLD | Font.ITALIC, 39));
		lblCamin.setBounds(289, 0, 135, 62);
		frame.getContentPane().add(lblCamin);
		
		JButton btnRemoveCamin = new JButton("Remove Camin");
		btnRemoveCamin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Camin_ID = Integer.parseInt(textField.getText());
				DB_API ceva = new DB_API();
				ceva.Remove_Camin(Camin_ID);
				JOptionPane.showMessageDialog(null, "Sters", "Success", JOptionPane.OK_OPTION);
			}
		});
		btnRemoveCamin.setBounds(312, 221, 112, 34);
		frame.getContentPane().add(btnRemoveCamin);
	}

}
