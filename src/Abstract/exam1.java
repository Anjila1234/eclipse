package Abstract;



public class exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fruits f = new fruits();
		f.getfruit();

		fruits.mango fm = f.new mango();
		fm.getmango();

		vegetables v = new vegetables ("cabbage", "green");
		System.out.println(v.vname);
		System.out.println(v.color);
		v.getveg(10);
		v.getveg(10, 20);

		anjila a = new anjila ("Anjila","sindhuli");
		System.out.println(a.address);
		System.out.println(a.name);

		a.getname();
		sampada s = new sampada ("Anjila", "sindhuli", "sampada");
		System.out.println(s.name);
		System.out.println(s.fullname);
		System.out.println(s.address);

		anjila1 ak = new anjila1 ("Anjila kc");
		anjila1 al = new anjila1 ("Anjila katuwal");
		 System.out.println(anjila1.count);
		 anjila1.addressno();

		//reverse of Nepal

		String name = "Nepal";
		String rev = "";
		for(int i = 0; i < name.length(); i ++) {
			rev = name.charAt(i) + rev;
			
		}
		System.out.println(rev);
			}

		}
		//inner class from main method
		 class fruits {
			  String fname = "apple";
			 public  void getfruit() {
				 System.out.println(this.fname);
			 }
			 class mango {
				 String color = "red";
			public void getmango () {
				System.out.println(this.color);
			}
			 }
		 }
		 
		 // overloading 
		 //same class, same method, diff sig
		 
		 class vegetables {
			String vname;
			String color;
			
			public vegetables (String v, String c) {
				this.vname = v;
				this.color = c;
			}
			 public void getveg (int x) {
				 System.out.println("vegetables are tasty");
			 }
			 public void getveg(int x, int y) {
				 System.out.println("vegetables are not good");
			 }
		 }
		 
		 // overriding
		 
		// Diff class , same method, same sig
		 
		 class anjila {
			 String name;
			 String address;
			 
			 public anjila (String n, String a) {
				 this.name = n;
				 this.address = a;
				 
			 }
			 
			 public void getname() {
				 System.out.println("anjila learns QA");
			 }
			 
			 }
		 class sampada extends anjila {
		String fullname ;
			public sampada(String n, String a, String s) {
				super(n, a);
				this.fullname = s;
			}
				public void getname() {
					 System.out.println("sampada is studing");	
			}}
			 
		 //count no of objects


		class anjila1 {
			 static int count = 0;
			 String address ;
			 
			 public anjila1(String A) {
				this.address = A;
				//anjila1.count = anjila1.count + 1;
			anjila1.getaddress();
			
				
				
			 }
		 public static void addressno () {
			System.out.println(anjila1.count);
			 }
		  public static void getaddress() {
			 anjila1.count = anjila1.count + 1; 
		 }
		 
		} 
		 
		 
