package Day4;

public class Dayfour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks = 45;
		if (marks <= 50) {
			System.out.println("Grade A");
		}

		if (40 >= marks && 50 <= marks) {
			System.out.println("Grade B");
		}

		if (30 >= marks && 40 <= marks) {
			System.out.println("Grade C");
		}

		int a = 20;
		int b = 30;
		int c = 40;

		if (a > b) {
			System.out.println("a is greater");
		}
		if (a < b) {
			System.out.println("b is greater");
		}

		if (a < c) {
			System.out.println("c is greater");
		}
		if (a < c && a < b) {
			System.out.println("c is greater");

		}
		int num = 50;

	}

}
