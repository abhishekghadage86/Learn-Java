public class StringByteConstructorApp
{
	public static void main(String x[])
	{
		//string con , string ,char con ,byte con
		byte b[]=new byte[]{92,122,102,30};
		String str=new String(b);
			System.out.println(str);

	}
}