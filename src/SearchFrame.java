import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import net.miginfocom.swing.MigLayout;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JList;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.FlowLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;


public class SearchFrame extends JPanel{

	String directoryList[] = {"Directory","Create New"};
	String[] colNames = {"Name","ID","DoB","Gender"};
	Object[][] patients = {
			{"Blank","111","080808","F"},
			{null,null,null,null,}};
	private JPanel contentPanel;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchFrame frame = new SearchFrame();
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
	public SearchFrame() {
		setLayout(new BorderLayout(0, 0));

		
		contentPanel = new JPanel();
		add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new MigLayout("", "[75][100][100][100][100][100][100][75]", "[50][100][100][100][100][300][50]"));
		//setContentPane(template.getContentPane());
		
		
		//
		JLabel lblNewLabel_3 = new JLabel("Patient ID:");
		contentPanel.add(lblNewLabel_3, "cell 0 0,alignx right,aligny center");
		
		textField = new JTextField();
		contentPanel.add(textField, "cell 1 0,alignx left,aligny center");
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Date of Birth:");
		contentPanel.add(lblNewLabel_1, "cell 2 0,alignx right,aligny center");
		
		textField_1 = new JTextField();
		contentPanel.add(textField_1, "cell 3 0,alignx left,aligny center");
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("First Name:");
		contentPanel.add(lblNewLabel_2, "cell 4 0,alignx right,aligny center");
		
		textField_2 = new JTextField();
		contentPanel.add(textField_2, "cell 5 0,alignx left,aligny center");
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Last Name:");
		contentPanel.add(lblNewLabel_4, "cell 6 0,alignx right,aligny center");
		
		textField_3 = new JTextField();
		contentPanel.add(textField_3, "cell 7 0,alignx left,aligny center");
		textField_3.setColumns(10);
		
		JPanel resultsPanel = new JPanel();
		contentPanel.add(resultsPanel, "cell 0 3 8 3,alignx center,aligny top");
		resultsPanel.setLayout(new BorderLayout(0, 0));
		
		
		table = new JTable(patients,colNames);
		resultsPanel.add(table);
		resultsPanel.add(new JScrollPane(table));
		
		JButton btnNewButton = new JButton("Search");
		contentPanel.add(btnNewButton, "cell 4 2,alignx left,aligny center");
		}

}