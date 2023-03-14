package interfacepractice;

public class day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sun s = new sun("sindhulibazar", 5, 10);
System.out.println(s.count);
System.out.println(s.shop);
System.out.println(s.sunpower);
s.getbulb();
s.getcandle();
s.getlights();
s.setcandle();
s.setlights();

	}

}

interface lights {
	
	public void getlights();
	public void setlights();
}

interface bulb {
	
	default void getbulb() {
		System.out.println("blub gives light");
	}
}


abstract class candle {
	String shop;
	int count;
	
	public candle (String s, int c) {
		this.count = c;
		this.shop = s;
	}
	abstract void getcandle();
	public void setcandle(){
		System.out.println("candle is lighter");
		
	}
	
	
}

class sun extends candle implements lights, bulb{
int sunpower;
	public sun(String s, int c, int sn) {
		super(s, c);
		this.sunpower = sn;
		System.out.println("sun is more lighter");
	}

	@Override
	public void getlights() {
		System.out.println("lights are necessary");
		
	}

	@Override
	public void setlights() {
		System.out.println("lights are colorful");
		
	}

	@Override
	void getcandle() {
		System.out.println("candles are needed in tihar");
	}
		
		public void getbulb() {
			System.out.println("blub gives light");
		
		
	}}