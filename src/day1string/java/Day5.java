package day1string.java;

import two.String;

public class Day5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String fruit = "pineapple";
		int a = fruit.indexOf('a',5);
//		System.out.println(a);
		int count = 0;
		for(int i = 0; i < fruit.length(); i++)
		if(fruit.charAt(i)== 'a') {
			System.out.println(i);
			count = count +1;
		}
		System.out.println(count);
		
//		// 0 1 2 3 4 5
//				// a p p l e p
//
				String fruits = "applep";
				int b = fruits.indexOf('p', 3);
				System.out.println(b);
				int counts = 0;
				for (int i = 0; i < fruit.length(); i++) {

					if (fruit.charAt(i) == 'p') {
						System.out.println(i);
						counts = counts + 1;
					}
				}
				System.out.println(counts);
				
				
				
				//array
				int num [] = new int[4];
				num[0] = 10;
				num[1] = 12;
				num[2] = 14;
				num[3] = 16;
				 System.out.println(num[0]);
				 System.out.println(num[1]);
				 System.out.println(num[2]);
				 System.out.println(num[3]);
				 
				 
				 String x = "sandil";
				for(int i = 0; i < x.length(); i++) {
					System.out.println(x.charAt(i));
					System.out.println(i);
				}
				
				String y = "kalpana katuwal karki";
				for(int i =0; i<y.length(); i++) {
				System.out.println(i);
				System.out.println(y.charAt(i));
				}
				
				String z = "Pradip Katuwal Kc";
				for(int i = 0; i<z.length(); i++) {
					System.out.println(i);
					System.out.println(z.charAt(i));
				}
				 
//		String places1 [] = new String[4];
//		places1[1] ="kathmandu";
//		places1[2] = "lalitpur";
//		places1[3] = "satdobato";
//		places1[4] = "gwarkho";
//		
//		for(int i = 0; i<places1.length; i++) {
//			System.out.println(places1[i]);
//		}
//		

//				
//				// program4
//				
//				String cities [] = new String[3];
//				cities[0] = "pune";
//				cities[1] = "bangalore";
//				cities[2] = "nagpur";
//				
//				for(int i = 0 ; i < cities.length ; i++) {
//					//System.out.println(i);
//					System.out.println(cities[i]);
//				}
				
				
				int numbers[]= {1,2,3,4,5,6};
				for (int i =0; i < numbers.length; i++) {
//					System.out.println(i);
					System.out.println(numbers[i]);
				}
//				
//				// program 5
//				//                 0  1  2   3 4  5  6
//				int numbersb [] = {11,22,33,44,55,66,77}; 
//				
//				for(int i = 0 ; i < numbersb.length ; i++) {
//					//System.out.println(i);
//					System.out.println(numbersb[i]);
//				}
				
				String vegetables [] = {"potato", "tomato", "cauliflower"};
				for(int i = 0; i<vegetables.length; i++) {
					System.out.println(i);
					System.out.println(vegetables[i]);
					
				}
//				
//				// program 6 
//				
//				String fruits [] = {"apple","mango","banana","grapes"};
//				for(int i = 0 ; i < fruits.length ; i++) {
//					System.out.println(fruits[i]);
//				}
//				
//				
//				
//				char aa [] = {'a','p','p','l','e'};
//				for(int i = 0 ; i < aa.length ; i++) {
//					System.out.println(i);
//					System.out.println(aa[i]);
//				}
//				
//				// program 7
//				
//				String  firstName = "chinmay";
//				char [] ra = firstName.toCharArray(); //{'c','h','i','n','m','a','y'}
//				for(int i = 0 ; i < ra.length ; i++) {
//					System.out.println(i);
//					System.out.println(ra[i]);
//				}
//				
//				// program 8
//				
//				String e = "I am learning java";
//				String ra2 [] = e.split(" ");
//				String ra3 [] = e.split("a");
//				
//				//{"I","am","learning","java"}
//				//{"I ","m le","rning ","j","va"}
//			
//				for(int i = 0 ; i < ra2.length ; i++) {
//					//System.out.println(i);
//					System.out.println(ra2[i]);
//				}
//				
//				for(int i = 0 ; i < ra3.length ; i++) {
//					//System.out.println(i);
//					System.out.println(ra3[i]);
//				}
				

	}

}
