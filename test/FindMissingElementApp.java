/*Example: WAP to FindMissingElement with two methods 
void setArray(int a[]): this method can accept array as parameter 
void showMissing(): this method can find the missing element of array.
*/
import java.util.*;
class FindMissingElement
{
	int arr[];
	void setArray(int a[])
	{
		arr=a;
		System.out.println("\nMissing element are\n");
	}
	void showMissing()
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=arr[i]+1;j<arr[i+1];j++)
			{
			 System.out.print(j+"\t");
			}
		}
	}

}
public class FindMissingElementApp
{
	public static void main(String x[])
	{
		int a[]=new int[6];
		Scanner sc=new Scanner(System.in);
		FindMissingElement f=new FindMissingElement();
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\t");
		}
		f.setArray(a);
		f.showMissing();
		
	}
}