package feb27th;

import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		
		System.out.println("Enter Dividend : ");
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		
		System.out.println("Enter Divisor : ");
		int y=input.nextInt();
		
		try
		{
			//risky
		System.out.println("Quotient is  "+(x/y));
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Please Enter non-zero value for y ....");
		}
		catch(RuntimeException e)
		{
			System.out.println("Runtime exception occurer ...");
		}
				
		finally 
		{
			//compulsory execution code 
			System.out.println("Quotient evaluated ..");
		}
		
		
		System.out.println("End of Program....");
		

	}

}
