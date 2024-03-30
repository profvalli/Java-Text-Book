//Program 9.5 Write a program to demonstrate finally
//finallyExample.java

class finallyExample{

static void p1(){


try

{
System.out.println("inside p1 try block");

throw new NullPointerException("demo");

}

finally{

System.out.println("in p1 finally block");

}

}

static void p2(){

try {

System.out.println("inside p2 try block");

return;

}

finally {

System.out.println("in p2 finally block");

}

}

static void p3()

{

try {

System.out.println("in p3 try block");

}

finally {

System.out.println("in p3 finally block");

}

}

public static void main(String args[]){

try {

p1();

}

catch(Exception e){

System.out.println("Exception caught");

}

p2();

p3();

}

}

/*
Output:
inside p1 try block
in p1 finally block
Exception caught
inside p2 try block
in p2 finally block
in p3 try block
in p3 finally block
*/
