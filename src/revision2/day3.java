package revision2;

import Practice.character;

public class day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a1 = "Anjila";
for(int i = 0; i < a1.length(); i++) {
//	System.out.println(i);
	System.out.println(a1.charAt(i));
}

//rev
String rev = "";
for(int i = 0; i< a1.length(); i++) {
	rev = a1.charAt(i) + rev;
	
}
System.out.println(rev);


String a2= "apple,  ball, cat ";
if(a2.contains("apple")) {
	System.out.println("passed");
}
else {
	System.out.println("failed");
}

String a3 = "aeroplane";
int count =0;
for(int i = 0; i < a3.length(); i++) {
	if(a3.charAt(i)== 'a'|| a3.charAt(i)=='e'|| a3.charAt(i)=='i'|| a3.charAt(i)=='o'||a3.charAt(i)=='u') {
	count = count + 1;
}


}

System.out.println(count);







	}

}
