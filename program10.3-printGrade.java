//Program 10.3 Write a program to demonstrate the use of variables in interfaces.

//printGrade.java

import java.util.*;

interface markgrade{

int distinction=0;

int first=1;

int second=2;

int third=3;

int fail=4;

}

class marks implements markgrade{

Random rand=new Random();

int findgrade(){

int mark=(int)(100*rand.nextDouble());

System.out.println("marks="+mark+" Result=");

if(mark<40)

return fail;

else if(mark>=40 && mark <50)

return third;

else if(mark>=50 && mark <60)

return third;

else if(mark>60 && mark <70)

return third;

else

return distinction;

}

}

class printGrade implements markgrade{

static void answer(int result){

switch(result){

case distinction:

System.out.println("Distinction");

break;

case first:

System.out.println("first");

break;

case second:

System.out.println("second");

break;

case third:

System.out.println("third");

break;

case fail:

System.out.println("fail");

break;

}

}

public static void main(String args[]){

marks m= new marks();

answer(m.findgrade());

answer(m.findgrade());

answer(m.findgrade());

answer(m.findgrade());

}

}

/*
Output:
marks=33 Result=
fail
marks=36 Result=
fail
marks=51 Result=
third
marks=29 Result=
fail
*/
