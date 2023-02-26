package oops1;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		personA pooja = new personA ("Pooja khadka", 30, "Munna dahal");
		personA Indira = new personA ("Indira Adhikari", 28, "Elina Adhikari");
		
		System.out.println(pooja.fullname);
		System.out.println(Indira.fullname);
		System.out.println(pooja.bestfriend);
		System.out.println(Indira.bestfriend);
		System.out.println(pooja.age);
		System.out.println(Indira.age);
		
		pooja.displayname();
		Indira.displayname();
		
		
		pooja.fullname = "Anjila Katuwal";
		pooja.bestfriend = "Anita lama";
		pooja.age = 20;
		
		System.out.println(pooja.fullname);
		System.out.println(pooja.bestfriend);
		System.out.println(pooja.age);
		
	personA anjila = new personA ("Anjila Katuwal", 30, " Nabaraj pahadi");
	personA anjilaB = new personA ("Anjila Kc", 31, " Arpana Pakhrin");
	
	anjila.displayname();
	anjilaB.displayname();
	
	//Arrays
	
	personA [] a = {
			new personA ("Ak", 10, "NK"),
			new personA ("NK", 12, "RK"),
			new personA ("KA", 14, "NR"),
			new personA ("RA", 16, "AR")
			};

	//a[0].displayname();
	for (personA a1:a) {
		System.out.println(a1.fullname);
		System.out.println(a1.bestfriend);
		System.out.println(a1.age);
		
	}
	
	personB anze = new personB () ;
		
	anze.firstname = "Anze";
	anze.lastname ="kc";
	anze.age = 20;
	
	System.out.println(anze.firstname);
	System.out.println(anze.lastname);
	System.out.println(anze.age);
	
	
			
	
	}

}

class personA {
	String fullname = "Anjila Katuwal";
	int age = 26;
	String bestfriend = "Aarti lama";
	
	
	public personA (String fN, int ag, String BD) {
		this.fullname = fN;
		this.age = ag;
		this.bestfriend = BD;
		
	}
	public void displayname () {
		System.out.println(this.fullname + this.bestfriend + this.age);
	}
}

class personB {
	String firstname;
	String lastname;
	int age;
	
	public void setfirstname (String fn) {
		this.firstname = fn;
	}
	public void setlastname (String ln) {
		this.lastname = ln;}
		
		public void setage(int ag) {
			this.age = ag;
		}
	}
