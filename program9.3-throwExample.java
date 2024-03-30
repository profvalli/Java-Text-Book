//Program 9.3 Write a program to demonstrate throw.

//throwExample.java

class throwExample{

static void proc(){

try{

throw new NullPointerException("demo");

}

catch(NullPointerException e){

System.out.println("caught inside proc()");

throw e;

}

}

public static void main(String args[]){

try{

proc();

}

catch(NullPointerException e){

System.out.println("caught again"+e);

}

}

}

/*
Output:
caught inside proc()
caught againjava.lang.NullPointerException: demo
*/
