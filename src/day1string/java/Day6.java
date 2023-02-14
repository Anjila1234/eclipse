package day1string.java;



public class Day6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1;
		System.out.println(a);
		
		
	String namesa[] = new String[5];
		
		namesa[0] = "anjila";
		namesa[1] = "anita";
		namesa[2] = "amrita";
		namesa[3] = "asha";
		namesa[4]= "akasha";
		
		System.out.println(namesa);
		
		for(int i = 0; i< namesa.length; i++) {
			System.out.println(i);
			System.out.println(namesa[i]);
		}
	
////		 System.out.println(names);
//		 System.out.println(names[0]);
////		
		
//		String[] names = new String[5];
//		String names2[] = new String[5];
//
//		names[0] = "amol";
//		names[1] = "sarika";
//		names[2] = "poorva";
//		names[3] = "ajay";
//		names[4] = "bikram";
//		System.out.println(names);
	
//		// Array stores the element by index
//		System.out.println(names[0]);
		
		String[] places = { "sindhuli", "sarlahi", "Bardibas"};
		System.out.println(places[2]);
		 
		for(int i =0; i<places.length; i++) {
//			System.out.println(i);
			System.out.println(places[i]);
		}
		
		
		
//
//		String[] cities = { "pune", "mumbai", "banglore", "kolkalta", "chennai" };
//		System.out.println(cities[2]);
//
//		for (int i = 0; i < cities.length; i++) {
//			// System.out.println(i);
//			System.out.println(cities[i]);
//		}
//
//		for (int i = 0; i < names.length; i++) {
//			// System.out.println(i);
//			System.out.println(names[i]);
//		}

		int[] numbers1 = {1, 2, 3, 4, 5};
		int[] numbers2 = new int[4];
		int sum = 0;
		for (int i =0; i< numbers1.length; i++) {
			System.out.println(i);
			System.out.println(numbers1[i]);
			
			sum = sum + numbers1[i];
			System.out.println(sum);
		}
		
//		// program 2
//
//		int[] numbers = { 22, 33, 44, 55, 66 };
//
//		int[] numbersb = new int[3];
//		numbersb[0] = 11;
//		numbersb[1] = 22;
//		numbersb[2] = 33;
//
//		// 0 1 2
//		// [11,22,33]
//
//		int sum = 0;
//
//		for (int i = 0; i < numbersb.length; i++) {
//			// System.out.println(i);
//			// System.out.println(numbersb[i]);
//
//			sum = sum + numbersb[i];
//			// 0 + 11 =======> 11
//			// 11 + 22 =======> 33
//			// 33 + 33 ========>66
//		}
//
//		System.out.println(sum);
//
//		// program3

		String a1 = " I am learning QA";
		String[] a1_b1 = a1.split("a");
		
		for(int i =0; i< a1_b1.length; i++) {
			System.out.println(i);
			System.out.println(a1_b1[i]);
			
		}
//		String info = "I am learning javascript";
//		String[] info_br = info.split(" ");
//		String[] info_br2 = info.split("a");
//		// ["I","am","learning","javascript"];
//		// ["I ","m le","rning j","v","script"]
//
//		for (int i = 0; i < info_br.length; i++) {
//			//System.out.println(i);
//			System.out.println(info_br[i]);
//		}
//
//		for (int i = 0; i < info_br2.length; i++) {
//			//System.out.println(i);
//			System.out.println(info_br2[i]);
//		}
//		
		String placename = "sindhuli";
		char a2 []= placename.toCharArray();
		System.out.println(a2);
		
		for (int i =0; i< a2.length; i++) {
			System.out.println(a2[i]);
		}
		
//		String citiName = "Nagpur";
//		// ['N','a','g','p','u','r']
//		char  bb [] = citiName.toCharArray();
//		
//		//System.out.println(bb);// y not reference
//	
//		for(int i = 0 ; i < bb.length ; i++) {
//			System.out.println(bb[i]);
//		}
//		
//		// for each loop
     int name3 [] = { 1,2,3,4};
    // System.out.println( );
     
     for(int n:name3) {
    	 System.out.println(n);
     }
      
     String [] names4 = {"sita","Gita","sarita","Rita"};
     for(String d:names4) {
    	 System.out.println(d);
     }
     
     char []a5 = { 'a','n','i','t','a'};
     String same = "";
     for (char i:a5) {
    	 same = same+i;
    	 System.out.println(same);
     }
     
//		// program 4
//		int age [] = {2,11,22,33};
//		System.out.println("for each loop");
//		
//		for(int a:age) {
//			System.out.println(a);
//		}
//		
//		// javascript --- for , map()
//		
//		String [] namesi = {"amol","ram","sachin","satish"};
//		for(String s:namesi) {
//			System.out.println(s);
//		}
//		
//		char [] nn = {'a','m','o','l'};
//		String rev = "";
//		// amol
//		for(char i:nn) {
//			rev = rev + i;
//		}
//		System.out.println(rev);
//		
    int num6 [] = {1,2,3,4,5,6,7,8,9};
    int sum1 = 0;
    float avg =0;
    
 for(int x:num6) {
	 sum1 = sum1 + x;
	 System.out.println(sum1);
	 avg = sum1/num6.length;
	 System.out.println(avg);
   }
    
    
//		// program 5
//		
//		int numbersc [] = {3,44,55,66,77,88,9,44};
//		// sum and average
//		
//		int suma = 0;
//		float avg =0;
//		
//		for(int a:numbersc) {
//			suma = suma + a;
//		}
//		
//		System.out.println(suma);
//		avg = suma/numbersc.length;
//		System.out.println(avg);
//		
//		// program 6
//		
//		int [][] matrix = {{11,22,33},{44,55,66,77}};
//		
////		matrix ====>  [
//			
////		 	   [11,22,33]
////		 	   [44,55,66]  
////		 
////		 ]
////		
//		
//		System.out.println(matrix[0][0]);
//		System.out.println(matrix[0][0]);
//		System.out.println(matrix[1][3]);
//	
		 
	int[][] name8 = {{1,2,3,4,5,6,},{7,8,9,10}};
	System.out.println(name8[0][0]);
	System.out.println(name8[1][2]);
	System.out.println(name8[1][3]);
	}

}
