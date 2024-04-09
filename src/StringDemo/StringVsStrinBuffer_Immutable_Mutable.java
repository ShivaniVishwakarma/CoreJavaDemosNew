package src.StringDemo;

public class StringVsStrinBuffer_Immutable_Mutable {

	public static void main(String[] args) {
		
		System.out.println("...............StringBuffer.................");
		
		//String's immutable nature:
		
		String s1=new String ("JAVA");
		System.out.println(s1);
		
		s1.concat(" for beginners");  //concatenated but not assigned
		System.out.println(s1);
		
		s1=s1.concat(" by Ganesh");	  
		System.out.println(s1);
		
		System.out.println(".....................StringBuffer...................");
		
		//StringBuffer's mutable nature:
		
		StringBuffer s2=new StringBuffer("JAVA");
		System.out.println(s2);
		
		s2.append(" for beginners");
		System.out.println(s2);
		
	}

}
