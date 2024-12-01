import java.util.*;
import java.io.*;
public class FileWrreCopyImgApp
{
	public static void main(String x[])throws Exception
	{
		Scanner sc=new Scanner(System.in);
		File f=new File("G:\\java Practical\\Abhi\\l.png");
		boolean b=f.exists();
		if(b)
		{
			FileReader fr=new FileReader("G:\\java Practical\\Abhi\\l.png");
			FileWriter fw=new FileWriter("G:\\java Practical\\Abhi\\demo\\l.png");
			int data;
			if((data=fr.read())!=-1)
			{
				fw.write(data);
				
			}
			fw.close();
			System.out.println("File is save sucessfully........");
		}
		else
		{
			System.out.println("File is not exist");
		}
	}
}
