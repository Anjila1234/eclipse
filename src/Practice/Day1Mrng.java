package Practice;

public class Day1Mrng {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a % b);
		System.out.println(a / b);
		
		cal(10, 12);
		cal(10, 10);
		
		// without parameter and  without returntype
		cal1();
		add1();
		
		// with parameter and without returntype
		cal2(100, 200);
		sub1(50, 25);
		
		// with parameter and with return type
		int a3 = cal3(10, 12);
		System.out.println(a3);
		System.out.println(a3 + 5);
		System.out.println(a3 - 10);
	
	
	}
	
	

	

	//calling the method
	public static void cal(int a, int b) {
	System.out.println(a + b);
	System.out.println(a - b);
	System.out.println(a * b);
	System.out.println(a % b);
	System.out.println(a / b);
	
}

// without parameter and without return type
public static void cal1() {
	System.out.println(12 + 12);
	}
	public static void add1() {
		System.out.println(15 + 15);
	}
	
	// with parameter and without returntype
	public static void cal2(int x, int y) {
		System.out.println(x + y);
	}
	public static void sub1(int a, int b) {
		System.out.println(a - b);
	}
	
	// with parameter and with returntype
	public static int cal3(int x, int y) {
		System.out.println(x + y);
		return x + y;
	}
}

