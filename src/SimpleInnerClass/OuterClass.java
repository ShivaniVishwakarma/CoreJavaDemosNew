package src.SimpleInnerClass;

public class OuterClass {

	int a=10;
	
	public void show()
	{
		System.out.println("Show method");
	}
	
  	class InnerClass{
		
  		int b=20;
	}
  	
  	public static void main(String[] args) {
		
  		OuterClass o = new OuterClass();
  		System.out.println(o.a);
  		//System.out.println(o.b);
  		
  		//Case 1:
  		InnerClass i1 = o.new InnerClass();
  		//System.out.println(i1.a);
  		System.out.println(i1.b);
  	
  		//Case 2:
  		OuterClass.InnerClass i2 = o.new InnerClass();
    	//System.out.println(i2.a);
  		System.out.println(i2.b);  		
  		
  		//Case 3:
  		OuterClass.InnerClass oi= new OuterClass().new InnerClass();
    	//System.out.println(oi.a);
  		System.out.println(oi.b);
	}
	
}
