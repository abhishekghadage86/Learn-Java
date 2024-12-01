//Write a Java  program to read numbers from a file and write even, odd and prime numbers to separate file.
import java.io.*;
import java.util.*;
public class EvenOddApp
{
	public static void main(String x[])throws IOException
	{
		FileReader fr=new FileReader("G:\\java Practical\\Abhi\\demo.txt");
		int data;
		while((data=fr.read())!=-1)
		{
			char ch=(char)data;
			if(ch>=48 && ch<=57)
			{
				FileWriter fw=new FileWriter("G:\\java Practical\\Abhi\\Evenodd.txt",true);
				BufferedWriter bw=new BufferedWriter(fw);
				if(ch%2==0)
				{
					
					String even="Even number ";
					bw.write(even);
					bw.write(ch);
					bw.close();
				}
				else
				{
					String odd="odd number ";
					bw.write(odd);
					bw.write(ch);
					bw.close();
				}					
				
			}
		}
		
	}
}