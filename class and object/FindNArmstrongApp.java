/*Example: WAP to create class name as FindNArmstrong with constructor and function
FindNArmstrong(int limit): you have to accept integer as parameter 
void showAllNumbersBetweenLimt(): find the all Armstrong numbers between limit 
Expected output is 
Input Limit: 11
Output: 1   2   3   4   5   6   7  8   9
Input Limt: 200
Output: 1   2   3   4   5   6   7  8   9   153
*/
import java.util.*;
class FindNArmstrong
{
	private int limit;
	private int rem,sum,p=1;
	FindNArmstrong(int limit)
	{
		this.limit=limit;
	}
	void showAllNumbersBetweenLimt()
	{    
		for(int i=11;i<limit;i++)
		{
			int count=3;
			sum=0;
			int num=i;
			while(num!=0)
			{
			rem=num%10;
			num=num/10;
			System.out.println(rem+"\t ");
			while(count!=0)
			{
				p=p*rem;
				count--;
				sum=sum+p;
				System.out.print(" "+sum);
			}
			}
			if(sum==i)
			{
				System.out.println(i);
			}
		}
	}
}
public class FindNArmstrongApp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		int limit=sc.nextInt();
		FindNArmstrong f=new FindNArmstrong(limit);
		f.showAllNumbersBetweenLimt();
	}
}
