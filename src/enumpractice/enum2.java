package enumpractice;

public class enum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
humanbeing1 h1 = new humanbeing1(human.FAT);

h1.gethuman();

Fruits F = new Fruits (colours.BLUE);
F.getfruits();

rainbow r = rainbow.BLUE;
r.getrainbow();

	}

}

enum human{
	TALL,
	SHORT,
	FAT,
	THIN;
	
}

class humanbeing1 {
	human h ;
	
	public humanbeing1 (human hu) {
		this.h = hu;
	}
	public void gethuman() {
		
		switch (h) {
		case TALL :
			System.out.println("Sampada");
		case FAT :
			System.out.println("Anjila");
			break;
		case SHORT:
			System.out.println("BHagwati");
		case THIN:
			System.out.println("sadiksha");
		
		}
	}
	
	
	
}




enum colours {
	RED,
	WHITE,
	BLUE,
	YELLOW;
}

class Fruits {
	colours c;
	
	public Fruits(colours co) {
		this.c = co;
	}
	public colours getfruits() {
		switch (c) {
		case RED:
			System.out.println("apple");
		
		case WHITE :
			System.out.println("pineapple");
			
		case BLUE:
			System.out.println("berry");
			break;
			
		case YELLOW:
			System.out.println("banana");
			
		}
		return c;
	}
}




enum rainbow {
	RED ("ROSE"),
	BLUE ("MOON"),
	YELLOW ("BANANA");
	private final String name;
	
	private rainbow(String name) {
		this.name = name;
	}
	public void getrainbow() {
		System.out.println("Rainbow goals");
	}
	
	
}
















