package src.CollectionDemo;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {

		System.out.println("..............LinkedList................");

		// Homogeneous and heterogeneous elements can be stored
		// Duplicate elements are allowed
		// Insertion order is maintained

		List l = new LinkedList();
		l.add(10);
		l.add(10);
		l.add(20);
		l.add("Shivani");

		System.out.println();
		System.out.println("Homogeneous and Heterogeneous elements can be stored.");
		System.out.println("Duplicate elemnets are allowed.");
		System.out.println("Insertion order is also maintained.");
		System.out.println();

		System.out.println("Elements of LinkedList: " + l);

	}

}
