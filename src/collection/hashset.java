package collection;

import java.util.ArrayList;
import java.util.HashSet;

public class hashset {
	public static void main(String[] args) {
		HashSet<String> students = new HashSet<String>();
		// add
		students.add("Anjila");
		students.add("Bhawana");
		students.add("Jenisha");
		students.add("nisha");
		students.add("Ritika");
		students.add("Alina");
		students.add("Alina");

		System.out.println(students);
		for (String G6 : students) {
			System.out.println(G6);

			for (int i = 0; i < students.size(); i++) {
				System.out.println(students);
			}
		}

		// retrive
		System.out.println(students.contains("Alina"));
		boolean a = students.contains("Ritika");
		System.out.println(a);

		// update
		students.add("Nabaraj");
		System.out.println(students);

		// delete
		students.remove("Alina");
		System.out.println(students);

		ArrayList<String> students2 = new ArrayList<String>();
		students2.add("Alina");
		students2.add("Anjila");

		for (int i = 0; i < students2.size(); i++) {
			if (students.contains(students2.get(i))) {
				System.out.println("available");
			} else {
				System.out.println("unavailable");
			}

		}
	}

}
