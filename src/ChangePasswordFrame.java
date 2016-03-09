import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;


public class ChangePasswordFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtOldPass;
	private JTextField txtNewPass;
	private JTextField txtConfirmPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChangePasswordFrame frame = new ChangePasswordFrame();
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
	public ChangePasswordFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel contentPanel = new JPanel();
		contentPane.add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new MigLayout("", "[100][100][100][100][100][100][100][100][100]", "[100][50][50][50][50][50][50][100][100]"));
		
		JLabel titleLbl = new JLabel("Change your Password");
		contentPanel.add(titleLbl, "cell 3 0 3 1,alignx center");
		
		JPanel passPanel = new JPanel();
		passPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPanel.add(passPanel, "cell 2 2 5 5,grow");
		passPanel.setLayout(new MigLayout("", "[100,grow][100][100][100]", "[25][25][25][25][25][25]"));
		
		JLabel lblOldPass = new JLabel("Please enter your old password:");
		passPanel.add(lblOldPass, "cell 0 0 2 1,alignx center");
		
		txtOldPass = new JTextField();
		passPanel.add(txtOldPass, "cell 0 1 2 1,growx");
		txtOldPass.setColumns(10);
		
		JLabel lblNewPass = new JLabel("Please enter your preferred new password:");
		passPanel.add(lblNewPass, "cell 0 2 2 1,alignx center");
		
		txtNewPass = new JTextField();
		passPanel.add(txtNewPass, "cell 0 3 2 1,growx");
		txtNewPass.setColumns(10);
		
		JLabel lblPassRules = new JLabel("<html>A password must be at least <br>8 characters and must<br>contain at least one number (0-9).</html>");
		lblPassRules.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		passPanel.add(lblPassRules, "cell 2 3 2 1,aligny top");
		
		JLabel lblConfirmPass = new JLabel("Confirm new Password:");
		passPanel.add(lblConfirmPass, "cell 0 4 2 1,alignx center");
		
		txtConfirmPass = new JTextField();
		passPanel.add(txtConfirmPass, "cell 0 5 2 1,growx");
		txtConfirmPass.setColumns(10);
		
		JButton btnCancel = new JButton("Cancel");
		contentPanel.add(btnCancel, "cell 3 7");
		
		JButton btnSave = new JButton("Save");
		contentPanel.add(btnSave, "cell 4 7");
	}

}