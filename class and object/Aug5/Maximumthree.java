//2.Write a C program to find maximum between three numbers.
import java.util.*;
public class Maximumthree
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println("A is greater");
		}
		else if(a<b && c<b)
		{
			System.out.println("b is greater");
		}
		else if(a<c && c>b)
		{
			System.out.println("c is greater");
		}
		else 
		{
			System.out.println("both are the same");
		}
	}

}