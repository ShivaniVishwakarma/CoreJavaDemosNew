package src.ThisAndSuperDemo;

public class Parent {
	
	int a=1;
	int b=2;

	int c;

	public Parent(){
		c=3;
		System.out.println("Parent constructor");
	}
	
	
	public static void display()
	{
		System.out.println("Inside method Parent.display()");
	}

	
}
