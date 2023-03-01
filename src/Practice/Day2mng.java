package Practice;

public class Day2mng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String a1 = "I am Anjila Katuwal";
 System.out.println(a1);
 
 String a2 = ("I am learning Java");
 System.out.println(a2);
 
 System.out.println(2 + 2);
 System.out.println("Hy" + 2);
 System.out.println("Hello" + "world");
 System.out.println(2 + "Hy");
 
 String a3 = "Aarati";
 System.out.println(a3.length()); //6
 
 String a4 = "saroj";
 int a5 = a4.length();
 System.out.println(a4); //saroj
 
 String firstname = "Nabaraj";
 String lastname = "Pokhrel";
 System.out.println(firstname.concat(lastname));//Nabarajpokhrel
 System.out.println(firstname + lastname);//Nabarajpokhrel
 
 
 String a6 = "Kathmandu";
 System.out.println(a5);
 System.out.println(a6.toLowerCase()); //kathmandu
 System.out.println(a6.toUpperCase()); //KATHMANDU
 System.out.println(a6.charAt(2)); //t
 System.out.println(a6.toUpperCase().toLowerCase()); //kathmandu
 System.out.println(a6.toLowerCase().toUpperCase()); // KATHMANDU
 System.out.println(a6.toLowerCase().toUpperCase().length()); //9
 
 
 String city1 = "Sindhuli";
 String city2 = "Sindhuli";
 String city3 = "Biratnamgar";
 
 System.out.println(city1.equals(city3));
 System.out.println(city1.equals(city2));
 
 if(city1 == city2) {
	 System.out.println("True");
	 
 }
 if (city2 == city3) {
	 System.out.println("False");
	 
 }
 
 if(city3 == city1) {
	 System.out.println("false");
	 
 }
 String city4 = "Kathmandu";
 String city5 = "Lalitpur";
 String city6 = "Kathmandu";
 
 if(city4 == city5) {
	 System.out.println("same city");
 }
 else {
	 System.out.println("diff city");
 }
 if (city4 == city6) {
	 System.out.println("same city");
 }
 else {
	 System.out.println("diff city");
 }
  //ternary
 String q1 = (city1.equals(city3))?"equal": "notequal";{
	 System.out.println(q1);
 }
 
 String q2 = (city2.equals(city1))?"equal": "not equal";{
	 System.out.println(q2);
 }
 
 String q3 = (city4.equals(city5))?"same city" : "different city";{
	 System.out.println(q3);
	 
 }
 String q4 = (city5.equals(city4))? "same city" : "d city";{
	 System.out.println(q4);
 }
 //boolen
 String q5 = "Anjila";
 boolean q6 = q5.startsWith("a");
 System.out.println(q6); //false
 System.out.println(q5.startsWith("AN")); //false
 System.out.println(q5.startsWith("An")); // true
 
 boolean q7 = q5.endsWith("a");
 System.out.println(q7);
 System.out.println(q5.endsWith("la"));
 System.out.println(q5.endsWith("Ka"));
 
 String q8 = "I am in class";
 boolean q9 = q8.contains("in");
 System.out.println(q9); //true
 System.out.println(q8.contains("cls")); //false
	}

}
