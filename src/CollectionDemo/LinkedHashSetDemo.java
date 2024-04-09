package src.CollectionDemo;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		System.out.println("...............LinkedHashSet...................");
		
		// Homogeneous and heterogeneous elements can be stored
		// Duplicate elements are not allowed
		// Insertion order is also maintained
		
		Set s = new LinkedHashSet();

		s.add(10);
		s.add(10);
		s.add(20);
		s.add(30);
		s.add("Shivani");
		
		System.out.println();
		System.out.println("Homogeneous and Heterogeneous elements can be stored.");
		System.out.println("Duplicate elements are not stored/printed.");
		System.out.println("Insertion order is also maintained.");
		System.out.println();

		System.out.println("Elements of LinkedHashSet : " + s);

	}

}
