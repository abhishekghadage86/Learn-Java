import java.util.*;
import java.io.*;
public class ReadBufferedApp
{
	public static void main(String x[])throws Exception
	{
		Scanner sc=new Scanner(System.in);
		FileReader fr=new FileReader("G:\\java Practical\\Abhi\\Demo\\demo.txt");
			int data;
			while((data=fr.read())!=-1)
			{
				char ch=(char)data;
				Thread.sleep(200);
				System.out.print(ch);
			}
	}
}
