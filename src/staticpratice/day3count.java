package staticpratice;

public class day3count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
fruit f = new fruit("apple");
fruit f1 = new fruit("mango");

System.out.println(fruit.count);
fruit.getfruit();


}}
class fruit {
	String apple;
	static int count = 0;
	
	
	
	public fruit(String a) {
		this.apple = a;
	//fruit.count = fruit.count +1;
		setfruit ();
		
	}
	public static void getfruit() {
		System.out.println(fruit.count);
		
		
	}
	public static void setfruit() {
		fruit.count = fruit.count +1;
	}
}