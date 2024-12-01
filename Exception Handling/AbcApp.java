import java.util.*;
class A
{
	void calDiv(int a,int b)throws Exception
	{
		int c=a/b;
		System.out.println("Welcome");
	}


}
public class AbcApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		try
		{
		int d=sc.nextInt();
		int b=sc.nextInt();
		A a=new A();
		a.calDiv(d,b);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

