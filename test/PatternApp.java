public class PatternApp
{
	public static void main(String x[])
	{
		int p=0;
		char ch1='A';
		for(int i=1;i<=5;i++)	
		{
			char ch='A';
			for(int j=1;j<=9;j++)
			{
				if(i>=j)
				{
					System.out.print(ch++);
					ch1=ch;
					ch1--;
				}
				else if(j<=i+p)
				{
					
					System.out.print(--ch1);
				}
				
				
			}
			p++;
			System.out.println();
			
			
		}

	}
}