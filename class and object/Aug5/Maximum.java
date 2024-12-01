/*1.Write a C program to find maximum between two numbers.
*/
import java.util.*;
public class Maximum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>b)
		{
			System.out.println("A is greater");
		}
		else if(a<b)
		{
			System.out.println("b is greater");
		}
		else 
		{
			System.out.println("both are the same");
		}
	}

}