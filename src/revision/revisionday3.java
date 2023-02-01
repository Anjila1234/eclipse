package revision;

public class revisionday3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("hello");
System.out.println("bye");

addition();
addition2(10,11);
addition3(110,113);
	}
//function without parameter and without return
	static void addition() {
		System.out.println(9+9);
		
	}
	//function with parameter and without return
	static void addition2( int x, int y) {
		System.out.println(x+y);
	}
	//function with parameter and with return
	static int addition3(int x, int y) {
		System.out.println(x+y);
		return x+y;
		
		
	}
}
