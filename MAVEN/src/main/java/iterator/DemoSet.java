package iterator;

import java.util.*;
public class DemoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> n = new HashSet<Integer>();  //Generic..same datatype only..here integer
		n.add(10);
		n.add(20);
		n.add(30);
		n.add(40);
		System.out.println("GENERIC");
		System.out.println(n);
		
		Iterator it = n.iterator();
		while(it.hasNext())
		{
		System.out.println(it.next());
		}
		
		System.out.println("NON GENERIC");
		List s = new ArrayList();        //non generic...different datatypes
		s.add("apple");
		s.add(2);
		s.add("orange");
		s.add(6.5);
		System.out.println(s);
		
		Iterator it2 = s.iterator();
		while(it2.hasNext())
		{
		System.out.println(it2.next());
		}

	}

}
