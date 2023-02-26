package string.java;

public class Day155 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
students Sadiksha = new students("Sadiksha", 22, "siddhasthali");
students Sandil = new students("Sandil", 19, "Siddhasthali");
Sadiksha.Sname();
Sandil.Sname();

System.out.println(Sadiksha.firstname);
System.out.println(Sandil.firstname);
System.out.println(Sadiksha.age);
System.out.println(Sandil.age);

teacher shanta = new teacher ("Sadiksha", 22, "Siddhasthali","shanta",40000);
teacher db = new teacher ("Sadiksha", 22, "Siddhasthali","db",60000);

teacher shanta1 = new teacher ("Sandil", 19, "Siddhasthali","shanta",40000);
teacher db1 = new teacher ("Sandil", 19, "Siddhasthali","db",60000);

shanta.Tname();
shanta1.Sname();
db.Tname();


father1 pradip = new father1 ("Pradip","katuwal");
pradip.dfname();


son1 dinjul = new son1 ("Pradip","katuwal", "Dinjul");
daughter1 anjila = new daughter1 ("Pradip", "katuwal", "Anjila");

dinjul.dsfname();
anjila.ddfname();
	}

}
//with constructor
class students {
	protected String firstname;
	protected int age;
	protected String schoolname;
	
	public students (String fn, int ag, String sn) {
		this.firstname = fn;
		this.age = ag;
		this.schoolname = sn;
		
	}
	public void Sname() {
		System.out.println(this.firstname + this.age);
	}
}

class teacher extends students{
String teachername;
int salary;
		

	public teacher(String fn, int ag, String sn,String tn, int sl) {
		super(fn, ag, sn);
		this.teachername = tn;
		this.salary = sl;
	}
	
	public void Tname() {
		System.out.println(this.teachername + this.salary);
	}	
}

class principal extends teacher {
String Principal;
	public principal(String fn, int ag, String sn, String tn, int sl, String pn) {
		super(fn, ag, sn, tn, sl);
		this.Principal= pn;
	}
	
	public void displaypinformation() {
		System.out.println(this.Principal + this.schoolname);
		
	}
}



class father1 {
	String ffirstname;
	String flastname;
	
	public father1 (String fn1, String ln1) {
		this.ffirstname = fn1;
		this.flastname = ln1;
		
	}
	void dfname() {
		System.out.println(this.ffirstname + this.flastname);
	}
}


class son1 extends father1{
	String Sfirstname;

	public son1(String fn1, String ln1, String sfn) {
		super(fn1, ln1);
		this.Sfirstname = sfn;
	}
	
	void dsfname() {
		System.out.println(this.Sfirstname + this.flastname);
	}
}

class daughter1 extends father1 {
String daufirstname;
	public daughter1(String fn1, String ln1, String dau) {
		super(fn1, ln1);
		this.daufirstname = dau;
	}
	void ddfname() {
		System.out.println(this.daufirstname + this.flastname);
	}
	}