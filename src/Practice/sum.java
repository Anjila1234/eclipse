package Practice;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a1 []= {12,14,16,20};
 int sum = 0;
for(int i = 0; i< a1.length; i++) {
	sum = sum + a1[i];
	System.out.println(i);
	
}

System.out.println(sum);

for (int a2: a1){
sum = sum + a2 ;
System.out.println();
	
}

int b1 []= {12, 13,14};
sum = 0;
for(int b2:b1) {
	sum = sum + b2;
	System.out.println(sum);
}

for (int i = 0; i< b1.length; i++) {
	sum = sum + b1[i];
	System.out.println(sum);
}
	}

}
