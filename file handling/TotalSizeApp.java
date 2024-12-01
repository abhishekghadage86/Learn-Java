import java.io.*;
public class TotalSizeApp
{
	public static void main(String x[])
	{
		File f[]=File.listRoots();
		
		for(int i=0;i<f.length;i++)
		{
			long totalsize=f[i].getTotalSpace();
			
			System.out.println(f[i]+"Total Size of disk is --->"+(totalsize/1073741824));
			
		}
		
	}
	
}