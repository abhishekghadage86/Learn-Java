public class StringDeclration
{
	public static void main(String x[])
	{
		System.out.println("this is type of declration of string there is two type of string declration use initializtion and using new keyword");
		Integer a=545184;
		String str=a.toString();
		System.out.println("This is a conversion between int to string "+str );
		String s=new String("Abhsiek");
		System.out.println("This is using new keyword"+System.identityHashCode(s) );
		String s1=new String("Abhsiek");
		System.out.println("This is using new keywor "+System.identityHashCode(s1));
	}
}