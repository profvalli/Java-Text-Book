//Program 2.2 Demonstrating life time of a variable
class lifeDemo
{
	public static void  main(String args[])
	{
	int i,j;
	for(j=0; j<3;j++)
	{
		i=1;
		System.out.println("i="+i);
		i=100;
		System.out.println("i="+i);
	}
	}
}
/* Output:
i=1
i=100
i=1
i=100
i=1
i=100
*/
