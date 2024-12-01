import java.util.*;
public class InputFormatMisApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		try {
			int a=sc.nextInt();
		System.out.println("Length of string"+a[2]);
		}
		catch(ArrayIndexOutOfBoundsException n)
		{
			System.out.println("This is ArrayIndexOutOfBoundsException exception");
			System.out.println(n);
		}
	}
}