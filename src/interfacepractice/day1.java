package interfacepractice;

public class day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface flower5 {
	public void getcolor();

	public void getsize();

}

interface fruits5 {
	public void gettaste();

	public void getshape();

}

interface vegetables extends flower5, fruits5 {

	public void getveg();

}

class grocery implements vegetables {

	@Override
	public void getcolor() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getsize() {
		// TODO Auto-generated method stub

	}

	@Override
	public void gettaste() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getshape() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getveg() {
		// TODO Auto-generated method stub

	}
}