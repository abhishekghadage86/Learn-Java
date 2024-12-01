import javautil.*;
interface Employee
{
	calcluateSalary();
	getDetails();
	
}
class FullTimeEmployee implements Employee
{
	public getDetails()
	{
		
	}
	public calcluateSalary()
	{
		
	}
}
class PartTimeEmployee implements Employee
{
	public getDetails()
	{
		
		
	}
	public calcluateSalary()
	{
		
	}
}
public class EmployeeApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);	
		FullTimeEmployee f=new FullTimeEmployee();
		PartTimeEmployee p=new PartTimeEmployee();
	}
}
	