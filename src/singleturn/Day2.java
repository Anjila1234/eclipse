package singleturn;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
book.getbook();
book.getbook();
book.getbook();
	}

}
class book {
	static book b;
	
//	private book () {
		
//	}
	public static book  getbook () {
		if(b == null) {
			System.out.println("Hello world");
			b = new book();
			
		}
		return b;
		
	}
}