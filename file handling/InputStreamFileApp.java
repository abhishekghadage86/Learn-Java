import java.io.*;
import java.util.*;
public class InputStreamFileApp
{
	public static void main(String x[])throws Exception
	{
		/*Scanner sc=new Scanner(System.in);
		FileInputStream fin=new FileInputStream("G:\\java Practical\\Abhi\\Demo\\demo.txt");
		int data;
		while((data=fin.read())!=-1)
		{
			char ch=(char)data;
			System.out.print(ch);
			Thread.sleep(100);
		}*/
		FileInputStream fin=new FileInputStream("G:\\java Practical\\Abhi\\Demo\\demo.txt");
		int data;
		while((data=fin.read())!=-1)
		{
			char ch=(char)data;
			Thread.sleep(200);
			System.out.println(ch);
		}
	}
}
