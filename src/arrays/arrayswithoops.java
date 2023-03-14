package arrays;

public class arrayswithoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//students a1 = new students("anjila", "katuwal", 1)	;
	students a2 [] = { 
			new students ("ak" , "kl", 3), 
			new students("MK", "lk", 4),
			new students("Lk", "SK", 5),
			new students("sk", "MK", 10)};
	
	
	for(int i = 0; i< a2.length; i++) {
		System.out.println(a2[i]);
		System.out.println(a2[i].firstname);
		System.out.println(a2[i].lastname);
		System.out.println(a2[i].rollno);
	}
			
	for(students a:a2) {
		System.out.println(a);
		System.out.println(a.firstname);
		System.out.println(a.lastname);
		System.out.println(a.rollno);
		
	}
		
	}

}
//with constructor
class students {
	String firstname;
	String lastname;
	int rollno;
	
	public students (String fn, String ln, int rol) {
		this.firstname = fn;
		this.lastname = ln;
		this.rollno = rol;
		
	}
	public void activity() {
		System.out.println(this.firstname + this.lastname + this.rollno);
	}

}