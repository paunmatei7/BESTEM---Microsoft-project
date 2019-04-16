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

public class AddStudent {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_2;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddStudent window = new AddStudent();
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
	public AddStudent() {
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
		textField.setBounds(130, 22, 86, 20);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(130, 53, 86, 20);
		frame.getContentPane().add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(130, 114, 86, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(130, 145, 86, 20);
		frame.getContentPane().add(textField_4);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(130, 83, 86, 20);
		frame.getContentPane().add(textField_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(130, 176, 86, 20);
		frame.getContentPane().add(textField_5);
		
		JLabel label = new JLabel("Nume");
		label.setBounds(41, 25, 63, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Prenume");
		label_1.setBounds(41, 56, 63, 14);
		frame.getContentPane().add(label_1);
		
		JLabel lblLocatieY = new JLabel("Locatie Y");
		lblLocatieY.setBounds(41, 117, 52, 14);
		frame.getContentPane().add(lblLocatieY);
		
		JLabel lblCaminid = new JLabel("Camin_ID");
		lblCaminid.setBounds(41, 148, 63, 14);
		frame.getContentPane().add(lblCaminid);
		
		JLabel lblCheckin = new JLabel("Checkin");
		lblCheckin.setBounds(41, 179, 63, 14);
		frame.getContentPane().add(lblCheckin);
		
		JLabel lblLocatiex = new JLabel("Locatie X");
		lblLocatiex.setBounds(41, 86, 63, 14);
		frame.getContentPane().add(lblLocatiex);
		
		JLabel lblStudent = new JLabel("Student");
		lblStudent.setForeground(Color.DARK_GRAY);
		lblStudent.setFont(new Font("Sitka Banner", Font.BOLD | Font.ITALIC, 39));
		lblStudent.setBounds(299, -5, 135, 62);
		frame.getContentPane().add(lblStudent);
		
		JButton btnAddStudent = new JButton("Add Student");
		btnAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Nume = textField.getText();
				String Prenume = textField_1.getText();
				float LocatieX = Float.parseFloat(textField_2.getText());
				float LocatieY = Float.parseFloat(textField_3.getText());
				int Camin_ID = Integer.parseInt(textField_4.getText());
				boolean checkin = Boolean.parseBoolean(textField_5.getText());
				boolean voluntar = Boolean.parseBoolean(textField_6.getText());
				int Rating_Camera = Integer.parseInt(textField_7.getText());
				int Grupa_ID = Integer.parseInt(textField_8.getText());
				int Student_ID = Integer.parseInt(textField_9.getText());
				
				DB_API ceva = new DB_API();
				ceva.Add_Student(LocatieX, LocatieY, Nume, Prenume, Camin_ID, checkin, voluntar, Rating_Camera, Grupa_ID, Student_ID);
				JOptionPane.showMessageDialog(null, "Adaugat", "Success", JOptionPane.OK_OPTION);
			}
		});
		btnAddStudent.setBounds(322, 216, 112, 34);
		frame.getContentPane().add(btnAddStudent);
		
		JLabel lblVoluntar = new JLabel("Voluntar");
		lblVoluntar.setBounds(41, 209, 63, 14);
		frame.getContentPane().add(lblVoluntar);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(130, 206, 86, 20);
		frame.getContentPane().add(textField_6);
		
		JLabel lblRatingcamera = new JLabel("Rating_Camera");
		lblRatingcamera.setBounds(226, 56, 74, 14);
		frame.getContentPane().add(lblRatingcamera);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(309, 53, 86, 20);
		frame.getContentPane().add(textField_7);
		
		JLabel lblGrupaid = new JLabel("Grupa_ID");
		lblGrupaid.setBounds(226, 86, 74, 14);
		frame.getContentPane().add(lblGrupaid);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(309, 83, 86, 20);
		frame.getContentPane().add(textField_8);
		
		JLabel lblStudentid = new JLabel("Student_ID");
		lblStudentid.setBounds(226, 117, 74, 14);
		frame.getContentPane().add(lblStudentid);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(309, 114, 86, 20);
		frame.getContentPane().add(textField_9);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
