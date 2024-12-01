import java.util.*;
class A
{
	A(){
		this(1);
		System.out.println("you entered second value is zero");
	}
	A(int a){
		System.out.println(" second value is zero");
	}

}
public class AApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		A a=new A();
	}
}
