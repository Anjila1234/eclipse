package Practice;

import java.util.Arrays;

public class loopandeachloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// For each loop in Array
//		int num2[] = { 1, 2, 3, 4 };
//		for (int s1 : num2) {
//			System.out.println(s1);
//
//			int num3[] = { 5, 6, 7, 8 };
//			for (int s2 : num3) {
//				System.out.println(s2);
//			
//				int num10[] = { 10, 11, 12, 14};
//				for (int s3:num10) {
//					System.out.println(s3);
//				}}
				

				// for loop 
// print 1 to 5
			
//	for(int i = 1; i <= 5; i++) {
//		System.out.println(i);
//	}
//	
//	//print 1 to 5 in reverse
//	
//	for(int i = 5; i >=1; i--) {
//		System.out.println(i);
//	}
//	
//	//print multiplication of 2
//	
//	for(int i =2; i<= 20; i= i+2) {
//		System.out.println(i);}
//		
//		//print reverse 
//		
//		for(int i = 20; i >= 2; i = i-2) {
//			System.out.println(i);
//		
//	}
//		//1 to 50 even no
//		for(int i = 1; i<= 50; i++) {
//			if(i%2 == 0)
//			System.out.println(i);
//		}
//			
//		
//		for (int i = 50; i>=1; i--) {
//			if(i%2 ==0)
//			System.out.println(i);
//		}
//		
		//break
		
		
			
	// for loop in Array
//	int num4 [][] = { { 22, 44, 55, 66 }, { 55, 66, 67, 89 }, { 55, 77, 88, 90 } };
//
//				for (int i = 0; i < num4.length; i++) {
////					System.out.println(i);
//					System.out.println(Arrays.toString(num4[i]));
//					int row5 [] = num4[i];
//					
//					for(int m = 0; m < row5.length; m ++) {
//						System.out.println(row5[m]);
//					}
//		
//					}}
//		
//	
//			
//
//			int num5[][] = { { 3, 4, 5, 6 }, { 8, 12, 14 }, { 6, 7, 8, 9 } };
//
//			for (int l = 0; l < num5.length; l++) {
//				System.out.println(l);
//				System.out.println(Arrays.toString(num5[l]));
//
//				int row4[] = num5[l];
//				for (int i = 0; i < row4.length; i++) {
//					System.out.println(row4[i]);
//				}}
//		
//			String food = "Ricepudding";
//			String rev = "";
//			
//			for(int i = 0; i < food.length(); i++) {
//				rev = rev + food.charAt(i);
//				
//			}
//			System.out.println(rev);
		
//	
//	
//	
//	
//	// for loop
//		
//		int [] a1 = new int [4];
//		
//		a1[0]=1;
//		a1[1]=2;
//		a1[2]=3;
//		a1[3]=4;
//		
//		
//		int b1[] = {1,2,3,4};
//		
//		
//		for(int i = 0; i< b1.length; i++) {
//			System.out.println(i);
////			System.out.println(b1[i]);
//			System.out.println(a1[i]);
//		}
//			
//		
////	for each loop
//	
//	for(int c1:b1) {
//		System.out.println(c1);
//	}
//	


//multiple array

int a2[][][] = {
		{
		{11, 12, 13,14},
		{10, 11, 12, 13},
		{20, 30,  40, 50}},
      
         {     
	     { 1, 2, 3, 4},
	     {5, 6, 7, 8},
	    {10, 11, 12, 14}},
	     {
		   {5, 10, 15,20},
		   {25,30,35,40},
		   {50,60,70,80}}
		};
    System.out.println(a2[0][0][0]);//11
    System.out.println(a2[0][1][2]);
    System.out.println(a2[1][0][2]);
    System.out.println(a2[1][1][1]);
    System.out.println(a2[1][2][3]);
    System.out.println(a2[2][1][1]);
    
    
    
    
    
    
    
    
//for(int i =0; i<a2.length; i++) {
//	System.out.println(a2);
//	//System.out.println(Arrays.toString(a2[i]));
////	String a3 = Arrays.toString(a2[i]);
////	System.out.println(a3);
//	int[][] a4 = a2[i];
//	for (int j =0; j<a4.length; j++) {
////		System.out.println(j);
//		System.out.println(Arrays.toString(a4[j]));
//		int [] a5 = a4[j];
//		for(int k = 0; k< a5.length; k++) {
//////			System.out.println(k);
////			System.out.println(a5[k]);
//		}
//	}
//	
//}
//
//for(int[][] abc : a2) {
//	System.out.println(abc);
//	for (int[]a6:abc) {
//	//	System.out.println(Arrays.toString(a6));
//		for(int a7:a6) {
//		//	System.out.println(a7);
//		}
//	}
//	
//}


String name = "chunu";
char []a10 = name.toCharArray();

for(int i =0; i< name.length(); i++) {
	// System.out.println(i);
	System.out.println(a10[i]);
}
	
}}
