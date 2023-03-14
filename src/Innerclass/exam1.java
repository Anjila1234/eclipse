package Innerclass;

public class exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 fruits f = new fruits();
System.out.println(f.taste);
  fruits.mango fm= f.new mango ();
  
 vegetables v = new vegetables ("cabbage", "tasty");
  
 vegetables.cauliflower vc = v.new cauliflower ();
	vc.taste();
	vc.gettaste();
	}

}

class fruits {
	String taste = "good";
	
	class mango {
		String color ="yellow";
		int price = 100;
		
		public void getfruits(){
			System.out.println("fruits are tasty");
			
		}
	}
}


class vegetables {
	String vegname;
	String taste;
	
	
	public vegetables(String v, String t) {
		this.vegname = v;
		this.taste = t;
	}
	
	class cauliflower{
		String color ;
		
		public String taste() {
			if(vegetables.this.vegname.equals("cabbage")) {
				this.color = "green";
			}
			return this.color;
		}
		public void gettaste() {
			System.out.println(this.color);
		}
	}
}