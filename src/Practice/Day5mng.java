package Practice;

import java.util.Arrays;

public class Day5mng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//simple arrays
		int [] a1 = new int [5];
		a1[0]= 10;
		a1[1] = 20;
		a1[2] = 30;
		a1[3] = 40;
		a1[4] =50;
	
		
		//System.out.println(a1);
		//System.out.println(Arrays.toString(a1));
		
		for(int i = 0; i< a1.length; i++) {
			//System.out.println(i);
			System.out.println(a1.length);
		}
		
		//oR
		int [] a2 = {10, 20, 30, 40, 50};
		
		System.out.println(a2);
		System.out.println(Arrays.toString(a2));
		
		for(int i = 0; i< a2.length; i++) {
//			System.out.println(a2);
//			System.out.println(Arrays.toString(a2));
//			System.out.println(a2[i]);
		}
		
		//multiple arrays
		
		int [] [] [] a3 = {{
			{10,20,30,40},
			{2, 4, 6, 8},
			{1, 2, 3, 4 }},
		{
		{5, 10, 15, 20},
		{100, 200, 300, 400},
		{1, 5, 10, 20}},
		{
		{ 1, 1, 1,  1},
		{2, 2, 2,  2},
		{3,  3,  3,  3}},
		};
		 for(int i = 0; i< a3.length; i++) {
			// System.out.println(a3[i]);
			 int a4 [] [] = a3[i];
			 for(int j =0; j< a4.length; j++) {
				 System.out.println(a4[j]);
				 int a5 [] = a4[j] ;
				 System.out.println(a5);
				 System.out.println((a5[j]));
				 for(int k =0; k< a5.length; k++) {
					  System.out.println(a5[k]);
				 }
			 }
			}
		 
		 for(int b1 [] [] : a3) {
			 for(int b2 [] : b1) {
				 for(int b3: b2) {
					 System.out.println(b3);
					
				 }
			 }
			 
		 }
		 
		 
		 int [] [] [] abc = {{
			 {1, 11, 111, 1111},
			 {2, 22,  222, 2222},
			 {3, 33, 333, 3333},
			 {4, 44, 444, 4444}},
				 
				 {
				 {5, 55, 555, 5555},
				 {6, 66, 666, 6666},
				 {7, 77, 777, 7777},
				 {8, 88, 888, 8888}},
				 {
				 {1, 12, 13, 14},
				 {5, 55, 56, 57},
				 {10, 20, 30, 40},
				 {6, 12, 18, 20}
				 }
		 };
		 
//		 for(int c1[][] : abc) {
//			 for(int c2[]: c1) {
//				 for(int c3: c2) {
//					 System.out.println(c3);
//				 }
//			 }
//		 }
		 
//		 for(int i = 0; i < abc.length; i++) {
//		    int c4 [] [] = abc[i];
//		    for(int m = 0; m < abc.length; m ++) {
//		    	int c5 [] = abc[m];
//		    	for(int n = 0; n< abc.length; n++) {
//		    		System.out.println(abc[n]);
//		    	}
//		    }
//		 }
		 
		 
		 
		 }
		
		}
	


