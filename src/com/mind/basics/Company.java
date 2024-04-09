package src.com.mind.basics;

public class Company {

	int a=10;
	static int b=40;
	
	public static void main(String[] args) {
	
		Company c= new Company();
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println("....................");
		
		c.a+=10;
		c.b+=20;
		
		System.out.println(c.a);
		System.out.println(c.b);
		
		System.out.println("....................");
		
		Company c1= new Company();
		System.out.println(c1.a);
		System.out.println(c1.b);
	}

}
