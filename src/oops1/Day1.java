package oops1;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		person anjila = new person("Anjila","Katuwal",26);
		person arati = new person ("Arati","Lama", 27);
		person shivani= new person ("Shivani", "Shrestha", 28);
		
		System.out.println(anjila.fullname);
		System.out.println(anjila.lastname);
		System.out.println(anjila.age);
		
		System.out.println(arati.fullname);
		System.out.println(arati.lastname);
		System.out.println(arati.age);
		
		System.out.println(shivani.fullname);
		System.out.println(shivani.lastname);
		System.out.println(shivani.age);
		
		anjila.run();
		arati.run();
		shivani.run();
		
		anjila.walk();
		arati.walk();
		shivani.walk();
		
	
		
	}

}
 class person{
	 String fullname;
	 String lastname;
	 int age;
	 
	 public person(String fn, String ln, int ag){
		 this.fullname = fn;
		 this.lastname = ln;
		 this.age = age;
	 }
	 public void  run() {
		 System.out.println("I am running");
	 }
	 public void walk() {
		 System.out.println("I am walking");
	 }
 }