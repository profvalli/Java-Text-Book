Program 7.2 Another Program to demonstrate function overloading with different types of arguments (parameters).
//overloadTypes.java

import java.io.*;

public class overloadTypes

{

public void show(int a)

{

System.out.println("integer a="+a);

}

public void show(int a,int b)

{

System.out.println("integer a="+a+" integer b="+b);

}

public void show(double a)

{

System.out.println("double a="+a);

}

public void show(double a,double b)

{

System.out.println("double a="+a+" and double b="+b);

}

public void show(String a)

{

System.out.println("String a="+a);

}

public void show(String a,String b)

{

System.out.println("String a="+a+" and "+"String b="+b);

}

public static void main(String args[])

{

int x=10,y=20;

overloadTypes ov=new overloadTypes();

ov.show(x);

ov.show(x,y);

double a=123.456,b=0.123456;

ov.show(a);

ov.show(a,b);

String s1="cse",s2="it";

ov.show(s1);

ov.show(s1,s2);

}

}

/*
Output:
integer a=10
integer a=10 integer b=20
double a=123.456
double a=123.456 and double b=0.123456
String a=cse
String a=cse and String b=it
*/
