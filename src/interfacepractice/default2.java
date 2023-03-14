package interfacepractice;

public class default2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
interface student1 {
	
	default void s1() {
		System.out.println("sing");
	}
  default void s2() {
	  System.out.println("dance");
  }
  abstract void s3();
	}

	
class student2 implements student1 {

	@Override
	public void s3() {
		System.out.println("sing");
		
	}}