//5.Write a C program to check whether a number is even or odd.
import java.util.*;
public class EvenorOdd
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("number is even");
		}
	
		else if(a%2==1)
		{
			System.out.println("number is odd");
		}
		
	}

}