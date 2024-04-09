package src.InterfaceDemo;

public class Icici implements BankInterface,LIC{

	@Override
	public void withdraw() {
		System.out.println("Deposit money in ICICI");
		
	}

	@Override
	public void deposit() {
		System.out.println("Withdraw money from ICICI");
		
	}

	@Override
	public void policy() {
		System.out.println("ICICI uses LIC policy");
		
	}



}
