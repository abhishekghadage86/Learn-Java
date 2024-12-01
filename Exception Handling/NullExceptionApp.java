class NullExceptionApp
{ static int a[];
	public static void main(String x[])
	{
		try
		{
		a=new int[-3];
		System.out.println(a);
		}
		catch(Exception e)
		{
			System.out.println("This is error "+e);
		}
	}
}
	