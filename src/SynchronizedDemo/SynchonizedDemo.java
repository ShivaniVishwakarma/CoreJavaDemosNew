package src.SynchronizedDemo;

public class SynchonizedDemo {

	public static void main(String[] args) {
		
		Display d=new Display();
		MyThread t =new MyThread(d,"Dhoni");
		t.start();
		
			
		MyThread t1=new MyThread(d,"Virat");
		t1.start();

	}

}
