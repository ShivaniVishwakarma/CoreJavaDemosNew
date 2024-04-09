package src.LambdaExpressions;

public class ThreadDemo_2 {

	//Using Runnable
	
	public static void main(String[] args) {
		
		MyThread_2 m =new MyThread_2();
		
		Thread t1=new Thread(m);
		t1.setName("First");
		
		Thread t2=new Thread(m);
		t2.setName("Second");
		
		t1.start();
		t2.start();

	}

}
