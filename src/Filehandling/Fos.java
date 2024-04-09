package src.Filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fos 
{
   public static void main(String[] args) throws IOException {
	   String str=new String("Hello java people");
	   byte[] b=str.getBytes();
	   FileOutputStream fos=new FileOutputStream("D:\\megha.text");
	   for(byte c:b)
	   {
		   fos.write(c);
	   }
	   fos.flush();
	   fos.close();
	   System.out.println("sucess");
	
}
}
