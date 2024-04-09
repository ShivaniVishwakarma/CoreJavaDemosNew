package src.ExceptionHandling;

public class ArrayIndexOutOfBoundDemo {

	public static void main(String[] args) {

		int[] a = new int[2];

		try {
			a[0] = 10;
			a[1] = 20;
			a[3] = 30; //Exception occurs here-assigning values more than array size

		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

		//You should not put the below three lines inside try block
		// Because as soon as the exception occurs, the program control is moved to catch block and then below it.
		//The control will not come back to try block after handling it.
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);

	}

}
