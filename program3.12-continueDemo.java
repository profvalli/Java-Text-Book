//Program 3.12: Using continue statement
class continueDemo
{
	public static void main(String args[])
	{
	for(int i=1;i<10;i++)
	{
	    System.out.println("i="+i);
	    if(i%2!=0)
	        continue;
        System.out.println("i="+i);
	}
	}
}

/*Output:
i=1
i=2
i=2
i=3
i=4
i=4
i=5
i=6
i=6
i=7
i=8
i=8
i=9
*/
