//Program 10.1 Write a program to demonstrate package
/  mypkg/student.java
package mypkg;
public class student
{
int rollno;
int marks;
public student(int n,int m)
{
rollno=n;
marks=m;
}

public void display()
{
System.out.println("rollno="+rollno+"marks="+marks);
}
}
// C>mypkg>javac student.java. Now see that the class file is in mypkg folder
//studentClass.java

import mypkg.student;

public class studentClass

{

public static void main(String args[])

{

student stud= new student(25,90);

stud.display();

}

}
/*
C>javac studentClass.java
C> java studentClass.java

Output:

rollno=25 marks=90

*/
