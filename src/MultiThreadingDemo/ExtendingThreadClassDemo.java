package src.MultiThreadingDemo;

public class ExtendingThreadClassDemo {

	public static void main(String[] args) {
		
		MyThread t1= new MyThread();

		//t1.run(); Treats run as a normal method 
		
		t1.start();
		t1.setPriority(10);
		
		
		System.out.println("Current Thread: "+Thread.currentThread().getName());
		System.out.println("Current Thread Priority: "+Thread.currentThread().getPriority());
		
		System.out.println("Inside Main method.");
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Main : "+i);
			
		}
		

	}

}
