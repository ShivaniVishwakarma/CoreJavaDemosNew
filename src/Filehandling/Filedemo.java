package src.Filehandling;

import java.io.File;
import java.io.IOException;

public class Filedemo
{
public static void main(String[] args) throws IOException {
	File f=new File("abc.text");
	System.out.println(f.exists());
	f.createNewFile();
	System.out.println(f.exists());
	System.out.println("Path of file:"+f.getAbsolutePath());
	System.out.println("canwrite of file:"+f.canWrite());
	System.out.println("length of file:"+f.length());
	System.out.println("Name of file:"+f.getName());//text is mantetory
	System.out.println("Parent of file:"+f.getParent());
	System.out.println(f.getPath());//name and path is same
	System.out.println("directory of file:"+f.isDirectory());
	System.out.println("canread of file:"+f.canRead());
	System.out.println(f.isHidden());
}
}
