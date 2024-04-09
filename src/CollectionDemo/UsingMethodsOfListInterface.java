package src.CollectionDemo;

import java.util.ArrayList;
import java.util.List;

public class UsingMethodsOfListInterface {

	public static void main(String[] args) {
	
		List a=new ArrayList();
		
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(20);
		
		System.out.println("Elements of List : "+ a);
		
		a.set(0, "00");
		
		System.out.println("New Elements of List : "+ a);
		
		System.out.println("Value at index 0: "+a.get(0));
		System.out.println("Index of value 20: " + a.indexOf(20));
		System.out.println("Last index of value 20: "+ a.lastIndexOf(20));

		
	}

}
