package jan30th;

import java.util.Scanner;

public class MethodsDemo2 {

	public static void main(String[] args) {
		
		//creation of object 
		
		//ClassName objectName=new ClassName();
		
		MethodsDemo2 obj=new MethodsDemo2();
		
		System.out.println("Enter some integer value for x : ");

		Scanner input = new Scanner(System.in);

		int x = input.nextInt();
		
		obj.natSum(x);
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
