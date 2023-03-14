package Practice;

public class practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name = "Sampadaanjila";
int count = 0;
for(int i = 0; i< name.length(); i++) {
	if(name.charAt(i)=='a'|| name.charAt(i)=='e'|| name.charAt(i)=='i'|| name.charAt(i)=='o'|| name.charAt(i)=='u')
{
		count = count +1;
		System.out.println(name.charAt(i));
		
		}
}
System.out.println(count);


String name1 = "I am going to visit my parents";
String name2 = "I love my parents";
String a1 = name1.replaceAll(name1, name2);
System.out.println(a1);

String name3 = "I am going to visit my parents";
String a2 = name3.replaceFirst("am", "was");
System.out.println(a2);

String name4 = "I am running";
String name5 = "in market";
String name6 = "";
String a3 = name4.join(name6, name4, name5);
System.out.println(a3);

String name7 = "I am learning QA ";
String name8 = "with friends";
String name9 = name7.concat(name8);
System.out.println(name9);


String name10 = "sAdiksha";
String name11 = name10.toLowerCase();
System.out.println(name11);

String name12 = "Anjila";
String name13 = name12.toUpperCase();
System.out.println(name13);





	}

}
