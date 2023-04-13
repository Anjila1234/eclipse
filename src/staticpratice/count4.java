package staticpratice;

public class count4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
bottles b = new bottles ("purified water");
bottles b1 = new bottles ("Filtered water");
bottles.getbottles();
System.out.println(bottles.count);

	}

}

class bottles {
	String mineralwater;
	
	static int count = 0;
	
	public bottles (String m) {
		this.mineralwater = m;
		//count = count + 1;
		displaybottles();
	}
	public static void getbottles () {
		System.out.println(count);
	}
	public static void displaybottles () {
		count = count + 1;
	}
}