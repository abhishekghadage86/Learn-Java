import java.util.*;
class IosgramArr//class name
{
	public static void main(String x[])
	{
		//scanner class
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array");//input size of array
		int size=sc.nextInt();		
		System.out.print("Enter values in array");//enter value in array
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
			
			boolean flag=true;//flag is true
			//isogram logic
			for(int i=0;i<a.length-1;i++)
			{
				for(int j=a[i]+1;j<a[i+1];j++)
				{
				  if(a[i]!=a[j]&& flag)
				  {
					//if conditon is flag then assign flag is false
					  flag=false;
				  }
				}
			}
			//if witj flag if then if execute
			if(flag)
			{
				System.out.print("\nit is iosgram array");
			}
			else//when flag is flase the print
			{
				System.out.print("\nit is not isogram Array");
			}
	}		
}
	
	