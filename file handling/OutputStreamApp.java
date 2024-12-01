import java.io.*;
import java.util.*;
public class OutputStreamApp
{
	public static void main(String x[])throws Exception 
	{
		Scanner sc=new Scanner(System.in);
		FileOutputStream fout=new FileOutputStream("G:\\java Practical\\Abhi\\Demo\\demo.txt",true);
		/*
		System.out.println("Enter the data");
		String line=sc.nextLine();
		byte b[]=line.getBytes();
		fout.write(b);
		fout.close();
		System.out.println("Save data sucessfully.......");*/
		System.out.println("Enter the character..");
		char ch=sc.next().charAt(0);
		byte b=(byte)ch;
		fout.write(b);
		fout.close();
		System.out.println("save data successfully....");
	}
}