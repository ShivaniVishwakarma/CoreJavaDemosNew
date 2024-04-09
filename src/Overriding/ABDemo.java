package src.Overriding;

public class ABDemo {
	public static void main(String[] args) {
	
		System.out.println("Calling functions using parent class object");
		//Using parent class object, we can call all the methods of child class but no method of child class
		A a =new A();
		a.m1(); //A class's m1 method
		a.m2(); //A class's m2 method
		a.m3(); //A class's m3 method
		a.m4(); //A class's m4 method
		//Compile time errors when we call child class methods from parent class object:
		//a.m5();
		//a.m6();
		System.out.println("...............................");
		
		System.out.println("Calling functions using child class object");
		//Using child class object, we call all the methods of child as well as parent class
		B b=new B();
		b.m1(); //B class's m1 method
		b.m2(); //B class's m2 method
		b.m3(); //A class's m3 method
		b.m4(); //A class's m4 method
		b.m5(); //B class's m5 method
		b.m6(); //B class's m6 method
		System.out.println("...............................");
		
		System.out.println("Calling functions using parent class reference but child class object");
		A a1=new B();
		a1.m1(); //B class's m1 method
		a1.m2(); //B class's m2 method
		a1.m3(); //A class's m3 method
		a1.m4(); //A class's m4 method
		//a1.m5(); //Compile time errors when we call child class methods from parent class reference:
		//a1.m6(); //Compile time errors when we call child class methods from parent class reference:
}
}
