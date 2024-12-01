import java.util.*;
public class ArrayIndexExpApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[2];
		try {
			a[0]=100;
			a[1]=200;
			a[2]=300;
		System.out.println("Length of string"+a[2]);
		}
		catch(ArrayIndexOutOfBoundsException n)
		{
			System.out.println("This is ArrayIndexOutOfBoundsException exception");
			System.out.println(n);
		}
	}
}