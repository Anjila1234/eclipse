package revision;

public class Revisionday2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 15;
		
		int c = a+b;
		System.out.println(c);
		System.out.println(c + b);
		System.out.println(c +a);
		
		
		int a1 = 2;
		int a2 = 3;
		
		System.out.println(a1+a2);
		System.out.println(a1-a2);
		System.out.println(a1*a2);
		System.out.println(a1%a2);
		System.out.println(a1/a2);
		
// calling the function
	cal(10, 11);
	calA();
	calB(8, 5);
	calC(10, 6);
	Mul(11, 12);
	div(15, 30);
	mul2(10,11);
	
		
	}
static void cal(int x, int y) {
	System.out.println(x+y);
	System.out.println(x-y);
	System.out.println(x*y);
	System.out.println(x%y);
	System.out.println(x/y);
	
}
//function without parameter and without return type
static void calA() {
	System.out.println(8+8);
}
//function with parameter and without return type

static void calB(int x, int y) {
	System.out.println(x+y);
	
}
//function with parameter and with return type
static int calC(int x, int y) {
	System.out.println(x+y);
	return ( x + y);
}
static int Mul(int x, int y) {
	System.out.println(x*y);
	return x * y;
}
static int mul2(int x, int y) {
	System.out.println(x*y);
	return x*y;
	
}

static int div(int x, int y) {
	System.out.println(x/y);
	return x/y;
	
	
}
static int sub(int x, int y) {
	System.out.println(x-y);
	return x- y;
}
}
