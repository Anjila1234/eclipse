package Exceptiontrycatch;

public class Day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	int a = 10;
	int b = 0;
	
	try {
		System.out.println(2);	
	System.out.println(10/0);
	
	
	}
	catch (ArithmeticException e) {
		System.out.println("Hello");
		e.getStackTrace();
		//System.out.println(e.getStackTrace());
		String a1 = e.toString();
		System.out.println(a1);
	}
		finally {
			System.out.println("Hy");
		}
		
		
		
		
	}

}
