public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	int wide_mark = 85;
    double wide_money = wide_mark; // casting int to double

    System.out.println(wide_mark);      
    System.out.println(wide_money); 
    double narrow_money=85.0;
    int narrow_mark;
    narrow_mark=(int)narrow_money; //type cast
    System.out.println(narrow_mark);      
    System.out.println(narrow_money);
	}
}


//Output:
85
85.0
85
85.0
