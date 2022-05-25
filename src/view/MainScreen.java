package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.border.EtchedBorder;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import javax.swing.ListSelectionModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTabbedPane;
import java.awt.GridBagLayout;
import javax.swing.DebugGraphics;

public class MainScreen {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen window = new MainScreen();
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
	public MainScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setMinimumSize(new Dimension(800, 600));
		frame.setBounds(100, 100, 789, 530);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panelToobar = new JPanel();
		panelToobar.setBackground(new Color(46, 139, 87));
		panelToobar.setBounds(0, 0, 795, 108);
		frame.getContentPane().add(panelToobar);
		panelToobar.setLayout(null);
		
		JLabel ToobarTitle = new JLabel("Todo App");
		ToobarTitle.setIcon(new ImageIcon("C:\\Users\\Leticia\\eclipse-workspace\\TodoApp\\src\\main\\resources\\tick.png"));
		ToobarTitle.setForeground(new Color(255, 255, 255));
		ToobarTitle.setFont(new Font("Segoe UI", Font.BOLD, 36));
		ToobarTitle.setBounds(20, 0, 404, 72);
		panelToobar.add(ToobarTitle);
		
		JLabel ToobarSubTitle = new JLabel("Anote tudo, n\u00E3o esque\u00E7a de nada");
		ToobarSubTitle.setForeground(new Color(255, 255, 255));
		ToobarSubTitle.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		ToobarSubTitle.setBounds(20, 83, 404, 14);
		panelToobar.add(ToobarSubTitle);
		
		JPanel panelProjects = new JPanel();
		panelProjects.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panelProjects.setBackground(new Color(255, 255, 255));
		panelProjects.setBounds(0, 108, 142, 54);
		frame.getContentPane().add(panelProjects);
		panelProjects.setLayout(null);
		
		JLabel lblNewLabel_ProjectsTitle = new JLabel("Projetos");
		lblNewLabel_ProjectsTitle.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblNewLabel_ProjectsTitle.setForeground(new Color(46, 139, 87));
		lblNewLabel_ProjectsTitle.setBounds(10, 11, 60, 32);
		panelProjects.add(lblNewLabel_ProjectsTitle);
		
		JLabel lblNewLabel_ProjectsAdd = new JLabel("");
		lblNewLabel_ProjectsAdd.setIcon(new ImageIcon("C:\\Users\\Leticia\\eclipse-workspace\\TodoApp\\src\\main\\resources\\add.png"));
		lblNewLabel_ProjectsAdd.setBounds(70, 11, 54, 32);
		panelProjects.add(lblNewLabel_ProjectsAdd);
		
		JPanel panel = new JPanel();
		panel.setBounds(37, 11, 33, 10);
		panelProjects.add(panel);
		
		JPanel panel_EmptyList_1 = new JPanel();
		panel_EmptyList_1.setLayout(null);
		panel_EmptyList_1.setBackground(Color.WHITE);
		panel.add(panel_EmptyList_1);
		
		JLabel lblNewLabel_EmptyListIcon_1 = new JLabel("");
		lblNewLabel_EmptyListIcon_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_EmptyListIcon_1.setBounds(271, 137, 86, 82);
		panel_EmptyList_1.add(lblNewLabel_EmptyListIcon_1);
		
		JLabel lblNewLabel_EmptyListTitle_1 = new JLabel("Nenhuma tarefa por aqui :D");
		lblNewLabel_EmptyListTitle_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_EmptyListTitle_1.setForeground(new Color(46, 139, 87));
		lblNewLabel_EmptyListTitle_1.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblNewLabel_EmptyListTitle_1.setBounds(224, 230, 189, 14);
		panel_EmptyList_1.add(lblNewLabel_EmptyListTitle_1);
		
		JLabel lblNewLabel_EmptyListSubTitle_1 = new JLabel("Clique no bot\u00E3o '+' para adicionar uma tarefa");
		lblNewLabel_EmptyListSubTitle_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_EmptyListSubTitle_1.setForeground(new Color(169, 169, 169));
		lblNewLabel_EmptyListSubTitle_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblNewLabel_EmptyListSubTitle_1.setBounds(199, 255, 261, 14);
		panel_EmptyList_1.add(lblNewLabel_EmptyListSubTitle_1);
		
		JPanel panel_Tasks = new JPanel();
		panel_Tasks.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_Tasks.setBackground(new Color(255, 255, 255));
		panel_Tasks.setBounds(143, 108, 652, 54);
		frame.getContentPane().add(panel_Tasks);
		panel_Tasks.setLayout(null);
		
		JLabel lblNewLabel_TaksTitle = new JLabel("Tarefas");
		lblNewLabel_TaksTitle.setForeground(new Color(46, 139, 87));
		lblNewLabel_TaksTitle.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblNewLabel_TaksTitle.setBounds(30, 11, 116, 32);
		panel_Tasks.add(lblNewLabel_TaksTitle);
		
		JLabel lblNewLabel_TasksAdd = new JLabel("");
		lblNewLabel_TasksAdd.setIcon(new ImageIcon("C:\\Users\\Leticia\\eclipse-workspace\\TodoApp\\src\\main\\resources\\add.png"));
		lblNewLabel_TasksAdd.setBounds(592, 11, 46, 32);
		panel_Tasks.add(lblNewLabel_TasksAdd);
		
		JPanel panel_ProjectsList = new JPanel();
		panel_ProjectsList.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_ProjectsList.setBackground(new Color(255, 255, 255));
		panel_ProjectsList.setBounds(0, 162, 142, 318);
		frame.getContentPane().add(panel_ProjectsList);
		panel_ProjectsList.setLayout(null);
		
		JList list = new JList();
		list.setFixedCellHeight(35);
		list.setSelectionBackground(new Color(46, 139, 87));
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setFont(new Font("Segoe UI", Font.BOLD, 13));
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Item 1", "Item 2 ", "Item 3", "Item 4", "Item 5"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(10, 11, 104, 296);
		panel_ProjectsList.add(list);
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setBounds(143, 162, 630, 318);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		table = new JTable();
		table.setVisible(false);
		table.setRowSelectionAllowed(false);
		table.setDragEnabled(true);
		table.setDoubleBuffered(true);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setName("");
		table.setRowHeight(40);
		table.setToolTipText("");
		table.setBackground(new Color(255, 255, 255));
		table.setShowVerticalLines(false);
		table.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Nome", "Descri\u00E7\u00E3o", "Prazo", "Tarefa Conclu\u00EDda"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, Boolean.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, true, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.setBounds(10, 11, 610, 296);
		panel_4.add(table);
	}
}
