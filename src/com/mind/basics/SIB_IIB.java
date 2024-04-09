package src.com.mind.basics;

public class SIB_IIB {

	int a=10;
	static int b=20;
	
	//Constructor
	public SIB_IIB() {
	 System.out.println("Inside Constructor");
	}
	
	//Static Block
	static {
		//static int x;
		int a=10;
		b=100;
		System.out.println("Inside static Block");
	}
	
	//Instance Block
	{
		//static int x;
		int a=10;
		System.out.println(b);
		System.out.println("Inside instance Block");
	}
	
	public static void main(String[] args) {
		System.out.println("Main started");
		SIB_IIB s1=new SIB_IIB();
		SIB_IIB s2=new SIB_IIB();
		System.out.println(s1.b);
	}
}
