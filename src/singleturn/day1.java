package singleturn;

public class day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
fruits f = new fruits();
fruits.getfruits();
fruits.getfruits();

vegetables v = new vegetables();
vegetables.getveg();
vegetables.getveg();
	}

}

class fruits {
	
	private static fruits f ;
	
	public static fruits getfruits() {
		if(f == null) {
			System.out.println("Hy");
			f = new fruits ();
		}
		return f;
		
		
	}
}

class vegetables {
	private static vegetables v;
	
	public static vegetables getveg() {
		if(v == null) {
			v = new vegetables ();
			
		}
		return v;
	}
}