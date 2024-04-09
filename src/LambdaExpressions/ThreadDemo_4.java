package src.LambdaExpressions;

public class ThreadDemo_4 {

	public static void main(String[] args) {
		
		//Anonymous Inner Class
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Current Thread - " + Thread.currentThread().getName());
			  }
			}
		});
		
		t1.run();
	}
	
	    //Lambda Expression
	
		Thread t2 = new Thread(()-> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Current Thread inside lambda- " + Thread.currentThread().getName());
			}
			});
}


