package collection;

import java.util.ArrayList;
import java.util.Iterator;

//Go one by one 
//print through loop

public class Iteratorjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> name1 = new ArrayList<String> ();
name1.add("Anjila");
name1.add("Sampada");
name1.add("Bhagwati");
name1.add("Sadiksha");
name1.add("Sneha");

//getting Iterator
Iterator<String> a1 = name1.iterator();
System.out.println(a1.next());
System.out.println(a1.next());
System.out.println(a1.next());



//looping through collection
while (a1.hasNext()) {
	System.out.println(a1.next());
}

	}

}
