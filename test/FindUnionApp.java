/*
Example:  WAP to create class FindUnion with two methods 
void setArray(int a[],int b[]): this method can accept two array as parameter 
int [] getUnionArray(): this method can perform union operation on
 array and return resultant array

*/
class FindUnion
{
	private int arr1[],arr2[];
	private int c[];
	c=new int[10];
	
	void setArray(int a[],int b[])
	{
		arr1=a;
		arr2=b;
		
	}
	void getUnionArray()
	{
		for(int i=0;i<c.length;)
		{
			for(int j=0;j<arr1.length;j++)
			{
				c[i]=arr1[i];
				i++
			}
			
			
			
			for(int j=0;j<arr2.length;j++)
			{
				for(int j=0;j<arr2.length;j++)
				{
					c[i]=arr2[i];
					i++;
				}
			}
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+"\t");
		}
		
	}
	
	
}

public class FindUnionApp
{
	public static void main(String x[])
	{
		int a[]=new int[]{10,20,30,40,50};
		int b[]=new int[]{100,20,300,40,50};
		FindUnion f=new FindUnion();
		f.setArray(a,b);
		f.showProduct();
	}
}