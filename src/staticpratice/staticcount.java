package staticpratice;

public class staticcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		bottles1 b = new bottles1 ("purified water");
		bottles1 b1 = new bottles1("filtered water");
		System.out.println(bottles1.count);

		bottles1.getbottles();
	}

}

//class bottles1 {
//	
//	String name;
//	static int count = 0;
//	
//	public  bottles1 (String n) {
//		this.name = n;
//		bottles1.count =bottles.count  + 1;
//		displaybootles();
//		
//		
//	}
//	public static void getbottles () {
//		System.out.println(count);	
//	}
//	public static void displaybootles() {
//		bottles.count = bottles.count + 1;
//	}
//}


class bottles1 {
	
	String name;
	static int count = 0;
	
	public  bottles1 (String n) {
		this.name = n;
		//count =count  + 1;
		displaybootles();
		
		
	}
	public static void getbottles () {
		System.out.println(count);	
	}
	public static void displaybootles() {
		count = count + 1;
	}
}