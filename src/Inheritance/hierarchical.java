package Inheritance;

public class hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

// with constructor

class momanita {
	String fullname;
	String lastname;

	public momanita(String fn, String ln) {
		this.fullname = fn;
		this.lastname = ln;
	}

	public void mom() {
		System.out.println(this.fullname + this.lastname);
	}

}

class sonnabaraj {
	String sname;
	String lastname;

	public sonnabaraj(String fn, String ln, String sn, String sln) {
		this.sname = sn;

		System.out.println(this.sname + this.lastname);
	}

}