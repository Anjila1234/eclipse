package collection;

import java.util.HashMap;

public class Hasmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> subject = new HashMap<String, String>();

		// add
		subject.put("science", "OHM");
		subject.put("social", "RAM");
		subject.put("Maths", "SANJAYA");

		System.out.println(subject);

//update
		subject.put("Maths", "Manohari");
		System.out.println(subject);

//retrive
		String a1 = subject.get("social");
		System.out.println(a1);

//delete
		System.out.println(subject.remove("Maths"));
		System.out.println(subject);

		for (int i = 0; i < subject.size(); i++) {
			System.out.println(subject.get(i));
		}

		for (String s : subject.keySet()) {
			System.out.println(s + " " + subject.get(s));
		}

	}

}
