package src.AnnonymousInnerClass2;

//Java program to demonstrate Anonymous inner class 
interface Age 
{ 
  int x = 21; 
  void getAge(); 

} 

abstract class Gender
{
	abstract void getGender();
}

class AnonymousDemo 
{ 
  public static void main(String[] args) { 

      // Myclass is hidden inner class of Age interface 
      // whose name is not written but an object to it  
      // is created. 
      Age oj1 = new Age() { 
          @Override
          public void getAge() { 
               // printing  age 
              System.out.println("Age is "+x); 
          } 
      }; 
      
      oj1.getAge(); 
      
      Gender g=new Gender() {
		
		@Override
		void getGender() {
			System.out.println("Female");
			
		}
	};
	
	g.getGender();
  } 
}