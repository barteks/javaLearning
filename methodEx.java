import java.util.Scanner;

public class methodEx {
public static char assignGrade (double number) {
	char grade;
	if ((number >= 90 ) &&(number <=100)) {
		grade = 'A';
	}
		else {
			grade = 'F';
		}
	return grade;
	}


public static double averageGrade (int number, int number2, int number3) {
	float ave = (number+number2+number3)/3;
	return ave;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double average;
		int counterA = 0;
		int counterF = 0;
		boolean ans = true;
		while (ans == true) {
Scanner s = new Scanner(System.in);
System.out.println("Enter your name");
String name = s.nextLine();
System.out.println("Enter 3 scores");
int score1 = s.nextInt();
int score2 = s.nextInt();
int score3 = s.nextInt();

System.out.println(name + " " + score1 + " " + score2 + " " + score3);
//double average = (score1 + score2 + score3)/3;
average = averageGrade(score1, score2, score3);
System.out.println(averageGrade(100,500,200));
System.out.println(assignGrade(average));
//if (assignGrade(average) == 'A' ) {counterA++;}
//if (assignGrade(average) == 'F' ) {counterF++;}
//System.out.println(counterA);

switch (assignGrade(average)) {
case 'A': 
	counterA++;
	break;
case 'f':
	counterF++;
	break;
}
System.out.println(counterA);
Scanner a = new Scanner(System.in);
System.out.println("continue, y or n?");
String anwser = a.next();
if ((anwser.charAt(0) == 'Y') || (anwser.charAt(0) == 'y')) {
	ans = true;
}
	else {
		ans = false;
}
		}
	}
	}

