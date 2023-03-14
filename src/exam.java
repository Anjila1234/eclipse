
public class exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		teacther t = new teacther ("ANJILA", "KATUWAL", "SHANTA");
		System.out.println(t.firstname);
		System.out.println(t.lastname);
		System.out.println(t.tfullname);
		
		t.displaysname();
		t.studentclass();

	}

}

abstract class student{
	
String firstname ;
String lastname;

 public student ( String fn, String ln) {
	this.firstname = fn;
	this.lastname = ln;
}
 abstract public void studentclass();
 public void displaysname() {
	 System.out.println(this.firstname + this.lastname);

 }

}
 class teacther extends student {
String tfullname;
	public teacther(String fn, String ln, String tname) {
		super(fn, ln);
		this.tfullname= tname;
		// TODO Auto-generated constructor stub
		System.out.println("");
	}

	@Override
	public void studentclass() {
		// TODO Auto-generated method stub
		System.out.println("students in QA");
		
	}
	 
 }