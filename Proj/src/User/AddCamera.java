package User.add;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;

import test.DB_API;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class AddCamera {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JLabel Student_ID;
	private JLabel Camera_ID;
	private JLabel Camin_ID;
	private JLabel Nr_Studenti;
	private JLabel Nr_Locuri_Libere;
	private JLabel Rating_Camera;
	private JLabel Numar_Camera;
	private JLabel lblCamera;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCamera window = new AddCamera();
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
	public AddCamera() {
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
		
		JButton btnAddCamera = new JButton("Add Camera");
		btnAddCamera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Student_ID=Integer.parseInt(textField.getText());
				int Camera_ID=Integer.parseInt(textField_1.getText());
				int Camin_ID=Integer.parseInt(textField_2.getText());
				int Nr_Studenti=Integer.parseInt(textField_3.getText());
				int Nr_Locuri_Libere=Integer.parseInt(textField_4.getText());
				int Rating_Camera=Integer.parseInt(textField_5.getText());
				int Numar_camera=Integer.parseInt(textField_6.getText());
				
				DB_API ceva = new DB_API();
				ceva.Add_Camera(Student_ID, Camera_ID, Camin_ID, Nr_Studenti, Nr_Locuri_Libere, Rating_Camera , Numar_camera);
				JOptionPane.showMessageDialog(null, "Adaugat", "Success", JOptionPane.OK_OPTION);
				
			}
		});
		btnAddCamera.setBounds(272, 216, 112, 34);
		frame.getContentPane().add(btnAddCamera);
		
		textField = new JTextField();
		textField.setBounds(133, 11, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(133, 42, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(133, 103, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(133, 134, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(133, 165, 86, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(133, 196, 86, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(133, 72, 86, 20);
		frame.getContentPane().add(textField_6);
		
		Student_ID = new JLabel("Student_ID");
		Student_ID.setBounds(44, 14, 63, 14);
		frame.getContentPane().add(Student_ID);
		
		Camera_ID = new JLabel("Camera_ID");
		Camera_ID.setBounds(44, 45, 63, 14);
		frame.getContentPane().add(Camera_ID);
		
		Camin_ID = new JLabel("Camin_ID");
		Camin_ID.setBounds(50, 106, 46, 14);
		frame.getContentPane().add(Camin_ID);
		
		Nr_Studenti = new JLabel("Nr_Studenti");
		Nr_Studenti.setBounds(44, 137, 63, 14);
		frame.getContentPane().add(Nr_Studenti);
		
		Nr_Locuri_Libere = new JLabel("Nr_Locuri_Libere");
		Nr_Locuri_Libere.setBounds(27, 168, 80, 14);
		frame.getContentPane().add(Nr_Locuri_Libere);
		
		Rating_Camera = new JLabel("Rating_Camera");
		Rating_Camera.setBounds(27, 199, 80, 14);
		frame.getContentPane().add(Rating_Camera);
		
		Numar_Camera = new JLabel("Numar_Camera");
		Numar_Camera.setBounds(27, 75, 80, 14);
		frame.getContentPane().add(Numar_Camera);
		
		lblCamera = new JLabel("Camera");
		lblCamera.setForeground(Color.DARK_GRAY);
		lblCamera.setFont(new Font("Sitka Banner", Font.BOLD | Font.ITALIC, 39));
		lblCamera.setBounds(261, 14, 123, 100);
		frame.getContentPane().add(lblCamera);
	}

}
