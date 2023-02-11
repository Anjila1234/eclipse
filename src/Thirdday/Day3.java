package Thirdday;

public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		System.out.println("Hello world");
		System.out.println("Hy");

		addition();
		subtraction(5, 10);
		multiplication(10, 11);
		addition3(10, 11);
		add();
		subtract(10, 15);
		int a = multiplication(10, 11);
		System.out.println(a);
		System.out.println(a * 0.12);
		calB();
		calB();
		calB();
		subtraction(11, 12);
		subtraction(15, 10);
		
		addition3(11, 12);
		
		int a1 = addition3(11, 12);
		System.out.println(a1);
		System.out.println(a1 + 8);
		System.out.println(a1 + 1.5);
		
		addition4 (a1, 10);
		

	}

	// function withhout parameter and without return
	static void addition() {
		System.out.println(8 + 8);
	}
	
	static void calB() {
		System.out.println(9 + 9);
		System.out.println(9 - 9);
		System.out.println(9 / 9);
		System.out.println(10 % 9);
	}
	
	static void add() {
		System.out.println(9+9);
	}

	// function with parameter and without return
	static void subtraction(int x, int y) {
		System.out.println(x - y);
	}
	static void subtract(int e, int f) {
		System.out.println(e -f);
	}

	// function with parameter and with return
	static int multiplication(int x, int y) {
		System.out.println(x * y);
		return x * y;
	}

	static int addition3(int x, int y) {
		System.out.println(x + y);
		return x + y;
		
		
	}
	static void addition4(int x, int y) {
		System.out.println(x + y);
	}

}
