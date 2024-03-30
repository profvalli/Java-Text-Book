//Program 9.2 Write a program for catching division by zero error.

//exampleZeroerror.java

class exampleZeroerror
{

  public static void main (String args[])
  {

	int d, a;

	  try
	{

	  d = 0;

	  a = 3 / d;

/* the following statement will not be executed beacuse d=0 and an exception is thrown */

	  System.out.println ("not executed");

	}

	catch (ArithmeticException e)
	{

	  System.out.println ("Division by zero");

	}

	System.out.println ("After catch statement");

  }

}

/*
Output:
Division by zero
After catch statement
*/
