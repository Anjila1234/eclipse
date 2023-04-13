package Inheritance;

public class multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gfather gfn = new gfather("Ratna", "katuwal");
		System.out.println(gfn.gfirstname);
		System.out.println(gfn.glastname);
		gfn.displaygname();

		father fn = new father("Ratna", "katuwal", "pradip");
		System.out.println(fn.ffirstname);
		System.out.println(fn.gfirstname);
		System.out.println(fn.glastname);
		fn.displaygname();

	}

}

class gfather {
	String gfirstname;
	String glastname;

	public gfather(String gf, String gl) {
		this.gfirstname = gf;
		this.glastname = gl;
	}

	public void displaygname() {
		System.out.println(this.gfirstname + this.glastname);
	}
}

class father extends gfather {
	String ffirstname;

	public father(String gf, String gl, String ff) {
		super(gf, gl);
		this.ffirstname = ff;
		System.out.println(this.ffirstname + this.glastname);
	}
}

class son extends father {
	String sname;

	public son(String gf, String gl, String ff, String sn) {
		super(gf, gl, ff);
		this.sname = sn;
		System.out.println(this.sname + this.glastname);
	}

}