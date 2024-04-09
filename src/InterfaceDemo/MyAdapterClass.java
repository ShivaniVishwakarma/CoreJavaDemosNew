package src.InterfaceDemo;

public class MyAdapterClass implements BankInterface {

	//This class will keep a default implementation of the bank interface 
	//so that if any other class needs just few methods of it, it can extends
	//this class rather than implementing all the methods of the interface
	
	@Override
	public void withdraw() {
		
		System.out.println("Withdraw method of MyAdapterClass");
	}

	@Override
	public void deposit() {
		System.out.println("Deposit method of MyAdapterClass");
		
	}

}
