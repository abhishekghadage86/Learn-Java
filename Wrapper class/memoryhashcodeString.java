public class memoryhashcodeString
{
	public static void main(String x[])
	{
		System.out.println("this is type of declration of string there is two type of string declration use initializtion and using new keyword");
		String str1="Abhishek";
		String str2="Abhishek";
		System.out.println("This is using new keywor "+System.identityHashCode(str1));
		System.out.println("This is using new keywor "+System.identityHashCode(str2));
		String s=new String("Abhsiek");
		System.out.println("This is using new keyword"+System.identityHashCode(s) );
		String s1=new String("Abhsiek");
		System.out.println("This is using new keywor "+System.identityHashCode(s1));
	}
}