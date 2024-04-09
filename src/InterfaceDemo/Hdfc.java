package src.InterfaceDemo;

public class Hdfc implements BankInterface,LIC{


	@Override
	public void deposit() {
		System.out.println("Deposit money in HDFC");
		
	}

	@Override
	public void withdraw() {
		System.out.println("Withdraw money from HDFC");
		
	}

	@Override
	public void policy() {
		System.out.println("HDFC uses LIC policy");
		
	}
}
