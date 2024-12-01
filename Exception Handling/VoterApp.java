import java.util.*;
class VoterException extends ArithmeticException
{
	public String getErrorMessage()
	{
	  return "Your age is not valid for voting";
	}

}
class VoterMachine 
{
	void verifyAge(int age)
	{
		if(age<18)
		{
			VoterException v=new VoterException();
			throw v;
		}
		else
		{
			System.out.println("you are eligible for voting");
		}
	}
}
public class VoterApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		try 
		{
			VoterMachine vm=new VoterMachine();
			System.out.println("Enter the age =");
			int age=sc.nextInt();
			vm.verifyAge(age);
			
		}
		catch(VoterException ex)
		{
			System.out.println("This is a error "+ex.getErrorMessage());
		}
		
	}
}