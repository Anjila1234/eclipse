package enumpractice;

public class ifelse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
humanbeing h = new humanbeing();
clothes c = clothes.SHIRT ;
h.gethumanbeing(c);
	}

}
enum clothes {
	SHIRT,
	PANT,
	SKIRT;
}
class humanbeing {
	
	public humanbeing () {
		System.out.println("human being");
	}
	public void gethumanbeing (clothes c) {
		if(c == clothes.SHIRT) {
			System.out.println("Boy");
			}
		else if (c == clothes.PANT) {
			System.out.println("Man");}
		 else if (c== clothes.SKIRT) {
				System.out.println("girl");
			}
			else {
				System.out.println("default");
			}
			
		}
		
	}
