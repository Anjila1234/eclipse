package staticpratice;

public class count2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
name n = new name ("Anjila");
name n1 = new name ("sampada");
System.out.println(name.count);
name.getname();

name2 n2 = new name2 ("Anjila", 5);
System.out.println(n2.fullname);
System.out.println(name2.no);
name2.getname2();
	}

}


class name {
	String fullname ;
	static int count = 0;
	
	public name (String fn) {
		this.fullname = fn;
		//name.count = name.count + 1;
		setname();
	}
	public static void getname() {
		System.out.println(name.count);
	}
	public static void setname () {
		name.count = name.count + 1;
	}
}


class name2 {
	String fullname;
	static int no;
	
	public name2 (String fn, int n) {
		this.fullname = fn;
		this.no= n;
	}
	static void getname2 () {
		System.out.println("name2 is here");
	}
}