package day1string.java;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String subject = "I am learning java";
		String subject1 = " I am learning python";

		System.out.println(subject);
		System.out.println(subject1);

		System.out.println("Hy" + 3);
		System.out.println(2 + 3);
		System.out.println(3 + "hello");

		String greet = "I am learning QA";
		int a1 = greet.length();
		System.out.println(a1);
		System.out.println(greet.length());

		int a2 = 40;
		System.out.println(a2);
		System.out.println("a2");

		String first = "QA";
		String second = "Learning";
		String three = first.concat(first);
		System.out.println(three);
		
		String city =new String("kathmandu");
				System.out.println(city);
				
				String city1 ="kathmandu";
				String cityL= city1.toLowerCase();
				System.out.println(cityL);
				
				String city2 = "Lalitpur";
				String cityU =city2.toUpperCase();
				System.out.println(cityU);
				
				String city3 = "satdobato";
				System.out.println(city3.length());
				
				
				String country = "USA";
				int a = country.toLowerCase().toUpperCase().length();
				System.out.println(a);
int a = 5;
		int b = 6;
		
	}

}
