import java.io.*;
import java.util.*;
public class WriterclassMethodApp
{
	public static void main(String x[])throws IOException
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Line for enter data in file ");
		String str=sc.nextLine();
		char ch=sc.next().charAt(0);
		FileWriter f=new FileWriter("G:\\java Practical\\Abhi\\Abhi.txt",true);// when we use true then it perform append modes
		f.write(str);
		
		f.close();
		
			System.out.println("Data insert successfully");
		
		
	}
}