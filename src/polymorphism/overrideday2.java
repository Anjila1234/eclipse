package polymorphism;

public class overrideday2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Katuwal K = new Katuwal("AK");
System.out.println(K.name);
K.getname();

Pant P = new Pant ();
P.getname();

	}

}
class Katuwal {
	String name;
	
	public Katuwal(String n) {
		this.name = n;
		
	}
	public void getname () {
		System.out.println("Anjila");
}}

class Pant {
	public void getname() {
		System.out.println("Sampada");
	}
}