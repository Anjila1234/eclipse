package accessmodifier;

public class privateaccessmodifier1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
anze b = new anze();

sam s = new sam();
System.out.println(s.b1);
s.getb1();

	}

}

class anze {
	private int a1 ;
	private void geta1() {
		System.out.println("a1 value");
	}
}

class sam {
	int b1;
	
	 void getb1() {
		System.out.println("b1 value");
	}
}


