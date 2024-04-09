package src.MethodLocalInnerClassDemo;

public class A {

	int p = 10; //instance variable

	public void show() {

		final int r =30; //Local variables can only use one modifier i.e. final (all others are of no use for local variables)
		int s=10; //local without final are also accessible inside inner class
		
		class B {
			
			int q = 20; //instance variable

			public void display() {
				
				System.out.println(r);
		        System.out.println(s); 
				System.out.println(p);
				System.out.println(q);
			}// display ends

		}// class B ends

		B b = new B();
		b.display();
		
	} //show ends

}//A ends
