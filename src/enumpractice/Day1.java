package enumpractice;
enum tshirt1 {
	small, large, medium, xl;
	
}
public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(tshirt1.small);
Nepaltshirt NT = new Nepaltshirt(tshirt1.large);
NT.getTshirt();


	}

}

class Nepaltshirt {
	
	tshirt1 ts ;
	
	public Nepaltshirt ( tshirt1 t) {
		this.ts = t;
	}

public void getTshirt () {
	switch (ts) {
	case small:
		System.out.println("small tshirt");
		break;
		
	case large:
		System.out.println("large tshirt");
		break;
	case medium :
		System.out.println("medium tshirt");
		break;
	case xl :
		System.out.println("xl tshirt");
		
		
	
	}}
}



