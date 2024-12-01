import java.io.*;
import java.util.*;
public class BufferedWriterApp
{
	public static void main(String x[])throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data");
		String data=sc.nextLine();
		FileWriter fw=new FileWriter("G:\\java Practical\\Abhi\\Abhi.txt",true);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(data);
		bw.newLine();
		bw.close();
		fw.close();
		System.out.println("Records insert in file .........");

		
	}
}