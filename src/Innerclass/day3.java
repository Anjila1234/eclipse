package Innerclass;

public class day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Flag F = new Flag("Tringle");
F.shape();


Flag.Nepal FN = F.new Nepal();
System.out.println(FN.size);
FN.getshape();

FN.getshape1();
	}

}

class Flag {
	String shape;
	
	public Flag(String s) {
		this.shape = s;
	}
	
	public void shape() {
		System.out.println("Rec");
	}
	
	class Nepal {
		String size;
	public String getshape() {
		if(Flag.this.shape.equals("Tringle")) {
			this.size = "small";
		}
	
	else if (Flag.this.shape.equals("Rectangle")) {
		this.size = "large";
	}
	else {
		this.size = "default";
	}
	return this.size;
	}
	public void getshape1() {
		System.out.println(this.size);
	}
}}