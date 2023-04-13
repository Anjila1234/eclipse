package Abstract;

public class abstractday3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hershey H = new Hershey ("Hershey", 3, "brown");
		System.out.println(H.chocolatename);
		System.out.println(H.color);
		System.out.println(H.number);
		H.displaychocolates();
	}}


		abstract class chocolates {
			String chocolatename;
			int number;
			
			public chocolates(String c, int n) {
				this.chocolatename = c;
				this.number = n;
			}
			public void getcholates() {
				System.out.println(this.chocolatename + this.number);
				
			}
			abstract void displaychocolates () ;
			}
		


class Hershey extends chocolates {
String color;
	public Hershey(String c, int n, String cn) {
		super(c, n);
		this.color = cn;
		// TODO Auto-generated constructor stub
		System.out.println(this.chocolatename + this.color + this.number);
	}

	@Override
	void displaychocolates() {
		System.out.println("chocolate is love");
		
	}
}
		
