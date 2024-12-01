import java.util.*;
import java.io.*;
class InfoEmp implements Serializable
{
	private int id;
	private String name;
	private int sal;
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
public class SerializationApp
{
	public static void main(String x[])throws Exception
	{
		Scanner sc=new Scanner(System.in);
		FileOutputStream fout=new FileOutputStream("G:\\java Practical\\Abhi\\Demo\\abhi.txt");
		ObjectOutputStream oout=new ObjectOutputStream(fout);
		InfoEmp e=new InfoEmp();
		e.setId(1);
		e.setName("Abhishek");
		oout.writeObject(e);
		oout.close();
		System.out.println("Save the information sucessfully");
	}
}