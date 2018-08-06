import java.util.ArrayList;
import java.util.Scanner;
public class gradesAdv {
	
public static void main(String[] args) {
	String grade =" ";
	boolean flag = true;
    double sumAverage = 0;
    ArrayList<String> allStudents=new ArrayList<String>();
    ArrayList<String> allGrades=new ArrayList<String>();
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
System.out.println(name + "'s average grade is: "+grade);
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
    	   System.out.println(allStudents.get(j) + " " + allGrades.get(j));
    	         };
    	         System.out.println("\nGrading table");
       if (allGrades.contains("A") || allGrades.contains("A-")) {
    	   int gradeA = 0;
    	   gradeA++;
    	   System.out.println("'A' or 'A-'Student(s) - " +gradeA );
       }
       if (allGrades.contains("B+") || allGrades.contains("B") || allGrades.contains("B-")) {
    	   int gradeB = 0;
    	   gradeB++;
    	   System.out.println("'B+' or 'B' or 'B-' Student(s) - " +gradeB );
       } 
       if (allGrades.contains("C+") || allGrades.contains("C") || allGrades.contains("C-")) {
    	   int gradeC = 0;
    	   gradeC++;
    	   System.out.println("'C+' or 'C' or 'C-' Student(s) - " +gradeC );
       } 
       if (allGrades.contains("D+") || allGrades.contains("D") || allGrades.contains("D-")) {
    	   int gradeD = 0;
    	   gradeD++;
    	   System.out.println("'D+' or 'D' or 'D-' Student(s) - " +gradeD );
       } 
       if (allGrades.contains("F")) {
    	   int gradeF = 0;
    	   gradeF++;
    	   System.out.println("'F'' Student(s) - " +gradeF );
       } 
            };
   }
 
}
}