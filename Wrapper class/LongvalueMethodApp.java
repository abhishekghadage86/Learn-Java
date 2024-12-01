public class LongvalueMethodApp
{
	public static void main(String x[])
	{ System.out.println("it is intvalue method for convert diff data type in integer(numeric reference value in primitive value)");
		Float a=526.5f;
		Integer i=52262;
		Double d=622262.2;
		
		long q=a.longValue();
		long w=i.longValue();
		long e=d.longValue();
		System.out.println("it is a float data "+q );
		System.out.println("it is a integer data "+w );
		System.out.println("it is a double data "+e );
	}
}