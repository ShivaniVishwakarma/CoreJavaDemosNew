package src.ArrayDemo;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		//First Method
		System.out.println("First method");
		int[][] a=new int[2][3];
		
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		
		a[1][0]=40;
		a[1][1]=50;
		a[1][2]=60;
			
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[0][2]);
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		System.out.println(a[1][2]);
		
		System.out.println("................................");
		
		//Second method
		System.out.println("Second method - Using for loop");
		
		int[][] b= {{1,2,3,},{4,5,6}};
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.println(b[i][j]);
			}
			
		}
		
		System.out.println(".................................");
		//A 2D array can have uneven number of values in each row
		System.out.println("Uneven number of rown in a 2-D array");
		int[][] c = {
	            		{1, -2, 3}, 
	            		{-4, -5, 6, 9}, 
	            		{7}, 
	      			};
		
		for (int i = 0; i < c.length; ++i) {
	        for(int j = 0; j < c[i].length; ++j) {
	           System.out.println(c[i][j]);
	        }
	     }
		
		  System.out.println("Length of row 1: " + c[0].length);
	      System.out.println("Length of row 2: " + c[1].length);
	      System.out.println("Length of row 3: " + c[2].length);
		
	}

}
