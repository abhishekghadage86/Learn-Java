import java.util.*;
class ThrowsExpceptionApp
{
	void show(int a,int b)throws Exception
	{
		int c=a/b;
	}
	
	
}
public class ThrowsExpception
{
	public static void main(String x[])
	{
	Scanner sc=new Scanner(System.in);
	try{
	ThrowsExpceptionApp t=new ThrowsExpceptionApp();
	t.show(12,0);
	}
	catch(Exception e)
	{
		System.out.println("This is error "+e);
	}
	}
}