class Pattern4
{
	public static void main(String x[])
	{
		
		boolean flag=true;
		char ch='A';
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=17;j++)
		{
			if(j<=8+i && j>=10-i && flag)
			{
			System.out.print(ch);
			flag=false;
			}	
			else 
			{
				flag=true;
			System.out.print("*");
			}
		}
		System.out.println();
		ch++;
	}		
		
	}
}
