import java.util.*;
class MismatchExpecApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two values");
		
		
		try
		{
		    int a=sc.nextInt();
		    int b=sc.nextInt();
			System.out.println("output is "+a+b);
			
		}
		catch(Exception e)
		{
			System.out.println("you entered second value is zero");
			System.out.println("This is Exception "+e);
		}
	
		
		
	}
}