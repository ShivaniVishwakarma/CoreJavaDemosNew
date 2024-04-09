package src.StringDemo;

public class StringDemo {

	public static void main(String[] args) {
	
		// == -> This operator compares the reference
		// equals() --> This method compares the value
		// When we use literals to create string, the string is created in the string constant pool area.
		// When another string object is created having same value using literals, it will point to the same old reference stored in SCP area
		// When using new keyword, the String is created in the heap area as well as in the SCP(if not present there already)
		// When another string object is created having same value using new keyword, it will create another reference in the heap area.
		// String is immutable, when u try to change the value, it will be created in a new memory location

		String s1="shivani";
		String s2="shivani";
		
		System.out.println("s1==s2 when assigned both as literals: " + (s1==s2));  //true
		System.out.println("s1.equals(s2) when assigned both as literals: " + (s1.equals(s2))); //true

		System.out.println("..........................");
		
		String s3=new String("abc");		
		String s4=new String("abc");
		
		System.out.println("s1==s2 when created both using new keyword : " + (s3==s4)); //false
		System.out.println("s1.equals(s2) when created both using new keyword: " + (s3.equals(s4))); //true
		
		System.out.println("..........................");
		
		s1="jeevan";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s1);
		System.out.println(s2);
		
		
	}

}
