class P
{
  void setValue(int x)
  { System.out.println("I am P  "+x);
  }
}
class C extends P
{ void setValue(int  x)
   { System.out.println("I am C "+x);
   super.setValue(10);
   }
}
public class OverridingApp
{  public static void main(String x[])
	{   C c1 = new C();
		c1.setValue(10);
		 
	}
}
