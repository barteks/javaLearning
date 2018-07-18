import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class FirstGUI {

	private JFrame frmSecurePasswordCheck;
	private JTextField pass1;
	private JTextField checked1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstGUI window = new FirstGUI();
					window.frmSecurePasswordCheck.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FirstGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSecurePasswordCheck = new JFrame();
		frmSecurePasswordCheck.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 25));
		frmSecurePasswordCheck.setTitle("Secure Password Check");
		frmSecurePasswordCheck.setBounds(100, 100, 708, 413);
		frmSecurePasswordCheck.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSecurePasswordCheck.getContentPane().setLayout(null);
		
		pass1 = new JTextField();
		pass1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		pass1.setBounds(250, 42, 300, 40);
		frmSecurePasswordCheck.getContentPane().add(pass1);
		pass1.setColumns(10);
		
		JButton btnNewButton = new JButton("Press to submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int caps = 0;
				int low = 0;
				int digit = 0;
				String str = pass1.getText();
				for (int i= 0; i< str.length(); i++) {
					if (Character.isUpperCase(str.charAt(i)))
						caps++;
				}
				for (int j=0; j< str.length(); j++) {
					if (Character.isLowerCase(str.charAt(j)))
						low++;
				}
				for (int test=0; test< str.length(); test++) {
					if (Character.isDigit(str.charAt(test)))
						digit++;
			}
						
			if (str.length() >= 8 && caps >= 2 && low >=2 && digit >=2) {
				checked1.setText("Your password is secure!");
				checked1.setBackground(Color.green);
			}
			else {
				checked1.setText("Your password is not secure");
				checked1.setBackground(Color.red);
			}
				
	
			}
		});
		btnNewButton.setBounds(250, 103, 300, 79);
		frmSecurePasswordCheck.getContentPane().add(btnNewButton);
		
		checked1 = new JTextField();
		checked1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		checked1.setBounds(250, 203, 300, 40);
		frmSecurePasswordCheck.getContentPane().add(checked1);
		checked1.setColumns(10);
		
		JLabel lblEnterPassword = new JLabel("Enter Password");
		lblEnterPassword.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblEnterPassword.setBounds(72, 49, 168, 26);
		frmSecurePasswordCheck.getContentPane().add(lblEnterPassword);
		
		JLabel lblPasswordValidator = new JLabel("Password Validaton");
		lblPasswordValidator.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblPasswordValidator.setBounds(21, 210, 208, 26);
		frmSecurePasswordCheck.getContentPane().add(lblPasswordValidator);
	}
}
