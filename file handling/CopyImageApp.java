//we can copy the image using the stream classes ss
import java.util.*;
import java.io.*;
public class CopyImageApp
{
	public static void main(String x[])throws Exception
	{
		Scanner sc=new Scanner(System.in);
		File f=new File("G:\\java Practical\\Abhi\\l.png");
		boolean b=f.exists();
		if(b)
		{
			System.out.println("Exists image in this folder");
		}
		else
		{
			System.out.println("Image or path is not exists");
		}
		FileInputStream fin=new FileInputStream("G:\\java Practical\\Abhi\\l.png");
		FileOutputStream fout=new FileOutputStream("G:\\java Practical\\Abhi\\Demo\\l.png",true);
		int data;
		while((data=fin.read())!=-1)
		{
			fout.write(data);
			
		}
		fin.close();
		fout.close();
		System.out.println("Save image....");
		
	}
}