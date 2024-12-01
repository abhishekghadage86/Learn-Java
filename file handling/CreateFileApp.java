import java.io.*;
public class CreateFileApp
{
	public static void main(String x[])
	{
		File f=new File("G:\\java Practical\\Abhi");
		boolean b1=f.exists();
		if(b1)
		{
			System.out.println("File is already exist....");
		}
		else 
		{
		boolean  b=f.mkdir();
		if(b)
		{
			System.out.println("File successfully generated");
		}
		else 
		{
			System.out.println("File genration problem ......");
		}
		}
	}
}