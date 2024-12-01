import java.io.*;
public class DirectoryornotApp
{
	public static void main(String x[])
	{
		File f=new File("G:\\java Practical\\Abhi\\a.docx");
		boolean b=f.isDirectory();
		if(b)
		{
			System.out.println("File is directory");
		}else
		{
			System.out.println("File is not Directory......");
		}
	}
}