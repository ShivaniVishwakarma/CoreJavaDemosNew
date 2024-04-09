package src.CollectionDemo;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		System.out.println("...............TreeSet...................");
		System.out.println();

		// Only Homogeneous elements can be stored
		// Duplicate elements are not allowed
		// NATURAL OREDERING IS MAINTAINED !! not INSERTION ORDER..!!
		// Can only store types which implement Comparable interfaces - 8 wrapper classes + String Class
		// Wrapper Classes : Byte, Short, Integer, Long, Float, Double, Boolean, Char
		// The natural sorting order is maintained because it implements Comparable

		Set s = new TreeSet();

		//WHILE ADDING EVERY ELEMENT, IT WILL COMPARE IT TO ALL PREVIOUS ONES
		//AND THEN IMPLICITLY DECIDES THE POSITION OF NEW ORDER
		
		s.add(40);
		s.add(10);
		s.add(10);
		s.add(20);
		s.add(30);
		
		//This will be stored in numerical order - 10, 20, 30, 40
		
		// s.add("Shivani"); //Can't store heterogeneous elements

		System.out.println("Only Homogeneous elements can be stored.");
		System.out.println("Duplicate elemnets are not stored/printed.");
		System.out.println("NATURAL OREDERING IS MAINTAINED !! not INSERTION ORDER..!!");
		System.out.println("Can only store types which implement Comparable interfaces - 8 wrapper classes + String Class");
		System.out.println();
		System.out.println("Elements in TreeSet s - " + s);
		
		System.out.println();

		Set s1 = new TreeSet();

		s1.add("red");
		s1.add("green");
		s1.add("blue");
		s1.add("pink");
		s1.add("black");
		
		//This will be stored in alphabetical order-  [black, blue, green, pink, red]
	
		//Can only store Wrapper class object in tree set - Only they implement Comparable
		//java.lang.StringBuffer cannot be cast to java.lang.Comparable
		//s1.add(new StringBuffer("WHITE"));
		
		System.out.println("Elements in TreeSet s1 - " + s1);
		
	}

}
