package staticpratice;

public class day3static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

room.setroom();
System.out.println(room.building);

	}

}

class room {
	
	String color;
	int rent ;
	static String building = "small";
	
	public room(String c, int r){
		this.color = c;
		this.rent = r;
		
	}
	public void getroom () {
		System.out.println(this.color + this.rent);
	}
	static public void setroom () {
		System.out.println(room.building);
	}
}