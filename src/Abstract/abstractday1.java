package Abstract;

public class abstractday1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//without constructor
		// abstract
		// single hirarchy
		Banijyabank a1 = new Banijyabank();
		a1.loan();
		a1.save();
		a1.bankcity("pokhara");

		chasebank a2 = new chasebank("Kathmandu", 55, 66);
		System.out.println(a2.branchcode);
		System.out.println(a2.city);
		System.out.println(a2.pincode);
		a2.displaycity();
		a2.saving();
		a2.loanrate();
	}

}

abstract class Nepalbank {

	abstract void save();

	abstract void loan();

	public void bankcity(String city) {
		System.out.println(city);

	}
}

class Banijyabank extends Nepalbank {

	@Override
	void save() {
		// TODO Auto-generated method stub
		System.out.println("saving rate is " + 5);

	}

	@Override
	void loan() {
		// TODO Auto-generated method stub
		System.out.println("loan rate is" + 4);
	}
}

// with constructor
// abstract

abstract class worldbank {
	String city;
	int pincode;

	public worldbank(String cty, int pn) {
		this.city = cty;
		this.pincode = pn;
	}

	abstract public void loanrate();

	abstract public void saving();

	public void displaycity() {
		System.out.println("kathmandu");
	}
}

class chasebank extends worldbank {
	int branchcode;

	public chasebank(String cty, int pn, int bn) {

		super(cty, pn);
		this.branchcode = bn;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void loanrate() {
		// TODO Auto-generated method stub
		System.out.println("loan rate is" + 10);
		super.displaycity();
	}

	@Override
	public void saving() {
		// TODO Auto-generated method stub
		System.out.println("saving is" + 10);
		super.displaycity();
	}

}
