package src.WrapperClasses;

public class WrapperDemo {

	public static void main(String[] args) {
		
		Integer i1= new Integer(10);
		Integer i2= 10;
		
		Integer x=100;
		Integer y = 100;
		
		Integer x1=1000;
		Integer y1 = 1000;
		
		System.out.println(x==y);
		System.out.println(i1==i2);
		System.out.println(x1==y1); // This returns false because the buffer for wrapper classes is between -128 to 127

		//NOTE : All wrapper classes have overridden the equals method of object class to match the content of object.
	}

}
