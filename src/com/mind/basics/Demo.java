package src.com.mind.basics;

public class Demo {
	
	short x=100;
	static short y=200;
	
	public void display()
	{
		System.out.println("Inside display method..");
	}
	
	public static void main(String[] args) {
		Demo d= new Demo();
		d.display();

	}

}
