package jan31st;

import java.util.Scanner;

public class MethodsDemo4 {

	public static void main(String[] args) {
		
		System.out.println("Enter value for x ");
		
		Scanner input=new Scanner(System.in);
		
		int x=input.nextInt();
		
		System.out.println(MethodsDemo4.natSum(x));
		
		System.out.println("End of Program...");

	}

	//static method
	public static int natSum(int n)
	{
		int res=(n*(n+1))/2;
		return res;
	}
}
