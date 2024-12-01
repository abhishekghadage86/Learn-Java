/*Example: WAP to develop application for voting booth.
you have to create classes name as
1. Ward with field wardId,wardName,Voter  and Ward is POJO class so it contain 
void setWardId(int wardId)
int getWardId()
void setWardName(String name)
String getWardName()
void setVoter(Voter …voter)
Voter [] getVoter(); 
	Here you have to create POJO class name as Voter with field 
	id,name,age and you have to create one more class name as 
	VotingMachine with following methods 

void steWards(Ward …w): this method can more than one wards
void showVotingCount(): this method can show the voting ward wide and consider voter whose age is greater than 18.

VotingMachingApplication contain main method 
Output Like as 
*/
class Ward
{
	private int wordid;
	private String wardname;
	private Voter voter[];
	
	public void setWardId(int wordid)
	{
		this.wordid=wordid;
	}
	public int getWardId()
	{
		return wordid;
	}
	public void setWardName(String wardname)
	{
		  
		this.wardname=wardname;
	}
	public String getWardName()
	{
		return wardname;
	}
	public void setVoter(Voter ...voter)
	{
		this.voter=voter;
	}
	public Voter[] getVoter()
	{
		return voter;
	}
	
}
class Voter
{
	private int id;
	private String name;
	private int age;
	public void setid(int id)
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
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
}
/*class name as VotingMachine with following methods 
 this method can show the voting ward wide and consider voter whose age is 
 greater than 18.
*/
class VotingMachine
{
	private Voter v;
	private int illgal;
	private int count=0;
	private Ward w1[];
	void setWards(Ward ...w)
	{
		this.w1=w;
	
	}
	void showVotingCount()
	{
		for(Ward w:w1)
		{
			
			System.out.println("\nWard_Id="+w.getWardId()+"\t"+"Ward_Name="+w.getWardName());
			System.out.println("=======================================================================");
			System.out.println("Voter id"+"\t"+"voter name"+"\t"+"Voter age");
			Voter v1[]=w.getVoter();
			
			for(Voter v:v1)
			{
			if(v.getAge()>=18)
			{
				count++;
			System.out.println(v.getId()+"\t\t"+v.getName()+"\t\t"+v.getAge());
			}
			else 
			{
				illgal++;
			}
			}
		}
		System.out.println("===========================================================================");
		System.out.println("total voting="+count);
		System.out.println("illgal voting="+illgal);
		
	}
}
public class VotingMachingApplication
{
	public static void main(String x[])
	{
	
	Voter v=new Voter();
	v.setid(1);
	v.setName("Abhi");
	v.setAge(20);
	
	Voter v2=new Voter();
	v2.setid(3);
	v2.setName("Abhi");
	v2.setAge(50);
	
	Voter v1=new Voter();
	v1.setid(2);
	v1.setName("this");
	v1.setAge(12);
	
		Ward w=new Ward();
		w.setWardId(1);
		w.setWardName("Ganpati matha");
		w.setVoter(v,v1,v2);
		
		Ward w1=new Ward();
		w1.setWardId(2);
		w1.setWardName("Ahiregav");
		w1.setVoter(v,v1,v2);
		
		VotingMachine vt=new VotingMachine();
		vt.setWards(w,w1);
		vt.showVotingCount();
	}
}