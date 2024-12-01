//7.Write a C program to check whether a character is alphabet or not.
import java.util.*;
public class Alphabet
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
	
		else 
		{
			System.out.println("Entered input is not Alphabet");
		}
		
	}

}