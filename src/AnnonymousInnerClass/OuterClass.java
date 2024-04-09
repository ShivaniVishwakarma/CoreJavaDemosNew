package src.AnnonymousInnerClass;

public class OuterClass {

	public void m2()
	{
		System.out.println("Concrete Method m2");
	}
	//Anonymous inner class 
	InnerClass i=new InnerClass() {
		
		@Override
		public void m1() {
			System.out.println("Abstract method m1");
			
		}
	};
}
