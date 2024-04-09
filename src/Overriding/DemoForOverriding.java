package src.Overriding;

public class DemoForOverriding {

	public static void main(String[] args) {
		
		System.out.println("Calling using parent class object");
		Parent p=new Parent();
		p.marry();
		p.property();
		System.out.println(".......................");
		
		System.out.println("Calling using child class object");
		Child c=new Child();
		c.marry();
		c.property();
		c.show();
		System.out.println(".......................");
		
		System.out.println("Calling using parent class reference");
		Parent p1=new Child();
		p1.marry();
		//p1.show();
		System.out.println(".......................");
				
	}
}
