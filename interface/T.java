interface IT 
{
	void show();
}
class TA implements IT
{
	public void show()
	{
		System.out.println("This is interface implements method of classs IT");
	}
	
}
public class T
{
	public static void main(String x[])
	{	IT t=null;
		t=new TA();
		t.show();
	}
}