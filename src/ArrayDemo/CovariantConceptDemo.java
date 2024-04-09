package src.ArrayDemo;

public class CovariantConceptDemo {

	public static void main(String[] args) {
		
		//Array of type Object can store all the type of values.
		//This contradicts the array concept of having similar data type values only
		
		System.out.println();
		Object[] o = {20,"shivani" ,'c',20.9};
				
		//IMP - When you create array of type int and store char in it, the ascii 
		//values is printed. But in case of array of object class, the character 
		//value is printed.
		
		for (Object object : o) {
		System.out.println(object + " is of class: "+  object.getClass().toString());	
		}
	}

}
