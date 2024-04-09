package src.CollectionDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListVersusSet {

	public static void main(String[] args) {

		System.out.println("......................LIST......................");

		// Homogeneous and heterogeneous elements can be stored
		// Duplicate elements are allowed
		// Insertion order is maintained

		List al = new ArrayList(); // al is a object of implemented class of List, i.e. of Arraylist
		System.out.println("al is object of implemented class of List, i.e. of Arraylist - " + al.getClass().toString());

		al.add(10);
		al.add(10);
		al.add(20);
		al.add("Shivani");

		System.out.println("Duplicates allowed and insertion order is maintained: " + al);

		System.out.println();

		System.out.println(".....................SET.......................");

		// Homogeneous and heterogeneous elements can be stored
		// Duplicate elements are not allowed
		// Insertion order is not maintained

		Set s = new HashSet();
		System.out.println("s is object of implemented class of Set, i.e. of HashSet - " + s.getClass().toString());

		s.add(10);
		s.add(10);
		s.add(20);
		s.add(30);
		s.add("Shivani");

		System.out.println("Duplicate elemnets are not stored/printed and insertion order is also not maintained : " + s);

	}

}
