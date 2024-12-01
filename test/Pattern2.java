class Pattern2
{
	public static void main(String x[])
	{
		
		int n=0,p=0;
		char ch1='A';
	for(int i=1;i<=5;i++)
	{char ch='A';
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