import java.util.*;
public class NumberFormatExpApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		String str="2232 ";
		try {
			int a=Integer.parseInt(str);
		System.out.println("Length of string"+a);
		}
		catch(NumberFormatException n)
		{
			System.out.println("This is Number format exception");
			System.out.println(n);
		}
	}
}