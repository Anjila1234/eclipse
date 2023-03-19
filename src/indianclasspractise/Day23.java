package indianclasspractise;
enum colors {
	
	RED,
	YELLOW,
	GREEN,
	BLUE;
	
}
public class Day23 {
	public static void main(String[] args) {
		
	colors c = colors.BLUE;	
	
	//System.out.println(c);
	
	System.out.println(colors.GREEN);
	
	housecolor h = new housecolor ("Tall");
	System.out.println(h);
	h.displaycolor();
System.out.println(h.building);

		
	}

}

class housecolor {
	String building ;
	public  housecolor(String b) {
		this.building = b;
		
		}
	
	public void displaycolor() {
		System.out.println(this.building);
	}
	
}