package Innerclass;

public class staticinnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sampada s = new sampada("black");
sampada.bhagwati sb= new sampada.bhagwati();
sb.displayhair();


sampada.anjilaa sa = s.new anjilaa ();
	}

}

class sampada {
	String hair;
	
	public sampada (String h) {
		this.hair = h;
	}
	public void displaycolor() {
		System.out.println("black");
	}
	
	static class bhagwati {
		public void displayhair() {
			System.out.println("brown");
		}
	}

	class anjilaa {
		public void displayc () {
			System.out.println("grey");
		}
	}
}
