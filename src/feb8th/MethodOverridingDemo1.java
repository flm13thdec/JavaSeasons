package feb8th;

public class MethodOverridingDemo1 {

	public static void main(String[] args) {
		
		//case 1 
		
		//P obj=new P();
		
		//case 2
		//C obj=new C();
		
		//case 3
		
		P obj=new C();  // overriding
		
		//case 4
		
		//C obj=new P();  //error 
		
		System.out.println(obj.x);
		obj.m1();
		
		

	}

}
