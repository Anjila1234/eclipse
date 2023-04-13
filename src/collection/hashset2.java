package collection;

import java.util.ArrayList;
import java.util.HashSet;

public class hashset2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> lastname = new HashSet<String>();
//add
		lastname.add("Pokhrel");
		lastname.add("Katuwal");
		lastname.add("Pahadi");
		lastname.add("Kc");
		lastname.add("Kc");

// retrive 
		System.out.println(lastname.contains("Katuwal"));
		;

//update
		lastname.add("Karki");
		System.out.println(lastname);

//delete
		lastname.remove("Karki");
		System.out.println(lastname);

		for (String a1 : lastname) {
			System.out.println(a1);

		}
		ArrayList<String> lastname1 = new ArrayList<String>();
		lastname1.add("Karki");
		lastname1.add("Pahadi");

		for (int i = 0; i < lastname1.size(); i++) {
			if (lastname.contains(lastname1.get(i))) {
				System.out.println("available");
			} else {
				System.out.println("unavailable");
			}
		}

		for (String e : lastname1) {
			if (lastname.contains(lastname1)) {
				System.out.println(e);
			}
		}
	}

}
