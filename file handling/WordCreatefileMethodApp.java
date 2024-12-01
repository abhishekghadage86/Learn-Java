import java.io.*;
public class WordCreatefileMethodApp
{
	public static void main(String x[])throws IOException
	{
		File f=new File("G:\\java Practical\\Abhi\\Abhishek.docx");
		boolean c=f.createNewFile();
		if(c)
		{
			System.out.println("File is created");
		}
		else{
			System.out.println("There is some problem...");
		}
		/*
		File f=new File("G:\\java Practical\\Abhi\\Abhisehk");
		boolean b1=f.exists();
		if(b1)
		{
				System.out.println("File is Alraedy exist in folder");
		}
		else
		{
		boolean b=f.mkdir();
		if(b)
		{
			System.out.println("File is created");
		}
		else 
		{
			System.out.println("Enter path has some problem");
		}
		}*/
	}
}