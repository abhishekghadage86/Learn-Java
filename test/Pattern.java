class Pattern
{
	public static void main(String x[])
	{
		
		char ch1,ch='A';
		ch1=ch;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=9;j++)
		{
		if(j==6-i)
		{
			System.out.print(ch);
			ch1=ch;
		}	
		else if(j>=6-i && j<=4+i )
		{
			ch1++;
			System.out.print(ch1);
		
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