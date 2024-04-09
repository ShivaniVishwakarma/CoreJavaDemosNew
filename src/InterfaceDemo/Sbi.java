package src.InterfaceDemo;

public class Sbi implements BankInterface,LIC{
	
	@Override
	public void deposit() {
		System.out.println("Deposit money in SBI");
	}

	@Override
	public void withdraw() {
		System.out.println("Withdraw money from SBI");
	}

	@Override
	public void policy() {
		System.out.println("SBI uses LIC policy");

	}

}
