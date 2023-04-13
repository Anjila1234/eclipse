package polymorphism;

public class Overloading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pokharel P = new Pokharel("Nabaraj");
System.out.println(P.name);

P.getname();
P.getname(50, 20);
P.getname(10);

	}

}
class Pokharel {
	String name;
	
	public Pokharel(String n) {
		this.name = n;
		
	}
	public void getname() {
		System.out.println("NK");
		
	}
	public void getname(int x) {
		System.out.println("KK");
	}
	public void getname(int x, int y) {
		System.out.println("LK");
	}
}