package src.CursorsDemo;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		
		//ITERATOR INTERFACE
		// 1) It is an interface
		// 2) Used to read and remove data
		// 3) Used only for all classes - legacy + new
		// 4) come in version 1.2
		// 5) Unidirectional
		// 6) Only supports R and D of CRUD 
		// 7) It is a universal cursor
		// 8) Methods supported : hasNext() , next(), remove(), forEachRemaining()
		
		
		ArrayList a =new ArrayList();
		
		for (int i=1; i<=10;i++)
		{
			a.add(i);
		}
		
		Iterator i =a.iterator();
		
		System.out.println("Before loop - " +  a);
		
		System.out.println("Using Iterator");
		while (i.hasNext())
		{
			Integer num = (Integer) i.next();
			if(num%2==0) {
				System.out.println(num);
			}
			else {
				i.remove();
			}
		}
		
		System.out.println("After loop - " +  a);

	}

}