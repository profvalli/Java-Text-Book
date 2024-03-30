//Program 9.4 Write a program to demonstrate throws

//throwsExample.java

class throwsExample{

static void th() throws NullPointerException{

System.out.println("inside th()");

throw new NullPointerException("demon");

}

public static void main(String args[]){

try{

th();

}

catch(NullPointerException e){

System.out.println("caught"+e);

}

}

}

/* 
Output:
inside th()
caughtjava.lang.NullPointerException: demon

*/
