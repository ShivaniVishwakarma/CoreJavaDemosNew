package src.FileHandlingDemo;
import java.io.FileInputStream;
import java.io.IOException;

public class FIS 
{
  
 public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("D:\\megha.text");
	int c;
	while((c=fis.read())!=-1)
			{
		    System.out.print((char)c);
			}
}
}

