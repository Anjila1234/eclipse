package revision2;

public class day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String city1 = "sindhuli";
String city2 = "Biratnagar";
String city3 = "sindhuli";

boolean city4 = city1.equals(city3);
if(city4) {
	System.out.println("passed");
}
else {
	System.out.println("failed");
}

if(city2.equals(city3)) {
	System.out.println("passed");
}
else {
	System.out.println("failed");
}
//Ternary operation
String a1 = city1.equals(city3)?"equals":"not equals";
System.out.println(a1);

String a2 = city1.equals(city2)?"equals":"not equal";
System.out.println(a2);

String a3 = "Java";
String a4 = a3.replace('a', 'n');
System.out.println(a4);

String a5 = "I am learning Java";
String a7 = "QA";
String a6 = a5.replace("Java", a7);
System.out.println(a6);

String a8 = "Nabaraj";
boolean a9 = a8.startsWith("N");

System.out.println(a9);

if(a8.endsWith("j")) {
	System.out.println("true");
	}
	else {
		System.out.println("false");
	}
	













		
	}

}
