package src.CollectionDemo;

import java.util.ArrayList;

public class GenericCollectionDemo {

	public static void main(String[] args) {

		
		//Used to avoid type safety
		
		ArrayList<Integer> a = new ArrayList<>();

		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		//a.add("Shivani"); //Compile time error

		System.out.println(a);
	}

}
