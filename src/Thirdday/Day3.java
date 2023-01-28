package Thirdday;

public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");

		addition();
		subtraction(5, 10);
		multiplication(10, 11);

	}

	// function withhout parameter and without return
	static void addition() {
		System.out.println(8 + 8);
	}

	// function withhout parameter and without return
	static void subtraction(int x, int y) {
		System.out.println(x - y);
	}

	// function withhout parameter and without return
	static void multiplication(int x, int y) {
		System.out.println(x * y);

		System.out.println(2 > 5);
		System.out.println(5 < 5);
		System.out.println(6 == 6);
		System.out.println(7 <= 5);
		System.out.println(3 == 6);

		int a1 = 5;
		int b1 = 6;

		System.out.println(a1 == b1);
		System.out.println(true == true);
		System.out.println(false != true);
		System.out.println(2 == 2);
		System.out.println(5 != 5);
	}

}
