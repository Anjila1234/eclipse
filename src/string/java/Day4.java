package string.java;



public class Day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "QA is fantastic";
		String a1 = str1.substring(0,10);// End value is not included
		System.out.println(a1);
		
		String str2 = "QA is fantastic";
		String b1 = str2.substring(0);
		System.out.println(b1);
		
		String s3 = "Anchala";
		String c1 = s3.substring(2);//end index is optional
		System.out.println(c1);
		
		String str4 = "Rauthat";
		String d1 = str4.substring(0, 5);
		System.out.println(d1);

//		// Join
		String str5 = "Hello";
		String str6 = "I am in Oklahoma";
		String str7 = "city";
		String a = String.join(" ",str5,str6, str7);
		System.out.println(a);
		
		String s1 = "Hy";
		String p2 = "Anjila";
		String a3 = "katuwal";
		String a2 = String.join(" ",s1, p2, a3);
		System.out.println(a2);
		
		
		String str8 = "anzelakatuwal";
		String str9 = "gmail.com";
		String b = String.join("@", str8,str9);
		System.out.println(b);
		
		String str10 = "Nabaraj";
		String str11 = "Anjila";
		String str12 = String.join("-" ,str11, str10);
		System.out.println(str12);
		
	String city1 = "Basantapur";
	int z1 = city1.indexOf('a');
	System.out.println(z1);
	
	String city2 = "Basantapur"	;
	int x1 = city2.indexOf("r");
	System.out.println(x1);
		
	String city3 = "Arpana";
	int x2 = city3.indexOf("a", 4);
	System.out.println(x2);
	
    String city4 = "anjila Katuwal";
    for(int i = 1; i < city4.length(); i++) {
    	if(city4.charAt(i)=='a') {
    		System.out.println(i);
    		System.out.println(city4.charAt(i));
    	}
    }
    
   String city5 = " Learning QA is fun ";
   String city6 = city5.trim();
   System.out.println(city6.length());
   System.out.println(city5.length());
//   System.out.println(city6.charAt(5));
   
   String city9 = " Learning java is fun ";
	String city10 = city9.trim();
	System.out.println(city10.length());
	System.out.println(city9.length());

   
//   String s1 = city5.replace(" ", "");
//   System.out.println(s1);
//   
//   
   String s2 = "I am learning QA";
   String [] s4 = s2.split(" ");
   System.out.println(s4);
   //["I","am","learning","QA"]
   for(int i=0;i<s4.length;i++) {
	   System.out.println(s4[i]);
   }
   

   
   
//   String q12 = "I am learning css";
//	// ["I","am","learning","css"];
//	String[] q13 = q12.split(" ");
//	System.out.println(q13);
//    
//   for (String strs : q12) {
//	   System.out.println(strs);
//   }
//
//   String name = "I am studying java";
//   String name2 = "";
//   
//   boolean q1 = name.isEmpty();
//   System.out.println(q1);
//   
//   boolean q2 = name2.isEmpty();
//   System.out.println(q2);


	}

}
