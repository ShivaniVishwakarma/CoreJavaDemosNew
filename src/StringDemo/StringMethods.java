package src.StringDemo;

public class StringMethods {

	public static void main(String[] args) {
		
		System.out.println("length(): ");
		//length()
		String sa="hello"; 
		String sb="whatsup"; 
		System.out.println("string length is: "+sa.length());  
		System.out.println("string length is: "+sb.length());
		System.out.println();
		
		//compareTo()
		System.out.println("compareTo(): ");
		String s1="hello";
		String s2="hello"; 
		String s3="hemlo"; 
		String s4="flag";
		System.out.println(s1.compareTo(s2)); // 0 because both are equal
		System.out.println(s1.compareTo(s3)); //-1 because "l" is only one time lower than "m" 
		System.out.println(s1.compareTo(s4)); // 2 because "h" is 2 times greater than "f"
		System.out.println();
		
		//concat()
		System.out.println("concat(): ");
		String s5="hello";
		s5=s5.concat(" how are you");
		System.out.println(s5);
		System.out.println();
		
		//isEmpty()
		System.out.println("isEmpty(): ");
		String s6=""; 
		String s7="hello"; 
		System.out.println(s6.isEmpty());      // true
		System.out.println(s7.isEmpty());      // false
		System.out.println();
		
		//trim()
		System.out.println("trim(): ");
		String s8="  hello   ";  
		System.out.println(s8+" how are you ");        // without trim()  
		System.out.println(s8.trim()+" how are you "); // with trim()  
		System.out.println();
		
		//toLowerCase & toUpperCase
		System.out.println("toLowerCase() and toUpperCase(): ");
		String s9="HELLO HOW Are You?";
		String s1lower=s9.toLowerCase();
		System.out.println(s1lower);
		String s1upper=s9.toUpperCase();  
		System.out.println(s1upper); 
		System.out.println();
		
		// valueOf
		System.out.println("valueOf(): ");
		int val=20; 
		String s10=String.valueOf(val); 
		System.out.println(s10+17);  
		System.out.println();
		
		//replace - single character
		System.out.println("replace() -single character: ");
		String s11="hello how are you"; 
		String replaceString=s11.replace('h','t'); 
		System.out.println(replaceString); 
		System.out.println();
		
		//replace - whole word
		System.out.println("replace() - whole word: ");
		String s12="Hey, welcome to Edureka"; 
		String rep=s12.replace("Edureka","Brainforce"); 
		System.out.println(rep); 
		System.out.println();
		
		//contains
		System.out.println("contains(): ");
		String name=" hello how are you doing?"; 
		System.out.println(name.contains("how are you"));  // returns true
		System.out.println(name.contains("hello"));        // returns true  
		System.out.println(name.contains("fine"));         // returns false 
		System.out.println();
		
		//equalsIgnoreCase
		System.out.println("equalsIgnoreCase(): ");
		String s13="hello"; 
		String s14="hello"; 
		String s15="hi";
		System.out.println(s13.equalsIgnoreCase(s14));   // returns true
		System.out.println(s13.equalsIgnoreCase(s15));   // returns false
		System.out.println();
		
		//toCharArray
		System.out.println("toCharArray(): ");
		String s16="Welcome to Edureka";
		char[] ch=s16.toCharArray();
		for(int i=0;i<5;i++){
		System.out.println(ch[i]);
		}
		System.out.println();
		
		//getBytes
		System.out.println("getBytes(): ");
		String s17="ABC";
		byte[] b=s17.getBytes(); 
		for(int i=0;i<b.length;i++){ 
		System.out.println(b[i]);
		}
		System.out.println();
		
		//endsWith
		System.out.println("endsWith(): ");
		String s18="hello how are you"; 
		System.out.println(s18.endsWith("u"));       // returns true
		System.out.println(s18.endsWith("you"));     // returns true   
		System.out.println(s18.endsWith("how"));     // returns false
		System.out.println();
		
		//startsWith
		System.out.println("startsWith(): ");
		String s19="hello how are you"; 
		System.out.println(s19.startsWith("h"));       // returns true
		System.out.println(s19.startsWith("hello"));     // returns true   
		System.out.println(s19.startsWith("how"));     // returns false
		System.out.println();
		
		//intern - The java string intern() method returns the interned string. It returns the canonical representation of string.
		//It can be used to return string from memory, if it is created by new keyword. 
		//It creates exact copy of heap string object in string constant pool.
		
		System.out.println("intern(): ");
		String s20=new String("Shivani"); // will create the string in SCP as well as in heap
		String s21=s20.intern(); // This will copy the SCP version of s21(as it is in SCP as well as in heap area) to s21
		String s22="Shivani";  // This points to SCP
		System.out.println(s21==s22); //true
	}

}
