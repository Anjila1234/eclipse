package Exceptiontrycatch;

public class arraysinexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a [] = new int [3];
a[0] = 1;
a[1] = 2;
a[2] = 3;


 

try {
	// for (int i = 0; i < a.length + 1; i++) {
		 System.out.println(a);
}
//}
catch (ArrayIndexOutOfBoundsException e){
	System.out.println("arrays");
	e.getStackTrace();
	
	
}
finally {
	System.out.println("always print");
}
	}

}
