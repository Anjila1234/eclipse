package Exceptiontrycatch;

public class day5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 0;

		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("hello");
			System.out.println(e.getMessage());
			e.getStackTrace();

		} finally {
			System.out.println("Hello world");
		}
	}

}
