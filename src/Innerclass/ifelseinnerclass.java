package Innerclass;

public class ifelseinnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
father f = new father ("kurtha");
father.daughter d = f.new daughter ();
//f.getfather();
//d.displaydress();
System.out.println(d.displaydress());


	}

}
class father {
	String dress ;
	
	public father(String d) {
		this.dress = d;
	}
	public void getfather() {
		System.out.println(this.dress);
	}
	
	class daughter {
		String color;
		
		public String displaydress() {
			if(father.this.dress.equals("kurtha")) {
			this.color = "black";
			}
			else if (father.this.dress.equals("Model")) {
				this.color = "purple";
				
			}
			else {
				this.color = "default";
			}
			return this.color;
		}
//		public void getdress () {
//			System.out.println(this.displaydress());
//	}
	
	}
}