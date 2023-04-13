package interfacepractice;

public class withoutconstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Banijya a6 = new Banijya();
		a6.discount(10);
		a6.loan(15);
		a6.save(5);
	}

}

//interface doesnot have body
// we cannot create object
interface Nepalbank {

	public void save(int x);

	public void discount(int y);

	public void loan(int z);

}

class Banijya implements Nepalbank {

	@Override
	public void save(int x) {
		System.out.println("Saving method" + x);

	}

	@Override
	public void discount(int y) {
		System.out.println("discount method" + y);

	}

	@Override
	public void loan(int z) {
		System.out.println("loan method" + z);

	}
}

class agriculturebank implements Nepalbank {

	@Override
	public void save(int x) {
		System.out.println("agriculture saving method" + x);

	}

	@Override
	public void discount(int y) {
		System.out.println("agruculture discount method " + y);

	}

	@Override
	public void loan(int z) {
		System.out.println("agriculture loan method" + z);

	}
}