package grouppractice;

public class Tryandcatch {
	public static void main(String[] args) {
		//normal
		int x = 20;
		int y = 0;
	
		
		
		try {
			System.out.println(x/y);
		}
		catch (ArithmeticException e){
			System.out.println("right");
		}
		
		finally {
			System.out.println("It will run");
		}
		
		//
		
	}

}
