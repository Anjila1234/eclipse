package collection;

import java.util.HashMap;

public class hashmap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String, Integer> name1 = new HashMap<String, Integer> ();

//add
name1.put("Anjila", 1);
name1.put("Nabaraj", 2);
name1.put("Dinjul", 3);
name1.put("uddap", 4);
name1.put("sadiksha", 5);

System.out.println(name1);

//retrive
boolean a5 = name1.containsKey("Anjila");
System.out.println(a5);

boolean a6 = name1.containsValue(6);
System.out.println(a6);
name1.get("uddap");
System.out.println(name1);

//update
name1.put("sandil", 6);
System.out.println(name1);

//delete
name1.remove("uddap");
System.out.println(name1);

for(String n : name1.keySet()) {
	System.out.println(n + " "+ name1.get(n));
}


	}

}
