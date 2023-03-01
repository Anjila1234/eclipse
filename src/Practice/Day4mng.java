package Practice;

public class Day4mng {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a1 = "I";
		String a2 = "am";
		String a4 = "learning";
		String a5 = "Java";
		
		String a6 = String.join("", a1, a2, a4, a5);
		System.out.println(a6);
	
		
		String a7 = "Anjila";
		int a8 = a7.indexOf('n');
		System.out.println(a8);
		
		String a9 = "Nabaraj";
		System.out.println(a9.indexOf('a'));
		
		String a10 = "I";
		String a11 = "am";
		String a12 = "speaking";
		String a13 = "engish";
		
		String a14 = String.join(" ", a10, a11, a12, a13);
		System.out.println(a14);
		
		String a15 = "Nabaraj";
		String a16 = "Anjila";
		String a17 = String.join("@", a15, a16);
		System.out.println(a17);
		
		String a18 = "Pradip";
		String a19 = "Kalpana";
		String a20 = String.join("-", a18, a19);
		System.out.println(a20);
		
		String a21 = "Maiya";
		String a22 = "Suresh";
		String a23 = "Shneya";
		String a24 = "Jalupa";
		String a25 = String.join("  ", a21, a22, a23, a24 );
		System.out.println(a25);
		
		String a26 = "kathmandu";
		int a27 = a26.indexOf("a");
		System.out.println(a27);
		
		String a28 = "Sindhuli";
		int a29 = a28.indexOf("I");//-1
		System.out.println(a29);
		
		String a30 = "Sarlahi is my city";
		int a31 = a30.indexOf("i", 5);
		System.out.println(a31);
		
		for(int i = 0; i < a30.length(); i++) {
			System.out.println(i);
			System.out.println(a30.indexOf("i"));}
			
			String a32 = " pune ";
					System.out.println(a32.length());
					String a33 = a32.trim();
					System.out.println(a33);
					
					String a34 = "kathmandu";
				System.out.println(a34.length());
				String a35 = a34.trim();
				System.out.println(a35);
				
				String a36 = "Ktm is city";
				System.out.println(a36.replace("K", "R"));
				
				String a37 = "Sindhuli";
				String a38 = "Biratnagar";
				System.out.println(a37.replaceAll(a37, a38));
				
			String a39 = ""	;
			String a40 = "Sindhuli";
			boolean a41 = a39.isEmpty();
			System.out.println(a41);
			boolean a42 = a40.isEmpty();
			//System.out.println(a40);
		
	}

}
