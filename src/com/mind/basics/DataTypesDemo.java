package src.com.mind.basics;

public class DataTypesDemo {

	int a; //checking default values
	boolean bool; //checking default values
	char ch; //checking default values
	float fl; //checking default values
	
	public void test() {
		
		int a=10;
		int b=20;
		float c=10.2f;
		long l=1768768767;
		double d=726.5;
		
		double d1=a; // will show 10.0
		b=(int)l;
		l=(long)d;

		System.out.println("b1st " + b);
		b=(int)c;
		
		System.out.println("d1 " + d1);
		System.out.println("l " + l);
		System.out.println("b " + b);
	}
	
	public static void main(String[] args) {
		
		DataTypesDemo d=new DataTypesDemo();
	
		d.test();
		
		System.out.println("Integers default values-" + d.a); 
		System.out.println("Boolean default values-" + d.bool);
		System.out.println("Char default values-" + d.ch);
		System.out.println("Float default values-" + d.fl);
		

	}

}
