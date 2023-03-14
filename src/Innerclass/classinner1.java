package Innerclass;

public class classinner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
food f = new food();
System.out.println(f.price);

food.rice r= f.new rice ();
System.out.println(r.color);
System.out.println(r.quality);
r.fooditem();

food.wheat w = f.new wheat();
System.out.println(w.color);
System.out.println(w.quality);
w.fooditem();

	}

}

class food {
	
	int price = 500;
	
	class rice {
		String color = "rice";
		String quality = "good";
		
		public void fooditem(){
			System.out.println("Food is good");
			
		}
	}
	
	class wheat{
		String color = "brown";
		String quality = "not good";
		
		public void fooditem() {
			System.out.println("wheat is not good ");
		}
	}
}