package enumpractice;
enum house {
	small, large, medium
}

public class ifelse {

	public static void main(String[] args) {
		anjilahouse ah = new anjilahouse();
		
		house h =  house.small;
		ah.gethouse(h);
		

	}

}


class anjilahouse {
	
	public anjilahouse() {
		
	}
	public void gethouse(house h) {
		
		
		if(h == house.small) {
			System.out.println("low price");
		}
		else if(h == house.large) {
			System.out.println("high price");
		}
		else if(h == house.medium) {
			System.out.println("normal price");
		}
		else {
			System.out.println("none");
		}	
	}
}