import java.io.*;
public class GetfreesizediskApp
{
	public static void main(String x[])
	{
		File f[]=File.listRoots();
		for(int i=0;i<f.length;i++)
		{
			long freesize=f[i].getFreeSpace();
			System.out.println(f[i]+"total free space of disk is= "+(freesize/1073741824)+" GB");
			
		}
	}
}