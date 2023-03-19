package indianclasspractise;

public class enumclass {
public static void main(String[] args) {
trafficlight [] t = trafficlight.values();

for(int i = 0; i< t.length; i++) {
	System.out.println(t[i]);
}
for(trafficlight tl : t) {
	System.out.println(tl.getlight());
	
}

trafficlight t2 = trafficlight.RED;
System.out.println(t2.getlight());
}
}
enum trafficlight{
	RED ("STOP"),
	YELLOW("SLOW"),
	GREEN ("GO");
	
	 String rules ;
	
	private trafficlight (String r) {
		this.rules = r;
			
	}
	public String getlight () {
		return this.rules;
	}
	
	
}
