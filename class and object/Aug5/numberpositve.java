//3.Write a C program to check whether a number is negative, positive or zero.

import java.util.*;
public class numberpositve
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		a=sc.nextInt();
		String result=(a<0)?"Number is negative":(a>0)?"number is positive":"number is zero";
		System.out.println(result);
		
	}

}