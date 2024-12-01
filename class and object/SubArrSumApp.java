/*Example: WAP to create class name as SubArrSum with constructor and one method 
SubArrSum(int a[],int sumValue): this method can accept array
as parameter and one single value as sum
void findSubArr(): this method can find the sum array whose sum 
is equal with sum value provide by user.
Example: 1    5   2   5  4  8
User provided value : 12 
Index of sub array 1  and 3   and you sub array is  5  2  5*/

import java.util.*;
class SubArrSum
{
	private int a[];
	private int sumValue;
	private int sum;
	SubArrSum(int a[],int sumValue)
	{
		this.a=a;
		this.sumValue=sumValue;
	}
	void findSubArr()
	{
		for(int i=0;i<a.length;i++)
		{
			sum=0;	
			for(int j=i+1;j<a.length;j++)
			{
				sum=a[i]+a[j];
				if(sum==sumValue)
				{
					System.out.printf("Index of sub array %d to %d \n",i,j);
				}
				
			}
		}
		
	}
}
public class SubArrSumApp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Values in Array");
		int a[]=new int[5];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}			
		System.out.println("Enter the Sum value");
		int sum=sc.nextInt();
		SubArrSum s=new SubArrSum(a,sum);
		s.findSubArr();
	}
}