package src.ExceptionHandling;

public class ThrowDemo {
	// Throw keyword is used to explicitly create an object of Exception class and
	// provide it to JVM to handle it
	// throw new ArithematicException("/ by zero");
	// It has to be used with customizes/user-defined exceptions

	public static void main(String[] args) {

		int amount = 2000;
		int balance = 1000;

		try {
			if (amount > balance) {
				throw new InsufficientBalanceException();
			}
			else
			{
				int new_balance=balance-amount;
				System.out.println("New balance = "+ new_balance);
			}
		} catch (InsufficientBalanceException e) {
			e.printStackTrace();
		}
		
	}

}
