package test.add;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;

import test.DB_API;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddProfesor {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_2;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddProfesor window = new AddProfesor();
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
	public AddProfesor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(138, 28, 86, 20);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(138, 59, 86, 20);
		frame.getContentPane().add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(138, 120, 86, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(138, 151, 86, 20);
		frame.getContentPane().add(textField_4);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(138, 89, 86, 20);
		frame.getContentPane().add(textField_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(138, 182, 86, 20);
		frame.getContentPane().add(textField_5);
		
		JLabel lblNume = new JLabel("Nume");
		lblNume.setBounds(49, 31, 63, 14);
		frame.getContentPane().add(lblNume);
		
		JLabel lblPrenume = new JLabel("Prenume");
		lblPrenume.setBounds(49, 62, 63, 14);
		frame.getContentPane().add(lblPrenume);
		
		JLabel lblGrupaid = new JLabel("Grupa_ID");
		lblGrupaid.setBounds(49, 123, 52, 14);
		frame.getContentPane().add(lblGrupaid);
		
		JLabel lblZi = new JLabel("Zi");
		lblZi.setBounds(49, 154, 63, 14);
		frame.getContentPane().add(lblZi);
		
		JLabel lblLuna = new JLabel("Luna");
		lblLuna.setBounds(49, 185, 63, 14);
		frame.getContentPane().add(lblLuna);
		
		JLabel lblMaterieid = new JLabel("Materie_ID");
		lblMaterieid.setBounds(49, 92, 63, 14);
		frame.getContentPane().add(lblMaterieid);
		
		JLabel lblProfesor = new JLabel("Profesor");
		lblProfesor.setForeground(Color.DARK_GRAY);
		lblProfesor.setFont(new Font("Sitka Banner", Font.BOLD | Font.ITALIC, 39));
		lblProfesor.setBounds(268, 28, 135, 100);
		frame.getContentPane().add(lblProfesor);
		
		JButton btnAddProfesor = new JButton("Add Profesor");
		btnAddProfesor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Nume=textField.getText();
				String Prenume=textField_1.getText();
				int Materie_ID = Integer.parseInt(textField_4.getText());
				int Grupa_ID = Integer.parseInt(textField_4.getText());
				int Zi = Integer.parseInt(textField_2.getText());
				int Luna = Integer.parseInt(textField_5.getText());
				
				DB_API ceva = new DB_API();
				ceva.Add_Profesor(Nume, Prenume, Materie_ID, Grupa_ID, Zi, Luna);
				JOptionPane.showMessageDialog(null, "Adaugat", "Success", JOptionPane.OK_OPTION);
			
			}
		});
		btnAddProfesor.setBounds(287, 205, 112, 34);
		frame.getContentPane().add(btnAddProfesor);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
