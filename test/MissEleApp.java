import java.util.*;
class MissEleApp
{
	public static void main(String x[])
	{
		int miss=0;
		Scanner sc=new Scanner(System.in);
	int a[]=new int[8];
	System.out.println("Enter values in array");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("display values in array");
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+"\t");
	}
	for(int i=0;i<a.length-1;i++)
	{
		for(int j=a[i]+1;j<a[i+1];j++)
		{
			
			if(a[j]!=a[i]+1)
			{
				 miss=a[i]+1;
			}
		}
	}
		System.out.println("\nSamllest missing element is="+miss);
	}
}