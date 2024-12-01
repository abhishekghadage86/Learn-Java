import java.util.*;
class StringApp//class name
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string\n");
		String str=sc.nextLine();	
		sc.nextLine();		
		char ch[]=str.toCharArray();
	
			//print array
		for(int i=0;i<ch.length;i++)
			{
				System.out.print(ch[i]+" ");
			}
			
			boolean flag=true;
			//missing logic
			for(int i=0;i<ch.length;i++)
			{
				for(int j=ch[i]+1;j<ch[i+1];j++)
				{
				  if(ch[i]!=ch[j]&& flag)
				  {
					 
					  flag=false;
				  }
				}
			}
				System.out.print("\nSmallest element missing is=");
	}		
}
	
	