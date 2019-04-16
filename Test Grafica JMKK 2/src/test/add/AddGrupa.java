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

public class AddGrupa {

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
					AddGrupa window = new AddGrupa();
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
	public AddGrupa() {
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
		
		JButton btnAddGrupa = new JButton("Add Grupa");
		btnAddGrupa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Numar_Grupa=Integer.parseInt(textField.getText());
				int Program_ID=Integer.parseInt(textField_1.getText());
				int ID=Integer.parseInt(textField_2.getText());
				
				DB_API ceva = new DB_API();
				ceva.Add_Grupa(Numar_Grupa, Program_ID, ID);
				JOptionPane.showMessageDialog(null, "Adaugat", "Success", JOptionPane.OK_OPTION);
			}
		});
		btnAddGrupa.setBounds(262, 216, 112, 34);
		frame.getContentPane().add(btnAddGrupa);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(121, 89, 86, 20);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(121, 120, 86, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(121, 150, 86, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel lblNumargrupa = new JLabel("Numar_Grupa");
		lblNumargrupa.setBounds(32, 92, 79, 14);
		frame.getContentPane().add(lblNumargrupa);
		
		JLabel lblProgramid = new JLabel("Program_ID");
		lblProgramid.setBounds(32, 123, 79, 14);
		frame.getContentPane().add(lblProgramid);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(32, 153, 63, 14);
		frame.getContentPane().add(lblId);
		
		JLabel lblGrupa = new JLabel("Grupa");
		lblGrupa.setForeground(Color.DARK_GRAY);
		lblGrupa.setFont(new Font("Sitka Banner", Font.BOLD | Font.ITALIC, 39));
		lblGrupa.setBounds(251, 14, 123, 100);
		frame.getContentPane().add(lblGrupa);
	}

}
