package Thirdday;

public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		System.out.println("Hello world");

		addition();
		subtraction(5, 10);
		multiplication(10, 11);
		addition3(10, 11);
		add();
		subtract(10, 15);
		int a = multiplication(10, 11);
		System.out.println(a);
		System.out.println(a * 0.12);
		

	}

	// function withhout parameter and without return
	static void addition() {
		System.out.println(8 + 8);
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

}
