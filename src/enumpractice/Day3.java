package enumpractice;
enum status {
	bigger, smaller;
}

public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		status s [] = status.values();

		for(int i = 0; i < s.length; i ++) {
			System.out.println(s[i]);
		}
	}

}
