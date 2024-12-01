import java.io.*;
public class FindFileSizeApp
{
	public static void main(String x[])
	{
		File f[]=File.listRoots();
		
		for(int i=0;i<f.length;i++)
		{
			long totalsize=f[i].getTotalSpace();
			long freeSpace=f[i].getFreeSpace();
			System.out.println(f[i]+"--->"+(totalsize/1073741824)+" GB\t"+(freeSpace/1073741824)+" GB\t"+((totalsize-freeSpace)/1073741724)+" GB");
			
		}
		
	}
	
}