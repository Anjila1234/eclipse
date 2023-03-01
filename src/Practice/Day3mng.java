package Practice;

public class Day3mng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String country = "Nepal";
		System.out.println(country);
		System.out.println(country.length());
		
		for(int i = 0; i< country.length(); i++) {
			System.out.println(i);
			System.out.println(country.charAt(i));
		}
		//reverse
		String rev1 = "";
		for(int i = country.length()-1; i>= 0; i -- ) {
			System.out.println(i);
			System.out.println(country.charAt(i));
		//	rev1 = country.charAt(i) + rev1;
			rev1 = rev1 + country.charAt(i);
		}
		System.out.println(rev1);
		
		
		String fruits = ("Apple, Mango, Banana");
		String available = "Apple";
		String notavailable = "Litchi";
		System.out.println(fruits.contains(available));
		System.out.println(fruits.contains(notavailable));
		
		if (fruits.contains(available)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		if(fruits.contains(notavailable)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
		String animal = "elephant";
		String vowels ="aeiou";
		int count = 0;
		for(int i = 0; i < animal.length(); i++) {
			if(animal.charAt(i)=='a'|| animal.charAt(i)=='e'|| animal.charAt(i)=='i'|| animal.charAt(i)=='o'|| animal.charAt(i)=='u') {
			count = count + 1;	
			}
			
		}
	//	System.out.println(count);
		
		
		String name = "AnjilaNabaraj";
		String vowels1 = "ariou";
		int count1 = 0;
		for(int i = 0; i<= name.length()-1; i++) {
			if(name.charAt(i)=='a'|| name.charAt(i)== 'e'|| name.charAt(i)=='i'|| name.charAt(i)=='o'|| name.charAt(i)=='u') {
				count1 = count1 + 1;
				System.out.println(name.charAt(i));
			}}
			System.out.println(count1);
			
		
		
	}

}
