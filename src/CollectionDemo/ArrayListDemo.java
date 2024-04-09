package src.CollectionDemo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		System.out.println("......................ArrayList......................");

		// Homogeneous and heterogeneous elements can be stored
		// Duplicate elements are allowed
		// Insertion order is maintained
		System.out.println();
		
		System.out.println("Homogeneous and Heterogeneous elements can be stored.");
		System.out.println("Duplicate elemnets are allowed.");
		System.out.println("Insertion order is also maintained.");
		
		System.out.println();
		
		
		System.out.println("..................First Method- without loop.....................");
		
		ArrayList a = new ArrayList();
		
		// Adding values in ArrayList -First method
		a.add(10);
		a.add(10);
		a.add(20);
		a.add(30);
		a.add("Shivani");
		
		System.out.println("Printing ArrayList elements directly: " + a);

		System.out.println();

		System.out.println("..................Second Method- with loop.....................");

		ArrayList<Integer> b = new ArrayList<Integer>();
		
		// Adding using for loop
		for (int i = 1; i <= 10; i++) {
			b.add(i);
		}
		
		// Printing using for each loop
		System.out.println("Using for each loop for printing elements : ");
		for (Object x : b) {
			System.out.println(x);
		}
		
		
	}

}
