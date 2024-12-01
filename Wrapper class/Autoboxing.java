public class Autoboxing 
{
	public static void main(String x[])
	{
		System.out.println("This is a autoboxing and unauto boxing application");	
			int a=100;
			Integer b=a;
			System.out.println("This is reference value this is auto boxing"+b);
			
			Integer z=256252;
			int s=z;
			System.out.println("This is a unautoboxing");
			System.out.println("this value convert into reference into primitive "+s);
	}
}