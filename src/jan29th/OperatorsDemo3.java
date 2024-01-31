package jan29th;

public class OperatorsDemo3 {

	public static void main(String[] args) {
		// Relational operators 
		
		int x=20;
		
		int y=30;
		
		System.out.println(x>y);
		System.out.println(x<y);
		System.out.println(x>=y);
		System.out.println(x<=y);
		System.out.println(x==y);
		System.out.println(x!=y);
		
		//logical operators 
		
		//System.out.println(x>0 && x<10);
		
		System.out.println(!(x>0 || x<10));
		
		//AND 
		//			  o/p 
		// T  T    T
		// T  F    F
		//F   T    F
		//F   F    F
		
		
		//OR 
		//			  o/p 
		// T  T    T
		// T  F    T
		//F   T    T
		//F   F    F
		
		
	}

}
