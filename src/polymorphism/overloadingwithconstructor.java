package polymorphism;

public class overloadingwithconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//same method, same class, diff sign
		
		personb p = new personb("ANjila", "katuwal");
		p.talk(10);
		p.talk(5, 6);
	}

}
 class personb {
	 String firstname;
	 String lastname;
	 
	 public personb ( String fn, String ln) {
		 this.firstname = fn;
		 this.lastname = ln;
	 }
	 public void talk( int x1) {
		 System.out.println("I am talking" + x1);
	 }
	 public void talk (int x2, int x3) {
		 System.out.println( x2 + x3);
	 }
	 
 }