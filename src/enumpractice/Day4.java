package enumpractice;
enum Trees {
	TALL("pine"),
	SMALL("tea");


private final String gettree;
	
	private Trees(String t) {
		this.gettree = t;
	}
	public String settree() {
		return this.gettree;
	}
}



public class Day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Trees [] T = Trees.values();
	for(Trees Tr :T) {
		System.out.println(Tr.settree());
		//System.out.println(Tr.SMALL);
		
	}
	
Trees Trr = Trees.SMALL;
System.out.println(Trr.settree());

Trees Trrr = Trees.TALL;
System.out.println(Trrr.settree());
}}
