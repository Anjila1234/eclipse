package interfacepractice;

public class twointerfaceewithoutcon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nicasia a1 = new nicasia();
		a1.deposit();
		a1.discount();
		a1.loan();
		a1.save();
		a1.withdraw();
	}

}

interface laxmibank {

	public void save();

	public void loan();

	public void discount();
}

interface siddharthabank {
	public void withdraw();

	public void deposit();

}

class nicasia implements laxmibank, siddharthabank {

	@Override
	public void withdraw() {
		System.out.println("withdrawn cash");

	}

	@Override
	public void deposit() {
		System.out.println("deposited cash");

	}

	@Override
	public void save() {
		System.out.println("saving balance");

	}

	@Override
	public void loan() {
		System.out.println("loan department");

	}

	@Override
	public void discount() {
		System.out.println("discounted amount");

	}
}