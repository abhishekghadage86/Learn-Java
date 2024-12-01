/*Example: WAP to Create class name as Student with field id,name,marks[] with setter 
and getters means 
void setId(int): accept id as parameter
int getId(): return id as parameter
void setName(String name): this method can accept name as parameter
String getName(): return name as parameter
void setMarks(int marks[]): this method can accept marks of six subject 
int [] getMarks(): this method can return marks of six subjects
and you have to create one more class name as FindPer with two methods 
void setStudent(Student student): this method accept student reference as parameter 
void showStudent(): this method can show the student data using reference of student 
float getPer(): this method can access six subject marks of student 
and calculate its percentage and return it.
*/

class Student
{
	private int id;
	private String name;
	private int marks[]=new int[6];
	 
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setMarks(int marks[])
	{
		
			this.marks=marks;
				
	
	}
	public int []getMarks()
	{
		return marks;
	}
}
class FindPer
{
	int sum=0;
	private Student s;
	void setStudent(Student student)
	{
		s=student;
	}
	void showStudent()
	{
		System.out.print("\nDisplay student data =\n ");
		System.out.print("ID= "+s.getId());
		System.out.print("\nNAME= "+s.getName());
		System.out.print("\nMARKS= ");

		int marks[]=s.getMarks();
		for(int i=0;i<marks.length;i++)
		{
			System.out.print(marks[i]+"\t");
		}
	}
	float getPer()
	{
		float per;
		int []marks=s.getMarks();
		for(int i=0;i<marks.length;i++)
		{
			sum=sum+marks[i];
		}
		return per=sum/6;
		
	}
}
public class StudentPerApp
{
	public static void main(String x[])
	{
		int marks[]=new int[]{99,99,99,99,99,99};
		Student s=new Student();
		FindPer f=new FindPer();
		s.setId(1);
		s.setName("Abhi");
		s.setMarks(marks);
		
		f.setStudent(s);
		f.showStudent();
		System.out.print("\nPercentage= "+f.getPer());
	}
}