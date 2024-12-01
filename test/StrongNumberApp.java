import java.util.*;
class StrongNumberApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int rem=0;
		System.out.println("Enter limit for find the storng number");
		int no=sc.nextInt();
		
		for(int i=1;i<=no;i++)
		{
		int temp=i;
		int sum=0;
		int num=i;
		while(num!=0)
		{
			int p=1;
			rem=num%10;
			num=num/10;
			while(rem!=0)
			{
			p=p*rem;
			rem--;
			}
			sum=sum+p;
			
		}
			if(sum==temp)
			{
			System.out.println("Strong number is="+sum);
			}
		}
			
			
		
			
	}
}