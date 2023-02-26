package string.java;

public class Day13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		anjila anz = new anjila();
		anz.message();

		nabaraj nab = new nabaraj();
		nab.name1();


	DataB db = new DataB ();
	String ab = db.getcityname();
	System.out.println(ab);
	
	DataC abc = new DataC("sindhuli");
	System.out.println(abc.getcity2());
	
	DataC abcd = new DataC ("Sarlahi");
	System.out.println(abcd.getcity2());
	
	
	}

}

class anjila {
	void message() {
		System.out.println("Hy");

	}
}

class nabaraj {
	 String name = "nabaraj";

	private void displayname() {
		System.out.println(this.name);
	}

	public void name1() {
		this.displayname();
	}
}


	class DataB {
		private String city = "kathmandu" ;
	
		public void setcityname(String cn) {
			this.city = cn;
		
	}
	public String getcityname() {
		return this.city;
		
	}
	}
	
class DataC {
	private String city2;
	
	public DataC(String c2) {
		this.city2 = c2;
		
	}
	void setcity2(String c21) {
		this.city2 = c21;
		
	}
	public String getcity2 () {
		return this.city2;
	}
}
