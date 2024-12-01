import java.io.*;
import java.util.*;
public class WriteFileDataApp
{
	public static void main(String x[])throws IOException
	{
		File fw[]=File.listRoots();
		for(int i=0;i<fw.length;i++)
		{
			System.out.println(fw[i]);
		}
		Scanner sc=new Scanner(System.in);
		String data=sc.nextLine();
		FileWriter f=new FileWriter("G:\\java Practical\\Abhi\\Abhi.docx");
		f.write(data);
		f.close();
		System.out.println("Data write sucessfully in file");
	}


}