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
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class ProjectDialogScreen extends JDialog {
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ProjectDialogScreen dialog = new ProjectDialogScreen();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ProjectDialogScreen() {
		setBounds(100, 100, 450, 404);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 49, 434, 305);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Nome");
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 11, 414, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Descri\u00E7\u00E3o");
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(10, 67, 400, 20);
		panel.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		textField.setBounds(10, 30, 414, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		textArea.setBounds(10, 89, 414, 205);
		panel.add(textArea);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(46, 139, 87));
		panel_1.setBounds(0, 0, 434, 50);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Projeto");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 4, 180, 26);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Leticia\\eclipse-workspace\\TodoApp\\src\\main\\resources\\check.png"));
		lblNewLabel_1.setBounds(371, 4, 53, 35);
		panel_1.add(lblNewLabel_1);
	}
}
