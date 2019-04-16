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

public class AddProgram {

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
					AddProgram window = new AddProgram();
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
	public AddProgram() {
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
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(124, 102, 86, 20);
		frame.getContentPane().add(textField);
		
		JLabel lblStart = new JLabel("Start");
		lblStart.setBounds(35, 105, 63, 14);
		frame.getContentPane().add(lblStart);
		
		JLabel lblFinish = new JLabel("Finish");
		lblFinish.setBounds(35, 136, 63, 14);
		frame.getContentPane().add(lblFinish);
		
		JLabel lblZi = new JLabel("Zi");
		lblZi.setBounds(35, 166, 63, 14);
		frame.getContentPane().add(lblZi);
		
		JLabel lblProgram = new JLabel("Program");
		lblProgram.setForeground(Color.DARK_GRAY);
		lblProgram.setFont(new Font("Sitka Banner", Font.BOLD | Font.ITALIC, 39));
		lblProgram.setBounds(249, 21, 155, 100);
		frame.getContentPane().add(lblProgram);
		
		JButton btnAddProgram = new JButton("Add Program");
		btnAddProgram.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Inceput_ora = Integer.parseInt(textField.getText());
				int Sfarsit_ora = Integer.parseInt(textField_1.getText());
				int zi = Integer.parseInt(textField_2.getText());
				
				DB_API ceva = new DB_API();
				ceva.Add_Program(Inceput_ora, Sfarsit_ora, zi);
				JOptionPane.showMessageDialog(null, "Adaugat", "Success", JOptionPane.OK_OPTION);
			}
		});
		btnAddProgram.setBounds(268, 198, 112, 34);
		frame.getContentPane().add(btnAddProgram);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(124, 133, 86, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(124, 163, 86, 20);
		frame.getContentPane().add(textField_2);
	}

}
