//Program3.7: To add first 'n' numbers using do-while
class add-do-while
{
	public static void main(String args[])
	{
		int n=10,sum=0,i=0;
		do
		{
			sum=sum+i;
			i++;
		}
		
		while(i<=n);
		System.out.println("sum="+=sum);
	}
}
/* Output:
sum=55
*/
