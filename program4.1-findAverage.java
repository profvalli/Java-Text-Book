//Program 4.1: Finding average of given array of numbers
public class findAverage
{
  public static void main (String[]args)
  {
    int a[] = { 76, 98, 79, 78, 77, 84, 85, 86, 89, 90 };
    float result = 0, avg=0;
    for (int i = 0; i <= 9; i++)
      {
	result = result + a[i];
	avg = result / 10;
      }
    System.out.println ("avg is " + avg);
  }
}

/*
Output:
avg is 84.2
*/
