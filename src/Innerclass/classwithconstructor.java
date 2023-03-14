package Innerclass;

public class classwithconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Truck T = new Truck("red","ATV" );
System.out.println(T.color);
System.out.println(T.model);

Truck.TypeEngine TT = T.new TypeEngine();
TT.size();
TT.getengine();

	}

}

class Truck {
	
	String color;
	String model;
	
	public Truck (String c, String m) {
		this.color = c;
		this.model = m;
	}
	
	class TypeEngine  {
		String engine ;
		
		// outer class property inside inner class
		public String size() {
			if(Truck.this.color.equals("red")) {
				this.engine = "long lasting";
			}
			 else if(Truck.this.color.equals("white")){
				this.engine = "durable";
			}
			 else {
				 this.engine = "unsure";
				 
			 }
			 
			 return this.engine;
		}
		public void getengine() {
			System.out.println(this.engine);
			
		}
	
}}