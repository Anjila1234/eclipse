package Inheritance;

public class multiwithoutconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Grandmother g = new Grandmother();
System.out.println(g.Gfirstname);
System.out.println(g.lastname);
System.out.println(g.age);

g.displayname();

mother m = new mother ();
System.out.println(m.mfirstname);
System.out.println(m.lastname);
System.out.println(m.age);
m.displaymname();

daughter d = new daughter ();
System.out.println(d.dfirstname);
System.out.println(d.lastname);
d.displaydname();


	}

}


//without constructor
 class Grandmother {
	 String Gfirstname = "Dilkumari";
	 String lastname = "Karki ";
	 int age = 80;
	 
	 public void displayname() {
		System.out.println(this.Gfirstname + this.lastname + this.age);
	 }
 }
 
 class mother extends Grandmother {
	 String mfirstname = "kalpana";
	 
	 public void displaymname() {
		 System.out.println(this.mfirstname + this.lastname);
	 }
	 
 }
 
 class daughter extends mother{
	 String dfirstname = "Anjila";
	 
	 public void displaydname() {
		 System.out.println(this.dfirstname + this.lastname);
	 }
 }
 

	
	 
	 
 
 