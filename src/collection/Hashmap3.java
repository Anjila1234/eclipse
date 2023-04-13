package collection;

import java.util.HashMap;

public class Hashmap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap <String, Integer> namelist = new HashMap<String, Integer> ();

//add
namelist.put("Anjila", 1);
namelist.put("Sampada", 2);
namelist.put("Bhagwati", 3);

System.out.println(namelist);

//retrive
System.out.println(namelist.get("Anjila"));

//update
namelist.put("Sadiksha", 1);
System.out.println(namelist);

//delete
namelist.remove("Anjila");

for(int v: namelist.values()) {
	System.out.println(v);
	
	for(String v2 : namelist.keySet()) {
		System.out.println(v2 + " " + namelist.get(v2));
	}
}
	}

}
