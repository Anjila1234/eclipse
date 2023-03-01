package Inheritance;

public class privatejava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// access modifier
		humanworld a = new humanworld ();
		a.humantwo();
	}

}
 class humanworld{
	 private int age = 15;
	 private String fullname = "kalpana kc";
	 
	 private void humanone() {
		 System.out.println(this.age + this.fullname);
	 }
	public void humantwo() {
		this.humanone();
	}
	
	 
 }