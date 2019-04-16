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
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddCamin {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_2;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCamin window = new AddCamin();
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
	public AddCamin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.getContentPane().setLayout(null);
		
		JButton btnAddCamin = new JButton("Add Camin");
		btnAddCamin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float LocatieX=Float.parseFloat(textField.getText());
				float LocatieY=Float.parseFloat(textField_1.getText());
				String Nume=textField_2.getText();
				int Camin_ID=Integer.parseInt(textField_3.getText());
				int Camera_ID=Integer.parseInt(textField_4.getText());
				boolean checked=Boolean.parseBoolean(textField_5.getText());
				float cost=Float.parseFloat(textField_6.getText());
				
				DB_API ceva = new DB_API();
				ceva.Add_Camin(LocatieX, LocatieY, Nume, Camin_ID, Camera_ID, checked, cost);
				JOptionPane.showMessageDialog(null, "Adaugat", "Success", JOptionPane.OK_OPTION);
				
			
			}
		});
		btnAddCamin.setBounds(284, 216, 112, 34);
		frame.getContentPane().add(btnAddCamin);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(145, 11, 86, 20);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(145, 42, 86, 20);
		frame.getContentPane().add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(145, 103, 86, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(145, 134, 86, 20);
		frame.getContentPane().add(textField_4);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(145, 196, 86, 20);
		frame.getContentPane().add(textField_6);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(145, 72, 86, 20);
		frame.getContentPane().add(textField_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(145, 165, 86, 20);
		frame.getContentPane().add(textField_5);
		
		JLabel lblLocatiex = new JLabel("Locatie  X");
		lblLocatiex.setBounds(56, 14, 63, 14);
		frame.getContentPane().add(lblLocatiex);
		
		JLabel lblLocatieY = new JLabel("Locatie Y");
		lblLocatieY.setBounds(56, 45, 63, 14);
		frame.getContentPane().add(lblLocatieY);
		
		JLabel label_2 = new JLabel("Camin_ID");
		label_2.setBounds(56, 106, 52, 14);
		frame.getContentPane().add(label_2);
		
		JLabel lblCameraid = new JLabel("Camera_ID");
		lblCameraid.setBounds(56, 137, 63, 14);
		frame.getContentPane().add(lblCameraid);
		
		JLabel lblCheckin = new JLabel("Checkin");
		lblCheckin.setBounds(56, 168, 63, 14);
		frame.getContentPane().add(lblCheckin);
		
		JLabel lblCost = new JLabel("Cost");
		lblCost.setBounds(56, 199, 63, 14);
		frame.getContentPane().add(lblCost);
		
		JLabel lblNume = new JLabel("Nume");
		lblNume.setBounds(56, 75, 63, 14);
		frame.getContentPane().add(lblNume);
		
		JLabel lblCamin = new JLabel("Camin");
		lblCamin.setForeground(Color.DARK_GRAY);
		lblCamin.setFont(new Font("Sitka Banner", Font.BOLD | Font.ITALIC, 39));
		lblCamin.setBounds(273, 14, 123, 100);
		frame.getContentPane().add(lblCamin);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
