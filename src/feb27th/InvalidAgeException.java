package feb27th;

public class InvalidAgeException extends RuntimeException{
	
	public InvalidAgeException()
	{
		super("Invalid age ..please come to this page once you age is 18");
	}

}
