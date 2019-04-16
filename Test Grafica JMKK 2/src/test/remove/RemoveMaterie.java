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

public class RemoveMaterie {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemoveMaterie window = new RemoveMaterie();
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
	public RemoveMaterie() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMaterieid = new JLabel("Materie_ID");
		lblMaterieid.setBounds(57, 101, 285, 48);
		frame.getContentPane().add(lblMaterieid);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(140, 98, 202, 51);
		frame.getContentPane().add(textField);
		
		JLabel lblMaterie = new JLabel("Materie");
		lblMaterie.setForeground(Color.DARK_GRAY);
		lblMaterie.setFont(new Font("Sitka Banner", Font.BOLD | Font.ITALIC, 39));
		lblMaterie.setBounds(289, 0, 135, 62);
		frame.getContentPane().add(lblMaterie);
		
		JButton btnRemoveMaterie = new JButton("Remove Materie");
		btnRemoveMaterie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ID = Integer.parseInt(textField.getText());
				DB_API ceva = new DB_API();
				ceva.Remove_Materie(ID);
				JOptionPane.showMessageDialog(null, "Sters", "Success", JOptionPane.OK_OPTION);
			}
		});
		btnRemoveMaterie.setBounds(312, 221, 112, 34);
		frame.getContentPane().add(btnRemoveMaterie);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
