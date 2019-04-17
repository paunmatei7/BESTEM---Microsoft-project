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

public class RemoveGrupa {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemoveGrupa window = new RemoveGrupa();
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
	public RemoveGrupa() {
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
		
		JLabel lblGrupaid = new JLabel("Grupa_ID");
		lblGrupaid.setBounds(57, 96, 285, 48);
		frame.getContentPane().add(lblGrupaid);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(140, 93, 202, 51);
		frame.getContentPane().add(textField);
		
		JLabel lblGrupa = new JLabel("Grupa");
		lblGrupa.setForeground(Color.DARK_GRAY);
		lblGrupa.setFont(new Font("Sitka Banner", Font.BOLD | Font.ITALIC, 39));
		lblGrupa.setBounds(289, -5, 135, 62);
		frame.getContentPane().add(lblGrupa);
		
		JButton btnRemoveGrupa = new JButton("Remove Grupa");
		btnRemoveGrupa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ID = Integer.parseInt(textField.getText());
				DB_API ceva = new DB_API();
				ceva.Remove_Grupa(ID);
				JOptionPane.showMessageDialog(null, "Sters", "Success", JOptionPane.OK_OPTION);
			}
		});
		btnRemoveGrupa.setBounds(312, 216, 112, 34);
		frame.getContentPane().add(btnRemoveGrupa);
	}

}
