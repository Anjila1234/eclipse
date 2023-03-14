package grouppractice;

public class Day1mixed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
flower f = new flower ("red", 5) ;

System.out.println(f.color);
System.out.println(f.piece);
f.getflower();

rose r = new rose (10);
System.out.println(r.price);
r.getflower();


anze an = new anze();
an.getname(10);

	}

}


//overriding 
//same method, diff class, same signature

class flower {
	
	String color;
	int piece;
	
	public flower(String c, int co) {
		this.color = c;
		this.piece = co;
		
	}
	public void getflower() {
		System.out.println(this.color + this.piece);
	}
	
	
	
}
class rose {
int price;

public rose (int p) {
	this.price = p;
}
public void getflower() {
	System.out.println(this.price);
}
}


//overloading 
//same class, same method, diff sign


class anze {
	String name = "anjila";
	
	
	public static void getname (int x) {
		System.out.println("ANJILA KC");}
		
		public static void getname (int x, int y) {
			System.out.println("Kc Anjila");
		}
	
}




















