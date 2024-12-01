class Pattern2
{
	public static void main(String x[])
	{
		
		int n=0,p=0;
		char ch1='A';//char data
	for(int i=1;i<=5;i++)//loop
	{char ch='A';
		for(int j=1;j<=9;j++)//outer loop
		{
		if(i>=j)//if
		{
			System.out.print(ch++);
			ch1=ch;	
			ch1--;
		}	
		else if(j<=i+p)//else cond
		{
			
			System.out.print(--ch1);
		}
		else 
		{
			System.out.print(" ");
		}
		
		}
		System.out.println();
		p++;//incerment of ch
		
	}
		
	}
}