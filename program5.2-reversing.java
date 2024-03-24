//Program 5.2 Program to reverse a string using a custom defined function
//reversing.java
//click here for code
import java.lang.*;
class rev{
public static String reverse(String s){
int i,length;
length=s.length();
StringBuffer revst = new StringBuffer(length);
for(i=length-1;i>=0;i--)
{
revst.append(s.charAt(i));
}
return revst.toString();
}
}

class reversing{
public static void main(String args[])
{
StringBuffer s = new StringBuffer("I am getting reversed");
System.out.println(rev.reverse(s.toString()));
}
}

/*Output:
desrever gnitteg ma I
*/
