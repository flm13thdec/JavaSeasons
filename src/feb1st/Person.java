package feb1st;

public class Person {

	String name;
	
	int age;
	
	long phone;
	
	public Person()
	{
		
	}
	
	public Person(Person p)
	{
		this.name=p.name;
		this.age=p.age;
		this.phone=p.phone;
	}
	
	public void greet()
	{
		System.out.println("Hi "+name+"..Good Evening...");
	}
	
	public static void bye(String n1)
	{
		System.out.println("Hi "+n1+"..bye..bye");
	}
	
}
