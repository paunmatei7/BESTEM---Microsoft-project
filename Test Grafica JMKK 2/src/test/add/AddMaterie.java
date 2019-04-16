package test.add;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;

import test.DB_API;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddMaterie {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMaterie window = new AddMaterie();
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
	public AddMaterie() {
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
		
		JButton btnMaterie = new JButton("Add Materie");
		btnMaterie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Denumire=textField.getText();
				int Nota=Integer.parseInt(textField_1.getText());
				int ID=Integer.parseInt(textField_2.getText());
				
				DB_API ceva = new DB_API();
				ceva.Add_Materie(Denumire, Nota, ID);
				JOptionPane.showMessageDialog(null, "Adaugat", "Success", JOptionPane.OK_OPTION);
			}
		});
		btnMaterie.setBounds(279, 213, 112, 34);
		frame.getContentPane().add(btnMaterie);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(138, 86, 86, 20);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(138, 117, 86, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(138, 147, 86, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel lblDenumire = new JLabel("Denumire");
		lblDenumire.setBounds(49, 89, 79, 14);
		frame.getContentPane().add(lblDenumire);
		
		JLabel lblNota = new JLabel("Nota");
		lblNota.setBounds(49, 120, 79, 14);
		frame.getContentPane().add(lblNota);
		
		JLabel label_2 = new JLabel("ID");
		label_2.setBounds(49, 150, 63, 14);
		frame.getContentPane().add(label_2);
		
		JLabel lblMaterie = new JLabel("Materie");
		lblMaterie.setForeground(Color.DARK_GRAY);
		lblMaterie.setFont(new Font("Sitka Banner", Font.BOLD | Font.ITALIC, 39));
		lblMaterie.setBounds(268, 11, 123, 100);
		frame.getContentPane().add(lblMaterie);
	}

}
