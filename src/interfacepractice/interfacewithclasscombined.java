package interfacepractice;

public class interfacewithclasscombined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface z {
	public void setA();

	public void SetB();
}

interface y {
	public void setc();

	public void setd();
}

class x {
	int x1;
	int x2;

	public x(int x1, int x2) {
		this.x1 = x1;
		this.x2 = x2;
	}

	public void get() {
		System.out.println("get x");
	}
}

class w extends x implements z, y {

	public w(int x1, int x2) {
		super(x1, x2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setc() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setd() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setA() {
		// TODO Auto-generated method stub

	}

	@Override
	public void SetB() {
		// TODO Auto-generated method stub

	}
}