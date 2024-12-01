import java.io.*;
public class ISFileApp
{
	public static void main(String x[])
	{
		{
		File f[]=File.listRoots();
		for(int i=0;i<f.length;i++)
		{
			System.out.println(f[i]);
		}
		}
		File f=new File("G:\\java Practical\\Abhi\\a.docx");
		boolean b=f.isFile();
		if(b)
		{
			System.out.println("path is file");
		}
		else
		{
			System.out.println("Path os not consist path");
		}
	}
}