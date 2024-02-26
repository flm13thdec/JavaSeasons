package feb26th;

import java.util.ArrayList;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("Java");
		al.add("Python");
		al.add("Selenium");
		//al.add(200);
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		for(String temp:al)
		{
			System.out.println(temp);
		}
		

	}

}
