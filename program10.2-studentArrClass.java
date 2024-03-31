Program 10.2  Write a program to demonstrate use of user created packages.

//student.java

package mypkg;

public class student{

int rollno;

int marks;

public student(int n, int m){

rolno=n;

marks=m;

}

public void display(){

System.out.println(“rollno=”+rollno+”marks=”+marks);

}

}

/* compile the above code as per the commands sjown below the source code and copy the .class file generated to ..\mypkg.

*/

//studClass.java

//The following is the code studArrClass.java which is also in

//c:\java\bin

import mypkg.student;

class studArrClass{

public static void main(String args[]){

student stud[]=new student[3];

stud[0]=new student(25,90);

stud[1]=new student(26,93);

stud[2]=new student(27,79);

for(int i=0;i<3;i++)

stud[i].display();

}

}

/*

rollno=25marks=90
rollno=26marks=93
rollno=27marks=79

*/
