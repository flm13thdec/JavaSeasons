package assignments;

public class Aadhar {
	
	public void printAadhar()
	{
		System.out.print("Your Aadhar card number is : ");
		System.out.println(generateFourDigit()+" "+generateFourDigit()+" "+generateFourDigit());
	}
	public void generateAadhar(String passportNo)
	{
		printAadhar();
	}
	
	public void generateAadhar(String passportNo,String panCardNo)
	{
		printAadhar();
	}
	public void generateAadhar(String passportNo,String panCardNo,String voterId)
	{
		printAadhar();
	}
	public int generateFourDigit()
	{
		return (int)(Math.random()*10000);
		
	}

}
