package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;

import test.remove.RemoveCamera;
import test.remove.RemoveCamin;
import test.remove.RemoveGrupa;
import test.remove.RemoveMaterie;
import test.remove.RemoveProfesor;
import test.remove.RemoveProgram;
import test.remove.RemoveStudent;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DataBaseRemove {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DataBaseRemove window = new DataBaseRemove();
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
	public DataBaseRemove() {
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
		
		JButton button = new JButton("Camera");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RemoveCamera rm = new RemoveCamera();
				RemoveCamera.main(null);
			}
		});
		button.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 14));
		button.setBounds(10, 79, 125, 43);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("Camin");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RemoveCamin rm = new RemoveCamin();
				RemoveCamin.main(null);
			}
		});
		button_1.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 14));
		button_1.setBounds(10, 139, 125, 43);
		frame.getContentPane().add(button_1);
		
		JLabel lblDataBaseRemove = new JLabel("Data Base Remove");
		lblDataBaseRemove.setForeground(Color.DARK_GRAY);
		lblDataBaseRemove.setFont(new Font("Sitka Banner", Font.BOLD | Font.ITALIC, 39));
		lblDataBaseRemove.setBounds(61, 11, 300, 57);
		frame.getContentPane().add(lblDataBaseRemove);
		
		JButton button_2 = new JButton("Grupa");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RemoveGrupa rg = new RemoveGrupa();
				RemoveGrupa.main(null);
			}
		});
		button_2.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 14));
		button_2.setBounds(10, 200, 125, 43);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("Materie");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RemoveMaterie rm = new RemoveMaterie();
				RemoveMaterie.main(null);
			}
		});
		button_3.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 14));
		button_3.setBounds(160, 79, 125, 43);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("Profesor");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RemoveProfesor rp = new RemoveProfesor();
				RemoveProfesor.main(null);
			}
		});
		button_4.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 14));
		button_4.setBounds(160, 139, 125, 43);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("Program");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RemoveProgram rp = new RemoveProgram();
				RemoveProgram.main(null);
			}
		});
		button_5.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 14));
		button_5.setBounds(160, 200, 125, 43);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("Student");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RemoveStudent rs = new RemoveStudent();
				RemoveStudent.main(null);
				
			}
		});
		button_6.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 14));
		button_6.setBounds(299, 79, 125, 43);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("User");
		button_7.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 14));
		button_7.setBounds(300, 139, 125, 43);
		frame.getContentPane().add(button_7);
	}

}
