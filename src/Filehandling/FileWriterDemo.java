package src.Filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo 
{
 public static void main(String[] args) throws IOException
 {
	FileWriter fw=new FileWriter("D:\\megha.text");
	System.out.println("sucess");
	char[ ] ch= {'h','e','l','l','o'};
	String s="Hello how are you";
	String[] s1= {"hello people ","how r u ","bye everyone"};
	for(char d: ch)
	{
		fw.write(d);
	}
	fw.write(" ");
	//fw.write(s);
	/*fw.write(s1[0]);
	fw.write(s1[1]);
	fw.write(s1[2]);*/ //it is used to write array of string
	//second case by for each loop

	for(String string : s1)
	{
		fw.write(string);
	}
	fw.close();
	System.out.println("load sucess");
	
}
}

