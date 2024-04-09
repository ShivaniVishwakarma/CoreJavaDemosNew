package src.AnnonymousInnerClass2;

//Java program to demonstrate need for Anonymous Inner class 

interface Age1 {
	int x = 25;
	void getAge();
}

// MyClass implement the methods of Age Interface
class MyClass implements Age1 {
	@Override
	public void getAge() {
		// printing the age
		System.out.print("Age is " + x);
	}
}

class WithoutAnonymousDemo {
	public static void main(String[] args) {
		// Myclass is implementation class of Age interface
		MyClass obj = new MyClass();

		// calling getage() method implemented at Myclass
		obj.getAge();
	}
}
