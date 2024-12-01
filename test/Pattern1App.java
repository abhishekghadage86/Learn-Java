public class Pattern1App
{
	public static void main(String x[])
	{
		int p=0;
		char ch1='A';
		for(int i=1;i<=5;i++)	
		{
			char ch='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch++);
				if(j<i)
				{
					System.out.print(ch);
					
				}	
			}
			System.out.println();
			
			
		}

	}
}