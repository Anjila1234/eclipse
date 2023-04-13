package Inheritance;

public class hierarcial2 {
	public static void main(String[] args) {

		Mother1 M = new Mother1("Kalpana", "Katuwal");
		System.out.println(M.firstname);
		System.out.println(M.lastname);
		M.getmother();

		daughter1 d = new daughter1("kalpana", "katuwal", "Anjila");
		System.out.println(d.dname);
		System.out.println(d.firstname);
		System.out.println(d.lastname);
		d.getdaughter();
		d.getmother();

		son1 s = new son1("Kalpana", "katuwal", "Dinjul");
		System.out.println(s.firstname);
		System.out.println(s.lastname);
		System.out.println(s.sname);
		s.getmother();
		s.getson();

	}

}

class Mother1 {
	String firstname;
	String lastname;

	public Mother1(String fn, String ln) {
		this.firstname = fn;
		this.lastname = ln;

	}

	public void getmother() {
		System.out.println(this.firstname + this.lastname);
	}
}

class daughter1 extends Mother1 {
	String dname;

	public daughter1(String fn, String ln, String dn) {
		super(fn, ln);
		this.dname = dn;
		// TODO Auto-generated constructor stub

	}

	public void getdaughter() {
		System.out.println(this.dname + this.lastname);
	}
}

class son1 extends Mother1 {
	String sname;

	public son1(String fn, String ln, String sn) {
		super(fn, ln);
		this.sname = sn;
		// TODO Auto-generated constructor stub
	}

	public void getson() {
		System.out.println(this.sname + this.lastname);
	}
}