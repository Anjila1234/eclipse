package grouppractice;

public class Test2overrideoverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
school1 s1 = new school1();
s1.call();
s1.call1(10, 110);

school2 s2 = new school2("siddhasthali", 15);
s2.displayname();
}
	}


//overloading - without constructor
class school1 {
	
	public void call() {
		System.out.println("blank");
	}
	public void call1(int x, int y) {
		System.out.println("blank two");
	}
	
}

//with constructor
class school2 {
	String name;
	int classno; 
	public school2(String n, int c) {
		this.name = n;
		this.classno = c;
		
	}
	public void displayname () {
		System.out.println(this.classno + this.name);
	}
	
}