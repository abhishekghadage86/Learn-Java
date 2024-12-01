import java.io.*;
public class CreatefilemethodApp
{
	public static void main(String []x)throws IOException
	{
		File f=new File("G:\\java Practical\\Abhi\\.Abhi.docx");
		boolean b=f.createNewFile();
		if(b)
		{
			System.out.println("New File is created successfully");
		}
		else 
		{
			System.out.println("There is some problem for create file");
		}
		
		
		
	}	
}