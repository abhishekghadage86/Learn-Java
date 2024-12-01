import java.util.*;
class IsogramarrayApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		int a[]=new int[5];
		System.out.println("Enter values in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Display values in array");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					flag=false;
				}
			}
		}
		if(flag)
		{
			System.out.println("Array is Isogram");
		}
		else
		{
			System.out.println("Array is not Isogram");
		}
		
	}
}
