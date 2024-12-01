abstract class Area
{
	abstract void showArea();
}
class Circle extends Area
{
	private float rad;
	void setRadius(float radius)
	{
		rad=radius;
	}
	public void showArea()
	{
		double area;
		area=rad*rad*3.14;
		return area;
	}
}
class Rectangle extends Area
{
	void setValue()
	{
		
	}
	void showArea()
	{
		return ;
	}
}
public class CirRectAreaApp
{
	public static void main(String args[])
	{
		
		Circle c=new Circle();
		c.setRadius(3f);
		c.showArea();
		float result=c.showArea();
		System.out.println("Area of circle is "+result);
	}
}