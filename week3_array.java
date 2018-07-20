import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class week3_array {
//added comments

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] users = new String[] {"Administrator","Vale.Vicky","Lane.Lois","Kent.Clark","Wayne.Bruce","Parker.Peter","Rogers.Steve","Luther.Lex","Osborn.Harry","Prince.Diana","Linda Zoel"};
		String [] passwords = new String[]{"Password1","applesaregreat","supermaniscool","iamnotfromthisplanet","iheargotham","nycisgreat99","iamt000ldforthis","lookatmenow99","whereareyou123","superdifficultpass","allroadsgosomewhere"};
Arrays.sort(users);				
System.out.println("Total Number of users is - " + users.length +"\n");
System.out.println("User Name" );
//start of for loop to print out all the users
		for(int i=0; i<users.length; i++) {
			System.out.println(users[i] + "\t");
			}//end of for loop
		
	     System.out.println("\n");

	     //search for Steve in the array	     

for(int i=0;i<users.length;i++) {
	if (users[i] == "Rogers.Steve") {
		System.out.println("\n" + "Steve Rogers is a valid user and has been found in the Array\n"
				+ "and here are his details:\n" +
				"Username " + users[8] + " \n" + "Password " + passwords[6] ) ;
		
}


}
	     
}
}