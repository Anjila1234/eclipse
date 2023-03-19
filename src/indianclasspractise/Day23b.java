package indianclasspractise;
enum subject {
	SOCIAL,
	SCIENCE,
	MATHS,
	NEPALI;
}
public class Day23b {
public static void main(String[] args) {
	grade g = new grade (subject.MATHS);
	System.out.println(g);
	g.getgrade();
	
	subject sa = subject.NEPALI;
	System.out.println(sa);
	
	
}
}
class grade {
	
	subject s;
	
	public grade (subject s) {
		this.s = s;
	}
	public subject getgrade(){
		switch (s) {
		case SOCIAL:
			System.out.println("Social");
		break;
		case SCIENCE:
			System.out.println("science");
			break;
		case MATHS:
			System.out.println("maths");
			break;
		case NEPALI:
			System.out.println("NEPaL");
			
		}
		return s;
	}
}