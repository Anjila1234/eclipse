package day1string.java;

import java.util.Arrays;

public class Day8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 fruits apple  = new fruits ( "good", "red",2);
	 fruits mango = new fruits ("sour", "yellow", 3);
	 
		mango.count = 5;
		mango.color = "green";
//		System.out.println(apple.color);
//		System.out.println(mango.taste);
//		System.out.println(mango.color);
		
		apple.fruitsgood();
		fruits [] ab1 = { apple, mango};
//		for(int i =0; i< ab1.length; i++) {
//			System.out.println(ab1[i].color);
//			System.out.println(ab1[i].count);
//			System.out.println(ab1[i].taste);
//		}
		
		for( fruits a5: ab1) {
			a5.fruitsgood();
			System.out.println(a5.color);
			System.out.println(a5.count);
			System.out.println(a5.taste);
			
		}
	}

}

class fruits{
	String taste;
	String color;
	int count;
	
	
	
	
	public fruits(String tas, String col, int cou) {
	this.color = col;
	this.count = cou;
	this.taste = tas;
		
		
		
		
	}
	public void fruitsgood() {
		System.out.println("fruits are best");
	}
}