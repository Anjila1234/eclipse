package Inheritance;

public class multiwithconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Grandmother12 gnm = new Grandmother12("Tamkamaya", "Katuwal");
	System.out.println(gnm.Gnfirstname);
	System.out.println(gnm.Gnlastname);
	gnm.displaygnmother();
	
	mother1 mn = new mother1 ("Tamkamaya", "Katuwal", "Sarita");
	System.out.println(mn.Gnfirstname);
	System.out.println(mn.Gnlastname);
	System.out.println(mn.mname);
	mn.displaymname();
	mn.displaygnmother();
	
	daughter1 dn = new daughter1("Tamkamaya", "Katuwal", "Sarita", "srijana");
	System.out.println(dn.dname);
	System.out.println(dn.Gnfirstname);
	System.out.println(dn.Gnlastname);
	System.out.println(dn.mname);
	
	dn.displaydname();
	dn.displaygnmother();
	dn.displaymname();
	
	}

}
// with constructor
class Grandmother12 {
	 String Gnfirstname;
	 String Gnlastname;
	 
	 public Grandmother12(String gnf, String gnl) {
		 this.Gnfirstname = gnf;
		 this.Gnlastname = gnl;
		 
	 }
	 public void displaygnmother() {
		 System.out.println(this.Gnfirstname + this.Gnlastname );
	 }
}

class mother1 extends Grandmother12 {
String mname;
	public mother1(String gnf, String gnl, String mname) {
		super(gnf, gnl);
		this.mname = mname;
	}
	public void displaymname() {
		System.out.println(this.mname + this.Gnlastname);
	}
}

class daughter1 extends mother1{
	String dname;

	public daughter1(String gnf, String gnl, String mname, String dn) {
		super(gnf, gnl, mname);
		this.dname = dn;
	}
	
	public void displaydname() {
		System.out.println(this.dname + this.Gnlastname);
	}
}

