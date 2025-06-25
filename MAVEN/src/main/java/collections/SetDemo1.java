package collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set <Integer> in = new HashSet<Integer>();
		in.add(10);
		in.add(20);
		in.add(30);
		in.add(40);
		System.out.println("Elements of First Set: " +in);
		//System.out.println("Size of Set is: " +in.size());
		//System.out.println(in.isEmpty());
		//System.out.println(in.contains(20));
		//in.remove(10);
		//System.out.println(in);
		
		Set <Integer> in1 = new HashSet <Integer>();
		in1.add(20);
		in1.add(40);
		in1.add(70);
		in1.add(80);
		System.out.println("Elements of second set: " +in1);
		
	}

}
                                                                                                                                                     