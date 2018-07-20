public class multiarraysorted {


	public static void main(String[] args) {
		String [][] users = new String[][] {
				{"Administrator","Password1"},
				{"Vale.Vicky","applesaregreat"},
				{"Lane.Lois","supermaniscool"},
				{"Kent.Clark","iamnotfromthisplanet"},
				{"Wayne.Bruce","iheargotham"},
				{"Parker.Peter","nycisgreat99"},
				{"Rogers.Steve","iamt000ldforthis"},
				{"Luther.Lex","lookatmenow99"},
				{"Osborn.Harry","whereareyou123"},
				{"Prince.Diana","superdifficultpass"},
				{"Linda Zoel","allroadsgosomewhere"},			
				
		};	
System.out.println("Total Number of users is: " + users.length);
System.out.println("User Name" +"\t"+"Password");

for (int i=0; i<users.length;i++) {
	for(int j=0;j<2;j++)
	{
		System.out.print(users[i][j] +"\t");
	}
		System.out.print("\n");
}

for(int i=0;i<users.length;i++) {
	for (int j=0;j<2;j++) {
	if (users[i][j] == "Rogers.Steve") {
		System.out.println("\n" + "Steve Rogers is a valid user and has been found in the Array\n"
				+ "and here are his details:\n" +
				"Username " + users[6][0] + " \n" + "Password " + users[6][1] ) ;
		
		}
	}	
	}		
	}
	
}
	

