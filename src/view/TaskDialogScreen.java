package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class TaskDialogScreen extends JDialog {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			TaskDialogScreen dialog = new TaskDialogScreen();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public TaskDialogScreen() {
		setBounds(100, 100, 437, 490);
		getContentPane().setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(0, 0, 421, 56);
			panel.setBackground(new Color(46, 139, 87));
			getContentPane().add(panel);
			panel.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Tarefa");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setForeground(new Color(255, 255, 255));
			lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
			lblNewLabel.setBounds(10, 11, 118, 30);
			panel.add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Leticia\\eclipse-workspace\\TodoApp\\src\\main\\resources\\check.png"));
			lblNewLabel_1.setBounds(342, 11, 60, 34);
			panel.add(lblNewLabel_1);
		}
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 55, 421, 396);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		textField.setBounds(10, 28, 401, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nome");
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 11, 304, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Descri\u00E7\u00E3o");
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(10, 59, 401, 14);
		panel.add(lblNewLabel_3);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 81, 401, 96);
		panel.add(textArea);
		
		JLabel lblNewLabel_4 = new JLabel("Prazo");
		lblNewLabel_4.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(10, 188, 355, 14);
		panel.add(lblNewLabel_4);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		textField_1.setBounds(10, 203, 401, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Notas");
		lblNewLabel_5.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(10, 234, 383, 14);
		panel.add(lblNewLabel_5);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(10, 256, 401, 129);
		panel.add(textArea_1);
	}

}
