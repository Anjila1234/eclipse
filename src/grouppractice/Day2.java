package grouppractice;

import java.util.Arrays;

public class Day2 {
public static void main(String[] args) {

	String a1 = "Hy, My name is anjila";
//	int count = 0;
//	for(int i = 0; i < a1.length(); i++) {
//		if(a1.charAt(i)== 'a') {
//			count = count + 1;
//		}
//	}
//	System.out.println(count);
	
	String [] a2 = a1.split(" "); // split makes arrays
	System.out.println(a2);
	for(int i = 0; i < a2.length; i++) {
		System.out.println(a2[i]);
	}
	
	
	String a3 = "Bhagwati is mother of two boys";
	String rev = "";
	for(int i = 0; i< a3.length(); i++) {
		rev =  a3.charAt(i) + rev ;
	
	}
	System.out.println(rev);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
     

}
