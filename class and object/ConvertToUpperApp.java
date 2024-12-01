/*class ConvertToUpper
{ char c[];
void setCharArray(char ch[])
{ //here accept the character array and store in instance variable in character array
c=ch;
}
void convertToUpperCase()
{ //here we need to write the manual logics for converting lower case array
//to upper case
}
}
public class ConvertToUpperApp
{
public static void main(String x[])
{ //here declare the fix array with a some character e.g char ch[]=new char[]={"good"};
//here create the object of ConvertToUpper class
//call setCharArray() function and pass ch array in setCharArray() function
//call convertToUpperCase() function and see the result
}}*/

class ConvertToUpper
{ 
	char ch[];
	void setCharArray(char ch[])
	{ 
		this.ch=ch;
	}
	void convertToUpperCase()
	{ 
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]>=97 && ch[i]<=122)
		{
			ch[i]=(char)(ch[i]-32);//we convert data type int into char where we take as input charater array
			
		}
	}
		for(int i=0;i<ch.length;i++)
		{
		System.out.print(ch[i]);
		}
	}
}
public class ConvertToUpperApp
{
	public static void main(String x[])
	{ 
	String str="Abhishek sunil ghadage";
	char ch[]=str.toCharArray();
	ConvertToUpper c=new ConvertToUpper();
	c.setCharArray(ch);
	c.convertToUpperCase();
	}
}