package src.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDemo {

	public void createConnection() throws ClassNotFoundException
	// It will show compilation error if you remove throws keyword - Checked exception
	{
		//Class.forName("");
	}

	public static void main(String[] args) throws FileNotFoundException {
		// It will show compilation error if you remove throws keyword - Checked exception

		FileInputStream f = new FileInputStream("D:\\shivani_1.txt"); //Exception msg is thrown at runtime if file is not present there
	
		
	}

}
