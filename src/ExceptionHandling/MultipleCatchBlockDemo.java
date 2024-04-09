package src.ExceptionHandling;

public class MultipleCatchBlockDemo {

	public static void main(String[] args) {
		
		//The catch blocks should follow down to top hierarchy of exception classes
		//The first Exception should not be the parent of second exception
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			System.out.println("Inside Arithematic Exception");
		} catch (Exception e) {
			System.out.println("Inside Exception");
		}

	}

}
