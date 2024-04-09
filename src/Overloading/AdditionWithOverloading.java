package src.Overloading;

public class AdditionWithOverloading {

	int a,b,c,d;
	double total;
	
	public void add(int a,int b)
	{
		total=0;
		total=a+b;
		System.out.println("Sum of two integers= " + total);
	}
	
	public void add(int a,int b, int c)
	{
		total=0;
		total=a+b+c;
		System.out.println("Sum of three integers = " + total);
	}
	
	public void add(int a,int b, int c, int d)
	{
		total=0;
		total=a+b+c+d;
		System.out.println("Sum of four integers = " + total);
	}
	
	public void add(int a,double b)
	{
		total=0;
		total=a+b;
		System.out.println("Sum of two integers= " + total);
	}

	public void add(double a,int b)
	{
		total=0;
		total=a+b;
		System.out.println("Sum of two integers= " + total);
	}
}
