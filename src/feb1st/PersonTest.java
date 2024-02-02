package feb1st;

public class PersonTest {

	public static void main(String[] args) {
		
		//object creation
		
		Person p1=new Person();
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.phone);
		p1.greet();
		
		p1.name="Sivamani";
		p1.age=30;
		p1.phone=9848022338L;
		p1.greet();
		Person.bye(p1.name);
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.phone);
		
		Person p2=new Person();
		
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.phone);
		
		p2.name="DJ Tillu";
		p2.age=32;
		p2.phone=9969333222L;
		
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.phone);

	}

}
