package string.java;

public class day16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
calculator x = new calculator();
		x.add(10, 10);
		x.sub(50, 40, 30);
		x.multiple(5, 10, 50, 10);
		
		calculator1 a = new calculator1();
		calculator1 b = new calculator1(10);
		calculator1 c = new calculator1(10, 10);
		calculator1 d = new calculator1(10, 10, 10);
		calculator1 e = new calculator1(10, 10,10,10);
		
		nicbank a1 = new nicbank("Anjila", 2525, 10);
		banijyabank a2 = new banijyabank("Nabaraj", 2626, "bishalbazar");
		a1.loan(50);
		a1.saving(50);
		a2.loan(50);
		a2.saving(10);
		
	}

}
 class calculator{
	 
	 
	 public void add(int a, int b) {
		 System.out.println(a + b);
	 }
	 public void sub(int a, int b, int c) {
		 System.out.println(a - b - c);
	 }
	 public void multiple(int a, int b, int c, int d) {
		 System.out.println(a + b + c + d);
	 }
 }
 
 class calculator1{
	 
	 public calculator1() {
		 System.out.println("default");
	 }
	 public calculator1(int x) {
		 System.out.println("one parameter");
		 
	 }
	 public calculator1(int x, int y) {
		 System.out.println("Two parameter");
	 }
	 public calculator1(int x, int y, int z) {
		 System.out.println("Three parameter");
	 }
	 public calculator1(int a, int b, int c, int d) {
		 System.out.println("four parameter");
	 }
 }
 class civilbank{
	 String accname;
	 int accno;
	 
	 public civilbank( String an, int ano) {
		 this.accname = an;
		 this.accno = ano;
	 }
	 public void loan(int x) {
		 System.out.println("civilbank : Home loan is" + x);
	 }
	 public void saving(int y) {
		 System.out.println("civilbank : saving is"+ y );
		 
	 }
 }
 class nicbank extends civilbank{
int pincode;
	public nicbank(String an, int ano, int pn) {
		super(an, ano);
		this.pincode = pn;
	}
	public void loan(int x) {
		System.out.println("nic: Homeloan is" + x);
		super.loan(10);
	}
	public void saving(int y) {
		System.out.println("nic:Saving is" + y);
		super.saving(50);
	}
 }
 class banijyabank extends civilbank{
String branchname;
	 public banijyabank(String an, int ano, String bn) {
		super(an, ano);
		this.branchname = bn;
	}
	 public void loan(int x) {
		 System.out.println("banijyabank: Homeloan is" + x);
		 super.loan(10);
	 }
	 public void saving (int y) {
		 System.out.println("banijyabank: saving is" + y);
		 super.saving(20);
	 }

 }