package Interface;

public class day2interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OS a1 = new OS ();
		a1.facetime();
		a1.message();
		a1.screenshot();
		a1.photos();
		a1.phonecalls();
		
		makeup anz = new makeup();
		anz.brand();
		anz.color();
		anz.matte();
		anz.waterproof();
		anz.sonata();
	}
}
//one class can implement more than one interface
// we have implemented methos without body
//without constructor
//() - parameter/signature
// {} - body

 interface  android{
	 public void screenshot();
	 public void phonecalls();
 }
	
	 interface iphone {
		 public void message();
		 public void facetime();
	 }
	 
	 interface windows {
		 public void photos();
	 }
	 
	 
class OS implements android, iphone, windows {

	@Override
	public void photos() {
		System.out.println("photos review");
		
	}

	@Override
	public void message() {
		System.out.println("message seen");
		
	}

	@Override
	public void facetime() {
		System.out.println("facetime is on");
		
	}

	@Override
	public void screenshot() {
	System.out.println("screenshot is done");
		
	}

	@Override
	public void phonecalls() {
		System.out.println("phonecalls is on");
		
	}
}

//two interface and third interface extends the previous interface 
//class implement the third interface

interface lipstick {
	public void color();
	public void brand();
}

interface eyeshadow {
	public void waterproof();
	public void matte();
}

interface nailpolish extends lipstick, eyeshadow {
	
	public void sonata();
}


class makeup implements nailpolish {
  public void makeup() {
	  System.out.println("Beautiful");
  }
  
	@Override
	public void color() {
		System.out.println("pink");
		
	}

	@Override
	public void brand() {
		System.out.println("mac");
		
	}

	@Override
	public void waterproof() {
		System.out.println("waterproof yes");
		
	}

	@Override
	public void matte() {
		System.out.println("doesnot shine");
		
	}

	@Override
	public void sonata() {
		System.out.println("red");
		
	}
	
	
	
	
}

















