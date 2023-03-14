package Innerclass;

public class innerclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
mummy m = new mummy("kalpana", "sindhuli");
m.getmummy();

mummy.chori mc = m.new chori("Anjila");
mc.getchori();

daddy d = new daddy ("pradip");
System.out.println(d.name);

daddy.dress dd = d.new dress ();
dd.getdress();
System.out.println(dd.color);
dd.dress();
	}

}

class mummy {
	String name;
	String address;
	
	
	public mummy (String n, String a) {
		this.name = n;
		this.address = a;
	}
	public void getmummy() {
		System.out.println(this.name + this.address);
	}
	
	class chori {
		String cname;
		
		public chori(String c) {
			this.cname = c;
		}
		public void getchori() {
			System.out.println(this.cname);
		}
	}
}


class daddy {
	String name ;
	public daddy (String name) {
		this.name = name;
	}
	
	public void getname() {
		System.out.println(this.name);
	}
	
	
	class dress {
		String color ;
		
		public String dress() {
			if(daddy.this.name.equals("pradip")) {
				this.color = "black";
			}
			else if (daddy.this.name.equals("Db")) {
				this.color = "red";
				
			}
			else {
				this.color = "default";
				
			}
			return this.color;
			
		}
		public void getdress() {
			System.out.println(this.color);
		}
	}
	
	
	
	
	
	
	
	
}