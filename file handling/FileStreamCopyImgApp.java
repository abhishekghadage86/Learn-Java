import java.util.*;
import java.io.*;
public class FileStreamCopyImgApp
{
	public static void main(String x[])throws Exception
	{
		Scanner sc=new Scanner(System.in);
		File f=new File("G:\\java Practical\\Abhi\\l.png");
		boolean b=f.exists();
		if(b)
		{
			
		}
		else
		{
			System.out.println("this path not content image or file");
		}
		FileInputStream fin=new FileInputStream("G:\\java Practical\\Abhi\\Evenodd.txt");
			FileOutputStream fout=new FileOutputStream("G:\\java Practical\\Abhi\\demo\\Evenodd.txt");
			
			int data;
			if((data=fin.read())!=-1)
			{
				fout.write(data);
				
			}
			fout.close();
			fin.close();
			System.out.println("File is save sucessfully........");
	}
}