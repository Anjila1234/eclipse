package Innerclass;

public class day5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
rivers r = new rivers ("seti khola");
System.out.println(r.name);
r.getrivers();

rivers.seti rs = r.new seti ();
rs.getseti();

	}

}


class rivers {
	
	String name;
	
	public rivers (String n) {
		this.name = n;
	}
	public void getrivers() {
		System.out.println("Gadauli");
	}
	
	class seti {
		
		public void getseti() {
			System.out.println("Pokhara");
		}
	}
}