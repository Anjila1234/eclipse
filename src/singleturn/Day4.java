package singleturn;

public class Day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
human.gethuman();
human.gethuman();

bird.getbird();
bird.getbird();

animal.getanimal();
animal.getanimal();
		
	}

}

class human {
	static  human ba;
	private human () {
		
	}
	public static human gethuman (){
		if(ba == null) {
			System.out.println("anjila");
			ba = new human ();
		}
		return ba ;
			
	}
}



class animal {
	
	static animal a;
	
	private animal() {
		
	}
	public static animal getanimal (){
		if(a == null) {
			System.out.println("animal");
			a= new animal();
			
			
		}
		return a;
	}
}



class bird {
	static bird b ;
	
	private bird () {
		
		
	}
	public static bird getbird () {
		if(b == null) {
			System.out.println("parrot");
			b = new bird ();
		}
		return b;
	}
}