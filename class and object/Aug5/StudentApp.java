/*Q2. WAP to create POJO class name as Student with field id,name and per and create 
array of object student with size 5 and input the id of student and search student 
record in student object array and if student then display student found otherwise 
display message student not found.*/
import java.util.*;
class Student
{
	private int id;
	private String name;
	private float per;
	public void setId(int id)
	{
		this.id=id;
	}
	public int getID()
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
	public void setPer(float per)
	{
		this.per=per;	
	}
	public float getPer()
	{
		return per;
	}

}
public class StudentApp
{
	public static void main(String x[])
	{
		boolean flag=false;
		int c=0;
		int count=0;
		Scanner sc=new Scanner(System.in);
		Student stud[]=new Student[3];//Array reference
		for(int i=0;i<stud.length;i++)
		{
			System.out.println("Enter the id name And percentage");
			stud[i]=new Student();//array object
			int id=sc.nextInt();
			sc.nextLine();
			String name=sc.nextLine();
			float per=sc.nextFloat();
			stud[i].setId(id);
			stud[i].setName(name);
			stud[i].setPer(per);
			
		}
		System.out.println("Display the student Details");
		System.out.println("id\t"+"Name\t"+"Percenatge");
		for(int i=0;i<stud.length;i++)
		{	
		System.out.println(stud[i].getID()+"\t"+stud[i].getName()+"\t"+stud[i].getPer());	
		}
		
		do{
		System.out.println("Enter the id student");
		int searchid=sc.nextInt();
		
		for(int i=0;i<stud.length;i++)
		{
			if(searchid==stud[i].getID())
			{
				flag=true;
				count=i;
			}
			
		}
		
		if(flag)
			{
				System.out.println("id\t"+"Name\t"+"Percenatge");
				System.out.println(stud[count].getID()+"\t"+stud[count].getName()+"\t"+stud[count].getPer());
			}
			else
			{
				System.out.println("Entered id student not found");
				
			}
			count=0;
			flag=false;
		System.out.println("If you want to find another id then press 2");
		 c=sc.nextInt();
		}while(c==2);
	}

}