package src.StaticInnerClass;

public class Demo {

	public static void main(String[] args) {
		
		A a = new A();
		
		A.B b = new A.B(); //Creating object of a static class  

		b.show();
	}

}
