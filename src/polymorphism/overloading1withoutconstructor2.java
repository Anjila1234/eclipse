package polymorphism;

public class overloading1withoutconstructor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
person2 m = new person2 ();
m.talk(5, 10, 12);
m.talk(5, 2);

anze1 a = new anze1();
a.aa(01, 10);
a.aa(15);
	}
	

}
//same class, same method, diff signature

class person2 {
	
	public void talk(int a, int b) {
		System.out.println(a + b);
	}
	public void talk(int l, int m, int n) {
		System.out.println(l + m + n);
	}
}



//same class
//same method
//different sign

//without constructor
class anze1 {
	public void aa(int a) {
		System.out.println(a);
	}
	
	public void aa( int a , int b) {
		System.out.println(a + b);
		
	}
	
		
	}
	








