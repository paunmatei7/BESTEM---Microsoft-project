package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

import test.add.AddCamera;
import test.add.AddCamin;
import test.add.AddGrupa;
import test.add.AddMaterie;
import test.add.AddProfesor;
import test.add.AddProgram;

public class DataBaseAdd {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DataBaseAdd window = new DataBaseAdd();
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
	public DataBaseAdd() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.getContentPane().setLayout(null);
		
		JButton btnCamera = new JButton("Camera");
		btnCamera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddCamera ac = new AddCamera ();
				AddCamera.main(null);
			}
		});
		btnCamera.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 14));
		btnCamera.setBounds(10, 68, 125, 43);
		frame.getContentPane().add(btnCamera);
		
		JButton btnCamin = new JButton("Camin");
		btnCamin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddCamin ac = new AddCamin();
				AddCamin.main(null);
			}
		});
		btnCamin.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 14));
		btnCamin.setBounds(10, 128, 125, 43);
		frame.getContentPane().add(btnCamin);
		
		JLabel lblDataBaseAdd = new JLabel("Data Base Add");
		lblDataBaseAdd.setForeground(Color.DARK_GRAY);
		lblDataBaseAdd.setFont(new Font("Sitka Banner", Font.BOLD | Font.ITALIC, 39));
		lblDataBaseAdd.setBounds(77, 0, 261, 57);
		frame.getContentPane().add(lblDataBaseAdd);
		
		JButton btnGrupa = new JButton("Grupa");
		btnGrupa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddGrupa ag = new AddGrupa();
				AddGrupa.main(null);
			}
		});
		btnGrupa.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 14));
		btnGrupa.setBounds(10, 189, 125, 43);
		frame.getContentPane().add(btnGrupa);
		
		JButton btnMaterie = new JButton("Materie");
		btnMaterie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddMaterie am = new AddMaterie();
				AddMaterie.main(null);
			}
		});
		btnMaterie.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 14));
		btnMaterie.setBounds(160, 68, 125, 43);
		frame.getContentPane().add(btnMaterie);
		
		JButton btnProfesor = new JButton("Profesor");
		btnProfesor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddProfesor ap = new AddProfesor();
				AddProfesor.main(null);
			}
		});
		btnProfesor.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 14));
		btnProfesor.setBounds(160, 128, 125, 43);
		frame.getContentPane().add(btnProfesor);
		
		JButton btnProgram = new JButton("Program");
		btnProgram.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddProgram ap = new AddProgram();
				AddProgram.main(null);
			}
		});
		btnProgram.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 14));
		btnProgram.setBounds(160, 189, 125, 43);
		frame.getContentPane().add(btnProgram);
		
		JButton btnStudent = new JButton("Student");
		btnStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddProfesor ap = new AddProfesor();
				AddProfesor.main(null);
			}
		});
		btnStudent.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 14));
		btnStudent.setBounds(299, 68, 125, 43);
		frame.getContentPane().add(btnStudent);
		
		JButton btnUser = new JButton("User");
		btnUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnUser.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 14));
		btnUser.setBounds(300, 128, 125, 43);
		frame.getContentPane().add(btnUser);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
