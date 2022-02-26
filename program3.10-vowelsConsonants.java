//Program 3.10:  Find whether a given alphabet is vowel or consonant.
public class vowelsConsonants
{
	public static void main(String args[])
	{
		for(int i=0;i<10;i++)
		{
			char c=(char)(Math.random()*26+'a');
			System.out.print(c+":");
			switch(c)
			{
				case 'a':case 'e':case 'i':case 'o':case 'u':
				System.out.println("vowel");
				break;
				default:
				System.out.println("consonant");
			}
		}
	}
}


/* Output:
j:consonant
f:consonant
i:vowel
i:vowel
s:consonant
c:consonant
t:consonant
v:consonant
z:consonant
k:consonant
*/
