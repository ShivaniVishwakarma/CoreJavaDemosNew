package src.LambdaExpressions;

public class ThreadDemo_1 {

	//Extending Thread class
	
	public static void main(String[] args) {
	
		MyThread_1 t1 = new MyThread_1();
		t1.setName("First");
		
		MyThread_1 t2 = new MyThread_1();
		t2.setName("Second");
		
		t1.start();
		t2.start();
		
		

	}

}
