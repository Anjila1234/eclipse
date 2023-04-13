package indianclasspractise;

public class Day18innerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bread b = new bread("white");
		System.out.println(b.color);
		b.getbread();

		bread.donut bd = b.new donut();
		bd.getbread();

	}

}

class bread {
	String color;

	public bread(String c) {
		this.color = c;

	}

	public void getbread() {
		System.out.println(this.color);
	}

	class donut {
		public void getbread() {
			System.out.println("Bread is good");
		}
	}
}