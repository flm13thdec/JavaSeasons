package feb1st;

public class Bank {
	
	private double  balance = 10000;

	//getters 
	public void getBalance(int pin)
	{
		//validation
		if(pin==3214)
		{
			System.out.println(balance);
		}
		else
		{
			System.out.println("Invalid pin...");
		}
	}
	
	//setters 
	public void setBalance(double depositAmount)
	{
		balance=balance+depositAmount;
	}
	
}
