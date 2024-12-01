import java.util.*;
class ExpecApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		try
		{
		int c=a/b;
			System.out.println("output is "+c);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("you entered second value is zero");
			System.out.println("This is Exception "+e);
		}
		finally
		{
			
			System.out.println("I am always here");
		}
		
		
	}
}