package arrays;

import java.util.Arrays;

public class arrayspractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//simple arrays	
	int a1 []	= {5, 10, 15, 20, 25};
	
	for(int i = 0; i< a1.length; i++) {
		System.out.println(a1[i]);
		System.out.println(a1);
		System.out.println(Arrays.toString(a1));
	}
	
	for(int a2:a1) {
		System.out.println(a2);
	}
	//or
	
	int b1 [] = new int [5];
	b1[0] = 10;
	b1[1] = 20;
	b1[2] = 30;
	b1[3] = 40;
	b1[4] = 50;
	
	for(int c1:b1) {
		System.out.println(c1);
	
	}
//	for(int i = 0; i< b1.length; i++) {
//		System.out.println(b1[i]);
//	}
	
	//multi arrays
	
	
int d1 [] [] = {
		{10, 20, 30},
		{50, 60, 70},
		{90, 10, 30}
};

for(int i = 0; i< d1.length; i++) {
	int d2 [] = d1[i];
	for(int j = 0; j< d2.length; j++) {
	System.out.println(d2[j]);

}
		
}


for(int d3 [] : d1) {
	for(int d4 : d3) {
		System.out.println(d4);
	}
}
	
	
	int e1 [] [] [] = {
			{
				{10, 20, 30, 40},
				{5, 10, 15, 20},
				{1, 2, 3, 4}},
				
				{{5, 5, 4 },
					{10, 12, 13},
					{5, 5, 4 }}
			
	};
	
	
	
	for (int i = 0; i < e1.length; i ++) {
		int e2 [] [] = e1 [i];
		for(int j = 0; j < e2.length; j++) {
			int e3 [] = e2 [j];
			for(int k = 0; k < e3.length; k++) {
				System.out.println(e3[k]);
			}
		}
		
	}
	
	for(int e4 [][]: e1) {
		for(int e5 [] : e4) {
			for(int e6 : e5) {
				System.out.println(e6);
			}
		}
	}
		
	
	
	String name [] = new String  [5];
	name[0] = "anjila";
	name[1] = "sadiksha";
	name[2] = "shneya";
	name[3] = "sahara";
	name[4] = "sakshi";
	
	
	
	for(int i = 0; i < name.length; i ++) {
		System.out.println(name[i]);
	}
	
	
	
	
	int []a5 = {10, 20, 30, 40, 50};
	int sum = 0;
	int avg = 0;
	for(int i = 0; i < a5.length; i++) {
		sum = sum + a5[i];
		avg = sum/a5.length;
		
		
	}
	System.out.println(sum);
	System.out.println(avg);
	
	
	
	String name2 = "anjila";
	String rev = "";
	for(int i = 0; i< name2.length(); i ++) {
		rev =  name2.charAt(i) + rev;
		System.out.println(rev);
	}
	
	
	char name3[] = {'a','n', 'j', 'i', 'l', 'a'};
	String rev1  = "";
	for(int n : name3) {
		rev1 = rev1 + 1;
		
		
	}
	System.out.println(rev1)
	;
	
	String  a6 = "apple";
	int a7 = a6.indexOf(a6);
	
	
	}
		
	}


