import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class gradesAdv {
	
public static void main(String[] args) {
	String grade =" ";
	boolean flag = true;
    double sumAverage = 0;
    ArrayList<String> allStudents=new ArrayList<String>();
    ArrayList<String> allGrades=new ArrayList<String>();
    ArrayList<Double> allAverage=new ArrayList<Double>();
 while(flag) {
      flag = false;
      Scanner s = new Scanner (System.in);    
      System.out.println("Enter students name: ");      
      String name= s.next();
      System.out.println("Enter " + name + "'s score for first subject: ");     
      int score1=s.nextInt();
      System.out.println("Enter " + name + "'s score for second subject: "); 
      int score2=s.nextInt();  
      System.out.println("Enter " + name + "'s score for third subject: "); 
      int score3=s.nextInt();
      double average = (score1+score2+score3)/3.0;
      sumAverage = sumAverage + average;
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
      else if (average < 60) {
      grade = "F";
       }     
     allStudents.add(name);
     allGrades.add(grade);
     allAverage.add(average);
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

       
       int occA = Collections.frequency(allGrades, "A");  
       int occAM = Collections.frequency(allGrades, "A-");
       int occBP = Collections.frequency(allGrades, "B+");  
       int occB = Collections.frequency(allGrades, "B");
       int occBM = Collections.frequency(allGrades, "B-");
       int occCP = Collections.frequency(allGrades, "C+");  
       int occC = Collections.frequency(allGrades, "C");
       int occCM = Collections.frequency(allGrades, "C-");
       int occDP = Collections.frequency(allGrades, "D+");  
       int occD = Collections.frequency(allGrades, "D");
       int occDM = Collections.frequency(allGrades, "D-");
       int occF = Collections.frequency(allGrades, "F"); 
       
       System.out.println("A,A- users: " + (occA+occAM));
       System.out.println("C+,C,C- users: " + (occBP+occB+occBM));
       System.out.println("C+,C,C- users: " + (occCP+occC+occCM));
       System.out.println("D+,D,D- users: " + (occDP+occD+occDM));
       System.out.println("F users: " + occF);
    	         

            };
   }
 
}
}