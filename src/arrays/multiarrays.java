package arrays;

public class multiarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

int [] [] [] a1 = {
		{{1, 2, 3},
			{2, 3, 4},
			{3, 4, 5}},
		    {{5, 5, 5},
		    {6, 6, 6},
		     {7, 7, 7}},
		
            {{10, 20, 30},
		    {20, 30, 40}},
};

for(int i = 0; i< a1.length; i++) {
	int [] [] a2= a1[i];
	for(int j = 0; j< a2.length; j++) {
		int [] a3 = a2[j];
		for(int k = 0; k< a3.length; k++) {
			System.out.println(a3[k]);
		}
		
	}
}

for (int[][] a:a1) {
	for(int[] b:a) {
		for(int c:b) {
			System.out.println(c);
		}
	}
	
}


	

}}