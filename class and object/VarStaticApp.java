import java.util.*;
class VarStatic
{
	static int a=100;
	int b=200;
}
public class VarStaticApp
{
	public static void main(String args[])
	{
		VarStatic v=new VarStatic();
		System.out.printf("A=%d\n b=%d",VarStatic.a,v.b);//static variable can be used with class name and object instance variable are used with object
		System.out.printf("\nA=%d\n b=%d",v.a,v.b);
	}
}