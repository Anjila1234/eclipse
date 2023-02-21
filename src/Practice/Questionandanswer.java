package Practice;

import java.util.Arrays;

public class Questionandanswer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String name = "anjila";
//for(int i = 0; i < name.length(); i++)
//	if(name.charAt(i) == 'a') {
//		System.out.println((i));
//		
//	}
//int a1 = 12;
//int b1 = 14;
//
//if(a1>b1) {
//	System.out.println("a1 is greater");
//}
//else {
//	System.out.println("b1 is greater");
//}
//
//
//for (int i = 1; i<=5; i++) {
//	System.out.println(i);
//	if( i == 3)
//	break;
//	
//
//}
//
//for(int i =5 ; i>= 1; i--) {
//	if(i == 4)
//		break;
//	System.out.println(i);
//		
//}
//
//for(int i = 1; i<=50; i++) {
//	if(i%2 ==0)
//	System.out.println(i);
//}
//
//for(int i =1; i<= 10; i++) {
//	System.out.println(i);
//	if(i== 5)
//		continue;
//}
//
//for(int i =1; i<= 10; i++) {
//	if(i== 5)
//		continue;
//	System.out.println(i);
//}
	
//	int i = 1;
//	while(i <= 10) {
//		System.out.println(i);
//	
//		i++;
//		if(i== 5)
//			i++;
//			continue;
//		
//	}
	
//		
//	int num1 [] = {12, 13, 14};
//	int sum = 0;
//	for(int i1 =0; i1 < num1.length; i1++) {
//		sum = sum + num1[i1];	
//	}
//	System.out.println(sum);
//	
//
//for(int i:num1) {
//	sum = sum +i;
//	
//}
//System.out.println(sum);
//int sum1 = 0;
//	int num2 [] = {12, 14, 18, 20};
//	for(int a:num2) {
//		sum1 = sum1 + a;
//	}
//	System.out.println(sum1);
//	
//	
//	
//	bird parrot = new bird ("michal", "gopi", 5);
//	bird sparrow = new bird ("chadani", "krishnakaw",2 );
//	System.out.println(parrot.firstname);
//	System.out.println(parrot.lastname);
//	System.out.println(parrot.age);
//
//	
//	
//	
//	
//	
//	
//	
//	}
//	}
//class bird {
//	String firstname;
//	String lastname;
//	int age;
//	
//	
//	public bird (String name, String last, int i) {
//		
//		this.firstname = name;
//		this.lastname = last;
//		this.age = i;
//	}
//
//	
//static void fly () {
//	System.out.println("Bird can fly");
//}
//static void swim () {
//	System.out.println("Bird can swim");
//	
	
/*String a5 = "aeroplane";
int count = 0;
for(int i =0; i< a5.length(); i++) {
	if(a5.charAt(i) =='a') { 
	count = count +1;
	}	
}
	System.out.println(count);
*/
	
int []	g1 = {1, 2, 3, 4, 23};

int sum = 0;
double avg = 0;

for(int i = 0; i< g1.length; i++) {
	sum = sum + g1[i];
	avg = sum/g1.length;
	
	//System.out.println(sum);
	
}

System.out.println(sum);
System.out.println(avg);


//conditional array

int x1 = 10;
int x2 = 12;
int x3 = 14;


if(x1 > x2 && x1 > x3) {
	System.out.println("x1 is greater");
}

else if (x2 > x1 && x2 > x3) {
	System.out.println("x2 is gretaer");
}
else if (x3 > x1 && x3 > x2){
	System.out.println("x3 is greater");
}
else {
	System.out.println("none");
}

//other way

if (x1 > x2) {
	if ( x1 > x3) {
		System.out.println("x1 is greater");
	}
}

else if (x2 > x1) {
	if(x2 > x3) {
		System.out.println("x2 is greater");
	}
}
else if ( x3 > x1) {
	if ( x3 > x2) {
		System.out.println("x3 is greater");
	}
}
else {
	System.out.println("none");
}


for(int i = 0; i <= 10; i++) {
	
	System.out.println(i);
	if(i ==3)
		break;
}

for(int i =15; i <  20; i++) {
	if(i == 17)
		continue;
	System.out.println(i);
	
}

//animals.animalname();
//animals.animalname1();
//
//animals cow = new animals ("cow", "laxmi", 4);
//animals tiger = new animals ("Tiger", "Tigress", 5);
//
//System.out.println(cow.animalfirstname);
//System.out.println(tiger.animallastname);
//System.out.println(cow.count1);
//cow.animalname();
//tiger.animalname1();
//animals [] an = {cow, tiger};
//for(int i = 0; i< an.length; i++) {
//	System.out.println(an[i].animalfirstname);
//	System.out.println(an[i].animallastname);
//	System.out.println(an[i].count1);
//}
//
//for(animals ak:an){
//	
//	System.out.println(ak);
//	System.out.println(ak.animalfirstname);
//	System.out.println(ak.animallastname);
//	System.out.println(ak.count1);
//	
//	
//}

bank siddhartha = new bank ("Anjila", 02117512, 12, 1000);
bank laxmi = new bank ("Nabaraj", 5252525, 10, 1050);
bank NICASIA = new bank ("sadiksha", 323232,5, 1200);

siddhartha.banktype();
laxmi.banktype();
NICASIA.banktype();

bank [] b1 = { siddhartha, laxmi, NICASIA};

for(int i = 0; i< b1.length; i++) {
	System.out.println(b1);
	System.out.println(b1[i].accountname);
	System.out.println(b1[i].accountnumber);
	System.out.println(b1[i].transactionno);
	
}

for(bank bb1:b1) {
	System.out.println(bb1);
	System.out.println(bb1.accountname);
	System.out.println(bb1.accountnumber);
	System.out.println(bb1.transactionno);
	
	
}

int updatedbalance = siddhartha.deposit(100);
System.out.println(updatedbalance);

 int updatedbalance1 = siddhartha.withdraw(1200);
 System.out.println(updatedbalance1);
 
 siddhartha.deposit(500);
 System.out.println((updatedbalance));

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
 
 
 int transactionamount[] = {siddhartha.deposit(100),siddhartha.withdraw(-50), siddhartha.deposit(200),siddhartha.withdraw(-10),siddhartha.deposit(10)
 };

		 	for ( int i=0; i<transactionamount.length; i++) {
		 		System.out.println(transactionamount[i]);
		 		
		 	}
		 	int transaction [] = new int [5];
		 			laxmi.deposit(1500);
		 			laxmi.withdraw(-200);
		 			laxmi.deposit(1700);
		 			laxmi.withdraw(-100);
		 			laxmi.deposit(500);
		 			
		 			for(int i =0; i<transaction.length; i++) {
		 				System.out.println(transaction);
		 				System.out.println(transaction[i]);	
		 			} 	
}	
}

//class animals{
//	String animalfirstname;
//	String animallastname;
//	int count1;
//	
//	public animals( String afn, String aln, int c1 ) {
//		this.animalfirstname = afn;
//		this.animallastname = aln;
//		this.count1 = c1;
//	}
//	static  void animalname() {
//	System.out.println("animal are domestic");}
//	
//	static void animalname1() {
//		System.out.println("animal are wild");
//	}}


class bank {
	String accountname;
	int accountnumber;
	int transactionno;
	int balance;
	String banktype;
	
	
	public bank(String accountname, int accountnumber, int transactionno, int balance) {
		this.accountname = accountname;
		this.accountnumber = accountnumber;
		this.transactionno = transactionno;
		this.balance = balance;
		this.banktype =banktype;
		
	}

	
	static void banktype () {
		System.out.println("bank makes future secure");
	}
	
	public int deposit (int amount) {
		this.balance = this.balance + amount;
		System.out.println("balance is deposited");
		return this.balance;
		
	}
	public int withdraw (int amount) {
		if (this.balance> amount) {
		this.balance = this.balance - amount;
		System.out.println("balance is withdrawn");
		return this.balance;
		
	}
	else {
		System.out.println("insufficient balance");
		return this.balance;
	}
	
	}}

//class human {
//	String fullname;
//	String lastname;
//	int age;
//	int salary;
//	
//	
//	
//	public human ( String fullname, String lastname, int age, int salary) {
//		this.fullname = fullname;
//		this.lastname = lastname;
//		this.age = age;
//		this.salary = salary;
//		
//	}
//	static void talk() {
//		System.out.println("I can talk");
//	}
//	static void walk() {
//		System.out.println("I can walk");
//	}
//	static int deposit (int salaryamount) {
//		this.salary1 = this.salary1 + salaryamount;
//		System.out.println("salary is deposited");
//		return this.salary;
//	}
//}














