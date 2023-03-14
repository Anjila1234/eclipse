package interfacepractice;

public class day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QAclass QA = new QAclass ();
		QA.getangela();
		
		QA.getsampada();
		QA.setangela();
		QA.setsampada();

	}

}
interface angela {
	public void getangela();
	default void setangela() {
		System.out.println("angela loves to travel");
	}
	
}

interface sampada {
	public void getsampada();
	abstract void setsampada();
}

interface bhagwati5 extends angela, sampada {
	public void getbhagwati();
}

class QAclass implements bhagwati5 {

	@Override
	public void getangela() {
		System.out.println("QA");
		
	}

	@Override
	public void getsampada() {
		System.out.println("Java");
		
	}

	@Override
	public void setsampada() {
		System.out.println("javascript");
		
	}

	@Override
	public void getbhagwati() {
		System.out.println("python");}
	
	
		public void setangela() {
			System.out.println("angela loves to travel");
		
	}}