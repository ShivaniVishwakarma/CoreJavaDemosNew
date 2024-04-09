package src.ConstructorDemo;


//OOPS - Abstraction, encapsulation, inheritance,polymorphism
public class ConstructorDemo {

	//There is no need to initialize the instance/static variables, default value is assigned by java
	private int a; //instance variable
	static int b; //static variable
	
	//Non-parameterised constructor
	public ConstructorDemo()
	{
	System.out.println("Inside Test() constructor");	
	}
	
	//Normal method having the same name as a class
	public void Test()
	{
		
	System.out.println("Inside Test() method");	
	}
	
	
	public ConstructorDemo(String name)
	{
	System.out.println(name);	
	}
	
	//instance/non-static method/instance area
	public void show()
	{
		int c;
		// System.out.println(c); //LOCAL VARIABLE SHOULD BE INITIALISED
		System.out.println("Calling static a inside non-static show"+a); //no error, non-static can call non-static
		System.out.println("Calling static b inside non-static show"+b); //no error, non-static can call static also
	    System.out.println("calling static display from non-static show method");
		display();
	}
	//static method/static area
	public static void display()
	{
		//System.out.println(a); //cant call using without object
		//System.out.println(t.a); cant call using object also as this method is out of the scope of object t
		System.out.println("Calling static b inside static display"+b);
	//	show();  cant call non-static method from static method directly
	}
	
	public void bye()
	{
		show(); //call of non-static from non-static
		display(); //call of static from non-static
	}
	
	//static method/static area
	public static void main(String[] args) {
		
		ConstructorDemo t = new ConstructorDemo();
		t.Test();
		ConstructorDemo t1 = new ConstructorDemo("abc");
		
		t.show();
		System.out.println("Calling non-static a inside static main"+t.a); //call of non-static variable from a static method with use of a reference variable
	  
		//System.out.println(a); This will throw error as static cannot call non-static directly (needs object) 
		t.display(); //static method can access another static method using an object
		display(); //static method can access another static method directly
		ConstructorDemo.display(); //static method can access another static method using class name
		System.out.println("Calling static b inside static main"+t.b);
		System.out.println("Calling static b inside static main"+b);
	
}
}
