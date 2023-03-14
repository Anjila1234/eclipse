package Innerclass;

public class day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dress D = new Dress();
System.out.println(D.color);
D.Dresscolor();

Dress.pant DP= D.new pant ();
System.out.println(DP.size);

sofa s = new sofa ();
s.getsofa();




	}

}

class Dress {
	String color = "red";
	
	public void Dresscolor() {
		System.out.println("pink");
	}
	
	class pant {
		String size = "XL";
		
		
	}
	public void Dresscolor1() {
		System.out.println("black");
	}
	
}

class sofa {
	String colour = "brown";
	String size = "XL";
	
	
	public void getsofa() {
		System.out.println("sofa is brown");
	}


protected class Table {
	String colour = "black";
	String size = "small";
	
	


public void gettable() {
	System.out.println("Table is black");
}}
}