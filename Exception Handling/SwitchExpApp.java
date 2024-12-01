import java.util.*;
class SwitchExpApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.ArrayIndexOutOfBoundsException \n 2.StringIndexOutOfBoundsException \n 3.ArithmeticException \n 4.NullPointerExceptio \n .5 NumberFormatException \n6.InputMismatchException \n7.ClassNotFoundException");		
		System.out.println("Enter choice");
		int ch=sc.nextInt();
		switch(ch)
		{
				case 1:
					int a[]=new int[2];
					try
					{
						a[0]=10;
						a[1]=20;
						a[2]=30;
						System.out.println("Entered value sucessfully");
						
					}
					catch(ArrayIndexOutOfBoundsException e)
					{
						System.out.println("you entered extra values in array");
						System.out.println("This is Exception in code "+e);
			
					}
				case 2:
					String str="Abhi";
					try
					{
						char ch1[]=str.toCharArray();
						System.out.println("Character is "+ch1[4]);
						
					}
					catch(StringIndexOutOfBoundsException e)
					{
						System.out.println("you try to acess invalid index character");
						System.out.println("This is Exception in code "+e);
			
					}
	
		}
	}
}
