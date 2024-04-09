package src.Overriding;

public class B extends A{

	@Override
	public void m1() {
		System.out.println("B class's m1 method");
	}
	@Override
	public void m2() {
		System.out.println("B class's m2 method");
	}
	
	public void m5() {
		System.out.println("B class's m5 method");
	}
	
	public void m6() {
		System.out.println("B class's m6 method");
	}
}
