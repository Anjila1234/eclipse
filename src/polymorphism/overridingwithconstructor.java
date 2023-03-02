package polymorphism;

public class overridingwithconstructor {
	public static void main(String[] args) {
	
	person3 p3 = new person3("Anjila kc", 25)	;
	System.out.println(p3.fullname);
	System.out.println(p3.age);
	p3.walking();
	
	
	person4 p4 = new person4("Anjila kc", 25);
	p4.walking();
	}

}

//different class, same method, same sign

class person3 {
	String fullname;
	int age;

	public person3 (String fn, int age){
		this.fullname = fn;
		this.age = age;
			
		
}
	public void walking() {
		System.out.println("I am walking");
	}
}

class person4 extends person3{

	public person4(String fn, int age) {
		super(fn, age);
		// TODO Auto-generated constructor stub
		System.out.println(this.fullname + this.age);
	}


	public void walking() {
		System.out.println("I am walking");
	}
	
}