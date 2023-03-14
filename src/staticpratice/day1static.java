package staticpratice;

public class day1static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	
		
		teacher1 t = new teacher1("sarad", 12 , "India", 5);
		System.out.println(t.name);
		System.out.println(t.reg);
//		System.out.println(t.country); //shows warning, not a right way to do static
//		System.out.println(t.pincode);
		System.out.println(teacher1.country);
		System.out.println(teacher1.pincode);
		
		teacher1.countrycall();
		teacher1.pin();
		
		t.countrycall();
		
		
	//right way to do static
	
	
//	teacher2.school();
//	teacher2.school1();

}
}
class teacher1 {
	String name;
	int reg;
	static String country ; //no object
	static int pincode ;
	
	public teacher1(String n, int r, String c, int p ) {
		this.name = n;
		this.reg = r;
		this.pincode = p;
		this.country = c;
		
		
		}
	public void name() {
		System.out.println("name called");
	}
	public void regno() {
		System.out.println(12);
	}
	public static void pin() {
		System.out.println(teacher1.pincode);
	}
	public static void countrycall () {
		System.out.println("Nepal");
	}
	}


//right way to do static
//class teacher2 {
//	static String college = "medhavi";
//	static int clsno= 5;
//	
//
//	
//	public static void school() {
//		System.out.println(teacher2.college);
//	}
//	public static void school1() {
//		System.out.println(teacher2.clsno);
//	}
//	
	
	
	
	
	
	
	
	
