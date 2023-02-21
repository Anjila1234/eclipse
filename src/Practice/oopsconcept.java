package Practice;

public class oopsconcept {
public static void main(String[] args) {
	animals buffalo = new animals("Buff","meat", 5 );
	animals tiger = new animals ("Sher","khan", 10);

	
	vehicle toyota = new vehicle("red", "le", 1234);
	System.out.println(toyota.color);
	System.out.println(toyota.model);
	System.out.println(toyota.regno);
	
	vehicle.start();
	vehicle.stop();
	
	

	bird parrot = new bird ("michal", "gopi", 5);
	bird sparrow = new bird ("chadani", "krishnakaw",2 );
	System.out.println(parrot.firstname);
	System.out.println(parrot.lastname);
	System.out.println(parrot.age);

	
	
	
	vegetables potato = new vegetables ("good", "white", 2);
	vegetables tomato = new vegetables ("bad", "red", 1);
	
	System.out.println(potato.color);
	System.out.println(tomato.fresh);
	System.out.println(potato.weight);
	potato.veggrow();
	tomato.veggrow();
	
	vegetables [] veggie = { potato, tomato};
	
	for(int i =0; i< veggie.length; i++) {
		System.out.println(veggie[i].color);
		System.out.println(veggie[i].fresh);
		System.out.println(veggie[i].weight);
	}
	
	food  item = new food("tasty", "half", 2);
	food quality = new food("non-taste", "less", 3);
	
	System.out.println(item.full);
	System.out.println(quality.quantity);
	item.foodland1();
	quality.foodland1();
	
	food [] a10 = { item, quality};
	for(int i = 0; i< a10.length; i++ ) {
		System.out.println(a10[i]);
		System.out.println(a10[i].full);
		System.out.println(a10[i].quantity);
		System.out.println(a10[i].taste);
	}
	
	for(food a11:a10) {
		a11.foodland1();
		System.out.println(a11.full);
		System.out.println(a11.taste);
		System.out.println(a11.quantity);
		
		

	}
	}
	}
class bird {
	String firstname;
	String lastname;
	int age;
	
	
	public bird (String name, String last, int i) {
		
		this.firstname = name;
		this.lastname = last;
		this.age = i;
	}

	
static void fly () {
	System.out.println("Bird can fly");
}
static void swim () {
	System.out.println("Bird can swim");


}

}


class vehicle{
	
	String color;
	String model;
	int regno;
	
	
	
	
	
	public vehicle ( String col, String mod, int reg) {
		
		
this.color = col;
this.model= mod;
this.regno = reg;
	}
	
	static void start() {
			System.out.println("I am starting");
	
		
	}
	static void stop() {
		System.out.println("I am stopping");
		
		
		
	}
}

class vegetables{
	String fresh;
	String color;
	int weight ;
	
	
	public vegetables( String fr, String col, int weg) {
		this.fresh =fr;
		this.color = col;
		this.weight =weg;
	}
	
	static void veggrow () {
		System.out.println("Vegetables are good");	
		
		
		
	}
}
class food{
	String taste ;
	String full ;
	int quantity ;
	
	

public food (String tast, String ful, int quan) {
	this.taste = tast;
	this.full = ful;
	this.quantity = quan;
	
}
	static void foodland1() {
		System.out.println("food is life");
		
		
		
	
}
	


class animals{
	String animalfirstname;
	String animallastname;
	int count1;
	
	
	
	
	
	public animals( String afn, String aln, int c1 ) {
		this.animalfirstname = afn;
		this.animallastname = aln;
		this.count1 = c1;
	}
	static  void animalname() {
	System.out.println("animal are domestic");}
	
	static void animalname1() {
		System.out.println("animal are wild");
	}
	
	
}
}
	