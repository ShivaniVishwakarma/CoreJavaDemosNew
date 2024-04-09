package src.InterfaceDemo;

public interface It1 {

	//All methods are by default public and abstract
	void show();
	public abstract void display();
	
	//Cant right concrete method
//	public void displayConcrete(){
//	}
	
	//We can allow main method inside interface
	public static void main(String[] args) {
		//It1 i=new It1(); //cant create object
	}
}
