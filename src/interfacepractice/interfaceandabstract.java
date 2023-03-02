package interfacepractice;

public class interfaceandabstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
		anjila a3 = new anjila("Anjila", 26);
		System.out.println(a3.age);
		System.out.println(a3.firstname);
		a3.save();
		a3.displayname();
		a3.loan();
		a3.son();
	}

}
//one interface 
//one abstract class with constructor and one abstract method and one normal method
//two properties in abstract class
//new class inheritance abstract class implements interface


interface sabnam {
	
	public void save();
	public void loan();
}

abstract class bhagwati {
	String firstname;
	int age;

	
	public bhagwati(String fn, int ag) {
		this.firstname = fn;
		this.age = ag;
		}
	abstract public void son();
	
	public void displayname () {
		System.out.println(this.firstname + this.age);
	}
}

class anjila extends bhagwati implements sabnam {

	public anjila(String fn, int ag) {
		super(fn, ag);
		// TODO Auto-generated constructor stub
		System.out.println("anjila");
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("saving");
	}

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("loan");
	}

	@Override
	public void son() {
		// TODO Auto-generated method stub
		System.out.println("discount");
	}}