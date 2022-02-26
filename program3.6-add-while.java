//Program 3.6: Use of While for adding 'n' numbers
class add-while
{
	public static void main(String args[])
	{
		int n=10,sum=0;
		while(n>0)
		{
			sum=sum+n;
			n--;
		}
		System.out.println("sum="+sum);
	}
}
/*Output:
sum=55
*/
