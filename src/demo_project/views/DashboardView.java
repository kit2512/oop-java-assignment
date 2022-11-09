package demo_project.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.GridLayout;
import javax.swing.JSeparator;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;

public class DashboardView extends JFrame {

	private JPanel contentPane;
	private JTextField birthPlaceTextField;
	private JTextField studentIDTextField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DashboardView frame = new DashboardView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DashboardView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 821, 634);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Open");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Close");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Exit");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_1 = new JMenu("About");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("About me");
		mnNewMenu_1.add(mntmNewMenuItem_3);
		contentPane = new JPanel();

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Student Filter", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(6, 6, 809, 74);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Birth place");
		panel.add(lblNewLabel);
		
		birthPlaceTextField = new JTextField();
		panel.add(birthPlaceTextField);
		birthPlaceTextField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Student ID");
		panel.add(lblNewLabel_1);
		
		studentIDTextField = new JTextField();
		panel.add(studentIDTextField);
		studentIDTextField.setColumns(10);
		
		JButton filterTextField = new JButton("Filter");
		panel.add(filterTextField);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "List Student", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(6, 92, 809, 283);
		contentPane.add(panel_1);
		
		table = new JTable();
		panel_1.add(table);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Student Information", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(6, 387, 809, 191);
		contentPane.add(panel_2);
		this.setVisible(true);
	}
}
