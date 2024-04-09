package src.dataHidingDemo_AccessSpecifier;

public class Child extends Parent{

	@Override
	public void marry()
	{
		System.out.println("Child choice - meera");
	}
	
	public void show()
	{
		System.out.println("Show method of child class");
	}
	
	//This is NOT method overriding, it is DATA-HIDING, as private methods cannot be overridden	
	private void privateSample() {
		System.out.println("Inside Child");

	}
	
	//Just to check call of private method
//	public static void main(String[] args) {
//		Child c=new Child();
//		c.marry();
//		c.show();
//		c.privateSample();
//	}
}
