package src.SimpleInnerClass;

public class A {
	private int a=10;
	private int b=10;
	
	private void show() {
		System.out.println("Outer class Show method");
		System.out.println("a of outer class A from outer class show method: "+ a);
		//System.out.println("b of inner class B : "+ b);
		//display();
	}
	
	public class B {
		int b=20;
		public void display()
		{
			int b=30;
			System.out.println("Inner class display method");
			System.out.println("a of outer class A from inner class display method: "+ a);
			System.out.println();
			System.out.println("local b of inner class B from inner class display method: "+ b);
			System.out.println("instance b of inner class B from inner class display method: "+ this.b);
			System.out.println("instance b of outer class B from inner class display method: "+ A.this.b); //Use instead of super keyword
			System.out.println();
			show();
		}
		
	}

	public static void main(String[] args) {
		
		A a=new A();
		a.show();
		//a.display();

		System.out.println();
		
		B b=a.new B();
		b.display();
		//b.show();
	}

}
