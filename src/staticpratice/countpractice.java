package staticpratice;

public class countpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 anjila an = new anjila("Panitanki");
 anjila ab = new anjila("Chanautae");
 anjila ac = new anjila("Lampantar");
 anjila ad = new anjila("Biratnagar");
 
 anjila.addressno();
 System.out.println(anjila.count);

	}

}

class anjila {
	 static int count = 0;
	 String address ;
	 
	 public anjila(String A) {
		this.address = A;
		anjila.count = anjila.count + 1;
	//anjila.getaddress();
	
		
		
	 }
 public static void addressno () {
	System.out.println(anjila.count);
	 }
// public static void getaddress() {
//	 anjila.count = anjila.count + 1; 
// }
	
	
}