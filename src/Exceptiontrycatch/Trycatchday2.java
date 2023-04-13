package Exceptiontrycatch;

public class Trycatchday2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 0;

		try {
			System.out.println("hello");
			System.out.println(10 / 0);

		} catch (ArithmeticException e) {
			System.out.println("right");
			e.getStackTrace();
			System.out.println(e.getStackTrace());
			String a1 = e.toString();
			System.out.println(a1);

		} finally {
			System.out.println("bye");
		}
	}

}
