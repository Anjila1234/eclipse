package Innerclass;

public class day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
pictures p = new pictures("red", "small");
pictures.mypictures mp = p.new mypictures ();
mp.getpic();
mp.setpic();
	}

}

class pictures {
	
	String color;
	String size;
	
	public pictures(String c, String si) {
		this.color = c;
		this.size = si;
		
	}
	class mypictures {
		String anzepic ;
	
	public String getpic() {
		if(pictures.this.color.equals("red")) {
			this.anzepic = "sweet";
		}
		else if (pictures.this.color.equals("yellow")) {
			this.anzepic = "Beautiful";
		}
		else {
			this.anzepic = "default";
		}
		return this.anzepic ;
	}
	public void setpic() {
		System.out.println(this.anzepic);
	}

}}


class toys {
	String shape = "large";
	String color = "grey";
	
	
	
	



















}