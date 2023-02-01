package Dayeight;

public class Day8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i < 4; i++) {
			System.out.println("Hello");
		}

		for (int i = 5; i <= 9; i++) {
			System.out.println("Bye");
		}
		// print 1 to 5
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		// print reverse 5 to 1
		for (int i = 5; i >= 1; i--) {
			System.out.println(i);
		}

		// Table of 7
		for (int i = 7; i <= 70; i = i + 7) {
			System.out.println(i);
		}
		// Table of 7 in reverse
		for (int i = 70; i >= 7; i = i - 7) {
			System.out.println(i);
		}
		// break
		for (int i = 5; i >= 1; i--) {
			System.out.println(i);
			if (i == 2)
		
			{
				break;
			}
		}
		// Continue
		for (int i = 5; i <= 10; i++) {
			if (i == 7) {
				continue;
			}
			System.out.println(i);

		}

		int i2 = 2;
		while (i2 <= 5) {
			System.out.println(i2);
			i2++;
		}

		int i7 = 2;
		while (i7 <= 5) {
			if (i7 == 3) {
				i7++;
				continue;
			}
		}

		// while
		int i = 1;
		while (i <= 5) {
			System.out.println(i);
			i++;
		}
		int i6 = 5;
		while (i6 >= 1) {
			System.out.println(i6);
			if (i6 == 2) {
				break;
			}
			i--;
		}

		for(int j=10; j>=1; j--) {
			System.out.println(j);
		}
		
	
		for(int m = 10; m<=100; m= m+10) {
			System.out.println(m);
		}
		}
		
	}