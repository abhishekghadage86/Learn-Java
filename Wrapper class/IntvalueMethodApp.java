public class IntvalueMethodApp
{
	public static void main(String x[])
	{ System.out.println("it is intvalue method for convert diff data type in integer");
		Float a=526.5f;
		Long l=52262l;
		Double d=622262.2;
		
		int q=a.intValue();
		int w=l.intValue();
		int e=d.intValue();
		System.out.println("it is a float data "+q );
		System.out.println("it is a long data"+w );
		System.out.println("it is a double data"+e );
	}
}