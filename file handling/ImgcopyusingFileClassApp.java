//now we use filereader and filewriter classes for copy the image but image is not visiable in file class classes
import java.util.*;
import java.io.*;
public class ImgcopyusingFileClassApp
{
	public static void main(String x[])throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("This is copy image application\n\n");
		File f=new File("G:\\java Practical\\Abhi\\l.png");
		boolean b1=f.exists();
		if(b1)
		{
			System.out.println("This file present in this path");
		}
		else
		{
			System.out.println("This path not consist image");
		}
		FileReader fr=new FileReader("G:\\java Practical\\Abhi\\l.png");
		FileWriter	fw=new FileWriter("G:\\java Practical\\Abhi\\demo\\l.png");
		int data;
		while((data=fr.read())!=-1)
		{
			
			fw.write(data);
		}
		fw.close();
		fr.close();
		System.out.println("copy the image");
	}
}