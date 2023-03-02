package interfacepractice;

public class withconstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

NepalPbank a3 = new NepalPbank ("Anjila", 25);
System.out.println(a3.alcname);
System.out.println(a3.alcno);

a3.deposit();
a3.discount();
a3.withdraw();
a3.save();

	}

}

interface Nepalbank12 {
	
	public void save();
	public void discount ();
	
}

interface privatebank {
	
	public void withdraw();
	public void deposit ();
	
}

class NPbank {
	String alcname;
	int alcno;
	
	public NPbank(String an, int ano) {
		this.alcname = an;
		this.alcno = ano;
	}
}

class NepalPbank extends NPbank implements privatebank, Nepalbank12{

	public NepalPbank(String an, int ano) {
		super(an, ano);
		System.out.println(this.alcname + this.alcno);
	}

	@Override
	public void save() {
		System.out.println("saving method");
		
	}

	@Override
	public void discount() {
		System.out.println("discount method");
		
	}

	@Override
	public void withdraw() {
	System.out.println("withdrawn process");
		
	}

	@Override
	public void deposit() {
		System.out.println("deposited cash");
		
	}}