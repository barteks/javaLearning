import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class passChecker {

	private JFrame frame;
	private JTextField login;
	private JTextField password;
	private JTextField checked;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					passChecker window = new passChecker();
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
	public passChecker() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		String [][] users = new String[][] {
			{"Administrator","Password1"},
			{"Vale.Vicky","applesaregreat"},
			{"Lane.Lois","supermaniscool"},
			{"Kent.Clark","iamnotfromthisplanet"},
			{"Wayne.Bruce","iheartgotham"},
			{"Parker.Peter","nycisgreat99"},
			{"Rogers.Steve","iamt000ldforthis"},
			{"Luther.Lex","lookatmenow99"},
			{"Osborn.Harry","whereareyou123"},
			{"Prince.Diana","superdifficultpass"},
			{"Linda Zoel","allroadsgosomewhere"},	
		};
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String log = login.getText();
				String pass = password.getText();
				for(int i=0;i<users.length;i++) {
					for (int j=0;j<2;j++) {		
					if (users[i][j] == log) {
					checked.setText("Your password is valid!");
					checked.setBackground(Color.green);
				}
				else {
					checked.setText("Your password is not valid");
					checked.setBackground(Color.red);
				}
						
			}
						}
			}	
		});
					
							
		btnNewButton.setBounds(383, 259, 141, 35);
		frame.getContentPane().add(btnNewButton);
		
		login = new JTextField();
		login.setBounds(67, 58, 186, 32);
		frame.getContentPane().add(login);
		login.setColumns(10);
		
		password = new JTextField();
		password.setBounds(67, 131, 186, 32);
		frame.getContentPane().add(password);
		password.setColumns(10);
		
		checked = new JTextField();
		checked.setBounds(67, 260, 186, 32);
		frame.getContentPane().add(checked);
		checked.setColumns(10);
	}
}
