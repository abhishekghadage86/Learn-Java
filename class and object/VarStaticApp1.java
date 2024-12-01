import java.util.*;
class VarStatic1
{
	static int a;
	int b;
}
public class VarStaticApp1
{
	public static void main(String args[])
	{
		VarStatic1 v=new VarStatic1();
		VarStatic1 v1=new VarStatic1();
		v.a=100;
		v.b=200;
		System.out.printf("A=%d\n b=%d",VarStatic.a,v.b);//static variable can be used with class name and object instance variable are used with object
		System.out.printf("\nA=%d\n b=%d",v1.a,v1.b);
	}
}