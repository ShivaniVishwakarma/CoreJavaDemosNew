package src.MultiThreadingDemo;

public class ImplementingRunable {

	public static void main(String[] args) {
		
		MyRunnable m =new MyRunnable();
		m.run(); // Acts as normal method
		System.out.println();
		Thread t = new Thread(m); //m is passed in thread
		t.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("Main : "+i);
			
		}
		
	}

}
