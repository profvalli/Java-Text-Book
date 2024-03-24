//Program 3.12: Using break statement

class breakStmt
{
	public static void main(String args[])
	{
		boolean t=true;
		first:
		{
			//name of the first block
			second:
			{
				//name of the second block
				third:
				{
					//name of the third block
					System.out.println("this won't execute");					
				}
				System.out.println("This will also not work");
			}
			System.out.println("THis is after second block");
		}
	}
}

/* Output:
this won't execute
This will also not work   
THis is after second block
*/
