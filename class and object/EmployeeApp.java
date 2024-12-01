/*3. WAP to create the class Employee with a following methods
class Employee
{ void setPersonalInfo(String name,int id,int basicSal)
{ //in this function we need to store name ,id and basicSal in instance variable
}
void setProgressPer(int progress)
{ //if progress value is greater than 60 per then increase the basic salary of
//employee with 30 percentage
}
void show()
{//in this function we need to show the all details of employee like as
//name id and basic salary as well as incremental salary and total salary of employee
}
}
public class AreaApp
{
public static void main(String x[])
{ // here create the object of Scanner class and accept the name id and basic salary as well
//progress per value not need to calculate it by using formual directly enter e.g 70
//means 70%
//create the object of Employee class and call setPersonalInfo and pass name id and salary
// in it as well as setProgressPer() and pass progress value in it
//call the show() method of Employee class.
}
}*/
import java.util.*;
class Employee
{ 	
	private int id;
	private String name;
	private int basicSal;
	private int progress;
	private int incresal;
	private int totalsal;
	void setPersonalInfo(String name,int id,int basicSal)
	{ 
		this.id=id;
		this.name=name;
		this.basicSal=basicSal;
	}
	void setProgressPer(int progress)
	{ 
	 this.progress=progress;
	 if(progress>=60)
	 {
		incresal=basicSal*30/100; 
		totalsal=basicSal+incresal;
	 }
	 else
	 {
		 totalsal=basicSal;
	 }
	
	}
	void show()
	{
		System.out.println(id+"\t"+name+"\t    "+basicSal+"\t   "+incresal+"\t\t"+totalsal);
	}
}
public class EmployeeApp
	{
	public static void main(String x[])
	
	{ 
	Employee e=new Employee();
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter id ");
	int id=sc.nextInt();
	System.out.print("Enter salary ");
	int salary=sc.nextInt();
	sc.nextLine();
	System.out.print("Enter Name ");
	String name=sc.nextLine();
	System.out.print("Enter progress ");
	 int prog=sc.nextInt();
	 e.setPersonalInfo(name,id,salary);
	e.setProgressPer(prog);
	
	Employee e1=new Employee();
	System.out.print("Enter id ");
	id=sc.nextInt();
	System.out.print("Enter salary ");
	salary=sc.nextInt();
	sc.nextLine();
	System.out.print("Enter Name ");
	name=sc.nextLine();
	System.out.print("Enter progress ");
	prog=sc.nextInt();
	e1.setPersonalInfo(name,id,salary);
	e1.setProgressPer(prog);
	
	System.out.println("Dispaly Emp details= ");
	System.out.println("----------------------------------------------------");
	System.out.println("----------------------------------------------------");
	System.out.println("ID\t"+"NAME\t"+"BASIC SALARAY\t"+"INCERMENT SAL\t"+"TOTAL SAL\t");
	
	
	e.show();
	e1.show();
	
	
	
	}
}