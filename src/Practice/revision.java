package Practice;

import java.util.Arrays;

import two.String;

public class revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String city9 = "Lalitpur";
//		int len = city9.length();
//		System.out.println(len);
//		
//	//	L A L I T P U R
//	//	0 1 2 3 4 5 6 7 
//		
//
//	for (int i = 0; i < city9.length(); i++) {
//			System.out.println(i);
//			System.out.println(city9.charAt(i));
//		}
//
//		for (int j = city9.length() - 1; j >= 0; j--) {
//			System.out.println(j);
//			System.out.println(city9.charAt(j));
//		}
//		
//
//		String place4 = "Biratnagar";
//		//B I R A T N A G A R
//		//0 1 2 3 4 5 6 7 8 9
//		
//		for (int i = 0; i <= place4.length()-1; i++) {
//			System.out.println(place4.charAt(i));
//			System.out.println(i);
//		}
//		for (int i = place4.length() - 1; i >= 0; i--) {
//			System.out.println(place4.charAt(i));
//			System.out.println(i);
//		}
//		String city = "pune";
//		//String city2 = new String("nagpur");
//		System.out.println(city);
//		
//		// 0  1   2   3
//		// p  u   n   e
//		// program 1
//		for(int i = 0 ; i <= 3; i++ ) { //1 // 2 // 3 // 4
//			//System.out.println(i); // 0 , 1 // 2 // 3
//			// i ----0
//			// i ----1
//			// i ----2
//			// i ----3
//			System.out.println(city.charAt(i));
			
//		String place10 = "Sarlahi";
//		int ans = place10.length();
//		 
//		for (int i = 0; i <= place10.length()-1; i++) {
//			System.out.println(i);
//			System.out.println(place10.charAt(i));
//		}
//		
//		for (int i = 0; i < place10.length(); i++)	{
//			System.out.println(i);
//			System.out.println(place10.charAt(i));
//		}
//		String country = "nepal"; 
//		String rev  = "";
//		
//		for(int i = country.length()-1; i>=0; i--) {
//			rev = rev + country.charAt(i);
//			System.out.println(i);
//			System.out.println(rev);
//			System.out.println(country.charAt(i));
//			
//		}
//		System.out.println(rev);
		
//		String fruits = "apple mango banana grapes papaya";
//		String userInput = "banana";
//		if(fruits.contains(userInput)) {
//			System.out.println("Fruit is available");
//		}
//		else {
//			System.out.println("Fruit not available");
//		}
		
		String vegetables = "potato tomato cauliflower cabbage chilly ";
		String veg = "tomato";
		if(vegetables.contains(veg)) {
			System.out.println(" vegetable is available");
		}
			else {
				System.out.println("vegetable is not available");
			}
//		String result2 = city1.equals(city2) ? "equal" : "not equal";
//		System.out.println(result2);
		
//		String result = vegetables.contains(veg)? "available":"not available";
//		System.out.println(result);
//		
		
	
	String name8 = "anjilabhagwatiprajanichunu" ;
	int count =0;
	System.out.println(name8);
	System.out.println(name8.length());
	
//	for( int i =0; i < name8.length(); i++) {
////		System.out.println(name8.charAt(i));
//		if(name8.charAt(i) == 'a' ||name8.charAt(i) == 'e'|| name8.charAt(i) == 'i'|| name8.charAt(i) == 'o'||name8.charAt(i) == 'u') {
//			count = count + 1; 
//			System.out.println(count);
//		}
//	}
//	System.out.println(count);
//	
//	
//	String firstName = "chinmay";
//	int count1 = 0;
//	
//	
//	for(int i = 0  ; i < firstName.length() ; i++) {
////		System.out.println(firstName.charAt(i));
//		
//		if(firstName.charAt(i) == 'a' || firstName.charAt(i) == 'e' || firstName.charAt(i) == 'i' || firstName.charAt(i) == 'o' || firstName.charAt(i) == 'u') {
//			count1 = count1 + 1;
//		}
//			
//		
//	}
//	
//	System.out.println(count1);
			
	
		

	String abc = "Anjila Bhagwati";
	
	String def = abc.substring(5);
	System.out.println(def);
	
	String ghi = abc.substring (0, 5);
	System.out.println(ghi);
	
	String anz = "Hi";
	String bhg = "How";
	String chu = "are you ?";
	
	String pra = String.join(" ", anz, bhg, chu);
	System.out.println(pra);
	
	String are = String.join("@", pra, anz);
	System.out.println(are);
	
	String a1 = "Anjila";
	String bl = "Bhagwati";
	String c1 = "Chunu";
	
	String e1 = String.join("-" , a1, bl, c1  );
	System.out.println(e1);
	
	//K a t h m a n d u
	//0 1 2 3 4 5 6 7 8 
	String city = "Kathmandu";
	int  q = city.indexOf('h');
	System.out.println(q);
	
	int p = city.indexOf("m",1);
	System.out.println(p);
	
	for(int i = 0; i< city.length(); i++) {
		if( city.charAt(i)== 'a') {
			System.out.println(i);
		}
		
		
	}
	String a3 = " I am learning java ";
	String a4 = a3.trim();
	System.out.println(a3.length());
	System.out.println(a4.length());
	
	String a5 = a4.replace(" ", "");
	System.out.println(a5);
	
	String a6 = a4.replace("learning", "studying");
	System.out.println(a6);
	
	String a7 = a4.replaceAll(" I am learning java ", "QA");
	System.out.println(a7);
	
	String a8 = "I am learning java and I love learning java";
	String a9 = a8.replaceAll("learning", "studying");
	System.out.println(a9);
	
	String a10 = " I am learning QA";
	String [] a11 = a10.split("a");
	System.out.println(a11);
	System.out.println(Arrays.toString(a11));
	
	for(String m:a11) {
		System.out.println(m);
	}
	
	String a12 = "Amazing";
	String a13 ="";
	
	boolean a14 = a12.isEmpty();
	System.out.println(a14);
	boolean a15 = a13.isEmpty();
	System.out.println(a15);
	
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
//	System.out.println(i);
	System.out.println(a20[i].length);
}
//int []man = a20[i];
//for(int k = 0; k < man.length; i++) {
//	System.out.println(k);
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
//	System.out.println(v);
//	System.out.println(num1[v]);
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
}}

String vegetables2 = "onion potato cauliflower";
String available = "onion";
if(vegetables2.contains(available)){
	System.out.println("yes");	
}
else { 
	System.out.println("No");}

String result10 = vegetables2.contains("onion")?"yes":"No";
System.out.println(result10);

String fruits1 = " apple banana mango pomegranate";
String exist = "banana";
if(fruits1.contains(exist)) {
	System.out.println("available");
}
else {
	System.out.println("not available");
}

String result12 = fruits1.contains("banana")? "It is available": "It is not available";
System.out.println(result12);


String food = "ricepudding";
int taste = food.indexOf('d');
System.out.println(taste);

int smell = food.indexOf('i', 5);
System.out.println(smell);
int count5 =0;
for(int i =0; i< food.length(); i++) {
	if (food.charAt(i) == 'p')
	System.out.println(i);
	count5 = count5 + 1;
}
System.out.println(count5);



int num10 [] = new int [4];

num10 [0]= 5;
num10 [1]= 10;
num10 [2]= 15;
num10 [3] = 20;

for(int i =0; i< num10.length; i++) {
	System.out.println(i);
//	System.out.println(Arrays.toString(num10));
//	System.out.println(num10[i]);

}
System.out.println(num10[0]);
System.out.println(num10[1]);
System.out.println(num10[2]);
System.out.println(num10[3]);



String cityone[] = new String[3];

cityone [0]= "sindhuli";
cityone [1] = "sarlahi";
cityone [2]= "chitwan";

for(int i =0; i< cityone.length; i++) {
	System.out.println(i);
	System.out.println(cityone[i]);
}

String one = "I love my father and mother";
String two2 [] = one.split(" ");

for(int i = 0; i < two2.length; i++) {
	System.out.println(i);
	System.out.println(two2[i]);
	
}
 String citytwo [] = new String [2];
  citytwo [0] = "lalbandi";
  citytwo [1] = "chakmakae";
  
  for(int i =0; i< citytwo.length; i++) {
	  System.out.println(i);
	  System.out.println(citytwo[i]);
	  
  }
  
 String food1 = "Ricepudding";
 int food2 = food1.indexOf('i');
 System.out.println(food2);
 

String food22 = "erice";
int food3 = food22.indexOf(0, 'e');
System.out.println(food3);
	 
	 
 }
 
}
