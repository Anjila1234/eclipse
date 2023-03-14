package indianclasspractise;

public class Day20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//photograph p = new photograph(); //not allowed to call object

		photograph.getphoto();
	}

}

class photograph {
	
	String color = "red";
	static photograph p;
	
	private photograph() {
		
	}
	public static photograph getphoto() {
		if(p == null) {
			System.out.println("hy");
		  p = new photograph();
			
		}
		return p;
	}
}