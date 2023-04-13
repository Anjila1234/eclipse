

package Practice;

public class arithmeticoperation {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		int a = 10;
		int b = 15;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		
		
		calculator();
		
		calculator1(10, 10);
		calculator2(20, 10);
		int a1 = calculator2(20, 10);
		System.out.println(a1);
		System.out.println(a1 + 0.5);
		
	}


 //without parameter and without return type

static void calculator() {
	System.out.println(10 + 10);
}
//with parameter and without return type
static void calculator1(int x, int y) {
	System.out.println(x + y);
}
//without parameter and without return type
static int calculator2(int x, int y) {
	return x + y;
}
}
