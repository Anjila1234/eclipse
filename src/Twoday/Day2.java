package Twoday;;


public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Define and variable and assign a value

		int a = 10;
		System.out.println(a);

		int r = 5;
		int m = 7;

		int n = r + m;
		System.out.println(n);
		System.out.println(r + m);
		System.out.println(n + n);

		Calculator(10, 11);
		Calculator(120, 110);
		
		int b = 9;
		int c =10;
		System.out.println(b+c);
		System.out.println(b-c);
		
		addition();
		subtraction();
		
		int d = 10;
		int e = 12;
		
	

		addition3(d, e);
		
		
	}
	
	static void addition3(int d, int e) {
		System.out.println(d + e);
		System.out.println(d - e);
	}

	static void Calculator(int x, int y) {

		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);
	}
		
		static void addition() {
			System.out.println(8+8);
		}
		
	
		static void subtraction() {
			System.out.println(8-8);
		}
	
static void multiplication(int b, int c) {
	 System.out.println(b*c);
	
	

}
}





	
	
	

	
	




