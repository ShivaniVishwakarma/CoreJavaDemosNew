package src.ExceptionHandling;

public class InsufficientBalanceException extends RuntimeException {

	public InsufficientBalanceException()
	{
		System.out.println("Your balance is less than the withdrawal amount");
	}
	@Override
	public void printStackTrace() {
	System.out.println("Insufficient Balance");
	}
}
