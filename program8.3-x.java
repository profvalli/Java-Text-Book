Program 8.3 Program to demonstrate the keyword super
//x.java
//click here for code
public class x extends y
{
  int a = 1;
  int b = 2;
  public static void main (String args[])
  {
	x xobj = new x ();
  }

  public x ()
  {
	super.sum (a, b);
	super.diff (a, b);
	super.mul (a, b);
  }
}

class y
{
  public static void sum (int a, int b)
  {
	System.out.println ("sum=" + (a + b));
  }
  public void diff (int a, int b)
  {
	System.out.println ("diff=" + (a - b));
  }
  public static void mul (int a, int b)
  {
	System.out.println ("mul=" + (a * b));
  }
}
/* Output:

sum=3
diff=-1
mul=2
*/
