package Exceptiontrycatch;

public class Day1trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am learning QA");

		try {
			System.out.println(5 + 1);
		} catch (ArithmeticException e) {
			System.out.println("this is wrong");// if we raise something then the catch will work
		} finally {
			System.out.println("this is right"); // whether pass or fail this will always run the code
		}

	}
}
//unhandled events
