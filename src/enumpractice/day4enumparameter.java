package enumpractice;
enum couplegoals{
	ANJILA ("NABARAJ"),
	SAMPADA ("SANJAY"),
	BHAWANA ("GAURAV");
	
	private final String pair;
	private  couplegoals( String p) {
		this.pair = p;
	}
		public String  getcouple() {
			return this.pair;
		}
	

}
public class day4enumparameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


//System.out.println(couplegoals.ANJILA);
couplegoals c[]= couplegoals.values();
for(couplegoals c1 :c) {
	System.out.println(c1.getcouple());
}
	couplegoals cg = couplegoals.SAMPADA;
	System.out.println(cg.getcouple());
	
	couplegoals cg1 = couplegoals.ANJILA;
	System.out.println(cg1.getcouple());
	
	couplegoals cg2 = couplegoals.BHAWANA;
	System.out.println(cg2.getcouple());


	}

}
