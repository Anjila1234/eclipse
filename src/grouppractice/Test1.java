package grouppractice;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}

}

// 2 interface class - with constructor// 
// 1 abstract class and extend
//implements

interface zorba {
	
	public void student1();
	abstract void student2();
	default void getstudent() {
		System.out.println("No of students");
	}}
	
	interface ITcourse {
		
		public void getno ();
		
		}
	
	interface IT extends zorba, ITcourse { 
		
	}
	
	abstract class namestudent {
		String fullname;
		int rollno;
		public namestudent (String fn, int r) {
			this.fullname = fn;
			this.rollno = r;
		}
	
		abstract void getname();
		public void getnumbers(){
			System.out.println(this.fullname + this.rollno);
		}
	
	}
	
class school extends namestudent implements IT {

	public school(String fn, int r) {
		super(fn, r);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void student1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void student2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getno() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void getname() {
		// TODO Auto-generated method stub
		
	}
	public void getstudent() {
		System.out.println("students");
	}
	
}