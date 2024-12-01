/*4. WAP to create the class name as Student with a following methods
class Student
{ void setSubMarks(int s[])
{ //here we need to store the array in instance variable
}
void calculatePer()
{ //here we need to call the aggregate of six subjects marks through the array and calculate its per and store in instance variable.
}
void checkGrades()
{ //here we need to check grades means per>75 && per<=100 then student in distinction if per>60 && per<=75 then in first division if per>=50 && per<=60 then second division and if per>40 && per<=50 then in third division and if per <40 then student failed
}
}
public class StudentApp
{ public static void main(String x[])
{ //create the object of scanner class
//declare the array with 6 six of type integer and store input values in array as subject marks
//create the object of Student class and call the setSubMarks() function and pass array in it
//then call calculatePer() student function
//then call checkGrades() function for checking the grading of students.
}
}*/
import java.util.*;
class Student
{
	private int a[];
	private int aggregate;
	private float per;
	void setSubMarks(int a[])
	{ 
	 this.a=a;
	//here we need to store the array in instance variable
	}
	void calculatePer()
	{ 
		for(int i=0;i<a.length;i++)
		{
		aggregate=aggregate+a[i];	
		}
		System.out.println("Aggergate is= "+aggregate);
		per=aggregate/6;
		System.out.println("Percentage is= "+per);
	//here we need to call the aggregate of six subjects marks through the array 
	//and calculate its per and store in instance variable.
	
	}
	void checkGrades()
	{ 
	//here we need to check grades means per>75 && per<=100 then student in 
	//distinction if per>60 && per<=75 then in first division if
	//	per>=50 && per<=60 then second division and if per>40 && per<=50 then 
	//in third division and if per <40 then student failed
		if(per>75 && per<=100)
		{
			System.out.println("Student in distinction");
		}
		else if(per>60 && per<=75)
		{
			System.out.println("Student in first division");
		}
		else if(per>=50 && per<=60)
		{
			System.out.println("Student in second division");
		}
		else if(per>40 && per<=50)
		{
			System.out.println("Student in third division");
		}
		else 
		{
			System.out.println("student failed");
		}
	}
}
public class StudentApp
	{ 
	public static void main(String x[])
	{
	//create the object of scanner class
	Scanner sc=new Scanner(System.in);
	//declare the array with 6 six of type integer and store input values in 
	//array as subject marks
	int a[]=new int[6];
	System.out.println("Enter values in array");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	//create the object of Student class and call the setSubMarks() 
	//function and pass array in it
	Student s=new Student();
	s.setSubMarks(a);
	//then call calculatePer() student function
	s.calculatePer();
	//then call checkGrades() function for checking the grading of students.
	s.checkGrades();
	}
}
