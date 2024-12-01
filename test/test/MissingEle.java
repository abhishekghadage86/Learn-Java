import java.util.*;
class MissingEle//class name
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);//scanner class
		System.out.print("Enter size of array");//enterr size
		int size=sc.nextInt();		
		System.out.print("Enter values in array");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
			//print array
		for(int i=0;i<a.length;i++)//print array
			{
				System.out.print(a[i]+" ");
			}
			int miss=0;
			boolean flag=true;//flag true for find missing
			//missing logic
			for(int i=0;i<a.length-1;i++)
			{
				for(int j=a[i]+1;j<a[i+1];j++)
				{
				  if(a[i]!=a[j]&& flag)//if condtion for misss ele
				  {
					  miss=a[i]+1;
					  flag=false;//flag false
				  }
				}
			}
				System.out.print("\nSmallest element missing is="+miss);//print miss ele
	}		
}
	
	