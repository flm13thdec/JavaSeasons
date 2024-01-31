package jan30th;

public class MethodsDemo3 {

	public static void main(String[] args) {
		
		//creation of object 
		
		//ClassName objectName=new ClassName();
		
		MethodsDemo3 obj=new MethodsDemo3();
		
		obj.natSum(5);
		obj.natSum(10);
		obj.natSum(100);
		obj.natSum(1000);
		
	}
	
	
	//non-static method 
			public void natSum(int n)
			{
				int res=(n*(n+1))/2;
				
				System.out.println("Sum of "+n+" natural numbers is "+res);
			}

	

}
