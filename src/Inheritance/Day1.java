package Inheritance;

public class Day1 {
	public static void main(String[] args) {
		
	human a = new human("Kalpana Katuwal", 45);
	a.dance();
	a.talk();
		System.out.println(a.fullname);
		System.out.println(a.age);
	}

}

class human {
	String fullname;
	int age;
	
	public human (String fn, int age) {
		this.fullname = fn;
		this.age = age;
	}
	public void dance(){
		System.out.println("I can dance");
	}
	public void talk() {
		System.out.println("I can talk");
	}
}