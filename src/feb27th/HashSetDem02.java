package feb27th;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDem02 {

	public static void main(String[] args) {
		
		
		HashSet hs=new HashSet();
		
		hs.add(10);
		hs.add("FLM");
		hs.add(20.33);
		hs.add('a');
		
		System.out.println(Integer.valueOf(10).hashCode()%16);
		System.out.println("FLM".hashCode()%16);
		System.out.println(Double.valueOf(10).hashCode()%16);
		System.out.println(Character.valueOf('a').hashCode()%16);
		
		System.out.println(hs.size());
		
		for(Object temp:hs)
		{
			System.out.println(temp);
		}
		
		Iterator it=hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
