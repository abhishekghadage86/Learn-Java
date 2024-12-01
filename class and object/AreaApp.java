/*class Circle
{
void setRadius(float radius)//accept the radius
{
}
void showArea()
{ //write here calculation logics of circle area and display it
}
}
public class AreaApp
{
public static void main(String x[])
{
//create here object of scanner and accept the radius as input
//create the object of area and call setRadius and pass radius input as parameter
//call showArea() for display the display the area
}
}*/
import java.util.*;
class Circle
{
	private float radius;
	public void setRadius(float radius)//accept the radius
	{
		this.radius=radius;
	}
	public float getRadius()//accept the radius
	{
		return radius;
	}
}
class Show
{	
	private Circle c1;
	private double area;
	private float radius;
	private double pi=3.14;
	void addRadius(Circle c)//accept the radius
	{
		c1=c;
	}
	
	void showArea()
	{ 
		radius=c1.getRadius();
		area=pi*radius*radius;
		System.out.println("Display Area= "+area);
	}
}
public class AreaApp
	{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius");
		float radius=sc.nextFloat();
		Circle c=new Circle();
		Show s=new Show();
		c.setRadius(radius);
		c.getRadius();
		
		s.addRadius(c);
		s.showArea();
	
	}
}