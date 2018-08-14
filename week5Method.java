import java.util.ArrayList;
import java.util.Scanner;

public class week5Method {
		
public static ArrayList<String> allGrades=new ArrayList<String>();
public static Scanner s = new Scanner (System.in);  

	public static void main(String[] args) {
		boolean flag = true;
	    int counterA =0,counterB =0,counterC =0,counterD=0,counterF=0;
	    double classAve = 0.0;
	    ArrayList<String> allStudents=new ArrayList<String>();
	    ArrayList<Double> allAverage=new ArrayList<Double>();
	    
	    
	 while(flag) {
	      flag = false;
	      //invoke method to get get user name
	      String name = getUserName();
	      //invoke method to get user scores
		  int[] grades = getUsersGrades();
		  //invoke method to calculate average student score
	      double aveScore = getAverageScore(grades[0],grades[1],grades[2]);
		  	
	      //add Student Name to Array List from the method
	      allStudents.add(name);
	     // add Student letter grade to Array List
	     //allGrades.add(getLtrGrade(aveScore));
	     // add Student average score to array list
	     allAverage.add(aveScore);
	     // calculate combined class score
	     classAve = displayClassReport(aveScore) + classAve;
	     
	     getLtrList(getLtrGrade(aveScore));
	     
	     
	     
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
		   };
	     
	System.out.println("Do you have another student's results; enter a Y for yes and a N for no ");
	       String ans = s.next();
	       if (ans.equals("Y")  || ans.equals("y") ) {
	    	   flag = true;
	       }
	       
	       if (flag == false) {	    	   
 
	    //calculate class average using method and class size
	       double classAverage = classAve/allStudents.size();
	       System.out.println("\nResults:");
	       System.out.println ("\n"+"This class has " + allStudents.size() + " student(s) and the average score is:  " + classAverage + " %");
	       System.out.println("\n"+"List of students with grades");
	       for (int j=0; j< allStudents.size(); j++) 
	    	    {
	    	   System.out.println(allStudents.get(j) + " - " + allGrades.get(j) + " - " + allAverage.get(j) + "%");
	    	         };
	    	         
	    	   System.out.println("\nGrading table:");
	    	   System.out.println("A,A- students: " + counterA);
	    	   System.out.println("B+,B,B- students: " + counterB);
	    	   System.out.println("C+,C,C- students: " + counterC);
	    	   System.out.println("D+,D,D- students: " + counterD);
	    	   System.out.println("F students: " + counterF);
	    	   System.out.println("\nGrade List:");
	    	   System.out.println(allGrades);
	    	   
	    	   
s.close();
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
    System.out.println("Enter students name: ");      
    String name= s.next();
    return name;
}

public static int[] getUsersGrades () {
	int[] score = new int[3];
    System.out.println("Enter score for first subject (0-100): ");     
    score[0]=s.nextInt();
    System.out.println("Enter s score for second subject (0-100): "); 
    score[1]=s.nextInt();  
    System.out.println("Enter score for third subject (0-100): "); 
    score[2]=s.nextInt();
	return score;
}

public static double getAverageScore(int score1, int score2, int score3) {
double studentAverage = (score1+score2+score3)/3.0;
return studentAverage;
}

public static double displayClassReport(double averageScore) {
double average = averageScore;
return average;
}

public static ArrayList<String> getLtrList(String grades) {
allGrades.add(grades);
return allGrades;
}



}


