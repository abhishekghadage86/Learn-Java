import java.util.*;
public class NullPointerExp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		String str=null;
		try {
		System.out.println("Length of string"+str.length());
		}
		catch(NullPointerException n)
		{
			System.out.println("This is null pointer exception");
			System.out.println(n);
		}
	}
}