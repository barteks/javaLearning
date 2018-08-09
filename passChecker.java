import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class passChecker {

	private JFrame frame;

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
		
		JTextPane login = new JTextPane();
		login.setBounds(34, 75, 279, 40);
		frame.getContentPane().add(login);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(383, 259, 141, 35);
		frame.getContentPane().add(btnNewButton);
		
		JTextPane password = new JTextPane();
		password.setBounds(34, 160, 279, 40);
		frame.getContentPane().add(password);
	}
}
