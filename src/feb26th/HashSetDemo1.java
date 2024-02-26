package feb26th;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo1 {

	public static void main(String[] args) {
		
		Set<String> hs=new HashSet<String>();
		
		
		hs.add("FLM");
		hs.add("Java");
		hs.add("Python");
		hs.add("Selenium");
		hs.add("TOSCA");
		
		System.out.println(hs.size());
		
		System.out.println("FLM".hashCode()%16);
		System.out.println("Java".hashCode()%16);
		System.out.println("Python".hashCode()%16);
		System.out.println("Selenium".hashCode()%16);
		System.out.println("TOSCA".hashCode()%16);
		
		
		System.out.println(hs);
		
		for(String temp:hs)
		{
			System.out.println(temp);
		}
		
		Iterator<String> it=hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
