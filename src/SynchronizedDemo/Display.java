package src.SynchronizedDemo;

public class Display {

	public synchronized void wish(String name)
	{
		for(int i =0; i<6; i++)
		{
			System.out.println("Good morning");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				
			}
			System.out.println(name);
		}
	}
	
	public void show()
	{
		System.out.println("...................");
	}
}
