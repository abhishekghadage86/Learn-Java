//10.Write a C program to check whether a character is uppercase or lowercase alphabet.
import java.util.*;
public class Uppercaselowercase
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char a;
		a=sc.next().charAt(0);
		if(a>=65 && a<=90)
		{
			System.out.println("Entered input is UpperCase");
		}
		else if(a>=97 && a<=122)
		{
			System.out.println("Entered input is lowercase");
		}
	
		else 
		{
			System.out.println("Entered input is invalid");
		}
		
	}

}