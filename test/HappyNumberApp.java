import java.util.*;
class HappyNumberApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int rem=0,sum=0;
		while(num!=0)
		{
			int p=1;
			rem=num%10;
			num=num/10;
			System.out.println("Enter the number"+rem);
			int count=2;
			while(count!=0)
			{
				p=p*rem;
				count--;
			}
			sum=sum+p;
			System.out.println("Enter the number"+sum);
			
		}
		
	
	}
}