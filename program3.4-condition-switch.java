// Program 3.4 : Program to print day of the week using switch statement
public class condition-switch
{
	public static void main(String args[])
	{
		int i;
		i=4;
		switch(i)
		{
			case 0:
				System.out.println("it is sunday");
				break;
			case 1:
				System.out.println("it is Monday");
				break;
			case 2:
				System.out.println("it is Tuesday");
				break;
			case 3:
				System.out.println("it is Wednesday");
				break;
			case 4:
				System.out.println("it is Thursday");
				break;
			case 5:
				System.out.println("it is Friday");
				break;
			case 6:
				System.out.println("it is Saturday");
				break;
			default:
				System.out.println("invalid");
				break;
		}
	}
}
