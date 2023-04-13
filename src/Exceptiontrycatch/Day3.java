package Exceptiontrycatch;

public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = new int[4];
		a1[0] = 2;
		a1[1] = 4;
		a1[2] = 6;
		a1[3] = 8;

		try {
			for (int i = 0; i < a1.length + 1; i++) {
				System.out.println(a1[i]);

			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Namastae");
			e.printStackTrace();

		} finally {
			System.out.println("hello");
		}
 }
	}


