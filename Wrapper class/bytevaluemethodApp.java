public class bytevaluemethodApp
{
	public static void main(String x[])
	{
		Integer i=105;
		Float d=125.62f;
		Long l=125l;
		
		byte q=i.byteValue();
		byte w=d.byteValue();
		byte e=l.byteValue();
		System.out.println("it is a float data "+q );
		System.out.println("it is a integer data "+w );
		System.out.println("it is a double data "+e );
		
	}
}