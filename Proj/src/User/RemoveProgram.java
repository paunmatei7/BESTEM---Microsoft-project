package test.remove;

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

public class RemoveProgram {

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
					RemoveProgram window = new RemoveProgram();
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
	public RemoveProgram() {
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
		textField.setBounds(144, 92, 86, 20);
		frame.getContentPane().add(textField);
		
		JLabel label = new JLabel("Start");
		label.setBounds(55, 95, 63, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Finish");
		label_1.setBounds(55, 126, 63, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Zi");
		label_2.setBounds(55, 156, 63, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Program");
		label_3.setForeground(Color.DARK_GRAY);
		label_3.setFont(new Font("Sitka Banner", Font.BOLD | Font.ITALIC, 39));
		label_3.setBounds(269, 11, 155, 100);
		frame.getContentPane().add(label_3);
		
		JButton btnRemoveProgram = new JButton("Remove Program");
		btnRemoveProgram.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Inceput_ora = Integer.parseInt(textField.getText());
				int Sfarsit_ora = Integer.parseInt(textField_1.getText());
				int zi = Integer.parseInt(textField_2.getText());
				
				DB_API ceva = new DB_API();
				ceva.Remove_Program(Inceput_ora, Sfarsit_ora, zi);
				JOptionPane.showMessageDialog(null, "Sters", "Success", JOptionPane.OK_OPTION);
			}
		});
		btnRemoveProgram.setBounds(288, 188, 112, 34);
		frame.getContentPane().add(btnRemoveProgram);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(144, 123, 86, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(144, 153, 86, 20);
		frame.getContentPane().add(textField_2);
	}

}
