public class WrapvalueofmethodApp
{
	public static void main(String x[])
	{
		System.out.println("This progarm is used for convert primitve data type in reference type");
		int a=15262;
		
		Float f=Float.valueOf(a);
		Double d=Double.valueOf(a);
		String s=String.valueOf(a);
		Long l=Long.valueOf(a);
		System.out.println("it is a float data "+f );
		System.out.println("it is a integer data "+d );
		System.out.println("it is a double data "+s );
		System.out.println("it is a double data "+l);
	}
}