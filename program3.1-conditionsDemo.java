// Program 3.1 : Demonstrating conditions. Print the day of the week depending on the value of i.
public class conditionsDemo
{
  public static void main (String args[])
  {
    int i;
      i = 4; // i is the week day number
    if (i == 0)
      {
	System.out.println ("it is Sunday");
      }
    else if (i == 1)
      {
	System.out.println ("it is Monday");
      }
    else if (i == 2)
      {
	System.out.println ("it is Tuesday");
      }
    else if (i == 3)
      {
	System.out.println ("it is Wednesday");
      }
    else if (i == 4)
      {
	System.out.println ("it is Thursday");
      }
    else if (i == 5)
      {
	System.out.println ("it is Friday");
      }
    else if (i == 6)
      {
	System.out.println ("it is Saturday");
      }
  }
}
//Output:
//it is Thursday
