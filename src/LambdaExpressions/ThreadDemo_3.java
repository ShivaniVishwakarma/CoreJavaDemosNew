package src.LambdaExpressions;

public class ThreadDemo_3 {

	//Using anonymous inner class
	
	public static void main(String[] args) {

		Runnable r = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Current Thread - " + Thread.currentThread().getName());

				} // for ends

			} // run ends
		};

		Thread t1=new Thread(r);
		t1.setName("First");
		
		Thread t2=new Thread(r);
		t2.setName("Second");
		
		t1.start();
		t2.start();
		
	}

}
