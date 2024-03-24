//Program 2.2: Demonstrating scope of a variable
class scopeDemo{
	public static void main(String args[]){
		int a;
		a=5;
		if(a==5)
		{	//start new scope
			int b=20; //known only to this block
			System.out.println("a="+a+" b="+b);
			a=b*2;
		}
	/* b=100; error, b is unknown here
	a is known */
	System.out.println("a is "+a);
	}
}
//Output:
//a=1 b=20
//a is 22
