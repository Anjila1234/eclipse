package interfacepractice;

public class Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fruits56 m1 = new fruits56 ();
		m1.coke();
		m1.fanta();
		m1.getcosmetic("red", 10);
		m1.pages();
		m1.rice();
		m1.noodles();
	}

}

//two interface with abstract method and defult method
// new interface extends to previous interface
//one abstract class 
//one normal class extends abstract class implements new interface


interface book {
	
	 abstract void pages(); //no body 
	default public void pictures () {
		System.out.println("flowers, letters, person");
		
	}
}

interface drinks {
	
	public void coke();
	abstract void fanta();
}

interface food extends book, drinks {
	
	public void rice ();
	abstract void noodles ();
}
	
abstract class cosmetic {
	String lipstick = "mac";
	int money = 15;
	

abstract public void paycosmetic();

public void getcosmetic(String lip, int mon) {
	this.lipstick = lip;
	this.money = mon;
	System.out.println(this.lipstick + this.money);
}

}
class fruits56 extends cosmetic implements food {

	@Override
	public void pages() {
		// TODO Auto-generated method stub
		System.out.println("page1");
	}

	@Override
	public void coke() {
		// TODO Auto-generated method stub
		System.out.println("coke");
	}

	@Override
	public void fanta() {
		// TODO Auto-generated method stub
		System.out.println("fanta");
	}

	@Override
	public void rice() {
		// TODO Auto-generated method stub
		System.out.println("rice");
	}

	@Override
	public void noodles() {
		// TODO Auto-generated method stub
		System.out.println("noodles");
	}

	@Override
	public void paycosmetic() {
		// TODO Auto-generated method stub
		System.out.println("cosmetic");
	}	
	
}
