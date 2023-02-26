package Practice;

public class assignmentsopps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank1 siddhartha = new bank1 ("Anjila", 02117512, 12, 1000);
		bank1 laxmi = new bank1 ("Nabaraj", 5252525, 10, 1050);
		bank1 NICASIA = new bank1 ("sadiksha", 323232,5, 1200);

//		siddhartha.banktype();
//		laxmi.banktype();
//		NICASIA.banktype();
//
//		bank1 [] b1 = { siddhartha, laxmi, NICASIA};
//
//		for(int i = 0; i< b1.length; i++) {
//			System.out.println(b1);
//			System.out.println(b1[i].accountname);
//			System.out.println(b1[i].accountnumber);
//			System.out.println(b1[i].transactionno);
//			
//		}
//
//		for(bank bb1:b1) {
//			System.out.println(bb1);
//			System.out.println(bb1.accountname);
//			System.out.println(bb1.accountnumber);
//			System.out.println(bb1.transactionno);
//			
//			
//		}
//
//		int updatedbalance = siddhartha.deposit(100);
//		System.out.println(updatedbalance);
//
//		 int updatedbalance1 = siddhartha.withdraw(1200);
//		 System.out.println(updatedbalance1);
//		 
//		 siddhartha.deposit(500);
//		 System.out.println((updatedbalance));
//
		 siddhartha.banktype = "saving";
		 siddhartha.banktype ="current";
		 
		 if(siddhartha.banktype=="saving"){
				 System.out.println("Interest rate is 5%");
		 
		 }
		 else if(siddhartha.banktype=="current") {
		 		System.out.println("10% interest rate");}
		 		
		 		else {
		 			System.out.println("No interest rate");
		 		}
			
		 
		 laxmi.banktype="saving";
		 if(laxmi.banktype=="saving") {
			 System.out.println("5% interest rate");
		 }
		 else if(laxmi.banktype=="current") {
			 System.out.println("10% interest rate");
		 }
		 else {
			 System.out.println("No interest rate");
		 }
		 
		 NICASIA.banktype= "fixed";
		 
		 if(NICASIA.banktype =="saving") {
			 System.out.println("5% interest");
		 }
		 else if(NICASIA.banktype =="current") {
			 System.out.println("No interest rate");
		 }
		 else {
			 System.out.println("NO interest rate");
		 }
		 
		 
		 int transactionamount[] = {siddhartha.deposit(100),siddhartha.withdraw(50), siddhartha.deposit(200),siddhartha.withdraw(10),siddhartha.deposit(10)
		 };

				 	for ( int i=0; i<transactionamount.length; i++) {
				 		//System.out.println(transactionamount[i]);
				 		
				 	}
				 	
				 	
				 	int transaction [] = new int [6];
				 	
				 	transaction[0]= laxmi.deposit(1500);
				 	transaction[1]= laxmi.deposit(1500);
				 	transaction[2]= laxmi.withdraw(200);
				 	transaction[3]= laxmi.deposit(1700);
				 	transaction[4]= laxmi.withdraw(100);
				 	transaction[5]= laxmi.deposit(500);
				 			
				 			for(int i =0; i<transaction.length; i++) {
				 			//	System.out.println(transaction);
				 				System.out.println(transaction[i]);	
				 			} 
				 			
	}

}
class bank1 {
	String accountname;
	int accountnumber;
	int transactionno;
	int balance;
	String banktype;
	
	
	public bank1(String accountname, int accountnumber, int transactionno, int balance) {
		this.accountname = accountname;
		this.accountnumber = accountnumber;
		this.transactionno = transactionno;
		this.balance = balance;
		this.banktype =banktype;
		
	}

	
	static void banktype () {
		//System.out.println("bank makes future secure");
	}
	
	public int deposit (int amount) {
		this.balance = this.balance + amount;
		//System.out.println("balance is deposited");
		return this.balance;
		
	}
	public int withdraw (int amount) {
		if (this.balance> amount) {
		this.balance = this.balance - amount;
		//System.out.println("balance is withdrawn");
		return this.balance;
		
	}
	else {
		//System.out.println("insufficient balance");
		return this.balance;
	}
	
		
		//print hello 5 times
		

	
	}}