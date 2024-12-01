import java.util.*;
class NumberExceptionApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values");
	    String str="12345 ";
		try 
		{
			int c=Integer.parseInt(str);
			System.out.println("this is the o/p "+c);
		}
		catch(Exception e)
		{
			System.out.println("this is the error "+e);
		}
		System.out.println("Logic 1");
		System.out.println("Logic 2");
		System.out.println("Logic 3");
	}
}