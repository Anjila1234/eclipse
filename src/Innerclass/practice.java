package Innerclass;

import Innerclass.Fan.Tablefan;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Fan F = new Fan ("white", 2);
System.out.println(F.color);
System.out.println(F.number);
F.getfan();

Fan.Tablefan FT = F.new Tablefan ("Brown", 3);
System.out.println(FT.color1);
System.out.println(FT.number1);
FT.gettablefan();

	}

}
class Fan {
	
	String color;
	int number;
	
	public Fan (String c, int n) {
		this.color = c;
		this.number = n;
	}
	public void getfan () {
		System.out.println(this.color + this.number);
	}
	class Tablefan {
		String color1;
		int number1;
		
		public Tablefan (String c1, int n1) {
			this.color1 = c1;
			this.number1 = n1;
		}
		public void gettablefan () {
			System.out.println(this.color1 + this.number1);
		}
		
	}
}