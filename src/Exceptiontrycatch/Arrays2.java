package Exceptiontrycatch;

public class Arrays2 {
public static void main(String[] args) {
	String [] names = 
			//new String [4];
//	names[0] = "Anjila";
//	names[1] = "Bhagwati";
//	names[2] = "sampada";
//	names[3] = "prajani";
//			
			
			
			
		{"Anjila", "Bhagwati", "Sampada", "Prajani"};

	
	try {
	for(int i = 0; i<names.length + 1; i++) {
	 System.out.println(names[i]); //to show the exception we have to put array of string  
 }}
catch (ArrayIndexOutOfBoundsException e) {
	System.out.println("fine");
}
	
	finally {
		System.out.println("finally");
	}

}
}
