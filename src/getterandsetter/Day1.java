package getterandsetter;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kaju k = new kaju();
		k.shop = "bhatbhateni";
		System.out.println(k.shop);

		kismis kk = new kismis();
		kk.setshop("bazar");
		kk.getshop();
		System.out.println(kk.shop);
		kk.shop = "sindhulibazar";
		System.out.println(kk.shop);

		cheeseball c = new cheeseball();
		System.out.println(c);
	}

}

class kaju {
	String shop = "Bigmart";
}

class kismis {
	String shop = "Indiabazar";

	// getting the value
	public void setshop(String s) {
		this.shop = s;

		// setting the value
	}

	public String getshop() {
		return this.shop;
	}
}

class cheeseball {
	String color = "orange";

	public void setcheeseball(String c) {
		this.color = c;
	}

	public String getcheeseball() {
		return this.color;
	}

}