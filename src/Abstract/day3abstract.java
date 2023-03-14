package Abstract;

public class day3abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
waterglass g = new waterglass("small", "round");
System.out.println(g.shape);
System.out.println(g.size);
g.getglass();
g.displayglass();
	}

}

abstract class glass {
	
	String size;
	String shape;
	
	public glass (String s, String sh) {
		this.size = s;
		this.shape = sh;
	}
	abstract void getglass();
	public void setglass() {
		System.out.println(this.shape + this.size);
	}
}

class waterglass extends glass{

	public waterglass(String s, String sh) {
		super(s, sh);
		System.out.println(this.shape + this.size);
	}

	@Override
	void getglass() {
		System.out.println("glass is expensive");
		
	}
	public void displayglass () {
		System.out.println("glass is cheap");
	}
	
}




