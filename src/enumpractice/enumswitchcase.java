package enumpractice;

public class enumswitchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tablecolor Tc = new Tablecolor(table.square);
		//table t = table.circle;
		Tc.gettablecolor();

	}

}

enum table {
	circle, square, rectangle;

}

class Tablecolor {
	table t;

	public Tablecolor(table t) {
		this.t = t;
	}

	public void gettablecolor() {
		switch (t) {
		case circle:
			System.out.println("red");
			break;
		case square:
			System.out.println("yellow");
			break;
		case rectangle:
			System.out.println("green");
		}
	}
}
