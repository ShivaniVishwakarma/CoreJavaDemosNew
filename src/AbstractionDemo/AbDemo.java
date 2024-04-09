package src.AbstractionDemo;

abstract class AbDemo {
	
	//normal/instance/non-static/concrete
	public void show()
	{
		System.out.println("Inside concrete method show");
	}
	
	//Abstract method
	abstract void display();
	
	public static void main(String[] args) {
		
	// AbDemo ab=new AbDemo();
	// We cant create the object of an abstract class		
		
	}

}
