
class Pattern5
{
	public static void main(String x[])
	{
		int n=3;
	for(int i=1;i<=7;i++)
	{
		for(int j=1;j<=4;j++)
		{
			if(i>=j && i<=4)
			{
			System.out.print(n);
			
			}	
			else if(j>=8-i && i>4)
			{
				n=i;
			System.out.print(n--);
			}
			else 
			{
				
			System.out.print(" ");
			}
		}
		System.out.println();
		n++;
		
	}		
		
	}
}