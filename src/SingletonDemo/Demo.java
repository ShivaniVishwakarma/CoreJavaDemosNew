package src.SingletonDemo;

public class Demo {

	public static void main(String args[]) 
    { 
		
		Singleton_1 s1 = Singleton_1.getInstance();
		Singleton_1 s2 = Singleton_1.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
		
		System.out.println("...............................");
         
        Singleton x = Singleton.getInstance(); 
        Singleton y = Singleton.getInstance();       
        Singleton z = Singleton.getInstance(); 
  
        // changing variable of instance x 
        x.s = (x.s).toUpperCase(); 
  
        System.out.println("String from x is " + x.s); 
        System.out.println("String from y is " + y.s); 
        System.out.println("String from z is " + z.s); 
        System.out.println("\n"); 
  
        // changing variable of instance z 
        z.s = (z.s).toLowerCase(); 
  
        System.out.println("String from x is " + x.s); 
        System.out.println("String from y is " + y.s); 
        System.out.println("String from z is " + z.s); 
    } 
}
