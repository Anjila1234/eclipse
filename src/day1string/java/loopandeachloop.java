package day1string.java;

import java.util.Arrays;

public class loopandeachloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// For each loop
		int num2[] = { 1, 2, 3, 4 };
		for (int s1 : num2) {
			System.out.println(s1);

			int num3[] = { 5, 6, 7, 8 };
			for (int s2 : num3) {
				System.out.println(s2);
			
				int num10[] = { 10, 11, 12, 14};
				for (int s3:num10) {
					System.out.println(s3);
				}}
				

				// for loop

				int num4 [][] = { { 22, 44, 55, 66 }, { 55, 66, 67, 89 }, { 55, 77, 88, 90 } };

				for (int i = 0; i < num4.length; i++) {
//					System.out.println(i);
					System.out.println(Arrays.toString(num4[i]));
					int row5 [] = num4[i];
					
					for(int m = 0; m < row5.length; m ++) {
						System.out.println(row5[m]);
					}
		
					}}
		
	
			

			int num5[][] = { { 3, 4, 5, 6 }, { 8, 12, 14 }, { 6, 7, 8, 9 } };

			for (int l = 0; l < num5.length; l++) {
				System.out.println(l);
				System.out.println(Arrays.toString(num5[l]));

				int row4[] = num5[l];
				for (int i = 0; i < row4.length; i++) {
					System.out.println(row4[i]);
				}}
		
			String food = "Ricepudding";
			String rev = "";
			
			for(int i = 0; i < food.length(); i++) {
				rev = rev + food.charAt(i);
				
			}
			System.out.println(rev);
		}}