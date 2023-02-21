package Practice;

import java.util.Arrays;

public class multiplestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int abc [][][] = {
				{ 
					{11, 12, 13, 14},
					{14, 15, 16, 17},
					{10, 11, 12, 14}
				},
				{   {12, 13, 14, 10},
					{10, 11, 12, 13},
					{14, 15, 16, 17}
				
					},
				{   {10, 20, 30, 40},
				    {50, 60, 70, 80}
				}
		
			};
	

   for(int i =0; i < abc.length; i++) {
//	   System.out.println(i);
	   
	   int row[][] = abc[i];
	  for(int j =0; j< row.length; j++ ) {
	//	  System.out.println(row[j]);
	//  System.out.println(Arrays.toString(row[j]));
		
		  int column[] = row[j];
		  for(int k =0; k< column.length; k++) {
			  System.out.println(column[k]);
		  }	  
	}
   }
	 //for each loop  
for(int x1[][]:abc) {
	for(int x2[]:x1) {
		for(int x3:x2) {
			System.out.println();
		}
	}
}
	

int numbers1 [][]= {
		{10,20,30,40},
		{30, 40, 50,60},
		{90,100,110,120},
		{50, 60, 70, 80}
};

//	
//for(int i = 0; i<numbers1.length; i++) {
//	System.out.println(i);
//	System.out.println(numbers1[i]);
//	System.out.println(Arrays.toString(numbers1[i]));
//	 int row[]= numbers1[i];
//	for(int j = 0; j<row.length; j++ ) {
//		System.out.println(row[j]);
//	}
//}
//	
//for (int a12  []:numbers1 ){
//	for(int a13:a12) {
//		System.out.println(a13);
//		
//		
//		System.out.println(numbers1[0][1]);
//		System.out.println(numbers1[1][3]);
//	}
//	
//	
//}
//
//
int cities1 [][][] = {
		
			{{10,20,30,40},
			{50,60, 70,80},
			{90,60,90,80}},
			
			
			{{1 , 2, 3, 4},
			{5, 6, 7, 8},
			{8,9, 10,11}},
			
				{{1, 3, 5, 9},
				{5, 6, 7, 8},
				{9, 8, 7, 6}}
			

};
//
//System.out.println(cities1[0][1]);
//System.out.println(cities1[1][1]);
//System.out.println(cities1[0][0]);
//System.out.println(cities1[1][1]);

for(int country1 [][] : cities1) {
	for(int country2 []: country1) {
		for(int country3: country2) {
			System.out.println(country3);
		}
	}
	
};

//for(int i =0; i < cities1.length; i++) {
//	System.out.println(i);	
//	
//	 int m1 [][] = cities1[i];
//			for(int j =0; j < m1.length; j++) {
//				System.out.println(j);
//				System.out.println(Arrays.toString(m1[j]));	
//				
//				int m2 [] = m1[j];
//				for(int l = 0; l< m2.length; l++); {
//					System.out.println(m2);
//				
//	
//				}
//				
//		
//	}
//	
//}
//	

	
}}