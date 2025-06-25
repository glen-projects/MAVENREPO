package iterator;

import java.util.*;

public class DemoList
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List s = new ArrayList();
		s.add("apple");
		s.add(2);
		s.add("orange");
		s.add(6.5);
		System.out.println(s);
		
		Iterator it = s.iterator();
		while(it.hasNext())
		{
		System.out.println(it.next());
		}
		
		
		System.out.println("GENERIC ELEMENTS");
		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("grape");
		fruits.add("orange");
		System.out.println(fruits);
		Iterator it2 = fruits.iterator();
		while(it2.hasNext())
		{
		System.out.println(it2.next());
		}
	

	}

}