package src.CursorsDemo;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {
		
		//ENUMERARTION INTERFACE
		// 1) It is an interface
		// 2) Used to read data
		// 3) Used only for legacy classes - Stack and vector
		// 4) come in version 1.0
		// 5) Unidirectional
		// 6) Only supports R of CRUD 
		// 7) It is not a universal cursor
		// 8) Methods - hasMoreElements() and nextElement()
		
		
		Vector v= new Vector();
		
		//Case 1: For loop to read/insert elements
		System.out.println(" Inserting Using for loop");
		for (int i=1; i<=10;i++)
		{
			v.addElement(i);
		}
		
		System.out.println("................................");
		
		//case 2: by using java sysout function
		System.out.println(" Printing using println()");
		System.out.println(v); 
		System.out.println("................................");
		
		//Case 3:By using for each loop
		System.out.println(" Printing using for-each loop");
		for (Object object : v) {
			System.out.println(object);
		}
		System.out.println("................................");
		
		//case 4 : By using java cursor - Enumeration
		Enumeration e =v.elements();
		System.out.println("Enumerarion e reference is of calss : "+e.getClass().getName());
		System.out.println("Using Enumeration");
		while (e.hasMoreElements())
		{
			Integer i = (Integer) e.nextElement();
			if(i%2==0) {
				System.out.println(i);
			}
			else {
				//System.out.println(i);
			}
		}
		
	/*	ArrayList a =new ArrayList();
		for (int i=1; i<=10;i++)
		{
			a.add(i);
		}
		*/
		//Enumeration cursor works only for legacy classes - Vector and Stack
		//Enumeration e1 =a.elements(); 
	}

}
