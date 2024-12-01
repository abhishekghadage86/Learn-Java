import java.io.*;
import java.util.*;
public class ReadlineBufferedApp
{
	public static void main(String x[])throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("This example for readline ");
		FileReader fr=new FileReader("G:\\java Practical\\Abhi\\Demo\\demo.txt");
		BufferedReader br=new BufferedReader(fr);
		String line;
		while((line=br.readLine())!=null)
		{
			System.out.println(line);
			Thread.sleep(600);
		}

	}
}