package enumpractice;
enum phones {
	ANDROID,
	IPHONE,
	NOKIA;
}
public class switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
mobilephones mp = new mobilephones(phones.ANDROID);
mp.getphones();
	}

}

class mobilephones{
	
	phones p;
	
	public mobilephones (phones p) {
		this.p = p;
	}
	public void getphones() {
		switch (p) {
		case ANDROID:
			System.out.println("J7 samsung");
		case IPHONE:
			System.out.println("Iphone 14 pro max");
		case NOKIA:
			
		}
	}
	
}