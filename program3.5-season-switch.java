// Program 3.5 - Demonstrating switch statement for printing the season
class season-switch
{
	public static void main(String args[])
	{
		int month=5;
		String season;
		switch(month)
		{
			case 12:
			case 1:
			case 2:
				season="winter";
				break;
			case 3:
			case 4:
			case 5:
				season="winter";
				break;
			case 6:
			case 7:
			case 8:
				season="winter";
				break;
			case 9:
			case 10:
			case 11:
				season="winter";
				break;
			default:
				season="invalid month";
		}
		System.out.println("the season is "+season);
	}
}
/* Output:
the season is winter
*/
