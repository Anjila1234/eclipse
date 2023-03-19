package enumpractice;

public class Day6 {
	public static void main(String[] args) {
	anjilabed a = new anjilabed (bed.bedsheet);
	a.getbed();
	sampadabed sa = new sampadabed(bed.cusion);
  bed b = bed.cusion;
  System.out.println(b);
  

	}

}

enum bed {
	pillow,
	bedsheet,
	cusion;
	
	
}

class anjilabed {
	
	  bed anzebed ;
	
	public anjilabed(bed an) {
		this.anzebed = an;
	}  
	public String  getbed() {
		switch (anzebed) {
		case pillow:
			System.out.println("get pillow");
			return "get pillow";
			
		case bedsheet :
			System.out.println("getbedsheet");
			return "getbedsheet";
		case cusion :
			System.out.println("get cusion");
			return "get cusion";
			
		}
		return "not my type";
		
	}
	
}
class sampadabed {
	
	bed sambed;
	
	public sampadabed(bed sam) {
		this.sambed = sam;
	}
	public void getsambed(bed b) {
		if(b == bed.cusion) {
			System.out.println("sampada cusion");
		}
		else if(b == bed.pillow) {
			System.out.println("sampada pillow");
		}
		else if (b == bed.bedsheet) {
			System.out.println("sampada bedsheet");
		}
		else
			System.out.println("none");
	}
}
