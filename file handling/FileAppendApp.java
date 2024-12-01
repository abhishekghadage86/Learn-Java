//Write a Java  program to append content to a file.
import java.io.*;
import java.util.*;
public class FileAppendApp
{
	public static void main(String x[])throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String or data");
		String str=sc.nextLine();
		FileWriter fw=new FileWriter("G:\\java Practical\\Abhi\\demo.txt",true);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(str);
		bw.close();
		fw.close();
		System.out.println("Data save....");
	}
}