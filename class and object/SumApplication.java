/*class Sum
{ void calSum(int ...x) //method with var-args
{//here we need to calculate the sum of all elements
}
}
public class SumApplication
{ public static void main(String x[])
{//here we need to create the object of Sum class and call the calSum() method and pass
//parameter in it
}
}*/

// This program is related with variable with arguments
class Sum
{ 
	private int sum=0;
	void calSum(int ...x) //**method with var-args**
	{
		//here we need to calculate the sum of all elements
		for(int i=0;i<x.length;i++)
		{
			sum=sum+x[i];
		}
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+"\t");
		}
		System.out.println("\nSum of all elements="+sum);
	}
}
public class SumApplication
{	
	public static void main(String x[])
	{
		//here we need to create the object of Sum class and call the 
		//calSum() method and pass parameter in it
		Sum s=new Sum();
		s.calSum(10,20,30,40,50);
		
	}
}