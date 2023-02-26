package string.java;

public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String place = "panitanki";
		System.out.println(place);

		String place2 = new String("ratmata");
		System.out.println(place2);

//		for (int i = 0; i <= place.length() - 1; i++) {
//			System.out.println(i);
//			System.out.println(place.charAt(i));
//		}
//
//		for (int i = place.length() - 1; i >= 0; i--) {
//			System.out.println(i);
//			System.out.println(place.charAt(i));
//	}

		for (int i = 0; i <= place2.length(); i++) {
			System.out.println(i);

		}
//		
//		
//String country = "United states";
//String rev = "";
//for (int i = 0; i <= country.length()-1; i++) {
//	System.out.println(i);
//	System.out.println(country.charAt(i));
//}
//
//for (int i = country.length()-1; i >= 13; i--) {
//	System.out.println(i);
//	System.out.println(country.charAt(i));
//	
//
//
//rev = country.charAt(i)+ rev;
//System.out.println(rev);
//}

		String place3 = "kathmandu";
		for (int j = place3.length() - 1; j >= 0; j--) {
			System.out.println(j);
			System.out.println(place3.charAt(j));
		}

		for (int k = 1; k <= place3.length() - 1; k++) {

			System.out.println(k);
			System.out.println(place3.charAt(k));

		}

		String place4 = "Biratnagar";
		for (int i = 0; i <= place4.length() - 1; i++) {
			System.out.println(place4.charAt(i));
			System.out.println(i);
		}
		for (int i = place4.length() - 1; i >= 0; i--) {
			System.out.println(place4.charAt(i));
		}

//contains

		String Gasstation = "vape, gas, cigratee, food, noodles, coke";
		String available = "gas";
		if (Gasstation.contains(available)) {
			System.out.println("It is available");
		} else {
			System.out.println("It is not available");
		}

		String result3 = Gasstation.contains(available) ? "It is available" : "It is not available";
		System.out.println(result3);

		String vegetables = "onion potato tomato cauliflower";
		String userInput = "potato";
		if (vegetables.contains(userInput)) {
			System.out.println("vegetable is available");
		} else {
			System.out.println("vegetable is not available");
		}

		String result1 = vegetables.contains(userInput) ? "available" : "Not available";
		System.out.println(result1);

		String firstName = "anjila";
		int count = 0;
		for (int i = 0; i < firstName.length(); i++) {
//	System.out.println(firstName.charAt(i));
			if (firstName.charAt(i) == 'a' || firstName.charAt(i) == 'i' || firstName.charAt(i) == 'e'
					|| firstName.charAt(i) == 'u') {
				count = count + 1;
				System.out.println(firstName.charAt(i));
			}
		}
		System.out.println(count);

		String name = "Rudramayainou";
		int count1 = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'
					|| name.charAt(i) == 'u') {
				System.out.println(name.charAt(i));
				System.out.println(i);
			}
		}

		String name5 = "sadiksha";
		String rev = "";
		for (int i = name5.length() - 1; i >= 0; i--) {
			rev = rev + name5.charAt(i);
			System.out.println(rev);
		}

		String name4 = "sandil";
		for(int i =name4.length()-1; i >=0; i--) {
			System.out.println(name4.charAt(i));
			System.out.println(i);
		}
		
		for (int i =0; i<=name4.length()-1; i++) {
			System.out.println(i);
			System.out.println(name4.charAt(i));
		}

	}

}
