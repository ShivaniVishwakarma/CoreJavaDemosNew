package src.com.mind.basics;

public class B {

	public static void main(String[] args) {
		//We can create an object of one class into other class if that class is public
		//Since class A is public, we can create its object in another class
		A a = new A();
		a.show();
		
	}
}
