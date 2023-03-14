package polymorphism;

public class overridingwithoutconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//different class
		//same signature
		//same method
		//without constructor
	}

}
//
class Sam1 {
	String fullname = "Sampada Pant";
	int age = 27;

	public void getfullname(String fullname, int age) {
		System.out.println(fullname + age);
			
}}

class anz1 {
	String fullname = "Anjila Katuwal";
	int age = 26;
	
	public void getfullname(String fullname, int age) {
		System.out.println(fullname + age);
	}
}