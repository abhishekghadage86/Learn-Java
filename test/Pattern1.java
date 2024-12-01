class Pattern1
{
	public static void main(String x[])
	{
		
		int n=0,p=0;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=9;j++)
		{
		if(i>=j)
		{
			System.out.print(j);
			n=j;
		
		}	
		else if(j<=i+p)
		{
			
			System.out.print(--n);
		}
		else 
		{
			System.out.print(" ");
		}
		
		}
		System.out.println();
		p++;
		
	}
		
	}
}