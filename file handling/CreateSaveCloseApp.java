//Write a Java program to create a file and write contents, save and close the file.
import java.io.*;
import java.util.*;
public class CreateSaveCloseApp
{
	public static void main(String x[])throws IOException
	{
		Scanner sc=new Scanner(System.in);
		File f=new File("G:\\java Practical\\Abhi\\demo.txt");
		boolean b=f.createNewFile();
		if(b)
		{	
			System.out.println("File genrate successfully");
		}
		else 
		{
			System.out.println("There is some problem for create file");
		}/*
		String str=sc.nextLine();
		FileWriter fw=new FileWriter("G:\\java Practical\\Abhi\\demo.txt");
		fw.write(str);
		fw.close();
		System.out.println("Data is inserted");*/
		System.out.println("Enter the data in file");
		String data=sc.nextLine();
		FileWriter fw=new FileWriter("G:\\java Practical\\Abhi\\demo.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(data);
		bw.close();
		fw.close();
		System.out.println("Data insert in file using buffered writer");
	}
}