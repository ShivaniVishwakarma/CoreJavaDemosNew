package src.Overloading;

public class AdditionUsingVarArgs {

	int i,total;
	
	public void add(int ... i)
	{
		System.out.println("Argument lenght: " +i.length);
		total=0;
		for (int x:i)
		{
			total+=x;
		}
		System.out.println("Sum of all integers= " + total);
	}

	public void add(int a,int b)
	{
		total=0;
		total=a+b;
		System.out.println("Sum of two integers= " + total);
	}
	
}
