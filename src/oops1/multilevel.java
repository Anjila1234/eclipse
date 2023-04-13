package oops1;

public class multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
granddad g = new granddad ("Dil","karki");
g.displaygname();


dad d = new dad ("Dil","karki", "ram");
d.displaydad();
d.displaygname();

son s = new son ("Dil","karki", "ram", "raju");
s.displaydad();
s.displaygname();
s.displaygname();



	}

}

// with constructor
 class granddad {
	 String gfirstname ;
	 String glastname;
	 
	 public granddad (String gfn, String gln ){
		 this.gfirstname = gfn;
		 this.glastname = gln;
		 
		
	 }
	 public void displaygname() {
		 System.out.println(this.gfirstname + this.glastname);
	 }
 }
 
 class dad extends granddad {
String dname ;
	public dad(String gfn, String gln, String dname) {
		super(gfn, gln);
		this.dname = dname;
		// TODO Auto-generated constructor stub
	}
	public void displaydad () {
		System.out.println(this.dname);
	}
 }
 
 class son extends dad {
		String sname ;
	 public son(String gfn, String gln, String dname, String sname) {
		super(gfn, gln, dname);
		this.sname = sname;
		// TODO Auto-generated constructor stub
	}


	 
	 public void sname() {
		 System.out.println(this.sname);
	 }
	 
 }
 
 //without constructor
 
 class granny {
	 
	 String firstname = "Dilkumari";
	String lastname = "karki";
			 
public void name ()	{
	System.out.println(this.firstname + this.lastname);
}}
class mother {
	String mother = "kalpana";
	
	public void mname() {
		System.out.println(this.mother);
	
}
 }