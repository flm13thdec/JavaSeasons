package jan31st;

import java.util.Scanner;

public class MethodsDemo3 {

	public static void main(String[] args) {
		
		System.out.println("Enter value for x ");
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		
		MethodsDemo3 obj=new MethodsDemo3();
		
		System.out.println(obj.natSum(x));
		
		System.out.println("End of Program...");

	}

	//non-static method
	public int natSum(int n)
	{
		int res=(n*(n+1))/2;
		return res;
	}
}
