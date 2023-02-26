package string.java;

public class assignment12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//teacher ohm = new teacher ("ohm", "pradhan");
	//teacher sarita = new teacher ("Sarita", "Basnet");
	
//	ohm.displaytname();
	
	teacher1 a [] = {new teacher1 ("om", "pk"), new teacher1("LK", "DK"), new teacher1("SK", "LK"), new teacher1("Mk", "SK")};
	 
	for(int i = 0; i< a.length; i++) {
		   System.out.println(i);
		   System.out.println(a[i].firstname);
		 
		   
	   }
	   for(teacher1 b:a) {
		//   System.out.println(b);
		   System.out.println(b.firstname);
		   System.out.println(b.lastname);
		   b.displaytname();
	   }
 
	}}
 class teacher1 {
	 String firstname;
	 String lastname;
	 
	 public teacher1 (String fn, String ln) {
		 this.firstname = fn;
		 this.lastname = ln;
	 }
	 void displaytname () {
		 System.out.println(this.firstname + this.lastname);
	 }
 }
 