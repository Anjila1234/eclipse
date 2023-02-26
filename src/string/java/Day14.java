package string.java;

public class Day14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GrandF Ratna = new GrandF ("Ratna","katuwal",78);
		
		Ratna.displayGname();
		System.out.println(Ratna.firstname);
		System.out.println(Ratna.lastname);
		System.out.println(Ratna.age);
		
		
		Father Pradip = new Father ("Ratna","Katuwal", 78, "Pradip");
		Pradip.displayFname();
		
		Son Dinjul = new Son ("Ratna", "Katuwal", 78, "Pradip", "Dinjul");
		Dinjul.displaySname();
		
//without constructor calling the method
		
	Grandmother Tamka = new Grandmother();
	Tamka.dGrandmother();
	
	mother kalpana = new mother();
	kalpana.dmother();
	
	daughter Anjila = new daughter();
	Anjila.ddaughter();
	}

}
// with constructor
class GrandF {
	
String firstname; 
String lastname ;
int age ;

public GrandF (String fn, String ln, int ag) {
	this.firstname = fn;
	this.lastname =ln;
	this.age =ag;
	
	
}
public void displayGname () {
	System.out.println(this.firstname + this.lastname + this.age);
}
}


class Father extends GrandF {
	String FFathername ;

	public Father(String fn, String ln, int ag, String FFname) {
		super(fn, ln, ag);
	this.FFathername = FFname; 
	}
	public void displayFname() {
		System.out.println(this.FFathername + this.lastname);
		
	}
}
class Son extends Father{
	String sonname;
	public Son(String fn, String ln, int ag, String FFname, String Sname) {
		super(fn, ln, ag, FFname);
		this.sonname = Sname;
	}
	public void displaySname() {
		System.out.println(this.sonname + this.lastname);
	}
}

//without constructor

class Grandmother {
	String Gfirstname = "Tamka Maya ";
	String Lastname = "Kc";

	 void dGrandmother () {
		System.out.println(this.Gfirstname + this.Lastname);
		
	}}

class mother extends Grandmother {
	String mfirstname;
	
	 void dmother () {
		this.mfirstname ="kalpana";
		System.out.println(this.mfirstname + this.Lastname);
	}
}
class daughter extends mother {
	String dfirstname = "Anjila";
	
	void ddaughter( ) {
		System.out.println(this.dfirstname + this.Lastname);
	}
}
