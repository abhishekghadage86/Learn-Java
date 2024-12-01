import java.util.*;
class StrongApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit");
		int limit=sc.nextInt();
		int temp,rem=0;
		
		for(int i=1;i<=limit;i++)
		{
			temp=i;
			int num=i;
			int sum=0;
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
					System.out.println(temp+"-->Number is Strong");
				}
			
		}
	}
}