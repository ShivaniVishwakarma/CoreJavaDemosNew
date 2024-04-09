package src.CollectionDemo;

import java.util.List;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		System.out.println("..............Stack................");

		// Homogeneous and heterogeneous elements can be stored
		// Duplicate elements are allowed
		// Insertion order is maintained

		List s = new Stack();
		s.add(10);
		s.add(10);
		s.add(20);
		s.add("Shivani");

		System.out.println();
		System.out.println("Homogeneous and Heterogeneous elements can be stored.");
		System.out.println("Duplicate elemnets are allowed.");
		System.out.println("Insertion order is also maintained.");
		System.out.println();

		System.out.println("Elements of Stack s: " + s);

		System.out.println();
		System.out.println("........Using Stack methods..........");
		System.out.println();
		
		Stack s1=new Stack();
		s1.push(100);
		s1.push(200);
		s1.push(300);
		
		System.out.println("Elements of Stack s: " + s1);
		
		System.out.println("Using peek: "+s1.peek()); // top most value in stack
		s1.pop();
		System.out.println(s1);

	}

}
