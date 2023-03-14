package interfacepractice;

public class defaultmethodoverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
vegetables5 v = new vegetables5 ("brown");
System.out.println(v.color);
v.getflower();
v.getleaf();
v.gettaste();

veg vn = new veg ("brown", "small");
System.out.println(vn.color);
System.out.println(vn.size);
vn.displaysize();
vn.getflower();
vn.getleaf();
vn.gettaste();
	}

}
//interface with abstract method and two default method
//class implements interface and class has methods
interface cauliflower {
	
	abstract public void gettaste();
	default void getleaf() {
		System.out.println("green");
	}
	default void getflower() {
		System.out.println("white");
	}
}

class vegetables5 implements cauliflower {
String color;

public vegetables5 (String co) {
	this.color = co;
}
	@Override
	public void gettaste() {
		// TODO Auto-generated method stub
		System.out.println("It is tasty");
		
		
	}
	public void getleaf() {
		System.out.println("green1");
	}
	public void getflower() {
		System.out.println("white1");
	}
}

class veg extends vegetables5 {
String size;
	public veg(String co, String size) {
		super(co);
		this.size = size;
		// TODO Auto-generated constructor stub
		
	}
	public void displaysize() {
		System.out.println("small");
	}
}



