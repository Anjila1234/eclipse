
public class getterandsetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		car a = new car();
//		System.out.println(a.brand);
//		System.out.println(a.color);
//		System.out.println(a.regno);
		
		a.setbrand("toyato");
		a.setcolor("red");
		a.setregno(122);
		
		System.out.println(a.brand);
		System.out.println(a.color);
		System.out.println(a.regno);
	}

}


class car {
	String color ;
	String brand ;
	int regno ;
	
	
	public void setcolor(String c) {
		this.color = c;
		
	}
	public void setbrand(String b) {
		this.brand = b;
	
	}
	public void setregno(int r) {
		this.regno = r;
		
	}
}