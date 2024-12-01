//9.Write a C program to input any character and check whether it is alphabet, digit or special character.
import java.util.*;
public class AlphabetNumApp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char a;
		a=sc.next().charAt(0);
		if(a>=65 && a<=90 || a>=97 && a<=122)
		{
			System.out.println("Entered input is Alphabet");
		}
	
		else if(a>=48 && a<=57)
		{
			System.out.println("Entered input is number");
		}
		else
		{
			System.out.println("Entered input is  Special symbol");
		}
		
	}

}