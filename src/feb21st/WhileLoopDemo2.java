package feb21st;

import java.util.Scanner;

public class WhileLoopDemo2 {

	public static void main(String[] args) {
		
		//untill user gives input x or X 
		
		while(true)
		{
			System.out.println("Enter some Character : ");
			
			Scanner input=new Scanner(System.in);
			
			char ch=input.next().charAt(0);
			
			if(ch!='x' && ch!='X')
			{
			System.out.println("You have entered character "+ch);
			}
			else
			{
				System.out.println("Entered x ..so exiting game..");
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
