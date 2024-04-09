package src.StringDemo;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		//In StringBuffer class, the equals() method as well as the == operator, both compares the reference of an object and not the values
		//This is because the StringBuffer class has not overridden the equals() of Object class to compare the content.
		//It has used its default implementation to compare the reference 
		// This is synchronized
		// Thread safe
		// Slow performance
		
		StringBuffer s1 = new StringBuffer("Shivani");
				
		StringBuffer s2 =  new StringBuffer("Shivani");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));		

	}

}
