import java.awt.Color;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.util.*;
import javax.swing.JLabel;

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
		String [] users = new String[] {"administrator","Vale.Vicky","Lane.Lois","Kent.Clark","Wayne.Bruce","Parker.Peter","Rogers.Steve","Luther.Lex","Osborn.Harry","Prince.Diana","Linda Zoel"};
		String [] passwords = new String[]{"password1","applesaregreat","supermaniscool","iamnotfromthisplanet","iheargotham","nycisgreat99","iamt000ldforthis","lookatmenow99","whereareyou123","superdifficultpass","allroadsgosomewhere"};

		frame = new JFrame();
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Password Check");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = login.getText();
				String pass = password.getText();
				for (int i = 0; i < users.length; i++)
			    {
			        if( name.equals(users[i]) && pass.equals(passwords[i])) {
					checked.setText("Your password is valid!");
					checked.setBackground(Color.green);
					break;
				}
				else {
					checked.setText("Your password is not valid");
					checked.setBackground(Color.red);
				}
						
			}
						
				
			}
		});
					
							
		btnNewButton.setBounds(284, 259, 240, 35);
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
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(284, 61, 135, 26);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(284, 134, 92, 26);
		frame.getContentPane().add(lblPassword);
	}
}
