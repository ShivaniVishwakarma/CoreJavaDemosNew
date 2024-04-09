package src.SingletonDemo;

public class Singleton_1 {

	private static Singleton_1 s= null;
	
	private Singleton_1()
	{
		System.out.println("Inside constructor");
	}
	
	// static method to create instance of Singleton class 
	 public static Singleton_1 getInstance() 
	 { 
	     if (s == null)
	     {
	         s = new Singleton_1(); 
	     }
	     else {
	    	 return s;
	     }
	     return s;
	 } 
	 
}
