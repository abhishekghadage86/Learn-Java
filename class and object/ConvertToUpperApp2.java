/*class InsertArrEle
{ int c[];
void setIntArray(int ch[])
{ //here accept the integer array and store in instance variable in integer array
c=ch;
}
void insertValueOnIndex()
{ //here we need to write the manual logics for inserting value on specified index in arr
}
}
public class ConvertToUpperApp2
{
public static void main(String x[])
{ //here create the array with 6 six size and store only five value in it using scanner
// create the object of InsertArrEle class
//call the setIntArray function
//call the insertValueOnIndex() and write the manual logics
}
}*/
import java.util.*;
class InsertArrEle
{
	Scanner sc=new Scanner(System.in);
	private int a[];
	private int index;
	private int num;
	void setIntArray(int a[])
	{ 
		this.a=a;
		System.out.println("Enter index");
		index=sc.nextInt();
		System.out.println("Enter Value");
		num=sc.nextInt();
	}
	void insertValueOnIndex()
	{ 
		for(int i=0;i<=index;i++)
		{ 
			for(int j=a.length-1;j>index;j--)
			{
				a[j]=a[j-1];
			}				
		}
	for(int i=0;i<a.length;i++)
		{
				System.out.println(a[i]+" ");
		}

	}
}
public class ConvertToUpperApp2
{
	public static void main(String x[])
	{ 
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter values Array");
	int a[]=new int[6];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	InsertArrEle e=new InsertArrEle();
	e.setIntArray(a);
	e.insertValueOnIndex();
	}
}