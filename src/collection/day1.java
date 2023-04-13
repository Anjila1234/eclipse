package collection;

import java.util.ArrayList;

//import java.util.ArrayList;

//import java.util.ArrayList;

public class day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Array is fixed length
		// Arraylist you can modify the size

		ArrayList<String> Bus = new ArrayList<String>();
		// add
		Bus.add("Ramechap");
		Bus.add("sindhuli");
		Bus.add("Bardibas");
		System.out.println(Bus);

		// retrive
		System.out.println(Bus.get(0));
		System.out.println(Bus.get(1));
		System.out.println(Bus.get(2));

		// update
		Bus.set(1, "biratnagar");
		System.out.println(Bus.get(1));

		// delete
		Bus.remove(0);
		System.out.println(Bus);

		// remove
//		Bus.clear();
//	System.out.println(Bus);
		for (int i = 0; i < Bus.size(); i++) {
			System.out.println(Bus.get(i));
			System.out.println(i);
		}
		for (String Bus1 : Bus) {
			System.out.println(Bus1);
		}
	}

}
