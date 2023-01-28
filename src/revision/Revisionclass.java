package revision;

public class Revisionclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello");
System.out.println("Bye");
System.out.println("Anjila Katuwal");
System.out.println("Nabaraj Pokhrel");

int a = 1;
int b = 2;

System.out.println(a+b);
System.out.println(a-b);
System.out.println(a*b);
System.out.println(a%b);

int c = 5;
int d = 6;
int e = 7;

System.out.println(c+d+e);
System.out.println(c-d-e);
System.out.println(c*d*e);

calculator(10,12);
calculator(13,14);
calculator(15,16);
calculator2(10,11);
calculator(10,11);

	}
static void calculator(int x, int y) {
	System.out.println(x+y);
	System.out.println(x-y);
	System.out.println(x*y);
	System.out.println(x/y);
	System.out.println(x%y);
}
public static int calculator2(int x, int y) {
	return x+y;
	
}
}
