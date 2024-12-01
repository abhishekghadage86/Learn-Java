interface Var
{
	int x=10;
	void display();

}
class  Var2 implements Var{
	public void display()
	{
		System.out.println("this is x value "+x);
	}

}
public class Varinterface
{
	public static void main(String x[])
	{
		System.out.println("This  is a x value"+Var.x);
	 
		Var2 v=new Var2();
		v.display();
	
	}
}