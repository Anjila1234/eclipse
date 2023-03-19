package enumpractice;
enum fiveorgans {
	EAR,
	NOSE,
	TONGUE,
	EYE,
	SKIN;
}
public class ifelseday2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
organs o = new organs ();
fiveorgans fo = fiveorgans.NOSE;

o.getorgans(fo);

fiveorgans f1[]=fiveorgans.values();
for(fiveorgans f2 :f1) {
	//System.out.println(f2);
	System.out.println(f2.ordinal());

	for(int i = 0; i< f1.length ; i++) {
		System.out.println(f1[i]);
	}
	
}

	}

}

class organs {
	
	public organs () {
		
	}
	public void getorgans(fiveorgans f) {
		if(f == fiveorgans.EAR) {
			System.out.println("hear");
		}
		else if (f == fiveorgans.EYE) {
			System.out.println("see");
		}
		else if (f == fiveorgans.NOSE) {
			System.out.println("smell");
		}
		else if (f == fiveorgans.SKIN) {
			System.out.println("feel");
		}
		else if ( f == fiveorgans.TONGUE) {
			System.out.println("taste");
		}
		else {
			System.out.println("nothing");
		}
	}
}