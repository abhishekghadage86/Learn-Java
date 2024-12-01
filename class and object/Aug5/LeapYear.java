//6.Write a C program to check whether a year is leap year or not.
import java.util.*;
public class LeapYear
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		a=sc.nextInt();
		if(a%4==0 && a%100!=0)
		{
			System.out.println("Entered year is leap year");
		}
	
		else 
		{
			System.out.println("Entered year is not leap year");
		}
		
	}

}