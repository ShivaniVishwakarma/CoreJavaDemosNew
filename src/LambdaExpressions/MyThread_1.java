package src.LambdaExpressions;

public class MyThread_1 extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println("Current Thread - " + Thread.currentThread().getName());
		}
	
	}
}
