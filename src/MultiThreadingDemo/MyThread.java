package src.MultiThreadingDemo;

public class MyThread extends Thread{

	@Override
	public void run() //Its empty inside Thread class
	{
		System.out.println("Inside run method");
		System.out.println("Current Thread: "+Thread.currentThread().getName());
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Run : "+i);
			Thread.yield();
	
		}
		
	}
}
