//8.Write a C program to input any alphabet and check whether it is vowel or consonant.
import java.util.*;
public class VowelApp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char a;
		a=sc.next().charAt(0);
		
		switch(a)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			System.out.println("Enter input is vowel");
			break;
			default:
			System.out.println("Invalid input");
		}
		
	}

}