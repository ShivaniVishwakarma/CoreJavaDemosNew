package src.Overloading;

public class AdditionWithoutOverloading {

	int a,b,c,d,total;
		
	public void addTwoNos(int a,int b)
	{
		total=0;
		total=a+b;
		System.out.println("Sum of two integers= " + total);
	}
	
	public void addThreeNos(int a,int b, int c)
	{
		total=0;
		total=a+b+c;
		System.out.println("Sum of three integers = " + total);
	}
	
	public void addFourNos(int a,int b, int c, int d)
	{
		total=0;
		total=a+b+c+d;
		System.out.println("Sum of four integers = " + total);
	}
}
