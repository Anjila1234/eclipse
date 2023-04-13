package collection;

import java.util.HashMap;

public class asignments1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> Names = new HashMap<Integer, String>();

		// add
		Names.put(1, "Anjila");
		Names.put(2, "Bhagwati");
		Names.put(3, "Sampada");
		Names.put(4, "chunu");
		System.out.println(Names);

//retrive

		String a = Names.get(1);
		System.out.println(a);

		System.out.println(Names.get(2));

//update
		Names.put(1, "sadiksha");

		System.out.println(Names);

		Names.put(2, "sneha");
		System.out.println(Names);

//delete

//Names.remove(1, "sadiksha");
//System.out.println(Names);
//
//Names.remove(2);
//System.out.println(Names);

		System.out.println(Names.values());
		System.out.println(Names.keySet());

		for (int v : Names.keySet()) {
			System.out.println(v + Names.get(v));
		}

		for (String va : Names.values()) {
			System.out.println(va);

		}

		for (int i = 0; i < Names.size(); i++) {
			System.out.println(Names.values());
			System.out.println(Names.keySet());
			System.out.println(Names);
		}

	}

}
