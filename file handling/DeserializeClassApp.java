import java.io.*;
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
public class DeserializeClassApp
{
	public static void main(String x[])throws Exception
	{
		FileInputStream fin=new FileInputStream("G:\\java Practical\\Abhi\\demo\\Evenodd.txt");
		ObjectInputStream ofi=new ObjectInputStream(fin);
		Object obj=ofi.readObject();
		if(obj!=null)
		{
			Demo d=(Demo)obj;
			System.out.println(d.getId()+"\t"+d.getName());
		}
		
	}
}