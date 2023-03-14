package Innerclass;

public class newpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
anjila a = new anjila ("Anjila", "katuwal");
System.out.println(a.fullname);
System.out.println(a.lastname);

anjila.sadiksha as = a.new sadiksha ("skirt");
System.out.println(as.dress);


	}

}

class anjila {
	String fullname;
	String lastname;
	
	public anjila(String fn, String ln) {
		this.fullname = fn;
		this.lastname = ln;
	}
	class sadiksha {
		String dress;
		
		public sadiksha(String d) {
			this.dress = d;
		}
		
	}
	public void getdress () {
		System.out.println( "sadiksha wants her dress");
	}
}