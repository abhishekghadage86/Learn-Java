public class ParsewithexceptionMethodApp
{
	public static void main(String x[])
	{
		System.out.println("This progarm is used for convert primitve data type in reference type");
		String s="Abhishek";	
		try
		{
		int a=Integer.parseInt(s);
		float f=Float.parseFloat(s);
		long l=Long.parseLong(s);
		double d=Double.parseDouble(s);
		System.out.println("it is a float data "+a);
		System.out.println("it is a integer data "+f );
		System.out.println("it is a double data "+l);
		System.out.println("it is a double data "+d);
		}
		catch(Exception e)
		{
			System.out.println("String not content is numeric value");
			System.out.println("This exception is occur "+e);
		}
	}
}