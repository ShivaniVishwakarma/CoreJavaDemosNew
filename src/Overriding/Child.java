package src.Overriding;

public class Child extends Parent{

	@Override 
	public void marry()
	{
		System.out.println("Child choice - meera");
	}
	
	public void show()
	{
		System.out.println("Show method of child class");
	}
}
