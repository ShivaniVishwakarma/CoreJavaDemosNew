package src.StringDemo;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		//Same as StringBuffer in case of object creation
		//Differences are:
		// This is non-synchronized
		// Not thread safe
		// High performance
		
		StringBuilder s1 = new StringBuilder("Shivani");
		
		StringBuilder s2 =  new StringBuilder("Shivani");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));		

	}

}
