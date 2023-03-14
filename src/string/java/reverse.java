package string.java;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String city = "sindhuli";
 String rev = "";
 
 for(int i = 0; i< city.length(); i++) {
	 rev =  city.charAt(i) + rev;
 }
 
 System.out.println(rev);
	}

}
