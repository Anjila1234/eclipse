package string.java;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String city = "satdobato";
		String city1 = "Gwarkho";
		String city2 = "koteshwor";

		boolean result = city.equals(city1);
		System.out.println(result);
		if (result) {
			System.out.println("city and city1 equal");
		} else {
			System.out.println("city1 and city2 are not equal");
		}

		String result2 = city1.equals(city2) ? "equal" : "not equal";
		System.out.println(result2);

		String example = "Best quote\"Try try but donot cry\"";
		System.out.println(example);
		String city3 = "sindhuli";
		boolean c = city3.endsWith("i");
		boolean result4 = city3.endsWith("usi");
		System.out.println(result4);// not equal
		System.out.println(c);// true
		System.out.println(result4);// false

//		String ans1 = "I am learning QA and QA is great";
//		String result5 = ans1.replace("Q", "R");
//		System.out.println(result5);
//
//		String result6 = ans1.replaceAll("QA", "Java");
//		System.out.println(result5);
//
//		String result7 = ans1.replaceFirst("QA", "Java");
//		System.out.println(result7);
//
//		String city8 = "sindhuli";
//		char d = city8.charAt(4);
//		System.out.println(city8.length());
//
		String city9 = "Lalitpur";
		int len = city9.length();
		System.out.println(len);

		for (int i = 0; i < len; i++) {
			System.out.println(i);
			System.out.println(city9.charAt(i));
		}

		for (int j = city9.length() - 1; j >= 0; j--) {
//				System.out.println(j);
			System.out.println(city9.charAt(j));
		}
//		
//			String city10 = "Biratnagar";
//			char a = city10.charAt(5);
//			System.out.println(a);
//	}
//
//			String place = "Nagarkot";
//			String place2 = "Dhulikhel";
//			String place3 = "Sundhara";
//			
//			boolean result = place.equals(place2);
//			System.out.println(result);
//			if (result) {
//				System.out.println("place and place2 are equal");
//			}
//			else {
//				System.out.println("place and place3 are not equal");
//			}

	}

}
