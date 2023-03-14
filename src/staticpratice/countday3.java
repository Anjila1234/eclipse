package staticpratice;

public class countday3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
apple a = new apple("round");
apple b = new apple ("rectangle");
apple c = new apple ("square");

System.out.println(apple.count);



	}

}

class apple{
	
	String shape;
	static int count = 0;
	
	public apple(String s){ 
		this.shape = s;
		apple.count = apple.count + 1;
	setcount();
		
	}
	public void getcount() {
		System.out.println(apple.count);
	}
	
	public void setcount() {
		apple.count = apple.count + 1;
	}
}