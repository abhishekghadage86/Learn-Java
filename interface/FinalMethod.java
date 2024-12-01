interface T
{
	int a=10000;
	void show();//final void show method is not allowed here this is internally public abstract void show method id here
	
}
class A implements T
{
	public void show()
	{
		System.out.println("Abhi");
	}

}
public class FinalMethod
{
	public static void main(String x[])
	{
		T t=null;
		t=new A();
		t.show();
	}

}