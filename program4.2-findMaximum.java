//Program 4.2: Find the maximum mark in a given array of marks data
public class findMaximum
{
  public static void main (String[]args)
  {
    int j, max = 0;
    int mark[] = { 88, 84, 72, 54, 67, 97, 54, 25 };
    for (j = 0; j < mark.length; j++)
      {
	if (max < mark[j])
	  max = mark[j];
      }
    System.out.println ("maximum: " + max);
  }
}
