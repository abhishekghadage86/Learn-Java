class Pattern3
{
	public static void main(String x[])
	{
		
		
	for(int i=1;i<=5;i++)
	{int n=1,p=i;
		for(int j=1;j<=9;j++)
		{
		if(j<=5 && j>=6-i)
		{
			System.out.print(n++);
			
			
			
		}	
		else if(j<=4+i && j>=6-i)
		{
			System.out.print(--p);
		}
		else 
		{
			System.out.print(" ");
		}
		
		}
		System.out.println();
		
	}
		
	}
}