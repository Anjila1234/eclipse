package reverse;

import java.util.Arrays;

public class day1 {
	public static void main(String[] args) {
	
		String name = "Anjila";
		String rev = "";
		for(int i =  0; i < name.length(); i++) {
			rev = name.charAt(i) + rev;//alijnA
			
		}
		System.out.println(rev);
		
		char [] a1 = {'a','n','j','i','l','a'};
		String rev1 = "";
		
		
		for(int a2:a1) {
			rev1 = rev1 +a1; 
			
			
		}
		System.out.println(rev1); //alijna
		
		
		char [] b1 = {'s','a','m','p','a','d','a'};
		for(int i = b1.length-1; i>=0; i-- ) {
		//	System.out.println(i);
			System.out.println(b1[i]);
			
		}
		for(int b2:b1) {
			
			System.out.println(b2);
		}
		
		String name1 = "Kalpana";
		char [] c1 = name1.toCharArray();
		for(int i = 0; i< c1.length; i++) {
			System.out.println(c1[i]);
		}
		
		
		
	}

}
