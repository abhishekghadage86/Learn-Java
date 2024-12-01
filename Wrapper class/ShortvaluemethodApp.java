public class ShortvaluemethodApp
{
	public static void main(String x[])
	{
		Integer i=105;
		Float d=125.62f;
		Long l=125l;
		
		short q=i.shortValue();
		short w=d.shortValue();
		short e=l.shortValue();
		System.out.println("it is a float data "+q );
		System.out.println("it is a integer data "+w );
		System.out.println("it is a double data "+e );
		
	}
}