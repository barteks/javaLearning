
public class sortingAlg {

	
	static void stringSort(int[] sort) {		
		// TODO Auto-generated method stub
int temp = 0;
		for (int j=0; j < sort.length; j++) {
			for (int i=1; i < sort.length-1; i++) {
				if(sort[i-1] > sort[j]) {
					int temp = sort[i-1];
					sort[i-1] = sort[i];
					sort[j] = temp;
				}
					
				}
				
			}
		}
		
	public static void main(String[] args) {
	String [] users = new String[] {"Administrator","Vale.Vicky","Lane.Lois","Kent.Clark","Wayne.Bruce","Parker.Peter","Rogers.Steve","Luther.Lex","Osborn.Harry","Prince.Diana","Linda Zoel"};
	}
	
	stringSort(users);

	}
