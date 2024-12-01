import java.util.*;
class StringWithStringApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();;
		System.out.println("Display character in array");
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]+" ");
		}
		System.out.println("Enter search character");
		char ch1=sc.next().charAt(0);
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==ch1)
			{
				System.out.println(ch[i-1]+" "+ch[i+1]);
			}
		}
	}
}