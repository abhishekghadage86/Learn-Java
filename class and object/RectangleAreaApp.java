/*2.Create the Class Name as Rectangle with a following methods and write its logics.
class Rectangle
{ void setLengthWidth(int len,int wid)//accept the radius
{
}
void showArea()
{ //write here calculation logics of circle area and display it
}
}
public class AreaApp
{ public static void main(String x[])
{ //create here object of scanner and accept the length and width as input
//create the object of Rectangle and call setLengthWidth and pass radius input as parameter
//call showArea() for display the display the area
}
}*/
//Using pojo class
import java.util.*;
class Rectangle
{ 	
	private int length;
	private int width;
	public void setLengthWidth(int length,int width)//accept the radius
	{
		this.length=length;
		this.width=width;
		
	}
	public int getLength()//accept the radius
	{
		return length;
		
	}
	public int getWidth()//accept the radius
	{
		
		return width;
		
	}
}
class CalArea
{ 
	private Rectangle r1;
	private int area,length,width;
	void setData(Rectangle r)
	{
		r1=r;
	}
	void showArea()
	{ 
	length=r1.getLength();
	width=r1.getWidth();
	area=length*width;
	System.out.println("Dispaly Area of Rectangle= "+area);
	}
}
public class RectangleAreaApp
{ 
	public static void main(String x[])
	{ 
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter length");
	int length=sc.nextInt();
	System.out.println("Enter Width");
	int width=sc.nextInt();
	Rectangle r=new Rectangle();
	r.setLengthWidth(length,width);
	r.getLength();
	r.getWidth();
	
	CalArea c=new CalArea();
	c.setData(r);
	c.showArea();
	}
}