package polymorphism;

public class overloading1withoutconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
person1 m = new person1 ();
m.talk(5, 10, 12);
m.talk(5, 2);

anze a = new anze();
a.aa(01, 10);
a.an(15);
	}

}
//same class, same method, diff signature

class person1 {
	
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


class anze {
	public void an(int a) {
		System.out.println(a);
	}
	
	public void aa( int a , int b) {
		System.out.println(a + b);
	}
}







