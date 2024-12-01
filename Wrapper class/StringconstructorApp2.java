import java.util.*;
public class StringconstructorApp2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		char ch1=sc.next().charAt(0);
		System.out.println("Character is "+ch1);
		char ch[]=new char[]{'A','b','h','i'};
		String str=new String(ch);
			System.out.print(str);
	}
}