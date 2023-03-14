
public class exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
fruits f = new fruits();


	}

}
interface mango{
	
	abstract void taste();
	abstract public void color();
	
	}

interface orange {
	default void shape() {
		System.out.println("round");
	}
}


 abstract class apple {
	 
	 abstract void price();
	 public void city() {
		 System.out.println(" available in sindhuli");
	 }
 }
 class fruits1 extends apple implements mango, orange{

	@Override
	public void taste() {
		// TODO Auto-generated method stub
		System.out.println("bitter");
		
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("red");
		
	}

	@Override
	void price() {
		// TODO Auto-generated method stub
		System.out.println(10);
		
	}
	
	public void shape() {
			System.out.println("round");
		}}