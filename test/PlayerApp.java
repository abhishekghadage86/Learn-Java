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
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setRun(int run)
	{
		this.run=run;
	}
	public int getRun()
	{
		return run;
	}
	public void setMatches(int matches)
	{
		this.matches=matches;
	}
	public int getMatches()
	{
		return matches;
	}
}
class PlayerDetails
{
	Scanner sc=new Scanner(System.in);
	private Player p[];
	public void setPlayer(Player ...p)
	{
		this.p=p;
	}
	public void show()
	{
		System.out.println("jersyno \tName\tRun\tMatches");
		for(int i=0;i<p.length;i++)
		{
		System.out.println(p[i].getjersyno()+"\t\t"+p[i].getName()+"\t"+p[i].getRun()+"\t"+p[i].getMatches());
		}
		System.out.println("Enter the jersyno for delete the record in table");
		int index=sc.nextInt();
		
		for(int i=index;i<p.length-1;i++)
		{
			p[i]=p[i+1];
		}
		System.out.println("jersyno \tName\tRun\tMatches");
		for(int i=0;i<p.length-1;i++)
		{
		System.out.println(p[i].getjersyno()+"\t\t"+p[i].getName()+"\t"+p[i].getRun()+"\t"+p[i].getMatches());
		}
		for(int i=0;i<p.length;i++)
		{
			for(int j=i;j<p.length;j++)
			{
				if(p[i].getMatches()>p[j].getMatches())
				{
					Player temp=p[i];
					p[i]=p[j];
					p[j]=temp;
				}
			}
		}
		System.out.println("jersyno \tName\tRun\tMatches");
		for(int i=0;i<p.length-1;i++)
		{
		System.out.println(p[i].getjersyno()+"\t\t"+p[i].getName()+"\t"+p[i].getRun()+"\t"+p[i].getMatches());
		}
	}
	
}
public class PlayerApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		Player p[]=new Player[5];
		for(int i=0;i<p.length;i++)
		{
			p[i]=new Player();
			System.out.println("Enter the player jersyno,name,run,matches");
			int jersyno=sc.nextInt();
			sc.nextLine();
			String name=sc.nextLine();
			
			int run=sc.nextInt();
			int matches=sc.nextInt();
			p[i].setjersyno(jersyno);
			p[i].setName(name);
			p[i].setRun(run);
			p[i].setMatches(matches);
		}
		PlayerDetails pd=new PlayerDetails();
		pd.setPlayer(p);
		pd.show();
		
	}
}