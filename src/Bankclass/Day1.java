package Bankclass;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Banks B = new Banks (100, 5252, "Anjila", "Nepal", "saving");

System.out.println(B.getdeposit(100));
System.out.println(B.getwithdraw(100));

int a = B.getdeposit(1000);
System.out.println(a);
	}

}
class Banks {
	int bal;
	int accno;
	String acname;
	String country;
	String type;
	int transaction [];
	
	public Banks (int bal, int an, String aname, String c, String t) {
		this.bal = bal;
		this.accno = an;
		this.acname = aname;
		this.country = c;
		this.type = t;
	}
	public int getdeposit (int amount) {
		this.bal = this.bal + amount;
		return this.bal;
		
		
	}
	
	public int getwithdraw(int amount) {
		if(this.bal> amount) {
			this.bal = this.bal - amount ;
			return this.bal;
			}
		else {
			System.out.println("insufficient balance");
			return this.bal;
		}
	}
	
	
	
}