package singleturn;

public class Day5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
camera.getcamera();
camera.getcamera();
	}

}

class camera {
	
	 static camera  c;
	 private camera() {
		 
	 }
	
	public static camera getcamera() {
		if( c == null) {
			//c = new camera();
			System.out.println("good");
			
		}
		return c;
	}
}