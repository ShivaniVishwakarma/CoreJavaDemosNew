package src.LambdaExpressions;

import java.util.List;
import java.util.ArrayList;

public class LambdaExpressionForEach {

	public static void main(String[] args) {
		
		List<String> list =new ArrayList<>();
		list.add("Red");
		list.add("Green");
		list.add("Blue");
		list.add("Pink");
		list.add("Yellow");
		
		//Without Lambda
		System.out.println("Using normal forEach: ");
		
		for (String i : list) {
			System.out.println(i);
		}
		
		System.out.println();
		
		//With Lambda
		System.out.println("Using forEach with lambda : ");
		
		list.forEach((i)->System.out.println(i));
	}

}
