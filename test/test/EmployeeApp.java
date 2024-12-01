import javautil.*;
interface Employee
{
	calcluateSalary();
	getDetails();
	
}
class FullTimeEmployee implements Employee
{
	
}
class PartTimeEmployee implements Employee
{
	
	
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
	