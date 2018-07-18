import java.util.Scanner;
public class arrays_password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] names = new String[3];
		String [] password = new String[3];
		for (int i=0; i< names.length; i++) {
			System.out.println("enter name");
			Scanner input = new Scanner(System.in);
			names[i] = input.nextLine();
			System.out.println("Enter Password");
			Scanner input2 = new Scanner(System.in);
			password[i] = input2.nextLine();
		}
		
		

		for (int j=0; j< names.length ;j++) {
			System.out.println (names[j] + " " + password[j]);
		}
	}

	}
