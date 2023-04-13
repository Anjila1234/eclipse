package interfacepractice;

public class interfaceday5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
market m = new market ("supermarket");
System.out.println(m.name);
m.displaycheeseball();
m.displaykurkure();
m.displaykurmure();
m.displaynoodles();
m.getcheeseball();
m.getkurkure();

	}

}


interface cheeseball {
	
	public void getcheeseball() ;
	
	default void displaycheeseball () {
		System.out.println("cheeseball ");
	}}
	
	interface kurkure {
		public void getkurkure();
		public void displaykurkure();
	}
	
	interface kurmure extends cheeseball, kurkure {
	
	public void displaykurmure ();
	
}
	abstract class noodles {
		String name; 
		
		public noodles (String n) {
			this.name = n;
		}
		public void getnoodles () {
			System.out.println("waiwai");
		}
		abstract void displaynoodles ();
	}
	
	class market extends noodles implements kurmure {

		public market(String n) {
			super(n);
			System.out.println("Rumpum");
		}

		@Override
		public void getcheeseball() {
			System.out.println("cheeseball");
			
		}

		@Override
		public void getkurkure() {
			System.out.println("kurkure");
		}

		@Override
		public void displaykurkure() {
			System.out.println("kurkure1");
		}

		@Override
		public void displaykurmure() {
			System.out.println("kurmure");
			
		}

		@Override
		void displaynoodles() {
			System.out.println("noodles");
			}
			
			public void displaycheeseball () {
				System.out.println("cheeseball ");
			
		}}