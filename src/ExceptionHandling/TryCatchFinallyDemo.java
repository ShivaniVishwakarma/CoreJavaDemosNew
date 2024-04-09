package src.ExceptionHandling;

public class TryCatchFinallyDemo {

	public static void show() {

		try {
			System.out.println(10 / 0);
		} catch (Exception e) {
			e.printStackTrace();
			//System.exit(0); //If you write this line, even the finally block will not execute
		} finally {
			System.out.println("I am in finally block"); // This will execute whether an exception occurs or not
		}
	}

	public static void main(String[] args) {
		show();
	}
}
