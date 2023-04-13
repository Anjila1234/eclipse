package collection;

import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] args) {
		ArrayList<String> roommate = new ArrayList<String>();

		// add
		roommate.add("Arati");
		roommate.add("shivani");
		roommate.add("srijana");

		System.out.println(roommate);

		// retrive
		String a5 = roommate.get(0);
		System.out.println(a5);

		String a6 = roommate.get(1);
		System.out.println(a6);

		// update
		roommate.set(0, "Kajal");
		System.out.println(roommate);

		// delete
		roommate.remove(0);
		System.out.println(roommate);

		for (int i = 0; i < roommate.size(); i++) {
			System.out.println(roommate.get(i));
		}

		for (String a2 : roommate) {
			System.out.println(a2);
		}

	}
}
