package day1string.java;

import java.util.Arrays;

public class Day7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a = new int [1][2];
		
		
		int [][] b1 = {
				{1,22,333},
				{4444,55555,666666,7777777},
				{88888888}		
		};
		System.out.println(b1[0]);
		System.out.println(b1[0][1]);
		System.out.println(b1[1][2]);
		
		int [][] a20 = {
				{ 5, 6, 7},
				{7, 8, 9 },
				{10, 11, 12, 13} };
		
		System.out.println(a20[1][1]);
		
	for(int i  = 0; i < a20.length; i++) {
//		System.out.println(i);
		System.out.println(a20[i].length);
	}
	//int []man = a20[i];
	//for(int k = 0; k < man.length; i++) {
//		System.out.println(k);
	//}

	int [][] numbers = {
			{-1,-2,-3},      // 0
			{-11,-22,-33},  // 1
			{-44,-55,-66}	// 2
	};

	for(int i = 0 ; i < numbers.length ; i++) {
		//System.out.println(i);
		//System.out.println(numbers[i]);
		//System.out.println(Arrays.toString(numbers[i]));
		int rows [] = numbers[i];
		for(int j = 0 ; j < rows.length ; j++) {
			System.out.println(rows[j]);
		}
	}


	int [][] num = {
			{ 5, 10 , 15},
			{15, 20, 30},
			{30,40,50}};


	for (int i = 0; i< num.length; i++) {
		System.out.println(i);
		System.out.println(num[i]);
		System.out.println(Arrays.toString(num[i]));
		
		int row1 [] = num[i];
		for(int m =0; m < row1.length; m++) {
			System.out.println(row1[m]);}
		


	int [][] num1 = {
			{1, 2, 3, 4},
			{2, 4,  6, 8},
			{9, 10}};

	System.out.println(num1[0][3]);
	System.out.println(num1[2][1]);

	for (int v = 0; v< num1.length; v++) {
//		System.out.println(v);
//		System.out.println(num1[v]);
		System.out.println(Arrays.toString(num1[v]));
		
		int row2 [] = num1[v];
		for(int u = 0; u < row2.length; u++ ) {
			System.out.println(row2[u]);
		}
	}
	}
	// For each loop
	int num2 []= {1,2,3,4};
	for (int s1:num2 ) {
		System.out.println(s1);
		
		int num3 [] = { 5, 6,7,8};
		for (int s2:num3) {
			System.out.println(s2);
			
			//for loop
			
			int num4 [][] = {
					{22, 44, 55, 66},
					{55, 66, 67, 89},
					{55, 77, 88, 90}
			};
			
			for(int i = 0; i< num4.length; i++) {
				System.out.println(i);
				System.out.println(Arrays.toString(num4[i]));
			}
		}
		
		int num5 [][]= {
				{3, 4, 5, 6},
				{8, 12, 14},
				{6, 7, 8, 9}};
		
		for (int l =0; l< num5.length; l++) {
		System.out.println(l);
		System.out.println(Arrays.toString(num5[l]));	
		
		int row4 []= num5[l];
		for(int i =0; i<row4.length; i++) {
			System.out.println(row4[i]);
		}
	}

	}
	}}
