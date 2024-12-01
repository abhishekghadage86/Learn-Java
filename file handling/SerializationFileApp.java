import java.io.*;
import java.util.*;
class Demo implements Serializable
{
	private int id;
	private String name;
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
}
public class SerializationFileApp
{
	public static void main(String x[])throws Exception
	{
		Scanner sc=new Scanner(System.in);
		FileOutputStream fout=new FileOutputStream("G:\\java Practical\\Abhi\\demo\\Evenodd.txt");
		ObjectOutputStream oout=new ObjectOutputStream(fout);
		Demo d=new Demo();
		d.setId(1);
		d.setName("Abhishek Ghadage");
		oout.writeObject(d);
		oout.close();
		fout.close();
		System.out.println("Data saved in file");
	}
}

