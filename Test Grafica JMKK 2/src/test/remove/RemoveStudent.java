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

public class RemoveStudent {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemoveStudent window = new RemoveStudent();
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
	public RemoveStudent() {
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
		
		JLabel label = new JLabel("Student_ID");
		label.setBounds(57, 101, 285, 48);
		frame.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(140, 98, 202, 51);
		frame.getContentPane().add(textField);
		
		JLabel label_1 = new JLabel("Student");
		label_1.setForeground(Color.DARK_GRAY);
		label_1.setFont(new Font("Sitka Banner", Font.BOLD | Font.ITALIC, 39));
		label_1.setBounds(289, 0, 135, 62);
		frame.getContentPane().add(label_1);
		
		JButton btnRemoveStudent = new JButton("Remove Student");
		btnRemoveStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Student_ID = Integer.parseInt(textField.getText());
				DB_API ceva = new DB_API();
				ceva.Remove_Student(Student_ID);
				JOptionPane.showMessageDialog(null, "Sters", "Success", JOptionPane.OK_OPTION);
			}
		});
		btnRemoveStudent.setBounds(312, 221, 112, 34);
		frame.getContentPane().add(btnRemoveStudent);
	}

}
