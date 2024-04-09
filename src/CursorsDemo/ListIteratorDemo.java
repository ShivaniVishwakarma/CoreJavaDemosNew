package src.CursorsDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {

		// LIST-ITERATOR INTERFACE
		// 1) It is an interface
		// 2) Used to read and remove data
		// 3) Used only for all classes - legacy + new
		// 4) come in version 1.2
		// 5) Bi-directional
		// 6) It supports all four operations: CRUD (CREATE, READ, UPDATE and DELETE).
		// 7) It is use only of LIST CLASSES - Stack Vector ArrayList LinkedList
		// 8) Methods supported : hasNext() , next(), remove(), set() , add(),
		// hasPrevious(), previous(), nextIndex(), PreviousIndex()

		ArrayList a = new ArrayList();

		for (int i = 1; i <= 10; i++) {
			a.add(i);
		}

		ListIterator i = a.listIterator();
		System.out.println("Before loop for 1st Arraylist of numbers- " + a);

		System.out.println("Using ListIterator");
		while (i.hasNext()) {
			Integer num = (Integer) i.next();
			if (num % 2 == 0) {
				System.out.println(num);
			} else {
				i.remove();
			}
		}

		System.out.println("After loop for 1st Arraylist of numbers- " + a);

		System.out.println("");

		ArrayList a1 = new ArrayList();

		a1.add("Red");
		a1.add("Orange");
		a1.add("Green");
		a1.add("Blue");
		a1.add("Purple");
		a1.add("Pink");

		ListIterator<String> li = a1.listIterator();

		System.out.println("Arraylist of colors Forward direction- ");
		while (li.hasNext()) {
			System.out.println(li.next());

		}

		System.out.println();

		System.out.println("Arraylist of colors Backward direction- ");
		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}

		System.out.println();

		//Replacing new element using set() method
		System.out.println("Adding BLACK instead of Blue in colors- ");
		
		while (li.hasNext()) {
			if (li.next() == "Blue") {
				li.set("BLACK");
				
			} 
		}
		System.out.println(a1);
		
		System.out.println();
		
		//Need to traverse back if other operations are needed - so again doing reverse travesing
		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
		System.out.println("Adding Grey after Pink in colors- ");
		//Adding new element using set() method
		while (li.hasNext()) {
			
			if (li.next() == "Pink") 
			{
				li.add("Grey");
			}
		}
		System.out.println(a1);
	}

}
