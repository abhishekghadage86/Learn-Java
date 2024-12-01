class Pattern//class name
{
	public static void main(String x[])
	{
		int p=0;
		//outer loop
		for(int i=1;i<=5;i++)
		{
			//inner loop
			char ch='A',ch1;
			for(int j=1;j<=i;j++)
			{
				
				
				if(i>=j )
				{
					System.out.print(ch++);
				}
				else if(j<=i+p)
				{
					System.out.print(++ch);
				}
				
			}
			System.out.println();
		}
			
			
	}		
}
	
	