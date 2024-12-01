import java.io.*;
import java.util.*;
public class WriteBufferedSApp
{
	public static void main(String x[])throws Exception
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the data ");
		String str=sc.nextLine();
		FileWriter fw=new FileWriter("G:\\java Practical\\Abhi\\Demo\\demo.txt",true);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(str);
		bw.newLine();
		bw.close();
		fw.close();
		System.out.println("Save the successfully..............");
	
	
	}
}
