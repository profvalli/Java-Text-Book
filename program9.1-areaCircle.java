//Program 9.1 Program to find area of a circle
//areaCircle.java

import java.io.*;

public class areacircle
{

  public static void main (String args[])
  {
	float r = 0.0f;
	float pi = 3.14f;
	float area = 0.0f;
	  try
	{
	  Console in = System.console ();
	  String fmt = "%1$4s %2$10s %3$10s%n";
      // Read line
	  String radstring = in.readLine (fmt, "Enter", "radius : ", " ");
	    r = Float.valueOf (radstring);

	}

	catch (Exception e)
	{

	  System.out.println ("error" + e);

	  System.exit (1);

	}

	area = pi * (float) Math.pow (r, 2.0f);

	System.out.println ("Aread:" + area);

  }

}
/* Output:
Enter  radius :            
3
Aread:28.26
	*/
