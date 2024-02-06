package feb6th;

public class MehodOverloadingDemo1 {

	public static void main(String[] args) {
		
		
		Clock c1=new Clock();
		
		c1.setClock(7);
		c1.getClock();
		
		//user 2
		
		c1.setClock(7,30);
		c1.getClock();
		
		//user 3
		
		c1.setClock(7, 32, 5);
		c1.getClock();
		
		c1.setClock(0, 0, 3);
		c1.getClock();
	

	}

}
