import java.util.*;
class Player
{
	private int jersyno;
	private String name;
	private int run;
	private int matches;
	public void setjersyno(int jersyno)
	{
		this.jersyno=jersyno;
	}
	public int getjersyno()
	{
		return jersyno;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return name;
	}
	public void setrun(int run)
	{
		this.run=run;
	}
	public int getrun()
	{
		return run;
	}
	public void setmatches(int matches)
	{
		this.matches=matches;
	}
	public int getmatches()
	{
		return matches;
	}
}
class Display
{
	Scanner sc=new Scanner(System.in);
	private Player p[];
	void setPlayer(Player ...p)
	{
		this.p=p;
	}
	void show()
	{
	System.out.print("\nDisplay the player details\n");
	for(int i=0;i<p.length;i++)
			{
				System.out.println(p[i].getjersyno()+" "+p[i].getname()+" "+p[i].getrun()+"  "+p[i].getmatches());
			}
	
	System.out.print("\nEnter index for delete the imfo\n");
	int index=sc.nextInt();
		for(int i=0;i<p.length;i++)
			{
				for(int j=i+1;j<p.length;j++)
				{
					if(i==index && i<p.length-1)
					{ 
						p[i]=p[i+1];
					
					if(p[i].getmatches()>=p[j].getmatches())//if condtion 
					{
					  Player c=p[i];//temp var
					  p[i]=p[j];
					  p[j]=c;
					}
					}
				}
			}
			System.out.print("\nDisplay the player Asending order details\n");
	for(int i=0;i<p.length;i++)
			{
				System.out.println(p[i].getjersyno()+" "+p[i].getname()+" "+p[i].getrun()+"  "+p[i].getmatches());
			}
	}
}

public class PlayerApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);	
		 int jersyno;
		String name;
			int run;
		int matches;
		Player p1=new Player();
		System.out.print("Enter Player Jersyno,Name,run,matches:=");
				jersyno=sc.nextInt();
				name=sc.nextLine();
				sc.nextLine();
				run=sc.nextInt();
				matches=sc.nextInt();
				p1.setjersyno(jersyno);
				p1.setname(name);
				p1.setrun(run);
				p1.setmatches(matches);
				
				
				Player p2=new Player();
				jersyno=sc.nextInt();
				name=sc.nextLine();
				sc.nextLine();
				run=sc.nextInt();
				matches=sc.nextInt();
				p2.setjersyno(jersyno);
				p2.setname(name);
				p2.setrun(run);
				p2.setmatches(matches);
				/*
				Player p3=new Player();
				jersyno=sc.nextInt();
				name=sc.nextLine();
				sc.nextLine();
				run=sc.nextInt();
				matches=sc.nextInt();
				p3.setjersyno(jersyno);
				p3.setname(name);
				p3.setrun(run);
				p3.setmatches(matches);
				
				Player p4=new Player();
				jersyno=sc.nextInt();
				name=sc.nextLine();
				sc.nextLine();
				run=sc.nextInt();
				matches=sc.nextInt();
				p4.setjersyno(jersyno);
				p4.setname(name);
				p4.setrun(run);
				p4.setmatches(matches);*/
		Display d=new Display();
		d.setPlayer(p1,p2);
		d.show();
	}
}
	
	
	
	
	
	
	
	
	
	
	/*
for(int i=0;i<p.length;i++)
			{
				jersyno=sc.nextInt();
				name=sc.nextLine();
				sc.nextLine();
				run=sc.nextInt();
				matches=sc.nextInt();
				p[i].setjersyno(jersyno);
				p[i].setname(name);
				p[i].setrun(run);
				p[i].setmatches(matches);
			}*/