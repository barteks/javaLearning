import java.util.Arrays;

public class week3_array_v2 {
//added comments

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] users = new String[] {"Administrator","Vale.Vicky","Lane.Lois","Kent.Clark","Wayne.Bruce","Parker.Peter","Rogers.Steve","Luther.Lex","Osborn.Harry","Prince.Diana","Linda Zoel"};
		String [] passwords = new String[]{"Password1","applesaregreat","supermaniscool","iamnotfromthisplanet","iheargotham","nycisgreat99","iamt000ldforthis","lookatmenow99","whereareyou123","superdifficultpass","allroadsgosomewhere"};
			
System.out.println("Total Number of users is - " + users.length +"\n");
System.out.println("User Name" );
//start of for loop to print out all the users

		int[] users2 = doInsertionSort(users);
		
		for(int i=0; i<users.length; i++) {
			{
			System.out.println(users[i] + "\t");
			}
			  
		}
		System.out.println("\n");
		
	     //search for Steve in the array	     

for(int i=0;i<users.length;i++) {
	if (users[i] == "Rogers.Steve") {
		System.out.println("Steve Rogers is a valid user and has been found in the Array,\n"
				+ "his position is in the array is " + i +" and here are his details:\n" +
				"Username " + users[i] + " \n" + "Password " + passwords[i-2] ) ;
		
}
}
	}
	 public static int[] doInsertionSort(int[] input){
         
	        int temp;
	        for (int i = 1; i < input.length; i++) {
	            for(int j = i ; j > 0 ; j--){
	                if(input[j] < input[j-1]){
	                    temp = input[j];
	                    input[j] = input[j-1];
	                    input[j-1] = temp;
	                }
	            }
	        }
	        return input;
	    }
}

	     
