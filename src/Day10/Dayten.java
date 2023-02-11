package Day10;

public class Dayten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String fullname = "Anjila";
String a= fullname.toUpperCase();
System.out.println(a);


Human sadiksha = new Human("sadiksha katuwal", 22);
System.out.println(sadiksha.age);
System.out.println(sadiksha.fullname);
sadiksha.think();
sadiksha.eat();


Human nabaraj =new Human("nabaraj pahadi", 30);
System.out.println(nabaraj.age);
System.out.println(nabaraj.fullname);
nabaraj.walk();
nabaraj.talk();
	


//Human anjila = new Human("Anjila Katuwal", 27);
//System.out.println(Anjila.age);
//System.out.println(Anjila.fullname);
//Anjila.walk();
//Anjila.talk();

Human anjila =new Human("anjila Katuwal", 27);
System.out.println(anjila.age);
System.out.println(anjila.fullname);
anjila.walk();
anjila.talk();

Vehicle toyota = new Vehicle("toyota ","red" );
System.out.println(toyota.color);
System.out.println(toyota.brand);
toyota.start();
toyota.stop();


}

}
class Human {
	String fullname;
	int age;
	
	public Human(String fullN, int age) {
		this.fullname = fullN;
		this.age = age;
	}
	public void talk() {
		System.out.println("I am talking");
	}
	public void walk() {
		System.out.println(" I am walking");
	}
	public void think() {
		System.out.println("I am thinking");
	}
	public void eat() {
		System.out.println("I am eating");
	}
}
	class Vehicle {
		String brand;
		String  color;
		
		public Vehicle(String toyota, String red) {
			this.brand = brand;
			this.color = color;
		}
		public void start() {
			System.out.println("I am starting");
		}
		public void stop() {
			System.out.println("I am stoping");
		}
	}

	

