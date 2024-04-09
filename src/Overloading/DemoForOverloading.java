package src.Overloading;

public class DemoForOverloading {

	//no of args
	//type of diff
	//arrangement of args
	//same method name
	//diffnt body

	public static void main(String[] args) {
		
		//Without Polymorphism
		AdditionWithoutOverloading a=new AdditionWithoutOverloading();
		
		System.out.println("Calling functions of different name without using polymorphism : ");
		a.addTwoNos(50,60);
		a.addThreeNos(60, 70, 80);
		a.addFourNos(18, 7, 9, 77);
		System.out.println("..........................");
		
		//With Overloading
		AdditionWithOverloading a1=new AdditionWithOverloading();
		
		System.out.println("Calling functions of same name with using polymorphism : ");
		a1.add(12, 8);
		a1.add(77, 8, 99);
		a1.add(8, 0, 6, 8);
		
		System.out.println("..........................");
		
		//With Varargs
		System.out.println("Calling functions using Varargs : ");
		AdditionUsingVarArgs a2=new AdditionUsingVarArgs();	
		a2.add(30,4,6,7,8,34,56,10);
		// in case there are two functions present for the same task, one with varargs and one without that, 
		//then without varargs will be called
		a2.add(10, 20); // In this case, add without varargs is called
	}
}
