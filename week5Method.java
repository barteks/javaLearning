import java.util.ArrayList;
import java.util.Scanner;

public class week5Method {
	
	public static void main(String[] args) {
	    Scanner s = new Scanner (System.in);  
		boolean flag = true;
	    int counterA = 0;
	    int counterB = 0;
	    int counterC = 0;
	    int counterD = 0;
	    int counterF = 0;
	    double sumAverage = 0;
	    ArrayList<String> allStudents=new ArrayList<String>();
	    ArrayList<String> allGrades=new ArrayList<String>();
	    ArrayList<Double> allAverage=new ArrayList<Double>();
	 while(flag) {
	      flag = false;

		  	String name = getUserName();
		  	int[] grades = getUsersGrades();	  	
		  	double aveScore = getAverageScore(grades[0],grades[1],grades[2]);

	      sumAverage = sumAverage + aveScore;
	     allStudents.add(name);
	     allGrades.add(getLtrGrade(aveScore));
	     allAverage.add(aveScore);
	     switch (getLtrGrade(aveScore)) {
		   case "A": 
		   	 	counterA++;
		   	break;
		   case "A-": 
			   	counterA++;
		   break;
		   case "B+": 
				counterB++;
			break;
		   case "B": 
			   	counterB++;
			   break;
		   case "B-": 
			    counterB++;
			   break;
		   case "C+": 
			   	counterC++;
			   break;
		   case "C": 
			   	counterC++;
			   break;
		   case "C-": 
			   	counterC++;  	
			   break;
		   case "D+": 
			   	counterD++;
			   break;
		   case "D": 
			   	counterD++;
			   	break;
		   case "D-": 
			    counterD++;  	
			    break;
		   case "F":
			   	counterF++;
			   	break;
		   }
	System.out.println("Do you have another student's results; enter a Y for yes and a N for no ");
	       String ans = s.next();
	       if (ans.equals("Y")  || ans.equals("y") ) {
	    	   flag = true;
	       };
	       
	       
	       if (flag == false) {
	    	   
 
	       double classAverage = sumAverage/allStudents.size();
	       System.out.println ("\n"+"This class has " + allStudents.size() + " student(s) and the average score is:  " + classAverage + " %");
	       System.out.println("\n"+"List of students with grades");
	       for (int j=0; j< allStudents.size(); j++) 
	    	    {
	    	   System.out.println(allStudents.get(j) + " - " + allGrades.get(j) + " - " + allAverage.get(j) + "%");
	    	         };
	    	         
	    	         System.out.println("\nGrading table");
   System.out.println("A,A- students: " + counterA);
	       System.out.println("B+,B,B- students: " + counterB);
	       System.out.println("C+,C,C- students: " + counterC);
	       System.out.println("D+,D,D- students: " + counterD);
	       System.out.println("F students: " + counterF);
	    	         

	            };
	   }
	 
	}
	


public static String getLtrGrade (double average) {
	String grade;
    if (average >= 93) {
    grade = "A";
     }
    else if (average >= 90  && average < 93) {
    grade = "A-";
     }
    else if (average >= 87  && average < 90) {
    grade = "B+";
     }
    else if (average >= 83  && average < 87) {
    grade = "B";
     }
    else if (average >= 80  && average < 83) {
     grade = "B-";
     }
    else if (average >= 77  && average <80 ) {
        grade = "C+";
     }
    else if (average >= 73  && average <77 ) {
        grade = "C";
     }
    else if (average >= 70  && average <73 ) {
        grade = "C-";
     }
    else if (average >= 67  && average < 70) {
    grade = "D+";
     }
    else if (average >= 63  && average < 67) {
        grade = "D";
         }
    else if (average >= 60  && average < 63) {
        grade = "D-";
         }
    else {
    grade = "F";
	}
    return grade;
}




public static String getUserName () {
	Scanner s = new Scanner (System.in);    
    System.out.println("Enter students name: ");      
    String name= s.next();
    return name;
}

public static int[] getUsersGrades () {
	int[] score = new int[3];
	Scanner s = new Scanner(System.in);
    System.out.println("Enter score for first subject (0-100): ");     
    score[0]=s.nextInt();
    System.out.println("Enter s score for second subject (0-100): "); 
    score[1]=s.nextInt();  
    System.out.println("Enter score for third subject (0-100): "); 
    score[2]=s.nextInt();
	return score;
}

public static double getAverageScore(int score1, int score2, int score3) {
double average = (score1+score2+score3)/3.0;
return average;
}




}


