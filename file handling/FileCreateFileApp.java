import java.util.*;
import java.io.*;
public class FileCreateFileApp
{
	public static void main(String x[])throws Exception
	{/*
		File f=new File("G:\\java Practical\\Abhi\\Demo\\demo.txt");
		boolean b=f.createNewFile();
		if(b)
		{
			System.out.println("file is created...");
		}
		else
		{
			System.out.println("file is already exist");
		}
		FileWriter f=new FileWriter("G:\\java Practical\\Abhi\\Demo\\demo.txt");
		char ch='A';
		f.write(ch);
		f.close();
		System.out.println("Data Write is successfully................");
		FileWriter f=new FileWriter("G:\\java Practical\\Abhi\\Demo\\demo.txt");
		String data="Abhishek Ghadage";
		f.write(data);
		f.close();
		System.out.println("Data Write is successfully................");
		FileWriter f=new FileWriter("G:\\java Practical\\Abhi\\Demo\\demo.txt",true);
		Scanner sc=new Scanner(System.in);
		char ch[]=new char[]{'a','f','g','e','g'};
		for(int i=0;i<5;i++)
		{
		System.out.println(ch[i]);
		
		f.write(ch[i]);
		
		}f.close();	*/
		/*------------------------------------------------
		int len=5;
		int offset=1;
		FileWriter f=new FileWriter("G:\\java Practical\\Abhi\\Demo\\demo.txt",true);
		String str="Abhishek Ghadage";
		char ch[]=str.toCharArray();
		//char ch[]=new char[]{'a','f','g','e','g'};
		for(int i=0;i<5;i++)
		{
			f.write(ch[i],offset,len);
		}
		f.close();
		-------------------------------------------------------------*/
	}
}