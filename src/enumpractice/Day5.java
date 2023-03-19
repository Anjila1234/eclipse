package enumpractice;

public class Day5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
festiveseason f = new festiveseason (festival.KRISHNASTAMI);
f.getfestival();
festival fes[] = festival.values();

for(festival fe : fes) {
	System.out.println(fe);
	System.out.println(fe.ordinal());
}
festivename fn = new festivename();
festival fa = festival.KRISHNASTAMI;
fn.getfestive(fa);
	}

}
enum God {
	GANESH,
	SHIVA,
	RAM,
	KRISHNA;



}
enum festival{
	SHIVARATRI,
	RAMNAWAMI,
	KRISHNASTAMI;
	
}
class festiveseason {
	
	festival festive ;
	public festiveseason (festival f) {
		this.festive = f;
	}
	public void getfestival () {
		switch (festive) {
		case SHIVARATRI :
			System.out.println("Shiva puja");
		case RAMNAWAMI :
			System.out.println("Ram puja");
		case KRISHNASTAMI :
			System.out.println("Krishna puja ");
			
	}
	
}}

class festivename {
	public festivename () {
	
	}
		public void getfestive (festival fa) {
	
	if (fa == festival.SHIVARATRI) {
		System.out.println("shivaratri puja");
	}
		
		else if (fa == festival.RAMNAWAMI) {
			System.out.println("Ram puja");
		}
			else if (fa == festival.KRISHNASTAMI ) {
				System.out.println("krishna puja");
			}
			else
				System.out.println("none");
		}
	
}