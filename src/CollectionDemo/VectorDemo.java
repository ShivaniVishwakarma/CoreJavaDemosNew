package src.CollectionDemo;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		System.out.println("..............Vector................");

		// Homogeneous and heterogeneous elements can be stored
		// Duplicate elements are allowed
		// Insertion order is maintained

		List v = new Vector();
		v.add(10);
		v.add(10);
		v.add(20);
		v.add("Shivani");

		System.out.println();
		System.out.println("Homogeneous and Heterogeneous elements can be stored.");
		System.out.println("Duplicate elemnets are allowed.");
		System.out.println("Insertion order is also maintained.");
		System.out.println();

		System.out.println("Elements of Vector: " + v);

		// VECTOR and STACK can use their own old methods of V 1.0 as well as collection
		// class methods of v 1.2, which makes it a legacy class

		System.out.println("......Using vector class methods......");
		System.out.println();
		
		Vector v1 = new Vector<>();

		v1.add(10);
		v1.addElement("Shivani"); // Old method of vector class
		v1.addElement(20);
		v1.add(30);
		v1.add(50);
		System.out.println("Elements in vector v1 : " + v1);
		
		v1.removeElement(30);
		v1.removeElementAt(3);
		
		System.out.println("First element: "+v1.firstElement());
		System.out.println("Last element: "+ v1.lastElement());
		System.out.println("Elements in vector v1 : " + v1);
		
		v1.removeAllElements();
		
		System.out.println("Elements in vector v1 : " + v1);

	}

}
