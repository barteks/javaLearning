import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class multiarraysorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][] users = new String[][] {
				{"00","Administrator","Password1"},
				{"01","Vale.Vicky","applesaregreat"},
				{"02","Lane.Lois","supermaniscool"},
				{"03","Kent.Clark","iamnotfromthisplanet"},
				{"04","Wayne.Bruce","iheargotham"},
				{"05","Parker.Peter","nycisgreat"},
				{"06","Rogers.Steve","iamt000ldforthis"},
				{"07","Luther.Lex","lookatmenow99"},
				{"08","Osborn.Harry","whereareyou123"},
				{"09","Prince.Diana","superdifficultpass"},
				{"10","Linda Zoel","allroadsgosomewhere"},			
				
		};	
System.out.println("Total Number of users is: " + users.length);
System.out.println("ID"+"\t"+"User Name" +"\t"+"Password");

		Arrays.sort(users, new ColumnComparator(1));
		for(int i=0; i<users.length; i++) {
			String[] row = users[i];
			for(int j=0;j<row.length; j++) {
			System.out.print(row[j] + "\t");
		}
	     System.out.print("\n");
	    		}
		
	}
}
//using available class for sorting array by columns	
	class ColumnComparator implements Comparator {
		int columnToSort;
		ColumnComparator(int columnToSort) {
			this.columnToSort = columnToSort;
		}
		//overriding compare method
		public int compare(Object o1, Object o2) {
			String[] row1 = (String[]) o1;
			String[] row2 = (String[]) o2;
			//compare the columns to sort
			return row1[columnToSort].compareTo(row2[columnToSort]);
		}
	}       
	       

	
