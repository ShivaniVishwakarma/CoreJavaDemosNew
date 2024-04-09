package src.FileHandlingDemo;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo
{
  public static void main(String[] args) throws IOException {
	FileReader f=new FileReader("D:\\megha.text");
	/*int c;
	while((c=f.read())!=-1) //initially file folacte by f 
	//then it willgo to read then the value present in read data is store in c 
	 //then c will continue still it will not become -1
	  //after completing all data
	{
		System.out.print((char)c); // c shows ascii value if want to print character then use char
	}*/
	char c;
	while(f.ready())
	{
		System.out.println(c=(char)f.read());
	}
}
}
