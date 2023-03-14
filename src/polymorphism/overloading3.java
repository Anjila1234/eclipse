package polymorphism;

public class overloading3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
tissue t = new tissue();
t.gettissue(10);
t.gettissue(10, 20);

basket b = new basket("grey", "square");
System.out.println(b.color);
System.out.println(b.shape);
b.getbasket();
b.getbasket(10);





//overloading - same class ,  same method , different signature
}}
class tissue {
	public void gettissue(int x) {
		System.out.println("tissue is white");
	}
	
	public void gettissue(int x, int y) {
		System.out.println("tissue is grey");
	}
}

class basket {
	String color;
	String shape;
	
	public basket(String s, String sh) {
	this.color = s;
	this.shape = sh;
	}
	public void getbasket(int x) {
		System.out.println("Basket is full" + 1);
	}
	public void getbasket() {
		System.out.println("Basket is empty");
	}
}