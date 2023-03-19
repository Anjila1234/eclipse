package Exceptiontrycatch;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 0;
		
		System.out.println("Hello");
		
	try  {
			System.out.println(a + b);
			System.out.println(10/0);
		}
		catch (ArithmeticException e) {
			System.out.println("I am Anjila");
			//e.printStackTrace();
		String a1 = e.toString();
			
		}
	finally {
		System.out.println("Bye");
	}
	}

}
