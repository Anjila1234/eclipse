package string.java;

import java.util.Arrays;

public class stringtochar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String a1 = "ANJILA";
		char [] a2 = a1.toCharArray();
		System.out.println(a1);
		System.out.println(Arrays.toString(a2));
		
		char a [] = {'a','n','j','i','l','a'};
		String rev = "";
		for(char a3:a) {
			rev = a3 + rev;
			System.out.println(rev);
		}
		
		String city = "Kathmandu";
		String vowels ="aeiou";
		int count = 0;
		for(int i = 0; i< city.length(); i++) {
			if(city.charAt(i)=='a'|city.charAt(i)=='e'| city.charAt(i)=='o'| city.charAt(i)=='u') {
				count = count + 1;
			}
			
		}
		System.out.println(count);
	}

}
