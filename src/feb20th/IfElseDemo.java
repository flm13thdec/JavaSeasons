package feb20th;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		
		System.out.println("Enter your Salary : ");
		
		Scanner input=new Scanner(System.in);
		
		double sal=input.nextInt();
		
		if(sal<=20000)
		{
			sal=sal+sal*(0.1);
		}
		else if(sal>20000 && sal<=50000)
		{
			sal=sal+sal*(0.2);
		}
		else if(sal>50000)
		{
			sal=sal+sal*(0.3);
		}
		
		System.out.println("New Salary : "+sal);
	}

}
