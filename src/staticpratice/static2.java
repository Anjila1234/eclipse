package staticpratice;

public class static2 {public static void main(String[] args) {
	
	System.out.println(Math.abs(-10));
	System.out.println(Math.PI);
	System.out.println(Math.E);
	System.out.println(Math.abs(100));
	System.out.println(Math.abs(1.5));
	
	
	bedroom b = new bedroom("Red");
	bedroom c = new bedroom("black");
	bedroom d = new bedroom("blue");
	bedroom e = new bedroom("Re");
	
	bedroom.getcount();
	
	System.out.println(bedroom.count);
	

}

}
 class bedroom {
	static int  count = 0;
	String color ;
	
	public bedroom(String c) {
		this.color = c;
		//bedroom.count = bedroom.count +1;
		bedroom.displaycount();
		
		
	
	}
	public static void getcount() {
		System.out.println(bedroom.count);
		
	}
	public static void displaycount() {
		bedroom.count = bedroom.count + 1;
	}
	
 }