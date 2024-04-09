package src.AnnonymousInnerClass;

public class Demo {

	public static void main(String[] args) {	
		
		OuterClass oc=new OuterClass();
		oc.m2();
		oc.i.m1(); //Calling of anonymous inner class's method
	}

}
