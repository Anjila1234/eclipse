package staticpratice;

public class nullvaluestatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
bag.getbag();

bag b = new bag ();
bag.getbag();
	}

}
class bag {
	
	String bagcolor = "red";
	 static bag b;
	 
public bag() {
		
	 }
	public static bag getbag() {
		if(b == null) {
			System.out.println("new bag ");
			b = new bag ();
		}
		return b;
	}
}