//4.Write a C program to check whether a number is divisible by 5 and 11 or not.
import java.util.*;
public class Divisible
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		a=sc.nextInt();
		if(a%5==0 && a%12==0)
		{
			System.out.println("number is divisible by 5 and 12");
		}
	
		else 
		{
			System.out.println("number is not divisible by 5 and 12");
		}
		
	}

}