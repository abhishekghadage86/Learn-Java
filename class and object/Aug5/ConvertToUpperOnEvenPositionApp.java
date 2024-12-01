/* WAP to Create class ConvertToUpperOnEvenPosition with one constructor and method
ConvertToUpperOnEvenPosition(char[]): we have to pass character array as parameter 
void convert(): this method can convert even position character in upper case 
char [] getConvertedArray(): this method can return array after conversion
*/
import java.util.*;
class ConvertToUpperOnEvenPosition
{
	private char ch[];
	ConvertToUpperOnEvenPosition(char ch[])
	{
		this.ch=ch;
	}
	void convert()
	{

		for(int i=0;i<ch.length;i++)
		{
			if(i%2==0 && ch[i]>=97 && ch[i]<=122)
			{
				ch[i]=(char)(ch[i]-32);
				
			}
		}
		
	}
	char []getConvertedArray()		
	{
		return ch;
	}
		

}
public class ConvertToUpperOnEvenPositionApp
{
	public static void main(String []args)
	{
		String str="abhishek ghadage";
		char ch[]=str.toCharArray();
		Scanner sc=new Scanner(System.in);
		
		ConvertToUpperOnEvenPosition c=new ConvertToUpperOnEvenPosition(ch);
		c.convert();
		char arr[]=c.getConvertedArray();
		System.out.println("Display the output");
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(arr[i]+" ");	
		}
	}
}