//Program 8.4. Program to demonstrate function inheritance
//myclass.java

//click here for code

class p1

{

p1( ){

System.out.println("inside p1");

}

}

class p2 extends p1

{

p2(){

System.out.println("inside p2");

}

}

class p3 extends p2

{

p3(){

System.out.println("inside p3");

}

}

class myClass

{

public static void main(String args[])

{

p3 c =new p3();

}

}

/*
Output:
inside p1
inside p2
inside p3
*/
