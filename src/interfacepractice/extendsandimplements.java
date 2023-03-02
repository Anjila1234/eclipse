package interfacepractice;

public class extendsandimplements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	fruits a1 = new fruits("red",4, "round"  )	;
	System.out.println(a1.color);
	System.out.println(a1.shape);
	System.out.println(a1.size);
	a1.color();
	a1.displaycolor();
	a1.displaysize();
	a1.getcolor();
	a1.getshape();
	a1.gettaste();
	a1.taste();
		
	}

}

//two interface one abstract 
//class extends abstract class implements interface
// abstract class has constructor, abstract method and normal method
interface apple {
	public void taste() ;
	public void color ();
	}

interface mango {
	public void gettaste();
	public void getcolor();
}

abstract class banana {
	String color;
	int size;
	
	public banana(String c, int s) {
		this.color = c;
		this.size = s;
	}
	 abstract public void displaysize() ;
		
	 public void displaycolor() {
		 System.out.println(this.color + this.size);
	 }
		}

class fruits extends banana implements apple, mango {
String shape;
	public fruits(String c, int s, String sh) {
		super(c, s);
		this.shape = sh;
		}

	public void getshape() {
		System.out.println(this.shape);
	}
	
	@Override
	public void gettaste() {
		// TODO Auto-generated method stub
		System.out.println("tasty");
		
	}

	@Override
	public void getcolor() {
		// TODO Auto-generated method stub
		System.out.println("red");
	}

	@Override
	public void taste() {
		// TODO Auto-generated method stub
		System.out.println("bitter");
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("yellow");
	}

	@Override
	public void displaysize() {
		// TODO Auto-generated method stub
		System.out.println("small");
	}
	
}
