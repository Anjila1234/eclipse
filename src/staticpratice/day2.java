package staticpratice;

public class day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Books1.displaybook();
Books1.getpage();


Books2 b = new Books2 ("Maths", "Red");
Books2 c = new Books2 ("science", "black");
Books2 d = new Books2 ("Maths", "Red");
Books2 e = new Books2 ("Maths", "Red");

Books2.displayno();

System.out.println(Books2.count);

	}

}
 class Books1 {
	 
	 
	 static String bookname = "science";
	 static int pageno = 5;
	 
	 
	 public static void displaybook () {
		 System.out.println(Books1.bookname + Books1.pageno);
		 
	 }
	 public static int getpage() {
		 System.out.println(Books1.pageno);
		 return Books1.pageno;
		 
	 }
	
		 
 }
 
 
 class Books2 {
	 
	 String bookname2 ;
	 String color ;
	 static int count = 0;
	 
	 
	 public Books2( String bn, String c) {
		 this.bookname2 = bn;
		 this.color = c;
		 //Books2.count = Books2.count + 1;
		 Books2.getno();
		
	 }
	 public static void displayno() {
		 System.out.println(Books2.count);
	 }
	 public static void getno() {
		 Books2.count = Books2.count + 1;
		 
	 }
 }