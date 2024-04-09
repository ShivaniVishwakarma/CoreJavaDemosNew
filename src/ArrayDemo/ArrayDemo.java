package src.ArrayDemo;

public class ArrayDemo {

	public static void main(String[] args) {

		// First method
		System.out.println("....First Method....");
		int[] x; // Array Declaration

		x = new int[3]; // Array initialization

		// Storing values in Array
		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		//x[3]=40; //ArrayIndexOutOfBoundException
		//x[2] ="Shivani"; // Compilation error, Type mismatch

		// Retrieving values from an array
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		

		// Second method
		System.out.println("....Second Method....");
		int[] a = { 1, 2, 3 }; // Array initialization

		// Using for loop for retrieving array elements
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		// Third method
		System.out.println("....Third Method....");
		int[] b = { 100, 200, 300 };

		// Using for-each loop for retrieving array elements
		for (int p : b) {
			System.out.println(p);
		}

		System.out.println("......................");

		System.out.println("....Fourth Method....");
		// Declaring array literal
		int[] intArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println("......................");

		// An int array can support char,byte,short and int values
		System.out.println("Integer array supporting char, byte, short and int values");
		int[] c = new int['a']; // This will print ascii value of a=97
		System.out.println("Array length which we gave as 'a': " + c.length);
		c[0] = 'd';
		System.out.println("Value of c[0] which we gave as 'd' : " + c[0]);
		// c[1]=22f; Compilation error
		
		int[] y=x.clone();
		System.out.println("Used cloning method of array");
		for (int i = 0; i < y.length; i++) {
			System.out.println(y[i]);
		}
		
	}

}
