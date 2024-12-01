import java.util.*;
public class ArithmathicExp
{
	public static void main(String x[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter  two values ");
	int a=sc.nextInt();
	int b=sc.nextInt();
	try
	{
	int c=a/b;
	System.out.println("Output is "+c);
	}
	catch(ArithmeticException e)
	{
		System.out.println("Your second output is zero");
		System.out.println("This Exception occurs "+e);
		
	}
	finally 
	{
		System.out.println("\n Thank you ! Progarm connection is close");
	}
		
	}
}