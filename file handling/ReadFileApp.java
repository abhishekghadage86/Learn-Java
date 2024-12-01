//Write a Java  program to read file contents and display on console.
import java.io.*;
import java.util.*;
public class ReadFileApp
{
	public static void main(String x[])throws Exception
	{
		FileReader fr=new FileReader("G:\\java Practical\\Abhi\\demo.txt");
			int data;
		while((data=fr.read())!=-1)
		{
			
			char ch=(char)data;
			System.out.print(ch);
			Thread.sleep(500);
		}
	}
}