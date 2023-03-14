package Innerclass;

public class withconstructorday2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
makeup M = new makeup("eyeliner", "high");
System.out.println(M.product);
System.out.println(M.quality);

makeup.lipstick L = M.new lipstick() ;
L.getmakeup();
L.setmakeup();
}
	}


//outer class property to inner class property
class makeup {
	
	String product;
	String quality;
	
	public makeup(String p, String q) {
		this.product = p;
		this.quality = q;
		
	}
	class lipstick {
		String color ;
		
		public String getmakeup() {
			if(makeup.this.product.equals("eyeliner")) {
				this.color = "red";
			}
			else if (makeup.this.product.equals("eyeshadow")) {
				this.color = "brown";
			}
			else{
				this.color = "none";
			}
			return this.color;
		}
	
	public void setmakeup() {
		System.out.println(this.color);
	}
}}