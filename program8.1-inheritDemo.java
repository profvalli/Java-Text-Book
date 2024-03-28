//Program 8.1 Program to demonstrate simple inheritance
// inheritDemo.java

import java.io.*;
class inheritDemo
{
  public static void main (String args[])
  {
	  arithmetic ar = new arithmetic ();
	  System.out.println ("the variables n1 and n2 are in sumdiff b");
	  System.out.println ("n1 = "+ar.n1);
	  System.out.println ("n2 = "+ar.n2);
	  ar.n3 = ar.mul ();
	  System.out.println ("result after multiplication "+ar.n3);
	  ar.n3 = ar.sum ();
	  System.out.println ("result after add b "+ar.n3);
	  ar.n3 = ar.diff ();
	  System.out.println ("result after diff b "+ar.n3);
	  ar.n3 = ar.div ();
	  System.out.println ("result after div b "+ar.n3);
  }
}

class sumdiff
{
  int n1, n2;
  public sumdiff ()				//constructor
  {
	n1 = 15;
	n2 = 10;
  }

  public int sum ()
  {
	int n3;
	n3 = n1 + n2;
	return n3;
  }

  public int diff ()
  {
	int n3;
	n3 = n1 - n2;
	return n3;
  }
}

// arithmetic inheriting from sumdiff
class arithmetic extends sumdiff
{
  int n3;
  public int mul ()
  {
	int n3;
	  n3 = n1 * n2;
	  return n3;
  }
  public int div ()
  {
	int n3;
	n3 = n1 / n2;
	return n3;
  }
}

/*
Output:
the variables n1 and n2 are in sumdiff b
n1 = 15
n2 = 10
result after multiplication 150
result after add b 25
result after diff b 5
result after div b 1
*/
