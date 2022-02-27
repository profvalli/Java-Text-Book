//Program 4.3: Generate a set of 10 renadom numbers and sort them.
import java.io.*;
import java.util.*;
public class sortArray
{
  public static void main (String args[])
  {
    //create an array
    int[] a = new int[10];
    int i;
    for (i = 0; i < a.length; i++)
        a[i] = (int) (Math.random () * 100);
      sort (a);
    for (i = 0; i < a.length; i++)
        System.out.println (a[i]);
  }

  public static void sort (int[]a)
  {
      //sort the array
    int n = a.length;
    int i, j, k;
    boolean flag;
    flag = false;
    for (i = 0; i < n; i++)
      {
	for (j = 0; j < n - 1; j++)
	  {
	    if (a[j] > a[j + 1])
	      {
		k = a[j];
		a[j] = a[j + 1];
		a[j + 1] = k;
		flag = true;
	      }
	  }
	if (!flag)
	  break;
      }
  }
}
/*
Output:
1
27
33
41
45
54
62
75
87
95
*/
