package src.com.mind.basics;

public class StaticDemo {

	public static void main(String[] args) {
		
		//This not method overriding. It is method hiding
		
		Child c= new Child();
		c.display();
		
		Parent p=new Parent();
		p.display();

		// As per overriding rules this should call to Child class static
		// overridden method. Since static method can not be overridden, it
		// calls Base's display()
		Parent p1=new Child();
		p1.display();

		System.out.println(Parent.d);

	}

}
