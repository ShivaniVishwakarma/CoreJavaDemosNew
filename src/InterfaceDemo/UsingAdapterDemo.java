package src.InterfaceDemo;

public class UsingAdapterDemo extends MyAdapterClass{

	//Just adding the withdraw method from the adapter class
	//No need to implement all methods of bank interface now
	
	public void withdraw()
	{
		System.out.println("Withdraw method");
	}
}
