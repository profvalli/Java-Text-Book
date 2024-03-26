//overloadDemo.java
//Program to demonstrate method (function overload)
class overload

{

void ex()

{

System.out.println("no parameters");

}

void ex(int a)

{

System.out.println("one parameter: " +a);

}

void ex(int a,int b)

{

System.out.println("two parameter: " +a+" "+b);

}

double ex(double a)

{

System.out.println("double parameters: "+a);

return(a);

}

}

class overloadDemo

{

public static void main(String args[])

{

overload ovrload=new overload();

double result;

ovrload.ex();

ovrload.ex(1);

ovrload.ex(1,2);

result=ovrload.ex(1.52);

System.out.println(result);

}

}

/*
Output:
no parameters
one parameter: 1
two parameter: 1 2
double parameters: 1.52
1.52

*/
