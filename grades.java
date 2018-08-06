import java.util.Scanner;

public class grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variables
		Scanner s = new Scanner(System.in);
		System.out.println("How Many Students are there? ");
		int numSt = s.nextInt();
		String grade = " ";
		for (int i=0; i < numSt; i++) {
		System.out.println("Enter a Name: ");
		String name = s.next();
		System.out.println("Enter Grade 1: ");
		int score1 = s.nextInt();
		System.out.println("Enter Grade 2: ");
		int score2 = s.nextInt();
		System.out.println("Enter Grade 3: ");
		int score3 = s.nextInt();
		char letterGrade;
		double average = (score1+ score2 + score3)/3 ;
		System.out.println(name);
		System.out.println(grade);
		
		if (average >= 90) {
		      grade = "A";
		       }
		      else if (average >= 80  && average < 70) {
		      grade = "B";
		       }
		      else if (average >= 70  && average < 80) {
		      grade = "C";
		       }
		      else if (average >= 60  && average < 70) {
		      grade = "D";
		       }
		      else if (average < 60) {
		      grade = "F";
		       }
		
		
		}
		
		
		}	
	}

