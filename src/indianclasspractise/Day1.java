package indianclasspractise;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		int y = 2;

		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);

		cal();
		cal1(10, 20);
		cal2(10, 30);
		int a1 = cal2(10, 30);
		System.out.println(a1);
		System.out.println(a1 + 2);

	}

//without parameter and without return type
	public static void cal() {
		System.out.println(10 + 10);
	}

// with parameter and without return type
	public static void cal1(int x, int y) {
		System.out.println(x + y);
	}

//without parameter and without returntype
	public static int cal2(int x, int y) {
		return (x + y);
	}
}