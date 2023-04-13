package Innerclass;

public class getpropertyininnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
tree t = new tree("pine");
tree.leaves tl = t.new leaves ();
tl.displaytree();
	}

}
class tree {
	String name;
	
	public tree (String n) {
		this.name = n;
	}
	class leaves {
		int size ;
	
	public int  getsize () {
		if(tree.this.name.equals("pine")) {
			this.size = 5;
		}
		else if (tree.this.name.equals("coconut")){
			this.size = 10;
		}
		else {
			this.size = 0;
		}
		return this.size ;
	}
	public void displaytree() {
		System.out.println(this.getsize());
	}
}}