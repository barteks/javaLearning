import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class MyIterator {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<> ();
		cars.add("Tesla");
		cars.add("Mercedes");
		
		
//for loop
		System.out.println("For Loop");
		for (int i=0; i <cars.size(); i++) {
		System.out.println(cars.get(i));
	}
		
//Advanced for loop/ can't sort
System.out.println("\n" + "Advanced For Loop");
for (String car : cars) {
	System.out.println(car);
}

//while loop

System.out.println("\n"+"While Loop");
int i = 0;
while (i <cars.size()) {
	System.out.println(cars.get(i++));
}

//Iterator
System.out.println("\n"+"Iterator");
Iterator<String> iterator = cars.iterator();
while (iterator.hasNext()) {
	System.out.println(iterator.next());
}



//JAVA 8 Stream
System.out.println("\n"+"J8 Stream");
cars.forEach((car) -> {
	System.out.println(car);
});

	}

}
