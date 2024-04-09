package src.StaticInnerClass;

public class A {

	int a=10;
	static int b=20;
	
	static class B //Static classes can be created as inner classes only..!! A normal calss cannot be made as static
	{
		int c=30;
		
		public void show()
		{
			//System.out.println(a); // Can't access non-static inside static
			System.out.println(b);
			System.out.println(c);
		}
	}
}


//Illegal to define a normal class as static

/*static class Z{
	
}*/