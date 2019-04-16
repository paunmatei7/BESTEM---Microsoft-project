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

public class RemoveProfesor {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemoveProfesor window = new RemoveProfesor();
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
	public RemoveProfesor() {
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
		
		JLabel lblMaterieid = new JLabel("Materie_ID");
		lblMaterieid.setBounds(57, 101, 285, 48);
		frame.getContentPane().add(lblMaterieid);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(140, 98, 202, 51);
		frame.getContentPane().add(textField);
		
		JLabel lblProfesor = new JLabel("Profesor");
		lblProfesor.setForeground(Color.DARK_GRAY);
		lblProfesor.setFont(new Font("Sitka Banner", Font.BOLD | Font.ITALIC, 39));
		lblProfesor.setBounds(289, 0, 135, 62);
		frame.getContentPane().add(lblProfesor);
		
		JButton btnRemoveProfesor = new JButton("Remove Profesor");
		btnRemoveProfesor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Materie_ID = Integer.parseInt(textField.getText());
				DB_API ceva = new DB_API();
				ceva.Remove_Profesor(Materie_ID);
				JOptionPane.showMessageDialog(null, "Sters", "Success", JOptionPane.OK_OPTION);
			}
		});
		btnRemoveProfesor.setBounds(312, 221, 112, 34);
		frame.getContentPane().add(btnRemoveProfesor);
	}

}
