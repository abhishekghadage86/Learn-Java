/*7.WAP to create the class name as InsertArrayEle with a following methods
class InsertArrEle
{ int c[];
void setIntArray(int ch[])
{ //here accept the integer array and store in instance variable in integer array
c=ch;
}
void insertValueOnIndex()
{ //here we need to write the manual logics for inserting value on specified index in arr
}
}
public class InsertArrEleApp
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
	int a[];
	private int index,num;
	void setIntArray(int a[])
	{ 
		this.a=a;
	}
	void insertValueOnIndex()
	{ 
		System.out.println("Enter index");
		index=sc.nextInt();
		System.out.println("Enter value");
		num=sc.nextInt();
		for(int i=0;i<index;i++)
		{
			for(int j=a.length-1;j>index;j--)
			{
			 a[j]=a[j-1];
			}
		}
			a[index]=num;
		System.out.println("Display Values in array");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"  ");
		}
	}
}
public class InsertArrEleApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		//here create the array with 6 six size and store only five value in it using scanner
		int a[]=new int[6];
		System.out.println("Enter values in Array");
		for(int i=0;i<a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		// create the object of InsertArrEle class
		InsertArrEle i=new InsertArrEle();
		i.setIntArray(a);
		i.insertValueOnIndex();
	}
}