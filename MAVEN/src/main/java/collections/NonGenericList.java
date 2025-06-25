package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class NonGenericList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List s = new ArrayList();
		s.add(10);
		s.add("Apple");
		s.add(20);
		s.add("Orange");
		s.add(30);
		s.add("Grapes");
		System.out.println("Elements in the List1 are: "+s);
		System.out.println("Size of the list is: " +s.size());
		System.out.println(s.contains(30));
		System.out.println(s.isEmpty());
		
		List s1 = new ArrayList();
		s1.add(40);
		s1.add("Mango");
		s1.add(50);
		s1.add("Banana");
		s1.add("Apple");
		s1.add(60);
		System.out.println("Elements in the List2 are: " +s1);
		
	}
}