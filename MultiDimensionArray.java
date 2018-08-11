import java.util.Arrays;

public class MultiDimensionArray {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [][] users = {
				{"Administrator","Password1"},
				{"Vale.Vicky","applesaregreat"},
				{"Lane.Lois","supermaniscool"},
				{"Kent.Clark","iamnotfromthisplanet"},
				{"Wayne.Bruce","iheargotham"},
				{"Parker.Peter","nycisgreat"},
				{"Rogers.Steve","iamt000ldforthis"},
				{"Luther.Lex","lookatmenow99"},
				{"Osborn.Harry","whereareyou123"},
				{"Prince.Diana","superdifficultpass"},
				{"Linda Zoel","allroadsgosomewhere"},			
				
		};	
       	System.out.println("User Name" +"\t"+"Password");
		for (int i = 0; i < users.length; ++i) {
	        for(int j = 0; j < users[i].length; j++) {
	        	
	           System.out.print(users[i][j]+"\t")
	           ;
	}
	        
	        System.out.println();
	     
		}
	          
	       
	}

	}
